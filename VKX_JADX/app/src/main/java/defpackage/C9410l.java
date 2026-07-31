package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lًٍۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9410l implements InterfaceC0930l {
    public InterfaceC16983l amazon;
    public final C5342l crashlytics;
    public final C14338l loadAd;
    public final C17295l yandex;

    public C9410l(C17295l c17295l, C14338l c14338l, C5342l c5342l) {
        this.yandex = c17295l;
        this.loadAd = c14338l;
        this.crashlytics = c5342l;
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.amazon = interfaceC16983l;
        if (interfaceC16983l != null) {
            C5342l c5342l = this.crashlytics;
            C17295l c17295l = this.yandex;
            c5342l.loadAd(c17295l);
            c5342l.yandex(c17295l, this.loadAd.amazon);
            c17295l.yandex(interfaceC16983l, false);
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        C17295l c17295l = this.yandex;
        synchronized (c17295l.f33566l) {
            try {
                C9426l c9426l = c17295l.f33569l;
                if (c9426l != null) {
                    c17295l.f33569l = null;
                    c9426l.m2649l(new C6711l("The camera control has became inactive."));
                }
                C9426l c9426l2 = c17295l.f33568l;
                if (c9426l2 != null) {
                    c17295l.f33568l = null;
                    c9426l2.m2649l(new C6711l("The camera control has became inactive."));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crashlytics.loadAd(this.yandex);
    }
}
