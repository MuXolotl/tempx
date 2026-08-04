package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؔۚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2899l extends AbstractC7076l {
    public final boolean amazon;
    public final int billing;
    public final boolean crashlytics;
    public final boolean purchase;

    public C2899l(boolean z, boolean z2, boolean z3) {
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = z3;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.billing = VKXApplication.Companion.yandex(180.0f);
    }

    @Override // defpackage.AbstractC7076l
    public final ImageView admob(InterfaceC0589l interfaceC0589l) {
        return ((C6836l) interfaceC0589l).f14292l;
    }

    @Override // defpackage.AbstractC7076l
    public final void billing(InterfaceC0589l interfaceC0589l) {
        AbstractC7477l.yandex(((C6836l) interfaceC0589l).f14302l).yandex();
    }

    @Override // defpackage.AbstractC7076l
    public final InterfaceC0589l crashlytics(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_track, viewGroup, false);
        int i = R.id.anchor;
        LinearLayout linearLayout = (LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.anchor);
        if (linearLayout != null) {
            i = R.id.chart_data;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.chart_data);
            if (linearLayout2 != null) {
                i = R.id.chart_image;
                ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.chart_image);
                if (imageView != null) {
                    i = R.id.chart_pos;
                    TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.chart_pos);
                    if (textView != null) {
                        i = R.id.download_indicator;
                        ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.download_indicator);
                        if (imageView2 != null) {
                            i = R.id.inner_content;
                            FrameLayout frameLayout = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.inner_content);
                            if (frameLayout != null) {
                                LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                i = R.id.song_album;
                                ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_album);
                                if (imageView3 != null) {
                                    i = R.id.song_author;
                                    TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_author);
                                    if (textView2 != null) {
                                        i = R.id.song_container;
                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.song_container);
                                        if (linearLayout4 != null) {
                                            i = R.id.song_duration;
                                            TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_duration);
                                            if (textView3 != null) {
                                                i = R.id.song_overlay;
                                                ImageView imageView4 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_overlay);
                                                if (imageView4 != null) {
                                                    i = R.id.song_title;
                                                    TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_title);
                                                    if (textView4 != null) {
                                                        return new C6836l(linearLayout3, linearLayout, linearLayout2, imageView, textView, imageView2, frameLayout, linearLayout3, imageView3, textView2, linearLayout4, textView3, imageView4, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.AbstractC7076l
    public final void loadAd(InterfaceC0589l interfaceC0589l, AudioTrack audioTrack, int i) {
        boolean z;
        C6836l c6836l = (C6836l) interfaceC0589l;
        TextView textView = c6836l.f14299l;
        LinearLayout linearLayout = c6836l.f14293l;
        LinearLayout linearLayout2 = c6836l.f14296l;
        LinearLayout linearLayout3 = c6836l.f14304l;
        ImageView imageView = c6836l.f14300l;
        TextView textView2 = c6836l.f14305l;
        textView2.setText(AbstractC16676l.crashlytics(audioTrack, false));
        c6836l.f14298l.setText(audioTrack.yandex);
        TextView textView3 = c6836l.f14301l;
        DecimalFormat decimalFormat = C15638l.yandex;
        textView3.setText(AbstractC14205l.amazon(audioTrack.purchase, false));
        AbstractC3282l.yandex(c6836l.f14302l, audioTrack, 1);
        ImageView imageView2 = c6836l.f14292l;
        imageView2.setImageDrawable(C15617l.firebase(false));
        c6836l.f14303l.setVisibility(audioTrack.pro() ? 0 : 8);
        linearLayout2.setVisibility(this.purchase ? 8 : 0);
        if (this.amazon) {
            linearLayout.setVisibility(0);
            AudioChartInfo audioChartInfo = audioTrack.isVip;
            int i2 = audioChartInfo.loadAd;
            z = true;
            EnumC12758l enumC12758l = audioChartInfo.crashlytics;
            if (i2 == -1) {
                imageView.setVisibility(8);
                textView.setText(String.valueOf(i + 1));
            } else {
                imageView.setVisibility(0);
                textView.setText(String.valueOf(audioChartInfo.yandex));
                imageView.setImageResource(enumC12758l.f25139l);
                int iYandex = enumC12758l.f25138l;
                if (iYandex == 0) {
                    iYandex = AbstractC13209l.yandex(R.attr.global_accent);
                }
                imageView.setImageTintList(ColorStateList.valueOf(iYandex));
            }
        } else {
            z = true;
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout4 = c6836l.f14295l;
        if (this.crashlytics) {
            linearLayout4.getLayoutParams().width = -2;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
            layoutParams.width = this.billing;
            layoutParams.weight = 0.0f;
        } else {
            linearLayout4.getLayoutParams().width = -1;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
        }
        if (audioTrack.mopub) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
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
        } else {
            imageView2.setVisibility(0);
            C16076l c16076l2 = VKXApplication.f36632l;
            imageView2.setActivated((c16076l2 != null ? c16076l2 : null).purchase() == EnumC11447l.f23032l ? z : false);
        }
        float f = AbstractC16676l.purchase(audioTrack) ? 0.4f : 1.0f;
        c6836l.f14294l.setAlpha(f);
        linearLayout.setAlpha(f);
        linearLayout3.setAlpha(f);
        linearLayout2.setAlpha(f);
    }

    @Override // defpackage.AbstractC7076l
    public final int purchase() {
        return R.layout.list_item_track;
    }
}
