
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jun 27 14:25:42 CST 2017
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jun 27 14:25:42 CST 2017
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\011\000\002\003" +
    "\003\000\002\003\003\000\002\003\002\000\002\004\005" +
    "\000\002\004\003\000\002\005\004\000\002\005\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\007\011\000\002\007\010\000\002\012\003\000\002\012" +
    "\002\000\002\014\005\000\002\014\004\000\002\015\006" +
    "\000\002\015\004\000\002\013\003\000\002\013\003\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\016\003\000\002\016\003\000\002\016\003\000\002\016" +
    "\003\000\002\016\003\000\002\016\003\000\002\016\003" +
    "\000\002\016\003\000\002\016\002\000\002\010\010\000" +
    "\002\010\007\000\002\025\005\000\002\025\003\000\002" +
    "\026\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\103\000\010\005\007\006\006\031\ufffd\001\002\000" +
    "\004\031\011\001\002\000\004\002\010\001\002\000\004" +
    "\031\ufffe\001\002\000\004\031\uffff\001\002\000\004\002" +
    "\001\001\002\000\004\103\012\001\002\000\004\103\014" +
    "\001\002\000\006\066\016\072\015\001\002\000\006\066" +
    "\ufffb\072\ufffb\001\002\000\004\103\105\001\002\000\022" +
    "\010\020\030\ufff2\032\ufff2\033\ufff2\034\ufff2\035\ufff2\040" +
    "\ufff2\103\ufff2\001\002\000\024\010\ufff6\030\ufff6\032\ufff6" +
    "\033\ufff6\034\ufff6\035\ufff6\040\ufff6\067\ufff6\103\ufff6\001" +
    "\002\000\020\030\ufff3\032\ufff3\033\ufff3\034\ufff3\035\ufff3" +
    "\040\ufff3\103\ufff3\001\002\000\024\010\ufff9\030\ufff9\032" +
    "\ufff9\033\ufff9\034\ufff9\035\ufff9\040\ufff9\067\ufff9\103\ufff9" +
    "\001\002\000\024\010\020\030\ufff2\032\ufff2\033\ufff2\034" +
    "\ufff2\035\ufff2\040\ufff2\067\104\103\ufff2\001\002\000\024" +
    "\010\ufff8\030\ufff8\032\ufff8\033\ufff8\034\ufff8\035\ufff8\040" +
    "\ufff8\067\ufff8\103\ufff8\001\002\000\024\010\ufff7\030\ufff7" +
    "\032\ufff7\033\ufff7\034\ufff7\035\ufff7\040\ufff7\067\ufff7\103" +
    "\ufff7\001\002\000\020\030\031\032\033\033\027\034\030" +
    "\035\032\040\034\103\035\001\002\000\004\103\076\001" +
    "\002\000\004\103\uffec\001\002\000\004\103\uffeb\001\002" +
    "\000\014\032\033\033\027\034\030\035\032\040\034\001" +
    "\002\000\004\103\uffea\001\002\000\004\103\uffed\001\002" +
    "\000\004\103\uffe9\001\002\000\004\070\036\001\002\000" +
    "\016\032\033\033\027\034\030\035\032\040\034\071\054" +
    "\001\002\000\004\066\040\001\002\000\010\010\020\030" +
    "\ufff2\067\uffe0\001\002\000\004\067\uffe7\001\002\000\004" +
    "\067\uffe6\001\002\000\004\067\uffe5\001\002\000\004\067" +
    "\uffe8\001\002\000\004\067\uffe3\001\002\000\004\067\053" +
    "\001\002\000\004\067\uffe4\001\002\000\004\030\031\001" +
    "\002\000\004\067\uffe1\001\002\000\004\067\uffe2\001\002" +
    "\000\024\010\ufff4\030\ufff4\032\ufff4\033\ufff4\034\ufff4\035" +
    "\ufff4\040\ufff4\067\ufff4\103\ufff4\001\002\000\004\066\ufff0" +
    "\001\002\000\004\103\063\001\002\000\006\071\057\072" +
    "\060\001\002\000\004\066\ufff1\001\002\000\014\032\033" +
    "\033\027\034\030\035\032\040\034\001\002\000\004\103" +
    "\062\001\002\000\006\071\uffef\072\uffef\001\002\000\006" +
    "\071\uffee\072\uffee\001\002\000\004\103\066\001\002\000" +
    "\010\041\067\065\072\072\070\001\002\000\010\041\uffdc" +
    "\065\uffdc\072\uffdc\001\002\000\002\001\002\000\004\103" +
    "\074\001\002\000\004\065\073\001\002\000\024\010\uffde" +
    "\030\uffde\032\uffde\033\uffde\034\uffde\035\uffde\040\uffde\067" +
    "\uffde\103\uffde\001\002\000\024\010\uffdf\030\uffdf\032\uffdf" +
    "\033\uffdf\034\uffdf\035\uffdf\040\uffdf\067\uffdf\103\uffdf\001" +
    "\002\000\010\041\uffdd\065\uffdd\072\uffdd\001\002\000\004" +
    "\065\uffdb\001\002\000\004\070\036\001\002\000\004\066" +
    "\100\001\002\000\010\010\020\030\ufff2\067\uffe0\001\002" +
    "\000\004\067\102\001\002\000\024\010\ufff5\030\ufff5\032" +
    "\ufff5\033\ufff5\034\ufff5\035\ufff5\040\ufff5\067\ufff5\103\ufff5" +
    "\001\002\000\024\010\ufffa\030\ufffa\032\ufffa\033\ufffa\034" +
    "\ufffa\035\ufffa\040\ufffa\067\ufffa\103\ufffa\001\002\000\004" +
    "\002\000\001\002\000\006\066\ufffc\072\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\103\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\005\021\006\020\007\022\010\023\011\016\012" +
    "\024\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\006\102\007\022\010\023\011\016\012" +
    "\024\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\025\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\063\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\014\036\001" +
    "\001\000\006\013\054\015\055\001\001\000\002\001\001" +
    "\000\026\010\043\011\040\012\047\016\045\017\041\020" +
    "\042\021\046\022\044\023\051\024\050\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\060\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\025\064\001\001\000\004\026\070\001\001\000\002\001" +
    "\001\000\004\027\074\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\076\001\001\000\002" +
    "\001\001\000\026\010\043\011\040\012\047\016\100\017" +
    "\041\020\042\021\046\022\044\023\051\024\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Variable en la que se almacena el arbol de sintaxis abstracta que se 
     * genera luego del analisis sintáctico.
     */
   
    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
            System.out.println("Error Sintáctico en la Línea " + (s.left) +" Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 
    /**
     * Método al que se llama en el momento en que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
            System.out.println("Error síntactico irrecuperable en la Línea " + (s.left)+ " Columna "+s.right+". Componente " + s.value + " no reconocido."); 
    }  
    /**
     * Método que devuelve el AST que se generó después de realizar el análisis sintáctico. 
     * @return árbol de sintaxis abstacta que será utilizado posteriormente en la ejecución.
     */


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {

     


  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Asg ::= igual EXP 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Asg",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // LVAR ::= id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LVAR",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // LVAR ::= LVAR coma id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LVAR",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Decl ::= Cons var Tipo LVAR fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Decl",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Decl ::= Cons var Tipo LVAR Asg fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Decl",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // CM ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // CM ::= Inv 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // CM ::= Ret 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // CM ::= Whi 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // CM ::= DoW 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CM ::= Swi 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CM ::= Cond 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CM ::= Asig 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CM ::= Decl 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CM",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Tipo ::= string_ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Tipo",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Tipo ::= char_ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Tipo",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Tipo ::= bool 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Tipo",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Tipo ::= double_ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Tipo",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Tipo ::= int_ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Tipo",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // LPARAM ::= Tipo id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LPARAM",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // LPARAM ::= LPARAM coma Tipo id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LPARAM",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // PARAM ::= parIzq parDer 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAM",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // PARAM ::= parIzq LPARAM parDer 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAM",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Cons ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Cons",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Cons ::= conservar 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Cons",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Met ::= Cons id PARAM ape CM cie 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Met",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Met ::= Cons Tipo id PARAM ape CM cie 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Met",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // C2 ::= Asig 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("C2",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // C2 ::= Decl 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("C2",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // C2 ::= Met 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("C2",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // C1 ::= C2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("C1",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // C1 ::= C1 C2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("C1",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Ext ::= id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Ext",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Ext ::= Ext coma id 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Ext",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Vis ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Vis",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Vis ::= privado 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Vis",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Vis ::= publico 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Vis",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= Vis lienzo id Ext ape C1 cie 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
