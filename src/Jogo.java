import java.util.Objects;
import java.util.Random;

public class Jogo {
    private Time time1;
    private Time time2;
    private Jogador jogador;
    private Goleiro goleiro;
    int gols;
    private Jogador chutar;
    private Jogador defender;
    
    
    


    
    


    public Jogo(Time time1, Time time2, Jogador jogador, Goleiro goleiro, Jogador chutar, Jogador defender) {
        this.time1 = time1;
        this.time2 = time2;
        this.jogador = jogador;
        this.goleiro = goleiro;
        this.chutar = chutar;
        this.defender = defender;
    }

    public Jogo(){

    }

     Random random = new Random();

   

    int resultado = random.nextInt(3);


    public void resultado(){
        switch (resultado) {
            case 0 :
              System.out.printf(" %s chutou na direita", jogador.getName());
              System.out.printf(" %s pulou para a direita", goleiro.getName());
              gols++;
              break;
              
              case 1:
                
              System.out.printf(" %s chutou no meio", jogador.getName());
              System.out.printf(" %s pulou no meio  ", goleiro.getName());
             System.out.println("Goleiro Defendeu");
              
              case 2: 
                
              System.out.printf(" %s chutou na esquerda", jogador.getName());
              System.out.printf(" %s pulou para a esquerda  ", goleiro.getName());
              gols++;
              
                case 3: 
                System.out.printf(" %s chutou na direita", jogador.getName());
                System.out.printf(" %s pulou para a esquerda", goleiro.getName()); 
                System.out.println("Golero defendeu"); 

                case 4: 
                System.out.printf(" %s chutou na esquerda", jogador.getName());
                System.out.printf(" %s pulou para a direita  ", goleiro.getName());  
                System.out.println("Golero defendeu");

                case 5: 
                System.out.printf(" %s chutou no meio", jogador.getName());
                System.out.printf(" %s pulou para a direita  ", goleiro.getName());  
                gols ++;
                
                case 6: 
                System.out.printf(" %s chutou no meio", jogador.getName());
                System.out.printf(" %s pulou para a direita  ", goleiro.getName());  
                gols++;
                 default:
               
        }
    }

    public boolean Penalti(){
        if(Objects.equals(this.time1.getDisputa(), this.time2.getDisputa())){
            return true;

        }else if(!Objects.equals(this.time1.getName(), this.time2.getName())){
            return true;
        }else{
            return false;
        }
    }




    public Time getTime1() {
        return time1;
    }


    public void setTime1(Time time1) {
        this.time1 = time1;
    }


    public Time getTime2() {
        return time2;
    }


    public void setTime2(Time time2) {
        this.time2 = time2;
    }


    public Jogador getJogador() {
        return jogador;
    }


    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }


    public Goleiro getGoleiro() {
        return goleiro;
    }


    public void setGoleiro(Goleiro goleiro) {
        this.goleiro = goleiro;
    }
    
    public Jogador getChutar() {
        return chutar;
    }

    public void setChutar(Jogador chutar) {
        this.chutar = chutar;
    }
    public Jogador getDefender() {
        return defender;
    }

    public void setDefender(Jogador defender) {
        this.defender = defender;
    }

    
    
}
