import java.util.Scanner;

public class FlightNumberTrying {

	public static void main(String[] args) {

		int yas, tip;
		double perKm = 0.10, mesafe;
		Scanner input = new Scanner(System.in);

		System.out.print("Mesafe (KM): ");
		mesafe = input.nextDouble();

		System.out.print("Yaş: ");
		yas = input.nextInt();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		tip = input.nextInt();

		if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
			System.out.print("Hatalı veri girişi!");
		}

		double normalTutar = mesafe * perKm;
		double yasİndirimOranı = 0;

		if (yas < 12) {
			yasİndirimOranı = 0.50;
		} else if (yas >= 12 && yas < 24) {
			yasİndirimOranı = 0.10;
		} else if (yas > 65) {
			yasİndirimOranı = 0.30;
		}

		double yasİndirimi = normalTutar * yasİndirimOranı;
		double indirimliTutar = normalTutar - yasİndirimi;
		double gitGelOran = 0;

		if (tip == 2) {
			gitGelOran = 0.20;
		}

		double gidisDonusIndirimi = indirimliTutar * gitGelOran;
		double bilet = indirimliTutar - gidisDonusIndirimi;

		if (tip == 2) {
			bilet *= 2;
		}
		System.out.print("Bilet Fiyatı: " + bilet);
	}

}
