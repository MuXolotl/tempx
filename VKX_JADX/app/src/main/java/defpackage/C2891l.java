package defpackage;

/* JADX INFO: renamed from: lؔۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891l {
    public final InterfaceC3538l amazon;
    public final boolean billing;
    public final InterfaceC1519l crashlytics;
    public final InterfaceC1519l loadAd;
    public final InterfaceC7386l purchase;
    public final C16222l yandex;

    public C2891l(C16222l c16222l, InterfaceC1519l interfaceC1519l, InterfaceC1519l interfaceC1519l2, InterfaceC3538l interfaceC3538l, InterfaceC7386l interfaceC7386l, boolean z) {
        this.yandex = c16222l;
        this.loadAd = interfaceC1519l;
        this.crashlytics = interfaceC1519l2;
        this.amazon = interfaceC3538l;
        this.purchase = interfaceC7386l;
        this.billing = z;
    }

    public static C2891l yandex(C2891l c2891l, C16543l c16543l, C10975l c10975l, C7112l c7112l, int i) {
        C16222l c16222l = c2891l.yandex;
        InterfaceC1519l interfaceC1519l = c16543l;
        if ((i & 2) != 0) {
            interfaceC1519l = c2891l.loadAd;
        }
        InterfaceC1519l interfaceC1519l2 = interfaceC1519l;
        InterfaceC1519l interfaceC1519l3 = c2891l.crashlytics;
        InterfaceC3538l interfaceC3538l = c10975l;
        if ((i & 8) != 0) {
            interfaceC3538l = c2891l.amazon;
        }
        InterfaceC3538l interfaceC3538l2 = interfaceC3538l;
        InterfaceC7386l interfaceC7386l = c7112l;
        if ((i & 16) != 0) {
            interfaceC7386l = c2891l.purchase;
        }
        InterfaceC7386l interfaceC7386l2 = interfaceC7386l;
        boolean z = (i & 32) != 0 ? c2891l.billing : true;
        c2891l.getClass();
        return new C2891l(c16222l, interfaceC1519l2, interfaceC1519l3, interfaceC3538l2, interfaceC7386l2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2891l.class != obj.getClass()) {
            return false;
        }
        C2891l c2891l = (C2891l) obj;
        return AbstractC8576l.yandex(this.yandex, c2891l.yandex) && AbstractC8576l.yandex(this.loadAd, c2891l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c2891l.crashlytics) && AbstractC8576l.yandex(this.amazon, c2891l.amazon) && AbstractC8576l.yandex(this.purchase, c2891l.purchase) && this.billing == c2891l.billing;
    }

    public final int hashCode() {
        return ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.billing ? 1231 : 1237);
    }
}
