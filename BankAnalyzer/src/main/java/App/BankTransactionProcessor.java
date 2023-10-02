package App;

import BankCofig.BankConfig;
import BankImporters.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


public class BankTransactionProcessor {
    private List<BankTransaction> bankTransaction;

    public BankTransactionProcessor(List<BankTransaction> bankTransaction){
        this.bankTransaction = bankTransaction;
    }

    public Double calculateTotalAmount() {
        Double res =  this.bankTransaction.stream().flatMap(bt -> Stream.of(bt.getAmount())).reduce(0D, Double::sum);
        return res;
    }
   
    public static void main(String[] args) throws IOException {
        BankStatementImporter bsi = new BankStatementCSVParser();
        List<BankTransaction> list = bsi.getAllTransaction(Files.readAllLines(Path.of(BankConfig.RESOURCES + BankConfig.FILE_NAME)));
        BankTransactionProcessor btp = new BankTransactionProcessor(list);
        System.out.println(btp.calculateTotalAmount());
    }

}
