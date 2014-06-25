/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Logistica.fia
 */
public class Distrito {
    private int idd;
    private int idr;
    private String dist;
    private String estado;

    public Distrito() {
    }

    public Distrito(int idr, String dist, String estado) {
        this.idr = idr;
        this.dist = dist;
        this.estado = estado;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public static Distrito loadDistrito(ResultSet rs) throws SQLException{
    Distrito d = new Distrito();
    d.setIdd(rs.getInt("iddistrito"));
    d.setIdr(rs.getInt("idregion"));
    d.setDist(rs.getString("distrito"));
    d.setEstado(rs.getString("estado"));
    return d;
    
    }
}
