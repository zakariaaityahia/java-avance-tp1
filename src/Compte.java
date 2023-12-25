import org.w3c.dom.ls.LSOutput;

public class Compte {
    private Long num;
    private String nomClient;
    private double Solde;
    public Compte() {
    }
    public Compte(long num,String nomClient,double Solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.Solde = Solde;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return Solde;
    }

    public void setSolde(double Solde) {
        this.Solde = Solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Num :" + num + "nomClient :" + nomClient + "Solde :" + Solde);
    }

    public void retirer(double montant) {
        if (Solde >= montant) {
             Solde = Solde - montant;
            System.out.println("retrait de solde et effectue");
        }
        else {
            System.out.println("Solde insuffisant de effectue ce retrait");
        }
    }

    public void deposer(double montant) {
        Solde = Solde + montant;
        System.out.println("le montant " + montant +  " a ete ajoute a votre solde " + Solde);
    }
}
