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

(type :test)

(def person1 {:person/first "Han"
 :person/last "Solo"
 :person/ship {:ship/name "Millennium Falcon"
               :ship/model "YT-1300f light freighter"}})
               
