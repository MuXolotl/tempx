package defpackage;

/* JADX INFO: renamed from: lُٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11231l implements InterfaceC1202l {
    public final Throwable crashlytics;
    public final C2397l loadAd;

    public C11231l(C2397l c2397l) {
        this.loadAd = c2397l;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c2397l.hashCode();
        AbstractC8576l.loadAd(16);
        Throwable th = new Throwable("WriteTask 0x".concat(Integer.toString(iHashCode, 16)));
        AbstractC11718l.mopub(th);
        this.crashlytics = th;
    }

    public final InterfaceC14029l amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC1202l
    public final Throwable crashlytics() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC1202l
    public final void loadAd() {
        InterfaceC14029l interfaceC14029lAmazon = amazon();
        InterfaceC6950l.yandex.getClass();
        ((C2397l) interfaceC14029lAmazon).subs(C7868l.crashlytics);
    }

    @Override // defpackage.InterfaceC1202l
    public final void yandex(Throwable th) {
        Object c18435l;
        InterfaceC14029l interfaceC14029lAmazon = amazon();
        if (th != null) {
            c18435l = new C18435l(th);
        } else {
            InterfaceC6950l.yandex.getClass();
            c18435l = C7868l.crashlytics;
        }
        ((C2397l) interfaceC14029lAmazon).subs(c18435l);
    }
}
