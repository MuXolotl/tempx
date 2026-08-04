package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9059l extends AbstractC8909l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C9059l f18640l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final Object[] f18641l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient Object[] f18642l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient int f18643l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final transient int f18644l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final transient Object[] f18645l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final transient int f18646l;

    static {
        Object[] objArr = new Object[0];
        f18641l = objArr;
        f18640l = new C9059l(0, 0, 0, objArr, objArr);
    }

    public C9059l(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(2);
        this.f18642l = objArr;
        this.f18643l = i;
        this.f18645l = objArr2;
        this.f18644l = i2;
        this.f18646l = i3;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18645l;
            if (objArr.length != 0) {
                int iMopub = AbstractC2021l.mopub(obj.hashCode());
                while (true) {
                    int i = iMopub & this.f18644l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iMopub = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC3810l
    public final int firebase() {
        return this.f18646l;
    }

    @Override // defpackage.AbstractC8909l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18643l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0933l abstractC0933lMetrica = this.f18304l;
        if (abstractC0933lMetrica == null) {
            abstractC0933lMetrica = AbstractC0933l.metrica(this.f18646l, this.f18642l);
            this.f18304l = abstractC0933lMetrica;
        }
        return abstractC0933lMetrica.listIterator(0);
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] mopub() {
        return this.f18642l;
    }

    @Override // defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        Object[] objArr2 = this.f18642l;
        int i = this.f18646l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18646l;
    }
}
