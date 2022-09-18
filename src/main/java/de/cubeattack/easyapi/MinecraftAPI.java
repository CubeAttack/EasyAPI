package de.cubeattack.easyapi;

import de.cubeattack.easyapi.logger.LogManager;
import org.json.JSONObject;

import java.net.URL;
import java.util.Scanner;
import java.util.UUID;

@SuppressWarnings("unused")
public class MinecraftAPI
{

    public static UUID loadUUID(String playerName) {
        String API_URL = "https://api.mojang.com/users/profiles/minecraft/";

        try (Scanner scanner = new Scanner(new URL(API_URL + playerName).openConnection().getInputStream())) {
            return getUniqueIdFromString(new JSONObject(scanner.nextLine()).getString("id"));
        }catch (Exception ex) {
            LogManager.getLogger().error("Error whiles loading UUID from " + playerName + " : " + ex.getLocalizedMessage());
            return null;
        }
    }

    private static UUID getUniqueIdFromString(String uuid) {
        return UUID.fromString(uuid.replaceFirst("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5"));
    }
}
