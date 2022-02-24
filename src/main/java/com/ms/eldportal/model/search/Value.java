package com.ms.eldportal.model.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Value{
    @JsonProperty("@search.score")
    public double searchScore;
    public String metadata_storage_name;
    public String metadata_storage_path;
    public ArrayList<Object> people;
    public ArrayList<Object> organizations;
    public ArrayList<Object> locations;
    public ArrayList<String> keyphrases;
    public String language;
    public String translated_text;
    public String masked_text;
    public Content content;
    public ArrayList<Object> pii_entities;
}