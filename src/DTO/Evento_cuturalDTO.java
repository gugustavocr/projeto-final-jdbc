
package DTO;

public class Evento_cuturalDTO {
   
    private int id;
    private String nome;
    private String tipo;
    private String data_inicio;
    private String data_fim;
    private String local;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataInicio() {
        return data_inicio;
    }

    public void setDataInicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getDataFim() {
        return data_fim;
    }

    public void setDataFim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    
}
