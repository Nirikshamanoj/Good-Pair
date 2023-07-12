import java.util.Scanner;
public class GoodPair {
    static int goodPair(int[] array,int k)
    {
        int result=0;
        for(int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if(array[i]+array[j]==k)
                    result=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        int check=goodPair(A,B);
        System.out.println(check);

    }
}
