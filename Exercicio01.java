import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random rd= new Random();

        int [][] m= new int[4][4];
        int dp= 0, ds= 0;

        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length;j++){

                m[i][j] = rd.nextInt(1,5);
                System.out.println(m[i][j] + "\t");

                //Verifica se estou na diagonal principal

                if (i == j){

                    dp +=m[i][j];

                }
                // Verifique se estou na diagonal secundaria
                else if (i + j ==m.length - 1) {

                    ds += m[i][j];

                }
            }
            System.out.println();


        }

        System.out.println("\n Soma da diagonal principal --> " + dp);
        System.out.println("Soma da diagonal secundaria --> " + ds);


    }
}
