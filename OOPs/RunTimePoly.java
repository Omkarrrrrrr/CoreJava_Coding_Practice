package OOPs;

class Student1{
    public void roll(){
        System.out.println("My role no. is 1");
    }
}

class Student2 extends Student1{
    public void roll(){
        System.out.println("My role no. is 2");
    }
}

class Student3 extends Student1{
    public void roll(){
        System.out.println("My role no. is 3");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {

        Student1 st = new Student2();
        st.roll();

        st = new Student1();
        st.roll();

        st = new Student3();  // Reuse st for second instance                // we can not redeclare any variable but we can reuse it
        st.roll();  // Output: My role no. is 3

       
    }
    
}
