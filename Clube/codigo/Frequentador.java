

public abstract class Frequentador {
    protected String id;
    protected String nome;
    protected Visita visitas;
    
    

    public Frequentador(String id, String nome ){
    this.nome=nome;
    this.id=id;
    }
    public   void registrarVisita(){

    }
    public void registrarSaida(){

    }
    public boolean visitouClubeEm(Data dia){
        return true;
    }
    
   public String relatorioVisitas(){
        return visitas.toString();
    }
    public String getID() {
        return id;
    }
  
   public String getNome() {
       return nome;
   }
}
