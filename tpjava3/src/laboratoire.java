public class laboratoire {


    public String nomlabo;
    public String specialite;
    public adresse adreslabo;
    public bureau nbbureau[];
    public laboratoire(String nom,String sp,adresse adrs,bureau B[]){

        nomlabo=nom;
        specialite=sp;
        adreslabo=adrs;
        nbbureau=new bureau[50];
        nbbureau=B;


    }
    void affichelabo() {


        System.out.println("nom= " + nomlabo + " specialite= " + specialite);
        this.adreslabo.afficheadress();
        int i;
        int n=nbbureau.length;
        for (i = 0; i < n; i++)
        {

            this.nbbureau[i].affichebureau();
        }
    }
}
