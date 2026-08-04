package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؙؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6278l extends AbstractC7076l {
    public static void firebase(C4004l c4004l, final AudioTrack audioTrack, final int i, final C18480l c18480l, final Function0 function0) {
        ImageView imageView = c4004l.f8213l;
        TextView textView = c4004l.f8221l;
        ImageView imageView2 = c4004l.f8218l;
        boolean z = c18480l != null && ((ArrayList) c18480l.f36087l).contains(audioTrack);
        textView.setText(AbstractC16676l.crashlytics(audioTrack, false));
        c4004l.f8214l.setText(audioTrack.yandex);
        TextView textView2 = c4004l.f8222l;
        DecimalFormat decimalFormat = C15638l.yandex;
        textView2.setText(AbstractC14205l.amazon(audioTrack.purchase, false));
        AbstractC3282l.yandex(c4004l.f8223l, audioTrack, 1);
        imageView2.setImageDrawable(C15617l.firebase(false));
        c4004l.f8220l.setVisibility(audioTrack.pro() ? 0 : 8);
        if (audioTrack.mopub) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: lْ٘ٔ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C4456l.f9065l;
                AbstractC4115l.amazon(audioTrack, new C18695l(c18480l, i, function0, 4)).Signature((Activity) view.getContext());
            }
        });
        c4004l.f8224l.setVisibility(z ? 0 : 8);
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        C10507l c10507lCrashlytics = c16076l.crashlytics();
        AbstractC18643l abstractC18643l = c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null;
        AudioTrack audioTrack2 = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
        if (audioTrack2 == null || audioTrack2.loadAd != audioTrack.loadAd || z) {
            imageView2.setVisibility(8);
            imageView2.setActivated(false);
        } else {
            imageView2.setVisibility(0);
            C16076l c16076l2 = VKXApplication.f36632l;
            imageView2.setActivated((c16076l2 != null ? c16076l2 : null).purchase() == EnumC11447l.f23032l);
        }
        float f = AbstractC16676l.purchase(audioTrack) ? 0.4f : 1.0f;
        c4004l.f8219l.setAlpha(f);
        c4004l.f8215l.setAlpha(f);
        c4004l.f8216l.setAlpha(f);
        imageView.setAlpha(f);
    }

    @Override // defpackage.AbstractC7076l
    public final ImageView admob(InterfaceC0589l interfaceC0589l) {
        return ((C4004l) interfaceC0589l).f8218l;
    }

    @Override // defpackage.AbstractC7076l
    public final void billing(InterfaceC0589l interfaceC0589l) {
        AbstractC7477l.yandex(((C4004l) interfaceC0589l).f8223l).yandex();
    }

    @Override // defpackage.AbstractC7076l
    public final InterfaceC0589l crashlytics(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_track_swipe, viewGroup, false);
        int i = R.id.anchor;
        LinearLayout linearLayout = (LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.anchor);
        if (linearLayout != null) {
            i = R.id.call_menu;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.call_menu);
            if (imageView != null) {
                i = R.id.download_indicator;
                ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.download_indicator);
                if (imageView2 != null) {
                    i = R.id.inner_content;
                    FrameLayout frameLayout = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.inner_content);
                    if (frameLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        i = R.id.song_album;
                        ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_album);
                        if (imageView3 != null) {
                            i = R.id.song_author;
                            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_author);
                            if (textView != null) {
                                i = R.id.song_container;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.song_container);
                                if (linearLayout3 != null) {
                                    i = R.id.song_duration;
                                    TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_duration);
                                    if (textView2 != null) {
                                        i = R.id.song_overlay;
                                        ImageView imageView4 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_overlay);
                                        if (imageView4 != null) {
                                            i = R.id.song_selected;
                                            ImageView imageView5 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_selected);
                                            if (imageView5 != null) {
                                                i = R.id.song_title;
                                                TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_title);
                                                if (textView3 != null) {
                                                    return new C4004l(linearLayout2, linearLayout, imageView, imageView2, frameLayout, imageView3, textView, linearLayout3, textView2, imageView4, imageView5, textView3);
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
        firebase((C4004l) interfaceC0589l, audioTrack, i, null, new C1712l(1));
    }

    @Override // defpackage.AbstractC7076l
    public final int purchase() {
        return R.layout.list_item_track_swipe;
    }
}
