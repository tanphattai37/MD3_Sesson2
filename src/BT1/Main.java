package BT1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng số nguyên tố cần in ra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khởi tạo biến đếm count
        int count = 0;

        // Bước 3: Khởi tạo biến N
        int N = 2;

        // Bước 4: Lặp để kiểm tra và in ra số nguyên tố
        while (count < numbers) {
            // Kiểm tra N có phải là số nguyên tố không
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
        }
        scanner.close();
    }
}


