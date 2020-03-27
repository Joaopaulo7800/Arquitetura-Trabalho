
import java.util.Scanner;
import java.io.File; 
import java.io.*;


class Main {

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

  public static void main(String[] args) {
    try {
      File myReader = new File("entrada.txt");
      FileWriter myWriter = new FileWriter("saida.txt");
   
      var sb = new StringBuilder();
      var sc = new Scanner(myReader);
      while(sc.hasNextLine()){
      String line = sc.nextLine();

      // Tradução ---------------------
      line = line.replaceAll("div", div);
      line = line.replaceAll("neg", neg);
      line = line.replaceAll("andi", andi);
      line = line.replaceAll("and", and);
      line = line.replaceAll("addi", addi);
      line = line.replaceAll("add", add);
      line = line.replaceAll("xor", xor);
      line = line.replaceAll("nor", nor);
      line = line.replaceAll("ori", ori);
      line = line.replaceAll("or", or);
      line = line.replaceAll("slti", slti);
      line = line.replaceAll("sll", sll);
      line = line.replaceAll("slt", slt);
      line = line.replaceAll("srl", srl);
      line = line.replaceAll("lw", lw);
      line = line.replaceAll("sw", sw);
      line = line.replaceAll("beq", beq);
      line = line.replaceAll("bne", bne);
      line = line.replaceAll("jal", jal);
      line = line.replaceAll("jr", jr);
      line = line.replaceAll("j", j);
      line = line.replaceAll("nop", nop);
      line = line.replaceAll("sub", sub);
      line = line.replaceAll("mult", mult);
      line = line.replaceAll("zero", zero);
      line = line.replaceAll("at", at);
      line = line.replaceAll("v0", v0);
      line = line.replaceAll("v1", v1);
      line = line.replaceAll("a0", a0);
      line = line.replaceAll("a2", a2);
      line = line.replaceAll("a3", a3);
      line = line.replaceAll("t0", t0);
      line = line.replaceAll("t1", t1);
      line = line.replaceAll("t2", t2);
      line = line.replaceAll("t3", t3);
      line = line.replaceAll("t4", t4);
      line = line.replaceAll("t5", t5);
      line = line.replaceAll("t6", t6);
      line = line.replaceAll("t7", t7);
      line = line.replaceAll("s0", s0);
      line = line.replaceAll("s1", s1);
      line = line.replaceAll("s2", s2);
      line = line.replaceAll("s3", s3);
      line = line.replaceAll("s4", s4);
      line = line.replaceAll("s5", s5);
      line = line.replaceAll("s6", s6);
      line = line.replaceAll("s7", s7);
      line += "\n";
      //Fim da tradução
      sb.append(line);

      }
      var FileContent = sb.toString();
      FileContent = FileContent.replaceAll("add", add);
      myWriter.write(FileContent);
      myWriter.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro na leitura do arquivo: " + excecao);	
		}
    
    
  }
}
 
 	
