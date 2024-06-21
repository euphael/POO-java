public class Fliperama implements Jogo {

    boolean estaLigado = false;
    String jogando;
    

    @Override
    public boolean ligar() {
        estaLigado = true;
        return estaLigado;
    }

    @Override
    public boolean desligar() {
        estaLigado = false;
        return estaLigado;
    }

    @Override
    public String jogar() {
        if (estaLigado) {
            return "Estou jogando God of War";
        } else {
            return "O jogo videogame esta desligado";
        }

    }

}
