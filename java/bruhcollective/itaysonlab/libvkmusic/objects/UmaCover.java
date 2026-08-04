package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC12024l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC9029l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaCover;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class UmaCover {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public UmaCover(String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        yandex(1);
        yandex(2);
        this.amazon = yandex(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaCover)) {
            return false;
        }
        UmaCover umaCover = (UmaCover) obj;
        return AbstractC8576l.yandex(this.yandex, umaCover.yandex) && AbstractC8576l.yandex(this.loadAd, umaCover.loadAd) && AbstractC8576l.yandex(this.crashlytics, umaCover.crashlytics);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaCover(avgColor=");
        sb.append(this.yandex);
        sb.append(", accentColor=");
        sb.append(this.loadAd);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    public final String yandex(int i) {
        int iPurchase = AbstractC9029l.purchase(i);
        String str = this.crashlytics;
        if (AbstractC12024l.appmetrica(str, "?", false)) {
            return str + "&mw=" + iPurchase;
        }
        return str + "?mw=" + iPurchase;
    }
}
