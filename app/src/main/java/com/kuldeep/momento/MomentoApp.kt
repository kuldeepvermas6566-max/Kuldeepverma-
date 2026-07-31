package com.kuldeep.momento

import android.app.Application

/**
 * Root Application class for Momento.
 *
 * This is intentionally kept small. Application-wide initialization
 * will be introduced through dedicated infrastructure components rather
 * than accumulating unrelated startup logic here.
 */
class MomentoApp : Application()
