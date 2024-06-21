public class App {
    public static void main(String[] args) throws Exception {

        Impressora cor = new Cor();

        System.out.println(cor.imprimirDocumento("M"));
        System.out.println(cor.calcularValorImpressao(6));
       
    }
}
