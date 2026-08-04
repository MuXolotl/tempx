package defpackage;

/* JADX INFO: renamed from: lؚؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7036l implements InterfaceC0330l {
    public final Object loadAd;
    public final InterfaceC0330l yandex;

    public C7036l(InterfaceC0330l interfaceC0330l, Object obj) {
        this.yandex = interfaceC0330l;
        AbstractC13841l.billing(obj, "log site qualifier");
        this.loadAd = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7036l)) {
            return false;
        }
        C7036l c7036l = (C7036l) obj;
        return this.yandex.equals(c7036l.yandex) && this.loadAd.equals(c7036l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ this.yandex.hashCode();
    }

    public final String toString() {
        String string = this.yandex.toString();
        int length = string.length();
        String string2 = this.loadAd.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        AbstractC9361l.appmetrica(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
