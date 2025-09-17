import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] produtos= {"Eletronico", "Roupas", "Alimento"};
        String[] meses={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        double[][] Tabela = new double[produtos.length][meses.length];
        double aux, numeroM, k, soma, maior=0;
        int index = 0;
        Random rd= new Random();
        DecimalFormat df= new DecimalFormat(" R$ #,##0.00");

        // gera vendas

        for (int i= 0; i < Tabela.length; i++){
            for (int j=0; j < Tabela[i].length; j++){
                Tabela[i][j]= rd.nextDouble(1, 1000);
                System.out.print(df.format(Tabela[i][j]) + "\t");


            }
            System.out.println();
        }
        System.out.println();

        // Soma do total de vendas por categoria

        for (int i= 0; i < Tabela.length; i++){
            aux= 0;
            for (int j=0; j < Tabela[i].length; j++){

                aux+= Tabela[i][j];


            }

            System.out.println(produtos[i] + "--> "+ df.format(aux));

        }

        // total de vendas por mês --> mês com a maior venda
        System.out.println("\nTotal de vendas por mês");
        for (int j=0; j< meses.length; j++){
            aux=0;
            for (int i=0; i < Tabela.length; i++){

                aux += Tabela[i][j];

            }
            System.out.println(meses[j] + "-->" + df.format(aux));
            if (aux> maior){

                maior= aux;
                index= j;

            }
        }
        System.out.println("Mês com o maior total de vendas --> " + meses[index]);






    }
}
