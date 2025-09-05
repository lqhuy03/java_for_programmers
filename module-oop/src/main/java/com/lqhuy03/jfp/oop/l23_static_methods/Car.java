package com.lqhuy03.jfp.oop.l23_static_methods;

interface Vehicle {
    static void cleanVehicle() {
        System.out.println("Cleaning vehicle...");
    }
}

class Car implements Vehicle {
    public static void main(String[] args) {
        Car car = new Car();

        // Cách đúng
        Vehicle.cleanVehicle(); // ✅ In ra: Cleaning vehicle...

        // Cách sai
        // car.cleanVehicle(); // ❌ Lỗi compile: không gọi được qua object
    }
}
