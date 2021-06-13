package ru.netology.domain;

public class Post {
    private int postId;                     // ID поста
    private int postData;                   // Дата публикации поста
    private int postTime;                   // Время публикации поста
    private int ownerPostId;                // ID автора поста
    private String ownerPostName;           // имя автора поста
    private String postName;                // название поста
    private String postBody;                // тело поста с текстом, картинками и тд.
    private LikesInfo likesInfo;            // поле likes
    private CommentsInfo commentsInfo;      // поле comments
    private ShareInfo shareInfo;            // поле share
    private ViewsInfo viewsInfo;            // поле views
}
