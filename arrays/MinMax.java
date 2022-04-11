import java.util.Scanner;
public class MinMax {

    



    public void option(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Select the Option\n 1) Assinding \n 2) Descinding");
        int opti = sc.nextInt();
        switch(opti){
            case 1: min();
            break;
            case 2: max();
        }
    }
  



    public void min(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the array length");
        int len;
        len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the list of numbers");
        
        for(int i = 0; i<len; i++){
            arr[i] = sc.nextInt();
        }
       
        int inpNum = arr[0];
        for (int j = 0; j < len; j++) {
            if (inpNum > arr[j]) {
                inpNum = arr[j];
            }
        }
        System.out.println("the smaller number in array  :  " + inpNum);
    }






    public void max(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the array length");
        int len;
        len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the list of numbers");

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int inpNum = arr[0];
        for (int j = 0; j < len; j++) {
            if (inpNum < arr[j]) {
                inpNum = arr[j];
            }
        }
        System.out.println("the smaller number in array  :  " + inpNum);

    }



    

    public static void main(String[] args) {
        MinMax obj = new MinMax();
        obj.option();
       
        
    }
}
