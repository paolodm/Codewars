(ns lazy-next)

(defn next-item
  "Returns the value that comes after item in xs or nil"
  ([xs item]
  (second (drop-while (complement #{item}) xs))))


; ((next-item "testing" \t) \e)
; ((next-item "testing" "t") "e")

(next-item (range 1 25) 12)

(next-item "testing" \t)


(def arr (range 1 25))

((complement #{4}) 6)

(complement #{arr})

((complement #{(range 1 5)}) 3)
