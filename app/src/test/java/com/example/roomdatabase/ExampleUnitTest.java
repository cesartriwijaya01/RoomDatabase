buildscript {
        repositories {
        google()
        jcenter()
        mavenCentral()
        }
        dependencies {
        classpath 'com.android.tools.build:gradle:3.3.1'
        classpath 'org.greenrobot:greendao-gradle-plugin:3.2.2' // <-- Add this line
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        }
        }

        allprojects {
        repositories {
        google()
        jcenter()

        }
        }

        task clean(type: Delete) {
        delete rootProject.buildDir
        }