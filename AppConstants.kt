package com.kuldeep.momento.core

/**
 * Non-secret application constants.
 *
 * Secrets, API keys, tokens, and credentials must be supplied through
 * secure environment or deployment configuration and never stored here.
 */
object AppConstants {

    const val DEFAULT_PAGE_SIZE = 20
    const val MAX_PAGE_SIZE = 50

    const val USERNAME_MIN_LENGTH = 3
    const val USERNAME_MAX_LENGTH = 30
}
