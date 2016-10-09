/**
 * Created by RabahLordImed on 07/10/2016.
 */
import java.util.*;
public class main {
    public static void main(String[] args){

        Scanner key=new Scanner(System.in);


        //******** Surface Carré *********
        Carre car=new Carre();
        System.out.println("veuiller choisir les diamétres du Carré:");
        System.out.print("La longueur = ");
        double x1=key.nextDouble();car.longueur=x1;
        System.out.println("La surface du Carre est : "+car.getsurfaceCa()+"\n-----------------");


        //******** Surface Triangle *********
        Triangle t=new Triangle();
        System.out.println("veuiller choisir les diamétres du Triangle:");
        System.out.print("La longueur = ");
        double x2=key.nextDouble();t.longueur=x2;
        System.out.print("L'hauteur = ");
        double y2=key.nextDouble();t.hauteur=y2;
        System.out.println("La surface du triangle est : "+t.getsurfaceT()+"\n-----------------");


        //********* Surface du Rectangle ********
        Rectangle rec=new Rectangle();
        System.out.println("veuiller choisir les diamétres du Rectangle:");
        System.out.print("La longueur = ");
        double x3=key.nextDouble();rec.longueur=x3;
        System.out.print("La largueur = ");
        double y3=key.nextDouble();rec.largueur=y3;
        System.out.println("La surface du triangle est : "+rec.getsurfaceRec()+"\n-----------------");


        //********* Surface du Cercle ********
        Cercle C=new Cercle();
        System.out.println("veuiller choisir les diamétres du Cercle:");
        System.out.print("Le rayon = ");
        double x4=key.nextDouble();C.rayon=x4;
        System.out.println("La surface du Cercle est : "+C.getSurfaceCer()+"\n-----------------");
    }


}
