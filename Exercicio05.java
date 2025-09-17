import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int coluna, linha, aux;
        Random rd= new Random();
        System.out.print("Me informe a quantidade de linhas--> ");
        linha= sc.nextInt();

        System.out.print("Me informe a quantidade de colunas--> ");
        coluna= sc.nextInt();
        int[][] matriz= new int[linha][coluna];
        int[][] matrizT= new int[coluna][linha];

        for (int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                matriz[i][j]=rd.nextInt(11);
                matrizT[j][i]= matriz[i][j];
                System.out.print(matriz[i][j] + "\t");

            }System.out.println();

        }
        System.out.println();

        for (int i=0; i< matrizT.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matrizT[i][j] + "\t");

            }
            System.out.println();


        }

    }
}
