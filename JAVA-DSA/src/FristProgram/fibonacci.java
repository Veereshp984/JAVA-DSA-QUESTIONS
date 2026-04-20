package FristProgram;

public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=2;i<=n;i++){
            int next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
        }
    }
}
