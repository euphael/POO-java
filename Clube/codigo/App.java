import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Clube clube = new Clube(0);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Menu do clube");
            System.out.println("2. Menu de visitas");
            System.out.println("3. Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    menu(clube);
                    break;
                case 2:
                    menu2(clube);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void menu(Clube clube) {

        Data data = new Data(0, 10, 2023);
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while (true && !sair) {
            System.out.println("----------Menu do Clube----------");
            System.out.println("1. Ver relatório de visitas em um dia");
            System.out.println("2. Ver relatório de visitas de um visitante");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");
            int optionc = sc.nextInt();

            switch (optionc) {
                case 1:
                    System.out.println("Digite o dia para ver o relatório:");
                    int dia = sc.nextInt();
                    data.setDia(dia);
                    clube.relatorioVisitasData(data);
                    break;

                case 2:
                    System.out.println("Digite o ID do frequentador para ver as visitas:");
                    String id = sc.next();
                    clube.relatorioVisitasFreq(id);
                    break;

                case 3:
                    sair = true;
            }
        }
    }

    public static void menu2(Clube clube) throws ClassNotFoundException {
        Data data1 = new Data(1, 10, 2023);
        Hora hora = new Hora(10, 15, 12);
        Hora hora2 = new Hora(16, 10, 0);
        Socio f1 = null;
        Convidado f2 = null;
        Scanner s = new Scanner(System.in);
        boolean out = false;
        while (!out) {
            System.out.println("----------Bem-vindo ao Clube----------");
            System.out.println("1. Novo Visitante");
            System.out.println("2. Entrar no clube");
            System.out.println("3. Sair do clube");
            System.out.println("4. Sair do menu");
            System.out.println("Escolha uma opção:");
            int option2 = s.nextInt();

            switch (option2) {
                case 1:
                    System.out.println("Novo sócio ou visitante (Digite 'S' para sócio e 'V' para visitante):");
                    String f = s.next();
                    if (f.equals("S")) {
                        System.out.println("Digite seu nome:");
                        String nomeNovo = s.next();
                        System.out.println("Digite um ID de identificação:");
                        String idNovo = s.next();
                        Socio novo = new Socio(idNovo, nomeNovo, 4);
                        clube.addFrequentador(novo);
                        f1 = novo;
                        System.out.println("Bem-vindo");
                    } else if (f.equals("V")) {
                        System.out.println("Digite seu nome:");
                        String nomeNovoV = s.next();
                        System.out.println("Digite um ID de identificação:");
                        String idNovoV = s.next();
                        Convidado novo = new Convidado(nomeNovoV, idNovoV);
                        clube.addFrequentador(novo);
                        f2 = novo;
                        System.out.println("Bem-vindo");
                    }
                    break;

                case 2:
                    System.out.println("Sócio ou visitante (Digite 'S' para sócio e 'V' para visitante):");
                    String a = s.next();
                    if (a.equals("S")) {
                        f1.registrarVisita(data1, hora);
                        System.out.println("Tenha uma boa visita");
                    } else if (a.equals("V")) {
                        f1.enviarConvites(f2);
                        f2.registrarVisita(data1, hora);
                        System.out.println("Tenha uma boa visita");
                    }
                    break;
                case 3:
                    System.out.println("Sócio ou visitante (Digite 'S' para sócio e 'V' para visitante):");
                    String b = s.next();
                    if (b.equals("S")) {
                        f1.registrarSaida(hora2);
                    } else if (b.equals("V")) {
                        f2.registrarSaida(hora2);
                    }
                    break;

                case 4:
                    out = true;
            }
        }
    }
}
