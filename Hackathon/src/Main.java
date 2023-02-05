import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer> Serial = new ArrayList<>(); //serial #
         ArrayList<Integer> BatchCode = new ArrayList<>(); // BatchCode

        int exit = 0;
        while (exit == 0) {


        //GLN
        System.out.print("What is your location?: "); // depending on what to do the information may be taken in by a text box instead
        String location = in.nextLine();
        String GLN;
        ArrayList<Double> Field = new ArrayList<>();
        if(location.equalsIgnoreCase("1")) {
            GLN = "8500203170026";
            Field.add(42.55);
            Field.add(-85.22);
        } else if(location.equalsIgnoreCase("2")) {
            GLN = "8500203170033";
            Field.add(42.54);
            Field.add(-85.21);
        } else {
            exit = 1;
        }
        
        

        Date currentDate = new Date(); // date
        
        } 



        System.out.print("How much does the product weigh?: ") {
            int weight = in.nextInt();
        }

        //Event user = new Event();

        /* psuedo:
         * -ask the user for data that is needed to be filled in
         * -auto fill in other information -- get the date, generate serial/batch codes, etc.
         * -take all variables and add them to an object representing the item(?)
         * -
         * -
         * -
         */
         in.close();
    }
}
