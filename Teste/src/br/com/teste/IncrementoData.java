package br.com.teste;

public class IncrementoData {

	public static void main(String[] args) {
		String parcela = "12";
		String dataVencimento = "07/02/2022";
		int mes2 = Integer.parseInt(dataVencimento.substring(3, 5));
		int countMes = 1;
		int countMes2 = 1;
		int countParcela = 1;
		
		for(int i = 0; i < Integer.parseInt(parcela); i++) {
			if(mes2 <= 12) {
				if(String.valueOf(mes2).length() == 1) {
					System.out.println(dataVencimento.substring(0,3).concat("0" + String.valueOf(mes2) + "/").concat(dataVencimento.substring(6,10)));	
					System.out.println(countParcela);
				}else {
					System.out.println(dataVencimento.substring(0,3).concat(String.valueOf(mes2) + "/").concat(dataVencimento.substring(6,10)));
					System.out.println(countParcela);
				}
				
				mes2 = Integer.parseInt(dataVencimento.substring(3,5)) + countMes++;
				countParcela++;
			} else {
				int mes3 = countMes2;
//				String ano = ;
				int ert = Integer.parseInt(dataVencimento.substring(6, 10)) + 1;

				if(String.valueOf(mes3).length() == 1) {
					System.out.println(dataVencimento.substring(0,3).concat("0" + String.valueOf(mes3) + "/").concat(String.valueOf(ert)));	
					System.out.println(countParcela);
				}else {
					System.out.println(dataVencimento.substring(0,3).concat(String.valueOf(mes3) + "/").concat(String.valueOf(ert)));
					System.out.println(countParcela);
				}
				countMes2++;
				countParcela++;
			}
		}

	}
}
