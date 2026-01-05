pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("__package__\\.android.*")
                includeGroupByRegex("__package__\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Ladder"
include(":app")

include(":core:essentials")
include(":core:common-android")

include(":features:init:domain")
include(":features:init:presentation")
include(":core:theme")
