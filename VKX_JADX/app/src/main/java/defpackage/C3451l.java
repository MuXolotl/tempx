package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٕؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3451l extends AbstractC5030l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3451l f7330l = new C3451l(new Object[0]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f7331l;

    public C3451l(Object[] objArr) {
        this.f7331l = objArr;
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l ad(int i, Object obj) {
        Object[] objArr = this.f7331l;
        AbstractC6900l.loadAd(i, objArr.length);
        if (i == objArr.length) {
            return advert(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC8669l.signatures(0, i, 6, objArr, objArr2);
            AbstractC8669l.pro(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new C3451l(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC8669l.pro(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C1036l(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l advert(Object obj) {
        Object[] objArr = this.f7331l;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new C3451l(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C1036l(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l applovin(int i) {
        Object[] objArr = this.f7331l;
        AbstractC6900l.yandex(i, objArr.length);
        if (objArr.length == 1) {
            return f7330l;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC8669l.pro(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new C3451l(objArrCopyOf);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l appmetrica(int i, Object obj) {
        Object[] objArr = this.f7331l;
        AbstractC6900l.yandex(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new C3451l(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f7331l;
        AbstractC6900l.yandex(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC8669l.m2398catch(obj, this.f7331l);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l isVip(Collection collection) {
        Object[] objArr = this.f7331l;
        if (collection.size() + objArr.length > 32) {
            C0266l c0266lSignatures = signatures();
            c0266lSignatures.addAll(collection);
            return c0266lSignatures.advert();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C3451l(objArrCopyOf);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC8669l.m2399class(obj, this.f7331l);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f7331l;
        AbstractC6900l.loadAd(i, objArr.length);
        return new C9884l(i, objArr.length, objArr);
    }

    @Override // defpackage.AbstractC5030l
    public final AbstractC5030l premium(C1195l c1195l) {
        Object[] objArr = this.f7331l;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c1195l.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f7330l : new C3451l(AbstractC8669l.m2419throws(0, length, objArrCopyOf));
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f7331l.length;
    }

    @Override // defpackage.AbstractC5030l
    public final C0266l signatures() {
        return new C0266l(this, null, this.f7331l, 0);
    }
}
