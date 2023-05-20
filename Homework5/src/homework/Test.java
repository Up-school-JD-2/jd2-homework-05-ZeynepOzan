package homework;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		UserControl userControl = new UserControl();
		int choise = 0, control = 0;
		boolean result = false;

		while (choise != 1) {
			try {
				System.out.print("Ödeme tutarını giriniz: ");
				String amount = scanner.nextLine();
				boolean contAmount = userControl.amountControl(amount);

				System.out.print("Kart numarasını giriniz : ");
				String cardNo = scanner.nextLine();
				boolean contCard = userControl.cardNoControl(cardNo);

				System.out.print("Son Kullanma Tarihi: ");
				String date = scanner.nextLine();
				boolean contDate = userControl.dateControl(date);

				System.out.print("Güvenlik kodunu giriniz: ");
				String securityCode = scanner.nextLine();
				boolean contCode = userControl.securityCodeControl(securityCode);

				result = userControl.control(contAmount, contCard, contDate, contCode);

			} catch (InvalidAmountException e) {
				e.printStackTrace();
			} catch (InvalidCardNumberException e) {
				e.printStackTrace();
			} catch (InvalidDateException e) {
				e.printStackTrace();
			} catch (InvalidSecurityCodeException e) {
				e.printStackTrace();
			}
			if (control == 1) {
				break;
			}
			if (result) {
				PaymentSystem payment = new PaymentSystem();
				if (control != 1) {
					try {
						payment.pay();
					} catch (SystemNotWorkingException e) {
						control = 1;
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("Ödeme işlemi başarılı gerçekleştirildi.");
	}
}
