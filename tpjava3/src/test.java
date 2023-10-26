public class test {

    public static void main(String[] args) {

        adresse adrs1=new adresse();
        adrs1.ville=" sidi bouzid";
        adrs1.couv="sidi bouzid centre";
        adrs1.codpost=9100;
        adrs1.afficheadress();
        adrs1.modifier(1999);
        adrs1.afficheadress();
        adresse adr2=new adresse("gassrine","sbietla",9123);
        adr2.afficheadress();
        adr2.modifier(20500);
        adr2.afficheadress();
        chercheur chr1=new chercheur();
        chr1.nom="aymen";
        chr1.poste="technicien d'informatique";
        chercheur chr2=new chercheur("ouma","femme d'affaire",10);
        chr2.affichchercheur();
        System.out.println("nombre de chercheur "+chr1.nb);
        chr2.comparer(chr1);
        chr2.modifier(55141520);
        chr1.modifier(98653257);
        chercheur chr3=new chercheur();
        chr3.ajouter("oumayma","hotesse de l'air",25487691);
        chr3.affichchercheur();
        System.out.println("nombre de chercheur "+chr3.nb);
        chercheur ch[]={chr1,chr2,chr3};
        bureau b1=new bureau(568,"bur1",ch);
        bureau b2=new bureau(785,"bur1",ch);
        bureau bt[]={b1,b2};
        laboratoire l=new laboratoire("lab1","spc1",adrs1,bt);
        l.affichelabo();
















    }
}