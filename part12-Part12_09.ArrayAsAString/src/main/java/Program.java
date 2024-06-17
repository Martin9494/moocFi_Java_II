
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrix));

    }
    public static String arrayAsString(int[][] array){
        StringBuilder string = new StringBuilder();
        int rows = 0;
        int cols = 0;
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                
                string.append(array[i][j]);
            }
            string.append("\n");
            
        }
        

        return string.toString();
    }

}
