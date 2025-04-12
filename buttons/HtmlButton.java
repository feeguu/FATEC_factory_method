package buttons;

// Esta classe é uma implementação da interface Button que representa um botão HTML específico.
// Ela define o comportamento de renderização do botão e a ação executada quando ele é clicado.
// No padrão Factory Method, esta classe é uma das implementações concretas de botão que podem ser criadas por uma fábrica.
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}