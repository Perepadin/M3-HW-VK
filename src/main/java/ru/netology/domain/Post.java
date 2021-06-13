package ru.netology.domain;

public class Post {
    private int postId;                     // ID поста
    private int postData;                   // Дата публикации поста
    private int postTime;                   // Время публикации поста
    private int ownerPostId;                // ID владельца поста
    private boolean ownersOnly;             // manager - искать только записи от имени владельца стены.
    private String postDomain;              // manager - короткий адрес пользователя или сообщества.
    private String postQuery;               // manager - поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках.

    private int authorPostId;               // v2 поле created_by - ID автора, который опубликовал запись
                                            // (не учел, что авторы и владельцы группы могут отличаться)

    private String ownerPostName;           // имя автора поста (возможно лишний показатель - нет в документации)
    private String postName;                // название поста (возможно лишний показатель - нет в документации)


    private boolean postFriendsOnly;        // v2 поле friends_only - если запись была создана с опцией «Только для друзей».
                                            // (не учел разграничение по доступу пользователей)

    private boolean favourites;             // v2 добавлено в избранное
    private boolean accept;                 // v2 приватность. Может ли текущий пользователь видеть пост
    private boolean canPin;                 // v2 может ли пользователь закрепить запись
    private boolean canEdit;                // v2 может ли пользователь редактировать запись
    private boolean canDelete;              // v2 может ли пользователь удалить запись
    private boolean isPinned;               // v2 пост закреплен
    private boolean withAds;                // v2 присутствует реклама
                                            // не принял во внимание настройки приватности и возможности закрепления, редактирования и удаления записи.


    private PostContent postContent;        // v2 тело поста с текстом, картинками и тд.
                                            // по документации (copyright) выделяется в отдельный объект, создан класс PostContent

    private GeoInfo geoInfo;                // v2 создан класс GeoInfo
                                            // не учел разделение по гео привязке для постов

    private LikesInfo likesInfo;            // поле likes
    private CommentsInfo commentsInfo;      // поле comments
    private ShareInfo shareInfo;            // поле share
    private ViewsInfo viewsInfo;            // поле views

    private PostSource postSource;          // v2 информация о способе размещения записи
                                            // не прописал варианты размещения записи
    // + get/set на все поля
}
