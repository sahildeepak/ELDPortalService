package com.ms.eldportal.model.search;

import lombok.Data;

import java.util.Date;

@Data
public class Content{
    public String name;
    public String userName;
    public Date created;
    public String videoURL;
    public String transcription;
}