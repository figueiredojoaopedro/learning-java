
package pkg222210338_joao_figueiredo_ex2;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salario;
    
    public void setParametros(String nome, String sobreNome, double salario){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }
    
    public double salario(){
        if(this.salario < 0){
            this.salario = 0;
        }
        else{
            this.salario = this.salario * 1.1;
        }
        double salario = this.salario;
        return salario;
    }
    public String nome(){
        String nome = this.nome;
        return nome;
    }
    
    public String sobreNome(){
        String sobreNome = this.sobreNome;
        return sobreNome;
    }
}
