package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7625l extends AbstractC14630l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f15701l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f15702l;

    public C7625l(boolean z, boolean z2) {
        this.f15702l = z;
        this.f15701l = z2;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.podcast_simple_view;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        final AudioTrack audioTrack = (AudioTrack) obj;
        C14211l c14211l = (C14211l) interfaceC0589l;
        TextView textView = c14211l.f27802l;
        LinearLayout linearLayout = c14211l.f27801l;
        final int i2 = 0;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: lٖٔؑ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                AudioTrack audioTrack2 = audioTrack;
                switch (i3) {
                    case 0:
                        AbstractC1213l.crashlytics(view, new C6038l(audioTrack2.loadAd, audioTrack2.crashlytics));
                        break;
                    default:
                        AbstractC1213l.crashlytics(view, new C0471l(audioTrack2.crashlytics));
                        break;
                }
            }
        });
        if (!this.f15701l) {
            AbstractC0977l.yandex(linearLayout);
        }
        TextView textView2 = c14211l.f27800l;
        final int i3 = 1;
        if (this.f15702l) {
            textView2.setText(String.valueOf(i + 1));
        } else {
            textView2.setVisibility(8);
        }
        AbstractC3282l.yandex(c14211l.f27803l, audioTrack, 3);
        c14211l.f27799l.setText(audioTrack.amazon);
        c14211l.f27798l.setText(audioTrack.advert.amazon);
        textView.setText(audioTrack.yandex);
        textView.setOnClickListener(new View.OnClickListener() { // from class: lٖٔؑ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                AudioTrack audioTrack2 = audioTrack;
                switch (i4) {
                    case 0:
                        AbstractC1213l.crashlytics(view, new C6038l(audioTrack2.loadAd, audioTrack2.crashlytics));
                        break;
                    default:
                        AbstractC1213l.crashlytics(view, new C0471l(audioTrack2.crashlytics));
                        break;
                }
            }
        });
        TextView textView3 = c14211l.f27804l;
        DecimalFormat decimalFormat = C15638l.yandex;
        textView3.setText(AbstractC14205l.amazon(audioTrack.purchase, false));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.podcast_simple_view, viewGroup, false);
        int i = R.id.chart_data;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.chart_data);
        if (textView != null) {
            i = R.id.desc;
            TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.desc);
            if (textView2 != null) {
                i = R.id.separator;
                if (((TextView) AbstractC8576l.smaato(viewInflate, R.id.separator)) != null) {
                    i = R.id.song_album;
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_album);
                    if (imageView != null) {
                        i = R.id.song_author;
                        TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_author);
                        if (textView3 != null) {
                            i = R.id.song_duration;
                            TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_duration);
                            if (textView4 != null) {
                                i = R.id.song_title;
                                TextView textView5 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.song_title);
                                if (textView5 != null) {
                                    return new C14211l((LinearLayout) viewInflate, textView, textView2, imageView, textView3, textView4, textView5);
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
}
