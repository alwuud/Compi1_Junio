/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author alwud
 */ 
public class Expresion implements Sentencia{
    
    
    /**
     * Operadores, que participan en las distintas operaciones pueden existir de un solo operador
     */
    public Expresion izquierda;
    public Expresion derecha;
    
    /**
     * El valor que se obtiene en la operacion en un momento dado
     * 
     */
    private Object valor;
    public boolean reducida;
    TipoExp tipo;
    
    
    public enum TipoExp{
        SUMA, RESTA, MULTIPLICACION, DIVISION, POTENCIA, NOT, AND, OR, NAND, NOR, XOR,ID,
       BOOLEANO,  CARACTER,ENTERO, DECIMAL,  CADENA
    }
    
    public Expresion(Expresion izq, Expresion der, TipoExp t){
        izquierda= izq;
        derecha= der;
        tipo= t;
    }
    
    /**
     * CONSTRUCTOR para  Cadena o Identificador
     * 
     * @param a: Contenido de una cadena o identificador
     * @param t: Tipo de Expresion
     */
    
    public Expresion(Object a, TipoExp t){
        
        this.valor=a;
        this.tipo= t;
        if(t!=TipoExp.ID)
            this.reducida= true;
        
        
    
    }
    
    public TipoExp getTipo(TablaSimbolos ambito, TablaSimbolos global){
        if(tipo== TipoExp.ID){
            
            
            
            Simbolo sim;
            sim= ambito.getSimbolo(this.valor.toString());
            if(sim!=null)
                return sim.getTipo();
            
            sim= global.getSimbolo(this.valor.toString());
            
            if(sim!=null)
                return sim.getTipo();
            
            return null;
            
            
        }else{
           return this.tipo;
        }
        
        
    }
    
    public Object getValor(){
        return this.valor;
    }
    
   
    
 
    

    

           

    @Override
    public boolean ejecutar(TablaSimbolos ambito, TablaSimbolos global) {
          TipoExp operar;
          
          if(izquierda!=null && !izquierda.reducida)
              izquierda.ejecutar(ambito, global);
          if(derecha!=null && !derecha.reducida)
              derecha.ejecutar(ambito, global);
                
          
          
          
          switch (tipo) {
              case ID:
                if(idValue(ambito, global))
                    this.reducida=true;
                return reducida;
                    
              case SUMA:
                 operar= jerarquia(izquierda, derecha, ambito, global);
                 operarSuma(operar);
                 break;
              case RESTA:
                  break;
              case MULTIPLICACION:
                  break;
              case DIVISION: 
                  break;
              case POTENCIA:
                  break;
                  
              default:
                  
                
          }
          return true;
    }
    
    
    private boolean operarSuma(TipoExp tipo){
        switch(tipo){
            case CADENA:
                String a= Casteo.aCadena(this.izquierda);
                String b= Casteo.aCadena(this.derecha);
                if(a!=null && b!=null){
                    this.valor= a + b;
                    this.tipo= tipo;
                    return true;
                }
                return false;
            case DECIMAL:
                Double c= Casteo.aDecimal(this.izquierda);
                Double d= Casteo.aDecimal(this.derecha);
                if(c!=null && d!=null){
                    this.valor= c+d;
                    this.tipo= tipo;
                    return true;
                }                
                return false;
                
            case ENTERO:
                Integer e= Casteo.aEntero(this.izquierda);
                Integer f= Casteo.aEntero(this.derecha);
                if(e!=null && f!=null){
                    this.valor=  e+f;
                    this.tipo= tipo;
                    return true;
                }
                return false;
                
            case CARACTER:
                Integer g= Casteo.aEntero(this.izquierda);
                Integer h= Casteo.aEntero(this.derecha);
                if(g!=null && h!=null){
                    this.valor=  (char) (g+h);
                    this.tipo= tipo;
                    return true;
                }
                return false;
            case BOOLEANO:
                Boolean i= Casteo.aBooleano(this.izquierda);
                Boolean j= Casteo.aBooleano(this.derecha);
                
                if(i!=null && j!= null){
                    this.valor= i|| j;
                    this.tipo= tipo;
                    return true;
                }
                return false;
            default:
                return false;
                
                   
        }
        
    
        
    
        
    }
    
    
    
    private  boolean  idValue(TablaSimbolos ambito, TablaSimbolos global){
        if(tipo== TipoExp.ID){
  
            Simbolo sim;
            sim= ambito.getSimbolo(this.valor.toString());
            if(sim!=null){
                this.valor= sim.getValor();
                this.tipo= sim.getTipo();
                
                return true;
                        
            }

            sim= global.getSimbolo(this.valor.toString());
            
            if(sim!=null){
                this.valor= sim.getValor();
                this.tipo= sim.getTipo();
                
                return true;
            }
            
            return false;


        }
        return false;
    }
    
    
    
    
    
    private TipoExp jerarquia(Expresion e1, Expresion e2, TablaSimbolos ambito, TablaSimbolos global){
       
        if(e1.getTipo(ambito, global) == TipoExp.CADENA || e2.getTipo(ambito, global)== TipoExp.CADENA){
            return TipoExp.CADENA;
        }
        
        
         if(e1.getTipo(ambito, global) == TipoExp.DECIMAL || e2.getTipo(ambito, global)== TipoExp.DECIMAL){
            return TipoExp.DECIMAL;
        }

         if(e1.getTipo(ambito, global) == TipoExp.ENTERO    || e2.getTipo(ambito, global)== TipoExp.ENTERO){
            return TipoExp.ENTERO;
        }
        
         if(e1.getTipo(ambito, global) == TipoExp.CARACTER || e2.getTipo(ambito, global)== TipoExp.CARACTER){
            return TipoExp.CARACTER;
        }
        
         if(e1.getTipo(ambito, global) == TipoExp.BOOLEANO || e2.getTipo(ambito, global)== TipoExp.BOOLEANO){
            return TipoExp.BOOLEANO;
        }
         
         
        return null;
        
    }
    
    
    
    
    
    
    
}
