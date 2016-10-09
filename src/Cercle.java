/**
 * Created by RabahLordImed on 07/10/2016.
 */
public abstract class Cercle extends Tout {
    double rayon;

    public Cercle() {
    }

    public void cercle(double r) {
        this.rayon = r;
    }

    //Les Getteurs

    public double getRayon() {
        return rayon;
    }


    //Les Setteurs

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getSurfaceCer() {
        return ((Math.PI) * (Math.pow(rayon, 2)));
    }
}

