public class Example7a {
    public static void main(String[] args) {
        int a=4;
        System.out.println(a++);
        System.out.println(a);
        
        int b = 3;
        System.out.println(b--);
        System.out.println(b);

        int x=90;
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x);

        int y=80;
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(y);

        int q=5;
        int p=q++ + q++;
        System.out.println(p);

        int r=5;
        int s=r-- + r--;
        System.out.println(s);

        int c=10;
        int d=c++ + c++ + c++;
        System.out.println(d);

        int q1=70;
        int o=q1-- + q1++ + q1++;
        System.out.println(o);

        int b0=13;
        int b1=16;
        int b2=--b0 + ++b1 + --b0 + ++b1;
        System.out.println(b2);


        int y1=15;
        int y2=--y1 + y1--;
    }
}
