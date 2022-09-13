package zcorps.eve_esi;

import zcorps.eve_esi.data.Data;
import zcorps.eve_esi.scopes.ScopesHandler;
import zcorps.eve_esi.sso.ZSSO;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, NoSuchAlgorithmException {
        ZSSO ssoAuth = new ZSSO();
        Data data = new Data();
        ScopesHandler sh = new ScopesHandler();

        JFrame frame = new JFrame();

        frame.setSize(880, 680);
        frame.setVisible(true);

        String state = "aj2nzcr6a9tu2ag";
        String mscope = sh.SCOPES[0][1];
        String codeVerifier = data.encode(data.generate());


        URI authSite = new URI("https://login.eveonline.com/v2/oauth/authorize/" + ssoAuth.RESPONSE_TYPE + ssoAuth.REDIRECT + ssoAuth.CLIENT_ID_URL +
                ssoAuth.CLIENT_ID + ssoAuth.SCOPE + "esi-markets.read_character_orders.v1" + ssoAuth.CODE_CHALLENGE + codeVerifier +
                ssoAuth.CHALLENGE_METHOD + ssoAuth.STATE + state);
        System.out.println(authSite);
        ssoAuth.sendAuth(authSite);

    }
}
