public class SeeBattle {
    public static void main(String[] argrs) {
        int[][] battlearray = new int[5][5];
        for (int i = 0; i < battlearray.length; i++ ){
            for (int j = 0; j < battlearray.length; j++){
                System.out.printf(" %d ", battlearray[i][j]);
            }
            System.out.println();
        }
    }
}
