public class Convidado extends Frequentador {
    int convites;
    Socio socio;

    public Convidado(String nome, String id) {
        super(id, nome);
    }

    public void setConvites(int convite) {
        this.convites = convite;
    }

    public void registrarVisita(Data dia, Hora horaEntrada) {
        if (this.convites >= 1 && socio.visitouClubeEm(dia) == true) {
            visitas = new Visita(dia, horaEntrada, null, this);
        }
        System.out.println("Entrada não permitida");
    }

    public void registrarSaida(Hora hora) {
        if (visitas.getHoraSaida() == null) {
            visitas.setHoraSaida(hora);
        }
    }

    public boolean visitouClubeEm(Data dia) {
        if (visitas.getData() == dia) {
            return true;
        }
        System.out.println("nao visitou o clube");
        return false;
    }

    @Override
    public String relatorioVisitas() {
        return visitas.toString();
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

}
