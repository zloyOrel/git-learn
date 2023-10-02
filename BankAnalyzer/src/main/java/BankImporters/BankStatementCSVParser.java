package BankImporters;

import App.BankTransaction;
import BankCofig.BankConfig;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.LinkedList;

public class BankStatementCSVParser implements BankStatementImporter {
    //public static final String FILE_NAME = BankConfig.RESOURCES + BankConfig.FILE_NAME;
    private DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    @Override
    public BankTransaction getOneTransaction(String line) {
        String[] column = line.split(" +");
        LocalDate date = LocalDate.parse(column[0], DATE_PATTERN);
        Double amount = Double.parseDouble(column[1]);
        String disc = column[2];
        return new BankTransaction(date, amount, disc);
    }
    @Override
    public List<BankTransaction> getAllTransaction(List<String> statement) {
        List<BankTransaction> res = new LinkedList<>();
        for(String bt: statement) {
            res.add(getOneTransaction(bt));
        }
        return res;
    }
}
