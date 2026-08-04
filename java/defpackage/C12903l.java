package defpackage;

/* JADX INFO: renamed from: lِّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12903l extends AbstractC6140l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Object[] f25364l;

    public C12903l(Object[] objArr) {
        super(2);
        this.f25364l = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.AbstractC6140l, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f25364l;
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
