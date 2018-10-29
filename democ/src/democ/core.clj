;;============================
(ns democ.core
(:gen-class)
;;
  (:import [javax.swing JPanel JFrame JLabel]
           [java.awt Dimension])
  (:require [clojure.string :as su])
  (:require [clojure.math.numeric-tower :as math])
 )
 

;;	(
 ;; 
  ; assumes this dependency: [org.clojure/math.numeric-tower "0.0.1"]
;;  (:use [clojure.math.numeric-tower :only (gcd, sqrt)])
 ;; (:import      ;;   (java.text NumberFormat)   (javax.swing JFrame JLabel))
;; https://stackoverflow.com/questions/32386047/greatest-common-divisor-in-clojure
( comment (defn gcd [a b]
        (if (zero? b)
          a
          (recur b (mod a b)))))

(println (math/gcd 27 72)) ; -> 9
;;(println (sqrt 5)) ; -> 2.23606797749979
;;  (println (.format (NumberFormat/getInstance) Math/PI)) ; -> 3.142
    
; See the screenshot that follows this code.

(defn -main "" [& args]
(doto (JFrame. "Hello")
  (println (su/join "$" [1 2 3])) ; -> 1$2$3
  (.add (JLabel. (str "Hello, World! " (math/gcd 27 72))))
  (.pack)
  (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
  (.setVisible true))

)

