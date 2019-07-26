package project5;


public abstract class Asfalismenoi {
	
		protected String name;
		protected String afm;
		protected double monthly_amount;
		protected double percentage_tax;

		
		public Asfalismenoi(String name, String afm, double monthly_amount, double percentage_tax) {
			super();
			this.name = name;
			this.afm = afm;
			this.monthly_amount = monthly_amount;
			this.percentage_tax = percentage_tax;
		}

		public String getAfm() {
			return afm;
		}

		public double getPercentage_tax() {
			return percentage_tax;
		}

		public String getName() {
			return name;
		}

		public double getMonthly_amount() {
			return monthly_amount;
		}

		public abstract double CalculateSalary();
		
}