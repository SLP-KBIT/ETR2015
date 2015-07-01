#==================================================
# 設定読み込み
#==================================================

config = require './gulp/config.coffee'

#==================================================
# ライブラリ読み込み
#==================================================

gulp        = require 'gulp'
slim        = require 'gulp-slim'
sass        = require 'gulp-sass'
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

gulp.task 'sass', ->
  gulp.src config.sass.src
    .pipe sass()
    .pipe gulp.dest "./build/css"
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
      jarPath: "plantuml/plantuml.jar"
    )
    .pipe gulp.dest "./build/diagram"
    .pipe browserSync.stream()


# 監視して自動コンパイル
gulp.task 'watch', ->
  gulp.watch config.slim.src, [ "slim" ]
  gulp.watch config.sass.src, [ "sass" ]
  gulp.watch "./diagram/**/*.pu", [ "plantuml" ]
  gulp.src 'gulpfile.coffee'

# デフォルト
gulp.task 'default', ['slim', 'sass', 'plantuml', 'webserver', 'watch']

