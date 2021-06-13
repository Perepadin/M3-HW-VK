package ru.netology.domain;

public class ShareInfo {
    private int countShare;             // общий счетчик Share
    private  boolean canShare;          // v2 информация о том, может ли текущий пользователь сделать репост записи.
    private  boolean userShared;        // v2наличие репоста от текущего пользователя
}
