package com.ms.eldportal.model.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Root{
    @JsonProperty("@odata.context")
    public String odataContext;
    public ArrayList<Value> value;
}