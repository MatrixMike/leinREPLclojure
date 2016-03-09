(binding [*out* (java.io.FileWriter. "my.log")]
 ;; ...
  (println "This goes to the file my.log.")
 ;; ...
  (flush))
  
  
  
