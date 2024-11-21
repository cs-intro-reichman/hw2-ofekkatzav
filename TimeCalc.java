public class TimeCalc {
    public static void main(String[] args) {

    int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    int minutesToAdd = Integer.parseInt(args[1]);

    int totalMinute = (hours * 60) + minutes + minutesToAdd;
    int totalHours = totalMinute/60;
    int newHours = totalHours%24;
    int newMinutes = totalMinute - (totalHours * 60);

    String newMinuteString = (newMinutes >= 10) ? "" + newMinutes : "0" + newMinutes;   // if minutes <10 adding "0"
    String newHoursString = (newHours >= 10) ? "" + newHours : "0" + newHours;          // if hours <10 adding "0"
    System.out.println(newHoursString + ":" + newMinuteString);
    }
}
