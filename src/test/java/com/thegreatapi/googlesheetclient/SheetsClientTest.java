package com.thegreatapi.googlesheetclient;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SheetsClientTest {

    private static final String DEFAULT_CREDENTIALS_FILE_PATH = "/credentials.json";

    @Test
    void run() throws GeneralSecurityException, IOException {
        String credentialsFilePath = System.getProperty("CREDENTIALS_FILE_PATH", DEFAULT_CREDENTIALS_FILE_PATH);

        List<List<Object>> data = new SheetsClient(credentialsFilePath).run();
        assertThat(data).containsExactlyElementsOf(List.of(
                List.of("Alexandra", "Female", "4. Senior", "CA", "English", "Drama Club"),
                List.of("Andrew", "Male", "1. Freshman", "SD", "Math", "Lacrosse"),
                List.of("Anna", "Female", "1. Freshman", "NC", "English", "Basketball"),
                List.of("Becky", "Female", "2. Sophomore", "SD", "Art", "Baseball"),
                List.of("Benjamin", "Male", "4. Senior", "WI", "English", "Basketball"),
                List.of("Carl", "Male", "3. Junior", "MD", "Art", "Debate"),
                List.of("Carrie", "Female", "3. Junior", "NE", "English", "Track & Field"),
                List.of("Dorothy", "Female", "4. Senior", "MD", "Math", "Lacrosse"),
                List.of("Dylan", "Male", "1. Freshman", "MA", "Math", "Baseball"),
                List.of("Edward", "Male", "3. Junior", "FL", "English", "Drama Club"),
                List.of("Ellen", "Female", "1. Freshman", "WI", "Physics", "Drama Club"),
                List.of("Fiona", "Female", "1. Freshman", "MA", "Art", "Debate"),
                List.of("John", "Male", "3. Junior", "CA", "Physics", "Basketball"),
                List.of("Jonathan", "Male", "2. Sophomore", "SC", "Math", "Debate"),
                List.of("Joseph", "Male", "1. Freshman", "AK", "English", "Drama Club"),
                List.of("Josephine", "Female", "1. Freshman", "NY", "Math", "Debate"),
                List.of("Karen", "Female", "2. Sophomore", "NH", "English", "Basketball"),
                List.of("Kevin", "Male", "2. Sophomore", "NE", "Physics", "Drama Club"),
                List.of("Lisa", "Female", "3. Junior", "SC", "Art", "Lacrosse"),
                List.of("Mary", "Female", "2. Sophomore", "AK", "Physics", "Track & Field"),
                List.of("Maureen", "Female", "1. Freshman", "CA", "Physics", "Basketball"),
                List.of("Nick", "Male", "4. Senior", "NY", "Art", "Baseball"),
                List.of("Olivia", "Female", "4. Senior", "NC", "Physics", "Track & Field"),
                List.of("Pamela", "Female", "3. Junior", "RI", "Math", "Baseball"),
                List.of("Patrick", "Male", "1. Freshman", "NY", "Art", "Lacrosse"),
                List.of("Robert", "Male", "1. Freshman", "CA", "English", "Track & Field"),
                List.of("Sean", "Male", "1. Freshman", "NH", "Physics", "Track & Field"),
                List.of("Stacy", "Female", "1. Freshman", "NY", "Math", "Baseball"),
                List.of("Thomas", "Male", "2. Sophomore", "RI", "Art", "Lacrosse"),
                List.of("Will", "Male", "4. Senior", "FL", "Math", "Debate")
        ));
    }
}