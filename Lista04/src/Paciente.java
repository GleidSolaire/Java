import java.util.ArrayList;

/**
 * Classe para representar um paciente em um compromisso.
 * @author 1829799
 *
 */
public class Paciente {
	
	private String codigo;
	
	private String nome;
	
	
	private ArrayList<String> doencas;

	
	
	public Paciente(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.doencas = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getHistorico(){
		
		return this.doencas;
		
	}

	public void addHistorico(String doenca) {
		
		//if(this.doencas == null) {
		//	this.doencas = new ArrayList<>();
		//}
		this.doencas.add(doenca);
	}
}
