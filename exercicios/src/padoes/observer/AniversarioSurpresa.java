package padoes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarOberservador(namorada);
		porteiro.registrarOberservador(evento -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em: " + evento.getMomento());
		});
		porteiro.monitorar();

	}

}
