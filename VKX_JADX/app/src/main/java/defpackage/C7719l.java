package defpackage;

/* JADX INFO: renamed from: lًؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7719l implements InterfaceC0038l {
    public final String yandex;

    public C7719l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7719l) && AbstractC8576l.yandex(this.yandex, ((C7719l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("OrdinaryQrCodeScanned(url="), this.yandex, ')');
    }
}
