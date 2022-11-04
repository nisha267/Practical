package lab;
class Studentmain{//main class
	//declaring
	int student_no;
	String name,mail,address;
	double fees;
	static double increasedFees;
	Studentmain(int sn,String name,String mail,String address){
		this.student_no=sn;
		this.name=name;
		this.mail=mail;
		this.address=address;}
	//method for initializing fees to student
	void fees(double f ) 
	{
		fees=f;//assigning passing value
		
	}
	//method for printing output
	void display() //for concatenation and sop output
	{
		this.fees=this.fees+increasedFees;//updating fees before printing
		System.out.println("ID_"+this.student_no+"   Name-"+this.name+"   Mail-"+this.mail+"    Adress-"+this.address);
	}
	static void increasefees(int n,double f) {
		if(f<2000) {//condition
			f=10*f/100;//logic for increasing fees
			increasedFees=f;
		}
	}

	public static void main(String[] args) {
		Studentmain[]student=new Studentmain[5];
		 student[0]=new Studentmain(101,"Rita","rita345@gmail.com","Bihar");
		 student[1]=new Studentmain(102,"Sita","Sita378@gmail.com","west Bengal");
		 student[2]=new Studentmain(103,"Ratna","ratna945@gmail.com","Jharkhand");
		 student[3]=new Studentmain(104,"Rita","rita345@gmail.com","Meghalaya");
		 student[4]=new Studentmain(105,"Ram","ram376@gmail.com","Delhi");
		 student[0].fees(1064);
		 student[1].fees(2056);
		 student[2].fees(957);
		 student[3].fees(1999);
		 student[4].fees(2001);
		increasefees(100,1064);
		increasefees(102,957);
		increasefees(103,1999);
System.out.println("_________Details of the students___________");
for(Studentmain i:student) {
	i.display();
}}}
