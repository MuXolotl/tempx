package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: renamed from: lًؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0391l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f1485l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Stack f1486l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final TreeMap f1487l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1488l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final transient C7502l f1489l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final transient int f1490l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f1491l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f1492l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f1493l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final TreeMap f1494l;

    public C0391l(C0391l c0391l, Cfor cfor) {
        this.f1489l = new C7502l(new C12676l(cfor));
        this.f1488l = c0391l.f1488l;
        this.f1492l = c0391l.f1492l;
        ArrayList arrayList = new ArrayList();
        this.f1491l = arrayList;
        arrayList.addAll(c0391l.f1491l);
        this.f1494l = new TreeMap();
        for (Integer num : c0391l.f1494l.keySet()) {
            this.f1494l.put(num, (LinkedList) ((LinkedList) c0391l.f1494l.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f1486l = stack;
        stack.addAll(c0391l.f1486l);
        this.f1485l = new ArrayList();
        Iterator it = c0391l.f1485l.iterator();
        while (it.hasNext()) {
            this.f1485l.add(((C11859l) it.next()).clone());
        }
        this.f1487l = new TreeMap((Map) c0391l.f1487l);
        int i = c0391l.f1493l;
        this.f1493l = i;
        this.f1490l = c0391l.f1490l;
        if (this.f1491l == null) {
            C8339l.smaato("authenticationPath == null");
            throw null;
        }
        if (this.f1494l == null) {
            C8339l.smaato("retain == null");
            throw null;
        }
        if (this.f1486l == null) {
            C8339l.smaato("stack == null");
            throw null;
        }
        if (this.f1485l == null) {
            C8339l.smaato("treeHashInstances == null");
            throw null;
        }
        if (AbstractC4047l.firebase(this.f1488l, i)) {
            return;
        }
        C8339l.smaato("index in BDS state out of bounds");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void loadAd(byte[] bArr, byte[] bArr2, C13068l c13068l) {
        int i;
        ?? r9;
        C13068l c13068l2;
        int i2;
        int i3;
        int i4;
        long j;
        Stack stack;
        int i5;
        int i6;
        int i7;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C13068l c13068l3 = c13068l;
        long j2 = c13068l3.loadAd;
        int i8 = c13068l3.yandex;
        int i9 = this.f1493l;
        ?? r10 = 1;
        if (i9 > this.f1490l - 1) {
            C8339l.smaato("index out of bounds");
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f1488l;
            if (i11 >= i) {
                i11 = 0;
                break;
            } else if (((i9 >> i11) & 1) == 0) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = (this.f1493l >> (i11 + 1)) & 1;
        TreeMap treeMap = this.f1487l;
        ArrayList arrayList = this.f1491l;
        if (i12 == 0 && i11 < i - 1) {
            treeMap.put(Integer.valueOf(i11), arrayList.get(i11));
        }
        ArrayList<C11859l> arrayList2 = this.f1485l;
        int i13 = this.f1492l;
        C7502l c7502l = this.f1489l;
        if (i11 == 0) {
            C13549l c13549l = new C13549l(1);
            c13549l.crashlytics = i8;
            c13549l.loadAd = j2;
            c13549l.purchase = this.f1493l;
            c13549l.billing = c13068l3.billing;
            c13549l.mopub = c13068l3.mopub;
            c13549l.amazon = c13068l3.amazon;
            c13068l3 = new C13068l(c13549l);
            c7502l.purchase(c7502l.amazon(bArr4, c13068l3), bArr3);
            C5321l c5321lLoadAd = c7502l.loadAd(c13068l3);
            C13549l c13549l2 = new C13549l(0);
            c13549l2.crashlytics = i8;
            c13549l2.loadAd = j2;
            c13549l2.purchase = this.f1493l;
            c13549l2.billing = 0;
            c13549l2.mopub = 0;
            c13549l2.amazon = 0;
            arrayList.set(0, AbstractC3872l.crashlytics(c7502l, c5321lLoadAd, new C3834l(c13549l2)));
        } else {
            ?? r16 = 1;
            C16724l c16724l = new C16724l();
            c16724l.crashlytics = i8;
            c16724l.loadAd = j2;
            int i14 = i11 - 1;
            c16724l.purchase = i14;
            c16724l.billing = this.f1493l >> i11;
            c16724l.amazon = 0;
            C13427l c13427l = new C13427l(c16724l);
            c7502l.purchase(c7502l.amazon(bArr4, c13068l3), bArr3);
            C12007l c12007lAmazon = AbstractC3872l.amazon(c7502l, (C12007l) arrayList.get(i14), (C12007l) treeMap.get(Integer.valueOf(i14)), c13427l);
            arrayList.set(i11, new C12007l(c12007lAmazon.f23928l + 1, AbstractC4047l.crashlytics(c12007lAmazon.f23927l)));
            treeMap.remove(Integer.valueOf(i14));
            int i15 = 0;
            while (i15 < i11) {
                arrayList.set(i15, i15 < i - i13 ? ((C11859l) arrayList2.get(i15)).f23683l : ((LinkedList) this.f1494l.get(Integer.valueOf(i15))).removeFirst());
                i15++;
            }
            int iMin = Math.min(i11, i - i13);
            int i16 = 0;
            while (i16 < iMin) {
                int i17 = ((r16 << i16) * 3) + this.f1493l + 1;
                if (i17 < (r16 << i)) {
                    C11859l c11859l = (C11859l) arrayList2.get(i16);
                    c11859l.f23683l = null;
                    c11859l.f23681l = c11859l.f23682l;
                    c11859l.f23685l = i17;
                    r9 = r16;
                    c11859l.f23684l = r9;
                    c11859l.f23686l = false;
                } else {
                    r9 = r16;
                }
                i16++;
                r16 = r9;
            }
            r10 = r16;
        }
        C11859l c11859l2 = null;
        int i18 = 0;
        ?? r11 = r10;
        while (i18 < ((i - i13) >> r11)) {
            C11859l c11859l3 = c11859l2;
            for (C11859l c11859l4 : arrayList2) {
                if (!c11859l4.f23686l && c11859l4.f23684l && (c11859l3 == null || c11859l4.loadAd() < c11859l3.loadAd() || (c11859l4.loadAd() == c11859l3.loadAd() && c11859l4.f23685l < c11859l3.f23685l))) {
                    c11859l3 = c11859l4;
                }
            }
            if (c11859l3 != null) {
                int i19 = c11859l3.f23682l;
                if (c11859l3.f23686l || !c11859l3.f23684l) {
                    C8339l.smaato("finished or not initialized");
                    return;
                }
                C13549l c13549l3 = new C13549l(1);
                c13549l3.crashlytics = c13068l3.yandex;
                c13549l3.loadAd = c13068l3.loadAd;
                int i20 = c11859l3.f23685l;
                c13549l3.purchase = i20;
                c13549l3.billing = c13068l3.billing;
                c13549l3.mopub = c13068l3.mopub;
                c13549l3.amazon = c13068l3.amazon;
                C13068l c13068l4 = new C13068l(c13549l3);
                int i21 = i;
                long j3 = c13068l4.loadAd;
                c13068l2 = c13068l3;
                C13549l c13549l4 = new C13549l(i10);
                int i22 = c13068l4.yandex;
                c13549l4.crashlytics = i22;
                c13549l4.loadAd = j3;
                c13549l4.purchase = i20;
                i2 = i18;
                C3834l c3834l = new C3834l(c13549l4);
                C16724l c16724l2 = new C16724l();
                c16724l2.crashlytics = i22;
                c16724l2.loadAd = j3;
                c16724l2.billing = i20;
                C13427l c13427l2 = new C13427l(c16724l2);
                c7502l.purchase(c7502l.amazon(bArr4, c13068l4), bArr3);
                C12007l c12007lCrashlytics = AbstractC3872l.crashlytics(c7502l, c7502l.loadAd(c13068l4), c3834l);
                while (true) {
                    i4 = c13427l2.amazon;
                    j = c13427l2.loadAd;
                    stack = this.f1486l;
                    boolean zIsEmpty = stack.isEmpty();
                    i5 = c13427l2.billing;
                    i6 = c13427l2.purchase;
                    i7 = c13427l2.yandex;
                    if (zIsEmpty || ((C12007l) stack.peek()).f23928l != c12007lCrashlytics.f23928l || ((C12007l) stack.peek()).f23928l == i19) {
                        break;
                    }
                    C16724l c16724l3 = new C16724l();
                    c16724l3.crashlytics = i7;
                    c16724l3.loadAd = j;
                    c16724l3.purchase = i6;
                    c16724l3.billing = (i5 - 1) / 2;
                    c16724l3.amazon = i4;
                    C13427l c13427l3 = new C13427l(c16724l3);
                    C12007l c12007lAmazon2 = AbstractC3872l.amazon(c7502l, (C12007l) stack.pop(), c12007lCrashlytics, c13427l3);
                    c12007lCrashlytics = new C12007l(c12007lAmazon2.f23928l + 1, AbstractC4047l.crashlytics(c12007lAmazon2.f23927l));
                    C16724l c16724l4 = new C16724l();
                    c16724l4.crashlytics = c13427l3.yandex;
                    c16724l4.loadAd = c13427l3.loadAd;
                    c16724l4.purchase = c13427l3.purchase + 1;
                    c16724l4.billing = c13427l3.billing;
                    c16724l4.amazon = c13427l3.amazon;
                    c13427l2 = new C13427l(c16724l4);
                }
                C12007l c12007l = c11859l3.f23683l;
                if (c12007l == null) {
                    c11859l3.f23683l = c12007lCrashlytics;
                    i3 = i21;
                } else {
                    i3 = i21;
                    if (c12007l.f23928l == c12007lCrashlytics.f23928l) {
                        C16724l c16724l5 = new C16724l();
                        c16724l5.crashlytics = i7;
                        c16724l5.loadAd = j;
                        c16724l5.purchase = i6;
                        c16724l5.billing = (i5 - 1) / 2;
                        c16724l5.amazon = i4;
                        c12007lCrashlytics = new C12007l(c11859l3.f23683l.f23928l + 1, AbstractC4047l.crashlytics(AbstractC3872l.amazon(c7502l, c12007l, c12007lCrashlytics, new C13427l(c16724l5)).f23927l));
                        c11859l3.f23683l = c12007lCrashlytics;
                    } else {
                        stack.push(c12007lCrashlytics);
                    }
                }
                if (c11859l3.f23683l.f23928l == i19) {
                    c11859l3.f23686l = true;
                } else {
                    c11859l3.f23681l = c12007lCrashlytics.f23928l;
                    c11859l3.f23685l++;
                }
            } else {
                c13068l2 = c13068l3;
                i2 = i18;
                i3 = i;
            }
            i18 = i2 + 1;
            bArr3 = bArr;
            bArr4 = bArr2;
            c13068l3 = c13068l2;
            i = i3;
            i10 = 0;
            r11 = 1;
            c11859l2 = null;
        }
        this.f1493l++;
    }

    public final void yandex(byte[] bArr, byte[] bArr2, C13068l c13068l) {
        C13068l c13068l2;
        int i;
        C13068l c13068l3 = c13068l;
        long j = c13068l3.loadAd;
        int i2 = c13068l3.yandex;
        int i3 = 0;
        C13549l c13549l = new C13549l(0);
        c13549l.crashlytics = i2;
        c13549l.loadAd = j;
        C3834l c3834l = new C3834l(c13549l);
        C16724l c16724l = new C16724l();
        c16724l.crashlytics = i2;
        c16724l.loadAd = j;
        C13427l c13427l = new C13427l(c16724l);
        int i4 = 0;
        while (true) {
            int i5 = this.f1488l;
            int i6 = 1 << i5;
            Stack stack = this.f1486l;
            if (i4 >= i6) {
                return;
            }
            C13549l c13549l2 = new C13549l(1);
            c13549l2.crashlytics = c13068l3.yandex;
            c13549l2.loadAd = c13068l3.loadAd;
            c13549l2.purchase = i4;
            c13549l2.billing = c13068l3.billing;
            c13549l2.mopub = c13068l3.mopub;
            c13549l2.amazon = c13068l3.amazon;
            C13068l c13068l4 = new C13068l(c13549l2);
            C7502l c7502l = this.f1489l;
            c7502l.purchase(c7502l.amazon(bArr2, c13068l4), bArr);
            C5321l c5321lLoadAd = c7502l.loadAd(c13068l4);
            C13549l c13549l3 = new C13549l(i3);
            c13549l3.crashlytics = c3834l.yandex;
            c13549l3.loadAd = c3834l.loadAd;
            c13549l3.purchase = i4;
            c13549l3.billing = c3834l.billing;
            c13549l3.mopub = c3834l.mopub;
            c13549l3.amazon = c3834l.amazon;
            c3834l = new C3834l(c13549l3);
            C12007l c12007lCrashlytics = AbstractC3872l.crashlytics(c7502l, c5321lLoadAd, c3834l);
            C16724l c16724l2 = new C16724l();
            c16724l2.crashlytics = c13427l.yandex;
            c16724l2.loadAd = c13427l.loadAd;
            c16724l2.billing = i4;
            c16724l2.amazon = c13427l.amazon;
            c13427l = new C13427l(c16724l2);
            while (!stack.isEmpty()) {
                int i7 = ((C12007l) stack.peek()).f23928l;
                int i8 = c12007lCrashlytics.f23928l;
                if (i7 != i8) {
                    break;
                }
                int i9 = i4 / (1 << i8);
                if (i9 == 1) {
                    this.f1491l.add(c12007lCrashlytics);
                }
                int i10 = this.f1492l;
                if (i9 == 3) {
                    if (i8 < i5 - i10) {
                        C11859l c11859l = (C11859l) this.f1485l.get(i8);
                        c11859l.f23683l = c12007lCrashlytics;
                        c11859l.f23681l = i8;
                        c13068l2 = c13068l4;
                        if (i8 == c11859l.f23682l) {
                            c11859l.f23686l = true;
                        }
                    } else {
                        c13068l2 = c13068l4;
                    }
                    i = 3;
                } else {
                    c13068l2 = c13068l4;
                    i = 3;
                }
                if (i9 >= i && (i9 & 1) == 1 && i8 >= i5 - i10 && i8 <= i5 - 2) {
                    Integer numValueOf = Integer.valueOf(i8);
                    TreeMap treeMap = this.f1494l;
                    if (treeMap.get(numValueOf) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(c12007lCrashlytics);
                        treeMap.put(Integer.valueOf(i8), linkedList);
                    } else {
                        ((LinkedList) treeMap.get(Integer.valueOf(i8))).add(c12007lCrashlytics);
                    }
                }
                C16724l c16724l3 = new C16724l();
                c16724l3.crashlytics = c13427l.yandex;
                c16724l3.loadAd = c13427l.loadAd;
                c16724l3.purchase = c13427l.purchase;
                c16724l3.billing = (c13427l.billing - 1) / 2;
                c16724l3.amazon = c13427l.amazon;
                C13427l c13427l2 = new C13427l(c16724l3);
                C12007l c12007lAmazon = AbstractC3872l.amazon(c7502l, (C12007l) stack.pop(), c12007lCrashlytics, c13427l2);
                c12007lCrashlytics = new C12007l(c12007lAmazon.f23928l + 1, AbstractC4047l.crashlytics(c12007lAmazon.f23927l));
                C16724l c16724l4 = new C16724l();
                c16724l4.crashlytics = c13427l2.yandex;
                c16724l4.loadAd = c13427l2.loadAd;
                c16724l4.purchase = c13427l2.purchase + 1;
                c16724l4.billing = c13427l2.billing;
                c16724l4.amazon = c13427l2.amazon;
                c13427l = new C13427l(c16724l4);
                c13068l4 = c13068l2;
            }
            stack.push(c12007lCrashlytics);
            i4++;
            c13068l3 = c13068l4;
            i3 = 0;
        }
    }

    public C0391l(C0391l c0391l) {
        this.f1489l = new C7502l((C12676l) c0391l.f1489l.f15511l);
        this.f1488l = c0391l.f1488l;
        this.f1492l = c0391l.f1492l;
        ArrayList arrayList = new ArrayList();
        this.f1491l = arrayList;
        arrayList.addAll(c0391l.f1491l);
        this.f1494l = new TreeMap();
        for (Integer num : c0391l.f1494l.keySet()) {
            this.f1494l.put(num, (LinkedList) ((LinkedList) c0391l.f1494l.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f1486l = stack;
        stack.addAll(c0391l.f1486l);
        this.f1485l = new ArrayList();
        Iterator it = c0391l.f1485l.iterator();
        while (it.hasNext()) {
            this.f1485l.add(((C11859l) it.next()).clone());
        }
        this.f1487l = new TreeMap((Map) c0391l.f1487l);
        this.f1493l = c0391l.f1493l;
        this.f1490l = c0391l.f1490l;
    }

    public C0391l(C0391l c0391l, byte[] bArr, byte[] bArr2, C13068l c13068l) {
        this.f1489l = new C7502l((C12676l) c0391l.f1489l.f15511l);
        this.f1488l = c0391l.f1488l;
        this.f1492l = c0391l.f1492l;
        ArrayList arrayList = new ArrayList();
        this.f1491l = arrayList;
        arrayList.addAll(c0391l.f1491l);
        this.f1494l = new TreeMap();
        for (Integer num : c0391l.f1494l.keySet()) {
            this.f1494l.put(num, (LinkedList) ((LinkedList) c0391l.f1494l.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f1486l = stack;
        stack.addAll(c0391l.f1486l);
        this.f1485l = new ArrayList();
        Iterator it = c0391l.f1485l.iterator();
        while (it.hasNext()) {
            this.f1485l.add(((C11859l) it.next()).clone());
        }
        this.f1487l = new TreeMap((Map) c0391l.f1487l);
        this.f1493l = c0391l.f1493l;
        this.f1490l = c0391l.f1490l;
        loadAd(bArr, bArr2, c13068l);
    }

    public C0391l(C7502l c7502l, int i, int i2, int i3) {
        this.f1489l = c7502l;
        this.f1488l = i;
        this.f1490l = i3;
        this.f1492l = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f1491l = new ArrayList();
                this.f1494l = new TreeMap();
                this.f1486l = new Stack();
                this.f1485l = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f1485l.add(new C11859l(i5));
                }
                this.f1487l = new TreeMap();
                this.f1493l = 0;
                return;
            }
        }
        C8339l.metrica("illegal value for BDS parameter k");
        throw null;
    }

    public C0391l(C15980l c15980l, byte[] bArr, byte[] bArr2, C13068l c13068l) {
        C7502l c7502l = new C7502l(c15980l.mopub);
        int i = c15980l.loadAd;
        this(c7502l, i, c15980l.crashlytics, (1 << i) - 1);
        yandex(bArr, bArr2, c13068l);
    }
}
