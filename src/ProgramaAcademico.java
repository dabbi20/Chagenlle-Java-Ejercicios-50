public class ProgramaAcademico {
    private String codigo;
    private String nombre;
    private String facultad;
    private  int creditos;

    public ProgramaAcademico(String codigo,String nombre,String facultad,int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
        this.creditos = creditos;
    }

    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public String getFacultad(){return  facultad;}
    public int getCreditos(){return  creditos;}


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFacultad(String facultad){
        this.facultad = facultad;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

    public void mostrarInformacion(){
        System.out.println("******************************");
        System.out.println("El estudiante con nombre: " + nombre);
        System.out.println("Estudia en la facultad: " + facultad);
        System.out.println("En la materia de Java con el codigo: " + codigo);
        System.out.println("La materia cuenta con esta cantidad de creditos: " + creditos);
        System.out.println("******************************");
    }

    static void main(String[] args) {
        var studen1 = new ProgramaAcademico("001","David","Dev Senior",12);
        studen1.mostrarInformacion();
    }
}
