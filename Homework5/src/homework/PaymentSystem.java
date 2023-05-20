package homework;


public class PaymentSystem {

	public void pay() throws SystemNotWorkingException {

		int num = (int) (Math.random() * 100);
		System.out.println("Rastgele sayı: " + num);
		if (num > 75) {
			throw new SystemNotWorkingException("Sistem hatalı");
		}
	}
}
