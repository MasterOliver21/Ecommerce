public class Televisao extends Produto{
    
    private double peso;
    private double tamanho;
    private String resolucao;




    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }

    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }

    public double getPeso(double peso){
        return this.peso;
    }
    public double getTamanho(double tamanho){
        return this.tamanho;
    }

    public String getResolucao(){
        return this.resolucao;
    }
    
}
