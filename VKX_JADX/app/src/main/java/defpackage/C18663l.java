package defpackage;

/* JADX INFO: renamed from: lۣ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18663l implements InterfaceC12493l {
    public final InterfaceC12493l crashlytics;
    public final String loadAd;

    public C18663l(String str, InterfaceC12493l interfaceC12493l) {
        this.loadAd = str;
        this.crashlytics = interfaceC12493l;
    }

    @Override // defpackage.InterfaceC12493l
    public final String getName() {
        return this.loadAd;
    }

    public final String toString() {
        InterfaceC12493l interfaceC12493l = this.crashlytics;
        String str = this.loadAd;
        if (interfaceC12493l == null) {
            return str;
        }
        return interfaceC12493l + "." + str;
    }
}
