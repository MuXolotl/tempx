package defpackage;

/* JADX INFO: renamed from: lٍٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9695l implements InterfaceC18384l {
    public final InterfaceC5068l yandex;

    public C9695l(InterfaceC5068l interfaceC5068l) {
        this.yandex = interfaceC5068l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9695l) {
            return this.yandex.equals(((C9695l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC16243l
    public final C14329l loadAd() {
        return this.yandex.loadAd();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC16243l
    public final C1094l yandex() {
        return this.yandex.yandex();
    }
}
