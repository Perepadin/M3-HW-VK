package ru.netology.domain;

public class LikesInfo {
    private int countLikes;         // общий счетчик like
    private int ownerLikeId;        // ID владельца like (возможно лишний показатель - нет в документации)
    private String LikeOwnerName;   // имя автора like (возможно лишний показатель -нет в документации)
    private int LikeOwnerImageUrl;  // изображение автора like (возможно лишний показатель -нет в документации)
    private boolean canLike;        // может ли текущий пользователь поставить лайк
    private boolean userLike;       // лайк от текущего пользователя
}
