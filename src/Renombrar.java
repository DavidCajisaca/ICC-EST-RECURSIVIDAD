import java.io.File;

public class Renombrar {
    public void renombrardirectorio(String path) {
        //validar que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists()|| !directorio.isDirectory()){
            System.out.println("La ruta no es un directorio");
            return;
        }
        //Cambiar los nombres
        System.out.println("La ruta path es valida ");
    }
}
