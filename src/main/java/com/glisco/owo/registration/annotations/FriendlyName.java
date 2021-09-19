package com.glisco.owo.registration.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.BiConsumer;

/**
 * Declares the name the targeted field should be assigned when processed by
 * {@link com.glisco.owo.registration.reflect.FieldRegistrationHandler}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FriendlyName {
    String value();
}
