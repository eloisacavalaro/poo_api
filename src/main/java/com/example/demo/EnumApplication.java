package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnumApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnumApplication.class, args);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma UF :");
        for (UnidadeFederativa uf : UnidadeFederativa.values()) {
            System.out.println(uf.name());
        }

        String ufInput = sc.nextLine();

        try {
            UnidadeFederativa ufEscolhida = UnidadeFederativa.fromNomePorExtenso(ufInput);
            System.out.println("Você escolheu: " + ufEscolhida.getNomePorExtenso());
        } catch (IllegalArgumentException e) {
            System.out.println("UF não encontrada: " + ufInput);
        }

        System.out.println("Digite uma região : ");
       
        String regiaoInput = sc.nextLine();

        try{
            List<UnidadeFederativa> ufRegiao = UnidadeFederativa.fromRegiao(regiaoInput);
            System.out.println("Estados da região : " + regiaoInput);
            for(UnidadeFederativa uf : ufRegiao){
                System.out.println(uf.name() + " - " + uf.getNomePorExtenso());
            }
        } catch (IllegalArgumentException e){
            System.out.println("Região não encontrada: " + regiaoInput);
        }
	}

}
