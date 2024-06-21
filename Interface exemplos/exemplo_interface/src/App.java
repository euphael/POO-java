public class App {
    public static void main(String[] args) throws Exception {
        GodOfWar godOfWar = new GodOfWar();
        Videogame videogame = new Videogame();

        videogame.ligarJogo(godOfWar);
        System.out.println(videogame.jogarUmJogo(godOfWar));
    }
}
