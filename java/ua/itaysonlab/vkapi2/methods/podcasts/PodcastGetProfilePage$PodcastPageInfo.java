package ua.itaysonlab.vkapi2.methods.podcasts;

import defpackage.AbstractC12589l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C2580l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/podcasts/PodcastGetProfilePage$PodcastPageInfo", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class PodcastGetProfilePage$PodcastPageInfo {
    public final boolean admob;
    public final String amazon;
    public final PodcastCover billing;
    public final String crashlytics;
    public final AudioTrack firebase;
    public final List isPro;
    public final String loadAd;
    public final boolean mopub;
    public final long purchase;
    public final String smaato;
    public final boolean subs;
    public final String yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PodcastGetProfilePage$PodcastPageInfo(String str, String str2, String str3, String str4, long j, PodcastCover podcastCover, boolean z, boolean z2, boolean z3, List list, AudioTrack audioTrack, String str5, int i) {
        str = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) != 0 ? "" : str3;
        String str8 = (i & 8) != 0 ? "" : str4;
        long j2 = (i & 16) != 0 ? 0L : j;
        int i2 = i & 32;
        List list2 = C2580l.f5619l;
        this(str, str6, str7, str8, j2, i2 != 0 ? new PodcastCover(list2) : podcastCover, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? z3 : false, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? list : list2, (i & 1024) != 0 ? null : audioTrack, (i & 2048) != 0 ? "" : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastGetProfilePage$PodcastPageInfo)) {
            return false;
        }
        PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo = (PodcastGetProfilePage$PodcastPageInfo) obj;
        return AbstractC8576l.yandex(this.yandex, podcastGetProfilePage$PodcastPageInfo.yandex) && AbstractC8576l.yandex(this.loadAd, podcastGetProfilePage$PodcastPageInfo.loadAd) && AbstractC8576l.yandex(this.crashlytics, podcastGetProfilePage$PodcastPageInfo.crashlytics) && AbstractC8576l.yandex(this.amazon, podcastGetProfilePage$PodcastPageInfo.amazon) && this.purchase == podcastGetProfilePage$PodcastPageInfo.purchase && AbstractC8576l.yandex(this.billing, podcastGetProfilePage$PodcastPageInfo.billing) && this.mopub == podcastGetProfilePage$PodcastPageInfo.mopub && this.admob == podcastGetProfilePage$PodcastPageInfo.admob && this.subs == podcastGetProfilePage$PodcastPageInfo.subs && AbstractC8576l.yandex(this.isPro, podcastGetProfilePage$PodcastPageInfo.isPro) && AbstractC8576l.yandex(this.firebase, podcastGetProfilePage$PodcastPageInfo.firebase) && AbstractC8576l.yandex(this.smaato, podcastGetProfilePage$PodcastPageInfo.smaato);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
        long j = this.purchase;
        int iAdmob = AbstractC14814l.admob((((((((this.billing.hashCode() + ((iAdvert + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237)) * 31) + (this.subs ? 1231 : 1237)) * 31, 31, this.isPro);
        AudioTrack audioTrack = this.firebase;
        return this.smaato.hashCode() + ((iAdmob + (audioTrack == null ? 0 : audioTrack.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastPageInfo(category=");
        sb.append(this.yandex);
        sb.append(", friends_text=");
        sb.append(this.loadAd);
        sb.append(", podcast_description=");
        sb.append(this.crashlytics);
        sb.append(", name=");
        sb.append(this.amazon);
        sb.append(", owner_id=");
        sb.append(this.purchase);
        sb.append(", podcast_cover=");
        sb.append(this.billing);
        sb.append(", can_subscribe_podcasts=");
        sb.append(this.mopub);
        sb.append(", is_subscribed_podcasts=");
        sb.append(this.admob);
        sb.append(", can_subscribe=");
        sb.append(this.subs);
        sb.append(", friends=");
        sb.append(this.isPro);
        sb.append(", trailer=");
        sb.append(this.firebase);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.smaato, ')');
    }

    public PodcastGetProfilePage$PodcastPageInfo(String str, String str2, String str3, String str4, long j, PodcastCover podcastCover, boolean z, boolean z2, boolean z3, List list, AudioTrack audioTrack, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = j;
        this.billing = podcastCover;
        this.mopub = z;
        this.admob = z2;
        this.subs = z3;
        this.isPro = list;
        this.firebase = audioTrack;
        this.smaato = str5;
    }
}
