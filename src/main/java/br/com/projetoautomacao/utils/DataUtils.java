package br.com.projetoautomacao.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataUtils {

	public static String AlterarDataMes(GregorianCalendar calendar, int mes) {
		GregorianCalendar gc = calendar;
		gc.add(GregorianCalendar.MONTH, mes);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(gc.getTimeInMillis());
	}

	public static String AlterarDataDia(GregorianCalendar calendar, int dia) {
		GregorianCalendar gc = calendar;
		gc.add(GregorianCalendar.DATE, dia);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(gc.getTimeInMillis());
	}

	public static int VerificarQuantidadeDeMeses(int anoInicio, int mesInicio,int diaInicio, int anoFim, int mesFim, int diaFim){
		Calendar dataInicio = Calendar.getInstance();
		Calendar dataFinal = Calendar.getInstance();
		dataInicio.set(anoInicio, mesInicio, diaInicio);
		dataFinal.set(anoFim, mesFim, diaFim);
		long diferenca = dataFinal.getTimeInMillis() - dataInicio.getTimeInMillis();
		// Quantidade de milissegundos em um dia
		int tempoDia = 1000 * 60 * 60 * 24;
		long diasDiferenca = diferenca / tempoDia;
		int resultado = (int) ((diasDiferenca/30));
		return resultado;
	}

	public static int VerificarQuantidadeDeMeses(int anoInicio, int mesInicio, int anoFim, int mesFim){
		return VerificarQuantidadeDeMeses(anoInicio, mesInicio, 1, anoFim, mesFim, 29);
	}
}


