import java.util.Scanner;
public class Task17{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value for String");
        String s=sc.nextLine();
        System.out.println("enter value for character");
        String k =sc.nextLine();
        char [] ch=k.toCharArray();
        MyString s1= new MyString(s);
        System.out.println(s1.indexOf(ch[0]));
    }
}
       