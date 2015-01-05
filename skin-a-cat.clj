(ns skin-a-cat)

(defn sum
  [& args]

  (if (= (count args) 1)
      (partial + (first args))
      (+ (first args) (second args))
    )
  )


(println (sum 5 2))

;((sum 5) 5)
