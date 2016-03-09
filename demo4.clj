(print "Enter a number: ") (flush) ; stays in a buffer otherwise
(let [reader (java.io.BufferedReader. *in*) ; stdin
      line (.readLine reader)
      value (try
              (Integer/parseInt line)
              (catch NumberFormatException e line))] ; use string value if not integer
  (println
    (condp = value
      1 "one"
      2 "two"
      3 "three"
      (str "unexpected value, \"" value \")))
  (println
    (condp instance? value
      Number (* value 2)
      String (* (count value) 2))))
      
      
