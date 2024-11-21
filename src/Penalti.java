import java.util.Random;

public class Penalti {
    public static void main(String[] args) {
        Random random = new Random();

        // Criando os times e jogadores
        Time time1 = new Time();
        time1.setName("Flamengo");
        time1.setDisputa("Final");

        Time time2 = new Time();
        time2.setName("Atlético Mineiro");
        time2.setDisputa("Final");

        Jogador jogador1 = new Jogador("Henrique", 25, 10, "Direita");
        Jogador jogador2 = new Jogador("Hulk", 30, 7, "Esquerda");

        Goleiro goleiro1 = new Goleiro("Diego Alves", 35, 1);
        Goleiro goleiro2 = new Goleiro("Everson", 32, 12);

        int golsTime1 = 0;
        int golsTime2 = 0;

        // Loop para 5 chutes de cada time
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\n--- Chute %d ---\n", i);

            // Time 1 chuta, Time 2 defende
            int chuteJogador1 = random.nextInt(3); // 0 = direita, 1 = meio, 2 = esquerda
            int defesaGoleiro2 = random.nextInt(3);

            System.out.printf("%s chutou para %s\n", jogador1.getName(), direcao(chuteJogador1));
            System.out.printf("%s defendeu para %s\n", goleiro2.getName(), direcao(defesaGoleiro2));

            if (chuteJogador1 != defesaGoleiro2) {
                System.out.println("Gol do Flamengo!");
                golsTime1++;
            } else {
                System.out.println("Defesa do Atlético Mineiro!");
            }

            // Time 2 chuta, Time 1 defende
            int chuteJogador2 = random.nextInt(3); // 0 = direita, 1 = meio, 2 = esquerda
            int defesaGoleiro1 = random.nextInt(3);

            System.out.printf("%s chutou para %s\n", jogador2.getName(), direcao(chuteJogador2));
            System.out.printf("%s defendeu para %s\n", goleiro1.getName(), direcao(defesaGoleiro1));

            if (chuteJogador2 != defesaGoleiro1) {
                System.out.println("Gol do Atlético Mineiro!");
                golsTime2++;
            } else {
                System.out.println("Defesa do Flamengo!");
            }
        }

        // Resultado final
        System.out.println("\n--- Resultado Final ---");
        System.out.printf("Flamengo: %d gols\n", golsTime1);
        System.out.printf("Atlético Mineiro: %d gols\n", golsTime2);

        if (golsTime1 > golsTime2) {
            System.out.println("Flamengo vence nos pênaltis!");
        } else if (golsTime1 < golsTime2) {
            System.out.println("Atlético Mineiro vence nos pênaltis!");
        } else {
            System.out.println("Empate nos pênaltis!");
        }
    }

    // Método auxiliar para converter direção do chute/defesa
    private static String direcao(int valor) {
        return switch (valor) {
            case 0 -> "direita";
            case 1 -> "meio";
            case 2 -> "esquerda";
            default -> "indefinida";
        };
    }
}

