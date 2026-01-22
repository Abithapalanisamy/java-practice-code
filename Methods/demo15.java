public class demo15 {
    static void play(int a)
    {
        System.err.print(a+" ");
        if(a>1)
        {
            a--;
            play(a);
        }
    }
    public static void main(String[] args) {
        play(5);
    }
}
