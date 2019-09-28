package Classes;
import Interfaces.ValoresITF;

public class Valores implements ValoresITF{
	
	private Integer[] num = new Integer [10];

	@Override
	public boolean ins(int valor) {
		if (valor > 0) {
				if (size()< 10) {
					for (int i=0; i<num.length; i++) {
						if (num[i] == null ) {
							num[i] = valor;
							break;
						}
					}
					return true;
				}
				return false;
				
			} else {
				return false;
			}
	}

	@Override
	public int del(int index) {
		int valor = 0;
		if(size() == 0) {
			valor = -1;
		}
		if(index >= 0 && index<=9) {
			if(this.num[index] != null) {
				valor = this.num[index];
			}else {
				return -1;
			}
			this.num[index] = null;
		}
		
		return valor;
	}

	@Override
	public int size() {
		int tam = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] != null) {
				tam += 1;
			}
		}
		return tam;
	}

	@Override
	public double mean() {
		int valor = 0;
		if(size()==0) {
			valor = -1;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != null) {
				valor += num[i];
			}
		}
		if (size() !=0) {
			valor = valor / size();
		}
		return valor;
	}

	@Override
	public int greater() {
		int valor = 0;
		if(size() == 0) {
			valor = -1;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != null) {
				if(num[i] > valor) {
					valor = num[i];
				}
			}
		}
		return valor;
	}

	@Override
	public int lower() {
		int valor = greater();
		if (size() == 0) {
			valor = -1;
		}
		for (int i = 0; i< num.length; i++) {
			if(num[i] != null) {
				if(num[i] < valor) {
					valor = num[i];
				}
			}
		}
		return valor;
	}

}
