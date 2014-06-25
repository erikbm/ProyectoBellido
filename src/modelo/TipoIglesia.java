/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesia {
    private int idti;
    private String nombtipo;

    public TipoIglesia() {
    }

    public TipoIglesia(String nombtipo) {
        this.nombtipo = nombtipo;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNombtipo() {
        return nombtipo;
    }

    public void setNombtipo(String nombtipo) {
        this.nombtipo = nombtipo;
    }
    
    
}
