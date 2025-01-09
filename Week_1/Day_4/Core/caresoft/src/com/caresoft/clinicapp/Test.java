package com.caresoft.clinicapp;

public class Test {
	public static void main(String[] args) {
		// .. Main method setup ... //
        Physician doctor10 = new Physician(1,7);
        AdminUser roseTyler = new AdminUser(2,5,8, "Companion");
        AdminUser donnaNoble = new AdminUser(3,2,1, "Companion");
        
        
        // Physician Implementation Tests
        System.out.println("\n========== Physician Tests ==========\n");
        String pinTest1 = doctor10.assignPin(42)? "FAIL" : "PASS";
        System.out.printf("Physician pin assign test 1: %s\n", pinTest1);
        
        String pinTest2 = doctor10.assignPin(4000)? "PASS" : "FAIL";
        System.out.printf("Physician pin assign test 2: %s\n", pinTest2);
        
        String authTest1 = doctor10.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Physician auth test 1: %s\n", authTest1);
        
        String authTest2 = doctor10.accessAuthorized(1)? "PASS" : "FAIL";
        System.out.printf("Physician auth test 2: %s\n", authTest2);
        
        // AdminUser Implementation Tests
        System.out.println("\n========== AdminUser Tests ==========\n");
        String pinTest3 = roseTyler.assignPin(2434)? "FAIL" : "PASS";
        System.out.printf("Admin pin assign test 1: %s\n", pinTest3);
        
        String pinTest4 = roseTyler.assignPin(5851)? "PASS" : "FAIL";
        System.out.printf("Admin pin assign test 2: %s\n", pinTest4);
        
        String authTest3 = roseTyler.accessAuthorized(3434)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest3);
        
        String authTest4 = roseTyler.accessAuthorized(64646)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest4);
        
        String authTest5 = roseTyler.accessAuthorized(3333)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 2: %s\n\n", authTest5);
        
        donnaNoble.accessAuthorized(62);
        donnaNoble.accessAuthorized(822);
        donnaNoble.accessAuthorized(777);
        donnaNoble.accessAuthorized(99);
        
        System.out.println(donnaNoble.reportSecurityIncidents());
	}
}
