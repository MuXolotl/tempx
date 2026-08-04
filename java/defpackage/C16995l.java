package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: lٌّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16995l extends AbstractC10033l {
    public final Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16995l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.AbstractC10033l
    public final void isPro(InterfaceC16805l interfaceC16805l) throws Exception {
        switch (this.yandex) {
            case 0:
                C7167l c7167l = new C7167l(new C12117l(interfaceC16805l, new C8250l(25, this)));
                ((C16995l) this.loadAd).isPro(c7167l);
                c7167l.flush();
                return;
            default:
                C15900l c15900l = new C15900l(new FileInputStream((File) this.crashlytics), C3446l.amazon);
                try {
                    interfaceC16805l.mo736volatile(c15900l);
                    c15900l.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(c15900l, th);
                        throw th2;
                    }
                }
        }
    }

    @Override // defpackage.AbstractC10033l
    public final C12105l loadAd() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return (C12105l) ((C16995l) obj).loadAd;
            default:
                return (C12105l) obj;
        }
    }

    @Override // defpackage.AbstractC10033l
    public final long yandex() {
        switch (this.yandex) {
            case 0:
                return ((File) ((C16995l) this.loadAd).crashlytics).length();
            default:
                return ((File) this.crashlytics).length();
        }
    }
}
