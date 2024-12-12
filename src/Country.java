public class Country {
    private String name;
    private int population;
    private int square;
    private String capitalName;
    private boolean isSeaside;

    public Country(String name) {
        this.name = name;
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

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isSeaside() {
        return isSeaside;
    }

    public void setSeaside(boolean seaside) {
        isSeaside = seaside;
    }
}
