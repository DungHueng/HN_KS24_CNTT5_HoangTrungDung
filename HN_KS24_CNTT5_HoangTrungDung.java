import java.util.Scanner;
import java.util.regex.Pattern;

public class HN_KS24_CNTT5_HoangTrungDung {
    public static void main(String[] args) {
        String id = new String();
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
                        System.out.println("MSSV: " + id);
                        System.out.println("--------------------------");
                    }
                }
                    break;
                case 2:
                    do {
                        System.out.println("Nhập MSSV: ");
                        id = scanner.nextLine();
                    }while(Pattern.matches("^B\\d{7}$", id));

                    StringBuilder info = new StringBuilder();
                    info.append(id);
                    System.out.println(info);
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
            }
        }while(true);
    }
}
