package defpackage;

/* JADX INFO: renamed from: lؒؐۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0759l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2282l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2283l;

    public /* synthetic */ C0759l(int i, Object obj) {
        this.f2283l = i;
        this.f2282l = obj;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int i = this.f2283l;
        Object obj = this.f2282l;
        switch (i) {
            case 0:
                try {
                    return (InterfaceC11445l) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    C11983l.ads(e);
                    return null;
                }
            case 1:
                return (C7865l) obj;
            case 2:
                return (C1298l) obj;
            default:
                return (C15291l) obj;
        }
    }
}
