import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class JanelaGrandeSwing {

    public static void main(String[] args) {
        // Criação do JFrame (janela)
        JFrame janela = new JFrame("Minha Janela Grande");

        // Define o tamanho da janela (largura, altura)
        janela.setSize(400, 600); // 1280x720 para uma janela grande

        // Centraliza a janela na tela
        janela.setLocationRelativeTo(null);

        // Define o que acontece quando o usuário clica no botão de fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o layout como FlowLayout para manter o tamanho do botão
        janela.setLayout(new FlowLayout());

        // Criação do botão
        JButton botao = new JButton();
        botao.setText("2"); // Definir um texto para o botão
        botao.setPreferredSize(new Dimension(80, 80));
        botao.setBackground(Color.black);
        

        // Adiciona o botão ao JFrame
        janela.add(botao);

        // Torna a janela visível
        janela.setVisible(true);
    }
}
