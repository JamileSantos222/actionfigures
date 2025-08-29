package br.com.etecia.myapp;

public class Miniatura {
    private int imgMiniatura;
    private String títuloMiniatura;

    public int getImgMiniatura() {
        return imgMiniatura;
    }

    public void setImgMiniatura(int imgMiniatura) {
        this.imgMiniatura = imgMiniatura;
    }

    public String getTítuloMiniatura() {
        return títuloMiniatura;
    }

    public void setTítuloMiniatura(String títuloMiniatura) {
        this.títuloMiniatura = títuloMiniatura;
    }

    public Miniatura(int imgMiniatura, String títuloMiniatura) {
        this.imgMiniatura = imgMiniatura;
        this.títuloMiniatura = títuloMiniatura;
    }
}

