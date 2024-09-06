

public class Polymorphism {
  public static void main(String[] args) {
      
    Calculator calc =new Calculator();
    
    System.out.println(calc.sum(2,4));
    System.out.println(calc.sum((float)2.4,(float)4.4));
    System.out.println(calc.sum(2,4 , 3));
  }

}

class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;

    }
    int sum(int a, int b, int c){
        return a+b+c;

    }
}