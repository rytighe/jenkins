job("job1"){
	steps{
		shell(readFileFromWorkspace('scripts/script1.sh'))
	}		
}
