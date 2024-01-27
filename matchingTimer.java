public class matchingTimer {

    public static void main(String[] args) {
        System.out.println("This program will match the last digit of a timer when it is ascending and descending at the same time.");

        int descendingTimer = 1018;
        int ascendingTimer = 0;

        while (descendingTimer >= 0) {
            //System.out.println("The descending timer is set to: " + descendingTimer);
            //System.out.println("The ascending timer is set to: " + ascendingTimer);
            descendingTimer--;
            ascendingTimer++;

            if (descendingTimer == ascendingTimer) {
                System.out.println("The timers are equal.");
                System.out.println("The descending timer equals " + descendingTimer + " and the ascending timer equals " + ascendingTimer + ".");
            }//if

            if (descendingTimer % 10 == ascendingTimer % 10) {
                System.out.println("Descending " + descendingTimer);
                System.out.println("Ascending " + ascendingTimer);
            } // modulo op if

        } //while
    } //main
}//class
