package defpackage;

/* JADX INFO: renamed from: lٕٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15431l extends C2397l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14750l f30187l;

    public C15431l(InterfaceC14029l interfaceC14029l, C14750l c14750l) {
        super(1, interfaceC14029l);
        this.f30187l = c14750l;
    }

    @Override // defpackage.C2397l
    public final String inmobi() {
        return "AwaitContinuation";
    }

    @Override // defpackage.C2397l
    public final Throwable tapsense(C14750l c14750l) {
        Throwable thCrashlytics;
        C14750l c14750l2 = this.f30187l;
        c14750l2.getClass();
        Object obj = C14750l.f28822l.get(c14750l2);
        if (!(obj instanceof C2073l) || (thCrashlytics = ((C2073l) obj).crashlytics()) == null) {
            return obj instanceof C2175l ? ((C2175l) obj).yandex : c14750l.mo2153default();
        }
        return thCrashlytics;
    }
}
