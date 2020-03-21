import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int i,j,a;
        Scanner input= new Scanner(System.in);
        System.out.println("Please input the height of the triangle");
        int hei=input.nextInt();
        String[][] tri;
        tri=new String[hei][2*hei-1];
        for (i=0;i<hei;i++) {
            if (i==hei-1)
                for (j=0;j<2*hei-1;j++)
                    tri[i][j]="*";
             else {
                for (j = 0; j < hei - 1 - i; j++)
                    tri[i][j] = " ";
                tri[i][j] = "*";
                a = j;
                for (j = j + 1; j <= a + 2 * i - 1; j++)
                    tri[i][j] = " ";
                if (i != 0)
                    tri[i][j] = "*";
                else
                    tri[i][j] = " ";
                for (j = j + 1; j < 2 * hei - 1; j++)
                    tri[i][j] = " ";
            }

        }
        for (i=0;i<hei;i++) {
            for (j = 0; j < 2 * hei - 1; j++)
                System.out.print(tri[i][j]);
            System.out.println();
        }

    }
}
