#==================================================
# config
#==================================================

src  = './src'
dest = './build'

module.exports =
  slim:
    src: src + '/slim/*.slim'
    dest: dest + '/'
    slim_option:
      pretty: true
  sass:
    src: src + '/sass/*.s[ac]ss'
    dest: dest + 'css'
    compass:
      css: '.sass-cache/compass-cache/'
      sass: src + 'sass'


