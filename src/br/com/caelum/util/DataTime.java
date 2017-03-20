package br.com.caelum.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DataTime
 * 
 * @author peter
 */

public class DataTime {

	Calendar c = Calendar.getInstance();
	Date data = c.getTime();
	static DateFormat f;

	public String dataAtualCompleta() {
		/* String = Domingo, 12 de Março de 2017 */
		f = DateFormat.getDateInstance(DateFormat.FULL);
		return DataTime.f.format(this.data);
	}

	public String dataAtualAbreviada() {
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		return DataTime.f.format(this.data);
	}

	public String dataAtual() {
		f = DateFormat.getDateInstance(DateFormat.LONG);
		return DataTime.f.format(this.data);
	}

	public String dataAtual_() {
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		return DataTime.f.format(this.data);
	}
}