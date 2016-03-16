(ns demo9.core
	(:gen-class )
)

(defn -main [& args]
(binding [*out* (java.io.FileWriter. "my.log")]
 ;; ...
  (println "This goes to the file my.log.")
 ;; ...
  (flush))
)
