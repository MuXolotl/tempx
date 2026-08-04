package defpackage;

/* JADX INFO: renamed from: lَٛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10419l implements InterfaceC3082l {
    public final String loadAd;
    public final String yandex;

    public C10419l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10419l)) {
            return false;
        }
        C10419l c10419l = (C10419l) obj;
        return this.yandex.equals(c10419l.yandex) && this.loadAd.equals(c10419l.loadAd);
    }

    public final int hashCode() {
        return AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Message(title=");
        sb.append(this.yandex);
        sb.append(", description=");
        return AbstractC0653l.ads(sb, this.loadAd, ", action=null)");
    }
}
