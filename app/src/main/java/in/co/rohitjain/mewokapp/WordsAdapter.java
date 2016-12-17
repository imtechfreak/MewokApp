package in.co.rohitjain.mewokapp;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Word> {
   private int mColorResourceId;

    public WordsAdapter(Activity context, ArrayList<Word> word,int colorResourceId) {
      super(context,0,word);
      mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokWord());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultWord());
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.default_image_view);
        if (currentWord.hasImage()){
            defaultImageView.setImageResource(currentWord.getmResourceID());
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else {
            defaultImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
