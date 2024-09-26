public class StringBufferExample {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Java");
        //Append text
        sb.append(" Practice");
        System.out.println(sb);

        //Insert text at 6 index
        sb.insert(5, "Programming ");
        System.out.println(sb);

        //Replace text from index (18 to 25)
        sb.replace(17, 25, "Course");
        System.out.println(sb);

        //Delete chars from index 0 to 3
        sb.delete(6, 17);
        System.out.println(sb);

        //Reverse the strings
        sb.reverse();
        System.out.println(sb);
    }
    
}
