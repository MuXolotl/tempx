package defpackage;

/* JADX INFO: renamed from: lَۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10488l implements InterfaceC5475l {
    public final Throwable yandex;

    public C10488l(Throwable th) {
        this.yandex = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10488l) && AbstractC8576l.yandex(this.yandex, ((C10488l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.yandex + ')';
    }
}
