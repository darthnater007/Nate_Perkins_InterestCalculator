import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class InterestCalculator {

	public static void main(String[] args) 
	{
		//formatting currency and percentages
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		currency.setMaximumFractionDigits(2);
		
		//welcome
		System.out.println("\nWelcome to the Interest Calculator App\n\n");
		
		Scanner sc =  new Scanner(System.in);
		
		String choice = "Y";
		
		//meat of the app
		while(choice.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter your loan amount: ");
			double loanAmount = sc.nextDouble();
			System.out.println();
			
			System.out.print("Enter your interest rate as a decimal: ");
			double interestRate = sc.nextDouble();
			
			System.out.println("\nLoan Amount: " + currency.format(loanAmount));
			System.out.println("Interest Rate:  " + percent.format(interestRate));
			//calculate Interest
			BigDecimal InterestAmount = new BigDecimal(loanAmount*interestRate);
			
			System.out.println("Interest Amount: " + currency.format(InterestAmount.doubleValue()));
			
			System.out.print("Continue? y/n: ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("\nOkay now, bye bye then.");
	}

}
