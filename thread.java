public class ThreadSample implements Runnable
{
public void run()
{
try
{
for (int i = 5; i > 0; i--)
{
System.out.println("Child Thread" + i);
Thread.sleep(1000);
}
}
catch (InterruptedException e)
{
System.out.println("Child interrupted");
}
System.out.println("Exiting Child Thread");
}
}
public class MainThread1
{
public static void main(String[] arg)
{
ThreadSample d = new ThreadSample();
Thread s = new Thread(d);
s.start();
try
{
for (int i = 5; i > 0; i--)
{
System.out.println("Main Thread" + i);
Thread.sleep(5000);
}
}
catch (InterruptedException e)
{
System.out.println("Main interrupted");
}
System.out.println("Exiting Main Thread");
}}