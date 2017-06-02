package constructors;
class Account{
	String accno;
	String accname;
	String acctype;
	Account(String accno1,String accname1,String acctype1){
		accno  =accno1;
		accname=accname1;
		acctype=acctype1;
      }
	public void getAccountdetails(){
		System.out.println("Account details");
		System.out.println("-----------------------");
		System.out.println("account number="+accno);
		System.out.println("account name  ="+accname);
	    System.out.println("account type  ="+acctype);
	   }
}
public class test {
	 public static void main(String[] args) {
		 Account acc1=new Account("416","mallika","hyd");
		 acc1.getAccountdetails();
		 Account acc2=new Account("455","gayathri","hyd");
		 acc2.getAccountdetails();
		 Account acc3=new Account("441","anusha","mcl");
		 acc3.getAccountdetails();
	}
}
	

