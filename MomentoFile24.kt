package com.kuldeep.momento.core

/**
 * Normalizes user-provided text before it reaches application logic.
 *
 * This intentionally performs only deterministic, non-destructive cleanup.
 */
object TextNormalizer {

    fun normalize(value: String): String {
        return value
            .trim()
            .replace(Regex("\\s+"), " ")
    }

    fun normalizeUsername(value: String): String {
        return normalize(value).lowercase()
    }
}
