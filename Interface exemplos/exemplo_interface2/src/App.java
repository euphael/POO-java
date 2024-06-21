public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(5, 2);
        Retangulo retangulo = new Retangulo(5, 10);
        ExibirArea exibir = new ExibirArea();

        System.out.println(exibir.exibirArea(retangulo));
    }
}
