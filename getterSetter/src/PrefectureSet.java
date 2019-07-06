public class PrefectureSet {
    private String name = null;
    private int population = 0;

    public PrefectureSet(String name, int population){
        this.setName(name);
        this.setPopulation(population);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
