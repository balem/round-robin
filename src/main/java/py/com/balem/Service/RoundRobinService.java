package py.com.balem.Service;

import java.util.List;

import py.com.balem.model.Rating;

public interface RoundRobinService {

    /**
     * apply the round robin algorithm to the list of ratings
     * @param ratings
     * @param quantum
     * @return
     */
    List<Rating> applyRoundRobin(List<Rating> ratings, int quantum);
    
}
