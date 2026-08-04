package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC8576l;
import defpackage.C11521l;
import defpackage.C2580l;
import defpackage.EnumC15795l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioSnippetEntry;", "", "lٕٛۧ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioSnippetEntry {
    public final List admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final List mopub;
    public final String purchase;
    public final String yandex;

    public AudioSnippetEntry(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        Object next;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
        this.billing = str6;
        this.mopub = list;
        this.admob = list2;
        C11521l c11521l = new C11521l(0, EnumC15795l.f31011l);
        while (c11521l.hasNext()) {
            next = c11521l.next();
            if (((EnumC15795l) next).f31013l.equals(this.yandex)) {
            }
        }
        next = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSnippetEntry)) {
            return false;
        }
        AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj;
        return AbstractC8576l.yandex(this.yandex, audioSnippetEntry.yandex) && AbstractC8576l.yandex(this.loadAd, audioSnippetEntry.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioSnippetEntry.crashlytics) && AbstractC8576l.yandex(this.amazon, audioSnippetEntry.amazon) && AbstractC8576l.yandex(this.purchase, audioSnippetEntry.purchase) && AbstractC8576l.yandex(this.billing, audioSnippetEntry.billing) && AbstractC8576l.yandex(this.mopub, audioSnippetEntry.mopub) && AbstractC8576l.yandex(this.admob, audioSnippetEntry.admob);
    }

    public final int hashCode() {
        return this.admob.hashCode() + AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon), 31, this.purchase), 31, this.billing), 31, this.mopub);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSnippetEntry(type=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", text=");
        sb.append(this.crashlytics);
        sb.append(", nav_url=");
        sb.append(this.amazon);
        sb.append(", image=");
        sb.append(this.purchase);
        sb.append(", track_code=");
        sb.append(this.billing);
        sb.append(", audios=");
        sb.append(this.mopub);
        sb.append(", audio_ids=");
        return AbstractC0653l.subscription(sb, this.admob, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudioSnippetEntry(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i) {
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        str6 = (i & 32) != 0 ? "" : str6;
        int i2 = i & 64;
        C2580l c2580l = C2580l.f5619l;
        this(str, str2, str3, str4, str5, str6, i2 != 0 ? c2580l : list, (i & 128) != 0 ? c2580l : list2);
    }
}
