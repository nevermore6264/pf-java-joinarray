import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        int i;
        //Nhập số lượng phần tử mảng 1
        System.out.println("Mời bạn nhập số lượng phần tử mảng 1");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        //Nhập số lượng phần tử mảng 2
        System.out.println("Mời bạn nhập số lượng phần tử mảng 2");
        int m = scanner.nextInt();
        int brr[] = new int[m];
        //Tạo mảng 3
        int crr[] = new int[m + n];

        //Nhập phần tử mảng 1
        for (i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập phần tử: " + i);
            arr[i] = scanner.nextInt();
        }

        //Nhập phần tử mảng 2
        for (i = 0; i < m; i++) {
            System.out.println("Mời bạn nhập phần tử: ");
            brr[i] = scanner.nextInt();
        }

        //Gán giá trị mảng 1 cho mảng 3
        for (i = 0; i < n; i++) {
            crr[index] = arr[i];
            index++;
        }

        //Gán giá trị mảng 2 cho mảng 3
        for (i = 0; i < m; i++) {
            crr[index] = brr[i];
            index++;
        }

        //In ra mảng 3
        for (i = 0; i < n + m; i++)
            System.out.print(crr[i]+"\t");
    }
}
