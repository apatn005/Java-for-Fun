public class Personal
{//Personal
    String name;
    int pan,acc_no;
    int basic_pay;

    Personal(String name,int pan,int acc_no,int basic_pay)
    {//constructor
        this.name=name;
        this.pan=pan;
        this.acc_no=acc_no;
        this.basic_pay=basic_pay;
    }//constructor
    public void display()
    {//display
        System.out.println("Name of employee: "+ name);
        System.out.println("Account Number: "+ pan);
        System.out.println("Bank Account Number: "+ acc_no);
        System.out.println("Basic Salary: "+ basic_pay);
    }//display
}//Personal
