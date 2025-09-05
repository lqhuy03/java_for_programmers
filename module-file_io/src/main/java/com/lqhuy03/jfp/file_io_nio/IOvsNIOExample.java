package com.lqhuy03.jfp.file_io_nio;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class IOvsNIOExample {

    private static final String IO_FILE = "io_example.txt";
    private static final String NIO_FILE = "nio_example.txt";

    public static void main(String[] args) {
        try {
            // -------------------------------
            // 1. Java I/O truyền thống
            // -------------------------------
            System.out.println("=== Java I/O ===");
            writeWithIO(IO_FILE, "Xin chào, đây là ví dụ I/O truyền thống!");
            readWithIO(IO_FILE);

            // -------------------------------
            // 2. Java NIO
            // -------------------------------
            System.out.println("\n=== Java NIO ===");
            writeWithNIO(NIO_FILE, "Xin chào, đây là ví dụ NIO hiện đại!");
            readWithNIO(NIO_FILE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------
    // I/O: Reader/Writer
    // -------------------------------
    private static void writeWithIO(String file, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            writer.write(content);
            writer.newLine();
            writer.write("Dòng 2: Ghi thêm với I/O");
        }
    }

    private static void readWithIO(String file) throws IOException {
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("[I/O đọc] " + line);
            }
        }
    }

    // -------------------------------
    // NIO: Files + Channel + Buffer
    // -------------------------------
    private static void writeWithNIO(String file, String content) throws IOException {
        Path path = Paths.get(file);
        try (FileChannel channel = FileChannel.open(path,
            StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes(StandardCharsets.UTF_8));
            buffer.put("\nDòng 2: Ghi thêm với NIO".getBytes(StandardCharsets.UTF_8));

            buffer.flip(); // đổi sang chế độ đọc để ghi ra file
            channel.write(buffer);
        }
    }

    private static void readWithNIO(String file) throws IOException {
        Path path = Paths.get(file);
        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesRead = channel.read(buffer);
            while (bytesRead != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                bytesRead = channel.read(buffer);
            }
        }
    }
}
