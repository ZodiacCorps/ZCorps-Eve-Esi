package zcorps.eve_esi.sso;

import zcorps.eve_esi.ZCorpsEveEsi;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class ZSSO implements ZCorpsEveEsi {
    public void sendAuth(URI url) throws IOException {
        java.awt.Desktop.getDesktop().browse(url);
    }
}
