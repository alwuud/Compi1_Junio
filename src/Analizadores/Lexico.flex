

package Analizadores;
import java_cup.runtime.Symbol; 

%% 



%class Lexico
%public 
%line 
%char 
%column
%cup 
%unicode


%xstate multiCom, cadena



%init{ 
    yyline = 1; 
    yycolumn = 1; 
%init} 
 
FinLinea = \r|\n|\r\n
Espacio    =  [ \t\f\b\012]

D=[0-9]+
DD=[0-9]+("."[0-9]+)?
ID=[A-Za-z]+["_"0-9A-Za-z]*
coment =(">>")[^\r\n]*(\r\n) | (">>")[^\r\n]*(\n)
car = (\')[\(-\~](\')

%{
    StringBuffer string = new StringBuffer();
%}


%%


<YYINITIAL>{

    {Espacio} {} 
    {FinLinea} {yycolumn=1;}
    
    {coment} {}  

    \" {string.setLength(0); yybegin(cadena);}
    


/**
    PALABRAS RESERVADAS 
**/
    
    "Principal"  {return new Symbol(sym.principal,yyline,yycolumn, yytext());} 
    "publico" {return new Symbol(sym.publico,yyline,yycolumn, yytext());} 
    "privado" {return new Symbol(sym.privado,yyline,yycolumn, yytext());}
    "protegido" {return new Symbol(sym.protegido,yyline,yycolumn, yytext());} 
    "conservar"  {return new Symbol(sym.conservar,yyline,yycolumn, yytext());}
    "extiende"  {return new Symbol(sym.extiende, yyline,yycolumn, yytext());}
    "retorna" { return new Symbol(sym.retorna , yyline, yycolumn, yytext());}
    
    "continuar" { return new Symbol(sym.continuar , yyline, yycolumn, yytext());}
    
    "Pintar_Con" {return new Symbol(sym.consola, yyline, yycolumn, yytext());}
    "Pintar_OR" {return new Symbol(sym.circRec, yyline, yycolumn, yytext());}
    "Pintar_P"  {return new Symbol(sym.pto, yyline, yycolumn, yytext());}
    "sino"  {return new Symbol(sym.sino, yyline,yycolumn, yytext());}
    "si"  {return new Symbol(sym.si, yyline,yycolumn, yytext());}

    "comprobar"  {return new Symbol(sym.comprobar, yyline,yycolumn, yytext());}
    
    "caso"  {return new Symbol(sym.caso, yyline,yycolumn, yytext());}
    "defecto"  {return new Symbol(sym.defecto, yyline,yycolumn, yytext());}
    "salir" {return new Symbol(sym.salir, yyline, yycolumn , yytext());}
    "para"  {return new Symbol(sym.para, yyline,yycolumn, yytext());}
    "mientras"  {return new Symbol(sym.mientras, yyline,yycolumn, yytext());}
    "hacer"  {return new Symbol(sym.hacer, yyline,yycolumn, yytext());}
  
    "var" {return new Symbol(sym.var,yyline,yycolumn, yytext());}
    "arreglo" {return new Symbol(sym.arreglo,yyline,yycolumn, yytext());}
    "lienzo" {return new Symbol(sym.lienzo,yyline,yycolumn, yytext());} 
    "int" {return new Symbol(sym.int_,yyline,yycolumn, yytext());} 
    "double" {return new Symbol(sym.double_,yyline,yycolumn, yytext());} 
    "bool" {return new Symbol(sym.bool,yyline,yycolumn, yytext());} 
    "char" {return new Symbol(sym.char_,yyline,yycolumn, yytext());} 

    "false" {return new Symbol(sym.false_,yyline,yycolumn, yytext());}    
    "string" {return new Symbol(sym.string_,yyline,yycolumn, yytext());} 
    "true" {return new Symbol(sym.true_,yyline,yycolumn, yytext());} 





    "<-" {string.setLength(0); yybegin(multiCom);}
    "==" {return new Symbol(sym.igual,yyline,yycolumn, yytext());} 
    "!=" {return new Symbol(sym.distinto,yyline,yycolumn, yytext());} 
    "<=" {return new Symbol(sym.menIgual,yyline,yycolumn, yytext());} 
    ">=" {return new Symbol(sym.mayIgual,yyline,yycolumn, yytext());}
    
    "<" {return new Symbol(sym.men,yyline,yycolumn, yytext());} 
    ">" {return new Symbol(sym.may,yyline,yycolumn, yytext());} 

/**
  OPERADORES LOGICOS  

**/

    "!&&" {return new Symbol(sym.nand ,yyline,yycolumn, yytext());} 
    "!||" {return new Symbol(sym.nor,yyline,yycolumn, yytext());} 
    "&|" {return new Symbol(sym.xor,yyline,yycolumn, yytext());} 
    "||" {return new Symbol(sym.or,yyline,yycolumn, yytext());} 
    "&&" {return new Symbol(sym.and,yyline,yycolumn, yytext());} 
    "!" {return new Symbol(sym.not,yyline,yycolumn, yytext());} 


/*
    OPERADORES ARITMETICOS

*/
    "++" {return new Symbol(sym.inc,yyline,yycolumn, yytext());}   
    "--" {return new Symbol(sym.decre,yyline,yycolumn, yytext());} 
    "+" {return new Symbol(sym.mas,yyline,yycolumn, yytext());} 
    "-" {return new Symbol(sym.menos,yyline,yycolumn, yytext());} 
    "*" {return new Symbol(sym.por,yyline,yycolumn, yytext());} 
    "/" {return new Symbol(sym.div,yyline,yycolumn, yytext());} 
    "^" {return new Symbol(sym.pot,yyline,yycolumn, yytext());}     
    "%" {return new Symbol(sym.mod,yyline,yycolumn, yytext());} 


/*
    LENGUAJE
    
*/
    "$" {return new Symbol(sym.fin,yyline,yycolumn, yytext());} 
    "¿" {return new Symbol(sym.ape,yyline,yycolumn, yytext());} 
    "?" {return new Symbol(sym.cie,yyline,yycolumn, yytext());} 
    "(" {return new Symbol(sym.parIzq,yyline,yycolumn, yytext());} 
    ")" {return new Symbol(sym.parDer,yyline,yycolumn, yytext());} 
    "," {return new Symbol(sym.coma, yyline, yycolumn, yytext());}
    "+=" {return new Symbol(sym.suma, yyline, yycolumn, yytext());}
    "-=" {return new Symbol(sym.resta, yyline, yycolumn, yytext());}
    "[" {return new Symbol(sym.corIzq,yyline,yycolumn, yytext());} 
    "]" {return new Symbol(sym.corDer,yyline,yycolumn, yytext());} 
    "{" {return new Symbol(sym.llaveIzq,yyline,yycolumn, yytext());} 
    "}" {return new Symbol(sym.llaveDer,yyline,yycolumn, yytext());} 
    ";" {return new Symbol(sym.ptoComa, yyline,yycolumn, yytext());}
    ":" {return new Symbol(sym.dosPtos,yyline,yycolumn, yytext());} 
    "=" {return new Symbol (sym.asigna, yyline, yycolumn, yytext());}
    {ID} {return new Symbol(sym.id,yyline,yycolumn, yytext());} 
    {D} {return new Symbol(sym.ent,yyline,yycolumn, yytext());} 
    {DD} {return new Symbol(sym.dec,yyline,yycolumn, yytext());} 
    {car} {return new Symbol(sym.car, yyline, yycolumn, yytext());}
    . {return new Symbol(sym.errar, yyline, yycolumn,yytext() );}
}

<cadena>{
    \"  {
            yybegin(YYINITIAL);
            return new Symbol(sym.cadena, yyline, yycolumn , string.toString());
        }

    "##"   { string.append('#'); }
    \#t  { string.append('\t'); }
    \#n  { string.append('\n'); }
    \#r  { string.append('\r'); }
    \#\"  { string.append('\"'); } 


    [ˆ\n\r\"] { string.append( yytext() ); }


     <<EOF>> {
                yybegin(YYINITIAL); 
                return new Symbol(sym.errar, yyline, yycolumn, string.toString());
            }

    . { 
        string.append(yytext());
        return new Symbol(sym.errar, yyline, yycolumn, string.toString());
      }
}

<multiCom>{
    "->" { yybegin(YYINITIAL);}

    <<EOF>> {
                yybegin(YYINITIAL); 
                return new Symbol(sym.errar, yyline, yycolumn, string.toString());
            }
    . { string.append(yytext());}
    
}