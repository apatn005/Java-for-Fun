class Retire extends Personal
{//Retire
    int years,pf,grat;

    Retire(String name,int pan,int acc_no,int basic_pay,int years)
    {//constructor
        super(name,pan,acc_no,basic_pay);
        this.years=years;

    }//constructor
    public void provident()
    {//provident
        pf=(int)(basic_pay*0.02*years);
    }//provident
    public void gratuity()
    {//gratuity
        if (years>=10)
        {//if
            grat=12*basic_pay;
        }
        grat=0;
    }//gratuity
    public void print()
    {//print
        super.display();
        System.out.println("Years of Service"+ years);
        System.out.println("PF amount"+ pf);
        System.out.println("Gratuity"+ grat);
    }//print
}//Retire
