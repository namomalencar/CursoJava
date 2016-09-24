package br.com.cursojava.banco.util;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public String dataFormatada() {
		return "" + dia + "/" + mes + "/" + ano + "";
	}

	public boolean setDataCompleta(int dia, int mes, int ano) {
		// Checar mes
		if (mes < 1 || mes > 12) {
			return false;
		}
		int diaMaximo;
		switch (mes) {
		case 2:
			diaMaximo = 28;
			if (ano % 4 == 0) {
				diaMaximo = 29;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diaMaximo = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaMaximo = 30;
			break;
		default:
			return false;
		}

		if (dia > diaMaximo) {
			return false;
		} else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			return true;
		}

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

}
