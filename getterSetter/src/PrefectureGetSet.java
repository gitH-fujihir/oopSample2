public class PrefectureGetSet {
    private String name = null;
    private int population = 0;

    public PrefectureGetSet(String name, int population){
        this.setName(name);
        this.setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
