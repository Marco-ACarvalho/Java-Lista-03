package br.edu.fatecfranca.exe2;

import br.org.fatecfranca.exe2.Aluno;
import javax.swing.JOptionPane;

public class TestaExe2 {
    public static void main(String[] args){
        //cria objeto
        Aluno fulano = new Aluno();
        //entra num menu para escolher a ação
        int opcao = 0;
        int opcao2 = 0;
        while(opcao != 6){
            //mostra as opções do menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar o Fulano:\n2 - Atualizar Informacoes."
                    + "\n3 - Calcular a media das notas.\n4 - Mostrar as informações do Fulano.\n5 - Verificar se o aluno foi aprovado.\n6 - Sair."));
            try{
                //realisa a opção escolhida
                switch(opcao){
                    case 1:
                        fulano.setNumeroAluno(JOptionPane.showInputDialog("Informe o numero do aluno:"));
                        fulano.setNome(JOptionPane.showInputDialog("Informe o nome do aluno:"));
                        fulano.setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe a idade do aluno:")));
                        fulano.setP1(Float.parseFloat(JOptionPane.showInputDialog("informe a nota p1 do aluno:")));
                        fulano.setP2(Float.parseFloat(JOptionPane.showInputDialog("informe a nota p2 do aluno:")));
                        break;
                    case 2:
                        opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Atualizar Numero do Aluno.\n2 - Atualizar Nome do Aluno."
                                + "\n3 - Atualizar Idade do Aluno.\n4 - Atualizar Nota P1 do Aluno.\n5 - Atualizar Nota P2 do Aluno."));
                        switch(opcao2){
                            case 1:
                                fulano.setNumeroAluno(JOptionPane.showInputDialog("informe o novo numero do aluno:"));
                                break;
                            case 2:
                                fulano.setNome(JOptionPane.showInputDialog("informe o novo nome:"));
                                break;
                            case 3:
                                fulano.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a nova idade do aluno:")));
                                break;
                            case 4:
                                fulano.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe a nova nota P1:")));
                                break;
                            case 5:
                                fulano.setP2(Float.parseFloat(JOptionPane.showInputDialog("informe a nova nota P2:")));
                                break;
                            case 6:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcao de alteracao invalida!");
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Media: " + fulano.notaFinal());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, fulano.dadosAluno());
                        break;
                    case 5:
                        if(fulano.passou()){
                            JOptionPane.showMessageDialog(null, "Aluno aprovado.");
                        }
                        else JOptionPane.showMessageDialog(null, "Aluno reprovado.");
                        break;
                    case 6:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Essa opcao nao existe!");
                }
            }
            catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
