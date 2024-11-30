

public class Robot {


    // public String nome;
    // public String cor;
    // public byte tamanho;
    // public int bateria;
    // public boolean isCarregado; 

    public int xPosition = 0;
    public int yPosition = 0;

    public void falar(){
        System.out.println("Oi");
    }


    public void andar(){
        System.out.println("Parâmetros inválidos, insira os parâmetros corretamente. ( x , y )");
    }

    public void andar(int x){
        System.out.println("Parâmetros inválidos, insira os parâmetros corretamente. ( x , y )");
    }
    
    public void andar(int x, int y){
        this.xPosition = this.xPosition + x;
        this.yPosition = this.yPosition + y;

        System.out.println("O robô agora está na posição: ( " + this.xPosition + " , " + this.yPosition + " )");
    }


    

}
