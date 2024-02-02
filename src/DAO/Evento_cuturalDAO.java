package DAO;

import DTO.Evento_cuturalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Evento_cuturalDAO {

    private GerenciadorBD bd;

    public Evento_cuturalDAO() {
        bd = new GerenciadorBD();
    }

    public void cadastrar(Evento_cuturalDTO evento_cuturalDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO evento_cutural (nome, tipo, data_inicio, data_fim, local) VALUES (?, ?, ?, ?, ?)")) {
            comando.setString(1, evento_cuturalDTO.getNome());
            comando.setString(2, evento_cuturalDTO.getTipo());
            comando.setString(3, evento_cuturalDTO.getDataInicio());
            comando.setString(4, evento_cuturalDTO.getDataFim());
            comando.setString(5, evento_cuturalDTO.getLocal());
            
            comando.execute();
        }
    }

    public List<Evento_cuturalDTO> listar() throws Exception {
        List<Evento_cuturalDTO> listaDeEvento_cuturalDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, nome, tipo, data_inicio, data_fim, local FROM evento_cutural"); 
                ResultSet tabela = comando.executeQuery()
                )
        {
            while (tabela.next()) {
                Evento_cuturalDTO evento_cuturalDTO = new Evento_cuturalDTO();

                evento_cuturalDTO.setId(tabela.getInt("id"));
                evento_cuturalDTO.setNome(tabela.getString("nome"));
                evento_cuturalDTO.setTipo(tabela.getString("tipo"));
                evento_cuturalDTO.setDataInicio(tabela.getString("data_incio"));
                evento_cuturalDTO.setDataFim(tabela.getString("data_fim"));
                evento_cuturalDTO.setLocal(tabela.getString("local"));

                listaDeEvento_cuturalDTO.add(evento_cuturalDTO);
            }
        }

        return listaDeEvento_cuturalDTO;
    }

    public List<Evento_cuturalDTO> pesquisar(Evento_cuturalDTO evento_cuturalDTO) throws Exception {
        List<Evento_cuturalDTO> listaDeEvento_cuturalDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, nome, tipo, data_inicio, data_fim, local FROM evento_cutural "
                + "WHERE CONVERT(nome, CHAR) LIKE ?");) {

            comando.setString(1, "%" + evento_cuturalDTO.getNome() + "%");

            try (ResultSet tabela = comando.executeQuery()) {
                while (tabela.next()) {
                    Evento_cuturalDTO evento_cuturalDTO_ = new Evento_cuturalDTO();

                    evento_cuturalDTO_.setId(tabela.getInt("id"));
                    evento_cuturalDTO_.setNome(tabela.getString("nome"));
                    evento_cuturalDTO_.setTipo(tabela.getString("tipo"));
                    evento_cuturalDTO_.setDataInicio(tabela.getString("data_inicio"));
                    evento_cuturalDTO_.setDataFim(tabela.getString("data_fim"));
                    evento_cuturalDTO_.setLocal(tabela.getString("local"));
                    
                    listaDeEvento_cuturalDTO.add(evento_cuturalDTO_);
                }
            }

            return listaDeEvento_cuturalDTO;
        }
    }

    public void alterar(Evento_cuturalDTO evento_cuturalDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "UPDATE evento_cutural SET nome = ?, tipo = ?, data_inicio = ?, data_fim = ?, local = ? WHERE id = ?")) {
            comando.setString(1, evento_cuturalDTO.getNome());
            comando.setString(2, evento_cuturalDTO.getTipo());
            comando.setString(3, evento_cuturalDTO.getDataInicio());
            comando.setString(4, evento_cuturalDTO.getDataFim());
            comando.setString(5, evento_cuturalDTO.getLocal());
            comando.setInt(6, evento_cuturalDTO.getId());

            comando.execute();
        }
    }

    public void excluir(Evento_cuturalDTO evento_cuturalDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "DELETE FROM evento_cutural WHERE id = ?")) {
            comando.setInt(1, evento_cuturalDTO.getId());

            comando.execute();
        }
    }
}
