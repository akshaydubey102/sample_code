import java.util.Scanner;
class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int len = findLen(x);
        int sum= 0;
        int temp = x;
        int rem = 0;
        while(temp!=0){
           rem = temp%10;
           sum = sum + (int)Math.pow(rem,len);
           temp = temp/10;
        }
        if(x==sum){
            System.out.println("the number is a arstrong number");
        }

    }
    static int findLen(int n){
        int len = 0;
        while(n!=0){
            n=n/10;
            len++;
        }
        return len;
    }
    
}
