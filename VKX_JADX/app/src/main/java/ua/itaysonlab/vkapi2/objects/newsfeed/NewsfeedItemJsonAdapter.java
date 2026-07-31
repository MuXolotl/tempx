package ua.itaysonlab.vkapi2.objects.newsfeed;

import defpackage.AbstractC15639l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class NewsfeedItemJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l firebase;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l subs;
    public final C0458l yandex = C0458l.m547strictfp("type", "post_type", "source_id", "from_id", "title", "text", "date", "button", "post_id", "audio", "audios", "audio_playlist", "copy_history", "attachments", "caption", "marked_as_ads");

    public NewsfeedItemJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "type");
        this.crashlytics = c12952l.loadAd(Integer.class, c5746l, "source_id");
        this.amazon = c12952l.loadAd(Long.class, c5746l, "date");
        this.purchase = c12952l.loadAd(Catalog2Button.class, c5746l, "button");
        this.billing = c12952l.loadAd(NewsfeedAudios.class, c5746l, "audio");
        this.mopub = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioTrack.class), c5746l, "audios");
        this.admob = c12952l.loadAd(NewsfeedPlaylists.class, c5746l, "audio_playlist");
        this.subs = c12952l.loadAd(AbstractC15639l.mopub(List.class, NewsfeedItem.class), c5746l, "copy_history");
        this.isPro = c12952l.loadAd(AbstractC15639l.mopub(List.class, NewsfeedAttachment.class), c5746l, "attachments");
        this.firebase = c12952l.loadAd(NewsfeedCaption.class, c5746l, "caption");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        NewsfeedItem newsfeedItem = (NewsfeedItem) obj;
        c3631l.mopub();
        c3631l.isVip("type");
        String str = newsfeedItem.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("post_type");
        abstractC7188l.billing(c3631l, newsfeedItem.loadAd);
        c3631l.isVip("source_id");
        Integer num = newsfeedItem.crashlytics;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, num);
        c3631l.isVip("from_id");
        abstractC7188l2.billing(c3631l, newsfeedItem.amazon);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, newsfeedItem.purchase);
        c3631l.isVip("text");
        abstractC7188l.billing(c3631l, newsfeedItem.billing);
        c3631l.isVip("date");
        this.amazon.billing(c3631l, newsfeedItem.mopub);
        c3631l.isVip("button");
        this.purchase.billing(c3631l, newsfeedItem.admob);
        c3631l.isVip("post_id");
        abstractC7188l2.billing(c3631l, newsfeedItem.subs);
        c3631l.isVip("audio");
        this.billing.billing(c3631l, newsfeedItem.isPro);
        c3631l.isVip("audios");
        this.mopub.billing(c3631l, newsfeedItem.firebase);
        c3631l.isVip("audio_playlist");
        this.admob.billing(c3631l, newsfeedItem.smaato);
        c3631l.isVip("copy_history");
        this.subs.billing(c3631l, newsfeedItem.remoteconfig);
        c3631l.isVip("attachments");
        this.isPro.billing(c3631l, newsfeedItem.vip);
        c3631l.isVip("caption");
        this.firebase.billing(c3631l, newsfeedItem.metrica);
        c3631l.isVip("marked_as_ads");
        abstractC7188l2.billing(c3631l, newsfeedItem.startapp);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        Catalog2Button catalog2Button = null;
        Integer num3 = null;
        NewsfeedAudios newsfeedAudios = null;
        List list = null;
        NewsfeedPlaylists newsfeedPlaylists = null;
        List list2 = null;
        List list3 = null;
        NewsfeedCaption newsfeedCaption = null;
        Integer num4 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    str = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 1:
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 2:
                    num = (Integer) abstractC7188l2.loadAd(c0396l);
                    break;
                case 3:
                    num2 = (Integer) abstractC7188l2.loadAd(c0396l);
                    break;
                case 4:
                    str3 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 5:
                    str4 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 6:
                    l = (Long) this.amazon.loadAd(c0396l);
                    break;
                case 7:
                    catalog2Button = (Catalog2Button) this.purchase.loadAd(c0396l);
                    break;
                case 8:
                    num3 = (Integer) abstractC7188l2.loadAd(c0396l);
                    break;
                case 9:
                    newsfeedAudios = (NewsfeedAudios) this.billing.loadAd(c0396l);
                    break;
                case 10:
                    list = (List) this.mopub.loadAd(c0396l);
                    break;
                case 11:
                    newsfeedPlaylists = (NewsfeedPlaylists) this.admob.loadAd(c0396l);
                    break;
                case 12:
                    list2 = (List) this.subs.loadAd(c0396l);
                    break;
                case 13:
                    list3 = (List) this.isPro.loadAd(c0396l);
                    break;
                case 14:
                    newsfeedCaption = (NewsfeedCaption) this.firebase.loadAd(c0396l);
                    break;
                case 15:
                    num4 = (Integer) abstractC7188l2.loadAd(c0396l);
                    break;
            }
        }
        c0396l.ads();
        return new NewsfeedItem(str, str2, num, num2, str3, str4, l, catalog2Button, num3, newsfeedAudios, list, newsfeedPlaylists, list2, list3, newsfeedCaption, num4);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(NewsfeedItem)";
    }
}
