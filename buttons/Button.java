package buttons;

// Esta interface estabelece o contrato para os botões no padrão Factory Method.
// Ela define os métodos que devem ser implementados por diferentes tipos de botões criados por fábricas específicas.
// Todas as classes que implementarem esta interface devem fornecer implementações concretas para os métodos declarados.
public interface Button {
    void render();

    void onClick();
}