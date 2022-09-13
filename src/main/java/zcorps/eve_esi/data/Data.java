package zcorps.eve_esi.data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Data extends Encoder implements ByteGen{
    String generatedText;

    @Override
    public String generate(){
        generatedText = String.valueOf(UUID.randomUUID());
        return generatedText;
    }

    public String SHA256(String text) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(
                text.getBytes(StandardCharsets.UTF_8));

        String shaTxt = String.valueOf(encodedhash);

        return shaTxt;
    }
}
