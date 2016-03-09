(use '[clojure.java.io :only (reader)])

(defn print-if-contains [line word]
  (when (.contains line word) (println line)))

(let [file "story.txt"
      word "fur"]

  ; with-open will close the reader after
  ; evaluating all the expressions in its body.
  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)] (print-if-contains line word))))
