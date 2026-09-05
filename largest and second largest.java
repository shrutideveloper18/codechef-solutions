import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int m1=0;
            int m2=0;
            for(int i=0;i<n;i++){
                if(a[i]>m1){
                    m1=a[i];
                }
            }
            for(int j=0;j<n;j++){
                if(a[j]==m1){
                    continue;
                }
                else if(a[j]>m2){
                    m2=a[j];
                }
            }
            System.out.println(m1+m2);
        }
    }
}
