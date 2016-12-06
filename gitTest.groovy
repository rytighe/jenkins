job("gitTest"){
	scm {
		git {
			remote {
                		github('rytighe/internet', 'ssh')
                		credentials('rytighe')
            		}
    		}
	}

	steps {
        	maven('-e clean')
    	}
}
