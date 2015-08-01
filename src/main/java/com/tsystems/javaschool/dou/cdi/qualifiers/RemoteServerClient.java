package com.tsystems.javaschool.dou.cdi.qualifiers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


/**
 * Qualifier for Web Services clients. 
 * Represents that server is located remotely.
 * 
 * @author Andrey Baliushin
 *
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
public @interface RemoteServerClient {
}
