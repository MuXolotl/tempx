package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًۡۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8329l extends AbstractC10553l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f17223l;

    public C8329l(C17398l c17398l) {
        this.f17223l = c17398l;
    }

    @Override // defpackage.AbstractC10553l
    public final void applovin(InterfaceC0589l interfaceC0589l) {
        String str;
        C1057l c1057l = (C1057l) interfaceC0589l;
        TextView textView = c1057l.f2926l;
        TextView textView2 = c1057l.f2929l;
        C17398l c17398l = this.f17223l;
        AudioPlaylist audioPlaylist = c17398l.f33899l;
        String strAmazon = AbstractC14770l.amazon(audioPlaylist);
        int i = audioPlaylist.ads;
        boolean z = audioPlaylist.signatures;
        String str2 = audioPlaylist.mopub;
        String string = audioPlaylist.advert;
        ImageView imageView = c1057l.f2927l;
        AbstractC3282l.loadAd(imageView, audioPlaylist, 1, 2);
        ImageView imageView2 = c1057l.f2930l;
        AbstractC3282l.loadAd(imageView2, audioPlaylist, 4, 6);
        imageView.setVisibility(strAmazon != null ? 0 : 4);
        c1057l.f2925l.setVisibility(strAmazon != null ? 0 : 4);
        if (string == null || !z || AbstractC14770l.isPro(audioPlaylist)) {
            textView.setText(str2);
        } else {
            String strAdmob = AbstractC11043l.admob(' ', str2, string);
            SpannableString spannableString = new SpannableString(strAdmob);
            VKXApplication.Companion companion = VKXApplication.f36628l;
            spannableString.setSpan(new ForegroundColorSpan(AbstractC13209l.yandex(R.attr.textColorSecondary)), str2.length(), strAdmob.length(), 33);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        if (AbstractC8576l.yandex(audioPlaylist.ad, Boolean.TRUE)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, ua.itaysonlab.vkx.R.drawable.ic_explicit_outline_28, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        textView2.setText(c17398l.f33886l);
        textView2.setVisibility((AbstractC14770l.isPro(audioPlaylist) || (str = c17398l.f33886l) == null || str.length() == 0) ? 8 : 0);
        TextView textView3 = c1057l.f2931l;
        if (!AbstractC14770l.isPro(audioPlaylist) && (z || string == null)) {
            if (!audioPlaylist.vip.isEmpty()) {
                string = c1057l.f2928l.getContext().getString(ua.itaysonlab.vkx.R.string.playlist_year_and_genre, AbstractC16901l.m4210case(audioPlaylist.vip, null, null, null, new C10949l(29), 31), Integer.valueOf(i));
            } else if (i != 0) {
                string = String.valueOf(i);
            } else {
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                DecimalFormat decimalFormat = C15638l.yandex;
                string = vKXApplication.getString(ua.itaysonlab.vkx.R.string.play_count, C15638l.loadAd(audioPlaylist.firebase));
            }
        }
        textView3.setText(string);
        long j = audioPlaylist.amazon;
        C16287l.yandex.getClass();
        if (j == C16287l.crashlytics() && audioPlaylist.tapsense == null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView2.setOnClickListener(null);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, ua.itaysonlab.vkx.R.drawable.ic_chevron_right, 0);
            textView2.setOnClickListener(new ViewOnClickListenerC9663l(audioPlaylist, 5));
        }
        C8950l c8950l = (C8950l) imageView2.getLayoutParams();
        Activity activityIsVip = c17398l.isVip();
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        Resources resources = (vKXApplication2 != null ? vKXApplication2 : null).getResources();
        TypedValue typedValue = new TypedValue();
        activityIsVip.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue, true);
        ((ViewGroup.MarginLayoutParams) c8950l).topMargin = resources.getDimensionPixelSize(typedValue.resourceId) + AbstractC5852l.yandex;
        imageView2.setLayoutParams(c8950l);
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return ua.itaysonlab.vkx.R.layout.v7_playlist_header_type2;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(ua.itaysonlab.vkx.R.layout.v7_playlist_header_type2, viewGroup, false);
        int i = ua.itaysonlab.vkx.R.id.artwork_blur;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.artwork_blur);
        if (imageView != null) {
            i = ua.itaysonlab.vkx.R.id.artwork_blur_overlay;
            View viewSmaato = AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.artwork_blur_overlay);
            if (viewSmaato != null) {
                i = ua.itaysonlab.vkx.R.id.artwork_main;
                ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.artwork_main);
                if (imageView2 != null) {
                    i = ua.itaysonlab.vkx.R.id.playlist_author_artist;
                    TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.playlist_author_artist);
                    if (textView != null) {
                        i = ua.itaysonlab.vkx.R.id.playlist_subtitle;
                        TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.playlist_subtitle);
                        if (textView2 != null) {
                            i = ua.itaysonlab.vkx.R.id.playlist_title;
                            TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, ua.itaysonlab.vkx.R.id.playlist_title);
                            if (textView3 != null) {
                                return new C1057l((ConstraintLayout) viewInflate, imageView, viewSmaato, imageView2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
