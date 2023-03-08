package BT2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. In hình chữ nhật.");
            System.out.println("2. In tam giác vuông.");
            System.out.println("3. In tam giác cân.");
            System.out.println("4.Thoát.");
            System.out.println("Nhập lựa chọn (Từ 0-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int width, height;
                    System.out.println("Nhập chiều rộng: ");
                    width = sc.nextInt();
                    System.out.println("Nhập chiều cao: ");
                    height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int size;
                    System.out.println("Nhập kích thước: ");
                    size = sc.nextInt();
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = size - 1; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = size; i > 0; i--) {
                        for (int j = 0; j < size - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int h;
                    System.out.println("Nhập chiều cao: ");
                    h = sc.nextInt();
                    for (int i = 0; i < h; i++) {
                        for (int j = h - i; j > 1; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai!");
            }
        } while (choice != 4);
        sc.close();
    }
}

