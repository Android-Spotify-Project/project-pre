package com.com.clone_spotify.model;

import android.widget.Button;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Library {
    private String mediaId;
    private String albumImg;
    private String songTitle;
    private String artistName;
    private String songUrl;

}
