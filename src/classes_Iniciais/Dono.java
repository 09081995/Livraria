package classes_Iniciais;

public class Dono {
	
	private String NomeDoMsr;

	public String getNomeDoMsr() {
		return NomeDoMsr;
	}

	public void setNomeDoMsr(String nomeDoMsr) {
		NomeDoMsr = nomeDoMsr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NomeDoMsr == null) ? 0 : NomeDoMsr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dono other = (Dono) obj;
		if (NomeDoMsr == null) {
			if (other.NomeDoMsr != null)
				return false;
		} else if (!NomeDoMsr.equals(other.NomeDoMsr))
			return false;
		return true;
	}
	
 // System.out.println("caralhooo");

}
	
	
	
	

