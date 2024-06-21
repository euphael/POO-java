public class Retangulo implements Figura{   

    int lado;
    int altura;

    public Retangulo(int lado, int altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double calcularArea(){
        return lado*altura;
    }
    
}
