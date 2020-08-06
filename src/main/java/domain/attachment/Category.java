package domain.attachment;

public class Category {
    private int id;
    private String name;
    private Sectoin sectoin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sectoin getSectoin() {
        return sectoin;
    }

    public void setSectoin(Sectoin sectoin) {
        this.sectoin = sectoin;
    }
}
