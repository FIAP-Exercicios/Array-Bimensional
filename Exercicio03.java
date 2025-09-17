import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random rd= new Random();
        double [][] temperatura= new double[10][12];
        DecimalFormat dc= new DecimalFormat("0.00");
        double [] media= new double[temperatura.length];
        double aux, maiorM = Double.MIN_EXPONENT, menorM = Double.MAX_EXPONENT;
        int anoMaior= 0, anoMenor= 0;

        for (int i=0; i< temperatura.length; i++){
            aux=0;
            for (int j=0; j < temperatura[i].length; j++){
                temperatura[i][j]= rd.nextDouble(0, 35);
                System.out.print(dc.format(temperatura[i][j])+"°"+"\t");

               aux+= temperatura[i][j];
            }
            System.out.println();
            media[i]= aux / temperatura[i].length;
            if (media[i] > maiorM){
                maiorM=media[i];
                anoMenor= i;

            }
            if (media[i] < menorM){
                menorM= media[i];
                anoMaior= i;

            }

        }

        // impressão da media de cada ano
        System.out.println();
        for (int i= 0;i < media.length; i++){

            System.out.println("Ano "+ (i+1) + " --> " + dc.format(media[i])+"°");

        }
        System.out.println("Ano com maior media --> " + anoMaior +" ||||||||||||| Ano com menor media --> " + anoMenor);

    }
}
