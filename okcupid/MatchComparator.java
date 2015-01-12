package okcupid;

import java.util.Comparator;

public class MatchComparator implements Comparator<Match>
{
    @Override
    public int compare(Match a, Match b) {
    	if(a.score < b.score)
    		return 1;
    	if(a.score > b.score)
    		return -1;
    	return 0;
    }
}