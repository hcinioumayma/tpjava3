
public class bureau {


    public int code;
    public String nomb;
    public chercheur cherchb[];
    public bureau(){
    }
    public bureau(int c,String nom,chercheur ch[]){
        code=c;
        nomb=nom;
        cherchb=new chercheur[5];
        cherchb=ch;}
    void affichebureau(){
        System.out.println(" code= " +code+ "nom = "+nomb);
        int i;
        int n=this.cherchb.length;
        for(i=0;i<n;i++){

            cherchb[i].affichchercheur();


        }



    }




}
