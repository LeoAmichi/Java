import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JButton button;

    public Main() {
        // Inicializando o botão e a janela no construtor
        button = new JButton("Clique aqui");
        frame = new JFrame();

        frame.setSize(600, 400);
        frame.setTitle("Teste");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.setSize(100, 200);

        setUpButtonListeners(); // Configurando o listener do botão
    }

    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
            }
        };
        button.addActionListener(buttonListener);
    }

    public static void main(String[] args) {
        // Criando uma instância de Main para inicializar a interface gráfica
        new Main();
    }
}
