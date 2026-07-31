package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17726l {
    public final Object crashlytics;
    public final /* synthetic */ int yandex = 0;
    public final C18474l loadAd = AbstractC1805l.yandex(false);

    public C17726l(C13904l c13904l) {
        this.crashlytics = c13904l;
    }

    public final boolean loadAd() {
        InterfaceC14029l interfaceC14029l = null;
        switch (this.yandex) {
            case 0:
                if (!this.loadAd.yandex()) {
                    return false;
                }
                ((InterfaceC1601l) this.crashlytics).billing(null);
                return true;
            default:
                if (!this.loadAd.yandex()) {
                    return false;
                }
                C13904l c13904l = (C13904l) this.crashlytics;
                synchronized (c13904l.f27204l) {
                    try {
                        int i = c13904l.f27201l - 1;
                        c13904l.f27201l = i;
                        if (i == 0 && !c13904l.f27199l) {
                            c13904l.f27200l = AbstractC10999l.mopub((InterfaceC2262l) c13904l.f27203l, null, 0, new C11671l(c13904l, interfaceC14029l, 16), 3);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
        }
    }

    public final boolean yandex() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.loadAd();
    }

    public C17726l(InterfaceC1601l interfaceC1601l) {
        this.crashlytics = interfaceC1601l;
    }
}
