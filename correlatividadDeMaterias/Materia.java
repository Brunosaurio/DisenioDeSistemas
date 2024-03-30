import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Materia {
    public String nombre;
    public List<Materia> aprobadasParaCursar;

    /*public Materia(String unNombre){
        this.nombre = unNombre;
        System.out.print("Creada materia: "+ nombre + "\n");
    }
    */
    public Materia(String unNombre,List<Materia> listaDeMaterias){
        aprobadasParaCursar = listaDeMaterias;
        this.nombre = unNombre;
        System.out.print("Creada materia: "+ nombre + "\n");
    }
    public String getNombre(){
        return nombre;
    }

    public void agregarCorrelativa(Materia unaMateria){
        if (aprobadasParaCursar.contains(unaMateria)){
            System.out.print("Correlativa ya existente \n");
        }
        else aprobadasParaCursar.add(unaMateria);
    }

    public List<Materia> aprobadasParaCursar() {
        return aprobadasParaCursar;
    }
}
