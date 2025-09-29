package br.senai.sp.jandira.ds1m.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;
    int tempoCasa;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("** CALCULADORA DE COMISSÕES **");
        System.out.println("-----------------------------------");

        // Obtendo o nome do vendedor
        System.out.print("Qual o nome do vendedor? ");
        nomeVendedor = leitor.nextLine();

        // Obtendo o total de vendas do vendedor
        System.out.print("Qual o total de vendas do(a) vendedor(a) " + nomeVendedor + "? ");
        totalDeVendas = leitor.nextDouble();

        //obtendo o tempo de casa do vendedor
        System.out.print("Qual é o tempo de casa do vendedor? ");
        tempoCasa = leitor.nextInt();
        

        calcularComissao();

    }

    public void calcularComissao(){
        if (totalDeVendas < 20000 && tempoCasa >= 2){
            percentualDaComissao = 5;
        } else {
            percentualDaComissao = 10;
        }

        valorDaComissaoEmReais = totalDeVendas * percentualDaComissao / 100;

        exibirResultados();

    }

    public void exibirResultados(){
        System.out.println("-------------------------------------");
        System.out.println("** R E S U L T A D O S **");
        System.out.println("-------------------------------------");
        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$" + totalDeVendas);
        System.out.println("PERCENTUAL DA COMISSÃO: " + percentualDaComissao + "%");
        System.out.println("VALOR DA COMISSÃO PAGA: R$ " + valorDaComissaoEmReais);
        System.out.println("-------------------------------------");
    }

}
