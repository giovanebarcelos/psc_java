package aula22;

public class AlunoTeste {

	public static void main(String[] args) throws Exception {
		Aluno aluno = new Aluno(1, "Dick Vigarista", "PSC");
		
		//aluno.salvar();
		
		Aluno aluno_ret = aluno.pesquisar(1);
		System.out.println(aluno_ret.getNome());
	}

}
