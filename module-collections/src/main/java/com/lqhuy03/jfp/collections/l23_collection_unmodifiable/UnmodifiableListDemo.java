package com.lqhuy03.jfp.collections.l23_collection_unmodifiable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

    public static void main(String[] args) {
        // Tạo một danh sách ban đầu
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Russia");

        // Chuyển sang danh sách chỉ đọc (unmodifiable)
        List<String> readOnlyCountries = Collections.unmodifiableList(countries);

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu: " + readOnlyCountries);

        // ✅ Có thể đọc dữ liệu
        System.out.println("Phần tử đầu tiên: " + readOnlyCountries.get(0));

        // ❌ Không thể thêm hoặc xóa phần tử (sẽ ném UnsupportedOperationException)
        try {
            readOnlyCountries.add("China"); // Lỗi
        } catch (UnsupportedOperationException e) {
            System.out.println("Không thể thêm phần tử: " + e);
        }

        try {
            readOnlyCountries.remove("India"); // Lỗi
        } catch (UnsupportedOperationException e) {
            System.out.println("Không thể xóa phần tử: " + e);
        }

        // ✅ Nếu thay đổi list gốc, list unmodifiable sẽ thay đổi theo
        countries.set(0, "Vietnam");
        System.out.println("Sau khi sửa list gốc: " + readOnlyCountries);
    }
}
