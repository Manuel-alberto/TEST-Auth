package com.cursosandroidant.auth

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AuthTest {

    @Test
    fun login_complete_returnsTrue(){
        val result = userAuthentication("ant@gmail.com", "1234")
        assertTrue(result)
    }

    @Test
    fun login_complete_returnsFalse(){
        val result = userAuthentication("nt@gmail.com", "124")
        assertFalse(result)
    }

    @Test
    fun login_emptyEmail_returnsFalse(){
        val result = userAuthentication("", "124")
        assertFalse(result)
    }

    /*
    @Test
    fun login_nullEmail_returnsFalse(){
        val result = userAuthenticationTDD(null, "124")
        assertFalse(result)
    }

    @Test
    fun login_nullPassword_returnsFalse(){
        val result = userAuthenticationTDD("ant@gmail.com", null)
        assertFalse(result)
    }*/

}