import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class SHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(s.getBytes());
            BigInteger n = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(n.toString(16));
            while(hexString.length() < 64){
                hexString.insert(0, '0');
            }
            System.out.println(hexString.toString());
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}
