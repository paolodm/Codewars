(ns reverse-test
  (:require [clojure.test :refer :all]
            [reverse :as reverse]))

(defn reverse
  "Reverse a list"
  [lst]

  (if (not (= (count lst) 0))
    (flatten (cons (reverse (rest lst)) (list (first lst))))
    '()
    )
)

(reverse [1 2 3])
(reverse [])

(def input1 [1 9 13 1 99 9 9 13])
(def input2 (repeatedly (+ 5 (rand-int 10)) #(rand-int 100)))
(def input3 "\"There are only two kinds of languages: the ones people complain about and the ones nobody uses\" - Bjarne Stroustrup")

(reverse input2)
(reverse [])

(defn reverse2
  [lst]

  (reduce conj '() lst)
  )

(defn reverse3
  [lst]

  (into () lst)
  )

(reverse3 '(3 2 1))
(reverse3 [])