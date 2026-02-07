package mediatheque.godin.qc.ca;

public class Livre {
    // variables d'instance privees
    private String titre;
    private String auteur;
    private int anne;
    private boolean emprunte;

    public Livre(String titre, String auteur, int anne, boolean emprunte){

        this.titre = titre;
        this.auteur = auteur;
        this.anne = anne;
        this.emprunte = emprunte;
    }

    public String getTitre(){
        return titre;
    }

    public String getAuteur(){
        return auteur;
    }

    public int getAnne(){
        return anne;
    }

    public boolean estEmprunte(){
        return emprunte;

    }

}
