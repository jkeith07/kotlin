// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
package org.jetbrains.kotlin.gradle.dsl

internal abstract class KotlinJsOptionsBase : org.jetbrains.kotlin.gradle.dsl.KotlinJsOptions {

    private var apiVersionField: kotlin.String? = null
    override var apiVersion: kotlin.String
        get() = apiVersionField ?: "1.0"
        set(value) { apiVersionField = value }

    private var kjsmField: kotlin.Boolean? = null
    override var kjsm: kotlin.Boolean
        get() = kjsmField ?: true
        set(value) { kjsmField = value }

    private var languageVersionField: kotlin.String? = null
    override var languageVersion: kotlin.String
        get() = languageVersionField ?: "1.0"
        set(value) { languageVersionField = value }

    private var mainField: kotlin.String? = null
    override var main: kotlin.String
        get() = mainField ?: "noCall"
        set(value) { mainField = value }

    private var metaInfoField: kotlin.Boolean? = null
    override var metaInfo: kotlin.Boolean
        get() = metaInfoField ?: true
        set(value) { metaInfoField = value }

    private var moduleKindField: kotlin.String? = null
    override var moduleKind: kotlin.String
        get() = moduleKindField ?: "plain"
        set(value) { moduleKindField = value }

    private var noStdlibField: kotlin.Boolean? = null
    override var noStdlib: kotlin.Boolean
        get() = noStdlibField ?: true
        set(value) { noStdlibField = value }

    private var outputFileField: kotlin.String?? = null
    override var outputFile: kotlin.String?
        get() = outputFileField ?: null
        set(value) { outputFileField = value }

    private var sourceMapField: kotlin.Boolean? = null
    override var sourceMap: kotlin.Boolean
        get() = sourceMapField ?: false
        set(value) { sourceMapField = value }

    private var suppressWarningsField: kotlin.Boolean? = null
    override var suppressWarnings: kotlin.Boolean
        get() = suppressWarningsField ?: false
        set(value) { suppressWarningsField = value }

    private var targetField: kotlin.String? = null
    override var target: kotlin.String
        get() = targetField ?: "v5"
        set(value) { targetField = value }

    private var verboseField: kotlin.Boolean? = null
    override var verbose: kotlin.Boolean
        get() = verboseField ?: false
        set(value) { verboseField = value }

    open fun updateArguments(args: org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments) {
        apiVersionField?.let { args.apiVersion = it }
        kjsmField?.let { args.kjsm = it }
        languageVersionField?.let { args.languageVersion = it }
        mainField?.let { args.main = it }
        metaInfoField?.let { args.metaInfo = it }
        moduleKindField?.let { args.moduleKind = it }
        noStdlibField?.let { args.noStdlib = it }
        outputFileField?.let { args.outputFile = it }
        sourceMapField?.let { args.sourceMap = it }
        suppressWarningsField?.let { args.suppressWarnings = it }
        targetField?.let { args.target = it }
        verboseField?.let { args.verbose = it }
    }
}

internal fun org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments.fillDefaultValues() {
    apiVersion = "1.0"
    kjsm = true
    languageVersion = "1.0"
    main = "noCall"
    metaInfo = true
    moduleKind = "plain"
    noStdlib = true
    outputFile = null
    sourceMap = false
    suppressWarnings = false
    target = "v5"
    verbose = false
}
