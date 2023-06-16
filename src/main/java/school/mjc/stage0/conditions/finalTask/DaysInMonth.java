package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                System.out.println("wrong number!");
                break;
        } if (year < 0) {
            System.out.println("invalid date");
        } else {

            switch (year % 100) {
                case 0:
                    System.out.println("not leap");
                    break;
                default:
                    switch (year % 4) {
                        case 0:
                            System.out.println("leap");
                            break;
                        default:
                            System.out.println("not leap");
                            break;
                    }
            }
        }

    }
}
