package project;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {

    static ArrayList<String> alunos = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            adicionarAlunoLayout();
        }
        adicionarPagamentoLayout();
    }
        public static void adicionarAlunoLayout() {
            JPanel panelAluno = new JPanel(new GridLayout(5, 3));
            JLabel txt = new JLabel("Nome do aluno:");
            JTextField text1 = new JTextField(10);
            JLabel txt1 = new JLabel("matricula do carro:");
            JTextField text2 = new JTextField(10);
            panelAluno.add(txt);
            panelAluno.add(text1);
            panelAluno.add(txt1);
            panelAluno.add(text2);
            JOptionPane.showMessageDialog(null, panelAluno);
            alunos.add(text1.getText());
            String var2 = text2.getText();
        }

        public static void adicionarPagamentoLayout(){
            JPanel panelPagamento = new JPanel(new GridLayout(5, 3));
            JLabel txt = new JLabel("Nome do aluno:");
            JComboBox comboBox = new JComboBox(alunos.toArray());
            //JTextField text1 = new JTextField(10);
            JLabel txt1 = new JLabel("Número de horas de estacionamento");
            JTextField text2 = new JTextField(10);
            panelPagamento.add(txt);
            panelPagamento.add(comboBox);
            //panelPagamento.add(text1);
            panelPagamento.add(txt1);
            panelPagamento.add(text2);
            JOptionPane.showMessageDialog(null, panelPagamento);
            //String var1 = text1.getText();
            String var2 = text2.getText();
        }
    }