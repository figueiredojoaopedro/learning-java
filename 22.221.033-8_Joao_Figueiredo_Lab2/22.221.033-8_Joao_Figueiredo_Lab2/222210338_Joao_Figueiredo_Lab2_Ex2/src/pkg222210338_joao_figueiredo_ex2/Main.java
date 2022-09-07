

package pkg222210338_joao_figueiredo_ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner input = new Scanner(System.in);
        
        
        funcionario.setParametros(input.next(), input.next(), input.nextDouble());
        
        System.out.printf("o funcionario %s %s recebe agora: %.2f", funcionario.nome(),funcionario.sobreNome(), funcionario.salario());
    }
}
