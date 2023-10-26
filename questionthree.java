import java.util.Scanner;
public class questionthree{
public static void main(String[] args){
Scanner Scn = new Scanner(System.in);
System.out.println("enter a string");
String R = Scn.next();
System.out.println(ispanagram(R.toLowerCase()));
}
private static boolean ispanagram(String R){
if(R.length()<26){
return false;
}else{
for(char ch ='a';ch<'z';ch++){
if(R.indexOf(ch) < 0){
return false;
}
}
}
return true;
}
}