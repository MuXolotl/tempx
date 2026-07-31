package defpackage;

/* JADX INFO: renamed from: lٍْْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13252l implements InterfaceC15189l {
    public static final Object crashlytics = new Object();
    public volatile InterfaceC15189l loadAd;
    public volatile Object yandex = crashlytics;

    public C13252l(InterfaceC15189l interfaceC15189l) {
        this.loadAd = interfaceC15189l;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        Object obj;
        Object obj2 = this.yandex;
        Object obj3 = crashlytics;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.yandex;
                if (obj == obj3) {
                    obj = this.loadAd.get();
                    this.yandex = obj;
                    this.loadAd = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
