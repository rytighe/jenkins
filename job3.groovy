job("job3"){
	steps{
		shell(readFileFromWorkspace('scripts/script1.sh'))
	}		
}
