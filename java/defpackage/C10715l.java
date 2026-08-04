package defpackage;

/* JADX INFO: renamed from: lَۦۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10715l {
    public int loadAd = 1;
    public C4451l yandex;

    public final void yandex() {
        InterfaceC6474l interfaceC6474l;
        if (this.loadAd == 1) {
            AbstractC14825l.crashlytics("ToolbarRequester is not initialized.");
        }
        C4451l c4451l = this.yandex;
        if (c4451l == null || !c4451l.f29462l) {
            return;
        }
        C7504l c7504l = c4451l.f9058l;
        if ((c7504l == null || !c7504l.mopub()) && (interfaceC6474l = (InterfaceC6474l) AbstractC13402l.loadAd(c4451l, AbstractC8574l.loadAd)) != null) {
            c4451l.f9058l = AbstractC10999l.mopub(c4451l.m3914l(), null, 4, new C0932l(c4451l, interfaceC6474l, null, 2), 1);
        }
    }
}
