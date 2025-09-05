package com.lqhuy03.jfp.basics.l02_static_methods;

import javax.swing.*;
import java.awt.*;

public class SmileySwingFactored extends JPanel {
    // Cho static methods dùng chung
    private static Graphics2D g2;

    public static void main(String[] args) {
        JFrame f = new JFrame("Smiley Swing Factored");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        f.setContentPane(new SmileySwingFactored());
        f.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawOutline();
        drawMouth();
        drawEyes();
    }

    /** Vẽ nền mặt và viền */
    public static void drawOutline() {
        g2.setColor(Color.YELLOW);
        g2.fillOval(50, 50, 100, 100);
        g2.setColor(Color.BLACK);
        g2.drawOval(50, 50, 100, 100);
    }

    /** Vẽ miệng cong (arc) */
    public static void drawMouth() {
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.BLACK);
        // x, y, width, height, startAngle, arcAngle
        g2.drawArc(70, 88, 60, 50, 200, 140);
    }

    /** Vẽ 2 mắt */
    public static void drawEyes() {
        g2.setColor(Color.BLACK);
        g2.fillOval(78, 88, 10, 10);   // trái
        g2.fillOval(112, 88, 10, 10);  // phải
    }
}
