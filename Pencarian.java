import java.util.Scanner;
class Pencarian{
	public static void main (String [] args){
		ProsesPencarian seq = new ProsesPencarian();
		Scanner ss = new Scanner(System.in);
		int [] data;
		int []  angka;
		int i, j, temp,k, jml, key;
		int min, max;
		System.out.print("Masukkan Jumlah Angka = ");
		jml = ss.nextInt();
		angka = new int[jml];
		System.out.println();
		if(jml>0&&jml<100)
		{
		for (i=0; i<jml ; i++){
			System.out.print("Angka ke -" +(i+1)+" = ");
			angka[i]=ss.nextInt();
		}
			for (i=0;i<jml;i++){
		for (j=0;j<(jml-1);j++){
		if(angka[j]>angka[j+1]){
			//proses sorting
			temp=angka[j+1];
			angka[j+1]=angka[j];
			angka[j]=temp;
			}
			
		}System.out.print("Proses Pengurutan ke - "+(i+1)+" = ");
			for(k=0;k<jml;k++){
			System.out.print(angka[k]+" ");
			}
			System.out.println();
		
	}
	System.out.println();
	System.out.println("Hasil Pengurutan");
	for (i=0;i<jml;i++){
		System.out.println("angka ke - "+(i+1)+" = "+angka[i]);
	}
		System.out.print("Masukan angka yang akan dicari = ");
		key = ss.nextInt();
		seq.cari(angka,key);
		System.out.print(seq.hasil());
		max = 0;
			for (i=0; i<jml ; i++){
				if (angka[i] > max){
					max = angka[i];
			}
		}
		min = 1000;
			for (i=0; i<jml; i++){
				if (angka[i] <  min ){
					min = angka[i];
				}
			}
		if (key == max){
			System.out.println("Angka Terbesar dari Data adalah = "+max);
			}
		else if (key == min){
			System.out.println("Angka Terkecil dari Data adalah = "+min);
			}
		else {
		System.out.println("Merupakan Nilai Tengah dari Data ");
		}}
		else
		System.out.print("Inputan Salah");
	}
}