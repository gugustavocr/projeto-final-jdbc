package _BancoDeDados;

import DAO.GerenciadorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecutarScriptSQL {

    public static void main(String[] args) throws Exception {

        ExecutarScriptSQL.executarScript();
    }

    public static void executarScript() throws Exception {
        GerenciadorBD bd = new GerenciadorBD();
        bd.banco = "";

        try (Connection conexao = bd.conectar()) {

            String criarBancoSQL = "CREATE DATABASE IF NOT EXISTS `banco_projeto_final`;";

            try (PreparedStatement comandoCriarBanco = conexao.prepareStatement(criarBancoSQL)) {
                comandoCriarBanco.execute();
            }

            String usarBancoSQL = "USE `banco_projeto_final`;";

            try (PreparedStatement comandoUsarBanco = conexao.prepareStatement(usarBancoSQL)) {
                comandoUsarBanco.execute();
            }

            String criarTabelaSQL1 = "CREATE TABLE IF NOT EXISTS `conta` ("
                    + "`id` int NOT NULL AUTO_INCREMENT,"
                    + "`numero` int NOT NULL,"
                    + "`saldo` double NOT NULL,"
                    + "`limite` double NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL1)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL2 = "CREATE TABLE IF NOT EXISTS `acesso` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`usuario` VARCHAR(45) NOT NULL,"
                    + "`senha` VARCHAR(70) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL2)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL3 = "INSERT INTO `acesso` (`usuario`, `senha`)"
                    + "SELECT 'admin', '1234'"
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `acesso` WHERE `id` = 1"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL3)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL4 = "CREATE TABLE IF NOT EXISTS `professor` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`materia` VARCHAR(100) NOT NULL,"
                    + "`email` VARCHAR(100) NOT NULL,"
                    + "`matricula` INT NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL4)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL5 = "CREATE TABLE IF NOT EXISTS `advogado` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`especialidade` VARCHAR(100) NOT NULL,"
                    + "`email` VARCHAR(100) NOT NULL,"
                    + "`telefone` VARCHAR(20) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL5)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL6 = "CREATE TABLE IF NOT EXISTS `musica` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`titulo` VARCHAR(100) NOT NULL,"
                    + "`artista` VARCHAR(100) NOT NULL,"
                    + "`album` VARCHAR(100) NOT NULL,"
                    + "`ano_lancamento` INT NOT NULL,"
                    + "`duracao_segundos` INT NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL6)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL7 = "CREATE TABLE IF NOT EXISTS `computador` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`marca` VARCHAR(100) NOT NULL,"
                    + "`modelo` VARCHAR(100) NOT NULL,"
                    + "`sistema_operacional` VARCHAR(50) NOT NULL,"
                    + "`capacidade_memoria` INT NOT NULL,"
                    + "`capacidade_disco_rigido` INT NOT NULL,"
                    + "`processador` VARCHAR(100) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL7)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL8 = "CREATE TABLE IF NOT EXISTS `construcao_civil` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`localizacao` VARCHAR(100) NOT NULL,"
                    + "`tipo` VARCHAR(50) NOT NULL,"
                    + "`data_inicio` VARCHAR(10) NOT NULL,"
                    + "`data_conclusao` VARCHAR(10) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL8)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL9 = "CREATE TABLE IF NOT EXISTS `veiculo` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`marca` VARCHAR(100) NOT NULL,"
                    + "`modelo` VARCHAR(100) NOT NULL,"
                    + "`ano` INT NOT NULL,"
                    + "`cor` VARCHAR(50) NOT NULL,"
                    + "`placa` VARCHAR(10) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL9)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL10 = "CREATE TABLE IF NOT EXISTS `corrida` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`local` VARCHAR(100) NOT NULL,"
                    + "`data` VARCHAR(10) NOT NULL,"
                    + "`distancia` DOUBLE NOT NULL,"
                    + "`vencedor` VARCHAR(100),"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL10)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL11 = "CREATE TABLE IF NOT EXISTS `time_futebol` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`fundacao` VARCHAR(10) NOT NULL,"
                    + "`estadio` VARCHAR(100) NOT NULL,"
                    + "`cidade` VARCHAR(50) NOT NULL,"
                    + "`estado` VARCHAR(50) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL11)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL12 = "CREATE TABLE IF NOT EXISTS `evento_cultural` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(100) NOT NULL,"
                    + "`tipo` VARCHAR(50) NOT NULL,"
                    + "`data_inicio` VARCHAR(10) NOT NULL,"
                    + "`data_fim` VARCHAR(10) NOT NULL,"
                    + "`local` VARCHAR(100) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL12)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL13 = "CREATE TABLE IF NOT EXISTS `viagem` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`destino` VARCHAR(100) NOT NULL,"
                    + "`data_partida` VARCHAR(10) NOT NULL,"
                    + "`data_retorno` VARCHAR(10) NOT NULL,"
                    + "`companhia_aerea` VARCHAR(50) NOT NULL,"
                    + "`preco` DOUBLE NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL13)) {
                comandoCriarTabela.execute();
            }

            System.out.println("Banco de Dados e Tabelas criados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao tentar criar ou recriar um banco de dados! " + e.getSQLState());
        }
    }
}
