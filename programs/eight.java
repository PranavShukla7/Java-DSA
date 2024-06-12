import java.util.Arrays;

public class eight {
    //varargs
    public static void main(String[] args) {
        meth(2,4,5,67);
    }

     static void meth(int...v) {
         System.out.println(Arrays.toString(v));
    }

}

