public class Time {
    private String nameTime;
    private String disputa;
    private Jogador nomeJogador;

    public Time(String nameTime, String disputa, Jogador nomeJogador) {
        this.nameTime = nameTime;
        this.disputa = disputa;
        this.nomeJogador = nomeJogador;
    }
    public Time(){

    }



    public String getName() {
        return nameTime;
    }
    public void setName(String name) {
        this.nameTime = name;
    }
    public String getDisputa() {
        return disputa;
    }
    public void setDisputa(String disputa) {
        this.disputa = disputa;
    }
    public Jogador getNome() {
        return nomeJogador;
    }
    public void setNome(Jogador nome) {
        this.nomeJogador = nome;
    }

    
    

}
