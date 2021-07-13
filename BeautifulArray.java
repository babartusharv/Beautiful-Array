import java.io.PrintWriter;
import java.util.*;
public class BeautifulArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int length = obj.nextInt();
        while (length-- != 0) {
            int n = obj.nextInt();
            int[] num = new int[n];
            int c1 = 0, cm1 = 0, co = 0;
            for (int i = 0; i < n; i++) {
                num[i] = obj.nextInt();
                if (num[i] == -1) cm1++;
                else if (num[i] >= 2 || num[i] <= -2) co++;
                else if (num[i] == 1) c1++;
            }
            if (co == 0 && cm1 == 0) out.println("yes");
            else if (co == 1 && cm1 == 0) out.println("yes");
            else if (co == 0 && cm1 > 0) {
                if (cm1 == 1) out.println("yes");
                else {
                    if (c1 > 0) out.println("yes");
                    else out.println("no");
                }
            } else out.println("no");
        }
        out.flush();
    }
}