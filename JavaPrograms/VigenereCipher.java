import java.util.Scanner;
public class VigenereCipher
{
    public static String encrypt(String txt, final String key)
    {
        String r = "";
        txt = txt.toUpperCase();
        for (int i = 0, j = 0; i < txt.length(); i++)
        {
            char c = txt.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            r += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return r;
    }
 
    public static String decrypt(String txt, final String key)
    {
        String r = "";
        txt = txt.toUpperCase();
        for (int i = 0, j = 0; i < txt.length(); i++)
        {
            char c = txt.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            r += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return r;
    }
 
    public static void main(String[] args)
    {
        String key,message;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key:");
        key = sc.nextLine().toUpperCase();
        System.out.print("Enter Message:");
        message = sc.nextLine().toUpperCase();
        String encryptedMsg = encrypt(message, key);
        //System.out.println("String: " + message);
        System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
    }
}
