package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lًْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4853l extends AbstractC2837l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ int f9907l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f9908l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f9909l;

    public C4853l(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (defpackage.AbstractC9464l.amazon(r2).add(r7) == false) goto L26;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean add(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f9908l
            r1 = 1
            if (r0 != 0) goto L8
            r6.f9909l = r7
            goto L66
        L8:
            java.lang.Object r2 = r6.f9909l
            r3 = 0
            if (r0 != r1) goto L20
            boolean r0 = defpackage.AbstractC8576l.yandex(r2, r7)
            if (r0 == 0) goto L14
            goto L65
        L14:
            java.lang.Object r0 = r6.f9909l
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            r2[r1] = r7
            r6.f9909l = r2
            goto L66
        L20:
            r4 = 5
            if (r0 >= r4) goto L5b
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            boolean r0 = defpackage.AbstractC8669l.subscription(r7, r2)
            if (r0 == 0) goto L2c
            goto L65
        L2c:
            int r0 = r6.f9908l
            r4 = 4
            if (r0 != r4) goto L4f
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r4 = r0.length
            int r4 = defpackage.AbstractC2200l.firebase(r4)
            r2.<init>(r4)
            int r4 = r0.length
        L41:
            if (r3 >= r4) goto L4b
            r5 = r0[r3]
            r2.add(r5)
            int r3 = r3 + 1
            goto L41
        L4b:
            r2.add(r7)
            goto L58
        L4f:
            int r0 = r0 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r2.length
            int r0 = r0 - r1
            r2[r0] = r7
        L58:
            r6.f9909l = r2
            goto L66
        L5b:
            java.util.Set r0 = defpackage.AbstractC9464l.amazon(r2)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L66
        L65:
            return r3
        L66:
            int r7 = r6.f9908l
            int r7 = r7 + r1
            r6.f9908l = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4853l.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9909l = null;
        this.f9908l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (pro() == 0) {
            return false;
        }
        if (pro() == 1) {
            return AbstractC8576l.yandex(this.f9909l, obj);
        }
        int iPro = pro();
        Object obj2 = this.f9909l;
        return iPro < 5 ? AbstractC8669l.subscription(obj, (Object[]) obj2) : ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f9908l;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.f9909l;
        if (i == 1) {
            return new C18568l(1, obj);
        }
        return i < 5 ? new C4720l((Object[]) obj) : AbstractC9464l.amazon(obj).iterator();
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        return this.f9908l;
    }
}
