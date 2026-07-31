package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC12589l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook;", "Llُّؔ;", "Link", "Chapter", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioBook implements InterfaceC12360l {
    public final List adcel;
    public final String admob;
    public final List ads;
    public final List amazon;
    public final List billing;
    public final List crashlytics;
    public final boolean firebase;
    public final int isPro;
    public final Link loadAd;
    public final String metrica;
    public final String mopub;
    public final List purchase;
    public final int remoteconfig;
    public final boolean smaato;
    public final String startapp;
    public final int subs;
    public final String subscription;
    public final int vip;
    public final int yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Link;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Link {
        public final String loadAd;
        public final int yandex;

        public Link(int i, String str) {
            this.yandex = i;
            this.loadAd = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return this.yandex == link.yandex && AbstractC8576l.yandex(this.loadAd, link.loadAd);
        }

        public final int hashCode() {
            return this.loadAd.hashCode() + (this.yandex * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(id=");
            sb.append(this.yandex);
            sb.append(", name=");
            return AbstractC2812l.tapsense(sb, this.loadAd, ')');
        }
    }

    public AudioBook(int i, Link link, List list, List list2, List list3, List list4, String str, String str2, int i2, int i3, boolean z, boolean z2, int i4, int i5, String str3, String str4, List list5, List list6, String str5) {
        this.yandex = i;
        this.loadAd = link;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = list3;
        this.billing = list4;
        this.mopub = str;
        this.admob = str2;
        this.subs = i2;
        this.isPro = i3;
        this.firebase = z;
        this.smaato = z2;
        this.remoteconfig = i4;
        this.vip = i5;
        this.metrica = str3;
        this.startapp = str4;
        this.adcel = list5;
        this.ads = list6;
        this.subscription = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBook)) {
            return false;
        }
        AudioBook audioBook = (AudioBook) obj;
        return this.yandex == audioBook.yandex && AbstractC8576l.yandex(this.loadAd, audioBook.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioBook.crashlytics) && AbstractC8576l.yandex(this.amazon, audioBook.amazon) && AbstractC8576l.yandex(this.purchase, audioBook.purchase) && AbstractC8576l.yandex(this.billing, audioBook.billing) && AbstractC8576l.yandex(this.mopub, audioBook.mopub) && AbstractC8576l.yandex(this.admob, audioBook.admob) && this.subs == audioBook.subs && this.isPro == audioBook.isPro && this.firebase == audioBook.firebase && this.smaato == audioBook.smaato && this.remoteconfig == audioBook.remoteconfig && this.vip == audioBook.vip && AbstractC8576l.yandex(this.metrica, audioBook.metrica) && AbstractC8576l.yandex(this.startapp, audioBook.startapp) && AbstractC8576l.yandex(this.adcel, audioBook.adcel) && AbstractC8576l.yandex(this.ads, audioBook.ads) && AbstractC8576l.yandex(this.subscription, audioBook.subscription);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        return this.subscription.hashCode() + AbstractC14814l.admob(AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert((((((((((((AbstractC12589l.advert(AbstractC12589l.advert(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob((this.loadAd.hashCode() + (this.yandex * 31)) * 31, 31, this.crashlytics), 31, this.amazon), 31, this.purchase), 31, this.billing), 31, this.mopub), 31, this.admob) + this.subs) * 31) + this.isPro) * 31) + (this.firebase ? 1231 : 1237)) * 31) + (this.smaato ? 1231 : 1237)) * 31) + this.remoteconfig) * 31) + this.vip) * 31, 31, this.metrica), 31, this.startapp), 31, this.adcel), 31, this.ads);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBook(id=");
        sb.append(this.yandex);
        sb.append(", publisher=");
        sb.append(this.loadAd);
        sb.append(", narrators=");
        sb.append(this.crashlytics);
        sb.append(", translators=");
        sb.append(this.amazon);
        sb.append(", genres=");
        sb.append(this.purchase);
        sb.append(", authors=");
        sb.append(this.billing);
        sb.append(", code=");
        sb.append(this.mopub);
        sb.append(", title=");
        sb.append(this.admob);
        sb.append(", duration=");
        sb.append(this.subs);
        sb.append(", minimum_age=");
        sb.append(this.isPro);
        sb.append(", is_explicit=");
        sb.append(this.firebase);
        sb.append(", in_favorites=");
        sb.append(this.smaato);
        sb.append(", progress_percentage=");
        sb.append(this.remoteconfig);
        sb.append(", release_date=");
        sb.append(this.vip);
        sb.append(", copyright=");
        sb.append(this.metrica);
        sb.append(", access_status=");
        sb.append(this.startapp);
        sb.append(", cover=");
        sb.append(this.adcel);
        sb.append(", chapters=");
        sb.append(this.ads);
        sb.append(", track_code=");
        return AbstractC2812l.tapsense(sb, this.subscription, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Chapter;", "", "AudioFile", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Chapter {
        public final int amazon;
        public final AudioFile billing;
        public final String crashlytics;
        public final String loadAd;
        public final String purchase;
        public final String yandex;

        public Chapter(String str, String str2, String str3, int i, String str4, AudioFile audioFile) {
            this.yandex = str;
            this.loadAd = str2;
            this.crashlytics = str3;
            this.amazon = i;
            this.purchase = str4;
            this.billing = audioFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chapter)) {
                return false;
            }
            Chapter chapter = (Chapter) obj;
            return AbstractC8576l.yandex(this.yandex, chapter.yandex) && AbstractC8576l.yandex(this.loadAd, chapter.loadAd) && AbstractC8576l.yandex(this.crashlytics, chapter.crashlytics) && this.amazon == chapter.amazon && AbstractC8576l.yandex(this.purchase, chapter.purchase) && AbstractC8576l.yandex(this.billing, chapter.billing);
        }

        public final int hashCode() {
            return this.billing.hashCode() + AbstractC12589l.advert((AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics) + this.amazon) * 31, 31, this.purchase);
        }

        public final String toString() {
            return "Chapter(id=" + this.yandex + ", title=" + this.loadAd + ", progress_status=" + this.crashlytics + ", progress_time=" + this.amazon + ", track_code=" + this.purchase + ", audio_file=" + this.billing + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Chapter$AudioFile;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @InterfaceC15749l(generateAdapter = true)
        public static final /* data */ class AudioFile {
            public final long crashlytics;
            public final int loadAd;
            public final String yandex;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ AudioFile(int i, int i2, long j, String str) {
                str = (i2 & 1) != 0 ? "" : str;
                this((i2 & 4) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, str);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AudioFile)) {
                    return false;
                }
                AudioFile audioFile = (AudioFile) obj;
                return AbstractC8576l.yandex(this.yandex, audioFile.yandex) && this.loadAd == audioFile.loadAd && this.crashlytics == audioFile.crashlytics;
            }

            public final int hashCode() {
                int iHashCode = ((this.yandex.hashCode() * 31) + this.loadAd) * 31;
                long j = this.crashlytics;
                return iHashCode + ((int) (j ^ (j >>> 32)));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioFile(url=");
                sb.append(this.yandex);
                sb.append(", duration=");
                sb.append(this.loadAd);
                sb.append(", file_size=");
                return AbstractC12900l.smaato(sb, this.crashlytics, ')');
            }

            public AudioFile(long j, int i, String str) {
                this.yandex = str;
                this.loadAd = i;
                this.crashlytics = j;
            }
        }
    }
}
