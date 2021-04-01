package ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class TelefonBook {

    private final ObservableList<TelefonEntry> observableList = FXCollections.observableList(new ArrayList<>());
    private final FilteredList<TelefonEntry> filteredList = new FilteredList<>(observableList);
    public TelefonBook() {
        observableList.add(new TelefonEntry("Heidegger", "Phillip", "1234"));
        observableList.add(new TelefonEntry("John", "Oliver", "5678"));
        observableList.add(new TelefonEntry("Jordan", "Thomas", "123456"));

    }

    public ObservableList<TelefonEntry> getNumbers() { return observableList; }

/*
    public List<TelefonEntry> search(Object value) {
        // todo return filtered list of telefon entries
        filteredList.setPredicate(telefonEntry -> {
            String firstname = telefonEntry.getFirstName().toLowerCase();
            String lastname = telefonEntry.getLastName().toLowerCase();
            //String search = value.toLowerCase();

            //return firstname.contains(search) || lastname.contains(search);
        });
        return filteredList;
    }
*/

}