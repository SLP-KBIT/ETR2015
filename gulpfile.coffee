#==================================================
# 設定読み込み
#==================================================

config = require './gulp/config.coffee'

#==================================================
# ライブラリ読み込み
#==================================================

gulp = require 'gulp'
webserver = require 'gulp-webserver'
slim = require 'gulp-slim'
plumber = require 'gulp-plumber'

#==================================================
# task
#==================================================
gulp.task 'slim', ->
  gulp.src config.slim.src
    .pipe slim pretty: true
    .pipe gulp.dest 'build/'
    .pipe plumber()

gulp.task 'webserver', ->
  gulp.src 'build/'
    .pipe webserver
      livereload: true,
      host: '0.0.0.0'
      port: '8000'

# 監視して自動コンパイル
gulp.task 'watch', ->
  gulp.watch config.slim.src, [ "slim" ]
  gulp.src 'gulpfile.coffee'

# デフォルト
gulp.task 'default', ['slim', 'webserver', 'watch']

