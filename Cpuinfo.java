import java.util.Scanner;
class Cpu
{
int price;
class Processor{
String no_of_cores,manufacturer;

void display(){
System.out.print("processor Manufacturer:"+ manufacturer+"\n");
System.out.print("no of cores of processer:"+ no_of_cores+"\n");
}
}
static class Ram{
int memory;
String manufacturer;
void display(){
System.out.println("Ram memory:"+ memory+"\n");
System.out.println("Ram manufactrer:"+ manufacturer+"\n");
}
}
void display(){
System.out.println("price:"+price);
}
}
public class Cpuinfo{
public static void main(String args[]){
Cpu ncpu=new Cpu();
Cpu.Processor processor=ncpu.new Processor();
Cpu.Ram ram=new Cpu.Ram();
Scanner sc=new Scanner(System.in);
System.out.println("enter the processor manufacturer:");
processor.manufacturer=sc.next();
System.out.println("enter the no of cores of processor:");
processor.no_of_cores=sc.next();
System.out.println("enter the RAM memeory size:");
ram.memory=sc.nextInt();
System.out.println("enter the RAM Manufacturer:");
ram.manufacturer=sc.next();
System.out.println("enter the price:");
ncpu.price=sc.nextInt();
System.out.println("information of processor and RAM:");
processor.display();
ram.display();
ncpu.display();
}
}






