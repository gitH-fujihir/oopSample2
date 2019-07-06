public class PrefectureGet2 {
    private String name = null;
    private int population = 0;

    public PrefectureGet2(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}
