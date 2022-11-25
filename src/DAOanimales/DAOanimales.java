/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOanimales;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dafer
 */
public interface DAOanimales {
    public boolean GuardarAnimal(String canimal,String nanimal, String tanimal, String sanimal, String vanimal, String eanimal);
    public boolean GuardarAnimal(String[] animal);
    public DefaultTableModel MostrarAnimales();
    public boolean ActualizarAnimal(String[] animal);
    public void EliminarAnimal(int codigo);
}
