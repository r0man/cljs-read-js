(ns read-js.core
  #?(:cljs (:require [cljs.nodejs :as nodejs])))

(defn -main [& args]
  #?(:cljs (nodejs/enable-util-print!))
  (prn #?(:cljs #js ["hello"]))
  (prn #?(:cljs (clj->js ["hello"]))))

#?(:cljs (set! *main-cli-fn* -main))
