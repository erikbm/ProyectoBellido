/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Distrito;

/**
 *
 * @author alum.fial7
 */
public class DistritoDAO {
  private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Distrito> ListarDistrito(){
        ArrayList<Distrito> lista = new ArrayList();
        try {            
            cx = Conexion.getConexion();
            sql ="SELECT * FROM distrito";
            st = cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Distrito d = new Distrito();
                d.setIdd(rs.getInt("Iddistrito"));
                d.setIdr(rs.getInt("Idregion"));
                d.setDist(rs.getString("distrito"));
                d.setEstado(rs.getString("estado"));
                lista.add(d);
            }
            
        } catch (SQLException ex) {
            
        }
        return lista;
    }
}
