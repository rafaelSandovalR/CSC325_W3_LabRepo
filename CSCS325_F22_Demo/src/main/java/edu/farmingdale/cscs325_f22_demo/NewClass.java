
package edu.farmingdale.cscs325_f22_demo;

public class NewClass {
    
    private static void sayHello(String str){
        System.out.println(str);
    }
    
    private static void sayHello(String str, int qty){
       while(qty > 0){
           System.out.println(str);
           qty--;
       }
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.sayHello("Hello World");
        
        sayHello("Hey", 5);
        
    }
    
}

class Class2{
    public Class2(){
        
    }
    public Class2(int x){
        
    }
}