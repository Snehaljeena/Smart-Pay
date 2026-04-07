package bill;
import model.Customer;
//Represents Bill Calculation logic

public class UtilityBillCalculator implements Billable{

    public static final double LOW_RATE=1.00;
    public static final double MEDIUM_RATE=2.00;
    public static final double HIGH_RATE=5.00;

    @Override
    public double calculateTotal(int units){

        double total=0;
        if(units<=100)
        {
            total=units*LOW_RATE;
        }
        else if(units<=300)
        {
            total=(100*LOW_RATE)+((units-100)*MEDIUM_RATE);
        }
        else
        {
            total=(100*LOW_RATE)+(200*MEDIUM_RATE)+((units-300)*HIGH_RATE);
        }
        return total;
    }

    public void billGenerator(Customer customer)
    {
        int units=customer.getConsumedUnits();
        if(units<0)
        {
            System.out.println("Error: Previous Meter Reading is higher than Current Meter Reading\n");
            return;
        }
        double totalTax=calculateTotal(units);

        //Digital Receipt

        System.out.println("\n      SmartPay Digital Receipt      ");
        System.out.println("Customer Name  : " + customer.getName());
        System.out.println("Units Consumed : " + units);
        System.out.println("Tax Amount     : $" + totalTax);
        System.out.println("Final Total    : $" + totalTax);
        System.out.println("\n");
    }


   
}
