package BankCofig;

import java.nio.file.Path;

public class BankConfig {
    public static final String RESOURCES = "src/main/resources/";
    public static final String FILE_NAME = "transaction.csv";

    public static Path getPathBankStatement(){
        return Path.of(RESOURCES + FILE_NAME);
    }
}
