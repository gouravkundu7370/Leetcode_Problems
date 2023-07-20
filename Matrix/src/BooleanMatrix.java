import java.util.ArrayList;

public class BooleanMatrix {
    public static void main(String[] args) {
        int R = 4, C = 3;
        int[][] matrix = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};
        booleanMatrix(matrix);
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void booleanMatrix(int[][] matrix)
    {
        {

            ArrayList<Integer> delRow = new ArrayList<>();

            ArrayList<Integer> delCol = new ArrayList<>();

            int R = matrix.length;

            int C = matrix[0].length;

            for(int i=0; i<R; i++){

                for(int j=0; j<C; j++){

                    if(matrix[i][j] == 1) {

                        if(!delRow.contains(i)) delRow.add(i);

                        if(!delCol.contains(j)) delCol.add(j);

                    }

                }

            }



            for(int i=0; i<delRow.size(); i++){

                int Row = delRow.get(i);

                for(int j=0; j<C; j++) matrix[Row][j] = 1;

            }

            for(int i=0; i<delCol.size(); i++){

                int Col = delCol.get(i);

                for(int j=0; j<R; j++) matrix[j][Col] = 1;

            }

        }
    }
}
