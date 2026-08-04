package defpackage;

/* JADX INFO: renamed from: lؔۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2966l implements InterfaceC14206l {
    public final int yandex;

    public C2966l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2966l) && ((C2966l) obj).yandex == this.yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC12145l yandex(C0010l c0010l) {
        return new C14513l(this.yandex, 21, (byte) 0);
    }
}
