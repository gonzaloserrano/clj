(ns fib.core)

(defn fibn [x]
  (cond
    (= x 0) 0
    (= x 1) 1
    :else (+ (fibn (- x 1)) (fibn (- x 2)))
  )
)
