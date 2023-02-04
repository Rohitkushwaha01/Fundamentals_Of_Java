public class Main {
    public static void main(String[] args) {
        int Days = 6;
        // switch (Days) {
        //     case 0:
        //         System.out.println("It's Monday");
        //         break;
        //     case 1:
        //         System.out.println("It's Tuesday");
        //         break;
        //     case 2:
        //         System.out.println("It's Wednesday");
        //         break;
        //     case 3:
        //         System.out.println("It's Thursday");
        //         break;
        //     case 4:
        //         System.out.println("It's Friday");
        //         break;
        //     case 5:
        //         System.out.println("It's Saturday");
        //         break;
        //     case 6:
        //         System.out.println("It's Sunday");
        //         break;
        //     default:
        //         break;
        // }

        switch (Days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        
            default -> System.out.println("Day does exits");
        }
    }   
}
