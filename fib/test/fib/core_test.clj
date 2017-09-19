(ns fib.core-test
  (:require [clojure.test :refer :all]
            [fib.core :refer :all]))

(deftest fibtest
    (is (= 0 (fibn 0)))
    (is (= 1 (fibn 1)))
    (is (= 1 (fibn 2)))
    (is (= 2 (fibn 3)))
    (is (= 3 (fibn 4)))
    (is (= 5 (fibn 5)))
    (is (= 8 (fibn 6)))
    (is (= 13 (fibn 7)))
   )

