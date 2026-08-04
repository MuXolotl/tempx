package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: lَؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10681l {
    public static final C10681l amazon;
    public final AbstractC8481l crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        C10681l c10681l;
        if (Build.VERSION.SDK_INT >= 33) {
            C4146l c4146l = new C4146l(4);
            for (int i = 1; i <= 10; i++) {
                c4146l.crashlytics(Integer.valueOf(AbstractC15323l.Signature(i)));
            }
            c10681l = new C10681l(2, c4146l.mopub());
        } else {
            c10681l = new C10681l(2, 10);
        }
        amazon = c10681l;
    }

    public C10681l(int i, Set set) {
        this.yandex = i;
        AbstractC8481l abstractC8481lAds = AbstractC8481l.ads(set);
        this.crashlytics = abstractC8481lAds;
        AbstractC10199l it = abstractC8481lAds.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.loadAd = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10681l)) {
            return false;
        }
        C10681l c10681l = (C10681l) obj;
        return this.yandex == c10681l.yandex && this.loadAd == c10681l.loadAd && Objects.equals(this.crashlytics, c10681l.crashlytics);
    }

    public final int hashCode() {
        int i = ((this.yandex * 31) + this.loadAd) * 31;
        AbstractC8481l abstractC8481l = this.crashlytics;
        return i + (abstractC8481l == null ? 0 : abstractC8481l.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.yandex + ", maxChannelCount=" + this.loadAd + ", channelMasks=" + this.crashlytics + "]";
    }

    public C10681l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = null;
    }
}
