/**
 * Created by RabahLordImed on 07/10/2016.
 */
public abstract class Rectangle extends Tout {

    double longueur;
    double largueur;


    public Rectangle(){
    }


    public void rectangle(double l,double h){
        this.longueur=l;
        this.largueur=h;
    }
    //Les Getteurs
    public double getLongueur(){
        return longueur;
    }

    public double getLargueur(){
        return largueur;
    }

    //Les Setteurs
    public void setLongueur(double longueur){
        this.longueur=longueur;
    }

    public void setLargueur(double largueur){
        this.largueur=largueur;
    }


    public double getsurfaceRec(){
        return (this.largueur*this.longueur);
    }
}
