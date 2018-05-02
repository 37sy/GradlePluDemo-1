package com.plu.src

import org.gradle.api.Plugin
import org.gradle.api.Project


public class PluginImpl implements Plugin<Project> {

    void apply(Project project) {
        project.task('zgxTestTask') << {
            println "==========> Hello gradle plugin ========== "
        }
    }

}