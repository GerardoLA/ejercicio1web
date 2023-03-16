package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controladores.Conector;

public class ModeloUsuario extends Conector{
	
	
	public ArrayList<Usuario>getUsuarios(){
		ArrayList<Usuario>usuarios=new ArrayList();
		try {
			PreparedStatement pst=con.prepareStatement("SELECT * FROM usuarios");
			ResultSet resultado= pst.executeQuery();
			
			while(resultado.next()){
				Usuario usuario=new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNombre(resultado.getString("Nombre"));
				
				usuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return usuarios;	
		}
}
