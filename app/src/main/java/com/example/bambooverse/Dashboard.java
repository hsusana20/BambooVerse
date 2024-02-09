package com.example.bambooverse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    Animation scaleUp, scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView cp = findViewById(R.id.ImageViewCp);
        ImageView event = findViewById(R.id.Event);
        ImageView chat = findViewById(R.id.Chats);
        ImageView map = findViewById(R.id.Map);
        ImageView editProfile = findViewById(R.id.EditProfile);
        ImageView home = findViewById(R.id.Home);
        ImageView remove = findViewById(R.id.Remove);
        TextView name = findViewById(R.id.textNameofUser);
        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        String userName = getUserDisplayName();

        name.setText(userName);

        cp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    cp.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    cp.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Dashboard.this, CouponsFragment.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        event.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    event.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    event.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bamboowarriors.ph/virtualoffice/"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        chat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    chat.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    chat.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        try {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb-messenger://user/110896928148422"));
                            startActivity(intent);
                        } catch (Exception e) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/bamboowarriorsph"));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        map.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    map.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    map.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openMapofSellers();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        editProfile.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    editProfile.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    editProfile.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bamboowarriors.ph/virtualoffice/"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        home.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    home.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    home.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Dashboard.this, UpdatedLandingPage.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        remove.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    remove.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    remove.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Dashboard.this, SOLFragment.class);
                        startActivity(intent);
                        boolean accountRemoved = removeAccount();

                        if (accountRemoved) {
                            Toast.makeText(Dashboard.this, "Account removed successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Dashboard.this, "Failed to remove account", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
    }


    private void openMapofSellers() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/bamboo+dealers/@14.5609545,121.0048418,9.63z?entry=ttu"));
        startActivity(intent);
    }

    private boolean removeAccount() {
        // Your code to remove the account goes here
        // Return true if account is successfully removed, false otherwise
        // Placeholder, replace with actual implementation
            return true;
    }

    private String getUserDisplayName() {
        return "  ";
    }
}



