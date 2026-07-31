package defpackage;

/* JADX INFO: renamed from: lّۢۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12939l implements InterfaceC6844l {
    public final int yandex;

    public C12939l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12939l) && this.yandex == ((C12939l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("TransferInterrupted(code="), this.yandex, ')');
    }
}
