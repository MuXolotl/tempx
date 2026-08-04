package defpackage;

/* JADX INFO: renamed from: lٌؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2502l extends C17991l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f5302l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f5303l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10600l f5304l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f5305l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2502l(C10600l c10600l) {
        Object obj = c10600l.f21515l;
        C0046l c0046l = c10600l.f21517l;
        super(obj, c0046l);
        this.f5304l = c10600l;
        this.f5303l = c0046l.f911l;
    }

    @Override // defpackage.C17991l, java.util.Iterator
    public final Object next() {
        if (this.f5304l.f21517l.f911l != this.f5303l) {
            C8339l.mopub();
            return null;
        }
        Object next = super.next();
        this.f5305l = next;
        this.f5302l = true;
        return next;
    }

    @Override // defpackage.C17991l, java.util.Iterator
    public final void remove() {
        if (!this.f5302l) {
            C18073l.admob();
            return;
        }
        Object obj = this.f5305l;
        C10600l c10600l = this.f5304l;
        AbstractC9464l.yandex(c10600l).remove(obj);
        this.f5305l = null;
        this.f5302l = false;
        this.f5303l = c10600l.f21517l.f911l;
        this.f35177l--;
    }
}
