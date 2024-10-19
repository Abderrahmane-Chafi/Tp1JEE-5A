import proxy.BanqueService;
import proxy.Banque;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new Banque().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
