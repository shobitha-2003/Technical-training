import java.util.Scanner;
public class sameDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(sameDigits(arr));

    }
    public static boolean sameDigits(int arr[])
    {
       int dig=count(arr[0]); 
       int c =0;
       for(int i=1;i<arr.length;i++){
        c=count(arr[i]);
        if(dig!=c)
        return false;
       }
       return true;
      }
      static int count(int n){
        int d=0;
        while(n>0){
            d++;
            n=n/10;
        }
        return d;
          }


}
