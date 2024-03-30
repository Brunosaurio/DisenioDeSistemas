import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @org.junit.jupiter.api.Test
    void aprobada() {
        List<Materia> listaCorrelativasVacia = new ArrayList<Materia>();
        Materia algoritmosYEstructurasDeDatos = new Materia("algoritmos",listaCorrelativasVacia);
        List<Materia> listaDecorrelativasParadigmas = new ArrayList<>();
        listaDecorrelativasParadigmas.add(algoritmosYEstructurasDeDatos);
        Materia paradigamasDeLaProgramacion = new Materia("paradigmas",listaDecorrelativasParadigmas);
        List<Materia> listaDecorrelativasDisenio = new ArrayList<>();
        listaDecorrelativasDisenio.add(paradigamasDeLaProgramacion);
        Materia disenioDeSistemas = new Materia("disenio",listaDecorrelativasDisenio);


        List<Materia> listaDeMaterias = new ArrayList<>();
        listaDeMaterias.add(algoritmosYEstructurasDeDatos);
        listaDeMaterias.add(disenioDeSistemas);

        Alumno alumno1 = new Alumno((algoritmosYEstructurasDeDatos));
        alumno1.materiasAprobadas.add(paradigamasDeLaProgramacion);

        Inscripcion inscripcion = new Inscripcion();

        assertTrue(inscripcion.aprobada(alumno1, listaDeMaterias));

    }
}