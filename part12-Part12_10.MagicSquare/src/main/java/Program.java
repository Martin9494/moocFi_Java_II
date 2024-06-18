import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
        int[][] matrix = {
            {3, 2, 7},
            {2, 4, 1},
            {3, 2, 1}
        };
        System.out.println(sumsOfDiagonals(matrix));
        
    }

    public static ArrayList<Integer> sumsOfDiagonals(int[][] square) {
        int sum1 = 0;
        int sum2 = 0;
        
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if(i == 0 && j == 0 ||i == 1 && j== 1 || i == 2 && j == 2){
                    sum1 += square[i][j];
                }
                if(i==0 && j==2 || i==1 && j == 1 || i == 2 && j == 0){
                    sum2 += square[i][j];
                }
            }
        }
        sums.add(sum2);
        sums.add(sum1);
        return sums;
    }
}
