/**
 * Created by RabahLordImed on 07/10/2016.
 */
public class Carre extends Tout {

    public Carre(){
    }


    public void carre(double l){
        this.longueur=l;
    }
    //Les Getteurs
    public double getLongueur(){
        return longueur;
    }

    //Les Setteurs
    public void setLongueur(double longueur){
        this.longueur=longueur;
    }


    public double getsurfaceCa(){
        return (this.longueur*this.longueur);
    }


    @Override
    double surface() {
        // TODO Auto-generated method stub
        return 0;
    }


}

// extends Rectangle
