public class parcelamento {
    public static void main(String[] args) {
        Double vtotal = 100.0;
        vtotal = vtotal * 100;
        Integer numparcelas = 3;
        Integer vparcela = vtotal.intValue() / numparcelas;

        System.out.println("VALOR TOTAL DA COMPRA: R$" + vtotal);
        System.out.println("NUMERO DE PARCELAS:" +numparcelas);
        System.out.println("VALOR DE CADA PARCELA: R$" + vparcela / 100.0);

    }

}
