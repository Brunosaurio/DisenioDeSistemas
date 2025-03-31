import java.util.List;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
public class Materia {

    private String nombre;
    private List<Materia> necesariasParaCursar;

    public void agregarCorrelativa(Materia unaMateria){
        if (necesariasParaCursar.contains(unaMateria)){
            System.out.print("Correlativa ya existente \n");
        }
        else necesariasParaCursar.add(unaMateria);
    }
}
