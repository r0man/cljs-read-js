(ns read-js.core
  #?(:cljs (:require [cljs.nodejs :as nodejs])))

(defn -main [& args]
  #?(:cljs (nodejs/enable-util-print!))
  (prn #?(:cljs #js ["hello"]))
  (prn #?(:cljs (clj->js ["hello"]))))

#?(:cljs (set! *main-cli-fn* -main))

;; Running this with `node out/main.js` prints the following:
;; The first line should be a JS array

;; ["hello"]
;; #js ["hello"]
