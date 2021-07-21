package py.com.balem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import py.com.balem.model.Rating;

public class RoundRobinServiceImpl implements RoundRobinService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Rating> applyRoundRobin(List<Rating> ratings, int quantum) {
        List<Rating> result = new ArrayList<>();
        Map<String, List<Rating>> ratingsMap =  ratings.stream().collect(groupingBy(Rating::getUserId));
        
        for (Map.Entry<String, List<Rating>> entry : ratingsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            
        }

        return result;
    }
    
}
