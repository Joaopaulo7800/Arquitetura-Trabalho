
import java.util.*; 
public class Compare {

static String addi = "001000";
static String andi = "001100";
static String ori = "001101";
static String slti = "001010";
static String jr = "001000";
static String xor = "100110";
static String nor = "100111";
static String jal = "000011";
static String add = "100000 ";
static String sub = "100010";
static String mult = "011000";
static String div = "011010";
static String neg = "000111";
static String and = "100100";
static String or = "100101";
static String slt = "101010";
static String sll = "000000";

static String srl = "000010";
static String lw = "100011";
static String sw = "101011";
static String beq = "000100";
static String bne = "000101";
static String j = "000010";
static String nop = "000000";
static String zero = "00000";
static String at = "00001";
static String v0 = "00010";
static String v1 = "00011";
static String a0 = "00100";
static String a2 = "00110";
static String a3 = "00111";
static String t0 = "01000";
static String t1 = "01001";
static String t2 = "01010";
static String t3 = "01011";
static String t4 = "01100";
static String t5 = "01101";
static String t6 = "01110";
static String t7 = "01111";
static String s0 = "10000";
static String s1 = "10001";
static String s2 = "10010";
static String s3 = "10011";
static String s4 = "10100";
static String s5 = "10101";
static String s6 = "10110";
static String s7 = "10111";

    public static String  comparar(String comando) {
    
        
        if(comando.equals("add")){
          return add;
        }else if(comando.equals("addi")){
          return addi;
        }else if(comando.equals("ori")){
          return ori;
        }else if(comando.equals("slti")){
          return slti;
        }else if(comando.equals("jr")){
          return jr;
        }else if(comando.equals("xor")){
          return xor;
        }else if(comando.equals("nor")){
          return nor;
        }else if(comando.equals("jal")){
          return jal;
        }else if(comando.equals("sub")){
          return sub;
        }else if(comando.equals("mult")){
          return mult;
        }else if(comando.equals("div")){
          return div;
        }else if(comando.equals("neg")){
          return neg;
        }else if(comando.equals("and")){
          return and;
        }else if(comando.equals("or")){
          return or;
        }else if(comando.equals("slt")){
          return slt;
        }else if(comando.equals("sll")){
          return sll;
        }else if(comando.equals("addi")){
          return addi;
        }else if(comando.equals("andi")){
          return andi;
        }else if(comando.equals("ori")){
          return ori;
        }else if(comando.equals("slti")){
          return slti;
        }else if(comando.equals("jr")){
          return jr;
        }else if(comando.equals("xor")){
          return xor;
        }else if(comando.equals("nor")){
          return nor;
        }else if(comando.equals("jal")){
          return jal;
        }else if(comando.equals("add")){
          return add;
        }else if(comando.equals("sub")){
          return sub;
        }else if(comando.equals("mult")){
          return mult;
        }else if(comando.equals("div")){
          return div;
        }else if(comando.equals("neg")){
          return neg;
        }else if(comando.equals("and")){
          return and;
        }else if(comando.equals("or")){
          return or;
        }else if(comando.equals("slt")){
          return slt;
        }else if(comando.equals("sll")){
          return sll;
        }else if(comando.equals("srl")){
          return srl;
        }else if(comando.equals("lw")){
          return lw;
        }else if(comando.equals("sw")){
          return sw;
        }else if(comando.equals("beq")){
          return beq;
        }else if(comando.equals("bne")){
          return bne;
        }else if(comando.equals("j")){
          return j;
        }else if(comando.equals("nop")){
          return nop;
        }else if(comando.equals("zero")){
          return zero;
        }else if(comando.equals("at")){
          return at;
        }else if(comando.equals("v0")){
          return v0;
        }else if(comando.equals("v1")){
          return v1;
        }else if(comando.equals("a0")){
          return a0;
        }else if(comando.equals("a2")){
          return a2;
        }else if(comando.equals("a3")){
          return a3;
        }else if(comando.equals("t0")){
          return t0;
        }else if(comando.equals("t1")){
          return t1;
        }else if(comando.equals("t2")){
          return t2;
        }else if(comando.equals("t3")){
          return t3;
        }else if(comando.equals("t4")){
          return t4;
        }else if(comando.equals("t5")){
          return t5;
        }else if(comando.equals("t6")){
          return t6;
        }else if(comando.equals("t7")){
          return t7;
        }else if(comando.equals("s0")){
          return s0;
        }else if(comando.equals("s1")){
          return s1;
        }else if(comando.equals("s2")){
          return s2;
        }else if(comando.equals("s3")){
          return s3;
        }else if(comando.equals("s4")){
          return s4;
        }else if(comando.equals("s5")){
          return s5;
        }else if(comando.equals("s6")){
          return s6;
        }else if(comando.equals("s7")){
          return s7;
        }else if (comando.equals("zero")){
          return "000000";
        }else{
          System.out.println(comando);	
          return "ERROR";
        }
    }

    public static String  validate(String comando) {
      
        
        if(comando.equals("add") || comando.equals("sub") || comando.equals("div") || comando.equals("mult") || comando.equals("and") || comando.equals("or") || comando.equals("xor") || comando.equals("nor") || comando.equals("slt") ||comando.equals("jr") ){
          return "R";
        }else if(comando.equals("lw") || comando.equals("sw") || comando.equals("beq") || comando.equals("bne") || comando.equals("ori") || comando.equals("andi") || comando.equals("addi") || comando.equals("slti") || comando.equals("srl") || comando.equals("sll")  ){
          return "I";
        }else if(comando.equals("j") || comando.equals("jal")){
          return "J";
        }else{
          return "ERROR";
        }
    };

    

}
