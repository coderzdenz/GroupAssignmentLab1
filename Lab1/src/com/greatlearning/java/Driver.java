package com.greatlearning.java;

public class Driver {

	public static void main(String[] args) {
        AdminDepartment admin = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();

        // Display functionalities of Admin Department
        System.out.println(admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        
        System.out.println();

        // Display functionalities of HR Department
        System.out.println(hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.doActivity());
        System.out.println(hr.isTodayAHoliday());
        
        System.out.println();

        // Display functionalities of Tech Department
        System.out.println(tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
    }
}
