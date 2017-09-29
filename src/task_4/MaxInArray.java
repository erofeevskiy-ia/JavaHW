package task_4;

public class MaxInArray {

    public static void main(String[] args) {
        int a= Integer.MAX_VALUE;
        int aa= Integer.MAX_VALUE;
        long b = (long)a+(long)aa;
        int[] arr = new int[] {Integer.MAX_VALUE-5, 1, 2, Integer.MAX_VALUE-1 ,Integer.MAX_VALUE,Integer.MAX_VALUE,6,7,100,Integer.MAX_VALUE-1};
        System.out.println(max(arr));
    }

    /**
     * task_4 HW
     * @param a - sequence of integer numbers(or array of integers)
     * @return max(a_1+a_2n,...,(a_n+a_n+1))
     */

    public static long max(int ... a){
        long max=Long.MIN_VALUE;
        for(int i=0;i<a.length/2;i++){
            long curMax=(long)a[i]+(long)a[a.length-1-i];
            if(max<curMax) max=curMax;
        }
        return max;
    }
}
