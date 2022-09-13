package zcorps.eve_esi.data;

import java.util.Base64;

public abstract class Encoder {
    public String encode(String input) {

        return Base64.getEncoder().encodeToString(input.getBytes());
    }
}
