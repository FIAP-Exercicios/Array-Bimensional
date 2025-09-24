import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();

        int linha_a= rd.nextInt(2, 5);
        int coluna_a= rd.nextInt(2, 5);
        int linha_b= coluna_a;
        int coluna_b = rd.nextInt(2, 5);

        int[][] a= new int[linha_a][coluna_a];
        int[][] b= new int[linha_b][coluna_b];
        int[][] c= new int[linha_a][coluna_b];

        System.out.println("--------- MATRIZ A ---------");
        for (int i=0; i< linha_a; i++){
            for (int j=0; j< coluna_a; j++){
                a[i][j]= rd.nextInt(5);


                System.out.print(a[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- MATRIZ B ---------");
        for (int i=0; i< linha_b; i++){
            for (int j=0; j < coluna_b; j++){
                b[i][j]= rd.nextInt(5);


                System.out.print(b[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println();

        // MULTIPLICAÇÃO DE MATRIZES

        for (int i=0; i< linha_a; i++){
            for (int j= 0; j< coluna_b; j++){
                int aux=0;
                for (int k=0; k< linha_b; k++){

                    aux+= a[i][k]*b[k][j];


                }
                c[i][j]= aux;

            }

        }


        System.out.println("--------- MATRIZ C ---------");
        for (int i= 0; i< linha_a; i++){
            for (int j= 0; j< coluna_b; j++){

                System.out.print(c[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
