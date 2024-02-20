package model;

public class Funcionario {
    
    private int id;
    private String nome;
    private String telefone;
    private String salario;
   
    public Funcionario(){
    }
    
    public Funcionario(int id, String nome, String salario, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.salario = salario;
    
}

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
     
    }

    



