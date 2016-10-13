// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
package org.jetbrains.kotlin.gradle.dsl

interface KotlinJvmOptions {

    /**
     * Allow to use declarations only from the specified version of bundled libraries
     * Possible values: "1.0"
     * Default value: "1.0"
     */
     var apiVersion: kotlin.String

    /**
     * Include Kotlin runtime in to resulting .jar
     * Default value: false
     */
     var includeRuntime: kotlin.Boolean

    /**
     * Path to JDK home directory to include into classpath, if differs from default JAVA_HOME
     * Default value: null
     */
     var jdkHome: kotlin.String?

    /**
     * Target version of the generated JVM bytecode, only 1.6 is supported
     * Possible values: "1.6"
     * Default value: "1.6"
     */
     var jvmTarget: kotlin.String

    /**
     * Provide source compatibility with specified language version
     * Possible values: "1.0"
     * Default value: "1.0"
     */
     var languageVersion: kotlin.String

    /**
     * Don't include Java runtime into classpath
     * Default value: false
     */
     var noJdk: kotlin.Boolean

    /**
     * Don't include Kotlin reflection implementation into classpath
     * Default value: true
     */
     var noReflect: kotlin.Boolean

    /**
     * Don't include Kotlin runtime into classpath
     * Default value: true
     */
     var noStdlib: kotlin.Boolean

    /**
     * Generate no warnings
     * Default value: false
     */
     var suppressWarnings: kotlin.Boolean

    /**
     * Enable verbose logging output
     * Default value: false
     */
     var verbose: kotlin.Boolean

    /**
     * A list of additional compiler arguments
     * Default value: emptyList()
     */
     var freeCompilerArgs: kotlin.collections.List<kotlin.String>
}
