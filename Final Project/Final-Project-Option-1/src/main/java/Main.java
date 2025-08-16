import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        //check args
        if (args.length < 2) {
            System.err.println("number if arguments error");
            System.exit(1);
        }

        //paths from args
        Path inputCsv = Path.of(args[0]);
        Path outputDir = Path.of(args[1]);

        //build controller and helpers
        AppController app = new AppController(
                new CsvParser(),
                new LiftData(),
                new SkiersCsvOutput(),
                new LiftsCsvOutput(),
                new HoursCsvOutput()
        );

        //run: read > count > write
        app.run(inputCsv, outputDir);

        //done
        System.out.println("wrote reports to: " + outputDir.toAbsolutePath());
    }
}