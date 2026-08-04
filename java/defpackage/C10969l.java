package defpackage;

/* JADX INFO: renamed from: lُُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10969l implements InterfaceC9576l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object f22102l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f22103l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile C14785l f22104l;

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        Object obj = this.f22103l;
        if (obj != f22102l) {
            return obj;
        }
        C14785l c14785l = this.f22104l;
        if (c14785l == null) {
            return this.f22103l;
        }
        Object obj2 = c14785l.get();
        this.f22103l = obj2;
        this.f22104l = null;
        return obj2;
    }
}
