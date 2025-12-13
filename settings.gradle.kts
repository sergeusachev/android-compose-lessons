pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StartAndroid_Compose"
include(":app")
include(":app:lesson1")
include(":app:lesson5")
include(":app:lesson6")
include(":app:lesson7")
include(":app:lesson8")
include(":app:lesson11")
include(":app:lesson12")
include(":app:lesson13")
