
package edu.farmingdale.cscs325_f22_demo;

public class NewClass {
    
    private void sayHello(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.sayHello("Hello World");
    }
}