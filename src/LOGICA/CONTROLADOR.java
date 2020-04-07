
package LOGICA;
//Autor Jhony Caro - Abril 2020
import INTERFAZ.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CONTROLADOR {

    private static boolean validacion;
    private static RECORDS[] mejores;
    
    public static void main(String[] args) throws InterruptedException {
        Recuperar();
        Jugar();
    }
    public static void Jugar () throws InterruptedException{
        GUI_INICIO inicio = new GUI_INICIO(mejores);
        do{
            Thread.sleep(100);
        }while(inicio.estado==0);    
        JUEGO juego = new JUEGO(inicio.cantidad);
        juego.ImprimirMatrices();
        GUI_JUEGO ventana = new GUI_JUEGO(juego);
        do{
            Thread.sleep(100);
            juego.matriz_logica=ventana.matriz_s;
            juego.matriz_visible=ventana.matriz_v;
            juego.ValidarError();
            ventana.matriz_l=juego.matriz_logica;
            ventana.matriz_v=juego.matriz_visible;
            ValidarGanar(ventana.matriz_s, juego.matriz_visible);
        }while(validacion==false);
        ventana.estado=1;
        GUI_FIN fin = new GUI_FIN(ventana.time);
        do{
            Thread.sleep(100);
        }while(fin.estado==0);
        ventana.dispose();
        GuardarCategorias(inicio.cantidad,fin.nombre,ventana.time);
        Jugar();
    }
    public static void GuardarCategorias(int cantidad,String nom,String tiempo){
        switch (cantidad){
            case 25:
                mejores[2].nombre=nom;
                mejores[2].record=tiempo;
            break;
            case 33:
                mejores[1].nombre=nom;
                mejores[1].record=tiempo;
            break;
            case 41:
                mejores[0].nombre=nom;
                mejores[0].record=tiempo;
            break;
        }
        Guardar();
    }
    
    
    public static void ValidarGanar(int[][] m,int[][] m2){
        int suma =0;
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (m2[i][j]!=2)
                    suma+=m[i][j];
            }
        }
        if (suma==405)
            validacion=true;
        else
            validacion=false;
    }
 
    public static void Guardar(){
        String archivo = "Records.txt";
        try{
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(archivo));
            ob.writeObject(mejores);
            ob.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void Recuperar(){
        String archivo = "Records.txt";
        mejores = new RECORDS[3];
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(archivo));
            mejores = (RECORDS[]) is.readObject(); 
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
