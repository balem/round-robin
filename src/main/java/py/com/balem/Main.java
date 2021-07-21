package py.com.balem;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import py.com.balem.Service.RoundRobinService;
import py.com.balem.Service.RoundRobinServiceImpl;
import py.com.balem.model.Rating;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        // loads CSV file from the resource folder.
        URL resource = Main.class.getClassLoader().getResource("ratings.csv");
        File file = Paths.get(resource.toURI()).toFile();
        CSVReader reader = new CSVReader(new FileReader(file));
        List<Rating> ratings = new CsvToBeanBuilder(reader).withType(Rating.class).build().parse();
        RoundRobinService service = new RoundRobinServiceImpl();
        int quantum = 5;
        service.applyRoundRobin(ratings, quantum);
    }
}
