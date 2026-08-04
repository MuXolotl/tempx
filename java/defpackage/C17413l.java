package defpackage;

/* JADX INFO: renamed from: lٗۛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17413l {
    public final int loadAd;
    public final String yandex;

    public C17413l(String str, int i) {
        this.yandex = str;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17413l)) {
            return false;
        }
        C17413l c17413l = (C17413l) obj;
        return this.yandex.equals(c17413l.yandex) && this.loadAd == c17413l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.yandex);
        sb.append(", enableFirelog=true, firelogEventType=");
        return AbstractC14814l.remoteconfig(this.loadAd, "}", sb);
    }
}
