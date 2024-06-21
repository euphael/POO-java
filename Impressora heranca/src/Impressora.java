public abstract class Impressora {

    private double VALOR_PAGINA = 3.00;
    private double CONSUMO_TINTA = 5;
    private double tintaRestante;

    public double valorFinal; 
    public double valorAdicional;

    //public abstract void addDocumento(Documento documento);
    public abstract double imprimirDocumento(String cor);
    public abstract double calcularValorImpressao(int qtPaginas);
    public abstract boolean tintaNaReserva();
    protected abstract double calcTintaRestante(Integer qtdPaginas);

    public double getVALOR_PAGINA(){
        return VALOR_PAGINA;
    }

    public double getCONSUMO_TINTA(){
        return CONSUMO_TINTA;
    };

    public double getTintaRestante(){
        return tintaRestante;
    }
    
}
