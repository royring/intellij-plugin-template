package com.github.royring.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.royring.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
