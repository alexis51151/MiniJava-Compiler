
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\002\000\002\002\004\000\002\002" +
    "\004\000\002\003\005\000\002\003\010\000\002\004\002" +
    "\000\002\004\004\000\002\004\006\000\002\005\002\000" +
    "\002\005\004\000\002\006\005\000\002\007\003\000\002" +
    "\007\003\000\002\007\004\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\013\007\000\002\012\011" +
    "\000\002\014\007\000\002\011\003\000\002\011\004\000" +
    "\002\010\003\000\002\010\005\000\002\010\005\000\002" +
    "\010\006\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\002\001\005\001\001\002\000\006\002" +
    "\005\005\006\001\002\000\004\002\000\001\002\000\004" +
    "\006\010\001\002\000\006\002\uffff\005\uffff\001\002\000" +
    "\006\007\011\010\012\001\002\000\006\002\ufffe\005\ufffe" +
    "\001\002\000\006\005\014\011\ufffc\001\002\000\004\011" +
    "\020\001\002\000\004\006\015\001\002\000\006\007\016" +
    "\011\ufffb\001\002\000\006\005\014\011\ufffc\001\002\000" +
    "\004\011\ufffa\001\002\000\004\012\022\001\002\000\006" +
    "\002\ufffd\005\ufffd\001\002\000\024\004\032\006\025\007" +
    "\030\010\035\012\022\013\ufff9\014\024\015\026\016\033" +
    "\001\002\000\024\004\032\006\025\007\030\010\035\012" +
    "\022\013\ufff9\014\024\015\026\016\033\001\002\000\004" +
    "\010\070\001\002\000\006\010\064\020\063\001\002\000" +
    "\004\010\055\001\002\000\026\004\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\017" +
    "\ufff3\001\002\000\026\004\ufff5\006\ufff5\007\ufff5\010\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\001" +
    "\002\000\004\013\054\001\002\000\016\004\uffeb\006\uffeb" +
    "\007\uffeb\010\uffeb\011\uffeb\021\uffeb\001\002\000\004\010" +
    "\046\001\002\000\006\007\045\021\042\001\002\000\010" +
    "\004\032\006\025\010\035\001\002\000\026\004\ufff2\006" +
    "\ufff2\007\ufff2\010\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\016\ufff2\017\ufff2\001\002\000\026\004\ufff1\006\ufff1\007" +
    "\ufff1\010\ufff1\012\ufff1\013\ufff1\014\ufff1\015\ufff1\016\ufff1" +
    "\017\ufff1\001\002\000\026\004\ufff6\006\ufff6\007\ufff6\010" +
    "\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6" +
    "\001\002\000\006\011\043\021\042\001\002\000\010\004" +
    "\032\006\025\010\035\001\002\000\016\004\uffea\006\uffea" +
    "\007\uffea\010\uffea\011\uffea\021\uffea\001\002\000\016\004" +
    "\uffe7\006\uffe7\007\uffe7\010\uffe7\011\uffe7\021\uffe7\001\002" +
    "\000\026\004\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4\013" +
    "\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\001\002\000\010" +
    "\004\032\006\025\010\035\001\002\000\006\011\050\021" +
    "\042\001\002\000\022\004\032\006\025\007\030\010\035" +
    "\012\022\014\024\015\026\016\033\001\002\000\004\017" +
    "\052\001\002\000\022\004\032\006\025\007\030\010\035" +
    "\012\022\014\024\015\026\016\033\001\002\000\026\004" +
    "\uffef\006\uffef\007\uffef\010\uffef\012\uffef\013\uffef\014\uffef" +
    "\015\uffef\016\uffef\017\uffef\001\002\000\032\002\ufff7\004" +
    "\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\012\ufff7\013\ufff7" +
    "\014\ufff7\015\ufff7\016\ufff7\017\ufff7\001\002\000\010\004" +
    "\032\006\025\010\035\001\002\000\004\011\061\001\002" +
    "\000\014\004\032\006\025\010\035\011\uffed\021\042\001" +
    "\002\000\004\011\uffec\001\002\000\022\004\032\006\025" +
    "\007\030\010\035\012\022\014\024\015\026\016\033\001" +
    "\002\000\026\004\uffee\006\uffee\007\uffee\010\uffee\012\uffee" +
    "\013\uffee\014\uffee\015\uffee\016\uffee\017\uffee\001\002\000" +
    "\010\004\032\006\025\010\035\001\002\000\010\004\032" +
    "\006\025\010\035\001\002\000\006\011\066\021\042\001" +
    "\002\000\016\004\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8" +
    "\021\uffe8\001\002\000\016\004\uffe9\006\uffe9\007\uffe9\010" +
    "\uffe9\011\uffe9\021\042\001\002\000\010\004\032\006\025" +
    "\010\035\001\002\000\006\011\072\021\042\001\002\000" +
    "\022\004\032\006\025\007\030\010\035\012\022\014\024" +
    "\015\026\016\033\001\002\000\026\004\ufff0\006\ufff0\007" +
    "\ufff0\010\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\016\ufff0" +
    "\017\ufff0\001\002\000\004\013\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\004\002\003\001\001\000\004\003\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\016\001\001\000\002\001\001\000\004\006" +
    "\020\001\001\000\002\001\001\000\020\005\030\006\037" +
    "\007\022\010\033\012\036\013\026\014\035\001\001\000" +
    "\020\005\073\006\037\007\022\010\033\012\036\013\026" +
    "\014\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\040\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\046\001\001\000\002\001\001\000" +
    "\016\006\037\007\050\010\033\012\036\013\026\014\035" +
    "\001\001\000\002\001\001\000\016\006\037\007\052\010" +
    "\033\012\036\013\026\014\035\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\010\056\011\055\001\001\000" +
    "\002\001\001\000\006\010\056\011\057\001\001\000\002" +
    "\001\001\000\016\006\037\007\061\010\033\012\036\013" +
    "\026\014\035\001\001\000\002\001\001\000\004\010\066" +
    "\001\001\000\004\010\064\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\070\001\001" +
    "\000\002\001\001\000\016\006\037\007\072\010\033\012" +
    "\036\013\026\014\035\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 System.out.println("Mon compilo C"); 
    }

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {

 void DEBUG(String s) {System.out.println(s);} 
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programme ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programme",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programme EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programme ::= programme declaration 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("programme",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaration ::= TYPE IDENT SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaration",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration ::= TYPE IDENT PARENTHESE_O parametre PARENTHESE_F bloc 
            {
              Object RESULT =null;
		 DEBUG("Declaration"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaration",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // parametre ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametre",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // parametre ::= TYPE IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametre",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // parametre ::= TYPE IDENT SEMI parametre 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametre",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instructions ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructions",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instructions ::= instruction instructions 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructions",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // bloc ::= ACC_O instructions ACC_F 
            {
              Object RESULT =null;
		 DEBUG("bloc"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloc",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // instruction ::= bloc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // instruction ::= SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // instruction ::= expression SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // instruction ::= instruction_while 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // instruction ::= instruction_for 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // instruction ::= instruction_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // instruction_while ::= WHILE PARENTHESE_O expression PARENTHESE_F instruction 
            {
              Object RESULT =null;
		 DEBUG("while"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction_while",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // instruction_if ::= IF PARENTHESE_O expression PARENTHESE_F instruction ELSE instruction 
            {
              Object RESULT =null;
		 DEBUG("if"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // instruction_for ::= FOR PARENTHESE_O expressions PARENTHESE_F instruction 
            {
              Object RESULT =null;
		 DEBUG("for"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction_for",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expressions ::= expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressions",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expressions ::= expression expressions 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressions",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expression ::= LITTERAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expression ::= PARENTHESE_O expression PARENTHESE_F 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expression ::= IDENT EQ expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expression ::= IDENT PARENTHESE_O expression PARENTHESE_F 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expression ::= expression OPBIN expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
