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

        String cpfStr = JOptionPane.showInputDialog("Digite o CPF do H�spede: ");
        long cpf = Long.parseLong(cpfStr);
        String rgStr = JOptionPane.showInputDialog("Digite o RG do H�spede: ");
        long rg = Long.parseLong(rgStr);
        String nome = JOptionPane.showInputDialog("Digite o nome do H�spede: ");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade do H�spede: ");
        int idade = Integer.parseInt(idadeStr);
        String endereco = JOptionPane.showInputDialog("Digite o endere�o do H�spede: ");

        Hospede hospede = new Hospede(cpf, rg, nome, idade, endereco);
        JOptionPane.showMessageDialog(null, "Visitante cadastrado com sucesso!"); 

        String numQuartoStr = JOptionPane.showInputDialog("Digite o n�mero do quarto do H�spede: ");
        int numQuarto = Integer.parseInt(numQuartoStr);

        Quarto quarto = new Quarto(numQuarto, hospede);

        JOptionPane.showMessageDialog(null, "CPF: " + quarto.getHospede().getCPF() +
                "\nRG: " + quarto.getHospede().getRG() + 
                "\nNome: " + quarto.getHospede().getNome() +
                "\nIdade: " + quarto.getHospede().getIdade() +
                "\nEndere�o: " + quarto.getHospede().getEndereco() +
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
