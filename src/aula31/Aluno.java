package aula31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aluno {
	private Integer id;
	private String nome;
	private String curso;
	private Connection conn;
	
	public Aluno(Connection conn) {
		this.conn = conn;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void incluir(String nome, String curso) throws SQLException {
		String sql = "INSERT INTO ALUNO ( nome, curso ) "+
				               " VALUES ( ?, ? )";
		
		PreparedStatement pstm = 
				conn.prepareStatement(sql);
		pstm.setString(1, nome);
		pstm.setString(2, curso);
		
		pstm.executeUpdate();		
	}
	
	public void consultar(int id) throws Exception {
		String sql = "SELECT * FROM ALUNO "+
	                 " WHERE ID = ?";
		PreparedStatement pstm = 
				conn.prepareStatement(sql);
		pstm.setInt(1, id);
		
		ResultSet rs = pstm.executeQuery();
		
		boolean achei = false;
		
		while (rs.next()) {
			this.setId(rs.getInt("id"));
			this.setNome(rs.getString("nome"));
			this.setCurso(rs.getString("curso"));
			achei = true;
		}
		
		if (!achei) {
			throw new Exception("Id "+id+ 
					             " não encontrado!");
		}
	}	

}
