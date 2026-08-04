package defpackage;

/* JADX INFO: renamed from: lؔۥؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3022l implements InterfaceC5475l {
    public final Throwable yandex;

    public C3022l(Throwable th) {
        this.yandex = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3022l) && AbstractC8576l.yandex(this.yandex, ((C3022l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "InternalVkException(exception=" + this.yandex + ')';
    }
}
