package com.example.bambooverse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    Animation scaleUp, scaleDown;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton menu = view.findViewById(R.id.imageButton);
        ImageButton message = view.findViewById(R.id.imageButton2);
        ImageButton BambooBenefits = view.findViewById(R.id.imageButton9);
        ImageButton BambooTypes = view.findViewById(R.id.imageButton8);
        ImageButton BambooProducts = view.findViewById(R.id.imageButton10);
        Button BWPProfile = view.findViewById(R.id.button4);
        Button AboutUs = view.findViewById(R.id.button2);
        Button BWPVirtualOffice = view.findViewById(R.id.button3);
        Button BambooLibrary = view.findViewById(R.id.buttonBL);
        scaleUp = AnimationUtils.loadAnimation(requireContext(), R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(requireContext(), R.anim.scale_down);

            BambooLibrary.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BambooLibrary.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BambooLibrary.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openBambooLibrary();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });


        BWPVirtualOffice.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BWPVirtualOffice.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BWPVirtualOffice.startAnimation(scaleDown);
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
        BWPProfile.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BWPProfile.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BWPProfile.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bamboowarriors.ph/profile/"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
        AboutUs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    AboutUs.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    AboutUs.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openAboutUs();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
        BambooProducts.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BambooProducts.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BambooProducts.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openBambooProducts();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
        menu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    menu.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    menu.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openMenu();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
        message.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    message.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    message.startAnimation(scaleDown);
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
        BambooBenefits.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BambooBenefits.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BambooBenefits.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openBambooBenefits();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
        BambooTypes.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    BambooTypes.startAnimation(scaleUp);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    BambooTypes.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        openBambooTypes();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        return view;
    }

    private void openMenu() {
        Intent intent = new Intent(requireContext(), menu.class);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.anotherslide, R.anim.slide);
    }

    public void openBambooBenefits() {
        Intent intent = new Intent(requireContext(), BambooBenefits.class);
        startActivity(intent);
    }

    public void openBambooLibrary() {
        Intent intent = new Intent(requireContext(), BambooLibrary.class);
        startActivity(intent);
    }

    public void openAboutUs() {
        Intent intent = new Intent(requireContext(), AboutUs.class);
        startActivity(intent);
    }
    public void openBambooTypes() {
        Intent intent = new Intent(requireContext(), BambooTypes.class);
        startActivity(intent);
    }

    public void openBambooProducts() {
        Intent intent = new Intent(requireContext(), BambooProducts.class);
        startActivity(intent);
    }
}