public class ExibirArea {
    String area;
    public String exibirArea(Figura figura) {
        String area = String.valueOf(figura.calcularArea());
        return "A area da figura é = " + area;
    }

}
