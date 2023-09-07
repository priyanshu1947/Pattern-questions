import java.util.*;
public class aliceapple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        int cnt =0,sum=0;
        while (sum<apple)
        {
            cnt++;
            sum=sum+(12*cnt*cnt);
        }
        System.out.println(8*(cnt));



    }
}
