import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InscripcionTest {
    private Materia algoritmosYEstructurasDeDatos;
    private Materia paradigamasDeLaProgramacion;
    private Materia disenioDeSistemas;
    private Alumno bruno;

    @BeforeEach
    public void setUp(){
        List<Materia> listaCorrelativasVacia = new ArrayList<Materia>();
        algoritmosYEstructurasDeDatos = new Materia("algoritmos",listaCorrelativasVacia);

        List<Materia> listaDecorrelativasParadigmas = new ArrayList<>();
        listaDecorrelativasParadigmas.add(algoritmosYEstructurasDeDatos);
        paradigamasDeLaProgramacion = new Materia("paradigmas",listaDecorrelativasParadigmas);

        List<Materia> listaDecorrelativasDisenio = new ArrayList<>();
        listaDecorrelativasDisenio.add(paradigamasDeLaProgramacion);
        disenioDeSistemas = new Materia("disenio",listaDecorrelativasDisenio);

        bruno = new Alumno(1111, List.of(algoritmosYEstructurasDeDatos));

        System.out.print(bruno.getLegajo().toString());
    }

    @Test
    @DisplayName("Test de Inscripcion aprobada")
    public void aprobada() {
        Inscripcion inscripcion = new Inscripcion(bruno, List.of(paradigamasDeLaProgramacion));
        System.out.print(inscripcion.getAlumnoSolicitante().getLegajo().toString());
        //El getter en la clase indica que todos los atributos van a tener su get, pero arriba del campo solo el atributo debajo lo tendra

        for(Materia materia : inscripcion.getSolicitudDeMaterias()){
            System.out.print(materia.getNombre());
        }
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void desaprobada(){

        Inscripcion inscripcion = new Inscripcion(bruno, List.of(disenioDeSistemas));

        assertFalse(inscripcion.aprobada());
    }
}