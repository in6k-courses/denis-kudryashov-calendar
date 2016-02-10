import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> colors = new HashMap<String, String>();

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int firstDayPosition = date.withDayOfMonth(1).getDayOfWeek().getValue();
        Month currentMonth = date.getMonth();
        int currentDayOfMonth = date.getDayOfMonth();
        colors.put("RESET", "\033[1;0m");
        colors.put("CyanF", "\033[1;46m");
        colors.put("BlueB", "\033[1;44m");
        colors.put("WhiteF", "\033[1;37m");
        colors.put("RedF", "\033[31m");
        ///////////////////////////////////////////////////////////////////

        System.out.println(colors.get("CyanF") + currentMonth + "\033[1;0m");

        printDaysOfWeek();

        for (int j = 1; j < firstDayPosition; j++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            if(i == currentDayOfMonth) {
                System.out.print(colors.get("WhiteF") + colors.get("BlueB") + i + colors.get("RESET") + "\t");
            } else
            if(date.withDayOfMonth(i).getDayOfWeek().getValue() == 7)
            {
                System.out.print(colors.get("RedF") + i  + colors.get("RESET") + "\n");
            } else System.out.print(i + "\t");
        }

    }

    public static void printDaysOfWeek() {
        System.out.print("Mon\t");
        System.out.print("Tue\t");
        System.out.print("Wed\t");
        System.out.print("Thu\t");
        System.out.print("Fri\t");
        System.out.print("Sat\t");
        System.out.print("Sun\t\n" + colors.get("RESET"));
    }
}
