public class MatrixAdditionExample {
    public static void main(String aregs[]) {
        int a [][] = {{1,2,3}, {5,6,4}, {10,55,60}};
        int b [][] = {{1,2,3}, {5,6,4}, {10,55,60}};
        int c [][] = new int[3][3];
        for(int i=0; i<3 ;i++){
            for(int j=0; j<3 ;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
      
    }
}
