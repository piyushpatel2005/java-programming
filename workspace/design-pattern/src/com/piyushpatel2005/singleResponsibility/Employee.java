package com.piyushpatel2005.singleResponsibility;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    // This should not be part of Employee class. It is part of HR department. They can decide but then you need to change Employee class
//    public boolean isPromotionDueThisYear() {
        // promotion logic
//    }

    // It is finance department's reponsibility
//    public double calcIncomeTaxForCurrentYear() {
        // income tax calculation logic
//    }

    // getters and setters
}
