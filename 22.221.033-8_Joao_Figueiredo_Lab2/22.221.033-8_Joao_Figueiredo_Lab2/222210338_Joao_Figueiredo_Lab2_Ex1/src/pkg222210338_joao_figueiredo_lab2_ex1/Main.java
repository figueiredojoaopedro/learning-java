
package pkg222210338_joao_figueiredo_lab2_ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        Scanner input = new Scanner(System.in);
        
        ret1.setLados(input.nextInt(), input.nextInt());
        ret2.setLados(input.nextInt(), input.nextInt());
        
        
        System.out.printf("RETANGULO 1 \nO valor da area é: %d\n", ret1.area());
        System.out.printf("RETANGULO 1 \nO valor do perimetro é: %d\n", ret1.perimetro());
        
        System.out.printf("RETANGULO 2 \nO valor da area é: %d\n", ret2.area());
        System.out.printf("RETANGULO 2 \nO valor do perimetro é: %d\n", ret2.perimetro());
    }
    
}