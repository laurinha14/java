public class Pessoa{
      String nome;
      int idade;
      boolean vivo;
}
void status(){

    System.out.println("meu nome é:"+this.nome)
    System.out.println("eu estou:"+this.vivo)

}
void vivo(){
    this.vivo=true;
}
void morto (){
    this.vivo=false;
}
void falar(){

    if (this.vivo=true){
        System.out.println("pode falar")
    }
    else{
        System.out.println("nao pode falar")
    }
}