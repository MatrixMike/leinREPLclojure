(ns democ.core
	(:gen-class )
	)
	
;;	(
 ;; (:require [clojure.string :as su])
  ; assumes this dependency: [org.clojure/math.numeric-tower "0.0.1"]
;;  (:use [clojure.math.numeric-tower :only (gcd, sqrt)])
  (:import      ;;   (java.text NumberFormat)
     (javax.swing JFrame JLabel));;    )

;;(println (su/join "$" [1 2 3])) ; -> 1$2$3
;;(println (gcd 27 72)) ; -> 9
;;(println (sqrt 5)) ; -> 2.23606797749979
;;  (println (.format (NumberFormat/getInstance) Math/PI)) ; -> 3.142
    
; See the screenshot that follows this code.

(defn -main [& args]
(doto (JFrame. "Hello")
  (.add (JLabel. "Hello, World!"))
  (.pack)
  (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
  (.setVisible true))
)

