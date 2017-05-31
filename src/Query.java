import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by test on 30/05/2017.
 */
public class Query {
    private List<String> queryName;
    private Comparator<String> stringComparator;

    public Query (ArrayList<String> queryName, Comparator<String> stringComparator) {
        this.stringComparator = stringComparator;
        this.queryName = queryName;
    }

    @Override
    public String toString() {
        return "Queries ... \n"+queryName.stream().sorted(stringComparator).collect(Collectors.joining("\n"));
    }
}
