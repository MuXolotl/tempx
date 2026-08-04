package defpackage;

/* JADX INFO: renamed from: lًؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1641l {
    public final C11337l loadAd;
    public final C14728l yandex;

    public C1641l(C14728l c14728l, C11337l c11337l) {
        this.yandex = c14728l;
        if (c11337l != null) {
            this.loadAd = c11337l;
        } else {
            C6541l.subs("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1641l)) {
            return false;
        }
        C1641l c1641l = (C1641l) obj;
        return this.yandex.equals(c1641l.yandex) && this.loadAd.equals(c1641l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.yandex.toString();
        int length = string.length();
        String string2 = this.loadAd.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        AbstractC9361l.appmetrica(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
