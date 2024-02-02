package DAO;

import DTO.ProfessorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private GerenciadorBD bd;

    public ProfessorDAO() {
        bd = new GerenciadorBD();
    }

    public void cadastrar(ProfessorDTO professorDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO professor (nome, materia, email, matricula) VALUES (?, ?, ?, ?)")) {
            comando.setString(1, professorDTO.getNome());
            comando.setString(2, professorDTO.getMateria());
            comando.setString(3, professorDTO.getEmail());
            comando.setInt(4, professorDTO.getMatricula());

            comando.execute();
        }
    }

    public List<ProfessorDTO> listar() throws Exception {
        List<ProfessorDTO> listaDeProfessorDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, nome, materia, email, matricula FROM professor"); 
                ResultSet tabela = comando.executeQuery()
                )
        {
            while (tabela.next()) {
                ProfessorDTO professorDTO = new ProfessorDTO();

                professorDTO.setId(tabela.getInt("id"));
                professorDTO.setNome(tabela.getString("nome"));
                professorDTO.setMateria(tabela.getString("materia"));
                professorDTO.setEmail(tabela.getString("email"));
                professorDTO.setMatricula(tabela.getInt("matricula"));

                listaDeProfessorDTO.add(professorDTO);
            }
        }

        return listaDeProfessorDTO;
    }

    public List<ProfessorDTO> pesquisar(ProfessorDTO professorDTO) throws Exception {
        List<ProfessorDTO> listaDeProfessorDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, nome, materia, email, matricula FROM professor "
                + "WHERE CONVERT(nome, CHAR) LIKE ?");) {

            comando.setString(1, "%" + professorDTO.getNome() + "%");

            try (ResultSet tabela = comando.executeQuery()) {
                while (tabela.next()) {
                    ProfessorDTO professorDTO_ = new ProfessorDTO();

                    professorDTO_.setId(tabela.getInt("id"));
                    professorDTO_.setNome(tabela.getString("nome"));
                    professorDTO_.setMateria(tabela.getString("materia"));
                    professorDTO_.setEmail(tabela.getString("email"));
                    professorDTO_.setMatricula(tabela.getInt("matricula"));
                    
                    listaDeProfessorDTO.add(professorDTO_);
                }
            }

            return listaDeProfessorDTO;
        }
    }

    public void alterar(ProfessorDTO professorDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "UPDATE professor SET nome = ?, materia = ?, email = ?, matricula = ? WHERE id = ?")) {
            comando.setString(1, professorDTO.getNome());
            comando.setString(2, professorDTO.getMateria());
            comando.setString(3, professorDTO.getEmail());
            comando.setInt(4, professorDTO.getMatricula());
            comando.setInt(5, professorDTO.getId());

            comando.execute();
        }
    }

    public void excluir(ProfessorDTO professorDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "DELETE FROM professor WHERE id = ?")) {
            comando.setInt(1, professorDTO.getId());

            comando.execute();
        }
    }
}
