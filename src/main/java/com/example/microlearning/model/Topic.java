package com.example.microlearning.model;


import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.sql.Timestamp;

@Entity
@Table
public class Topic implements Serializable {

    @Id
    @SequenceGenerator(
            name = "topic_sequence",
            sequenceName = "topic_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "topic_sequence"
    )
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private URL url;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "dislikes")
    private Integer dislikes;

    @Column(name = "recommended")
    private Long recommended;

    @Column(name = "created")
    private Timestamp created;

    @Column(name = "updated")
    private Timestamp updated;

    public Topic() {}

    public Topic(Long id,
                 String title,
                 String description,
                 URL url,
                 Integer likes,
                 Integer dislikes,
                 Long recommended,
                 Timestamp created,
                 Timestamp updated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.likes = likes;
        this.dislikes = dislikes;
        this.recommended = recommended;
        this.created = created;
        this.updated = updated;
    }

    public Topic(String title,
                 String description,
                 URL url,
                 Integer likes,
                 Integer dislikes,
                 Long recommended,
                 Timestamp created,
                 Timestamp updated) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.likes = likes;
        this.dislikes = dislikes;
        this.recommended = recommended;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Long getRecommended() {
        return recommended;
    }

    public void setRecommended(Long recommended) {
        this.recommended = recommended;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url=" + url +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", recommended=" + recommended +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}