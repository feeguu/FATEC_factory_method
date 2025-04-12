import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    // Esta função é responsável por instanciar a fábrica com base no sistema
    // operacional.
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    // Esta função cuida de exibir a janela do diálogo criada pela fábrica
    // configurada na função configure().
    // Ela utiliza o método renderWindow() da classe Dialog, que internamente chama
    // o método createButton() para gerar o botão correspondente.
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}