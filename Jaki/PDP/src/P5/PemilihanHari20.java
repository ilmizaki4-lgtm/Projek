import java.util.Scanner;

public class PemilihanHari20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
       
        String dayName, dayType;
        System.out.print("Input day name: ");
        dayName = zacky.nextLine();

       switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekend";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";    
        }
        System.out.println(dayName + "is a" + dayType);
    }
}
