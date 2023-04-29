package aula22;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AlunoTeste {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Aluno aluno = new Aluno(1, "Dick Vigarista", "PSC");
		
		aluno.salvar();
	}

}
