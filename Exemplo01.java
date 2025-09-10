import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int [] [] m= new int[3][3];

        for (int i=0; i<m.length; i++){

            for (int j=0; j<m.length; j++){

                System.out.println("valor: ");
                m[i][j] = sc.nextInt();

            }

        }
        for (int i= 0; i<m.length;i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.print(m[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
