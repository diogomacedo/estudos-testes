package br.com.curso.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Date adicionarDias(Date data, int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}

	public static Date obterDataComDiferencaDias(int dias) {
		return adicionarDias(new Date(), dias);
	}

	public static Date obterData(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dia);
		calendar.add(Calendar.MONTH, mes);
		calendar.add(Calendar.YEAR, ano);
		return calendar.getTime();
	}

	public static boolean isMesmaData(Date data1, Date data2) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(data1);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(data2);
		if (calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH) &&
			calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH) &&
			calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)) {
			return true;
		}
		return false;
	}

}
