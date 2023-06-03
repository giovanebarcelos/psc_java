package aula31;

import java.sql.Connection;

public class AlunoApp {

	public static void main(String[] args) throws Exception {
		Database db = new Database();  
		
		Connection conn = db.getConnection();
		
		Aluno aluno = new Aluno(conn);
		
		String alunos[][] = {
				{"Dick Vigarista", "GTI"},
				{"Muttley", "ADS"}, 
				{"Penépole Charmosa", "Computação"},
				{"Medinho", "Nada"}};
		
		for (String[] _aluno: alunos) {
			aluno.incluir(_aluno[0], _aluno[1]);
		}
		
		aluno.consultar(2);
		System.out.println(aluno.toString());

	}

}
