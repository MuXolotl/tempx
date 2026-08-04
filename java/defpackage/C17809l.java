package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17809l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f34740l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f34741l = AbstractC11990l.loadAd();

    public C17809l(boolean z) {
        this.f34740l = z;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return this.f34740l ? R.layout.list_item_playlist_large : R.layout.list_item_playlist_no_subtitle;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        Podcast podcast = (Podcast) obj;
        Integer numValueOf = Integer.valueOf(R.drawable.placeholder_playlist);
        String str = podcast.purchase;
        String str2 = podcast.yandex;
        List list = podcast.billing;
        interfaceC0589l.getRoot().setOnClickListener(new ViewOnClickListenerC2191l(podcast, 0));
        if (this.f34740l) {
            C9589l c9589l = (C9589l) interfaceC0589l;
            ImageView imageView = c9589l.f19528l;
            PodcastCover podcastCover = (PodcastCover) AbstractC16901l.m4217extends(list);
            AbstractC17891l.crashlytics(imageView, podcastCover != null ? podcastCover.yandex("a") : null, numValueOf, new C10923l(new C6985l(8.0f), 14));
            c9589l.f19531l.setText(str2);
            c9589l.f19529l.setText(str);
            return;
        }
        C5182l c5182l = (C5182l) interfaceC0589l;
        ImageView imageView2 = c5182l.f11249l;
        PodcastCover podcastCover2 = (PodcastCover) AbstractC16901l.m4217extends(list);
        AbstractC17891l.crashlytics(imageView2, podcastCover2 != null ? podcastCover2.yandex("c") : null, numValueOf, new C10923l(new C6985l(8.0f), 14));
        c5182l.f11252l.setText(str2);
        c5182l.f11250l.setText(str);
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!this.f34740l) {
            return C5182l.yandex(layoutInflater, viewGroup);
        }
        View viewInflate = layoutInflater.inflate(R.layout.list_item_playlist_large, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_image;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.playlist_image);
            if (imageView != null) {
                i = R.id.playlist_title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_title);
                if (textView2 != null) {
                    return new C9589l(imageView, (LinearLayout) viewInflate, textView, textView2);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f34741l.f36440l;
    }
}
