public class Computador extends Produto{

    private int hd;
    private int memoria;
    private String processador;

    public void SetHd(int hd){
        this.hd = hd;
    }

    public void SetMemoria(int memoria){
        this.memoria = memoria;
    }

    public void SetProcessador(String processador){
        this.processador = processador;
    }

    public int GetHd(){
        return this.hd;
    }

    public int GetMemoria(){
        return this.memoria;
    }

    public String GetProcessador(){
        return this.processador;
    }


    
}
