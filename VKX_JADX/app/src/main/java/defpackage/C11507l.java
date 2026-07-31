package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lُۧٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11507l extends AbstractC18082l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C11507l f23131l = new C11507l(new Object[0]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f23132l;

    public C11507l(Object[] objArr) {
        this.f23132l = objArr;
    }

    @Override // defpackage.AbstractC18082l
    public final AbstractC18082l ad(Object obj) {
        Object[] objArr = this.f23132l;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new C11507l(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C17229l(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.AbstractC18082l
    public final AbstractC18082l advert(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.f23132l;
        if (collection.size() + objArr.length > 32) {
            C1637l c1637lIsVip = isVip();
            c1637lIsVip.addAll(collection);
            return c1637lIsVip.advert();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C11507l(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f23132l;
        AbstractC4603l.loadAd(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC8669l.m2398catch(obj, this.f23132l);
    }

    @Override // defpackage.AbstractC18082l
    public final C1637l isVip() {
        return new C1637l(this, null, this.f23132l, 0);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC8669l.m2399class(obj, this.f23132l);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f23132l;
        AbstractC4603l.crashlytics(i, objArr.length);
        return new C7134l(i, objArr.length, objArr);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f23132l.length;
    }

    @Override // defpackage.AbstractC18082l
    public final AbstractC18082l signatures(int i) {
        Object[] objArr = this.f23132l;
        AbstractC4603l.loadAd(i, objArr.length);
        if (objArr.length == 1) {
            return f23131l;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC8669l.pro(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new C11507l(objArrCopyOf);
    }
}
