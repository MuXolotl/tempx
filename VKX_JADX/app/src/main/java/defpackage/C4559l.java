package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogLongread;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.objects.video.VKVideo;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖۨۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4559l extends AbstractC14630l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f9228l;

    public /* synthetic */ C4559l(int i) {
        this.f9228l = i;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        switch (this.f9228l) {
            case 0:
                return R.layout.c3_catalog_banner;
            case 1:
                return R.layout.c3_button_category;
            case 2:
                return R.layout.c3_banner_curator_group;
            case 3:
                return R.layout.c3_double_category;
            case 4:
                return R.layout.podcast_longread;
            case 5:
                return R.layout.c3_owner_cell;
            case 6:
                return R.layout.c3_catalog_banner_small;
            case 7:
                return R.layout.c3_link_vertical;
            case 8:
                return R.layout.c3_text;
            case 9:
                return R.layout.c3_video_vertical;
            default:
                return R.layout.c3_video;
        }
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        final int i2 = 1;
        final int i3 = 0;
        switch (this.f9228l) {
            case 0:
                Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
                C15665l c15665l = (C15665l) interfaceC0589l;
                List list = catalog2Banner.crashlytics;
                TextView textView = c15665l.f30626l;
                MaterialButton materialButton = c15665l.f30623l;
                c15665l.f30625l.setText(catalog2Banner.billing);
                String str = catalog2Banner.purchase;
                if (str == null || str.length() == 0) {
                    AbstractC5833l.purchase(textView);
                } else {
                    textView.setText(str);
                    AbstractC5833l.subs(textView);
                }
                ImageView imageView = c15665l.f30622l;
                String strCrashlytics = AbstractC8320l.crashlytics(catalog2Banner.amazon);
                C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
                C9477l c9477l = new C9477l(imageView.getContext());
                c9477l.crashlytics = strCrashlytics;
                AbstractC10413l.amazon(c9477l, imageView);
                c13177lYandex.yandex(c9477l.yandex());
                c15665l.f30624l.setOnClickListener(new ViewOnClickListenerC5930l(catalog2Banner, 0));
                if (list == null || list.isEmpty()) {
                    AbstractC5833l.purchase(materialButton);
                } else {
                    AbstractC5833l.subs(materialButton);
                    Catalog2Button catalog2Button = (Catalog2Button) list.get(0);
                    materialButton.setText(catalog2Button.isPro);
                    materialButton.setOnClickListener(new ViewOnClickListenerC0344l(catalog2Button, 0));
                }
                break;
            case 1:
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
                C12958l c12958l = (C12958l) interfaceC0589l;
                LinearLayout linearLayout = c12958l.f25408l;
                ImageView imageView2 = c12958l.f25407l;
                List list2 = customCatalogBlockItem.crashlytics;
                AbstractC17891l.crashlytics(imageView2, list2 != null ? AbstractC8320l.crashlytics(list2) : null, Integer.valueOf(R.drawable.placeholder_link), new C10923l(new C6985l(8.0f), 6));
                c12958l.f25406l.setText(customCatalogBlockItem.yandex);
                AbstractC0977l.yandex(linearLayout);
                linearLayout.setOnClickListener(new ViewOnClickListenerC0486l(this, customCatalogBlockItem, 0));
                break;
            case 2:
                ((C3727l) interfaceC0589l).f7789l.setOnClickListener(new ViewOnClickListenerC9657l(2, (VKProfile) obj));
                break;
            case 3:
                CustomCatalogBlockItem customCatalogBlockItem2 = (CustomCatalogBlockItem) obj;
                C18424l c18424l = (C18424l) interfaceC0589l;
                String str2 = customCatalogBlockItem2.loadAd;
                TextView textView2 = c18424l.f35977l;
                ImageView imageView3 = c18424l.f35980l;
                List list3 = customCatalogBlockItem2.crashlytics;
                AbstractC17891l.crashlytics(imageView3, list3 != null ? AbstractC8320l.crashlytics(list3) : null, Integer.valueOf(R.drawable.placeholder_link), new C10923l(null, 15));
                c18424l.f35978l.setText(customCatalogBlockItem2.yandex);
                textView2.setText(str2);
                textView2.setVisibility(str2.length() > 0 ? 0 : 8);
                c18424l.f35979l.setOnClickListener(new ViewOnClickListenerC0486l(customCatalogBlockItem2, 1));
                break;
            case 4:
                final PodcastCatalogLongread podcastCatalogLongread = (PodcastCatalogLongread) obj;
                C12594l c12594l = (C12594l) interfaceC0589l;
                c12594l.f24803l.setOnClickListener(new View.OnClickListener() { // from class: lٖٓؒ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        PodcastCatalogLongread podcastCatalogLongread2 = podcastCatalogLongread;
                        switch (i4) {
                            case 0:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread2.admob)));
                                break;
                            default:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread2.admob)));
                                break;
                        }
                    }
                });
                c12594l.f24802l.setOnClickListener(new View.OnClickListener() { // from class: lٖٓؒ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        PodcastCatalogLongread podcastCatalogLongread2 = podcastCatalogLongread;
                        switch (i4) {
                            case 0:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread2.admob)));
                                break;
                            default:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread2.admob)));
                                break;
                        }
                    }
                });
                c12594l.f24805l.setText(podcastCatalogLongread.mopub);
                c12594l.f24801l.setText(podcastCatalogLongread.crashlytics);
                ImageView imageView4 = c12594l.f24804l;
                String strYandex = podcastCatalogLongread.amazon.yandex("a");
                C13177l c13177lYandex2 = AbstractC2952l.yandex(imageView4.getContext());
                C9477l c9477l2 = new C9477l(imageView4.getContext());
                c9477l2.crashlytics = strYandex;
                AbstractC10413l.amazon(c9477l2, imageView4);
                c13177lYandex2.yandex(c9477l2.yandex());
                break;
            case 5:
                CustomCatalogBlockItem customCatalogBlockItem3 = (CustomCatalogBlockItem) obj;
                C12144l c12144l = (C12144l) interfaceC0589l;
                String str3 = customCatalogBlockItem3.loadAd;
                LinearLayout linearLayout2 = c12144l.f24152l;
                TextView textView3 = c12144l.f24150l;
                ImageView imageView5 = c12144l.f24151l;
                List list4 = customCatalogBlockItem3.crashlytics;
                AbstractC17891l.crashlytics(imageView5, list4 != null ? AbstractC8320l.crashlytics(list4) : null, Integer.valueOf(R.drawable.placeholder_link), new C10923l(new C16849l(), 6));
                c12144l.f24153l.setText(customCatalogBlockItem3.yandex);
                textView3.setText(str3);
                textView3.setVisibility(str3.length() > 0 ? 0 : 8);
                AbstractC0977l.yandex(linearLayout2);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC0486l(customCatalogBlockItem3, 2));
                break;
            case 6:
                Catalog2Banner catalog2Banner2 = (Catalog2Banner) obj;
                C14327l c14327l = (C14327l) interfaceC0589l;
                TextView textView4 = c14327l.f28060l;
                c14327l.f28063l.setText(catalog2Banner2.billing);
                String str4 = catalog2Banner2.purchase;
                if (str4 == null || str4.length() == 0) {
                    AbstractC5833l.purchase(textView4);
                } else {
                    textView4.setText(str4);
                    AbstractC5833l.subs(textView4);
                }
                ImageView imageView6 = c14327l.f28061l;
                String strCrashlytics2 = AbstractC8320l.crashlytics(catalog2Banner2.amazon);
                C13177l c13177lYandex3 = AbstractC2952l.yandex(imageView6.getContext());
                C9477l c9477l3 = new C9477l(imageView6.getContext());
                c9477l3.crashlytics = strCrashlytics2;
                AbstractC10413l.amazon(c9477l3, imageView6);
                c13177lYandex3.yandex(c9477l3.yandex());
                c14327l.f28062l.setOnClickListener(new ViewOnClickListenerC5930l(catalog2Banner2, 2));
                break;
            case 7:
                CustomCatalogBlockItem customCatalogBlockItem4 = (CustomCatalogBlockItem) obj;
                C15544l c15544l = (C15544l) interfaceC0589l;
                String str5 = customCatalogBlockItem4.loadAd;
                LinearLayout linearLayout3 = c15544l.f30384l;
                TextView textView5 = c15544l.f30382l;
                ImageView imageView7 = c15544l.f30383l;
                List list5 = customCatalogBlockItem4.crashlytics;
                AbstractC17891l.crashlytics(imageView7, list5 != null ? AbstractC8320l.crashlytics(list5) : null, Integer.valueOf(R.drawable.placeholder_link), new C10923l(new C16849l(), 6));
                c15544l.f30385l.setText(customCatalogBlockItem4.yandex);
                textView5.setText(str5);
                textView5.setVisibility(str5.length() > 0 ? 0 : 8);
                AbstractC0977l.yandex(linearLayout3);
                linearLayout3.setOnClickListener(new ViewOnClickListenerC0486l(this, customCatalogBlockItem4, 5));
                break;
            case 8:
                Catalog2Text catalog2Text = (Catalog2Text) obj;
                TextView textView6 = ((C2784l) interfaceC0589l).f6083l;
                if (AbstractC8576l.yandex(catalog2Text.yandex, "_synth_lyrics")) {
                    textView6.setPadding(0, textView6.getPaddingTop(), 0, textView6.getPaddingBottom());
                }
                textView6.setMovementMethod(new C0193l());
                C11155l c11155l = AbstractC0990l.yandex;
                textView6.setText(AbstractC0990l.yandex(catalog2Text.loadAd));
                AbstractC5309l.yandex(textView6);
                break;
            case 9:
                final VKVideo vKVideo = (VKVideo) obj;
                C3069l c3069l = (C3069l) interfaceC0589l;
                c3069l.f6600l.setText(vKVideo.crashlytics);
                TextView textView7 = c3069l.f6597l;
                List list6 = vKVideo.subs;
                textView7.setText(list6 != null ? AbstractC16901l.m4210case(list6, null, null, null, new C10949l(10), 31) : "Unknown Artist");
                c3069l.f6601l.setText(AbstractC14205l.amazon(vKVideo.firebase, false));
                ImageView imageView8 = c3069l.f6598l;
                List list7 = vKVideo.billing;
                AbstractC17891l.crashlytics(imageView8, list7 != null ? AbstractC8320l.crashlytics(list7) : null, Integer.valueOf(R.drawable.ic_video_outline_28), new C10923l(new C6985l(8.0f), 14));
                c3069l.f6599l.setOnClickListener(new View.OnClickListener() { // from class: lؙؓۤ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        VKVideo vKVideo2 = vKVideo;
                        switch (i4) {
                            case 0:
                                Context context = view.getContext();
                                String str6 = vKVideo2.smaato;
                                if (str6 != null) {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)));
                                    break;
                                }
                                break;
                            default:
                                Context context2 = view.getContext();
                                String str7 = vKVideo2.smaato;
                                if (str7 != null) {
                                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final VKVideo vKVideo2 = (VKVideo) obj;
                C12171l c12171l = (C12171l) interfaceC0589l;
                c12171l.f24186l.setText(vKVideo2.crashlytics);
                TextView textView8 = c12171l.f24183l;
                List list8 = vKVideo2.subs;
                textView8.setText(list8 != null ? AbstractC16901l.m4210case(list8, null, null, null, new C10949l(11), 31) : "Unknown Artist");
                ImageView imageView9 = c12171l.f24184l;
                List list9 = vKVideo2.billing;
                AbstractC17891l.crashlytics(imageView9, list9 != null ? AbstractC8320l.crashlytics(list9) : null, Integer.valueOf(R.drawable.ic_video_outline_28), new C10923l(new C6985l(8.0f), 14));
                c12171l.f24185l.setOnClickListener(new View.OnClickListener() { // from class: lؙؓۤ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        VKVideo vKVideo3 = vKVideo2;
                        switch (i4) {
                            case 0:
                                Context context = view.getContext();
                                String str6 = vKVideo3.smaato;
                                if (str6 != null) {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)));
                                    break;
                                }
                                break;
                            default:
                                Context context2 = view.getContext();
                                String str7 = vKVideo3.smaato;
                                if (str7 != null) {
                                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01d2 A[PHI: r2
  0x01d2: PHI (r2v7 int) = (r2v6 int), (r2v8 int), (r2v9 int) binds: [B:71:0x01ac, B:73:0x01b7, B:75:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.f9228l;
        int i2 = R.id.title;
        int i3 = R.id.video_title;
        int i4 = R.id.playlist_image;
        switch (i) {
            case 0:
                View viewInflate = layoutInflater.inflate(R.layout.c3_catalog_banner, viewGroup, false);
                MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.action);
                if (materialButton != null) {
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.banner_bg);
                    if (imageView == null) {
                        i2 = R.id.banner_bg;
                    } else if (AbstractC8576l.smaato(viewInflate, R.id.banner_bg_overlay) != null) {
                        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.text);
                        if (textView != null) {
                            TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                            if (textView2 != null) {
                                return new C15665l(imageView, textView, textView2, materialButton, (MaterialCardView) viewInflate);
                            }
                        } else {
                            i2 = R.id.text;
                        }
                    } else {
                        i2 = R.id.banner_bg_overlay;
                    }
                } else {
                    i2 = R.id.action;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            case 1:
                View viewInflate2 = layoutInflater.inflate(R.layout.c3_button_category, viewGroup, false);
                int i5 = R.id.card;
                if (((FrameLayout) AbstractC8576l.smaato(viewInflate2, R.id.card)) != null) {
                    i5 = R.id.shuffle_btn;
                    ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate2, R.id.shuffle_btn);
                    if (imageView2 != null) {
                        i5 = R.id.shuffle_txt;
                        TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.shuffle_txt);
                        if (textView3 != null) {
                            return new C12958l((LinearLayout) viewInflate2, imageView2, textView3);
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i5)));
                return null;
            case 2:
                View viewInflate3 = layoutInflater.inflate(R.layout.c3_banner_curator_group, viewGroup, false);
                if (viewInflate3 != null) {
                    return new C3727l((TextView) viewInflate3);
                }
                C6541l.subs("rootView");
                return null;
            case 3:
                View viewInflate4 = layoutInflater.inflate(R.layout.c3_double_category, viewGroup, false);
                MaterialCardView materialCardView = (MaterialCardView) viewInflate4;
                int i6 = R.id.common;
                TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate4, R.id.common);
                if (textView4 != null) {
                    i6 = R.id.common_sub;
                    TextView textView5 = (TextView) AbstractC8576l.smaato(viewInflate4, R.id.common_sub);
                    if (textView5 != null) {
                        i6 = R.id.header;
                        if (((RelativeLayout) AbstractC8576l.smaato(viewInflate4, R.id.header)) != null) {
                            ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate4, R.id.playlist_image);
                            if (imageView3 != null) {
                                return new C18424l(imageView3, textView4, textView5, materialCardView);
                            }
                        } else {
                            i4 = i6;
                        }
                    } else {
                        i4 = i6;
                    }
                } else {
                    i4 = i6;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i4)));
                return null;
            case 4:
                View viewInflate5 = layoutInflater.inflate(R.layout.podcast_longread, viewGroup, false);
                MaterialCardView materialCardView2 = (MaterialCardView) viewInflate5;
                int i7 = R.id.listen;
                MaterialButton materialButton2 = (MaterialButton) AbstractC8576l.smaato(viewInflate5, R.id.listen);
                if (materialButton2 != null) {
                    i7 = R.id.slider_text;
                    TextView textView6 = (TextView) AbstractC8576l.smaato(viewInflate5, R.id.slider_text);
                    if (textView6 != null) {
                        i7 = R.id.slider_title;
                        TextView textView7 = (TextView) AbstractC8576l.smaato(viewInflate5, R.id.slider_title);
                        if (textView7 != null) {
                            i7 = R.id.song_album;
                            ImageView imageView4 = (ImageView) AbstractC8576l.smaato(viewInflate5, R.id.song_album);
                            if (imageView4 != null) {
                                return new C12594l(imageView4, textView6, textView7, materialButton2, materialCardView2);
                            }
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i7)));
                return null;
            case 5:
                View viewInflate6 = layoutInflater.inflate(R.layout.c3_owner_cell, viewGroup, false);
                int i8 = R.id.catalog_item_photo;
                ImageView imageView5 = (ImageView) AbstractC8576l.smaato(viewInflate6, R.id.catalog_item_photo);
                if (imageView5 != null) {
                    i8 = R.id.catalog_item_subtitle;
                    TextView textView8 = (TextView) AbstractC8576l.smaato(viewInflate6, R.id.catalog_item_subtitle);
                    if (textView8 != null) {
                        i8 = R.id.catalog_item_title;
                        TextView textView9 = (TextView) AbstractC8576l.smaato(viewInflate6, R.id.catalog_item_title);
                        if (textView9 != null) {
                            return new C12144l(imageView5, (LinearLayout) viewInflate6, textView8, textView9);
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate6.getResources().getResourceName(i8)));
                return null;
            case 6:
                View viewInflate7 = layoutInflater.inflate(R.layout.c3_catalog_banner_small, viewGroup, false);
                ImageView imageView6 = (ImageView) AbstractC8576l.smaato(viewInflate7, R.id.banner_bg);
                if (imageView6 == null) {
                    i2 = R.id.banner_bg;
                } else if (AbstractC8576l.smaato(viewInflate7, R.id.banner_bg_overlay) != null) {
                    TextView textView10 = (TextView) AbstractC8576l.smaato(viewInflate7, R.id.text);
                    if (textView10 != null) {
                        TextView textView11 = (TextView) AbstractC8576l.smaato(viewInflate7, R.id.title);
                        if (textView11 != null) {
                            return new C14327l(imageView6, textView10, textView11, (MaterialCardView) viewInflate7);
                        }
                    } else {
                        i2 = R.id.text;
                    }
                } else {
                    i2 = R.id.banner_bg_overlay;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate7.getResources().getResourceName(i2)));
                return null;
            case 7:
                return C15544l.yandex(layoutInflater, viewGroup);
            case 8:
                View viewInflate8 = layoutInflater.inflate(R.layout.c3_text, viewGroup, false);
                if (viewInflate8 != null) {
                    TextView textView12 = (TextView) viewInflate8;
                    return new C2784l(textView12, textView12);
                }
                C6541l.subs("rootView");
                return null;
            case 9:
                View viewInflate9 = layoutInflater.inflate(R.layout.c3_video_vertical, viewGroup, false);
                ImageView imageView7 = (ImageView) AbstractC8576l.smaato(viewInflate9, R.id.playlist_image);
                if (imageView7 != null) {
                    TextView textView13 = (TextView) AbstractC8576l.smaato(viewInflate9, R.id.video_artists);
                    if (textView13 != null) {
                        TextView textView14 = (TextView) AbstractC8576l.smaato(viewInflate9, R.id.video_duration);
                        if (textView14 != null) {
                            TextView textView15 = (TextView) AbstractC8576l.smaato(viewInflate9, R.id.video_title);
                            if (textView15 != null) {
                                return new C3069l(imageView7, (LinearLayout) viewInflate9, textView13, textView14, textView15);
                            }
                        } else {
                            i3 = R.id.video_duration;
                        }
                    } else {
                        i3 = R.id.video_artists;
                    }
                } else {
                    i3 = R.id.playlist_image;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate9.getResources().getResourceName(i3)));
                return null;
            default:
                View viewInflate10 = layoutInflater.inflate(R.layout.c3_video, viewGroup, false);
                ImageView imageView8 = (ImageView) AbstractC8576l.smaato(viewInflate10, R.id.playlist_image);
                if (imageView8 != null) {
                    TextView textView16 = (TextView) AbstractC8576l.smaato(viewInflate10, R.id.video_artists);
                    if (textView16 != null) {
                        TextView textView17 = (TextView) AbstractC8576l.smaato(viewInflate10, R.id.video_title);
                        if (textView17 != null) {
                            return new C12171l(imageView8, (LinearLayout) viewInflate10, textView16, textView17);
                        }
                    } else {
                        i3 = R.id.video_artists;
                    }
                } else {
                    i3 = R.id.playlist_image;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate10.getResources().getResourceName(i3)));
                return null;
        }
    }
}
