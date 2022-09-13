package zcorps.eve_esi;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 */
public interface ZCorpsEveEsi {
    public final String CLIENT_ID = "ef8b4e82383e4173bb99983165a37c03";
    public final String CLIENT_ID_URL = "&client_id=";
    public final String RESPONSE_TYPE = "?response_type=code";
    public final String CALLBACK_URL = "eveauth-app://callback/";
    public final String REDIRECT = "&redirect_uri="+ CALLBACK_URL;
    public final String SCOPE = "&scope=";
    public final String CODE_CHALLENGE = "&code_challenge=";
    public final String CHALLENGE_METHOD = "&code_challenge_method=S256";
    public final String STATE = "&state=";


}
