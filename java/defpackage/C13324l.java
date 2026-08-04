package defpackage;

/* JADX INFO: renamed from: lّْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13324l implements InterfaceC8364l {
    public final /* synthetic */ C2397l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13324l(C2397l c2397l, int i) {
        this.yandex = i;
        this.loadAd = c2397l;
    }

    @Override // defpackage.InterfaceC8364l
    public final void onResult(Object obj) {
        int i = this.yandex;
        C2397l c2397l = this.loadAd;
        switch (i) {
            case 0:
                if (!c2397l.premium()) {
                    c2397l.subs(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!c2397l.premium()) {
                    c2397l.subs(new C18435l(th));
                }
                break;
        }
    }
}
