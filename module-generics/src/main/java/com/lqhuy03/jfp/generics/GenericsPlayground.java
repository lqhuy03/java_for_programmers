package com.lqhuy03.jfp.generics;

import java.lang.reflect.*;
import java.util.*;

/**
 * GenericsPlayground.java
 * Một playground duy nhất để luyện Java Generics: cơ bản → nâng cao, kèm ví dụ rõ ràng.
 * Chỉ cần: javac GenericsPlayground.java && java GenericsPlayground
 */
public class GenericsPlayground {

    // ========== MENU ==========
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": demoBasicGenericClass(); break;
                case "2": demoGenericMethod(); break;
                case "3": demoBoundedGenerics(); break;
                case "4": demoWildcardPECS(); break;
                case "5": demoMultipleBounds(); break;
                case "6": demoGenericInterface(); break;
                case "7": demoGenericConstructor(); break;
                case "8": demoCollectionsGeneric(); break;
                case "9": demoReflectionGeneric(); break;
                case "0":
                    System.out.println("Bye. Keep pushing.");
                    return;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }
            System.out.println("\nNhấn Enter để về menu...");
            sc.nextLine();
        }
    }

    private static void printMenu() {
        System.out.println("\n========= JAVA GENERICS PLAYGROUND =========");
        System.out.println("1) Class Generic cơ bản (Box<T>)");
        System.out.println("2) Generic Method (printArray, swap)");
        System.out.println("3) Bounded Generics (T extends Number)");
        System.out.println("4) Wildcard + PECS (extends/super)");
        System.out.println("5) Multiple Bounds (T extends Number & Comparable<T>)");
        System.out.println("6) Generic Interface + Implementation");
        System.out.println("7) Generic Constructor + Static Generic Method");
        System.out.println("8) Generics + Collections (List/Map)");
        System.out.println("9) Generics + Reflection (lấy type thực tế từ subclass)");
        System.out.println("0) Thoát");
        System.out.print("Chọn: ");
    }

    // ========== 1) BASIC GENERIC CLASS ==========
    private static void demoBasicGenericClass() {
        System.out.println("\n[1] Class Generic cơ bản (Box<T>)");

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("Box<String> = " + strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(2025);
        System.out.println("Box<Integer> = " + intBox.get());

        // Ưu điểm: type-safety, không cần cast khi get()
    }

    // ========== 2) GENERIC METHOD ==========
    private static void demoGenericMethod() {
        System.out.println("\n[2] Generic Method (printArray, swap)");

        String[] names = {"Java", "Spring", "PostgreSQL"};
        Integer[] nums = {1, 2, 3, 4};

        System.out.print("printArray(names): ");
        GenericMethods.printArray(names);

        System.out.print("printArray(nums): ");
        GenericMethods.printArray(nums);

        Pair<Integer, Integer> p = new Pair<>(10, 20);
        System.out.println("Before swap: " + p);
        GenericMethods.swap(p);
        System.out.println("After  swap: " + p);
    }

    // ========== 3) BOUNDED GENERICS ==========
    private static void demoBoundedGenerics() {
        System.out.println("\n[3] Bounded Generics (T extends Number)");

        System.out.println("square(5)     = " + MathUtil.square(5));     // Integer
        System.out.println("square(3.14)  = " + MathUtil.square(3.14));  // Double

        // Không compile nếu truyền String, vì không thỏa mãn <T extends Number>
    }

    // ========== 4) WILDCARD + PECS ==========
    private static void demoWildcardPECS() {
        System.out.println("\n[4] Wildcard + PECS");

        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println("printList (extends Number) - chỉ đọc:");
        Wildcards.printList(ints); // ? extends Number ⇒ đọc OK, add KHÔNG được

        List<Number> numbers = new ArrayList<>();
        Wildcards.addNumbers(numbers); // ? super Integer ⇒ ghi OK (add Integer)
        System.out.println("addNumbers (super Integer) - sau khi ghi: " + numbers);

        // Quy tắc PECS:
        // Producer Extends (đọc)   -> <? extends T>
        // Consumer Super   (ghi)    -> <? super T>
    }

    // ========== 5) MULTIPLE BOUNDS ==========
    private static void demoMultipleBounds() {
        System.out.println("\n[5] Multiple Bounds (T extends Number & Comparable<T>)");

        Bounded<Integer> b = new Bounded<>(10);
        System.out.println("isGreaterThan(5) ? " + b.isGreaterThan(5)); // true

        // Nếu truyền một kiểu không Comparable hoặc không phải Number → không compile.
    }

    // ========== 6) GENERIC INTERFACE ==========
    private static void demoGenericInterface() {
        System.out.println("\n[6] Generic Interface + Implementation");

        Repository<String> repo = new MemoryRepository<>();
        repo.add("Java");
        repo.add("Spring Boot");
        repo.add("PostgreSQL");

        System.out.println("repo.get(0) = " + repo.get(0));
        System.out.println("repo size   = " + repo.size());

        // Có thể tạo Repository<Integer>, Repository<User>, ...
    }

    // ========== 7) GENERIC CONSTRUCTOR + STATIC GENERIC METHOD ==========
    private static void demoGenericConstructor() {
        System.out.println("\n[7] Generic Constructor + Static Generic Method");

        new Printer("Hello");   // T là String
        new Printer(123);       // T là Integer
        new Printer(3.14);      // T là Double

        String echoed = Printer.echo("Echo me");
        Integer doubled = Printer.doubleValue(21);
        System.out.println("echo: " + echoed);
        System.out.println("doubleValue: " + doubled);
    }

    // ========== 8) GENERICS + COLLECTIONS ==========
    private static void demoCollectionsGeneric() {
        System.out.println("\n[8] Generics + Collections");

        List<String> names = new ArrayList<>();
        names.add("java");
        names.add("spring");
        names.add("docker");
        names.replaceAll(String::toUpperCase);
        System.out.println("Names: " + names);

        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("java", 2);
        wordCount.put("spring", 1);

        // For-each với Map.Entry<String, Integer>
        for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // ========== 9) GENERICS + REFLECTION ==========
    private static void demoReflectionGeneric() {
        System.out.println("\n[9] Generics + Reflection (lấy type thực tế từ subclass)");

        // Kỹ thuật: type parameter bị xóa (erasure) ở runtime,
        // nhưng nếu ta tạo subclass FIXED-TYPE thì có thể đọc lại tham số kiểu qua reflection.
        BaseRepo<String> repo = new StringRepo();
        repo.printGenericType();

        // Một ví dụ khác với List<Integer> không thể lấy Integer trực tiếp do erasure:
        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println("At runtime, List<Integer> erasure type is: " + ints.getClass().getTypeName());
        // Kết quả: java.util.Arrays$ArrayList hoặc java.util.ArrayList (không giữ Integer).
    }

    // ======== SUPPORTING TYPES (STATIC NESTED CLASSES/INTERFACES) ========

    // 1) Basic generic class
    static class Box<T> {
        private T value;
        public void set(T value) { this.value = value; }
        public T get() { return value; }
    }

    // 2) Generic methods utilities
    static class GenericMethods {
        public static <T> void printArray(T[] array) {
            for (T e : array) System.out.print(e + " ");
            System.out.println();
        }
        public static <A> void swap(Pair<A, A> pair) {
            A tmp = pair.first;
            pair.first = pair.second;
            pair.second = tmp;
        }
    }

    // Pair for swap demo
    static class Pair<X, Y> {
        X first;
        Y second;
        Pair(X f, Y s) { this.first = f; this.second = s; }
        @Override public String toString() { return "(" + first + ", " + second + ")"; }
    }

    // 3) Bounded generics
    static class MathUtil {
        public static <T extends Number> double square(T num) {
            return num.doubleValue() * num.doubleValue();
        }
    }

    // 4) Wildcards + PECS
    static class Wildcards {
        // Producer Extends: chỉ đọc
        public static void printList(List<? extends Number> list) {
            for (Number n : list) System.out.print(n + " ");
            System.out.println();
            // list.add(123); // ❌ Không được: ? extends Number là producer (chỉ đọc)
        }

        // Consumer Super: chỉ ghi
        public static void addNumbers(List<? super Integer> list) {
            list.add(10);
            list.add(20);
            // Đọc ra chỉ đảm bảo là Object, muốn dùng Integer cần cast.
        }
    }

    // 5) Multiple bounds
    static class Bounded<T extends Number & Comparable<T>> {
        private final T value;
        Bounded(T value) { this.value = value; }
        boolean isGreaterThan(T other) { return value.compareTo(other) > 0; }
    }

    // 6) Generic interface + impl
    interface Repository<T> {
        void add(T item);
        T get(int index);
        int size();
    }
    static class MemoryRepository<T> implements Repository<T> {
        private final List<T> storage = new ArrayList<>();
        public void add(T item) { storage.add(item); }
        public T get(int index) { return storage.get(index); }
        public int size() { return storage.size(); }
    }

    // 7) Generic constructor + static generic methods
    static class Printer {
        <T> Printer(T value) { // Generic constructor
            System.out.println("Printer<T> constructed with: " + value + " (" + value.getClass().getSimpleName() + ")");
        }
        public static <U> U echo(U value) { return value; }
        public static <N extends Number> N doubleValue(N n) {
            // Trả về cùng kiểu N? Không an toàn nếu convert. Ta chỉ demo in ra.
            System.out.println("Double of " + n + " is " + (n.doubleValue() * 2));
            return n; // giữ nguyên để type-safe; logic nhân đôi chỉ in ra.
        }
    }

    // 9) Reflection demo: đọc type argument khi subclass đóng type
    static class BaseRepo<T> {
        void printGenericType() {
            Type superType = getClass().getGenericSuperclass();
            if (superType instanceof ParameterizedType) {
                Type[] args = ((ParameterizedType) superType).getActualTypeArguments();
                System.out.println("Detected generic type argument: " + Arrays.toString(args));
            } else {
                System.out.println("No parameterized type info available (likely due to erasure).");
            }
        }
    }
    static class StringRepo extends BaseRepo<String> { /* cố định T = String */ }
}
