package ru.doneathome.savevideolink.daoHibernateSpring.enums;

/**
 * Роли пользователя
 */
public enum RoleType {
    /**
     * Полный доступ
     */
    ROLE_SUPER_ADMIN,
    /**
     * Нет власти влиять на структуру приложения
     */
    ROLE_ADMIN,
    /**
     * Зарегестрированный пользователь
     */
    ROLE_USER,
    /**
     * Не зарегестрированный пользователь
     */
    ROLE_GUEST
}
