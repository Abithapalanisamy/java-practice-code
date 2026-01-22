class Activity1
{
    public static void main (String[] args)
    {
        double principle = 100000;
        double rate = 11.5;
        int tenure = 2;
        double si = (principle*rate*tenure)/100;
        System.out.println("simple Interest is "+si);

        System.out.println("Total Repayment is"+(si+principle));
        System.out.println("EMI is "+(tenure/(tenure*12)));


    }
}