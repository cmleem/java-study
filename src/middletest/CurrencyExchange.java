package middletest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {

		//1 대한민국 원 = 0.00075 미국 달러
		//1 일본 엔 = 0.11 대한민국 원
		BigDecimal dollar = new BigDecimal(0.00075);
		BigDecimal yen = new BigDecimal(0.11);

		Scanner scanner = new Scanner(System.in);

		//원화 입력 받기
		System.out.print("원(KRW) = ");
		int num = scanner.nextInt();
		BigDecimal won = new BigDecimal(Integer.toString(num));

		//달러 변환
		BigDecimal wonToDollar = new BigDecimal(String.valueOf(convertDollarToWon(dollar, won)));
		wonToDollar = calculateWithRounding(wonToDollar, 2);

		//엔화 변환
		BigDecimal wonToYen = new BigDecimal(String.valueOf(convertYenToWon(yen, won)));
		wonToYen = calculateWithRounding(wonToYen, 2);

		//출력
		System.out.println("달러($) = " + wonToDollar);
		System.out.println("JPY = " + wonToYen);

	}

	public static BigDecimal convertDollarToWon(BigDecimal dollar, BigDecimal won) {
		return dollar.multiply(won);
	}

	public static BigDecimal convertYenToWon(BigDecimal yen, BigDecimal won) {
		return yen.multiply(won);
	}

	public static BigDecimal calculateWithRounding(BigDecimal bigDecimal, int scale) {
		return bigDecimal.setScale(scale, RoundingMode.HALF_UP);
	}
}
