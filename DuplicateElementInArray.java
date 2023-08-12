
import java.util.Scanner;

public class DuplicateElementInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int i, j, p = 0;
        boolean flag = false;
        String[] a = {"Java", "C", "C++", "Python", "Java"};

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    p = i;
                    flag = true;
                    break;
                }
            }
        }

        if (flag == false) {
            System.out.println("Duplicate element is not found");
        } else {
            System.out.println("Duplicate element is " + a[p]);
        }

        sc.close();

    }

}
