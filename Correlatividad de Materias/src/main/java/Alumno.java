import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Alumno {

    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia unaMateria){
        this.materiasAprobadas.add(unaMateria);
    }
}
