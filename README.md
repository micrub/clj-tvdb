# clj-tvdb

A Clojure library designed to ... well, that part is up to you.

## Usage

Environment variables loaded using lein-environ plugin while working with repl,
usually environment metada map is stored in ~/.lein/profiles.clj.

Example of ~/.lein/profiles.clj

```clojure
{:user
 {:plugins [[lein-environ "0.5.0"]]
  :env {:tvdb {:api-key-project-name "clj-tvdb"
               :api-key "XXXXXXXXXXXXXXXX"}}}}
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
