package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؒٝ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1203l {
    public static final C13363l Companion = new C13363l();
    public static final InterfaceC1220l[] purchase = {AbstractC9968l.crashlytics(2, new C8810l(27)), null, null, null};
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final Map yandex;

    public /* synthetic */ C1203l(int i, String str, String str2, String str3, Map map) {
        this.yandex = (i & 1) == 0 ? C14054l.f27396l : map;
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203l)) {
            return false;
        }
        C1203l c1203l = (C1203l) obj;
        return AbstractC8576l.yandex(this.yandex, c1203l.yandex) && AbstractC8576l.yandex(this.loadAd, c1203l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1203l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1203l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleConfigStruct(entries=");
        sb.append(this.yandex);
        sb.append(", appName=");
        sb.append(this.loadAd);
        sb.append(", state=");
        sb.append(this.crashlytics);
        sb.append(", templateVersion=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
