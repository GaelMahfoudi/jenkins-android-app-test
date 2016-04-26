node {

    stage 'Ultimate try !'
    echo "${env.BRANCH_NAME}"
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: '${env.BRANCH_NAME}']]

}