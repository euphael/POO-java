
public class Visita {
    Frequentador freq=null;
    Data data;
    Hora horaEntrada;
    Hora horaSaida;
    
    public Visita( Data data, Hora horaEntrada, Hora horaSaida, Frequentador freq){
     this.horaEntrada=horaEntrada;
     this.horaSaida=horaSaida;
     this.data=data;
     this.freq=freq;

    }
    public void registrarVisita(Data data){
        System.out.println("O Frequentador "+freq.getNome()+" entrou as "+horaEntrada+" saiu as "+horaSaida+" na data "+data);
    }
    public Hora getHoraEntrada(){
        return horaEntrada;
    }
     public Hora getHoraSaida(){
        return horaSaida;
    }

   public Data getData() {
        return data;
}
public void setHoraEntrada(Hora horaEntrada) {
    this.horaEntrada = horaEntrada;
}
public void setHoraSaida(Hora horaSaida) {
    this.horaSaida = horaSaida;
}
public void setData(Data data) {
    this.data = data;
}
   public String toString(){
return " "+freq.getNome()+  "Data: "+data+"Hora da entrada: "+horaEntrada+"Hora da saída: "+horaSaida;
       }

}
