package com.vedant.myapplication;

public class Songs {
    private int id;
    private String name;
    private String artistName;
    private String image;
    private String SongUrl;

    public String getSongWiki() {
        return SongWiki;
    }

    public void setSongWiki(String songWiki) {
        SongWiki = songWiki;
    }

    public String getArtistWiki() {
        return ArtistWiki;
    }

    public void setArtistWiki(String artistWiki) {
        ArtistWiki = artistWiki;
    }

    private String SongWiki;
    private String ArtistWiki;

    public String getSongUrl() {
        return SongUrl;
    }

    public void setSongUrl(String songUrl) {
        SongUrl = songUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Songs(int id, String name, String artistName, String image, String SongUrl, String SongWiki, String ArtistWiki) {
        this.id = id;
        this.name = name;
        this.artistName = artistName;
        this.image = image;
        this.SongUrl = SongUrl;
        this.SongWiki = SongWiki;
        this.ArtistWiki = ArtistWiki;
    }



}
