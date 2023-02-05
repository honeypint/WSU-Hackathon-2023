import java.util.*;
import java.io.*;
import java.time.*;
class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        ArrayList<String> serialNum = new ArrayList<>();
        Scanner se = new Scanner(new File("serial.txt"));
        int next = 0;
        while(se.hasNextLine()) {
            serialNum.add(se.nextLine());
            next = Integer.parseInt(serialNum.get(serialNum.size()-1));
        }
        next++;
        String thisSerial = Integer.toString(next);
        PrintWriter pw = new PrintWriter("serial.txt");
        for(String cur : serialNum) {
            pw.println(cur);
        }
        pw.println(thisSerial);
        pw.close();

        String GTIN = "10850020317117";
        String SSCC = "085002031700000019";
        LocalDate currentDate = LocalDate.now();
        //GLN
        System.out.print("What is your location?: "); // depending on what to do the information may be taken in by a text box instead
        String lot = in.nextLine();
        String GLN;
        ArrayList<Double> Field = new ArrayList<>();
        if(lot.equalsIgnoreCase("1")) {
            GLN = "8500203170026";
            Field.add(42.55);
            Field.add(-85.22);
        } else if(lot.equalsIgnoreCase("2")) {
            GLN = "8500203170033";
            Field.add(42.54);
            Field.add(-85.21);
        } 
        System.out.print("How much does the product weigh?: ");
            int weight = in.nextInt();
        
    }
}
