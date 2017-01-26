package services;

import javax.inject.Singleton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Singleton
public class DataService {

    private HashMap<String, String> database = new HashMap<>();

    public void add(String id, String value) {
        database.put(id, value);
    }

    public Map<String, String> getAll() {
        return Collections.unmodifiableMap(database);
    }

    public Optional<String> get(String id) {
        return Optional.ofNullable(database.get(id));
    }
}
