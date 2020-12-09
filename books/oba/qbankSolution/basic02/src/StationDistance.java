import java.util.Scanner;

/**
 * Created by tjung on 6/3/17.
 */
public class StationDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            distances[i] = scanner.nextInt();
        }

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int distancePath1 = getDistance(start, end, distances);
        int distancePath2 = getDistance(end, start, distances);

        System.out.println(Math.min(distancePath1, distancePath2));

    }

    public static int getDistance(int start, int end, int[] distances){
        int pathDistance = 0;
        int n = distances.length;
        int cur = start;
        while( cur != end){
            int next = cur + 1;
            if (next > n) {
                next = 1;
            }

            pathDistance += distances[cur-1];
            cur = next;
        }
        return pathDistance;
    }
}
