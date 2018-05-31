class DisplayOverloading2
{
    public void disp(int c)
    {
        System.out.println(c);
    }
    public void disp(int c, int e)
    {
       System.out.println(" "+c + " " +e );
    }
}

class Sample2
{
    public static void main(String args[])
    {
        DisplayOverloading2 obj = new DisplayOverloading2();
        obj.disp('c', 'd');
        
    }
}