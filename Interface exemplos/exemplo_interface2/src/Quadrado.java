public class Quadrado implements Figura{

    int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }


    
}
