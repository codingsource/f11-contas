package br.com.caelum.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * DataTime
 * 
 * @author peter
 */

public class DataTime {

	Calendar c = Calendar.getInstance();
	Date data = c.getTime();
	static DateFormat f;

	static SimpleDateFormat dateFormat;
	
	 

	public String simpleDate() {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
		return dateFormat.format(data);
	}
	
	public String simpleDateTime() {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.ROOT);
		return dateFormat.format(data);
	}
	
	public String simpleTime() {
		dateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);
		return dateFormat.format(data);
	}
	
	public String simpleTimeZ() {
		dateFormat = new SimpleDateFormat("hh:mm:ss zzzz", Locale.ROOT);
		return dateFormat.format(data);
	}
	
	public String simpleTimeE() {
		dateFormat = new SimpleDateFormat("MMMM, dd MM yyyy HH:mm:ss a", Locale.ROOT);
		return dateFormat.format(data);
	}

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