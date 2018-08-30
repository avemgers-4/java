class Test
{
Test()
{
System.out.println("Address:" +this);
System.out.println("Address:" +this.hashCode());

}
public static void main(String [] args)
{
new Test();
}
}