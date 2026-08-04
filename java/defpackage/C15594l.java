package defpackage;

/* JADX INFO: renamed from: lَٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15594l implements InterfaceC15897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object f30447l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f30448l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile InterfaceC17443l f30449l;

    public static InterfaceC15897l yandex(InterfaceC17443l interfaceC17443l) {
        if (interfaceC17443l instanceof C15594l) {
            return interfaceC17443l;
        }
        C15594l c15594l = new C15594l();
        c15594l.f30448l = f30447l;
        c15594l.f30449l = interfaceC17443l;
        return c15594l;
    }

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        Object obj;
        Object obj2 = this.f30448l;
        Object obj3 = f30447l;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f30448l;
                if (obj == obj3) {
                    obj = this.f30449l.get();
                    Object obj4 = this.f30448l;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f30448l = obj;
                    this.f30449l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
