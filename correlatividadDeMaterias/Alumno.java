import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {
    public ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();

    public Alumno(Materia materias){
        this.materiasAprobadas.add(materias);
    }
    public void agregarMateria(Materia unaMateria){
        this.materiasAprobadas.add(unaMateria);
    }
}
