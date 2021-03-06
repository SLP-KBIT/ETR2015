# ETR2015_model

レヴュアー募集中！ 気になる方は気軽にクリック↓

=======
 
[![Join the chat at https://gitter.im/SLP-ETR-public/ETR2015_model](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/SLP-ETR-public/ETR2015_model?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## 目的

ETR2015、モデルの管理を行うためのリポジトリ。
plantUMLの利用を前提とする。

## コミットルール

(ユーザ名:[図の名前]:[バージョン]) コミットメッセージ)

ex. (kattsun:usecase:01) アクターとしてスターターを追記

## ディレクトリ構成

```
.
├── README.md
├── build
│   ├── diagram
│   └── index.html
├── diagram
│   ├── activity
│   ├── class
│   ├── object
│   ├── sequence
│   └── usecase
├── gulp
│   └── config.coffee
├── gulpfile.coffee
├── node_modules
│   └── gulp-puligins
├── package.json
├── plantuml
└── src
    └── slim
```

各図にバージョンを設けたのは、大幅に変更を行った場合のため。
大幅な変更を行う場合は新たなバージョン(ディレクトリ)を作成する。

## how to use gulp

1. install the node.js and npm

2. clone this repository and submodule

  ```sh
  $ git clone https://github.com/SLP-ETR-public/ETR2015_model.git
  $ git submodule update --init
  ```

3. execute this command

  ```sh
  $ npm i -g gulp gulp-cli # In some cases use $ sudo npm i -g gulp-cli
  $ npm i
  ```

4. execute gulp

  ```sh
  $ gulp
  ```

詳しくは [http://qiita.com/maxmellon/items/08c8162f3769ce71dbd3](http://qiita.com/maxmellon/items/08c8162f3769ce71dbd3)
