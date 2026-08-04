package defpackage;

/* JADX INFO: renamed from: lًؚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7135l extends C13069l {
    public static final C7135l loadAd = new C7135l();

    @Override // defpackage.C13069l
    public final void yandex(InterfaceC0048l interfaceC0048l, C9598l c9598l) {
        super.yandex(interfaceC0048l, c9598l);
        if (!(interfaceC0048l instanceof C14180l)) {
            C8339l.metrica("config is not ImageCaptureConfig");
            return;
        }
        C10685l c10685l = new C10685l(3);
        AbstractC5941l.m1896l(c10685l, (C14180l) interfaceC0048l);
        c9598l.license(c10685l.m2952for());
    }
}
