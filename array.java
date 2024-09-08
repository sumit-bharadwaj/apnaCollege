import java.util.Scanner;

public class array{
    public static int linearSearch(int numbers[] , int key){
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        Scanner input = new Scanner(System.in);
        System.out.println("enter your numbers under 2,4,6,8,10,12,14,16 ");
        int num = input.nextInt();
        int index = linearSearch(numbers, num);
        if(index==-1){
            System.out.println("not found");
        }else{System.out.println("key is at index:"+index);}
     }
}
