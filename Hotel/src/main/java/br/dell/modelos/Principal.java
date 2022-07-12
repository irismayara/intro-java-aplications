package br.dell.modelos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Iris Mayara
 */
public class Principal {
    public static void main(String[] args) {
    /**    
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Hotel!");  

        String cpfStr = JOptionPane.showInputDialog("Digite o CPF do Hóspede: ");
        long cpf = Long.parseLong(cpfStr);
        String rgStr = JOptionPane.showInputDialog("Digite o RG do Hóspede: ");
        long rg = Long.parseLong(rgStr);
        String nome = JOptionPane.showInputDialog("Digite o nome do Hóspede: ");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade do Hóspede: ");
        int idade = Integer.parseInt(idadeStr);
        String endereco = JOptionPane.showInputDialog("Digite o endereço do Hóspede: ");

        Hospede hospede = new Hospede(cpf, rg, nome, idade, endereco);
        JOptionPane.showMessageDialog(null, "Visitante cadastrado com sucesso!"); 

        String numQuartoStr = JOptionPane.showInputDialog("Digite o número do quarto do Hóspede: ");
        int numQuarto = Integer.parseInt(numQuartoStr);

        Quarto quarto = new Quarto(numQuarto, hospede);

        JOptionPane.showMessageDialog(null, "CPF: " + quarto.getHospede().getCPF() +
                "\nRG: " + quarto.getHospede().getRG() + 
                "\nNome: " + quarto.getHospede().getNome() +
                "\nIdade: " + quarto.getHospede().getIdade() +
                "\nEndereço: " + quarto.getHospede().getEndereco() +
                "\n\nQuarto: " + quarto.getNumero()
        ); 
    }
    */
    
    Scanner tec = new Scanner(System.in);
        System.out.println("Digite: ");
    boolean valor = tec.nextBoolean();
        System.out.println("Lido: " + valor);
    }
}
