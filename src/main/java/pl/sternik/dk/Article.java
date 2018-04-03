package pl.sternik.dk;

public class Article {

    private int id;
    private String nazwa;
    private String opis;
    private double cena;

    public Article(int id, String nazwa, String opis, double cena) {
        this.id = id;
        this.cena = cena;
        this.opis = opis;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public double getCena() {
        return cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", cena=" + cena +
                '}';
    }

    public static void main(String args[]){
        Article article = new Article(1,"nazwa","brak",0.99);
        System.out.println(article.toString());
    }

}
