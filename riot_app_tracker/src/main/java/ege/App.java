package ege;

import java.util.*;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.match.dto.MatchReference;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.api.endpoints.match.dto.MatchList;
import net.rithms.riot.constant.Platform;

public class App 
{
    private static Platform TR = Platform.TR;
    private static final String RIOT_KEY = "YOUR-KEY-HERE";
    public static void main( String[] args ) throws Exception
    {
        System.out.println("Enter your summoner name; ");
        String summonerName = new Scanner(System.in).nextLine();
        
        ApiConfig config = new ApiConfig().setKey(RIOT_KEY);
		RiotApi api = new RiotApi(config);

		Summoner summoner = api.getSummonerByName(TR, summonerName);

		System.out.println("Summoner Name: " + summoner.getName());
		System.out.println("Summoner Level: " + summoner.getSummonerLevel());           
    }
}
