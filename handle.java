// import java.io.IOException;

// public class handle {
//     public static void main(String[] args) {
//         try {
//             int result ;
//         } 
//         catch (IOException) {
//             System.out.println("not divide");

//         }
//     }
// }
public class handle {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}