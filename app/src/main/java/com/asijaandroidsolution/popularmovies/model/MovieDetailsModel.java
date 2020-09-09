package com.asijaandroidsolution.popularmovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDetailsModel {

    /**
     * adult : false
     * backdrop_path : /qGZe9qTuydxyJYQ60XDtEckzLR8.jpg
     * belongs_to_collection : null
     * budget : 3268650
     * genres : [{"id":18,"name":"Drama"},{"id":53,"name":"Thriller"}]
     * homepage : http://www.quexito.com/en/portfolio-items/origenes-secretos
     * id : 438396
     * imdb_id : tt5827790
     * original_language : es
     * original_title : Orígenes secretos
     * overview : In Madrid, Spain, a mysterious serial killer ruthlessly murders his victims by recreating the first appearance of several comic book superheroes. Cosme, a veteran police inspector who is about to retire, works on the case along with the tormented inspector David Valentín and his own son Jorge Elías, a nerdy young man who owns a comic book store.
     * popularity : 1572.558
     * poster_path : /sMO1v5TUf8GOJHbJieDXsgWT2Ud.jpg
     * production_companies : [{"id":126075,"logo_path":null,"name":"In Post We Trust","origin_country":"AR"},{"id":134511,"logo_path":null,"name":"La Chica de la Curva","origin_country":"ES"},{"id":10012,"logo_path":null,"name":"Nadie es Perfecto","origin_country":"ES"},{"id":981,"logo_path":"/pkrdO9ykplO4Zc8edikoSX5APUN.png","name":"TVE","origin_country":"ES"},{"id":85588,"logo_path":null,"name":"Quexito Films","origin_country":"ES"},{"id":103476,"logo_path":null,"name":"Mogambo Films","origin_country":"ES"}]
     * production_countries : [{"iso_3166_1":"AR","name":"Argentina"},{"iso_3166_1":"ES","name":"Spain"}]
     * release_date : 2020-08-28
     * revenue : 0
     * runtime : 97
     * spoken_languages : [{"iso_639_1":"es","name":"Español"}]
     * status : Released
     * tagline :
     * title : Unknown Origins
     * video : false
     * vote_average : 6.2
     * vote_count : 109
     */

    @SerializedName("adult")
    private boolean adult;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("belongs_to_collection")
    private Object belongsToCollection;
    @SerializedName("budget")
    private int budget;
    @SerializedName("homepage")
    private String homepage;
    @SerializedName("id")
    private int id;
    @SerializedName("imdb_id")
    private String imdbId;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("overview")
    private String overview;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("revenue")
    private int revenue;
    @SerializedName("runtime")
    private int runtime;
    @SerializedName("status")
    private String status;
    @SerializedName("tagline")
    private String tagline;
    @SerializedName("title")
    private String title;
    @SerializedName("video")
    private boolean video;
    @SerializedName("vote_average")
    private double voteAverage;
    @SerializedName("vote_count")
    private int voteCount;
    @SerializedName("genres")
    private List<GenresBean> genres;
    @SerializedName("production_companies")
    private List<ProductionCompaniesBean> productionCompanies;
    @SerializedName("production_countries")
    private List<ProductionCountriesBean> productionCountries;
    @SerializedName("spoken_languages")
    private List<SpokenLanguagesBean> spokenLanguages;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public List<GenresBean> getGenres() {
        return genres;
    }

    public void setGenres(List<GenresBean> genres) {
        this.genres = genres;
    }

    public List<ProductionCompaniesBean> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompaniesBean> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<ProductionCountriesBean> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<ProductionCountriesBean> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public List<SpokenLanguagesBean> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<SpokenLanguagesBean> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public static class GenresBean {
        /**
         * id : 18
         * name : Drama
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

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
    }

    public static class ProductionCompaniesBean {
        /**
         * id : 126075
         * logo_path : null
         * name : In Post We Trust
         * origin_country : AR
         */

        @SerializedName("id")
        private int id;
        @SerializedName("logo_path")
        private Object logoPath;
        @SerializedName("name")
        private String name;
        @SerializedName("origin_country")
        private String originCountry;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(Object logoPath) {
            this.logoPath = logoPath;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }
    }

    public static class ProductionCountriesBean {
        /**
         * iso_3166_1 : AR
         * name : Argentina
         */

        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("name")
        private String name;

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpokenLanguagesBean {
        /**
         * iso_639_1 : es
         * name : Español
         */

        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("name")
        private String name;

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
