package com.kuldeep.momento.core

/**
 * Provides a small, consistent abstraction for validating user-facing input.
 *
 * Keeping validation rules outside UI code makes them reusable by screens,
 * view models, and future data-entry flows.
 */
object InputValidator {

    fun isValidUsername(value: String): Boolean {
        val normalized = value.trim()
        return normalized.length in
            AppConstants.USERNAME_MIN_LENGTH..AppConstants.USERNAME_MAX_LENGTH &&
            normalized.all { it.isLetterOrDigit() || it == '_' || it == '.' }
    }

    fun isValidPageSize(value: Int): Boolean {
        return value in 1..AppConstants.MAX_PAGE_SIZE
    }
}
