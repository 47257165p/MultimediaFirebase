package com.multimediafirebase;

/**
 * Created by 47257165p on 17/02/16.
 */
public class Nota {
    private String titulo;
    private String descripcion;
    private String latitud;
    private String longitud;
    private String pathFoto;
    private String pathVideo;
    private String pathMusica;

    public Nota(){
    }

    public Nota(String titulo, String descripcion, String latitud, String longitud, String pathFoto, String pathVideo, String pathMusica) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.pathFoto = pathFoto;
        this.pathVideo = pathVideo;
        this.pathMusica = pathMusica;
    }

    public Nota(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getPathVideo() {
        return pathVideo;
    }

    public void setPathVideo(String pathVideo) {
        this.pathVideo = pathVideo;
    }

    public String getPathMusica() {
        return pathMusica;
    }

    public void setPathMusica(String pathMusica) {
        this.pathMusica = pathMusica;
    }
}
