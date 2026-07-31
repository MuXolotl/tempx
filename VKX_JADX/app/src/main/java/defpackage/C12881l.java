package defpackage;

/* JADX INFO: renamed from: lّۜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12881l implements InterfaceC18382l {
    public final int yandex;

    public /* synthetic */ C12881l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12881l) {
            return this.yandex == ((C12881l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("Pixels(px=", this.yandex, ")");
    }
}
