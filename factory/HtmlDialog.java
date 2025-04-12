package factory;

import buttons.Button;
import buttons.HtmlButton;

// Esta classe concreta herda de Dialog e define o método createButton() para instanciar um botão específico do tipo HTML.
// No padrão Factory Method, ela representa uma implementação concreta da fábrica que gera um produto específico (neste caso, um botão HTML).
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        // Criação de um botão HTML específico.
        return new HtmlButton();
    }
}
