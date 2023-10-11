package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Mamiferos extends Animais{

    Scanner keyboard = new Scanner(System.in);

    public void cadastrarFelinos(){

        System.out.println("---------- CADASTRAR FELINO ----------");
        System.out.println("");
        System.out.println(" Informe o nome: ");
        super.nome = keyboard.nextLine();
        System.out.println(" Informe a especie: ");
        super.especie = keyboard.nextLine();
        System.out.println(" Informe o sexo [Masc/Fem]: ");
        super.sexo = keyboard.nextLine();
        System.out.println(" Informe a idade: ");
        super.idade = keyboard.nextInt();
        System.out.println(" Informe o ID do felino:");
    }

    public void cadastrarCetaceos(){

        System.out.println("---------- CADASTRAR CETÁCEO ----------");
        System.out.println("");
        System.out.println(" Informe o nome: ");
        super.nome = keyboard.nextLine();
        System.out.println(" Informe a espécie: ");
        super.especie = keyboard.nextLine();
        System.out.println(" Informe o sexo [Masc/Fem]: ");
        super.sexo = keyboard.nextLine();
        System.out.println(" Informe a idade: ");
        super.idade = keyboard.nextInt();
        super.id_animal = keyboard.nextInt();
    }
}
