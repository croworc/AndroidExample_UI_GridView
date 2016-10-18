package com.croworc.android.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * An ImageAdapter to be used by our GridView.
 * Holds on to the sample images within our drawables folder, via an
 * Integer array (mThumbIds)
 * Created by ingo on 10/16/16.
 */

class ImageAdapter extends BaseAdapter {

    private Context mContext;  // hold on to the passed-in context


    ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    /** Create a new ImageView for each item referenced by the Adapter
     *
     * @param position      The ImageView's position within the GridView (zero-based)
     * @param convertView   The ImageView, new or recycled one, *before* our processing
     * @param parent        The GridView
     * @return              The readily set up ImageView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If it's *not* recycled, create a new ImageView and initialize some attributes.
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(125, 125));
            // imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            // ImageView *is* recycled, so just re-use it.
            imageView = (ImageView) convertView;
        }
        // No matter whether *new* image or *recycled* one:
        // now we need to set its image resource.
        imageView.setImageResource(mThumbIds[position]);

        // Implement accessibility feature "content description":
        // Dynamically create the content description for this image.
        // Will be used for the TalkBack service. When selecting (not clicking) this image,
        // the content description will be read-out loud, like "Image 16".
        String contentDescription = mContext.getString(R.string.image_content_description) + position;
        imageView.setContentDescription(contentDescription);

        return imageView;
    } // end method getView()

    // Static data for use with our ImageAdapter: references to our images.
    private Integer[] mThumbIds = {
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1
    };

} // end class ImageAdapter
