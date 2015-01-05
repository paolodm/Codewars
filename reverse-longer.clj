(ns ReverseLonger)

(defn reverseLonger
  [first second]

  (defn helper
    [longer shorter]
    (str shorter (clojure.string/reverse longer) shorter)
    )

    (if
      (>= (count first) (count second)) (helper first second)
      (helper second first))
  )


(println (reverseLonger "abcde" "first"))
