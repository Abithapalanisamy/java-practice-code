public class Example7b {
    public static void main(String[] args) {
        int y=3;
        int z=y-- + y-- + y--;
        System.out.println(z);

        int x=5;
        int u=--x;
        System.out.println(u);

        int h=8;
        int i=++h;
        System.out.println(i);

        int d=12;
        System.out.println(++d);
        System.out.println(++d);
        System.out.println(d);

        int c=16;
        System.out.println(--c);
        System.out.println(--c);
        System.out.println(c);

        int k=11;
        int l=++k + ++k;
        System.out.println(l);

        int m = 19;
        int n = --m + --m;
        System.out.println(n);

        int m1 = 14;
        int m2 = ++m1 + ++m1 + ++m1;
        System.out.println(m2);

        int n1 = 13;
        int n2 = --n1 + --n1 + --n1;
        System.out.println(n2);

        int p1=10;
        int p2=12;
        int p3=p1-- + p2++ + p1++ + p2--;
        System.out.println(p3);

    }
}
