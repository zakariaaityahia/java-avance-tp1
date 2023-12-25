public class GestionCompteApp {
    public static void main(String[] args) {
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(222222, "Hajar", 30000);
        c1.retirer(1900);
        c2.deposer(15000);
    }


}
