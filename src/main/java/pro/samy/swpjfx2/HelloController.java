package pro.samy.swpjfx2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    private final File file1 = new File("C:\\Users\\SamyPro\\Documents\\GitHub\\UnSamyPro\\swpjfx2\\src\\main\\resources\\pro\\samy\\swpjfx2\\text1.txt");
    private final File file2 = new File("C:\\Users\\SamyPro\\Documents\\GitHub\\UnSamyPro\\swpjfx2\\src\\main\\resources\\pro\\samy\\swpjfx2\\text2.txt");

    @FXML
    private TextField text1;
    @FXML
    private TextField text2;

    @FXML
    private Button button;

    @FXML
    protected void onButtonClick() throws IOException {
        ArrayList<String> lines1 = Files.readString(file1.toPath()).lines().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> lines2 = Files.readString(file2.toPath()).lines().collect(Collectors.toCollection(ArrayList::new));

        int randomLine1 = (int) (Math.random() * lines1.size());
        int randomLine2 = (int) (Math.random() * lines2.size());

        text1.setText(lines1.get(randomLine1));
        text2.setText(lines2.get(randomLine2));
    }

}