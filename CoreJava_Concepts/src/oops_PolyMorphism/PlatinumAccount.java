package oops_PolyMorphism;

public class PlatinumAccount extends GoldAccount {
	@Override
	public void onlineBanking() {
		System.out.println("Yes");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("6%");
	}

	@Override
	public void minimumBalance() {
		System.out.println("Rs.50000");
	}

	public static void main(String[] args) {
		System.out.println("Gold Account Features:-");
		GoldAccount G = new GoldAccount();
		System.out.print("OnlineBanking :");
		G.onlineBanking();
		System.out.print("RateOfInterest :");
		G.rateOfInterest();
		System.out.print("MinimumBalance :");
		G.minimumBalance();

		System.out.println(" ");

		System.out.println("Platinum Account Features:-");
		PlatinumAccount P = new PlatinumAccount();
		System.out.print("OnlineBanking :");
		P.onlineBanking();
		System.out.print("RateOfInterest :");
		P.rateOfInterest();
		System.out.print("MinimumBalance :");
		P.minimumBalance();
	}
}