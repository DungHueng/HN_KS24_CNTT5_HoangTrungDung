import java.util.Scanner;
import java.util.regex.Pattern;

public class HN_KS24_CNTT5_HoangTrungDung {
    public static void main(String[] args) {
        String[] id = new String[100];
        Scanner scanner = new Scanner(System.in);
        int current = 0;
        do {
            System.out.println("""
                    1. Hiển thị
                    2. Thêm mới (Regex)
                    3. Cập nhật
                    4. Xoá
                    5. Tìm kiếm (Regex)
                    6. Thoát
                    -- Lựa chọn của bạn: 
                    """);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                if (current == 0){
                    System.err.println("-- Danh sách trống --");
                }else {
                    for (int i = 0; i < current; i++) {
                        System.out.println("--------------------------");
                        System.out.println("MSSV: " + id[i]);
                        System.out.println("--------------------------");
                    }
                }
                    break;
                case 2:
                    String Id;
                    do {
                        System.out.print("Nhập MSSV: ");
                        Id = scanner.nextLine();

                        if (!Pattern.matches("^B\\d{7}$", Id)) {
                            System.err.println("-- Nhập sai định dạng --");
                        }
                    } while (!Pattern.matches("^B\\d{7}$", Id));

                    id[current++] = Id;
                    System.out.println("-- Thêm thành công --");
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6:
                    System.out.println("-- Thoát chương trình thành công --");
                    break;
                default:
                    System.err.println("-- Lựa chọn không hợp lệ --");
                    break;
            }
        }while(true);
    }
}
