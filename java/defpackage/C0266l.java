package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0266l extends AbstractC6005l implements Collection, InterfaceC5461l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object[] f1258l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object[] f1259l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f1260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f1261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC5030l f1262l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C6760l f1263l = new C6760l(6);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f1264l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object[] f1265l;

    public C0266l(AbstractC5030l abstractC5030l, Object[] objArr, Object[] objArr2, int i) {
        this.f1262l = abstractC5030l;
        this.f1261l = objArr;
        this.f1258l = objArr2;
        this.f1264l = i;
        this.f1265l = objArr;
        this.f1259l = objArr2;
        this.f1260l = abstractC5030l.pro();
    }

    public static void isVip(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        AbstractC6900l.yandex(i, pro());
        ((AbstractList) this).modCount++;
        int iM383static = m383static();
        if (i >= iM383static) {
            return m378interface(this.f1265l, iM383static, this.f1264l, i - iM383static);
        }
        C0656l c0656l = new C0656l(this.f1259l[0]);
        m378interface(m371class(this.f1265l, this.f1264l, i, c0656l), iM383static, this.f1264l, 0);
        return c0656l.f2129l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC6900l.loadAd(i, pro());
        if (i == pro()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM383static = m383static();
        if (i >= iM383static) {
            appmetrica(i - iM383static, obj, this.f1265l);
        } else {
            C0656l c0656l = new C0656l(null);
            appmetrica(0, c0656l.f2129l, applovin(this.f1265l, this.f1264l, i, obj, c0656l));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM384strictfp;
        AbstractC6900l.loadAd(i, this.f1260l);
        if (i == this.f1260l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f1260l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f1259l;
            Object[] objArrM381package = m381package(objArr);
            System.arraycopy(objArr, i3, objArrM381package, size2 + 1, m380new() - i3);
            isVip(objArrM381package, i3, collection.iterator());
            this.f1259l = objArrM381package;
            this.f1260l = collection.size() + this.f1260l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM380new = m380new();
        int size3 = collection.size() + this.f1260l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m383static()) {
            objArrM384strictfp = m384strictfp();
            collection2 = collection;
            m376final(collection2, i, this.f1259l, iM380new, objArr2, size, objArrM384strictfp);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f1259l;
            if (size3 > iM380new) {
                int i4 = size3 - iM380new;
                Object[] objArrM386synchronized = m386synchronized(i4, objArr3);
                premium(collection2, i, i4, objArr2, size, objArrM386synchronized);
                objArr2 = objArr2;
                objArrM384strictfp = objArrM386synchronized;
            } else {
                objArrM384strictfp = m384strictfp();
                int i5 = iM380new - size3;
                System.arraycopy(objArr3, i5, objArrM384strictfp, 0, iM380new - i5);
                int i6 = 32 - i5;
                Object[] objArrM386synchronized2 = m386synchronized(i6, this.f1259l);
                int i7 = size - 1;
                objArr2[i7] = objArrM386synchronized2;
                premium(collection2, i, i6, objArr2, i7, objArrM386synchronized2);
                collection2 = collection2;
            }
        }
        this.f1265l = m387throw(this.f1265l, i2, objArr2);
        this.f1259l = objArrM384strictfp;
        this.f1260l = collection2.size() + this.f1260l;
        return true;
    }

    public final AbstractC5030l advert() {
        AbstractC5030l c1036l;
        Object[] objArr = this.f1265l;
        if (objArr == this.f1261l && this.f1259l == this.f1258l) {
            c1036l = this.f1262l;
        } else {
            this.f1263l = new C6760l(6);
            this.f1261l = objArr;
            Object[] objArr2 = this.f1259l;
            this.f1258l = objArr2;
            if (objArr == null) {
                c1036l = objArr2.length == 0 ? C3451l.f7330l : new C3451l(Arrays.copyOf(objArr2, this.f1260l));
            } else {
                c1036l = new C1036l(objArr, objArr2, this.f1260l, this.f1264l);
            }
        }
        this.f1262l = c1036l;
        return c1036l;
    }

    public final Object[] applovin(Object[] objArr, int i, int i2, Object obj, C0656l c0656l) {
        Object obj2;
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        if (i == 0) {
            c0656l.f2129l = objArr[31];
            Object[] objArrM381package = m381package(objArr);
            System.arraycopy(objArr, iCrashlytics, objArrM381package, iCrashlytics + 1, 31 - iCrashlytics);
            objArrM381package[iCrashlytics] = obj;
            return objArrM381package;
        }
        Object[] objArrM381package2 = m381package(objArr);
        int i3 = i - 5;
        objArrM381package2[iCrashlytics] = applovin((Object[]) objArrM381package2[iCrashlytics], i3, i2, obj, c0656l);
        while (true) {
            iCrashlytics++;
            if (iCrashlytics >= 32 || (obj2 = objArrM381package2[iCrashlytics]) == null) {
                break;
            }
            objArrM381package2[iCrashlytics] = applovin((Object[]) obj2, i3, 0, c0656l.f2129l, c0656l);
        }
        return objArrM381package2;
    }

    public final void appmetrica(int i, Object obj, Object[] objArr) {
        int iM380new = m380new();
        Object[] objArrM381package = m381package(this.f1259l);
        Object[] objArr2 = this.f1259l;
        if (iM380new >= 32) {
            Object obj2 = objArr2[31];
            AbstractC8669l.pro(i + 1, i, 31, objArr2, objArrM381package);
            objArrM381package[i] = obj;
            m370catch(objArr, objArrM381package, m389volatile(obj2));
            return;
        }
        AbstractC8669l.pro(i + 1, i, iM380new, objArr2, objArrM381package);
        objArrM381package[i] = obj;
        this.f1265l = objArr;
        this.f1259l = objArrM381package;
        this.f1260l++;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final int m369case(Function1 function1, Object[] objArr, int i, int i2, C0656l c0656l, ArrayList arrayList, ArrayList arrayList2) {
        if (inmobi(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c0656l.f2129l;
        Object[] objArrM384strictfp = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrM384strictfp = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m384strictfp();
                    i2 = 0;
                }
                objArrM384strictfp[i2] = obj;
                i2++;
            }
        }
        c0656l.f2129l = objArrM384strictfp;
        if (objArr2 != objArrM384strictfp) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m370catch(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f1260l;
        int i2 = i >> 5;
        int i3 = this.f1264l;
        if (i2 > (1 << i3)) {
            this.f1265l = m374else(this.f1264l + 5, m389volatile(objArr), objArr2);
            this.f1259l = objArr3;
            this.f1264l += 5;
            this.f1260l++;
            return;
        }
        if (objArr == null) {
            this.f1265l = objArr2;
            this.f1259l = objArr3;
            this.f1260l = i + 1;
        } else {
            this.f1265l = m374else(i3, objArr, objArr2);
            this.f1259l = objArr3;
            this.f1260l++;
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final Object[] m371class(Object[] objArr, int i, int i2, C0656l c0656l) {
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        if (i == 0) {
            Object obj = objArr[iCrashlytics];
            Object[] objArrM381package = m381package(objArr);
            int i3 = iCrashlytics + 1;
            System.arraycopy(objArr, i3, objArrM381package, iCrashlytics, 32 - i3);
            objArrM381package[31] = c0656l.f2129l;
            c0656l.f2129l = obj;
            return objArrM381package;
        }
        int iCrashlytics2 = objArr[31] == null ? AbstractC14707l.crashlytics(m383static() - 1, i) : 31;
        Object[] objArrM381package2 = m381package(objArr);
        int i4 = i - 5;
        int i5 = iCrashlytics + 1;
        if (i5 <= iCrashlytics2) {
            while (true) {
                objArrM381package2[iCrashlytics2] = m371class((Object[]) objArrM381package2[iCrashlytics2], i4, 0, c0656l);
                if (iCrashlytics2 == i5) {
                    break;
                }
                iCrashlytics2--;
            }
        }
        objArrM381package2[iCrashlytics] = m371class((Object[]) objArrM381package2[iCrashlytics], i4, i2, c0656l);
        return objArrM381package2;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final boolean m372continue(Function1 function1) {
        int i;
        Function1 function2 = function1;
        int iM380new = m380new();
        Object[] objArrM379native = null;
        C0656l c0656l = new C0656l(null);
        boolean z = false;
        if (this.f1265l == null) {
            int iM385switch = m385switch(function2, this.f1259l, iM380new, c0656l);
            Object obj = c0656l.f2129l;
            if (iM385switch == iM380new) {
                iM385switch = iM380new;
            } else {
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM385switch, iM380new, (Object) null);
                this.f1259l = objArr;
                this.f1260l -= iM380new - iM385switch;
            }
            if (iM385switch != iM380new) {
                z = true;
            }
        } else {
            AbstractC16594l abstractC16594lM388throws = m388throws(0);
            int iM385switch2 = 32;
            while (iM385switch2 == 32 && abstractC16594lM388throws.hasNext()) {
                iM385switch2 = m385switch(function2, (Object[]) abstractC16594lM388throws.next(), 32, c0656l);
            }
            if (iM385switch2 == 32) {
                int iM385switch3 = m385switch(function2, this.f1259l, iM380new, c0656l);
                Object obj2 = c0656l.f2129l;
                if (iM385switch3 == iM380new) {
                    iM385switch3 = iM380new;
                } else {
                    Object[] objArr2 = (Object[]) obj2;
                    Arrays.fill(objArr2, iM385switch3, iM380new, (Object) null);
                    this.f1259l = objArr2;
                    this.f1260l -= iM380new - iM385switch3;
                }
                if (iM385switch3 == 0) {
                    m375extends(this.f1260l, this.f1264l, this.f1265l);
                }
                if (iM385switch3 != iM380new) {
                }
            } else {
                int i2 = (abstractC16594lM388throws.f32567l - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM369case = iM385switch2;
                while (abstractC16594lM388throws.hasNext()) {
                    iM369case = m369case(function2, (Object[]) abstractC16594lM388throws.next(), 32, iM369case, c0656l, arrayList2, arrayList);
                    function2 = function1;
                }
                int iM369case2 = m369case(function1, this.f1259l, iM380new, iM369case, c0656l, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) c0656l.f2129l;
                Arrays.fill(objArr3, iM369case2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM377for = this.f1265l;
                if (!zIsEmpty) {
                    objArrM377for = m377for(objArrM377for, i2, this.f1264l, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC5363l.yandex("invalid size");
                }
                if (size == 0) {
                    this.f1264l = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f1264l;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f1264l = i - 5;
                        objArrM377for = objArrM377for[0];
                    }
                    objArrM379native = m379native(i3, i, objArrM377for);
                }
                this.f1265l = objArrM379native;
                this.f1259l = objArr3;
                this.f1260l = size + iM369case2;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final Object[] m373default(Object[] objArr, int i, int i2, Object obj, C0656l c0656l) {
        int iCrashlytics = AbstractC14707l.crashlytics(i2, i);
        Object[] objArrM381package = m381package(objArr);
        if (i != 0) {
            objArrM381package[iCrashlytics] = m373default((Object[]) objArrM381package[iCrashlytics], i - 5, i2, obj, c0656l);
            return objArrM381package;
        }
        if (objArrM381package != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0656l.f2129l = objArrM381package[iCrashlytics];
        objArrM381package[iCrashlytics] = obj;
        return objArrM381package;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final Object[] m374else(int i, Object[] objArr, Object[] objArr2) {
        int iCrashlytics = AbstractC14707l.crashlytics(pro() - 1, i);
        Object[] objArrM381package = m381package(objArr);
        if (i == 5) {
            objArrM381package[iCrashlytics] = objArr2;
            return objArrM381package;
        }
        objArrM381package[iCrashlytics] = m374else(i - 5, (Object[]) objArrM381package[iCrashlytics], objArr2);
        return objArrM381package;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m375extends(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f1265l = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f1259l = objArr;
            this.f1260l = i;
            this.f1264l = i2;
            return;
        }
        C0656l c0656l = new C0656l(null);
        Object[] objArrM382private = m382private(objArr, i2, i, c0656l);
        this.f1259l = (Object[]) c0656l.f2129l;
        this.f1260l = i;
        if (objArrM382private[1] == null) {
            this.f1265l = (Object[]) objArrM382private[0];
            this.f1264l = i2 - 5;
        } else {
            this.f1265l = objArrM382private;
            this.f1264l = i2;
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m376final(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM384strictfp;
        if (i3 < 1) {
            AbstractC5363l.yandex("requires at least one nullBuffer");
        }
        Object[] objArrM381package = m381package(objArr);
        objArr2[0] = objArrM381package;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC8669l.pro(size + 1, i4, i2, objArrM381package, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM384strictfp = objArrM381package;
            } else {
                objArrM384strictfp = m384strictfp();
                i3--;
                objArr2[i3] = objArrM384strictfp;
            }
            int i7 = i2 - i6;
            AbstractC8669l.pro(0, i7, i2, objArrM381package, objArr3);
            AbstractC8669l.pro(size + 1, i4, i7, objArrM381package, objArrM384strictfp);
            objArr3 = objArrM384strictfp;
        }
        Iterator it = collection.iterator();
        isVip(objArrM381package, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM384strictfp2 = m384strictfp();
            isVip(objArrM384strictfp2, 0, it);
            objArr2[i8] = objArrM384strictfp2;
        }
        isVip(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final Object[] m377for(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC5363l.yandex("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC5363l.yandex("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM381package = m381package(objArr);
        int iCrashlytics = AbstractC14707l.crashlytics(i, i2);
        int i3 = i2 - 5;
        objArrM381package[iCrashlytics] = m377for((Object[]) objArrM381package[iCrashlytics], i, i3, it);
        while (true) {
            iCrashlytics++;
            if (iCrashlytics >= 32 || !it.hasNext()) {
                break;
            }
            objArrM381package[iCrashlytics] = m377for((Object[]) objArrM381package[iCrashlytics], 0, i3, it);
        }
        return objArrM381package;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC6900l.yandex(i, pro());
        if (m383static() <= i) {
            objArr = this.f1259l;
        } else {
            Object[] objArr2 = this.f1265l;
            for (int i2 = this.f1264l; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[AbstractC14707l.crashlytics(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final boolean inmobi(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f1263l;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final Object m378interface(Object[] objArr, int i, int i2, int i3) {
        int iPro = pro() - i;
        Object[] objArr2 = this.f1259l;
        if (iPro == 1) {
            Object obj = objArr2[0];
            m375extends(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM381package = m381package(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM381package, i3, iPro - i4);
        objArrM381package[iPro - 1] = null;
        this.f1265l = objArr;
        this.f1259l = objArrM381package;
        this.f1260l = (i + iPro) - 1;
        this.f1264l = i2;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6900l.loadAd(i, this.f1260l);
        return new C3717l(this, i);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final Object[] m379native(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            AbstractC5363l.yandex("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iCrashlytics = AbstractC14707l.crashlytics(i, i2);
        Object objM379native = m379native(i, i2 - 5, (Object[]) objArr[iCrashlytics]);
        if (iCrashlytics < 31) {
            int i3 = iCrashlytics + 1;
            if (objArr[i3] != null) {
                if (inmobi(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM384strictfp = m384strictfp();
                System.arraycopy(objArr, 0, objArrM384strictfp, 0, i3);
                objArr = objArrM384strictfp;
            }
        }
        if (objM379native == objArr[iCrashlytics]) {
            return objArr;
        }
        Object[] objArrM381package = m381package(objArr);
        objArrM381package[iCrashlytics] = objM379native;
        return objArrM381package;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final int m380new() {
        int i = this.f1260l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Object[] m381package(Object[] objArr) {
        if (objArr == null) {
            return m384strictfp();
        }
        if (inmobi(objArr)) {
            return objArr;
        }
        Object[] objArrM384strictfp = m384strictfp();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC8669l.signatures(0, length, 6, objArr, objArrM384strictfp);
        return objArrM384strictfp;
    }

    public final void premium(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f1265l == null) {
            C8339l.smaato("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC16594l abstractC16594lM388throws = m388throws(m383static() >> 5);
        int i5 = i3;
        Object[] objArrM386synchronized = objArr2;
        while (abstractC16594lM388throws.f32567l - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC16594lM388throws.previous();
            AbstractC8669l.pro(0, 32 - i2, 32, objArr3, objArrM386synchronized);
            objArrM386synchronized = m386synchronized(i2, objArr3);
            i5--;
            objArr[i5] = objArrM386synchronized;
        }
        Object[] objArr4 = (Object[]) abstractC16594lM388throws.previous();
        int iM383static = i3 - (((m383static() >> 5) - 1) - i4);
        if (iM383static < i3) {
            objArr2 = objArr[iM383static];
        }
        m376final(collection, i, objArr4, 32, objArr, iM383static, objArr2);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Object[] m382private(Object[] objArr, int i, int i2, C0656l c0656l) {
        Object[] objArrM382private;
        int iCrashlytics = AbstractC14707l.crashlytics(i2 - 1, i);
        if (i == 5) {
            c0656l.f2129l = objArr[iCrashlytics];
            objArrM382private = null;
        } else {
            objArrM382private = m382private((Object[]) objArr[iCrashlytics], i - 5, i2, c0656l);
        }
        if (objArrM382private == null && iCrashlytics == 0) {
            return null;
        }
        Object[] objArrM381package = m381package(objArr);
        objArrM381package[iCrashlytics] = objArrM382private;
        return objArrM381package;
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        return this.f1260l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m372continue(new C1195l(2, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC6900l.yandex(i, pro());
        if (m383static() > i) {
            C0656l c0656l = new C0656l(null);
            this.f1265l = m373default(this.f1265l, this.f1264l, i, obj, c0656l);
            return c0656l.f2129l;
        }
        Object[] objArrM381package = m381package(this.f1259l);
        if (objArrM381package != this.f1259l) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM381package[i2];
        objArrM381package[i2] = obj;
        this.f1259l = objArrM381package;
        return obj2;
    }

    public final int signatures() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final int m383static() {
        int i = this.f1260l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Object[] m384strictfp() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f1263l;
        return objArr;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final int m385switch(Function1 function1, Object[] objArr, int i, C0656l c0656l) {
        Object[] objArrM381package = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM381package = m381package(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM381package[i2] = obj;
                i2++;
            }
        }
        c0656l.f2129l = objArrM381package;
        return i2;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final Object[] m386synchronized(int i, Object[] objArr) {
        if (inmobi(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM384strictfp = m384strictfp();
        System.arraycopy(objArr, 0, objArrM384strictfp, i, 32 - i);
        return objArrM384strictfp;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final Object[] m387throw(Object[] objArr, int i, Object[][] objArr2) {
        C11521l c11521l = new C11521l(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.f1264l;
        Object[] objArrM377for = i2 < (1 << i3) ? m377for(objArr, i, i3, c11521l) : m381package(objArr);
        while (c11521l.hasNext()) {
            this.f1264l += 5;
            objArrM377for = m389volatile(objArrM377for);
            int i4 = this.f1264l;
            m377for(objArrM377for, 1 << i4, i4, c11521l);
        }
        return objArrM377for;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final AbstractC16594l m388throws(int i) {
        Object[] objArr = this.f1265l;
        if (objArr == null) {
            C8339l.smaato("Invalid root");
            return null;
        }
        int iM383static = m383static() >> 5;
        AbstractC6900l.loadAd(i, iM383static);
        int i2 = this.f1264l;
        return i2 == 0 ? new C9884l(i, objArr) : new C5284l(objArr, i, iM383static, i2 / 5);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Object[] m389volatile(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f1263l;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM380new = m380new();
        if (iM380new < 32) {
            Object[] objArrM381package = m381package(this.f1259l);
            objArrM381package[iM380new] = obj;
            this.f1259l = objArrM381package;
            this.f1260l = pro() + 1;
        } else {
            m370catch(this.f1265l, this.f1259l, m389volatile(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM380new = m380new();
        Iterator it = collection.iterator();
        if (32 - iM380new >= collection.size()) {
            Object[] objArrM381package = m381package(this.f1259l);
            isVip(objArrM381package, iM380new, it);
            this.f1259l = objArrM381package;
            this.f1260l = collection.size() + this.f1260l;
            return true;
        }
        int size = ((collection.size() + iM380new) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM381package2 = m381package(this.f1259l);
        isVip(objArrM381package2, iM380new, it);
        objArr[0] = objArrM381package2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM384strictfp = m384strictfp();
            isVip(objArrM384strictfp, 0, it);
            objArr[i] = objArrM384strictfp;
        }
        this.f1265l = m387throw(this.f1265l, m383static(), objArr);
        Object[] objArrM384strictfp2 = m384strictfp();
        isVip(objArrM384strictfp2, 0, it);
        this.f1259l = objArrM384strictfp2;
        this.f1260l = collection.size() + this.f1260l;
        return true;
    }
}
