package com.company;

import java.util.Scanner;

class Vehicle{               //Superclass or parent class
    String color;
    String Model;
    int duration;
    int slots;
}
class Bike extends Vehicle{                
    private int UniqueTokenNo;
    private String ownerName;
    private String vehicleNumber;


    static class Bikeslot{
        static int x;

    }

    public void settoken(int x)
    {
        this.UniqueTokenNo=x;
    }
    public void setOwnerName(String s)
    {
        this.ownerName=s;
    }
    public void setVehicleNumber(String x)
    {
        this.vehicleNumber=x;
    }

    public void printall(){
        System.out.println("**************************** Reciept *****************************************************");
        System.out.println("The unique token is :" + this.UniqueTokenNo);
        System.out.println("Owner Name : "+ this.ownerName );
        System.out.println("Vehicle Number is :"+ this.vehicleNumber);
        System.out.println("Vehicle Model is :" + this.Model);
        System.out.println("The Amount to be paid is :" +(this.duration*10));
        System.out.println("");
        System.out.println("******* Thank You ************");


    }
}
class Car extends Vehicle{
    private int UniqueTokenNo;
    private String ownerName;
    private String vehicleNumber;

    public void settoken(int x)
    {
        this.UniqueTokenNo=x;
    }
    public void setOwnerName(String s)
    {
        this.ownerName=s;
    }
    public void setVehicleNumber(String x)
    {
        this.vehicleNumber=x;
    }

    public void printall(){
        System.out.println("**************************** Reciept *****************************************************");
        System.out.println("The unique token is :" + this.UniqueTokenNo);
        System.out.println("Owner Name : "+ this.ownerName );
        System.out.println("Vehicle Number is :"+ this.vehicleNumber);
        System.out.println("Vehicle Model is :" + this.Model);
        System.out.println("The Amount to be paid is :" +(this.duration*50));
        System.out.println("");
        System.out.println("******* Thank You ************");


    }
}

class Cycle extends Vehicle{
    private int UniqueTokenNo;
    private String ownerName;
    private String vehicleNumber;

    public void settoken(int x)
    {
        this.UniqueTokenNo=x;
    }
    public void setOwnerName(String s)
    {
        this.ownerName=s;
    }
    public void setVehicleNumber(String x)
    {
        this.vehicleNumber=x;
    }


    static class Cysloeslot{
       static  int slot=5;
    }




    public void printall(){
        System.out.println("**************************** Reciept *****************************************************");
        System.out.println("The unique token is :" + this.UniqueTokenNo);
        System.out.println("Owner Name : "+ this.ownerName );
        System.out.println("Vehicle Number is :"+ this.vehicleNumber);
        System.out.println("Vehicle Model is :" + this.Model);
        System.out.println("The Amount to be paid is :" +(this.duration*5));
        System.out.println("");
        System.out.println("******* Thank You ************");


    }

}
class Truck extends Vehicle{
    private int UniqueTokenNo;
    private String ownerName;
    private String vehicleNumber;


    static class Bikeslot{
        static int x;

    }

    public void settoken(int x)
    {
        this.UniqueTokenNo=x;
    }
    public void setOwnerName(String s)
    {
        this.ownerName=s;
    }
    public void setVehicleNumber(String x)
    {
        this.vehicleNumber=x;
    }

    public void printall(){
        System.out.println("**************************** Reciept *****************************************************");
        System.out.println("The unique token is :" + this.UniqueTokenNo);
        System.out.println("Owner Name : "+ this.ownerName );
        System.out.println("Vehicle Number is :"+ this.vehicleNumber);
        System.out.println("Vehicle Model is :" + this.Model);
        System.out.println("The Amount to be paid is :" +(this.duration*10));
        System.out.println("");
        System.out.println("******* Thank You ************");


    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("**********************    Welcome To Advanced Parking System     *************************");
        System.out.println(" ");
        System.out.println("**********************  Parking Rates    **************************");
        System.out.println(" ");
        System.out.println("Vehicles        Rate");
        System.out.println("Bike            10Rs/hr");
        System.out.println("Car             50Rs/hr");
        System.out.println("Cycle           5Rs/hr ");
        System.out.println("Truck           100Rs/hr");
        System.out.println(" ");
        System.out.println(" ");





        System.out.println("Press 1 for the Bike");
        System.out.println("Press 2 for the Car");
        System.out.println("Press 3  for the Cycle");
        System.out.println("Press 4 for the Truck");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();



        switch (x){
            case 1:

                        Bike f = new Bike();
                        System.out.println("Enter the Token No.");
                        int tokenbike = sc.nextInt();
                        f.settoken(tokenbike);
                        System.out.println("Enter the Owner Name");
                        String p = sc.next();
                        f.setOwnerName(p);
                        System.out.println("Enter the Vehicle Number");
                        String q = sc.next();
                        f.setVehicleNumber(q);
                        System.out.println("");
                        System.out.println("Enter the duration in hrs");
                        int bikeduration = sc.nextInt();
                        f.duration = bikeduration;
                        System.out.println(" ");
                        System.out.println("Enter the Model of Vehicle");
                        String modelbike = sc.next();
                        f.Model = modelbike;
                        System.out.println("");
                        System.out.println(" ");
                        f.printall();
                        Bike.Bikeslot.x--;

                        break;



            case 2:

                Car b = new Car();
                System.out.println("Enter the Token No.");
                int y = sc.nextInt();
                b.settoken(y);
                System.out.println("Enter the Owner Name");
                String carowner = sc.next();
                b.setOwnerName(carowner);
                System.out.println("Enter the Vehicle Number");
                String carnumber = sc.next();
                b.setVehicleNumber(carnumber);
                System.out.println("");
                System.out.println("Enter the duration in hrs");
                int d = sc.nextInt();
                b.duration = d;
                System.out.println(" ");
                System.out.println("Enter the Model of Vehicle");
                String m = sc.next();
                b.Model = m;
                System.out.println("");
                System.out.println(" ");
                b.printall();


                break;








            case 3:

                    Cycle cy = new Cycle();
                    System.out.println("Enter the Token No.");
                    int a = sc.nextInt();
                    cy.settoken(a);
                    System.out.println("Enter the Owner Name");
                    String v = sc.next();
                    cy.setOwnerName(v);
                    System.out.println("Enter the Vehicle Number");
                    String r = sc.next();
                    cy.setVehicleNumber(r);
                    System.out.println("");
                    System.out.println("Enter the duration in hrs");
                    int z = sc.nextInt();
                    cy.duration = z;
                    System.out.println(" ");
                    System.out.println("Enter the Model of Vehicle");
                    String o = sc.next();
                    cy.Model = o;
                    System.out.println("");
                    System.out.println(" ");
                    cy.printall();
                    break;




            case 4:

                Truck t = new Truck();
                System.out.println("Enter the Token No.");
                int trucktoken = sc.nextInt();
                t.settoken(trucktoken);
                System.out.println("Enter the Owner Name");
                String truckowner = sc.next();
                t.setOwnerName(truckowner);
                System.out.println("Enter the Vehicle Number");
                String truckno = sc.next();
                t.setVehicleNumber(truckno);
                System.out.println("");
                System.out.println("Enter the duration in hrs");
                int hrs = sc.nextInt();
                t.duration = hrs;
                System.out.println(" ");
                System.out.println("Enter the Model of Vehicle");
                String model = sc.next();
                t.Model = model;
                System.out.println("");
                System.out.println(" ");
                t.printall();
                break;
                default:
                System.out.println("Invalid Response Try Again");
                break;
        }


    }
}
