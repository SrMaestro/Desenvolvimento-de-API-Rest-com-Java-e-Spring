package com.ConfiguracaoDeAmbiente.ConsumindoApiDeNaruto;

import java.util.List;

public class CharacterInfo {

    private int id;
    private String name;
    private List<String> images;
    private Debut debut;
    private List<String> jutsu;
    private List<String> natureType;

    private Personal personal;

    private List<String> tools;
    private VoiceActors voiceActors;

    public VoiceActors getVoiceActors() {
        return voiceActors;
    }

    public void setVoiceActors(VoiceActors voiceActors) {
        this.voiceActors = voiceActors;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<String> getNatureType() {
        return natureType;
    }

    public void setNatureType(List<String> natureType) {
        this.natureType = natureType;
    }

    public List<String> getJutsu() {
        return jutsu;
    }

    public void setJutsu(List<String> jutsu) {
        this.jutsu = jutsu;
    }

    public Debut getDebut() {
        return debut;
    }

    public void setDebut(Debut debut) {
        this.debut = debut;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
