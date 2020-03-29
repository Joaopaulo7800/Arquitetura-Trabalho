import java.util.Scanner;
import java.io.File; 
import java.io.*;
import java.lang.Math;


class Main {

  public static void main(String[] args) {
    try {
      File myReader = new File("entrada.txt");
      FileWriter myWriter = new FileWriter("saida.txt");
      Compare comparador = new Compare();
      String opcode = "";
      String rs = "";
      String rt = "";
      String rd = "";
      String shamt = "";
      String funcao = "";
      String imediato = "";
      int imediatoInt = 0;	
      int jr = "";
      int count = 0;

      var sb = new StringBuilder();
      var sc = new Scanner(myReader);
      while(sc.hasNextLine()){
      count += 4; 
      String line = sc.nextLine();
      line = line.replaceAll(",", " ");
      line = line.replaceAll("  ", " ");
      line = line.replaceAll("[()]", " ");
      if(line.indexOf(jal)>=0){
        jr = Integer.toString(count, 2);;
      }
      String[] arrOfStr = line.split(" ");
      String type = comparador.validate(arrOfStr[0]);
      if(type.equals("R")){
        opcode = "000000";
        if(line.indexOf("jr") >=0){
          // jr + 21 zeros
          rs =  comparador.comparar(arrOfStr[1]);
          rt =  "00000";
          rt =  "00000";
          rd =  "00000";
        }else{
          rt = comparador.comparar(arrOfStr[3]);
          rs = comparador.comparar(arrOfStr[2]);
          rd = comparador.comparar(arrOfStr[1]);
          shamt = "00000";
        }
         funcao = comparador.comparar(arrOfStr[0]);
         line = opcode + rs + rt + rd + shamt + funcao;
        
      }else if(type.equals("I")){
        opcode = comparador.comparar(arrOfStr[0]);
        rd = comparador.comparar(arrOfStr[1]);

        if(line.indexOf("sw") >= 0 || line.indexOf("lw") >= 0){
          rs = comparador.comparar(arrOfStr[3]);
          imediatoInt = Integer.parseInt(arrOfStr[2]);  
        }else{
          rs = comparador.comparar(arrOfStr[2]);
          imediatoInt = Integer.parseInt(arrOfStr[3]);
          imediato = Integer.toString(imediatoInt, 2);
          imediato = String.format("%016d", Integer.parseInt(imediato));
        }
        imediato = Integer.toString(imediatoInt, 2);
        line = opcode + rs + rd + imediato;
      }else if(type.equals("J")){
        opcode = comparador.comparar(arrOfStr[0]);
        imediatoInt = Integer.parseInt(arrOfStr[1]);
        if(line.indexOf("1024") >= 0){
            imediato = "0000000000000010000000000";
        }else{
        imediato = Integer.toString(imediatoInt, 2);
        imediato = String.format("%026d", Integer.parseInt(imediato));
        }
        line = opcode + imediato;
      }else {
        line = "Erro na compilação";
      }
     
      line += "\n";
      sb.append(line);
      }
      var FileContent = sb.toString();
      FileContent = FileContent.replaceAll("add", "s");
      myWriter.write(FileContent);
      myWriter.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro na leitura do arquivo: " + excecao);	
		}

    
    
  }
}

