// "Add '<*, *>'" "true"
public fun foo(a: Any) {
    when (a) {
        is Map<*, *> -> {}
        else -> {}
    }
}