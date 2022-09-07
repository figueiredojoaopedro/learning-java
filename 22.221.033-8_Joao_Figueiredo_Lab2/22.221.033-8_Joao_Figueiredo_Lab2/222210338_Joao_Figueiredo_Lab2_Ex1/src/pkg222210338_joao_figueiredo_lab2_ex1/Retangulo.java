
package pkg222210338_joao_figueiredo_lab2_ex1;


public class Retangulo {
    private int lado1;
    private int lado2;
    
    public void setLados(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int area(){
        int area = 0;
        area = this.lado1 * this.lado2;
        return area;
    }
    
    public int perimetro(){
        int perimetro = 0;
        perimetro = (this.lado1 + this.lado2)*2;
        return perimetro;
    }
}
