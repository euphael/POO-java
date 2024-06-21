public class Socio extends Frequentador{
    protected int convites;
    Convidado convidados;
    public Socio(String id, String nome, int quantConvites) {
        super(id, nome);
        this.convites=quantConvites;
        
    }
    public void enviarConvites(Convidado X){
    this.convidados=X;
    convidados.setConvites(+1);
    convites--;
    }

    public void registrarVisita(Data dia, Hora hora){
         this.visitas=new Visita(dia, hora, null,this );
         System.out.println("o Socio "+nome+" fez uma nova visita as  "+hora+"no dia  "+dia );
    }
    public void registrarSaida(Hora hora){
        if(visitas.getHoraSaida()==null){
        visitas.setHoraSaida(hora);
        System.out.println(" "+visitas.toString());
    }
}
    
    public boolean visitouClubeEm(Data dia){
        if(visitas.getData()== dia){
        return true;
    }else
    System.out.println("Não visitou o clube nesse dia");
    return false;
}
    @Override
    public String relatorioVisitas(){
        return this.visitas.toString();
    }
@Override
public  String getID(){
return id;
}
@Override
public String getNome(){
    return nome;
}

}
