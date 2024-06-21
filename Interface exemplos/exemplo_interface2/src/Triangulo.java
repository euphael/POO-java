public class Triangulo implements Figura{

    int base;
    int altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }
    
}
