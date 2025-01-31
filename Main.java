import java.util.Arrays;
import java.util.Scanner;

public class Main {
    

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); //user input for array length
    System.out.println("Enter a number!");
    int alength = scanner.nextInt();
    int[] list = new int[alength];

    for(int i = 0; i < alength; i++ ){ //user input for array valyes
        System.out.println("Enter another number");
        list[i] = scanner.nextInt();
    }
    scanner.close();
    list = reverser(list); //set's arrays values to the reversed version
    System.out.println(Arrays.toString(list));  //tostring so the actual values print instead of the memory address
}

public static int[] reverser(int[] xyz){ //swaps values based on index with the use of a placeholder int
    int placeholder = 0;
    for(int a = 0; a < (xyz.length / 2); a++){
        placeholder = xyz[a];
        xyz[a] = xyz[xyz.length - a - 1]; 
        xyz[xyz.length - a - 1] = placeholder;
    }
    return xyz;
}











}
