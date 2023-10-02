package App;

import java.util.*;
import java.util.Arrays;
import BankCofig.*;

public class Demo {
    public static void main(String[] args) {
        String[] list = "one two three four".split(" +");
        for(String line: list) {
            System.out.println(line);
        }
    }
}