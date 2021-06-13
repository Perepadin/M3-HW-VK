package ru.netology.domain;

public class CommentsInfo {
    private int countComments;          // общий счетчик комментариев
    private int ownerCommentId;         // ID комментария (возможно лишний показатель - нет в документации)
    private String CommentsBody;        // тело комментария (возможно лишний показатель - нет в документации)
    private int countCommentIdLikes;    // подсчет likes на комментарии (возможно лишний показатель - нет в документации)
    private String commentsOwnerName;   // имя автора комментария (возможно лишний показатель - нет в документации)
    private int commentsOwnerImageUrl;  // изображение автора комментария (возможно лишний показатель - нет в документации)
    private boolean canСomment;         // может ли текущий пользователь оставить комментарий
    private boolean userСomment;        // наличие комментария от текущего пользователя


    private boolean groupsCanСomment;   // v2 поле groups_can_post - информация о том,могут ли сообщества комментировать запись;
                                        // рассматривал функцию со стороны пользователя, забыл про группы.
    private boolean canCloseСomment;    // v2 поле can_close - может ли текущий пользователь закрыть комментарии к записи;
                                        //не учел уровень доступа к функции.
    private boolean canOpenСomment;     // v2 поле can_open -  может ли текущий пользователь открыть комментарии к записи.
                                        //не учел уровень доступа к функции.
}
