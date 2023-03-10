package com.cursosandroidant.auth

import org.junit.Assert
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class AuthAlTest {

    private var email: String? = null
    private var password: String? = null

    @Before
    fun setup(){
        email = "ant@gmail.com"
        password = "1234"
    }

    @Test
    fun login_completeFrom_existUser_returnsSuccessEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.USER_EXIST, result)
    }

    @Test
    fun login_completeForm_notExistUser_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.NOT_USER_EXIST, result)
    }

    @Test
    fun login_emptyEmail_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.EMPTY_EMAIL, result)
    }

    @Test
    fun login_emptyPassword_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.EMPTY_PASSWORD, result)
    }

    @Test
    fun login_emptyForm_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.EMPTY_FORM, result)
    }

    @Test
    fun login_completeForm_invalidEmail_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.INVALID_EMAIL, result)
    }

    @Test
    fun login_completeForm_invalidPassword_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.INVALID_PASSWORD, result)
    }

    @Test
    fun login_completedForm_invalidUser_returnsFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.INVALID_USER, result)
    }

    @Test(expected = AuthException::class)
    fun login_nullEmail_returnsFailException(){
        /*region Description
        val result = userAuthenticationTDD(null,"123e4")
        Assert.assertEquals(AuthEvent.NULL_EMAIL, result)
        */

        try {
            val result = userAuthenticationTDD(email, password)
            Assert.assertEquals(AuthEvent.NULL_EMAIL, result)
        } catch (e: Exception) {
            (e as? AuthException)?.let {
                Assert.assertEquals(AuthEvent.NULL_EMAIL, it.authEvent)
            }
        }

    }

    @Test
    fun login_nullPassword_returnsException(){
        /*Assert.assertThrows(AuthException::class.java) {
            print(userAuthenticationTDD("ant@gmail.com", null))
        }*/

        try {
            val result = userAuthenticationTDD(email, password)
            Assert.assertEquals(AuthEvent.NULL_PASSWORD, result)
        } catch (e: Exception) {
            (e as? AuthException)?.let {
                Assert.assertEquals(AuthEvent.NULL_PASSWORD, it.authEvent)
            }
        }

    }

    @Test
    fun login_nullForm_returnException(){
        try {
            val result = userAuthenticationTDD(email, password)
            Assert.assertEquals(AuthEvent.NULL_FORM, result)
        } catch (e: Exception) {
            (e as? AuthException)?.let {
                Assert.assertEquals(AuthEvent.NULL_FORM, it.authEvent)
            }
        }
    }

    @Ignore("Falta definir un requisito del cliente")
    @Test
    fun login_completeForm_errorLengthPassword_returnFailEvent(){
        val result = userAuthenticationTDD(email, password)
        Assert.assertEquals(AuthEvent.LENGTH_PASSWORD_INVALID, result)
    }

}