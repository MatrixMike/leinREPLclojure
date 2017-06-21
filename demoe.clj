(def person {
	:name "Mike H"
	:address {
	:state "Victoria"}
  :employer {
  :zip "3108"
  :city "Melbourne"
	}})
	
(get-in person [  :employer :zip  ])

(use 'clojure.java.shell)
(def directory (sh "pwd"))

;;  enter directory
(fn [x] (+ x 1))
