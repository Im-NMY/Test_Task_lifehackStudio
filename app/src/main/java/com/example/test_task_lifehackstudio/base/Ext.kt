package com.example.test_task_lifehackstudio.base

import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

inline fun <reified T> attempt(func: () -> T): Either<Throwable, T> = try {
    Either.Right(func.invoke())
} catch (e: Throwable) {
    Either.Left(e)
}

/**
 * ext.Fun FragmentBindingDelegate
 */
fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T) =
    FragmentBindingDelegate(this, viewBindingFactory)

