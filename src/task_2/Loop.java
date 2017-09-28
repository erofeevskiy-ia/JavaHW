package task_2;

import static java.lang.Math.pow;

public class Loop {

    public static void main(String[] args) {
        System.out.println("minmum element="+minElemSequence(0.00005));
    }

    /**
     * Find minimum n for eqution: a_n= 1/(n+1)^2 with condition M: a_n<eps
     *
     * @param eps is an arbitrarily small positive quantity is commonly denoted
     * @return minimal number for condition from description of the method
     */
    public static int minElemSequence(double eps){
        double a=Double.MAX_VALUE;
        int i;
        for(i=1;a>=eps;i++){
            a=1/pow((i+1),2);
            System.out.printf("a_%d=%.7f\n",i,a);
        }
        return i-1;
    }
}
