package com.wandrstick.Security;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

/*
* access the currently authenticated user in the controllers.
* */

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {

}