package desafio4;

/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
        • SP – R$67.836,43
        • RJ – R$36.678,66
        • MG – R$29.229,88
        • ES – R$27.165,48
        • Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  */

public class desafio4 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es =  27165.48;
        double outros = 19849.53;

        double soma = sp + rj + mg + es + outros;

        double percentualSp = (sp / soma) * 100;
        double percentualRj = (rj / soma) * 100;
        double percentualMg = (mg/soma) * 100;
        double percentualEs = (es/soma) * 100;
        double percentualOutros = (outros/soma) * 100;

        System.out.println("Percentual de sp = "+String.format("%.1f", percentualSp)+"%");
        System.out.println("Percentual de rj = "+String.format("%.1f", percentualRj)+"%");
        System.out.println("Percentual de mg = "+String.format("%.1f", percentualMg)+"%");
        System.out.println("Percentual de es = "+String.format("%.1f", percentualEs)+"%");
        System.out.println("Percentual de outros = "+String.format("%.1f", percentualOutros)+"%");

    }
}
