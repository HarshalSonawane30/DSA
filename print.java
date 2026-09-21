import java.util.*;
import java.io.*;

public class print {
    static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t;
        try {
            t = Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            return;
        }

        for (int i = 0; i < t; i++) {
            int n;
            
            try {
                n = Integer.parseInt(br.readLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
            print1(n);
        }
    }
}