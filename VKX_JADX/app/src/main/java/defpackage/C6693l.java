package defpackage;

/* JADX INFO: renamed from: lٍؙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6693l implements InterfaceC9576l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object f14042l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f14043l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile InterfaceC9576l f14044l;

    public static InterfaceC9576l yandex(InterfaceC9576l interfaceC9576l) {
        if (interfaceC9576l instanceof C6693l) {
            return interfaceC9576l;
        }
        C6693l c6693l = new C6693l();
        c6693l.f14043l = f14042l;
        c6693l.f14044l = interfaceC9576l;
        return c6693l;
    }

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        Object obj;
        Object obj2 = this.f14043l;
        Object obj3 = f14042l;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f14043l;
            if (obj == obj3) {
                obj = this.f14044l.get();
                Object obj4 = this.f14043l;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f14043l = obj;
                this.f14044l = null;
            }
        }
        return obj;
    }
}
