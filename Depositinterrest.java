import java.text.NumberFormat;
import java.util.Scanner;

public class Depositinterrest {
	Scanner sc = new Scanner(System.in);
			double	deposit =0;
			double interest = 0; 
			double jan = 0;
	public static void main(String[] args) {					
			Depositinterrest depo = new Depositinterrest();
			depo.input();
			depo.showdata();		
	}
			public void input() {				
				System.out.print("Please Input Your Lastyear Deposit : ");
				deposit = sc.nextDouble();
				System.out.print("Please Input interest : ");
				 interest = sc.nextDouble();
				System.out.print("Please Input Your Deposit in This Year : ");
				jan = sc.nextDouble();				
			}			
			public void showdata() {
				System.out.println("Interest : "+ interest);					
				System.out.println("Base Divide  : " + DepositInt());
				System.out.println("In Year Divide  : "+ iyd());
				System.out.println("Cooperate Divide This Year  : "+(DepositInt()+iyd()));
			}			
			double DepositInt() {
				double deposin = deposit*(interest/100);
				return deposin;
			}
			double iyd() {
				double inyd = January()+Feburary()+March()+April()+May()+June()+July()+August()+September()+October()+November()+December(); 
				return inyd ; 
			}
			double January() {			 
			double dejan = jan*((interest/100)*9/12);	
				return dejan ;
			}
			double Feburary() {
				 double defeb = jan*((interest/100)*8/12);	
					return defeb ;
				}
			double March() {
				 double demar = jan*((interest/100)*7/12);	
					return demar ;
				}
			double April() {
				 double deapr = jan*((interest/100)*6/12);	
					return deapr ;
				}
			double May() {
				 double demay = jan*((interest/100)*5/12);	
					return demay ;
				}
			double June() {
				 double dejun = jan*((interest/100)*4/12);	
					return dejun ;
				}
			double July() {
				 double dejul = jan*((interest/100)*3/12);	
					return dejul ;
				}
			double August() {
				 double deaug = jan*((interest/100)*2/12);	
					return deaug ;
				}
			double September() {
				 double desep = jan*((interest/100)*1/12);	
					return desep ;
				}
			double October() {
				 double deoct = jan*((interest/100)*0/12);	
					return deoct ;
				}
			double November() {
				 double denov = jan*((interest/100)*11/12);	
					return denov ;
				}
			double December() {
				 double dedec = jan*((interest/100)*10/12);	
					return dedec ;
				}
}
