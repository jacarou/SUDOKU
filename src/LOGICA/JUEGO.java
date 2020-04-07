package LOGICA;
//Autor Jhony Caro - Abril 2020
public class JUEGO {

    public int[][] matriz_logica;
    public int[][] matriz_visible; 
    public int[] indicadores;
    
    public JUEGO(int p){
        HacerSudoku();
        CrearGuias(p);
    }
    
    private void CrearGuias(int cantidad){
        int contador=0;
        do{
            int x=NumeroRandom(9),y=NumeroRandom(9);
            if (matriz_visible[x][y]==0){
                matriz_visible[x][y]=1;
                ++contador;
            }
        }while(contador!=cantidad);
        
    }
    
    private int NumeroRandom(int p){
        double Aleatorio = Math.random()*(p);
        int result = (int)Aleatorio;    
        return result;
    }
    
    private void IniciarMatrices(){
        matriz_logica = new int[9][9];
        matriz_visible = new int[9][9];
        indicadores = new int[9];
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                matriz_logica[i][j]= 0;
                matriz_visible[i][j]= 0;
            }
            indicadores[i]=0;
        }
    }
    
    public void ImprimirMatrices(){
        System.out.println("MATRIZ LOGICA:");
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(matriz_logica[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\nMATRIZ VISIBLE:");
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(matriz_visible[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    private boolean Validar(){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (matriz_logica[i][j]==0)
                    return false;
            }
        }
        return true;
    }
    
    private void HacerSudoku(){
        boolean finalizar=false;
        do{
            IniciarMatrices();
            HacerCuadro(0,0);
            HacerCuadro(3,0);
            HacerCuadro(6,0);
            HacerCuadro(0,3);
            HacerCuadro(3,3);
            HacerCuadro(6,3);
            HacerCuadro(0,6);
            HacerCuadro(3,6);
            HacerCuadro(6,6);
            finalizar = Validar();
        }while(finalizar==false);
    }
    
    public void ValidarError(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                matriz_visible[i][j]=0;
            }
            indicadores[i]=0;
        }    
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                //Vertical
                for(int m=0;m<9;m++){
                    if(i!=m){
                        if(matriz_logica[m][j]!=0){
                            if(matriz_logica[i][j]==matriz_logica[m][j]){
                                matriz_visible[i][j]=2;
                                matriz_visible[m][j]=2;
                            }
                        }
                    }
                }
                //Horizontal
                for(int n=0;n<9;n++){
                    if (matriz_logica[i][n]!=0){
                        if (j!=n){
                            if(matriz_logica[i][j]==matriz_logica[i][n]){
                                matriz_visible[i][j]=2;
                                matriz_visible[i][n]=2;
                            }
                        }    
                    }
                }
                //Cuadro
                if (j%3==0 && i%3==0 ){
                    //System.out.println(i+" "+j);
                    int indice=0;
                    int[] cuadro = new int[9];
                    for (int m=0;m<3;m++){
                        for (int n=0;n<3;n++){
                            cuadro[indice]=matriz_logica[i+m][j+n];
                            ++indice;
                        }
                    }
                    for(int m=0;m<8;m++){
                        if (cuadro[m]!=0){
                            for(int n=m+1;n<9;n++){
                                if(cuadro[m]==cuadro[n]){
                                    cuadro[m]=10;
                                    cuadro[n]=10;
                                }
                            }
                        }
                    }
                    indice=0;
                    for (int m=0;m<3;m++){
                        for (int n=0;n<3;n++){
                            if(cuadro[indice]==10)
                                matriz_visible[i+m][j+n]=2;
                            ++indice;
                        }
                    }
                }
                //Indicadores
                switch (matriz_logica[i][j]){
                    case 1: 
                        ++indicadores[0];
                    break;
                    case 2: 
                        ++indicadores[1];
                    break;
                    case 3: 
                        ++indicadores[2];
                    break;
                    case 4:
                        ++indicadores[3];
                    break;
                    case 5: 
                        ++indicadores[4];
                    break;
                    case 6:
                        ++indicadores[5];
                    break;
                    case 7: 
                        ++indicadores[6];
                    break;
                    case 8: 
                        ++indicadores[7];
                    break;
                    case 9: 
                        ++indicadores[8];
                    break;
                }
            
            
            
            }
        }
    } 
    
    private boolean HacerCuadro(int x,int y){
        int fin;
        boolean validar;
        for (int i=y;i<=y+2;i++){
            for (int j=x;j<=x+2;j++){
                fin=0;
                do{ 
                    fin++;
                    validar=true;
                    matriz_logica[i][j]= NumeroRandom(9)+1;
                    //Validar verticalmente
                    for (int m=0;m<i;m++){
                        if(matriz_logica[m][j]==matriz_logica[i][j])
                            validar=false;
                    }
                    //Validar horizontalmente
                    for (int n=0;n<j;n++){
                        if(matriz_logica[i][n]==matriz_logica[i][j])
                            validar=false;
                    }
                    //Validacion interna del cuadrante
                    for (int m=y;m<=y+2;m++){
                        for (int n=x;n<=x+2;n++){
                            if(m!=i || n!=j){
                                if(matriz_logica[m][n]==matriz_logica[i][j])
                                    validar=false;
                            }
                        }
                    }
                    if (fin>1000)
                        return false;
                }while(validar==false);
            }
        }    
        return true;
    }    
}
