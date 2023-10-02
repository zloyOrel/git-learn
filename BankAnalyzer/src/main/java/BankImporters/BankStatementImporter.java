package BankImporters;

import App.BankTransaction;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public interface BankStatementImporter {
    List<BankTransaction> getAllTransaction(List<String> lines);
    BankTransaction getOneTransaction(String line);
}
