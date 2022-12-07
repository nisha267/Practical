package Practical.com.Collection;


import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListUserDefine {
public static void main(String[] args) {
	Bank b=new Bank(12345,"Nisha",40000.00,22);
	Bank b1=new Bank(12345,"Meghna",41000.00,22);
	Bank b2=new Bank(12345,"Rita",43470.00,22);
	Bank b3=new Bank(12345,"Sritama",43400.00,22);
	Bank b4=new Bank(12345,"Namrata",45647.00,22);
	Bank b5=new Bank(12345,"Deba",42367.00,22);
	ArrayList<Bank>a1=new ArrayList<Bank>();
	a1.add(b);
	a1.add(b1);
	a1.add(b2);
	a1.add(b3);
	a1.add(b4);
	a1.add(b5);
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		Bank obj=(Bank)itr.next();
		System.out.println(obj.acNo+" "+obj.CusName+" "+obj.bal+" "+obj.age);
	}
}
}
