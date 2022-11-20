package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int dividerEnd1 = 0;
        if(divider !=0){
            dividerEnd1 = dividend/divider;
            int dividerEnd2 = dividerEnd1 * divider;
            if (dividerEnd2 == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }
    }
}
