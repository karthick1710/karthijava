import java.io.*;
class TelephoneBill
{
  String customerName;
  int callsMade;
  void setData(String V1, int V2)
{
  customerName=V1;
  callsMade=V2;
}
String getCustomerName()
{
return customerName;
}
int getCallsMade()
{
  return callsMade;
}
double computeCost()
{
 double cost;
 cost=1.20*callsMade;
 return cost;
}
}
class TelephoneBillDemo
{
  public static void main(String arg[])
{
TelephoneBill obj =new TelephoneBill();
obj.setData("M.Karthick Kumar",1000);
System.out.println("CustomerName: "+obj.getCustomerName());
System.out.println("Cost:"+obj.computeCost());
}
}