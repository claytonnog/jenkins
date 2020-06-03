job('NodeJS example') {
    scm {
        git('git://github.com/claytonnog/jenkins.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Clayton Neves')
            node / gitConfigEmail('clayton.nog@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}