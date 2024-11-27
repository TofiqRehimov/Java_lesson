package Enum;

public class Main {


    public static void main(String[] args) {
        WeekDasys weekdays = WeekDasys.Thursday;

        switch (weekdays) {
            case Munday:
                System.out.println("1 -ci gun");
                break;
                case Tuesday:
                    System.out.println("2 -ci gun");
                    break;
                case Wednesday:
                    System.out.println("3 -cu gun");
                    break;
                case Thursday:
                    System.out.println("4 -cu gun");
                    break;
                case Friday:
                    System.out.println("5 -ci gun");
                    break;
                case Saturday:
                    System.out.println("6 -ci gun");
                    break;
                case Sunday:
                    System.out.println("7 -ci gun");
                    break;
        }

        for (TrafficEnum Light: TrafficEnum.values()) {
           System.out.println(Light + " " + Light.getTrafficLight());
        }

    }
}
