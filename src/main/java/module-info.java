module argon.main {
    requires lombok;
    requires org.jetbrains.annotations;
    opens com.zylquinal.argon2.api;
    opens com.zylquinal.argon2.api.enumeration;
    opens com.zylquinal.argon2.api.exception;
}