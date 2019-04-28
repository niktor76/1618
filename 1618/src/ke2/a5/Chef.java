package ke2.a5;

public class Chef {
	private String naechsterTermin;

	String getNaechsterTermin() {
		return naechsterTermin;
	}

	private void setNaechsterTermin(String termin) {
		naechsterTermin = termin;
	}

	class ChefSekretaerin {
		void setChefsNaechsterTermin(String termin) {
			Chef.this.naechsterTermin = termin;
		}
	}

	static class BudgetContainer {
		private int budget;

		BudgetContainer(int budget) {
			this.budget = budget;
		}

		int getBudget() {
			return budget;
		}
	}
}
