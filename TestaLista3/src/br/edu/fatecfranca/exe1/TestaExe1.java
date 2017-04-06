package br.edu.fatecfranca.exe1;
import br.org.fatecfranca.exe1.Cliente;
import javax.swing.JOptionPane;
public class TestaExe1 {
    public static void main(String[] args) {
        //criar o cliente fulano
        Cliente fulano = new Cliente();
        //entra num menu para escolher a ação
        int opcao = 0;
        while(opcao != 5){
            //mostra as opções do menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar o Fulano:\n2 - Realizar Deposito do Fulano."
                    + "\n3 - Realizar saque do Fulano.\n4 - Mostrar as informações do Fulano.\n5 - Sair."));
            //realisa a opção escolhida
            switch(opcao){
                case 1:
                    try{
                        //instanciar o objeto fulano
                        fulano.setNumeroConta(JOptionPane.showInputDialog("Informe o número da conta do Fulano:"));
                        fulano.setNumeroAgencia(JOptionPane.showInputDialog("Informe o número da agencia do Fulano:"));
                        fulano.setNome(JOptionPane.showInputDialog("Informe o nome do Fulano:"));
                        fulano.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo da conta do Fulano:")));
                    }
                    catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    };
                    break;
                case 2:
                    fulano.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("informe o quanto deseja depositar na conta do Fulano:")));
                    break;
                case 3:
                    fulano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Informe o quanto deseja sacar na conta do Fulano:")));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, fulano.mostra());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida.");
            }
        }
        //-------------------------------------------------------------------------------------------//
        //Perguntar os valores iniciais
        String nC = JOptionPane.showInputDialog("Informe o número da conta do Beltrano:");
        String nA = JOptionPane.showInputDialog("Informe o número da agencia do Beltrano:");
        String no = JOptionPane.showInputDialog("Informe o nome do Fulano:");
        float sa = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo da conta do Fulano:"));
        //criar o cliente beltrano
        Cliente beltrano = new Cliente(nC, nA, no, sa);
        //entra num menu para escolher a ação
        opcao = 0;
        int opcao2 = 0; 
        while(opcao != 5){
            //mostra as opções do menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Atualizar informações do Beltrano.\n2 - Realizar Deposito na conta do Beltrano."
                    + "\n3 - Realizar saque na conta do Beltrano.\n4 - Mostrar as informações do Beltrano.\n5 - Sair."));
            //realisa a opção escolhida
            switch(opcao){
                case 1:
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Atualizar o Número da Conta.\n2 - Atualizar o Número da Agencia."
                            + "\n3 - Atualizar Nome.\n4 - Atualizar o Saldo da Conta."));
                    try{
                        switch(opcao2){
                            case 1:
                                beltrano.setNumeroConta(JOptionPane.showInputDialog("Informe o novo número da conta do Beltrano:"));
                                break;
                            case 2:
                                beltrano.setNumeroAgencia(JOptionPane.showInputDialog("Informe o novo número da agencia do Beltrano:"));
                                break;
                            case 3:
                                beltrano.setNome(JOptionPane.showInputDialog("Informe o novo nome do Beltrano:"));
                                break;
                            case 4:
                                beltrano.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Informe o novo saldo da conta do Beltrano:")));
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Invalida.");
                        } 
                    }
                    catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    };
                    break;
                case 2:
                    beltrano.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("informe o quanto deseja depositar:")));
                    break;
                case 3:
                    beltrano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Informe o quanto deseja sacar:")));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, beltrano.mostra());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida.");
            }
        }
    }
}