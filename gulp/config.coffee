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

