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
        renombrardirectoriointerno(directorio);
    }
    public void renombrardirectoriointerno(File directorio){
        //Listar todos los archivos del directorio
        File[] directorioInterno =directorio.listFiles();
        if(directorioInterno==null){
            return;
        } 
        for (File archivo : directorioInterno) {
            if(archivo.isDirectory()){
                String nombreoriginal = archivo.getName();
                String nuevoNombre = "Nuevo"+nombreoriginal;
                File nuevodirectorio = new File(archivo.getParent(),nuevoNombre);
                if(archivo.renameTo(nuevodirectorio)){
                    renombrardirectoriointerno(nuevodirectorio);

                }
            }
        } 
    }
}
