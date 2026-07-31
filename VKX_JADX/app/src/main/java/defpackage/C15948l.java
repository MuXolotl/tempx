package defpackage;

/* JADX INFO: renamed from: lُٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15948l implements InterfaceC4505l {
    public final String loadAd;
    public final String yandex;

    public C15948l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15948l)) {
            return false;
        }
        C15948l c15948l = (C15948l) obj;
        return this.yandex.equals(c15948l.yandex) && this.loadAd.equals(c15948l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bluetooth(address=");
        sb.append(this.yandex);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
