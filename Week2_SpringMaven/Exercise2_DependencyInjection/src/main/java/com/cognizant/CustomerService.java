package com.cognizant;
class CustomerRepository {
    void show(){ System.out.println("Customer Repository Called"); }
}
public class CustomerService {
    public static void main(String[] args){
        CustomerRepository repo = new CustomerRepository();
        repo.show();
        System.out.println("Customer Service Called");
    }
}