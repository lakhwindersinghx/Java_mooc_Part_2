public class MagicSquareFactory {
    public static void main(String[] args) {

    int[][] magicSquare =createMagicSquare(5);

        for (int[] row : magicSquare) {
        for (int num : row) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}


    public static int[][] createMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];
        int num = 1;
        int row = 0;
        int column = n / 2;

        while (num <= n * n) {
            magicSquare[row][column]=num;
            num++;

            //new position
            int newRow=(row-1+n)%n;
            int newCol=(column+1)%n;

            if(magicSquare[newRow][newCol]!=0){
                row=(row+1)%n;
            }
            else {
                row=newRow;
                column=newCol;
            }
        }
        return magicSquare;
    }

}