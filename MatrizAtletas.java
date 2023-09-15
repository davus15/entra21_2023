public class MatrizAtletas {

    public static void main(String[] args) {
        double[][] matriz = {
                {20, 16, 0.5},
                {25, 19, 1},
                {24, 25, 0.4},
                {28, 10, 1.2},
                {19, 10, 1.4},
                {22, 20, 0.9}
        };

     
        double somaIdade = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaIdade += matriz[i][0];
        }
        double mediaIdade = somaIdade / matriz.length;
        System.out.println("Média de idade dos atletas: " + mediaIdade);

       
        double maxGols = matriz[0][2];
        double idadeMaxGols = matriz[0][0];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][2] > maxGols) {
                maxGols = matriz[i][2];
                idadeMaxGols = matriz[i][0];
            }
        }
        System.out.println("Idade do atleta que mais fez gols: " + idadeMaxGols);

       
        double[][] matrizGols = new double[matriz.length][3];
        for (int i = 0; i < matriz.length; i++) {
            matrizGols[i][0] = matriz[i][0];
            matrizGols[i][1] = matriz[i][1];
            matrizGols[i][2] = matriz[i][1] * matriz[i][2];
        }

        
        System.out.println("Matriz com a quantidade de gols dos atletas:");
        for (int i = 0; i < matrizGols.length; i++) {
            for (int j = 0; j < matrizGols[i].length; j++) {
                System.out.print(matrizGols[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
