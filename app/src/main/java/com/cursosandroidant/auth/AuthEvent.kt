package com.cursosandroidant.auth

enum class AuthEvent {

    //Exito
    USER_EXIST,
    //El usuario no existe
    NOT_USER_EXIST,
    //Email vacio
    EMPTY_EMAIL,
    //Password vacio
    EMPTY_PASSWORD,
    //Formulario vacio
    EMPTY_FORM,
    //Mail invalido
    INVALID_EMAIL,
    //Password invalido
    INVALID_PASSWORD,
    //Uusuario invalido
    INVALID_USER,
    //Email null
    NULL_EMAIL,
    //password null
    NULL_PASSWORD,
    //formulario vacion
    NULL_FORM,
    //password invalida
    LENGTH_PASSWORD_INVALID

}