package com.pkl.gits.jajan.api.Response;


import java.util.List;

/**
 * Created by Varokah on 10/17/2016.
 */

public class BarangResponse {
    private String nama,harga,stok,rating,cicilan,deskripsi,spesifikasi;
    private List<String> url_image,warna;
    private String id_toko,id_kategori;
    private List<Diskon> diskons;
    private List<RatingReview> ratingreviews;

    public BarangResponse(String nama, String harga, String stok, String rating, String cicilan, String deskripsi, String spesifikasi, List<String> url_image, List<String> warna, String id_toko, String id_kategori, List<Diskon> diskons, List<RatingReview> ratingreviews) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.rating = rating;
        this.cicilan = cicilan;
        this.deskripsi = deskripsi;
        this.spesifikasi = spesifikasi;
        this.url_image = url_image;
        this.warna = warna;
        this.id_toko = id_toko;
        this.id_kategori = id_kategori;
        this.diskons = diskons;
        this.ratingreviews = ratingreviews;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCicilan() {
        return cicilan;
    }

    public void setCicilan(String cicilan) {
        this.cicilan = cicilan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public List<String> getUrl_image() {
        return url_image;
    }

    public void setUrl_image(List<String> url_image) {
        this.url_image = url_image;
    }

    public List<String> getWarna() {
        return warna;
    }

    public void setWarna(List<String> warna) {
        this.warna = warna;
    }

    public String getId_toko() {
        return id_toko;
    }

    public void setId_toko(String id_toko) {
        this.id_toko = id_toko;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public List<Diskon> getDiskons() {
        return diskons;
    }

    public void setDiskons(List<Diskon> diskons) {
        this.diskons = diskons;
    }

    public List<RatingReview> getRatingreviews() {
        return ratingreviews;
    }

    public void setRatingreviews(List<RatingReview> ratingreviews) {
        this.ratingreviews = ratingreviews;
    }

}
