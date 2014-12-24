(ns summation)

(defn sum [& args]
  "Finds the sum of all of its arguments"

  (defn sumHelper [total arguments]
    (if (> (count arguments) 0)
      (sumHelper (+ total (first arguments)) (rest arguments))
      total
      )
  )

  (sumHelper 0 args)
  )

(sum 10 20 50 30 40)
(apply sum [])