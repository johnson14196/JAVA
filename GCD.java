public class Main 
{
    public static int har(int a, int b) 
    {
        int r;
        while (b != 0) 
        {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        int a[] = {14, 17, 90, 87, 65, 45};
        int gcd = a[0];
        
        for (int i = 1; i < a.length; i++) 
        {
            gcd = har(gcd, a[i]);
        }
        
        System.out.println(gcd);
    }
}
