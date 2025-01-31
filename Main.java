import java.util.Arrays;
import java.util.Scanner;

public class Main {
    

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number!");
    int alength = scanner.nextInt();
    int[] list = new int[alength];

    for(int i = 0; i < alength; i++ ){
        System.out.println("Enter another number");
        list[i] = scanner.nextInt();
    }
    scanner.close();
    list = reverser(list);
    System.out.println(Arrays.toString(list));
}

public static int[] reverser(int[] xyz){
    int placeholder = 0;
    for(int a = 0; a < (xyz.length / 2); a++){
        placeholder = xyz[a];
        xyz[a] = xyz[xyz.length - a - 1];
        xyz[xyz.length - a - 1] = placeholder;
    }
    return xyz;
}











}
