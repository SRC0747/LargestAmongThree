public class LargestNumber {

    public static void main(String[] args)
    {
        int a=20;
        int b=30;
        int c=45;
        if (a>b && a>c)
            System.out.println("Largest number:"+a);
        if (b>a && b>c)
            System.out.println("Largest number:"+b);
        if (c>a && c>b)
            System.out.println("Largest number:"+c);
    }
}
