public class arreglos {
    public static void main (String[] args){
        int[] vectorperon = new int[7];
        int[][] vectorperonista = new int[2][7];

        vectorperon[0] = 1;
        vectorperon[1] = 2;
        vectorperon[2] = 3;
        vectorperon[3] = 4;
        vectorperon[4] = 5;
        vectorperon[5] = 6;
        vectorperon[6] = 7;

        for(int i = 0;i <= 6;i++){
            System.out.println(vectorperon[i]);
        }
System.out.println("///////////////////");
        int variablefachera = 0;
        for(int j = 0; j <= 1; j++){
            for(int k = 0; k <=6; k++){
            variablefachera++;
            vectorperonista[j][k] = variablefachera;
            }
        }
        for(int j = 0; j <= 1; j++){
            for(int k = 0; k <=6; k++){
            System.out.println(vectorperonista[j][k]);
            }
        }
        System.out.println("(((((((((((((((((((())))))))))))))))))))");
        for(int j = 1; j >= 0; j--){
            for(int k = 6; k >= 0; k--){
            System.out.println(vectorperonista[j][k]);
            }
        }
    }
}
