package at.milenkoburlica;

import org.apache.commons.cli.ParseException;

public class main {

  public static void main(String[] args) throws ParseException {
    // TODO Auto-generated method stub

    CommandOptions co = new CommandOptions();
    
    args = new String[0];
    co.set(args);
    
    args = new String[2];
    args[0] = "-prio";
    args[1] = "1,2";   
    co.set(args);
    
    
  }

}
