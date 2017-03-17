package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Activity2 extends AppCompatActivity {
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    ImageButton b8;
    ImageButton b9;

    int count = 1;
    int mata[][]=new int[10][10];
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mata[i][j]=0;
            }
        }
        b1 = (ImageButton) findViewById(R.id.imageButton);
        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b4 = (ImageButton) findViewById(R.id.imageButton4);
        b5 = (ImageButton) findViewById(R.id.imageButton5);
        b6 = (ImageButton) findViewById(R.id.imageButton6);
        b7 = (ImageButton) findViewById(R.id.imageButton7);
        b8 = (ImageButton) findViewById(R.id.imageButton8);
        b9 = (ImageButton) findViewById(R.id.imageButton9);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[0][0] == 0) {
                    if (count == 1) {
                        b1.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[0][0] = 1;
                    } else {
                        b1.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[0][0] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[0][1] == 1 && mata[0][2] == 1) || (mata[0][0] == 1 && mata[1][0] == 1 && mata[2][0] == 1) || (mata[0][0] == 1 && mata[1][1] == 1 && mata[2][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[0][1] == 2 && mata[0][2] == 2) || (mata[0][0] == 2 && mata[1][0] == 2 && mata[2][0] == 2) || (mata[0][0] == 2 && mata[1][1] == 2 && mata[2][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }
                    else {
                        int i = 0, j = 0;
                        A1:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A1;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }
                }
            }



        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[0][1] == 0) {
                    if (count == 1) {
                        b2.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[0][1] = 1;
                    } else {
                        b2.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[0][1] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[0][1] == 1 && mata[0][2] == 1) || (mata[0][1] == 1 && mata[1][1] == 1 && mata[2][1] == 1) ) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[0][1] == 2 && mata[0][2] == 2) || (mata[0][1] == 2 && mata[1][1] == 2 && mata[2][1] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A2:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A2;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[0][2] == 0) {
                    if (count == 1) {
                        b3.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[0][2] = 1;
                    } else {
                        b3.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[0][2] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[0][1] == 1 && mata[0][2] == 1) || (mata[0][2] == 1 && mata[1][1] == 1 && mata[2][0] == 1) || (mata[0][2] == 1 && mata[1][2] == 1 && mata[2][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[0][1] == 2 && mata[0][2] == 2) || (mata[0][2] == 2 && mata[1][1] == 2 && mata[2][0] == 2) || (mata[0][2] == 2 && mata[1][2] == 2 && mata[2][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A3:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A3;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[1][0] == 0) {
                    if (count == 1) {
                        b4.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[1][0] = 1;
                    } else {
                        b4.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[1][0] = 2;
                    }
                    if ((mata[1][0] == 1 && mata[1][1] == 1 && mata[1][2] == 1) || (mata[0][0] == 1 && mata[1][0] == 1 && mata[2][0] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[1][0] == 2 && mata[1][1] == 2 && mata[1][2] == 2) || (mata[0][0] == 2 && mata[1][0] == 2 && mata[2][0] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A4:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A4;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[1][1] == 0) {
                    if (count == 1) {
                        b5.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[1][1] = 1;
                    } else {
                        b5.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[1][1] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[1][1] == 1 && mata[2][2] == 1) || (mata[0][1] == 1 && mata[1][1] == 1 && mata[2][1] == 1) || (mata[0][2] == 1 && mata[1][1] == 1 && mata[2][0] == 1) || (mata[1][0] == 1 && mata[1][1] == 1 && mata[1][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[1][1] == 2 && mata[2][2] == 2) || (mata[0][1] == 2 && mata[1][1] == 2 && mata[2][1] == 2) || (mata[0][2] == 2 && mata[1][1] == 2 && mata[2][0] == 2)|| (mata[1][0] == 2 && mata[1][1] == 2 && mata[1][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A5:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A5;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[1][2] == 0) {
                    if (count == 1) {
                        b6.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[1][2] = 1;
                    } else {
                        b6.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[1][2] = 2;
                    }
                    if ((mata[0][2] == 1 && mata[1][2] == 1 && mata[2][2] == 1)  || (mata[1][0] == 1 && mata[1][1] == 1 && mata[1][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][2] == 2 && mata[1][2] == 2 && mata[2][2] == 2) ||  (mata[1][0] == 2 && mata[1][1] == 2 && mata[1][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A6:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A6;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[2][0] == 0) {
                    if (count == 1) {
                        b7.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[2][0] = 1;
                    } else {
                        b7.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[2][0] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[1][0] == 1 && mata[2][0] == 1)  || (mata[0][2] == 1 && mata[1][1] == 1 && mata[2][0] == 1)|| (mata[2][0] == 1 && mata[2][1] == 1 && mata[2][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[1][0] == 2 && mata[2][0] == 2) ||  (mata[0][2] == 2 && mata[1][1] == 2 && mata[2][0] == 2)|| (mata[2][0] == 2 && mata[2][1] == 2 && mata[2][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A7:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A7;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[2][1] == 0) {
                    if (count == 1) {
                        b8.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[2][1] = 1;
                    } else {
                        b8.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[2][1] = 2;
                    }
                    if ((mata[2][0] == 1 && mata[2][1] == 1 && mata[2][2] == 1) || (mata[0][1] == 1 && mata[1][1] == 1 && mata[2][1] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[2][0] == 2 && mata[2][1] == 2 && mata[2][2] == 2) || (mata[0][1] == 2 && mata[1][1] == 2 && mata[2][1] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }

                    else {
                        int i = 0, j = 0;
                        A8:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A8;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);

                        }
                    }

                }
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mata[2][2] == 0) {
                    if (count == 1) {
                        b9.setBackgroundResource(R.drawable.x);
                        count++;
                        mata[2][2] = 1;
                    } else {
                        b9.setBackgroundResource(R.drawable.o);
                        count--;
                        mata[2][2] = 2;
                    }
                    if ((mata[0][0] == 1 && mata[1][1] == 1 && mata[2][2] == 1)  || (mata[0][2] == 1 && mata[1][2] == 1 && mata[2][2] == 1)|| (mata[2][0] == 1 && mata[2][1] == 1 && mata[2][2] == 1)) {
                        Intent myIntent = new Intent(view.getContext(), Awin1.class);
                        startActivityForResult(myIntent, 0);
                    } else if ((mata[0][0] == 2 && mata[1][1] == 2 && mata[2][2] == 2) ||  (mata[0][2] == 2 && mata[1][2] == 2 && mata[2][2] == 2)|| (mata[2][0] == 2 && mata[2][1] == 2 && mata[2][2] == 2)) {
                        Intent myIntent = new Intent(view.getContext(), Awin2.class);
                        startActivityForResult(myIntent, 0);
                    }
                    else {
                        int i = 0, j = 0;
                        A9:
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (mata[i][j] == 0)
                                    break A9;
                            }
                        }
                        if (i == 3 && j == 3) {
                            Intent myIntent = new Intent(view.getContext(), Adraw.class);
                            startActivityForResult(myIntent, 0);
                            System.out.println("Draw");
                        }
                    }

                }
            }

        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Activity2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Activity2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
