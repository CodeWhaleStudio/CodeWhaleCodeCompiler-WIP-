package com.bluewhaleyt.codewhale.language.compiler.java

import android.os.Build
import com.android.tools.r8.CompilationMode
import com.bluewhaleyt.codewhale.code.core.compiler.CompileOptions
import com.bluewhaleyt.codewhale.code.core.ExperimentalCompilerApi
import java.io.InputStream

@ExperimentalCompilerApi
open class JavaCompileOptions(
    var sourceVersion: String = "8",
    var targetVersion: String = sourceVersion,
    var generateJar: Boolean = false,
    var flags: String? = null,
    var minApiLevel: Int = Build.VERSION_CODES.O,
    var mode: CompilationMode = CompilationMode.DEBUG,
    var inputStream: InputStream? = null,
    open var className: String = "Main"
) : CompileOptions()