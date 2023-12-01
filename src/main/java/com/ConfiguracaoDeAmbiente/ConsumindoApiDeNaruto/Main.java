package com.ConfiguracaoDeAmbiente.ConsumindoApiDeNaruto;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"id\": 55,\n" +
                "  \"name\": \"Amachi\",\n" +
                "  \"images\": [\n" +
                "    \"https://static.wikia.nocookie.net/naruto/images/4/44/Amachi.png/revision/latest/scale-to-width-down/300?cb=20150528184924\"\n" +
                "  ],\n" +
                "  \"debut\": {\n" +
                "    \"anime\": \"Naruto Episode #170\",\n" +
                "    \"appearsIn\": \"Anime\"\n" +
                "  },\n" +
                "  \"jutsu\": [\n" +
                "    \"Kaima Form\",\n" +
                "    \"Scale Senbon\",\n" +
                "    \"Summoning Technique (Umibōzu)\",\n" +
                "    \"Water Release: Large Projectile\"\n" +
                "  ],\n" +
                "  \"natureType\": [\n" +
                "    \"Water Release\"\n" +
                "  ],\n" +
                "  \"personal\": {\n" +
                "    \"sex\": \"Male\",\n" +
                "    \"classification\": \"Medical-nin\",\n" +
                "    \"occupation\": \"Scientist\",\n" +
                "    \"affiliation\": [\n" +
                "      \"Land of the Sea\",\n" +
                "      \"Otogakure\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"tools\": [\n" +
                "    \"Scalpel\"\n" +
                "  ],\n" +
                "  \"voiceActors\": {\n" +
                "    \"japanese\": \"Hideyuki Umezu\",\n" +
                "    \"english\": \"Doug Stone\"\n" +
                "  }\n" +
                "}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            CharacterInfo characterInfo = objectMapper.readValue(jsonString, CharacterInfo.class);

            // Imprimir os dados do personagem
            System.out.println(characterInfo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
