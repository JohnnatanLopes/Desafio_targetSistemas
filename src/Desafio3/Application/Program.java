package Desafio3.Application;

/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
        • O menor valor de faturamento ocorrido em um dia do mês;
        • O maior valor de faturamento ocorrido em um dia do mês;
        • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

        IMPORTANTE:
        a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
        b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;*/


import Desafio3.entities.Faturamento;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("dados.xml"));
        List<Faturamento> faturamentos = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for(int i = 0; i < nodeList.getLength();i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element elem = (Element) node;
                int dia = Integer.parseInt(elem.getElementsByTagName("dia").item(0).getChildNodes().item(0).getNodeValue());
                double valor = Double.parseDouble(elem.getElementsByTagName("valor").item(0).getChildNodes().item(0).getNodeValue());
                faturamentos.add(new Faturamento(dia, valor));
            }
        }

        double menor = faturamentos.get(0).getValor();
        double maior = faturamentos.get(0).getValor();
        double soma = 0.0;
        for(int i = 0; i < faturamentos.size();i++) {
            if(menor > faturamentos.get(i).getValor()) {
                menor = faturamentos.get(i).getValor();
            }
            if(maior < faturamentos.get(i).getValor()) {
                maior = faturamentos.get(i).getValor();
            }
        }

        int qtdDias = 0;
        for(int i = 0; i < faturamentos.size();i++) {
            if(faturamentos.get(i).getValor() > 1) {
                soma = soma + faturamentos.get(i).getValor();
                qtdDias++;
            }
        }
        double media = soma / qtdDias;

        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
        System.out.println("Media de faturamento: "+String.format("%.4f", media));

    }
}
