package defpackage;

/* JADX INFO: renamed from: lٌؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4955l extends C13637l {
    public final C8688l remoteconfig;
    public final C2374l smaato;

    public C4955l(String str, int i) {
        super(str, null, i);
        this.smaato = C2374l.amazon;
        this.remoteconfig = new C8688l(new C18695l(i, str, this, 1));
    }

    @Override // defpackage.C13637l, defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return this.smaato;
    }

    @Override // defpackage.C13637l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC18035l)) {
            return false;
        }
        InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
        return interfaceC18035l.billing() == C2374l.amazon && this.yandex.equals(interfaceC18035l.yandex()) && AbstractC8576l.yandex(AbstractC16164l.crashlytics(this), AbstractC16164l.crashlytics(interfaceC18035l));
    }

    @Override // defpackage.C13637l
    public final int hashCode() {
        int iHashCode = this.yandex.hashCode();
        C11521l c11521l = new C11521l(this);
        int iHashCode2 = 1;
        while (c11521l.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c11521l.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.C13637l, defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        return ((InterfaceC18035l[]) this.remoteconfig.getValue())[i];
    }

    @Override // defpackage.C13637l
    public final String toString() {
        return AbstractC16901l.m4210case(new C14297l(3, this), ", ", this.yandex.concat("("), ")", null, 56);
    }
}
