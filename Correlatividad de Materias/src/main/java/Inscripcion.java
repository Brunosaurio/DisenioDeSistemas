import java.util.ArrayList;
import java.util.List;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
public class Inscripcion {
    private Alumno alumnoSolicitante;
    private List<Materia> solicitudDeMaterias;

    public boolean aprobada(){
        boolean puedeInscribirse = true;
        for (Materia materia : solicitudDeMaterias){
            puedeInscribirse = alumnoSolicitante.getMateriasAprobadas().containsAll(materia.getNecesariasParaCursar());
            if (!puedeInscribirse) break;
        }
        return puedeInscribirse;
    }
}
