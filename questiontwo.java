import java.util.Scanner;
import java.io.*;
public class questiontwo{
int value(char r){
if(r == 'I')
 return 1;
if(r == 'V')
 return 5;
if(r == 'X')
 return 10;
if(r == 'L')
 return 50;
if(r == 'C')
 return 100;
if(r == 'D')
 return 500;
if(r == 'M')
 return 1000;
 return -1;
}
int convertromtoint(String S){
int sum = 0;
for(int i=0;i<S.length();i++){
int s1 = value(S.charAt(i));
if(i+1<S.length()){
int s2 = value(S.charAt(i+1));
if(s1>=s2)
{
sum = sum +s1;
}
else{
sum = sum -s1;
}
}
else{
 sum = sum + s1;
}
}
return sum;
}
public static void main(String[] args){
Scanner Scn = new Scanner(System.in);
System.out.println("enter a roman numeral");
String R =Scn.next();
questiontwo A = new questiontwo();
System.out.println(A.convertromtoint(R));
}
}

 