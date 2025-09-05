package com.lqhuy03.jfp.basics.l05_double;

public class BigSmile {
    public static void main(String[] args) {
        // Canvas c = new Canvas(200, 200); // Chạy được nếu có thư viện

        int x = 100;      // tọa độ tâm X
        int y = 100;      // tọa độ tâm Y
        double scale = 0.5; // 1.0 = kích thước gốc, 2.0 = gấp đôi, 0.5 = nhỏ hơn

        // Mặt
        // c.fill("yellow");
        // c.stroke("black");
        // c.circle(x, y, 50 * scale);

        // Miệng
        // c.stroke("black");
        // c.fill("yellow");
        // c.circle(x, y, 30 * scale);
        // c.stroke("yellow");
        // c.rect(x - 32 * scale, y - 32 * scale, 62 * scale, 40 * scale);

        // Mắt
        // c.stroke("black");
        // c.fill("black");
        // c.circle(x - 20 * scale, y - 10 * scale, 5 * scale);
        // c.circle(x + 20 * scale, y - 10 * scale, 5 * scale);

        System.out.println("Smiley drawn at scale " + scale);
    }
}
