package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٟؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2023l extends AbstractC15096l implements InterfaceC3488l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;

    public C2023l(String str, String str2, String str3) {
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2023l)) {
            return false;
        }
        C2023l c2023l = (C2023l) obj;
        return this.loadAd.equals(c2023l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c2023l.crashlytics) && AbstractC8576l.yandex(this.amazon, c2023l.amazon);
    }

    public final int hashCode() {
        int iHashCode = this.loadAd.hashCode() * 31;
        String str = this.crashlytics;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amazon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        List list = (List) c5740l.f12126l;
        return AbstractC3605l.mopub(i, this.loadAd, this.crashlytics, this.amazon, list, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.crashlytics;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.loadAd);
        sb.append('}');
        String str2 = this.amazon;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }
}
