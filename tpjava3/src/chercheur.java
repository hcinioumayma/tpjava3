public class chercheur {


    public String nom;
    public String poste;
    public int numord;
    public static int  nb=0;
    public chercheur(){
        nom="";
        poste="";
        numord=0;
        nb++;}
    public chercheur(String n,String p,int num){
        nom=n;
        poste=p;
        numord=num;
        nb++;

    }


    void affichchercheur(){
        System.out.println("nom= "+nom+" poste= "+poste+" numero d ordinateur = "+numord);


    }

    public boolean comparer(chercheur c) {
        if (this.numord == c.numord) {
            if (this.nom == c.nom) {
                if (this.poste == c.poste) {
                    return true;
                }
            }


        }
        return false;


    }
    public void modifier(int c){

        numord=c;

    }
    void ajouter(String nom,String poste,int numord){

        this.nom=nom;
        this.poste=poste;
        this.numord=numord;



    }
}