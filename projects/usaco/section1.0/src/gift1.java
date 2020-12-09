import java.io.*;
import java.util.Scanner;

/**
 * Created by tjung on 1/26/17.
 */
public class gift1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("gift1.in"));

        int np = scanner.nextInt();
        String[] persons = new String[np];
        for (int i = 0; i < np; i++) {
            persons[i] = scanner.next();
        }

        int[] nets = new int[np];
        for (int i = 0; i < np; i++) {
            String giver = scanner.next();
            int posGiver = findPersonPosition(persons, giver);
            int totalFund = scanner.nextInt();
            int nFriends = scanner.nextInt();
            if (nFriends == 0)
                continue;

            int nAmount = totalFund / nFriends;

            nets[posGiver] -= (nAmount * nFriends);
            for (int j = 0; j < nFriends; j++) {
                String friend = scanner.next();
                int posFriend = findPersonPosition (persons, friend);
                nets[posFriend] += nAmount;
            }
        }

        PrintWriter pw = new PrintWriter(new FileWriter("giver1.out"));
        for (int i = 0; i < np; i++) {
            pw.print(persons[i]);
            pw.print(" ");
            pw.println(nets[i]);
        }
        pw.close();
    }

    private static int findPersonPosition(String[] persons, String friend) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].equals(friend))
                return i;
        }
        return -1;
    }
}
