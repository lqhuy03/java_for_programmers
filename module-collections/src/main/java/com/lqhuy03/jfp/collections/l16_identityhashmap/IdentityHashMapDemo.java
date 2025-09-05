package com.lqhuy03.jfp.collections.l16_identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

class Employee {
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        if (empId != other.empId) return false;
        if (empName == null) {
            return other.empName == null;
        } else return empName.equals(other.empName);
    }

    @Override
    public String toString() {
        return empId + " - " + empName;
    }
}

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "Saurav");
        Employee emp2 = new Employee(123, "Saurav"); // Dữ liệu giống hệt emp1

        // HashMap: so sánh bằng equals()
        Map<Employee, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "emp1");
        hashMap.put(emp2, "emp2");

        // IdentityHashMap: so sánh bằng reference equality (==)
        Map<Employee, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(emp1, "emp1");
        identityHashMap.put(emp2, "emp2");

        System.out.println("HashMap: " + hashMap);
        System.out.println("IdentityHashMap: " + identityHashMap);
    }
}


