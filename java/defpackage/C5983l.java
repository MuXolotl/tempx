package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioBookPerson;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘۜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5983l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f12713l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f12714l;

    public C5983l(int i) {
        this.f12714l = i;
        switch (i) {
            case 1:
                this.f12713l = AbstractC11990l.loadAd();
                break;
            default:
                this.f12713l = AbstractC11990l.loadAd();
                break;
        }
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        switch (this.f12714l) {
            case 0:
                return R.layout.artist_header_v2cb;
            default:
                return R.layout.list_item_playlist_horizontal;
        }
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        Object next;
        switch (this.f12714l) {
            case 0:
                AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
                C11972l c11972l = (C11972l) interfaceC0589l;
                ImageView imageView = c11972l.f23841l;
                Iterator it = audioBookPerson.amazon.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int i2 = ((CustomCatalogBlockItemPhoto) next).yandex;
                        do {
                            Object next2 = it.next();
                            int i3 = ((CustomCatalogBlockItemPhoto) next2).yandex;
                            if (i2 < i3) {
                                next = next2;
                                i2 = i3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) next;
                String str = customCatalogBlockItemPhoto != null ? customCatalogBlockItemPhoto.loadAd : null;
                C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
                C9477l c9477l = new C9477l(imageView.getContext());
                c9477l.crashlytics = str;
                AbstractC10413l.amazon(c9477l, imageView);
                c13177lYandex.yandex(c9477l.yandex());
                c11972l.f23843l.setText(audioBookPerson.crashlytics);
                c11972l.f23847l.setLayoutParams(new RelativeLayout.LayoutParams(-1, AbstractC5852l.yandex));
                c11972l.f23846l.setVisibility(8);
                c11972l.f23845l.setVisibility(8);
                TextView textView = c11972l.f23842l;
                String str2 = audioBookPerson.yandex;
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(str2);
                break;
            default:
                Podcast podcast = (Podcast) obj;
                C15896l c15896l = (C15896l) interfaceC0589l;
                c15896l.f31175l.setOnClickListener(new ViewOnClickListenerC2191l(podcast, 1));
                ImageView imageView2 = c15896l.f31177l;
                PodcastCover podcastCover = (PodcastCover) AbstractC16901l.m4217extends(podcast.billing);
                AbstractC17891l.crashlytics(imageView2, podcastCover != null ? podcastCover.yandex("a") : null, Integer.valueOf(R.drawable.placeholder_playlist), new C10923l(new C6985l(8.0f), 14));
                c15896l.f31178l.setText(podcast.yandex);
                c15896l.f31174l.setText(podcast.purchase);
                AbstractC5833l.purchase(c15896l.f31176l);
                AbstractC5833l.purchase(c15896l.f31173l);
                break;
        }
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f12714l) {
            case 0:
                View viewInflate = layoutInflater.inflate(R.layout.artist_header_v2cb, viewGroup, false);
                int i = R.id.artist_name;
                TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.artist_name);
                if (textView != null) {
                    i = R.id.artist_photo;
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.artist_photo);
                    if (imageView != null) {
                        i = R.id.artist_play;
                        MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.artist_play);
                        if (materialButton != null) {
                            i = R.id.artist_subscribe;
                            MaterialButton materialButton2 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.artist_subscribe);
                            if (materialButton2 != null) {
                                i = R.id.sb_padder;
                                Space space = (Space) AbstractC8576l.smaato(viewInflate, R.id.sb_padder);
                                if (space != null) {
                                    i = R.id.scrim_bottom;
                                    if (AbstractC8576l.smaato(viewInflate, R.id.scrim_bottom) != null) {
                                        i = R.id.text;
                                        TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.text);
                                        if (textView2 != null) {
                                            return new C11972l((LinearLayout) viewInflate, textView, imageView, materialButton, materialButton2, space, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            default:
                return C15896l.yandex(layoutInflater, viewGroup);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        int i = this.f12714l;
        C18662l c18662l = this.f12713l;
        switch (i) {
            case 0:
                break;
        }
        return c18662l.f36440l;
    }
}
