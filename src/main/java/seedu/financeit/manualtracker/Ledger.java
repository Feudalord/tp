package seedu.financeit.manualtracker;

import seedu.financeit.utils.InputParser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ledger {
    ArrayList<Entry> entryList = new ArrayList<>();
    LocalDate date;

    public Ledger(String rawDate) {
        LocalDate date = LocalDate.parse(InputParser.parseDateTime(rawDate, "date"));
        this.date = date;
    }

    public void addEntry(Entry entry) {
        this.entryList.add(entry);
    }

    public String getDate() {
        return this.date.getDayOfWeek().toString();
    }

    @Override
    public String toString() {
        return this.getDate();
    }
}