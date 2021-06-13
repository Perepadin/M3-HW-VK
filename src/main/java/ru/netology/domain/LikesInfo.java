package ru.netology.domain;

public class LikesInfo {
    private int countLikes;         // общий счетчик like
    private int ownerLikeId;        // ID владельца like
    private String LikeOwnerName;   // имя автора like
    private int LikeOwnerImageUrl;  // изображение автора like
    private boolean canLike;        // может ли текущий пользователь поставить лайк
    private boolean userLike;       // лайк от текущего пользователя
}
