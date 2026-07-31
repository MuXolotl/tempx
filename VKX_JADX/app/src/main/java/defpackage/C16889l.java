package defpackage;

/* JADX INFO: renamed from: lْٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16889l implements InterfaceC16000l {
    public final /* synthetic */ C14138l yandex;

    public C16889l(C14138l c14138l) {
        this.yandex = c14138l;
    }

    @Override // defpackage.InterfaceC16000l
    public final void yandex(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C14138l c14138l = this.yandex;
        c14138l.f27638l.sendMessage(c14138l.f27638l.obtainMessage(1, boolValueOf));
    }
}
