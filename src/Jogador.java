import java.util.Random;
public class Jogador {
    private String name;
    private int idade;
    private int camisa;
    private String perna_Boa;

    public Jogador(String name, int idade, int camisa, String perna_Boa) {
        this.name = name;
        this.idade = idade;
        this.camisa = camisa;
        this.perna_Boa = perna_Boa;
    }

    public Jogador() {}

    public int chutar() {
        Random random = new Random();
        return random.nextInt(3); // 0 = direita, 1 = meio, 2 = esquerda
    }
   

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCamisa() {
        return camisa;
    }
    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }
    public String getPerna_Boa() {
        return perna_Boa;
    }
    public void setPerna_Boa(String perna_Boa) {
        this.perna_Boa = perna_Boa;
    }

    
    
}
