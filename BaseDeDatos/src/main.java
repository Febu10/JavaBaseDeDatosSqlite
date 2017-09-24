import java.sql.SQLException;

public class main {
	static String nombreTabla="alumno";
	public static void main(String[] args) throws SQLException  {
		sqlite  miBaseDb=new sqlite();
		miBaseDb.conectar();
		miBaseDb.crearTabla(nombreTabla);
		miBaseDb.insertaDatos(17, "Jose", "Ojeda","Bien");
		miBaseDb.insertaDatos(18, "Juan", "Martin","Bien");
		miBaseDb.consultaDatos(nombreTabla);
		miBaseDb.ActualizarDatos(nombreTabla, 2, "Notable");
		miBaseDb.consultaDatos(nombreTabla);
		miBaseDb.BorrarDatos(nombreTabla, 17);
		miBaseDb.consultaDatos(nombreTabla);
	}

}
