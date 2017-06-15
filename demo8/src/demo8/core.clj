(ns demo8.core

 (:gen-class)
;;  (:import utils.demo)
  (:import [javax.swing JPanel JFrame]
           [javax.swing SwingUtilities]
           [java.awt Dimension]
           [java.awt Color]
           [utils.demo])
)  
(defn f
  "square the argument and divide by 2"
  [x]
  (println "calculating f of" x)
  (/ (* x x) 2.0))

; Create an infinite sequence of results from the function f
; for the values 0 through infinity.  => (iterate inc 0)
; Note that the head of this sequence is being held in the binding "f-seq".
; This will cause the values of all evaluated items to be cached.
(def f-seq (map f (iterate inc 0)))   ;; try (map f (iterate inc 0))   in REPL

; Force evaluation of the first item in the infinite sequence, (f 0).
(println "first is" (first f-seq)) ; -> 0.0

; Force evaluation of the first three items in the infinite sequence.
; Since the (f 0) has already been evaluated,
; only (f 1) and (f 2) will be evaluated.
(doall (take 3 f-seq))

(println (nth f-seq 2)) ; uses cached result -> 2.0

;; investigate further





(defn -main [& args] 

(println "hi there") ;; (System/exit 0))   
(println (nth f-seq 4))
)
