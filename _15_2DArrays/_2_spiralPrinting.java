public class _2_spiralPrinting {

    public static void spiralPrint(int arr[][]) {
        int startrow = 0, endrow = arr.length - 1;
        int startcol = 0, endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            //Top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            System.out.println();

            //Right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            System.out.println();

            //Bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }
            System.out.println();

            //Left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };

        spiralPrint(arr);

    }
}