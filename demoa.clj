(let [obj1 "foo"
      obj2 {:letter \a :number (Math/PI)}] ; a map
    
    (def text "Output from ")
    
      
  (println text "Output from print:")
  (print obj1 obj2)

  (println "Output from println:")
  (println obj1 obj2)

  (println "Output from pr:")
  (pr obj1 obj2)

  (println "Output from prn:")
  (prn obj1 obj2))
  
  
