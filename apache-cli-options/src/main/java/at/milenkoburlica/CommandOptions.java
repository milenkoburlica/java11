package at.milenkoburlica;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandOptions {

  public void set(String[] args) throws ParseException {
    Options options = new Options();
    
    options.addOption(Option.builder("prio").optionalArg(true).desc("Prioritäten").build());
    options.addOption(Option.builder("projkz").optionalArg(true).desc("Projektkennzeichen").build());
    options.addOption(Option.builder("listkz").optionalArg(true).desc("Listkennzeichen (Empfänger)").build());
    options.addOption(Option.builder("format").optionalArg(true).desc("Format (batch|xml)").build());
    options.addOption(Option.builder("extendname").optionalArg(true).desc("Erweiterter Dateiname (nur bei exakter Angabe eines Projekt- und Listkennzeichen möglich).").build());
    // Obavezan argument s dugim imenom
//    options.addOption(Option.builder().longOpt("--d").required().hasArg().desc("Enable option D with a required argument").build());
//    options.addOption(Option.builder("projkz").longOpt("enable-b").hasArg().desc("Projektkennzeichen").build());
//    options.addOption(Option.builder("listkz").longOpt("--enable-c").required().optionalArg(true).desc("Listkennzeichen (Empfänger)").build());
    
    CommandLineParser parser = new DefaultParser();
    CommandLine cmd = parser.parse(options, args);

    if (cmd.hasOption("prio")) {
      String argValue = cmd.getOptionValue("prio");
      System.out.println("Handle option A with argument " + argValue);
    }

    if (cmd.hasOption("projkz")) {
      String argValue = cmd.getOptionValue("projkz");
      // Handle option B with argument
      System.out.println("Handle option 'projkz' with argument " + argValue);
    }

    if (cmd.hasOption("listkz")) {
      String argValue = cmd.getOptionValue("listkz");
      System.out.println("Handle option 'listkz' with argument " + argValue);
    }

    if (cmd.hasOption("format")) {
      String argValue = cmd.getOptionValue("format");
      // Handle option D with argument
      System.out.println("Handle option 'format' with argument " + argValue);
    }

    if (cmd.hasOption("extendname")) {
      String argValue = "";
      System.out.println("Handle option 'extendname' with argument " + argValue);
    }
    
  }
}
