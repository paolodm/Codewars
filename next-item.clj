(ns lazy-next)

(defn next-item
  "Returns the value that comes after item in xs or nil"
  [xs item]

  (let [index (.indexOf xs item)]

    (if (or (>= (+ index 1) (count xs)) (= index -1))
          nil
          (nth xs (+ index 1))
          )
    )

  )


(next-item [1 2 3] 2)
(next-item [1 2 3] 1)
(next-item [1 2 3] 3)
(next-item [1 2 3] 5)
(next-item (range -6 25) 2)

(count (range 1 25))
(range 1 25)
(count [1 2 4])

(next-item ["Joe", "Bob", "Sally"], "Hoe")
(next-item ["Joe", "Bob", "Sally"], "Joe")
(next-item [:a, :b, :c] :d)
(next-item [:a, :b, :c] :c)

((next-item "testing" \t) \e)
((next-item "testing" "t") "e")
