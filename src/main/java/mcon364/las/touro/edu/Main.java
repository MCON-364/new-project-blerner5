package mcon364.las.touro.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {

    }

    public static Optional<String> getUserName(String name) {
        var valueName = System.getenv(name);
        return Optional.ofNullable(valueName);
    }

    public static String getGreeting(String name) {
        StringBuilder greeting = new StringBuilder();
        var greetingName = getUserName(name);
        if (greetingName.isEmpty()) {
            greeting.append("World");
        }
        greeting.append("Hello, " + greetingName.get());
        return greeting.toString();
    }
}

public static void processValues(List<List<Integer>> data){
        List<List<Integer>> guests = new ArrayList<>();
        for (int i = 1; i <= guests.size(); i++) {
            if (guests.size() > 5) {
                continue;
            }
            for (int j = 1; j <= guests.get(i).size(); j++) {
                if (guests.get(i).get(j) > 5) {
                    break;
                }
            }
        }
    }
}