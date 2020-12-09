import java.io.*;
import java.util.Scanner;

/**
 * Created by tjung on 1/26/17.
 */
public class ride {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("ride.in"));
        String comet = scanner.next();
        String group = scanner.next();

        int cometCode = convertToCode(comet);
        int groupCode = convertToCode(group);

        PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));
        if (cometCode == groupCode) {
            pw.write("GO");
        }
        else {
            pw.write("STAY");
        }
        pw.close();
    }

    public static int convertToCode(String word) {
        int result = 1;
        for (int i = 0; i < word.length(); i++) {
            result *= ((int)word.charAt(i) - (int)'A' + 1);
        }
        return result % 47;
    }

}
