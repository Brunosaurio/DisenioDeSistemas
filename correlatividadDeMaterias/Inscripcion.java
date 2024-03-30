import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    public boolean aprobada(Alumno alumno, List<Materia> materiasAInscribirse){
        boolean puedeInscribirse = true;
        for (Materia materia : materiasAInscribirse){
            //System.out.print(materia.getNombre());
            puedeInscribirse = alumno.materiasAprobadas.containsAll(materia.aprobadasParaCursar());
            if (!puedeInscribirse) break;
        }
        return puedeInscribirse;
    }
}
