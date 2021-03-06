(ns demo2.core
	(:gen-class )
  )

(defn delayed-print [ms text]
  (Thread/sleep ms)
  (println text))

; Pass an anonymous function that invokes delayed-print
; to the Thread constructor so the delayed-print function
; executes inside the Thread instead of
; while the Thread object is being created.
(.start (Thread. #(delayed-print 2000 ", World!"))) ; prints 2nd
(print "just wait a bit after you see this : Hello") ; prints 1st
; output is "Hello, World!"

(defn -main [& args]
 (.start (Thread. #(delayed-print 20000 ", World!"))) ; prints 2nd
 ;; need to flush print q here
 (.start (Thread. #(delayed-print 20000 ", World!"))) ; prints 2nd
)



