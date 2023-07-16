import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int A = sc.nextInt();
        System.out.println(checkOccurence(array,A));
    }
    public static int checkOccurence(int array[],int A)
    {
        int count = 0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i] == A)
            {
                count++;
            }
        }
        return count;
}
}