node {

    stage 'Ultimate try !'
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: "${env.BRANCH_NAME}"]]

}