package defpackage;

/* JADX INFO: renamed from: lؙُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6527l extends C14136l implements InterfaceC16383l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13605l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C4720l f13606l;

    public C6527l(C4720l c4720l, Object obj, Object obj2) {
        super(obj, obj2, 0);
        this.f13606l = c4720l;
        this.f13605l = obj2;
    }

    @Override // defpackage.C14136l, java.util.Map.Entry
    public final Object getValue() {
        return this.f13605l;
    }

    @Override // defpackage.C14136l, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f13605l;
        this.f13605l = obj;
        C9468l c9468l = (C9468l) this.f13606l.f9580l;
        C0046l c0046l = c9468l.f19354l;
        Object obj3 = this.f27630l;
        if (!c0046l.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c9468l.f15113l;
        if (!z) {
            c0046l.put(obj3, obj);
        } else {
            if (!z) {
                C4875l.firebase();
                return null;
            }
            AbstractC15674l abstractC15674l = c9468l.f15115l[c9468l.f15114l];
            Object obj4 = abstractC15674l.f30650l[abstractC15674l.f30648l];
            c0046l.put(obj3, obj);
            c9468l.amazon(obj4 != null ? obj4.hashCode() : 0, c0046l.f908l, obj4, 0);
        }
        c9468l.f19352l = c0046l.f911l;
        return obj2;
    }
}
