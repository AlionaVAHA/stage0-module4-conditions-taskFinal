package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        float  newValue =dividend/divider;
         float newNUmber = newValue * divider;

        if (newNUmber==dividend){
            System.out.println("can be divided completely");
        }  else{
            System.out.println("cannot be divided completely");
        }
    }
}
