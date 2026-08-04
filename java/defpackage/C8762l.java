package defpackage;

/* JADX INFO: renamed from: lٌٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8762l implements InterfaceC12152l {
    public final boolean yandex;

    public C8762l(boolean z) {
        this.yandex = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8762l) && this.yandex == ((C8762l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC0653l.tapsense(new StringBuilder("Denied(shouldShowRationale="), this.yandex, ')');
    }
}
