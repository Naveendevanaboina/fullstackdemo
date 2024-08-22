package com.neoteric.fullstackdemo.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionService {
    Supplier<Employee> employeeSupplier =() -> new Employee("Naveen ","kumar ","22");

Supplier<Car> carSupplier =() -> new Car("Nissan"," Leaf");


    Supplier<String> nameSuppler = () ->{
        return "neoteric";
    };
        Supplier<String>   nameSupplerLamda = () -> "neoteric";





    public String nameUpperCaseWithFunctionParam(
            Function<String,String>upper,String name){
        return upper.apply(name);

    };


    Function<String, String> nameUpperCaseFunct = (name) -> {
        return name.toUpperCase();
    };

BiFunction<String,String,String> biFunctionConcatFunc =(fName,lName) ->{
    return fName.concat(lName);
};



    public String nameUpperCase(String name) {
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        String upperCaseName = functionService.nameUpperCase("neoteric");

        System.out.println("out put from method" +upperCaseName);
        String upperCaseFunctionOut = functionService.nameUpperCaseFunct.apply( "neoteric");


                System.out.println("form function" +upperCaseName);

String biFunctionConcatFunc =functionService.biFunctionConcatFunc.apply("neoteric","demo");
System.out.println("Function" + biFunctionConcatFunc);


String UpperCasesUsingFunctionAsParam = functionService.nameUpperCaseWithFunctionParam(
        functionService.nameUpperCaseFunct,"neotric");
System.out.println("output"+ upperCaseName);

String type= functionService.nameSupplerLamda.get();
System.out.println("output" +type);



Employee employee=functionService.employeeSupplier.get();
System.out.println("output " + employee.getFirstName()+employee.getLastName()+employee.getAge());


Car car=functionService.carSupplier.get();
System.out.println("output " +car.getBrandName()+car.getModelName() );




    }



}