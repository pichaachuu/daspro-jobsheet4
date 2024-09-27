import java.util.Scanner;
public class PemilihanHari13 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        String dayType;
        int dayNumber;

        System.out.print("Input number 1-7: ");
        dayNumber = input00.nextInt();

            // switch (dayName.toLowerCase()) {
            //     case "monday":
            //     case "tuesday":
            //     case "wednesday":
            //     case "thursday":
            //     case "friday":
            //         dayType = "weekday";
            //         break;
            //     case "saturday":
            //     case "sunday":
            //         dayType = "weekend";
            //         break;
            //     default:
            //         dayType = "invalid day name";
            // }
            // System.out.println(dayName + " is a " + dayType);

            if (dayNumber >= 1 && dayNumber <= 5) {
                dayType = "Weekday";
                System.out.println(dayNumber + " is Weekday");
            } else if (dayNumber == 6 || dayNumber == 7) {
                dayType = "Weekend";
                System.out.println(dayNumber + " is weekend");
            } else {
                System.out.println("number is invalid");
                return;
            }
    }
}
