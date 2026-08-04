package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.metrica;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17022l extends AbstractC14630l implements InterfaceC4364l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f33161l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C9554l f33162l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f33163l;

    public C17022l(int i, boolean z, C9554l c9554l) {
        this.f33163l = i;
        this.f33161l = z;
        this.f33162l = c9554l;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void advert(metrica metricaVar) {
        ImageView imageView;
        InterfaceC0589l interfaceC0589l = ((C8813l) metricaVar).Signature;
        int iInmobi = AbstractC5020l.inmobi(this.f33163l);
        if (iInmobi == 0) {
            imageView = ((C12046l) interfaceC0589l).f23971l;
        } else if (iInmobi == 1) {
            imageView = ((C5182l) interfaceC0589l).f11249l;
        } else if (iInmobi == 2 || iInmobi == 3) {
            imageView = ((C15896l) interfaceC0589l).f31177l;
        } else if (iInmobi == 4) {
            imageView = ((C14574l) interfaceC0589l).f28541l;
        } else {
            if (iInmobi != 5) {
                C18725l.billing();
                return;
            }
            imageView = ((C14828l) interfaceC0589l).f29025l;
        }
        AbstractC7477l.yandex(imageView).yandex();
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        int iInmobi = AbstractC5020l.inmobi(this.f33163l);
        if (iInmobi == 0) {
            return R.layout.list_item_playlist;
        }
        if (iInmobi == 1) {
            return R.layout.list_item_playlist_no_subtitle;
        }
        if (iInmobi == 2 || iInmobi == 3) {
            return R.layout.list_item_playlist_horizontal;
        }
        if (iInmobi == 4) {
            return R.layout.list_item_playlist_chart;
        }
        if (iInmobi == 5) {
            return R.layout.list_item_playlist_recomms;
        }
        C18725l.billing();
        return 0;
    }

    @Override // defpackage.InterfaceC4364l
    public final boolean crashlytics() {
        return this.f33161l;
    }

    public final String inmobi(long j) {
        VKProfile vKProfile = (VKProfile) this.f33162l.admob.get(String.valueOf(j));
        if (vKProfile != null) {
            return vKProfile.yandex();
        }
        return null;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, final InterfaceC0589l interfaceC0589l) {
        String strInmobi;
        String strInmobi2;
        final AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        long j = audioPlaylist.amazon;
        Boolean bool = audioPlaylist.ad;
        String str = audioPlaylist.mopub;
        if (audioPlaylist.f36622synchronized) {
            strInmobi = audioPlaylist.f36621strictfp;
            if (strInmobi == null) {
                strInmobi = "";
            }
        } else if (AbstractC14770l.billing(audioPlaylist)) {
            strInmobi = AbstractC14770l.crashlytics(audioPlaylist).crashlytics;
        } else {
            OriginalPlaylist originalPlaylist = audioPlaylist.tapsense;
            strInmobi = (originalPlaylist == null || (strInmobi2 = inmobi(originalPlaylist.yandex)) == null) ? inmobi(j) : strInmobi2;
        }
        final String str2 = strInmobi != null ? strInmobi : "";
        interfaceC0589l.getRoot().setOnClickListener(new ViewOnClickListenerC9663l(this, audioPlaylist));
        interfaceC0589l.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: lٍٟۛ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (this.f19857l.f33163l == 6) {
                    return true;
                }
                new C4456l(new C5218l(audioPlaylist, str2)).Signature((Activity) interfaceC0589l.getRoot().getContext());
                return true;
            }
        });
        interfaceC0589l.getRoot().setAlpha(audioPlaylist.inmobi != null ? 0.4f : 1.0f);
        int i2 = this.f33163l;
        int iInmobi = AbstractC5020l.inmobi(i2);
        if (iInmobi == 0) {
            C12046l c12046l = (C12046l) interfaceC0589l;
            TextView textView = c12046l.f23975l;
            TextView textView2 = c12046l.f23974l;
            AbstractC3282l.loadAd(c12046l.f23971l, audioPlaylist, 3, 6);
            textView2.setText(str);
            c12046l.f23972l.setText(str2);
            String strYandex = AbstractC9769l.yandex(audioPlaylist);
            if (strYandex.length() > 0) {
                textView.setVisibility(0);
                textView.setText(strYandex);
            } else {
                textView.setVisibility(8);
            }
            if (AbstractC8576l.yandex(bool, Boolean.TRUE)) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        int i3 = 1;
        if (iInmobi == 1) {
            C5182l c5182l = (C5182l) interfaceC0589l;
            TextView textView3 = c5182l.f11252l;
            AbstractC3282l.loadAd(c5182l.f11249l, audioPlaylist, 3, 6);
            textView3.setText(str);
            c5182l.f11250l.setText(str2);
            if (AbstractC8576l.yandex(bool, Boolean.TRUE)) {
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (iInmobi == 2 || iInmobi == 3) {
            C15896l c15896l = (C15896l) interfaceC0589l;
            TextView textView4 = c15896l.f31176l;
            TextView textView5 = c15896l.f31173l;
            TextView textView6 = c15896l.f31178l;
            AbstractC3282l.loadAd(c15896l.f31177l, audioPlaylist, 3, 6);
            textView6.setText(str);
            c15896l.f31174l.setText(str2);
            textView5.setText(String.valueOf(i + 1));
            textView5.setVisibility(i2 == 4 ? 0 : 8);
            String strYandex2 = AbstractC9769l.yandex(audioPlaylist);
            if (strYandex2.length() > 0) {
                textView4.setVisibility(0);
                textView4.setText(strYandex2);
            } else {
                textView4.setVisibility(8);
            }
            if (AbstractC8576l.yandex(bool, Boolean.TRUE)) {
                textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (iInmobi != 4) {
            if (iInmobi != 5) {
                C18725l.billing();
                return;
            }
            C14828l c14828l = (C14828l) interfaceC0589l;
            AbstractC17891l.loadAd(c14828l.f29025l, AbstractC14770l.purchase(audioPlaylist), null, new C10923l(null, 15));
            c14828l.f29024l.setText(str);
            c14828l.f29021l.setText(audioPlaylist.advert);
            c14828l.f29022l.setOnClickListener(new ViewOnClickListenerC9663l(audioPlaylist, i3));
            return;
        }
        C14574l c14574l = (C14574l) interfaceC0589l;
        TextView textView7 = c14574l.f28540l;
        TextView textView8 = c14574l.f28542l;
        AbstractC3282l.loadAd(c14574l.f28541l, audioPlaylist, 3, 6);
        textView8.setText(str);
        c14574l.f28537l.setText(str2);
        c14574l.f28538l.setText(String.valueOf(i + 1));
        String strYandex3 = AbstractC9769l.yandex(audioPlaylist);
        if (strYandex3.length() > 0) {
            textView7.setVisibility(0);
            textView7.setText(strYandex3);
        } else {
            textView7.setVisibility(8);
        }
        if (AbstractC8576l.yandex(bool, Boolean.TRUE)) {
            textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
        } else {
            textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // defpackage.InterfaceC4364l
    public final void loadAd(int i, int i2) {
        ArrayList arrayList = new ArrayList(this.f28630l.billing);
        Collections.swap(arrayList, i, i2);
        appmetrica(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b A[PHI: r14
  0x006b: PHI (r14v11 int) = (r14v10 int), (r14v12 int) binds: [B:15:0x0035, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iInmobi = AbstractC5020l.inmobi(this.f33163l);
        int i = R.id.playlist_subtitle;
        int i2 = R.id.playlist_title;
        if (iInmobi == 0) {
            View viewInflate = layoutInflater.inflate(R.layout.list_item_playlist, viewGroup, false);
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_author);
            if (textView != null) {
                ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.playlist_image);
                if (imageView != null) {
                    TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_subtitle);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_title);
                        if (textView3 != null) {
                            return new C12046l(imageView, (LinearLayout) viewInflate, textView, textView2, textView3);
                        }
                        i = R.id.playlist_title;
                    }
                } else {
                    i = R.id.playlist_image;
                }
            } else {
                i = R.id.playlist_author;
            }
            C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return null;
        }
        if (iInmobi == 1) {
            return C5182l.yandex(layoutInflater, viewGroup);
        }
        if (iInmobi == 2 || iInmobi == 3) {
            return C15896l.yandex(layoutInflater, viewGroup);
        }
        if (iInmobi == 4) {
            View viewInflate2 = layoutInflater.inflate(R.layout.list_item_playlist_chart, viewGroup, false);
            TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.chart_position);
            if (textView4 != null) {
                TextView textView5 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.playlist_author);
                if (textView5 != null) {
                    ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate2, R.id.playlist_image);
                    if (imageView2 != null) {
                        TextView textView6 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.playlist_subtitle);
                        if (textView6 != null) {
                            TextView textView7 = (TextView) AbstractC8576l.smaato(viewInflate2, R.id.playlist_title);
                            if (textView7 != null) {
                                return new C14574l((LinearLayout) viewInflate2, textView4, textView5, imageView2, textView6, textView7);
                            }
                            i = R.id.playlist_title;
                        }
                    } else {
                        i = R.id.playlist_image;
                    }
                } else {
                    i = R.id.playlist_author;
                }
            } else {
                i = R.id.chart_position;
            }
            C6541l.subs("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i)));
            return null;
        }
        if (iInmobi != 5) {
            C18725l.billing();
            return null;
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.list_item_playlist_recomms, viewGroup, false);
        int i3 = R.id.dimmer;
        if (AbstractC8576l.smaato(viewInflate3, R.id.dimmer) != null) {
            i3 = R.id.play;
            ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate3, R.id.play);
            if (imageView3 != null) {
                TextView textView8 = (TextView) AbstractC8576l.smaato(viewInflate3, R.id.playlist_author);
                if (textView8 != null) {
                    ImageView imageView4 = (ImageView) AbstractC8576l.smaato(viewInflate3, R.id.playlist_image);
                    if (imageView4 != null) {
                        TextView textView9 = (TextView) AbstractC8576l.smaato(viewInflate3, R.id.playlist_title);
                        if (textView9 != null) {
                            return new C14828l((MaterialCardView) viewInflate3, imageView3, textView8, imageView4, textView9);
                        }
                    } else {
                        i2 = R.id.playlist_image;
                    }
                } else {
                    i2 = R.id.playlist_author;
                }
            } else {
                i2 = i3;
            }
        } else {
            i2 = i3;
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.InterfaceC4364l
    public final void yandex(int i) {
        C16534l c16534l;
        C12552l c12552l = this.f28630l;
        AudioPlaylist audioPlaylist = (AudioPlaylist) AbstractC16901l.m4220for(i, c12552l.billing);
        if (audioPlaylist == null) {
            return;
        }
        List list = c12552l.billing;
        if (i == 0) {
            c16534l = new C16534l(audioPlaylist, Integer.valueOf(((AudioPlaylist) list.get(1)).crashlytics), (Integer) null, 4);
        } else {
            int iSmaato = AbstractC14055l.smaato(list);
            List list2 = c12552l.billing;
            c16534l = i == iSmaato ? new C16534l(audioPlaylist, (Integer) null, Integer.valueOf(((AudioPlaylist) list2.get(AbstractC14055l.smaato(list2) - 1)).crashlytics), 2) : new C16534l(audioPlaylist, (Integer) null, Integer.valueOf(((AudioPlaylist) list2.get(i - 1)).crashlytics), 2);
        }
        AbstractC8189l.purchase(c16534l);
    }
}
