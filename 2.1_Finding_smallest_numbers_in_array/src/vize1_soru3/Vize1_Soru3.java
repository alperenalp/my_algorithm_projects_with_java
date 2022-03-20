
package vize1_soru3;

public class Vize1_Soru3 {

    public static void main(String[] args) {
        int adet = 3;
        int[] dizi = {10, 9, 100, 81, 50, 10, 36, 90, -4, 8, 93, 43, 3, 5, 6};
        int[] sonucDizi = new int[adet];
        sonucDizi = enk3Sayi(dizi, adet);
        for (int i = 0; i < adet; i++) {
            System.out.println((i + 1) + ". En küçük: " + sonucDizi[i]);
        }

    }

    public static int[] enk3Sayi(int[] dizi, int adet) {
        int[] cevapDizi = new int[adet];
        int diziBoyutu = dizi.length;
        int y = 0, sonEkSayi = 0;
        for (int j = 0; j < adet; j++) {
            int ekSayi = 999, ebSayi = 888, x = 0;
            for (int i = 0; i < dizi.length; i++) {
                if (ekSayi > dizi[i]) {
                    ekSayi = dizi[i];
                    x = i;
                }
                if (diziBoyutu == (i + 1)) {
                    dizi[x] = ebSayi;
                }
            }
            if (diziBoyutu > y) {
                cevapDizi[j] = ekSayi;
                sonEkSayi = ekSayi;
                y++;
            } else {
                cevapDizi[j] = sonEkSayi;
            }
        }
        return cevapDizi;

    }

}
