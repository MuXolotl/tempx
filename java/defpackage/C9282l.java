package defpackage;

/* JADX INFO: renamed from: lٍؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9282l extends AbstractC5103l {
    public final C4983l ads;
    public final InterfaceC3177l subscription;

    public C9282l(C4983l c4983l, InterfaceC3177l interfaceC3177l) {
        this.ads = c4983l;
        this.subscription = interfaceC3177l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9282l)) {
            return false;
        }
        C9282l c9282l = (C9282l) obj;
        return AbstractC8576l.yandex(this.ads, c9282l.ads) && AbstractC8576l.yandex(this.subscription, c9282l.subscription);
    }

    public final int hashCode() {
        int iHashCode = this.ads.hashCode() * 31;
        InterfaceC3177l interfaceC3177l = this.subscription;
        return iHashCode + (interfaceC3177l == null ? 0 : interfaceC3177l.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.ads + ", owner=" + this.subscription + ')';
    }
}
