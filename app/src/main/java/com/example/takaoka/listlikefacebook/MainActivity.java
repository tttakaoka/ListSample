package com.example.takaoka.listlikefacebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListAdapter adapter = new ListAdapter(this);
        RecyclerView list = (RecyclerView) findViewById(R.id.list_view);
        assert list != null;
        list.addItemDecoration(new DividerItemDecoration(this));
        list.setAdapter(adapter);

        Post post1 = new Post()
                .setTitle("Mark Zuckerberg celebrating Passover.")
                .setDescription("Tonight is Max's first Passover -- the holiday celebrating the Jews' escape from slavery, survival as refugees and rebuilding as immigrants in a new land.\n" +
                        "Every year, my family gets together to give thanks for our freedom and for those who suffered so we could be here. For me, the most important tradition is to remember that we will not be truly free until every person is free. While we give thanks, we pray that next year every person will find their home.\n" +
                        "Tonight, I'm reflecting on these words from President Obama:\n" +
                        "\"Scripture tells us that we shall not oppress a stranger, for we know the heart of a stranger -- we were strangers once, too.\"\n" +
                        "Passover reminds us that we were strangers once, too.\n" +
                        "I hope we have the humanity to bring people together, so one day every person will be free and will find their home.");

        Post post2 = new Post()
                .setTitle("Mark Zuckerberg")
                .setDescription("Happy Earth Day! Fun fact: did you know one person's Facebook use for an entire year has a smaller carbon footprint than making a latte?");

        Post post3 = new Post()
                .setTitle("Mark Zuckerberg")
                .setDescription("Most days Priscilla works outside the spotlight in the hospital or the classroom. This is the first time she's on the cover of a magazine. I'm looking forward to the world getting to know the strong, kind, compassionate person I love so much.");

        Post post4 = new Post()
                .setTitle("Mark Zuckerberg")
                .setDescription("I'm a big Game of Thrones fan. Check out this 360 video of the opening sequence -- it's now the most watched 360 video on Facebook in a 24 hour period. Tilt your phone to look around Westeros.");

        List<Post> postList = Arrays.asList(post1, post2, post3, post4);
        adapter.addAll(postList);
    }
}
