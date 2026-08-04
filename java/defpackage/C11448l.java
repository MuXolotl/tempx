package defpackage;

/* JADX INFO: renamed from: lُۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11448l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C0120l f23035l = new C0120l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f23036l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile InterfaceC11766l f23037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f23038l = new Object();

    public C11448l(InterfaceC11766l interfaceC11766l) {
        interfaceC11766l.getClass();
        this.f23037l = interfaceC11766l;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        InterfaceC11766l interfaceC11766l = this.f23037l;
        C0120l c0120l = f23035l;
        if (interfaceC11766l != c0120l) {
            synchronized (this.f23038l) {
                try {
                    if (this.f23037l != c0120l) {
                        Object obj = this.f23037l.get();
                        this.f23036l = obj;
                        this.f23037l = c0120l;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f23036l;
    }

    public final String toString() {
        Object obj = this.f23037l;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f23035l) {
            obj = "<supplier that returned " + this.f23036l + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
