package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؓؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1637l extends AbstractC6005l implements List, Collection, InterfaceC5461l, InterfaceC4742l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2582l f3967l = new C2582l(6);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC18082l f3968l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f3969l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f3970l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object[] f3971l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3972l;

    public C1637l(AbstractC18082l abstractC18082l, Object[] objArr, Object[] objArr2, int i) {
        this.f3969l = i;
        this.f3968l = abstractC18082l;
        this.f3971l = objArr;
        this.f3970l = objArr2;
        this.f3972l = abstractC18082l.pro();
    }

    public static void isVip(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        AbstractC4603l.loadAd(i, pro());
        ((AbstractList) this).modCount++;
        int iM982static = m982static();
        if (i >= iM982static) {
            return m977interface(this.f3971l, iM982static, this.f3969l, i - iM982static);
        }
        C14461l c14461l = new C14461l(this.f3970l[0]);
        m977interface(m969class(this.f3971l, this.f3969l, i, c14461l), iM982static, this.f3969l, 0);
        return c14461l.f28328l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC4603l.crashlytics(i, pro());
        if (i == pro()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM982static = m982static();
        if (i >= iM982static) {
            appmetrica(i - iM982static, obj, this.f3971l);
        } else {
            C14461l c14461l = new C14461l(null);
            appmetrica(0, c14461l.f28328l, premium(this.f3971l, this.f3969l, i, obj, c14461l));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM983strictfp;
        AbstractC4603l.crashlytics(i, this.f3972l);
        if (i == this.f3972l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f3972l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f3970l;
            Object[] objArrM980package = m980package(objArr);
            System.arraycopy(objArr, i3, objArrM980package, size2 + 1, m984super() - i3);
            isVip(objArrM980package, i3, collection.iterator());
            m979new(objArrM980package);
            this.f3972l = collection.size() + this.f3972l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM984super = m984super();
        int size3 = collection.size() + this.f3972l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m982static()) {
            objArrM983strictfp = m983strictfp();
            collection2 = collection;
            m976goto(collection2, i, this.f3970l, iM984super, objArr2, size, objArrM983strictfp);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f3970l;
            if (size3 > iM984super) {
                int i4 = size3 - iM984super;
                Object[] objArrM986synchronized = m986synchronized(i4, objArr3);
                applovin(collection2, i, i4, objArr2, size, objArrM986synchronized);
                objArr2 = objArr2;
                objArrM983strictfp = objArrM986synchronized;
            } else {
                objArrM983strictfp = m983strictfp();
                int i5 = iM984super - size3;
                System.arraycopy(objArr3, i5, objArrM983strictfp, 0, iM984super - i5);
                int i6 = 32 - i5;
                Object[] objArrM986synchronized2 = m986synchronized(i6, this.f3970l);
                int i7 = size - 1;
                objArr2[i7] = objArrM986synchronized2;
                applovin(collection2, i, i6, objArr2, i7, objArrM986synchronized2);
                collection2 = collection2;
            }
        }
        m974final(m987throw(this.f3971l, i2, objArr2));
        m979new(objArrM983strictfp);
        this.f3972l = collection2.size() + this.f3972l;
        return true;
    }

    public final AbstractC18082l advert() {
        AbstractC18082l c17229l = this.f3968l;
        if (c17229l == null) {
            Object[] objArr = this.f3971l;
            Object[] objArr2 = this.f3970l;
            this.f3967l = new C2582l(6);
            if (objArr == null) {
                c17229l = objArr2.length == 0 ? C11507l.f23131l : new C11507l(Arrays.copyOf(objArr2, this.f3972l));
            } else {
                c17229l = new C17229l(objArr, objArr2, this.f3972l, this.f3969l);
            }
            this.f3968l = c17229l;
        }
        return c17229l;
    }

    public final void applovin(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f3971l == null) {
            C8339l.smaato("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        AbstractC16594l abstractC16594lM988throws = m988throws(m982static() >> 5);
        int i5 = i3;
        Object[] objArrM986synchronized = objArr2;
        while (abstractC16594lM988throws.f32567l - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC16594lM988throws.previous();
            AbstractC8669l.pro(0, 32 - i2, 32, objArr3, objArrM986synchronized);
            objArrM986synchronized = m986synchronized(i2, objArr3);
            i5--;
            objArr[i5] = objArrM986synchronized;
        }
        Object[] objArr4 = (Object[]) abstractC16594lM988throws.previous();
        int iM982static = i3 - (((m982static() >> 5) - 1) - i4);
        if (iM982static < i3) {
            objArr2 = objArr[iM982static];
        }
        m976goto(collection, i, objArr4, 32, objArr, iM982static, objArr2);
    }

    public final void appmetrica(int i, Object obj, Object[] objArr) {
        int iM984super = m984super();
        Object[] objArrM980package = m980package(this.f3970l);
        Object[] objArr2 = this.f3970l;
        if (iM984super >= 32) {
            Object obj2 = objArr2[31];
            AbstractC8669l.pro(i + 1, i, 31, objArr2, objArrM980package);
            objArrM980package[i] = obj;
            m968catch(objArr, objArrM980package, m989volatile(obj2));
            return;
        }
        AbstractC8669l.pro(i + 1, i, iM984super, objArr2, objArrM980package);
        objArrM980package[i] = obj;
        m974final(objArr);
        m979new(objArrM980package);
        this.f3972l++;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final int m967case(C1195l c1195l, Object[] objArr, int i, int i2, C14461l c14461l, ArrayList arrayList, ArrayList arrayList2) {
        if (inmobi(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c14461l.f28328l;
        Object[] objArrM983strictfp = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) c1195l.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrM983strictfp = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m983strictfp();
                    i2 = 0;
                }
                objArrM983strictfp[i2] = obj;
                i2++;
            }
        }
        c14461l.f28328l = objArrM983strictfp;
        if (objArr2 != objArrM983strictfp) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m968catch(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f3972l >> 5;
        int i2 = this.f3969l;
        if (i > (1 << i2)) {
            m974final(m972else(this.f3969l + 5, m989volatile(objArr), objArr2));
            m979new(objArr3);
            this.f3969l += 5;
            this.f3972l++;
            return;
        }
        if (objArr == null) {
            m974final(objArr2);
            m979new(objArr3);
            this.f3972l++;
        } else {
            m974final(m972else(i2, objArr, objArr2));
            m979new(objArr3);
            this.f3972l++;
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final Object[] m969class(Object[] objArr, int i, int i2, C14461l c14461l) {
        int iPurchase = AbstractC7310l.purchase(i2, i);
        if (i == 0) {
            Object obj = objArr[iPurchase];
            Object[] objArrM980package = m980package(objArr);
            int i3 = iPurchase + 1;
            System.arraycopy(objArr, i3, objArrM980package, iPurchase, 32 - i3);
            objArrM980package[31] = c14461l.f28328l;
            c14461l.f28328l = obj;
            return objArrM980package;
        }
        int iPurchase2 = objArr[31] == null ? AbstractC7310l.purchase(m982static() - 1, i) : 31;
        Object[] objArrM980package2 = m980package(objArr);
        int i4 = i - 5;
        int i5 = iPurchase + 1;
        if (i5 <= iPurchase2) {
            while (true) {
                objArrM980package2[iPurchase2] = m969class((Object[]) objArrM980package2[iPurchase2], i4, 0, c14461l);
                if (iPurchase2 == i5) {
                    break;
                }
                iPurchase2--;
            }
        }
        objArrM980package2[iPurchase] = m969class((Object[]) objArrM980package2[iPurchase], i4, i2, c14461l);
        return objArrM980package2;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final int m970continue(C1195l c1195l, int i, C14461l c14461l) {
        int iM985switch = m985switch(c1195l, this.f3970l, i, c14461l);
        Object obj = c14461l.f28328l;
        if (iM985switch == i) {
            return i;
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM985switch, i, (Object) null);
        m979new(objArr);
        this.f3972l -= i - iM985switch;
        return iM985switch;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final Object[] m971default(Object[] objArr, int i, int i2, Object obj, C14461l c14461l) {
        int iPurchase = AbstractC7310l.purchase(i2, i);
        Object[] objArrM980package = m980package(objArr);
        if (i != 0) {
            objArrM980package[iPurchase] = m971default((Object[]) objArrM980package[iPurchase], i - 5, i2, obj, c14461l);
            return objArrM980package;
        }
        if (objArrM980package != objArr) {
            ((AbstractList) this).modCount++;
        }
        c14461l.f28328l = objArrM980package[iPurchase];
        objArrM980package[iPurchase] = obj;
        return objArrM980package;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final Object[] m972else(int i, Object[] objArr, Object[] objArr2) {
        int iPurchase = AbstractC7310l.purchase(pro() - 1, i);
        Object[] objArrM980package = m980package(objArr);
        if (i == 5) {
            objArrM980package[iPurchase] = objArr2;
            return objArrM980package;
        }
        objArrM980package[iPurchase] = m972else(i - 5, (Object[]) objArrM980package[iPurchase], objArr2);
        return objArrM980package;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m973extends(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            m974final(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            m979new(objArr);
            this.f3972l = i;
            this.f3969l = i2;
            return;
        }
        C14461l c14461l = new C14461l(null);
        Object[] objArrM981private = m981private(objArr, i2, i, c14461l);
        m979new((Object[]) c14461l.f28328l);
        this.f3972l = i;
        if (objArrM981private[1] == null) {
            m974final((Object[]) objArrM981private[0]);
            this.f3969l = i2 - 5;
        } else {
            m974final(objArrM981private);
            this.f3969l = i2;
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m974final(Object[] objArr) {
        if (objArr != this.f3971l) {
            this.f3968l = null;
            this.f3971l = objArr;
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final Object[] m975for(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            C8339l.smaato("Check failed.");
            return null;
        }
        if (i2 < 0) {
            C8339l.smaato("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM980package = m980package(objArr);
        int iPurchase = AbstractC7310l.purchase(i, i2);
        int i3 = i2 - 5;
        objArrM980package[iPurchase] = m975for((Object[]) objArrM980package[iPurchase], i, i3, it);
        while (true) {
            iPurchase++;
            if (iPurchase >= 32 || !it.hasNext()) {
                break;
            }
            objArrM980package[iPurchase] = m975for((Object[]) objArrM980package[iPurchase], 0, i3, it);
        }
        return objArrM980package;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC4603l.loadAd(i, pro());
        if (m982static() <= i) {
            objArr = this.f3970l;
        } else {
            Object[] objArr2 = this.f3971l;
            for (int i2 = this.f3969l; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[AbstractC7310l.purchase(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m976goto(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM983strictfp;
        if (i3 < 1) {
            C8339l.smaato("Check failed.");
            return;
        }
        Object[] objArrM980package = m980package(objArr);
        objArr2[0] = objArrM980package;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC8669l.pro(size + 1, i4, i2, objArrM980package, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM983strictfp = objArrM980package;
            } else {
                objArrM983strictfp = m983strictfp();
                i3--;
                objArr2[i3] = objArrM983strictfp;
            }
            int i7 = i2 - i6;
            AbstractC8669l.pro(0, i7, i2, objArrM980package, objArr3);
            AbstractC8669l.pro(size + 1, i4, i7, objArrM980package, objArrM983strictfp);
            objArr3 = objArrM983strictfp;
        }
        Iterator it = collection.iterator();
        isVip(objArrM980package, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM983strictfp2 = m983strictfp();
            isVip(objArrM983strictfp2, 0, it);
            objArr2[i8] = objArrM983strictfp2;
        }
        isVip(objArr3, 0, it);
    }

    public final boolean inmobi(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3967l;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final Object m977interface(Object[] objArr, int i, int i2, int i3) {
        int iPro = pro() - i;
        Object[] objArr2 = this.f3970l;
        if (iPro == 1) {
            Object obj = objArr2[0];
            m973extends(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM980package = m980package(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM980package, i3, iPro - i4);
        objArrM980package[iPro - 1] = null;
        m974final(objArr);
        m979new(objArrM980package);
        this.f3972l = (i + iPro) - 1;
        this.f3969l = i2;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC4603l.crashlytics(i, this.f3972l);
        return new C6825l(this, i);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final Object[] m978native(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            C8339l.smaato("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iPurchase = AbstractC7310l.purchase(i, i2);
        Object objM978native = m978native(i, i2 - 5, (Object[]) objArr[iPurchase]);
        if (iPurchase < 31) {
            int i3 = iPurchase + 1;
            if (objArr[i3] != null) {
                if (inmobi(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM983strictfp = m983strictfp();
                System.arraycopy(objArr, 0, objArrM983strictfp, 0, i3);
                objArr = objArrM983strictfp;
            }
        }
        if (objM978native == objArr[iPurchase]) {
            return objArr;
        }
        Object[] objArrM980package = m980package(objArr);
        objArrM980package[iPurchase] = objM978native;
        return objArrM980package;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m979new(Object[] objArr) {
        if (objArr != this.f3970l) {
            this.f3968l = null;
            this.f3970l = objArr;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Object[] m980package(Object[] objArr) {
        if (objArr == null) {
            return m983strictfp();
        }
        if (inmobi(objArr)) {
            return objArr;
        }
        Object[] objArrM983strictfp = m983strictfp();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC8669l.signatures(0, length, 6, objArr, objArrM983strictfp);
        return objArrM983strictfp;
    }

    public final Object[] premium(Object[] objArr, int i, int i2, Object obj, C14461l c14461l) {
        Object obj2;
        int iPurchase = AbstractC7310l.purchase(i2, i);
        if (i == 0) {
            c14461l.f28328l = objArr[31];
            Object[] objArrM980package = m980package(objArr);
            System.arraycopy(objArr, iPurchase, objArrM980package, iPurchase + 1, 31 - iPurchase);
            objArrM980package[iPurchase] = obj;
            return objArrM980package;
        }
        Object[] objArrM980package2 = m980package(objArr);
        int i3 = i - 5;
        objArrM980package2[iPurchase] = premium((Object[]) objArrM980package2[iPurchase], i3, i2, obj, c14461l);
        while (true) {
            iPurchase++;
            if (iPurchase >= 32 || (obj2 = objArrM980package2[iPurchase]) == null) {
                break;
            }
            objArrM980package2[iPurchase] = premium((Object[]) obj2, i3, 0, c14461l.f28328l, c14461l);
        }
        return objArrM980package2;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Object[] m981private(Object[] objArr, int i, int i2, C14461l c14461l) {
        Object[] objArrM981private;
        int iPurchase = AbstractC7310l.purchase(i2 - 1, i);
        if (i == 5) {
            c14461l.f28328l = objArr[iPurchase];
            objArrM981private = null;
        } else {
            objArrM981private = m981private((Object[]) objArr[iPurchase], i - 5, i2, c14461l);
        }
        if (objArrM981private == null && iPurchase == 0) {
            return null;
        }
        Object[] objArrM980package = m980package(objArr);
        objArrM980package[iPurchase] = objArrM981private;
        return objArrM980package;
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        return this.f3972l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        C1637l c1637l;
        int i;
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        C1195l c1195l = new C1195l(1, collection);
        int iM984super = m984super();
        Object[] objArrM978native = null;
        C14461l c14461l = new C14461l(null);
        if (this.f3971l != null) {
            AbstractC16594l abstractC16594lM988throws = m988throws(0);
            int iM985switch = 32;
            while (iM985switch == 32 && abstractC16594lM988throws.hasNext()) {
                iM985switch = m985switch(c1195l, (Object[]) abstractC16594lM988throws.next(), 32, c14461l);
            }
            if (iM985switch == 32) {
                int iM970continue = m970continue(c1195l, iM984super, c14461l);
                if (iM970continue == 0) {
                    m973extends(this.f3972l, this.f3969l, this.f3971l);
                }
                if (iM970continue != iM984super) {
                    c1637l = this;
                } else {
                    c1637l = this;
                }
            } else {
                int i2 = (abstractC16594lM988throws.f32567l - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM967case = iM985switch;
                while (abstractC16594lM988throws.hasNext()) {
                    iM967case = m967case(c1195l, (Object[]) abstractC16594lM988throws.next(), 32, iM967case, c14461l, arrayList2, arrayList);
                }
                c1637l = this;
                int iM967case2 = c1637l.m967case(c1195l, c1637l.f3970l, iM984super, iM967case, c14461l, arrayList2, arrayList);
                Object[] objArr = (Object[]) c14461l.f28328l;
                Arrays.fill(objArr, iM967case2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM975for = c1637l.f3971l;
                if (!zIsEmpty) {
                    objArrM975for = c1637l.m975for(objArrM975for, i2, c1637l.f3969l, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C8339l.smaato("Check failed.");
                    return false;
                }
                if (size == 0) {
                    c1637l.f3969l = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = c1637l.f3969l;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        c1637l.f3969l = i - 5;
                        objArrM975for = objArrM975for[0];
                    }
                    objArrM978native = c1637l.m978native(i3, i, objArrM975for);
                }
                c1637l.m974final(objArrM978native);
                c1637l.m979new(objArr);
                c1637l.f3972l = size + iM967case2;
            }
            z = true;
        } else if (m970continue(c1195l, iM984super, c14461l) != iM984super) {
            c1637l = this;
            z = true;
        } else {
            c1637l = this;
        }
        if (z) {
            ((AbstractList) c1637l).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC4603l.loadAd(i, pro());
        if (m982static() > i) {
            C14461l c14461l = new C14461l(null);
            m974final(m971default(this.f3971l, this.f3969l, i, obj, c14461l));
            return c14461l.f28328l;
        }
        Object[] objArrM980package = m980package(this.f3970l);
        if (objArrM980package != this.f3970l) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM980package[i2];
        objArrM980package[i2] = obj;
        m979new(objArrM980package);
        return obj2;
    }

    public final int signatures() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final int m982static() {
        int i = this.f3972l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Object[] m983strictfp() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3967l;
        return objArr;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final int m984super() {
        int i = this.f3972l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final int m985switch(C1195l c1195l, Object[] objArr, int i, C14461l c14461l) {
        Object[] objArrM980package = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) c1195l.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM980package = m980package(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM980package[i2] = obj;
                i2++;
            }
        }
        c14461l.f28328l = objArrM980package;
        return i2;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final Object[] m986synchronized(int i, Object[] objArr) {
        if (inmobi(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM983strictfp = m983strictfp();
        System.arraycopy(objArr, 0, objArrM983strictfp, i, 32 - i);
        return objArrM983strictfp;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final Object[] m987throw(Object[] objArr, int i, Object[][] objArr2) {
        C11521l c11521l = new C11521l(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.f3969l;
        Object[] objArrM975for = i2 < (1 << i3) ? m975for(objArr, i, i3, c11521l) : m980package(objArr);
        while (c11521l.hasNext()) {
            this.f3969l += 5;
            objArrM975for = m989volatile(objArrM975for);
            int i4 = this.f3969l;
            m975for(objArrM975for, 1 << i4, i4, c11521l);
        }
        return objArrM975for;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final AbstractC16594l m988throws(int i) {
        if (this.f3971l == null) {
            C8339l.smaato("Required value was null.");
            return null;
        }
        int iM982static = m982static() >> 5;
        AbstractC4603l.crashlytics(i, iM982static);
        int i2 = this.f3969l;
        Object[] objArr = this.f3971l;
        return i2 == 0 ? new C7134l(i, objArr) : new C3358l(objArr, i, iM982static, i2 / 5);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Object[] m989volatile(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3967l;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM984super = m984super();
        if (iM984super < 32) {
            Object[] objArrM980package = m980package(this.f3970l);
            objArrM980package[iM984super] = obj;
            m979new(objArrM980package);
            this.f3972l = pro() + 1;
        } else {
            m968catch(this.f3971l, this.f3970l, m989volatile(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM984super = m984super();
        Iterator it = collection.iterator();
        if (32 - iM984super >= collection.size()) {
            Object[] objArrM980package = m980package(this.f3970l);
            isVip(objArrM980package, iM984super, it);
            m979new(objArrM980package);
            this.f3972l = collection.size() + this.f3972l;
            return true;
        }
        int size = ((collection.size() + iM984super) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM980package2 = m980package(this.f3970l);
        isVip(objArrM980package2, iM984super, it);
        objArr[0] = objArrM980package2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM983strictfp = m983strictfp();
            isVip(objArrM983strictfp, 0, it);
            objArr[i] = objArrM983strictfp;
        }
        m974final(m987throw(this.f3971l, m982static(), objArr));
        Object[] objArrM983strictfp2 = m983strictfp();
        isVip(objArrM983strictfp2, 0, it);
        m979new(objArrM983strictfp2);
        this.f3972l = collection.size() + this.f3972l;
        return true;
    }
}
