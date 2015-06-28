#==================================================
# 設定読み込み
#==================================================

config = require './gulp/config.coffee'

#==================================================
# ライブラリ読み込み
#==================================================

gulp        = require 'gulp'
slim        = require 'gulp-slim'
plumber     = require 'gulp-plumber'
plantuml    = require 'gulp-plantuml'
webserver   = require 'gulp-webserver'
browserSync = require 'browser-sync'

#==================================================
# task
#==================================================
gulp.task 'slim', ->
  gulp.src config.slim.src
    .pipe gulp.dest 'build/'
    .pipe browserSync.stream()

gulp.task 'webserver', ->
  gulp.src 'build/'
    .pipe webserver
      livereload: true,
      host: '0.0.0.0'
      port: '8000'

gulp.task 'plantuml', ->
  gulp.src "./diagram/**/*.pu"
    .pipe plantuml(
      jarPath: "/home/maxmellon/local/bin/plantuml.jar"
    )
    .pipe gulp.dest "./build/diagram"
    .pipe browserSync.stream()


# 監視して自動コンパイル
gulp.task 'watch', ->
  gulp.watch config.slim.src, [ "slim" ]
  gulp.watch "./diagram/**/*.pu", [ "plantuml" ]
  gulp.src 'gulpfile.coffee'

# デフォルト
gulp.task 'default', ['slim', 'plantuml', 'webserver', 'watch']

