package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserControl {

	public boolean control(boolean contAmount, boolean contCard, boolean contDate, Boolean contCode) {

		if (contAmount && contCard && contDate && contCode) {
			return true;
		}
		return false;
	}

	public boolean amountControl(String amount) throws InvalidAmountException {

		String myAmount = "\\d+";
		if (!(Pattern.matches(myAmount, amount))) {
			throw new InvalidAmountException("Tamsayı giriniz!!");
		} else {
			Long newAmount = Long.parseLong(amount);
			if (newAmount <= 0) {
				throw new InvalidAmountException("Geçersiz ödeme tutarı!!!");
			}
		}
		return true;
	}

	public boolean cardNoControl(String cardNo) throws InvalidCardNumberException {

		String regex = "^(\\d{4}[ -]?){3}\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cardNo);

		if (!(matcher.matches())) {
			throw new InvalidCardNumberException("Geçersiz Kart Numarası");
		}
		return true;
	}

	public boolean dateControl(String date) throws InvalidDateException {

		String regex = "^(0[1-9]|1[0-2])/(202[3-9]|20[3-9]\\d)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date);

		if (!(matcher.matches())) {
			throw new InvalidDateException("Geçersiz tarih!!");
		}
		return true;
	}

	public boolean securityCodeControl(String securityCode) throws InvalidSecurityCodeException {

		String newCode = "\\d+";
		if (!((Pattern.matches(newCode, securityCode)) && securityCode.length() == 3)) {
			throw new InvalidSecurityCodeException("Yanlış güvenlik kodu!!");
		}
		return true;
	}
}
