/*
 * Name: Jose Rodriguez
 * 10/11/26
 * CSD-402 Module 11.2 - JavaFX HBox and VBox
 * Purpose: Demonstrate horizontal and vertical layouts in a store-visit tracker.
 * Sources consulted (layout behavior; example implementation is original):
 * https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/HBox.html
 * https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/VBox.html
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** Demonstrates an HBox input row nested inside a VBox application layout. */
public class JoseLayoutDemo extends Application {

    /**
     * Builds the interface on the JavaFX Application Thread.
     * @param stage the main window supplied by the JavaFX runtime
     */
    @Override
    public void start(Stage stage) {
        Label heading = new Label("Store Visit Tracker");
        heading.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        TextField storeField = new TextField();
        storeField.setPromptText("Enter a store name or address");
        storeField.setAccessibleText("Store name or address");
        Button addButton = new Button("Add Visit");
        Button clearButton = new Button("Clear");

        // HBox places the label, text field, and buttons in one horizontal row.
        HBox inputRow = new HBox(10, new Label("Store:"), storeField,
                addButton, clearButton);
        inputRow.setAlignment(Pos.CENTER_LEFT);
        inputRow.setFillHeight(false);
        // Allocate extra horizontal space to the text field when resized.
        HBox.setHgrow(storeField, Priority.ALWAYS);
        storeField.setMaxWidth(Double.MAX_VALUE);

        TextArea visitLog = new TextArea();
        visitLog.setEditable(false);
        visitLog.setWrapText(true);
        visitLog.setPromptText("Your store visits will appear here.");
        visitLog.setAccessibleText("Store visit log");
        Label status = new Label("Enter a store, then select Add Visit.");
        status.setWrapText(true);

        // VBox stacks the heading, HBox row, log, and status vertically.
        VBox root = new VBox(12, heading, inputRow, visitLog, status);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.TOP_LEFT);
        root.setFillWidth(true);
        // Give the log extra vertical space instead of stretching the heading.
        VBox.setVgrow(visitLog, Priority.ALWAYS);
        visitLog.setMaxHeight(Double.MAX_VALUE);

        // A click validates the input before adding a new line to the log.
        addButton.setOnAction(event -> addVisit(storeField, visitLog, status));
        // Pressing Enter in the field performs the same action as the button.
        storeField.setOnAction(event -> addButton.fire());
        clearButton.setOnAction(event -> {
            storeField.clear();
            visitLog.clear();
            status.setText("Visit log cleared.");
            storeField.requestFocus();
        });

        stage.setTitle("Module 11.2 - HBox and VBox");
        stage.setScene(new Scene(root, 760, 420));
        // Keep the single input row readable; HBox does not wrap its children.
        stage.setMinWidth(650);
        stage.setMinHeight(300);
        stage.show();
    }

    /**
     * Rejects blank input or appends a trimmed store entry to the visit log.
     * @param storeField the field holding the user's store entry
     * @param visitLog the output area containing accepted visits
     * @param status the label providing feedback to the user
     */
    private void addVisit(TextField storeField, TextArea visitLog, Label status) {
        String store = storeField.getText().trim();
        if (store.isEmpty()) {
            status.setText("Please enter a store before adding a visit.");
        } else {
            visitLog.appendText("Visited: " + store + System.lineSeparator());
            status.setText("Added visit: " + store);
            storeField.clear();
        }
        storeField.requestFocus();
    }

    /**
     * Starts the JavaFX runtime.
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        launch(args);
    }
}
