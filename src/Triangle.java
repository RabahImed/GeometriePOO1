/**
 * Created by RabahLordImed on 07/10/2016.
 */
public class Triangle extends Tout {
    public Triangle(){
    }

    public Triangle(double x,double y){
        this.longueur=x;
        this.hauteur=y;
    }


    //getter Triangle
    public double getlongueur(){
        return longueur;
    }

    public double gethauteur(){
        return hauteur;
    }
    //setter Triangle

    public void setlongeur(double longueur){
        this.longueur=longueur;
    }

    public void sethauteur(double hauteur){
        this.hauteur=hauteur;
    }

    public double getsurfaceT() {
        return this.gethauteur() * this.getlongueur() / 2;
    }

    @Override
    double surface() {
        // TODO Auto-generated method stub
        return 0;
    }


}
