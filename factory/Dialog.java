package factory;

import buttons.Button;

// Esta classe abstrata define a fábrica com o método de criação de botões e o método de renderização da janela do diálogo.
// No padrão Factory, essa classe é a classe base que define o método de criação de produtos (neste caso, botões) e o método de renderização da janela do diálogo.
// As subclasses concretas (como WindowsDialog e HtmlDialog) devem implementar o método createButton() para criar o tipo específico de botão que desejam usar.
public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}