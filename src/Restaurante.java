
public class Restaurante {
	private Prato prato1;
	private Prato prato2;
	private Prato prato3;
	
	public void mostrarCardapio() {
        System.out.println(prato1.getNome()+"  R$: "+prato1.getPreco()+"\n"+prato1.getDescricao());
        System.out.println(prato2.getNome()+"  R$: "+prato2.getPreco()+"\n"+prato2.getDescricao());
        System.out.println(prato3.getNome()+"  R$: "+prato3.getPreco()+"\n"+prato3.getDescricao());
    }
	
	

	
	
	
	
}
