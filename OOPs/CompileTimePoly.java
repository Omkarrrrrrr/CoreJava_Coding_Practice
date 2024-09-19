package OOPs;

class MathCalculator{
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        MathCalculator MC = new MathCalculator();
        System.out.println(MC.add(45, 50));
        System.out.println(MC.add(34, 56, 70));
    }
    
}
