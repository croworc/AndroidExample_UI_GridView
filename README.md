# AndroidExample_UI_GridView

`AndroidExample_UI_GridView` is a companion Android app for the **Udacity** course [Build < anything > in Android](https://www.udacity.com/course/how-to-create-anything-in-android--ud802).

Its a fairly basic Android example app, implemented as an AndroidStudio project,
showcasing Android's `GridView` ViewGroup.
The backing data, a collection of images, is provided to the adapter via an
array of Integer objects holding the constants as found in `R.drawable`.

While this approach is okay for a small amount of items which are statically defined (like in this example), really any heavy-lifting while filling a ListView/GridView should be done off of the main (UI) thread.
Maybe by applying a utility library like [Glide](https://github.com/bumptech/glide) or [Picasso](http://square.github.io/picasso/).

In this sample app, the `AdapterView.OnItemClickListener` is implemented as an anonymous inner class. So we need to implement the interface's only method `onItemClick()` within this inner class.

I am just learning Android app development (and also `git` and `GitHub`) and
these sample repos are just a means of practicing - so please don't expect mind blowing
highlights here.  :smile:

This app just implements and demonstrates the bare-to-the-bones feature(s) as advertised,
not much else.

## Installation

AndroidStudio project. No external dependencies.
Clone or download as ZIP and import into AndroidStudio.

Has `minSdkVersion 15`, so runs on devices/emulators with Android version >= Ice Cream Sandwich 4.0.3

Targets Android SDK version 24, so depending on your installation,
you may be prompted to download that SDK version during build.

## Usage

Just tap/click on any grid cell and a toast will be displayed, showing the image's index position within the grid (zero-based).

## Contributing

See: repo description - just a learning/demo app, nothing breathtakingly elaborate!
But, if you really want to:
  1. Fork it!
  2. Create your feature branch: `git checkout -b my-new-feature`
  3. Commit your changes: `git commit -am 'Add some feature'`
  4. Push to the branch: `git push origin my-new-feature`
  5. Submit a pull request :D

## History

Version: 1

## Credits

  - This sample is based on a **tutorial**, found in the CommonsWare book  [The Busy Coder's Guide to Android Development](https://commonsware.com/Android/).
  - **Google's** official **guide** for how to use the `GridView` ViewGroup can be found [here](https://developer.android.com/guide/topics/ui/layout/gridview.html).
  - See also: **Codepath Cliffnotes** for a short guide on [some of the most popular Android framework UI widgets](http://guides.codepath.com/android/Working-with-Input-Views).
  - And here's a link to a curated list of some of the [most popular open source widgets](https://github.com/wasabeef/awesome-android-ui).
  - And last but not least: The **template** for this **README.md** file comes from [zenorocha](https://gist.github.com/zenorocha/4526327).

## License

`MIT license`.
See: [LICENSE.md](./LICENSE.md)
