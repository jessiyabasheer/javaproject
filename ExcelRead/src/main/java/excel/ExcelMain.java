package excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String data1=ExcelCode.readIntegerData(0, 0);
		System.out.println(data1);
		String data2=ExcelCode.readStringData(1, 0);
		System.out.println(data2);

	}

}
