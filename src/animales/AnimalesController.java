/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAOanimales.DAOanimales;

/**
 *
 * @author dafer
 */
public class AnimalesController implements DAOanimales{
    
    private static AnimalesController instancia;
    private String[][] animales;
    private int cAnimal;
    private boolean animalEliminado;
    
    public static AnimalesController getInstance(){
        if(instancia == null)
            instancia = new AnimalesController();
        return instancia;
    }
    
    private AnimalesController(){
        this.animales=new String[6][100];
        this.cAnimal=0;
        animalEliminado=false;
    }
    
    @Override
    public boolean GuardarAnimal(String cpokemon,String npokemon, String tpokemon, String spokemon, String vpokemon, String epokemon){
        
        animales[0][cAnimal]=cpokemon;
        animales[1][cAnimal]=npokemon;
        animales[2][cAnimal]=tpokemon;
        animales[3][cAnimal]=spokemon;
        animales[4][cAnimal]=vpokemon;
        animales[5][cAnimal]=epokemon;
        cAnimal++;
        
        return true;
    }
    
    @Override
    public boolean GuardarAnimal(String[] pokemon) {
        animales[0][cAnimal]=pokemon[0];
        animales[1][cAnimal]=pokemon[1];
        animales[2][cAnimal]=pokemon[2];
        animales[3][cAnimal]=pokemon[3];
        animales[4][cAnimal]=pokemon[4];
        animales[5][cAnimal]=pokemon[5];
        cAnimal++;
        
        return true;
    }

    @Override
    public DefaultTableModel MostrarAnimales() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        //creo los encabezados de la tabla
        modelo.addColumn("Codigo");
        modelo.addColumn("Animal");
        modelo.addColumn("Especie");
        modelo.addColumn("Sexo");
        modelo.addColumn("Domestico");
        modelo.addColumn("Peso");
        
        //agregando filas al modelo
        
        for(int i=0;i<cAnimal;i++){
            String[] animal=new String[6];
            for(int j=0;j<6;j++){
                //System.out.println("codigo "+animales[i][j]+": nombre: "+animales[i][j]);
                if(animales[j][i] != null)
                    animal[j]=animales[j][i];
            }
            modelo.addRow(animal);
        }
        return modelo;
    }

    @Override
    public boolean ActualizarAnimal(String[] animal) {
        int fila=0;
        for(int i=0;i<cAnimal;i++){
            if(animales[0][i]==animal[0]){
                fila=i;
                break;
            }
        }
        animales[1][fila]=animal[1];
        animales[2][fila]=animal[2];
        animales[3][fila]=animal[3];
        animales[4][fila]=animal[4];
        animales[5][fila]=animal[5];
        return true;
    }

    @Override
    public void EliminarAnimal(int codigo) {
         if( cAnimal>=1)
       {
            
            int seleccion = JOptionPane.showConfirmDialog(null,"seguro desea eliminar el animal de nombre: "+animales[1][codigo], "confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            System.out.println(seleccion);
            if(seleccion==0)
            {
                for (int i=codigo;i<100;i++)
                {
                    for(int j=0;j<6;j++)
                    {
                
                        if(animales[j][i] !=null)
                        {
                            animales[j][i]=animales[j][codigo+1];   
                        }
                    }
                    codigo++;
                }
                cAnimal--;
                JOptionPane.showMessageDialog(null,"eliminado exitoso");
            }
        }
       
       else
       {
            JOptionPane.showMessageDialog(null, "no hay animales para eliminar");   
       }
    }

    
}
