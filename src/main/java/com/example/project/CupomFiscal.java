package com.example.project;

public class CupomFiscal {

    public static final String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
    public static final String LOGRADOURO = "Av. Projetada Leste";
    public static final int NUMERO = 500;
    public static final String COMPLEMENTO = "EUC F32/33/34";
    public static final String BAIRRO = "Br. Sta Genebra";
    public static final String MUNICIPIO = "Campinas";
    public static final String ESTADO = "SP";
    public static final String CEP = "13080-395";
    public static final String TELEFONE = "(19) 3756-7408";
    public static final String OBSERVACAO = "Loja 1317 (PDP)";
    public static final String CNPJ = "42.591.651/0797-34";
    public static final String INSCRICAO_ESTADUAL = "244.898.500.113";

    private static final String ENDLN = System.lineSeparator();

    public static void main(final String[] args) {
        //Implemente aqui
        String output = NOME_LOJA + ENDLN;
        output += LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + ENDLN;
        output += BAIRRO + " - " + MUNICIPIO + " - " + ESTADO + ENDLN;
        output += "CEP:" + CEP + " Tel " + TELEFONE + ENDLN;
        output += OBSERVACAO + ENDLN;
        output += "CNPJ: " + CNPJ + ENDLN;
        output += "IE: " + INSCRICAO_ESTADUAL;

        System.out.println(output);
    }

}