/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SonarTesting;

public class Library {
    public static void main(String args[]){
        int a=5;
        int b=10;
        Library l=new Library();
        l.sum(a, b);
      
        System.out.println(a+b );
    }
    public int sum(int a,int b){
       return a+b;
    }
}
