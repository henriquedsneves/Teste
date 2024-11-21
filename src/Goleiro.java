import java.util.Random;
public class Goleiro {
    private String name;
    private int idade;
    private int camisa;

    public Goleiro(String name, int idade, int camisa) {
        this.name = name;
        this.idade = idade;
        this.camisa = camisa;
    }

    public Goleiro() {}

    public int defender() {
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

    
    

}
