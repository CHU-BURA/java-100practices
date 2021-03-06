[問題](../README.md)

***
# 050：解答例

`java.util.ArrayList`を使用した方が有利な状況とは、
1つのスレッドからしか使われていないことが分かっている状況。

# 解説
`Vector`クラスと`ArrayList`クラスの大きな違いとして、
`Vector`クラスには**同期化の処理**が実装されている点です。
- [ ] `Vector`クラス  
マルチスレッド環境において、複数のスレッドから同時に操作されても、データの整合性を保つことができます。
その半面1つのスレッドからしか使われないことが分かっている場合でも同期化を行うため、パフォーマンスが低下します。
- [ ] `ArrayList`クラス  
一方、`ArrayList`クラスは、基本的に同期化は実装せず、必要に応じて同期化ラッパーを挿入するような形の設計になっています。

# 補足
* `Vector`クラス、`Hashtable`クラス、`Enumeration` インターフェイスは`Java1.0`から`JDK`に含まれている古いクラスです。
自分で新しくアプリケーションを作成する場合は、これらを積極的に利用する必要はありません。（古くからあるライブラリなどでこれらが使用されている場合は、
これらのクラスも使わなければならない場合があります）
* `Vector`と`Hashtable`クラスはメソッドを呼び出す場合に、内部で必ず同期化のチェックが入るので（`ArrayList`や`HashMap`に比べて）パフォーマンスの点で不利です。
また、`Hashtable`については`null`を格納できません。格納しようとすると`NullPointerException`がスローされ、
この点は`HashMap`など他の`Map`実装と異なるので注意が必要です。``