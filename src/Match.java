import java.time.LocalDate;

public class Match {
    private int id;
    private LocalDate date;
    private String lieu;
    private Combattant first_combattant;
    private Combattant second_combattant;
    private static type type;

    public Match(int id, LocalDate date, String lieu, Combattant first_combattant, Combattant second_combattant) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.first_combattant = first_combattant;
        this.second_combattant = second_combattant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Combattant getFirst_combattant() {
        return first_combattant;
    }

    public void setFirst_combattant(Combattant first_combattant) {
        this.first_combattant = first_combattant;
    }

    public Combattant getSecond_combattant() {
        return second_combattant;
    }

    public void setSecond_combattant(Combattant second_combattant) {
        this.second_combattant = second_combattant;
    }

    public static type getType() {
        return type;
    }

    public static void setType(type type) {
        Match.type = type;
    }


    public static void main(String[] args) {
        Match Mahamasina = new Match(2, LocalDate.of(2025,6,8), "Mahamasina", new Combattant("CB35",
                "RAKOTO",
                "Solofo",
                "Bolo",
                85),

                new Combattant("CB37",
                "ANDRIA",
                "Kely",
                "Bonanga" ,
                85);
    }
}
