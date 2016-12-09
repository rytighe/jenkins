def gitUrl = 'git://github.com/rytighe/internet.git'
job("gitTest"){
	scm {
		git {
			remote {
				git(gitUrl)
                		credentials('rytighe')
            		}
    		}
	}

	steps {
        	maven('-e clean')
    	}
}
