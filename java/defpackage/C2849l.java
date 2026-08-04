package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؔۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2849l extends AbstractC7076l {
    public final /* synthetic */ int crashlytics;

    public /* synthetic */ C2849l(int i) {
        this.crashlytics = i;
    }

    @Override // defpackage.AbstractC7076l
    public final ImageView admob(InterfaceC0589l interfaceC0589l) {
        switch (this.crashlytics) {
            case 0:
                return ((C7161l) interfaceC0589l).f14981l;
            default:
                return ((C0577l) interfaceC0589l).f1985l;
        }
    }

    @Override // defpackage.AbstractC7076l
    public final /* bridge */ /* synthetic */ void billing(InterfaceC0589l interfaceC0589l) {
        switch (this.crashlytics) {
            case 0:
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[PHI: r1
  0x0096: PHI (r1v12 int) = (r1v11 int), (r1v16 int), (r1v17 int) binds: [B:5:0x0032, B:13:0x005e, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC7076l
    public final InterfaceC0589l crashlytics(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.crashlytics;
        int i2 = R.id.song_title;
        switch (i) {
            case 0:
                View viewInflate = layoutInflater.inflate(R.layout.list_item_track_mainonly, viewGroup, false);
                TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.chart_pos);
                if (textView != null) {
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.download_indicator);
                    if (imageView != null) {
                        ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.focus_indicator);
                        if (imageView2 != null) {
                            FrameLayout frameLayout = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.inner_content);
                            if (frameLayout != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_duration);
                                if (textView2 != null) {
                                    ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_overlay);
                                    if (imageView3 != null) {
                                        TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_title);
                                        if (textView3 != null) {
                                            return new C7161l(linearLayout, textView, imageView, imageView2, frameLayout, textView2, imageView3, textView3);
                                        }
                                    } else {
                                        i2 = R.id.song_overlay;
                                    }
                                } else {
                                    i2 = R.id.song_duration;
                                }
                            } else {
                                i2 = R.id.inner_content;
                            }
                        } else {
                            i2 = R.id.focus_indicator;
                        }
                    } else {
                        i2 = R.id.download_indicator;
                    }
                } else {
                    i2 = R.id.chart_pos;
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            default:
                View viewInflate2 = layoutInflater.inflate(R.layout.list_item_track_collection, viewGroup, false);
                int i3 = R.id.anchor;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC8576l.smaato(viewInflate2, R.id.anchor);
                if (linearLayout2 == null) {
                    i2 = i3;
                } else {
                    TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.chart_pos);
                    if (textView4 != null) {
                        ImageView imageView4 = (ImageView) AbstractC8576l.smaato(viewInflate2, R.id.download_indicator);
                        if (imageView4 != null) {
                            FrameLayout frameLayout2 = (FrameLayout) AbstractC8576l.smaato(viewInflate2, R.id.inner_content);
                            if (frameLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) viewInflate2;
                                i3 = R.id.song_author;
                                TextView textView5 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.song_author);
                                if (textView5 != null) {
                                    i3 = R.id.song_container;
                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC8576l.smaato(viewInflate2, R.id.song_container);
                                    if (linearLayout4 != null) {
                                        TextView textView6 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.song_duration);
                                        if (textView6 != null) {
                                            ImageView imageView5 = (ImageView) AbstractC8576l.smaato(viewInflate2, R.id.song_overlay);
                                            if (imageView5 != null) {
                                                TextView textView7 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.song_title);
                                                if (textView7 != null) {
                                                    return new C0577l(linearLayout3, linearLayout2, textView4, imageView4, frameLayout2, textView5, linearLayout4, textView6, imageView5, textView7);
                                                }
                                            } else {
                                                i2 = R.id.song_overlay;
                                            }
                                        } else {
                                            i2 = R.id.song_duration;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = R.id.inner_content;
                            }
                        } else {
                            i2 = R.id.download_indicator;
                        }
                    } else {
                        i2 = R.id.chart_pos;
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                return null;
        }
    }

    @Override // defpackage.AbstractC7076l
    public final void loadAd(InterfaceC0589l interfaceC0589l, AudioTrack audioTrack, int i) {
        int i2 = this.crashlytics;
        EnumC11447l enumC11447l = EnumC11447l.f23032l;
        switch (i2) {
            case 0:
                C7161l c7161l = (C7161l) interfaceC0589l;
                ImageView imageView = c7161l.f14986l;
                TextView textView = c7161l.f14983l;
                ImageView imageView2 = c7161l.f14981l;
                TextView textView2 = c7161l.f14982l;
                textView2.setText(AbstractC16676l.crashlytics(audioTrack, true));
                TextView textView3 = c7161l.f14987l;
                DecimalFormat decimalFormat = C15638l.yandex;
                textView3.setText(AbstractC14205l.amazon(audioTrack.purchase, false));
                ImageView imageView3 = c7161l.f14980l;
                imageView3.setVisibility(audioTrack.pro() ? 0 : 8);
                textView.setText(String.valueOf(i + 1));
                if (audioTrack.mopub) {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
                } else {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (audioTrack.license) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                imageView2.setImageDrawable(C15617l.firebase(true));
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                C10507l c10507lCrashlytics = c16076l.crashlytics();
                AbstractC18643l abstractC18643l = c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null;
                AudioTrack audioTrack2 = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
                if (audioTrack2 == null || audioTrack2.loadAd != audioTrack.loadAd) {
                    imageView2.setVisibility(8);
                    imageView2.setActivated(false);
                    textView.setVisibility(0);
                } else {
                    imageView2.setVisibility(0);
                    C16076l c16076l2 = VKXApplication.f36632l;
                    imageView2.setActivated((c16076l2 != null ? c16076l2 : null).purchase() == enumC11447l);
                    textView.setVisibility(4);
                }
                float f = AbstractC16676l.purchase(audioTrack) ? 0.4f : 1.0f;
                c7161l.f14985l.setAlpha(f);
                textView2.setAlpha(f);
                imageView.setAlpha(f);
                imageView3.setAlpha(f);
                textView3.setAlpha(f);
                break;
            default:
                C0577l c0577l = (C0577l) interfaceC0589l;
                TextView textView4 = c0577l.f1977l;
                ImageView imageView4 = c0577l.f1985l;
                TextView textView5 = c0577l.f1982l;
                textView5.setText(AbstractC16676l.crashlytics(audioTrack, false));
                c0577l.f1986l.setText(audioTrack.yandex);
                TextView textView6 = c0577l.f1979l;
                DecimalFormat decimalFormat2 = C15638l.yandex;
                textView6.setText(AbstractC14205l.amazon(audioTrack.purchase, false));
                c0577l.f1984l.setVisibility(audioTrack.pro() ? 0 : 8);
                textView4.setText(String.valueOf(i + 1));
                if (audioTrack.mopub) {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
                } else {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                imageView4.setImageDrawable(C15617l.firebase(true));
                C16076l c16076l3 = VKXApplication.f36632l;
                if (c16076l3 == null) {
                    c16076l3 = null;
                }
                C10507l c10507lCrashlytics2 = c16076l3.crashlytics();
                AbstractC18643l abstractC18643l2 = c10507lCrashlytics2 != null ? c10507lCrashlytics2.loadAd : null;
                AudioTrack audioTrack3 = abstractC18643l2 instanceof AudioTrack ? (AudioTrack) abstractC18643l2 : null;
                if (audioTrack3 == null || audioTrack3.loadAd != audioTrack.loadAd) {
                    imageView4.setVisibility(8);
                    imageView4.setActivated(false);
                    textView4.setVisibility(0);
                } else {
                    imageView4.setVisibility(0);
                    C16076l c16076l4 = VKXApplication.f36632l;
                    imageView4.setActivated((c16076l4 != null ? c16076l4 : null).purchase() == enumC11447l);
                    textView4.setVisibility(4);
                }
                float f2 = AbstractC16676l.purchase(audioTrack) ? 0.4f : 1.0f;
                c0577l.f1983l.setAlpha(f2);
                c0577l.f1978l.setAlpha(f2);
                c0577l.f1980l.setAlpha(f2);
                break;
        }
    }

    @Override // defpackage.AbstractC7076l
    public final int purchase() {
        switch (this.crashlytics) {
            case 0:
                return R.layout.list_item_track_mainonly;
            default:
                return R.layout.list_item_track_collection;
        }
    }

    @Override // defpackage.AbstractC7076l
    public final void yandex(InterfaceC0589l interfaceC0589l, boolean z) {
        switch (this.crashlytics) {
            case 0:
                TextView textView = ((C7161l) interfaceC0589l).f14983l;
                if (!z) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(4);
                }
                break;
            default:
                TextView textView2 = ((C0577l) interfaceC0589l).f1977l;
                if (!z) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
                break;
        }
    }
}
