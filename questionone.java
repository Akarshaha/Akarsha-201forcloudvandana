import java.util.Random;
public class questionone{
public static void main(String [] args){
int[] digits = new int[] {1,2,3,4,5,6,7};
shuffling(digits);
for(int i :digits){
System.out.print(i +" ");
}
}
public static void shuffling(int[] digits){
Random random = new Random();
random.nextInt();
for(int i=0; i < digits.length; i++){
int q = i + random.nextInt(digits.length-i);
swap(digits,i,q);
}
}
private static void swap(int[] digit, int i, int q){
int temp = digit[i];
digit[i]=digit[q];
digit[q]=temp;
}
}