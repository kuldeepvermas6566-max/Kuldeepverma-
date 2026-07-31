package com.kuldeep.momento.core

/**
 * Central application configuration for Momento.
 *
 * Environment-specific secrets and credentials must never be stored here.
 * They should be supplied through secure build or deployment configuration.
 */
object MomentoConfig {

    const val APP_NAME = "Momento"

    const val PACKAGE_NAME = "com.kuldeep.momento"
}
