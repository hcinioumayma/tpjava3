public class adresse {
    public String couv;
    public String ville;
    public int codpost;

    public adresse(){
        couv="";
        ville="";
        codpost=0;}
    public adresse( String v,String c,int code){
        couv=c;
        ville=v;
        codpost=code;}


    public void afficheadress(){

        System.out.println(ville+"/"+couv+"/"+codpost);


    }
    public void modifier(int c){

        codpost=c;




    }








}

