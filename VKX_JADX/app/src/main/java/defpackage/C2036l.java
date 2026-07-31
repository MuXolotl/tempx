package defpackage;

/* JADX INFO: renamed from: lؓۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2036l implements InterfaceC2661l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object f4566l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f4567l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile InterfaceC10466l f4568l;

    public static InterfaceC2661l yandex(InterfaceC10466l interfaceC10466l) {
        if (interfaceC10466l instanceof C2036l) {
            return interfaceC10466l;
        }
        C2036l c2036l = new C2036l();
        c2036l.f4567l = f4566l;
        c2036l.f4568l = interfaceC10466l;
        return c2036l;
    }

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        Object obj;
        Object obj2 = this.f4567l;
        Object obj3 = f4566l;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f4567l;
                if (obj == obj3) {
                    obj = this.f4568l.get();
                    Object obj4 = this.f4567l;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f4567l = obj;
                    this.f4568l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
