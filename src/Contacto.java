public class Contacto {
    private String name;
    private String cell;

    public Contacto(String name,String cell){
        this.name = name;
        this.cell = cell;
    }

    public String getName(){
        return name;
    }

    public String getCell(){
        return cell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
