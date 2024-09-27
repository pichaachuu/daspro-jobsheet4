import java.util.Scanner;
public class PemilihanHari13 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        String dayType;
        int dayNomor;

        System.out.print("Input number 1-7: ");
        dayNomor = input00.nextInt();

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

            if (dayNomor >= 1 && dayNomor <= 5) {
                dayType = "Weekday";
                System.out.println(dayNomor + " is Weekday");
            } else if (dayNomor == 6 || dayNomor == 7) {
                dayType = "Weekend";
                System.out.println(dayNomor + " is weekend");
            } else {
                System.out.println("number is invalid");
                return;
            }
    }
}
