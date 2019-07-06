public class PrefectureSet2 {
    private String name = null;
    private int population = 0;

    public PrefectureSet2(String name, int population){
        this.setName(name);
        this.setPopulation(population);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    private void setPopulation(int population) {
        this.population = population;
    }
}
