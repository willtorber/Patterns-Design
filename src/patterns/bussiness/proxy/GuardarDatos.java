package patterns.bussiness.proxy;

public class GuardarDatos implements IGuardar {

	@Override
	public void guardarTest(String resultado) {
		// TODO Auto-generated method stub
		if(ConnectionManager.hayConexion()){
			new ObjetoRemoto().guardarTest(resultado);
		}else{
			new GuardarDiscoDuro().guardarTest(resultado);
		}
		
	}

}
