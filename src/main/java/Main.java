import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "saasquatch-cli",
    mixinStandardHelpOptions = true,
    version = "1.0",
    description = "impact.com - SaaSquatch"
)
public class Main implements Runnable {

    public void run() {
        System.out.println("=========================================");
        System.out.println("         impact.com - SaaSquatch         ");
        System.out.println("              Victoria, BC               ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}