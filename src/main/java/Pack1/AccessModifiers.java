package Pack1;

public class AccessModifiers
{
        public int a = 10;
        private int b = 30;
        protected int c = 60;
        int d = 40;
    public static void main(String[] args)
    {
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);


}
}
