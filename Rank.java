public class Rank {

    private String name;

    public Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "name='" + name + '\'' +
                '}';
    }
}
