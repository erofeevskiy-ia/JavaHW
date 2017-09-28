package task_3;

public class TgFunction {
    public static void main(String[] args) {
        myFunction(-10,1800,10);
    }

    /**
     * print table of results tg(2x)-3
     * @param a left boundary of a line in radian
     * @param b right boundary of a line in radian
     * @param h step in radian
     */
    public static void myFunction(double a, double b, double h){
        System.out.printf("|---x---|---F(x)---|%n");

        while(a<b){
            double F = Math.tan(2 * a)-3;
            System.out.printf("|%7.2f|%10.4f|%n",a,F);
            a+=h;
        }
    }
}
