/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.functions.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Defines a retry strategy where a fixed delay is used between retries.</p>
 *
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FixedDelayRetry {
    /**
     * The strategy of retries that will be used internally.
     * @return The strategy of retries.
     */
    String strategy() default "fixedDelay";
    /**
     * The maximum number of retries that will be attempted.
     * @return The delay between retries.
     */
    int maxRetryCount();
    /**
     * The delay between retries.
     * @return The delay interval.
     */
    String delayInterval();
}
