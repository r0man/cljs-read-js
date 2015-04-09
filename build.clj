(ns build
  (:require [cljs.closure :as closure]))

(closure/build
 "src"
 {:main 'read-js.core
  :output-to "out/main.js"
  :target :nodejs
  :verbose true})
