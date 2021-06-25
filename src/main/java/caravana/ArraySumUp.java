package caravana;

public class ArraySumUp {
    public static void main(String [] args) {
        int [] sumArray = new int [5];
        sumArray[0] = 6;
        sumArray[1] = 5;
        sumArray[2] = 7;
        sumArray[3] = -4;
        sumArray[4] = 8;
        int target = 10;
        System.out.println(Arrays.toString(sumTwoNumbers(sumArray, target)));
    }
    //1. Ordenar o array e "tunelar" e varrer de dois lados
    // Merge sort
    // Ver tempo de CPU
    //2. Criar estrutura de dados e ver os elementos ate chegar no target
    public static int [] sumTwoNumbers(int[] sumArray, int target){
        for(int i =0; i < sumArray.length-1; i++){
            for(int j = i+1; j < sumArray.length; j++){
                if(sumArray[i] + sumArray[j] == target){
                    int sum [] = new int[2];
                    sum [0] = sumArray[i];
                    sum [1] = sumArray[j];
                    return sum;
                }
            }
        }
        return new int[]{};
    }
}
