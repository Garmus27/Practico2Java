package MainProyect;

import java.time.LocalDate;

import java.sql.Date;


public class FuncionesPrograma {

    public static String getFechaString(Date fecha) {

        return  fecha.toString();

    }

    public static  Date getFechaDate(int dia, int mes, int año) {

        LocalDate fecha = LocalDate.of(año, mes,dia );
        Date fechaDAte = Date.valueOf(fecha);

        return fechaDAte;

    }

}
