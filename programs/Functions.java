public class Functions {
    public static void main(String[] args) {
        // overloading
        hit(78);
        hit("pranav shukla");
    }

     static void hit(int a) {
         System.out.println(a);
    }
    static void hit(String name) {
        System.out.println(name);
    }
}
