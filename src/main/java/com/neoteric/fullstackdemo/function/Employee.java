package com.neoteric.fullstackdemo.function;

import java.util.function.Supplier;

public class Employee {

private String firstName;
private String lastName;
private String age;
 //con

        public Employee(String firstName,String lastName,String age){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;

            //getter

        }

    public String getFirstName() {
        return this.firstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAge() {
        return this.age;
    }


}
