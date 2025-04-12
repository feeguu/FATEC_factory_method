package factory;

import buttons.Button;
import buttons.WindowsButton;

// Esta classe concreta herda de Dialog e define o método createButton() para instanciar um botão específico do Windows.
// No padrão Factory Method, ela é uma das implementações concretas da fábrica, responsável por criar um tipo específico de produto (neste caso, um botão do Windows).
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        // Criação de um botão Windows específico.
        return new WindowsButton();
    }
}
