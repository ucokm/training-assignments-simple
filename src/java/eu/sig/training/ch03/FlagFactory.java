package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
    	Map<Nationality, List<Color>> nations = setupNationalityColor();
    	return nations.get(nationality);
    }
    // end::getFlag[]
    
    private Map<Nationality, List<Color>> setupNationalityColor() {
    	Map<Nationality, List<Color>> nations = new HashMap<Nationality, List<Color>>();
    	nations.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    	nations.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
    	nations.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
    	nations.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
    	nations.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    	nations.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
    	nations.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
    	nations.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
    	nations.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
    	nations.put(Nationality.RUSSIA, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    	nations.put(Nationality.UNCLASSIFIED, Arrays.asList(Color.GRAY));
    	return nations;
    }

}