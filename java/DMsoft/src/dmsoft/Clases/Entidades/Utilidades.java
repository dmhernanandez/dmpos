
package dmsoft.Clases.Entidades;

import dmsoft.Formularios.FrmMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;



public class Utilidades {
    //Constantes utilizadas por los formularios
    public static final int DEFAULT=0;
    public static final int GUARDAR=1;
    public static final int ACTUALIZAR=2;
    public static final int NUEVO=3;
    public static final int EDITAR=4;
    public static final int REGRESAR=5; 
    public static final int SALIR=6;
    public static final int HOME=7;
    public static final int ELIMINAR=8;
    public static final int REALIZADO=9;
    public static final int ERROR=10;
      public static final int TIENE_RELACION=11;

    private boolean changed=false;

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

  
  
 
    
    //Este metodo sirve para detectar cuando se ha realizado un cambio en los datos
    public boolean onChange(KeyEvent evento)
    {
      int codigo=evento.getKeyCode();  
      if(Character.isAlphabetic(codigo) ||
              Character.isDigit(codigo)||
              codigo==KeyEvent.VK_SPACE||
              codigo==KeyEvent.VK_TAB||
              codigo==KeyEvent.VK_DELETE||
              codigo==KeyEvent.VK_BACK_SPACE)             
      return true;
      else
       return false;
    }
    
    
    //Con este metodo obtemos el cambio en un comboBox
   //La variable tipo acccion sera sera true si esta seleccionando de lo contrario sera false
    public boolean onChange(ItemEvent itemEvent)
    {
       boolean result=false;
       if(itemEvent.getStateChange() == ItemEvent.SELECTED) 
           result=true;
       return result;
    }
    //Este metodo esta sobrecargado para utilizarlo con eventos del mouse
    public boolean onChange(MouseEvent eventMouse){
        if(eventMouse.getButton()==MouseEvent.BUTTON1)
            return true;
        else 
            return false;
    }

   //Este metodo da formato a la cabecera de la tabla
    public void setTableHeader(JTable tabla)
    {
        JTableHeader headerTable=tabla.getTableHeader();
        Font fuente=new Font("Segoe UI Semibold",Font.PLAIN, 14);
        headerTable.setFont(fuente);
    }
    //Creamos un metodo de parametros variables
    public boolean validarSalida(boolean ... variables)
    {
        //Obtememos el primer valor
        boolean resultado=variables[0];
        for(int i=1;i<variables.length;i++){
            resultado=(resultado||variables[i]);
        }
        
        return resultado;
    }
    
    public boolean validarCampos(String ... campos){
      boolean resultado=false;
        for(String campo: campos){
            if(campo.equals("")|| campo==null)
            {
                resultado=true;
                break;
            }
             
        }
        return resultado;
    }
    /*Este metodo nos servira para agregar cambiar componentes, es decir que limpia el componente 
    padre y agrega un nuevo componente hijo
    */
    public void cambiarComponente(JPanel componentePadre, JPanel componenteHijo)
    {     //Comprobamos que el componente padre tengo elementos si no tiene enteces solo agregamos el componente
          if(componentePadre.getComponentCount()<=0)
          {
              componentePadre.add(componenteHijo,BorderLayout.CENTER); 
          }
          /*Comprobamos que el componente que se esta agregando sea diferente al que esta agregado
          de lo contrario lo contrario no removera el actual*/
          else if(!componentePadre.getComponent(0).getName().equals(componenteHijo.getName()))  
          {
             componentePadre.removeAll();
             componentePadre.add(componenteHijo,BorderLayout.CENTER);
             componentePadre.revalidate();
             componentePadre.repaint();
          }
     
    }
    
    /*Sobrecargamos el metodo Anterior pero esta ves pasamos como parametro un JTabbedPane
    como componente padre y un titulo para gregarlo
    */
    public void cambiarComponente(JTabbedPane tabbedPane, JPanel panel,String titulo)
    {
       //Validamso que tenga elementos para poder limpiarlo, de lo contrario solo se agrega el panel
         if(tabbedPane.getComponentCount()>0)
         {
            tabbedPane.removeAll();
            tabbedPane.add(panel);
            tabbedPane.setTitleAt(0, titulo);
         }
         else
         {
            tabbedPane.add(panel);
            tabbedPane.setTitleAt(0, titulo);
         }
         
    }
    //Con este metodo agregmos un JInternalFrame al JDesktopPane pero validamos que solo sea uno a la vez
    public void cambiarComponente(JDesktopPane desktopPane,JInternalFrame internalFrame){
        //Obtenemos el numero de componentes que tiene el JDesktopPane
      int componentCount=desktopPane.getAllFrames().length;
      //Si  componentCount es 0 entonces solo agregamos el internal Frame ya que el DesktopPane esta vacio
      if(componentCount==0)
        {
            desktopPane.add(internalFrame,BorderLayout.CENTER);
            internalFrame.show();
            desktopPane.repaint();  
            desktopPane.revalidate();
        }

         else if(!desktopPane.getAllFrames()[0].getName().equals(internalFrame.getName())) 
       {
           /*Obtengo el InternalFrame que esta mostrandose actualmente, con el metodo getAllFrames
           que retorna un arreglo de todos los frames que estan abiertos, en esta caso, siempre
           sera 2 por lo tanto solo se obtiene el que esta en la posicion 1 ya que el proposito de es
           este metodo es evitar que se desplegue mas de uno a la vez y lo cerramos */
            desktopPane.getAllFrames()[0].dispose();
            desktopPane.add(internalFrame,BorderLayout.CENTER);
            internalFrame.show();
            desktopPane.repaint(); 
            desktopPane.revalidate();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "El formulario ya esta agregado");
        }
    }
    
    //Con este metodo cambiamos el background de un boton cuando tiene el foco
    public void setBackgroundFocused(JButton boton)
    {
       boton.setOpaque(true);
       boton.setBackground(new Color(225, 245, 254));
    }
    
    public void setBackgroundDefocused(JButton boton){
        boton.setOpaque(false);
    }
    
    //Con este metodo validamos que todo lo que ingrese sea un numero y no letras
    public boolean validarEntrada(char caracter)
    {
        return Character.isDigit(caracter)||caracter=='.';
    }
    
}
