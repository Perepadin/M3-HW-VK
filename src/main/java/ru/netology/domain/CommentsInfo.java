package ru.netology.domain;

public class CommentsInfo {
    private int countComments;          // общий счетчик комментариев
    private int ownerCommentId;         // ID комментария
    private String CommentsBody;        // тело комментария
    private int countCommentIdLikes;    // подсчет likes на комментарии
    private String commentsOwnerName;   // имя автора комментария
    private int commentsOwnerImageUrl;  // изображение автора комментария
    private boolean canСomment;         // может ли текущий пользователь оставить комментарий
    private boolean userСomment;        // комментарий от текущего пользователя
}

