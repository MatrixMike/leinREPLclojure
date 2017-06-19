(ns demod.core
	(:gen-class)
  (:require [clojure.string :as str])
  (:require [clojure.set :as set1])
)
;
;   needs the intersection definitions file - ATM I copy the Rich Hickey text into REPL but need to use proper command 
; to treat the .clj file like an 'include' file

(def word1 "storage")
(def word2 "capacitor")
(def word3 "electrolytic")
(def word4 "tantalum")
(def word5 "positive")
(def word6 "negative")
(def word7 "zinc")
(def word8 "brass")
;(def wordlist ("storage" "capacitor"))
;(def wordlist ("storage" "capacitor"))

; does odd things with word negative ... maybe a keyword
;
(defn crossw2 [word1 word2]
	(def ws1 (set word1))
	(def ws2 (set word2))
	;; test for word1 eq word2 and ignore if it is (= word1 word2) else print 
  ;(println)
  (if (= word1 word2) () (println(str word1 "+" word2 (set1/intersection ws1 ws2)  )))
 ; (println())
	)
;

(def newwords ( seq [word1 word2 word5 word4 word3 word6 word7 word8]))
(for [a newwords  b newwords ]    ( crossw2 a b))
;
(defn -main [& args]
  (println(crossw2 "Mike" "Hewitt"))
 ;  (if (= word7 word8) (
    (println(crossw2 word8 word7))

  (print(for [a newwords  b newwords ]    (  crossw2 a b)))
  )
; if two words intersect {non null result} then find a place where they do 
; and try an intersection with other word in list 
;
;
