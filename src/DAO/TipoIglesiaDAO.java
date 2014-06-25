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
import modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
private Connection cx;
private Statement st;
private ResultSet rs;
private String sql;
public ArrayList<TipoIglesia> ListarTipoIglesia(){
    ArrayList<TipoIglesia> lista = new ArrayList();
    try {            
        cx = Conexion.getConexion();
        sql ="SELECT * FROM distrito";
        st = cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            TipoIglesia d = new TipoIglesia();
            d.setIdti(rs.getInt("Idtipo_ilgesia"));
            d.setNombtipo(rs.getString("Idregion"));
            lista.add(d);
        }

    } catch (SQLException ex) {

    }
    return lista;
}
}
