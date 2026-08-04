package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8638l extends AbstractC2869l {
    public final String loadAd;
    public final List yandex;

    public C8638l(List list, String str) {
        this.yandex = list;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2869l)) {
            return false;
        }
        C8638l c8638l = (C8638l) ((AbstractC2869l) obj);
        if (!this.yandex.equals(c8638l.yandex)) {
            return false;
        }
        String str = c8638l.loadAd;
        String str2 = this.loadAd;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        String str = this.loadAd;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.yandex);
        sb.append(", orgId=");
        return AbstractC0653l.ads(sb, this.loadAd, "}");
    }
}
