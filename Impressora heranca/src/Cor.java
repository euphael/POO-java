public class Cor extends Impressora {

    public int ciano = 40, magenta = 40, amarelo = 40;
    public double tintaRestante = getTintaRestante();

    /** @Override
    public void addDocumento(Documento documento) {

    } */

    @Override
    public double imprimirDocumento(String tipoCor) {
        switch (tipoCor) {
            case "C":
                tintaRestante = ciano;
                valorAdicional = 3;
                break;
            case "M":
                tintaRestante = magenta;
                valorAdicional = 3;
                break;
            case "Y":
                tintaRestante = amarelo;
                valorAdicional = 3;
                break;

            default:
                tintaRestante = 0;
        }
        return tintaRestante;
    }

    @Override
    public double calcularValorImpressao(int qtPaginas) {
        for (int i = 0; i < qtPaginas; i++) {
            valorFinal += getVALOR_PAGINA() + valorAdicional;
        }
        return valorFinal;
    }

    @Override
    protected double calcTintaRestante(Integer qtPaginas) {
        if (tintaRestante != 0) {
            for (int i = 0; i < qtPaginas; i++) {
                tintaRestante -= getCONSUMO_TINTA();
            }
        }
        return tintaRestante;
    }

    @Override
    public boolean tintaNaReserva() {
        if (tintaRestante < 10) {
            return true;
        } else {
            return false;
        }
    }

}
