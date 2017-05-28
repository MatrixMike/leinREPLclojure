(ns demo3.core
  (:gen-class )
)


(import '(java.util Calendar GregorianCalendar))
(let [gc (GregorianCalendar.)
      day-of-week (.get gc Calendar/DAY_OF_WEEK)
      is-weekend (or (= day-of-week Calendar/SATURDAY) (= day-of-week Calendar/SUNDAY))]
  (if is-weekend
    (println "play")
    (do (println "work")
        (println "sleep")
        )
        )
        )
        
        
(defn -main [& args]        
   (when is-weekend (println "play"))
(when-not is-weekend (println "\n") (println "work") (println "sleep"))  ;; force a newline even in REPL
)

     
