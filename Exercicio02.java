import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random rd= new Random();
        int NumeroM=0, posicaoC, posicaoL;

        int[] [] m= new int[10] [10];

        for (int i= 0; i< m.length; i++){
            for (int j=0; j<m.length; j++) {
                m[i][j]= rd.nextInt(0, 1000);
                System.out.print(m[i][j] + "\t");

                if (NumeroM < m[i][j]){

                    NumeroM = m[i][j];

                }

            }
            System.out.println();


        }


        //Imprim a localização do maior valor

        for (int i=0; i<m.length;i++){
            for (int j=0; j< m.length;j++){

                if (m[i][j] == NumeroM){

                    System.out.println("(" + i + "," + j+ ")");

                }

            }

        }

    }
}
