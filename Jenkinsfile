node {

    stage 'Checkout'
    checkout scm

    stage 'Unit testing'
    sh 'chmod +x gradlew'
    sh './gradlew test'

    stage 'Integration test'


    stage 'End'
    sh 'echo this is the end !'

}