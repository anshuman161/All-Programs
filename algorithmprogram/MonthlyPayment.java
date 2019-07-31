package com.bridgelabz.algorithmprogram;

public class MonthlyPayment
{
	
	/*
	 * 13. Write a Util Static Function to calculate monthlyPayment that reads in
	 * three command-line arguments P, Y, and R and calculates the monthly payments
	 * you would have to make over Y years to pay off a P principal loan amount at R
	 * per cent interest compounded monthly. The formula is The formula is
	 */
 
public static void pay() 
{
	double payment;
    double principal_loan_amount =MyUtil.scannerforinteger();
    double P=principal_loan_amount;
    double years=MyUtil.scannerforinteger();
    double Y=years;
    double per_cent_interest=MyUtil.scannerforinteger();
    double R=per_cent_interest;
    
    
    double n=12 * Y;
    
    double r=R/(12 * 100);
    
    payment= (P * r)/1-Math.pow(1+r, -n);
    
    System.out.println("calculate monthly Payment= "+payment);	
}


  public static void main(String[] args) 
  {
	     pay();
}
}