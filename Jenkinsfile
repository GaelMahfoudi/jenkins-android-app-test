node {

    stage 'Ultimate try !'
    def branchName = "${env.WORKSPACE}"
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: branchName]]

}