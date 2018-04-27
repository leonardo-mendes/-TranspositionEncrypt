import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.printf(transposicaoTrilho("Leonardo", 2));

    }

    public static String transposicaoTrilho(String texto, Integer qtdCamadas){
        String fraseTransp = "";
        ArrayList<String> controleTransp = new ArrayList<String>();
        Integer controleVetor = 0;
        Boolean controlePrimeiraVez = true;

        for (int i = 0; i < texto.length(); i++) {
            if (!controlePrimeiraVez) {
                if (String.valueOf(texto.charAt(i)) == " ") {
                    controleTransp.set(controleVetor, "#");
                } else {
                    String temp = controleTransp.get(controleVetor)+""+texto.charAt(i);
                    controleTransp.set(controleVetor, temp);
                }

                controleVetor++;

                if (controleTransp.size() == qtdCamadas) {
                    controleVetor = 0;
                }
            }
            else {
                if (controleTransp.size() < qtdCamadas) {
                    if (String.valueOf(texto.charAt(i)) == " ") {
                        controleTransp.add("#");
                    } else {
                        controleTransp.add(String.valueOf(texto.charAt(i)));
                    }

                    controleVetor++;

                    if (controleTransp.size() == qtdCamadas) {
                        controlePrimeiraVez = false;
                        controleVetor = 0;
                    }
                }
            }
        }

        for (int i = 0; i<controleTransp.size(); i++){
            fraseTransp += controleTransp.get(i);
        }

        return fraseTransp;
    }

}
