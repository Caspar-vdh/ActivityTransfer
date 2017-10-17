#Activity transfer app
Created to test the performance of activity transitions (when compared to full screen fragment transitions). The
transitions use a cross fade animation. Both fade-in and fade-out take 500 ms 

Issues to compare are:
* APK size
* Speed of the transitions (overhead?)
* Memory usage / CPU usage

##Run tests
To run a test, change the type of *INSTANCE* in the *TestListener* interface
* *EmptyTestListener* - will do nothing
* *TimerTestListener* - will make sure that *MAX_ITERATIONS* transitions take place, then prints the number of
  milliseconds this took to the screen using a Toast message
  
##Test results
###17 October 2017 
* **APK size** (Release build, unsigned, no proguard): 1,823,607 bytes (1.739 MB)
* **Transition speed** (Debug build, average of 500 transitions): 668.228 ms.