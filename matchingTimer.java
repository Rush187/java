import java.util.Scanner;

public class matchingTimer {

    public static void main(String[] args) {
        System.out.println("This program will match the last digit of a timer when it is ascending and descending at the same time.");
        System.out.print("Please specify the number of seconds you want to check: ");
        Scanner myObj = new Scanner(System.in);
        String getTheInfo = myObj.nextLine();
        System.out.println("You entered " + getTheInfo + ".");

        int descendingTimer = Integer.parseInt(getTheInfo);
        int ascendingTimer = 0;
        int totalSum = 0;
        int timersAreEqual = 0;

        while (descendingTimer >= 0) {
            descendingTimer--;
            ascendingTimer++;

            if (descendingTimer == ascendingTimer) {
                System.out.println("The timers are equal.");
                System.out.println("The descending timer equals " + descendingTimer + " and the ascending timer equals " + ascendingTimer + ".");
                totalSum = totalSum + 1;
            }//if

            if (descendingTimer % 10 == ascendingTimer % 10) {
                System.out.println("Descending " + descendingTimer);
                System.out.println("Ascending " + ascendingTimer);
                timersAreEqual = timersAreEqual + 1;

            } // modulo op if

        } //while
        System.out.println("The timers are equal this many times: " + totalSum + ".");
        System.out.println("The last digit in the timers are equal this many times: " + timersAreEqual + ".");

    } //main
}//class
