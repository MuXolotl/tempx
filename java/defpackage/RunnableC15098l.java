package defpackage;

import android.app.Service;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٖٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC15098l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29629l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29630l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29631l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f29632l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29633l;

    public /* synthetic */ RunnableC15098l(C10846l c10846l, int i, C8118l c8118l, Intent intent) {
        this.f29629l = c10846l;
        this.f29630l = i;
        this.f29633l = c8118l;
        this.f29632l = intent;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0169 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lؘِْ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.app.Service, android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [int] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        Object obj;
        int i4;
        int i5;
        C7582l c7582l;
        C10384l c10384l;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r9;
        ?? r2;
        int i11;
        int i12;
        ?? r5;
        int i13;
        int i14;
        int i15 = this.f29631l;
        Object obj2 = this.f29632l;
        Object obj3 = this.f29633l;
        Object obj4 = this.f29629l;
        switch (i15) {
            case 0:
                ?? c13161l = new C13161l(this);
                int size = ((List) obj4).size();
                int size2 = ((List) obj3).size();
                ArrayList<C10384l> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C0141l c0141l = new C0141l();
                int i16 = 0;
                c0141l.yandex = 0;
                c0141l.loadAd = size;
                c0141l.crashlytics = 0;
                c0141l.amazon = size2;
                arrayList2.add(c0141l);
                int i17 = size + size2;
                int i18 = 1;
                int i19 = 2;
                int i20 = (((i17 + 1) / 2) * 2) + 1;
                ?? r10 = new int[i20];
                int i21 = i20 / 2;
                int[] iArr = new int[i20];
                ArrayList arrayList3 = new ArrayList();
                while (!arrayList2.isEmpty()) {
                    C0141l c0141l2 = (C0141l) arrayList2.remove(arrayList2.size() - i18);
                    if (c0141l2.loadAd() < i18 || c0141l2.yandex() < i18) {
                        obj = obj2;
                        i4 = i19;
                        i5 = i21;
                        c7582l = null;
                    } else {
                        int iYandex = ((c0141l2.yandex() + c0141l2.loadAd()) + i18) / i19;
                        int i22 = i18 + i21;
                        r10[i22] = c0141l2.yandex;
                        iArr[i22] = c0141l2.loadAd;
                        int i23 = i16;
                        while (true) {
                            if (i23 < iYandex) {
                                int i24 = Math.abs(c0141l2.loadAd() - c0141l2.yandex()) % 2 == i18 ? i18 : i16;
                                int iLoadAd = c0141l2.loadAd() - c0141l2.yandex();
                                i4 = i19;
                                int i25 = -i23;
                                int i26 = i25;
                                while (true) {
                                    if (i26 <= i23) {
                                        if (i26 != i25) {
                                            if (i26 != i23) {
                                                obj = obj2;
                                                if (r10[i26 + 1 + i21] > r10[(i26 - 1) + i21]) {
                                                }
                                                i11 = i26;
                                                int i27 = ((r9 - c0141l2.yandex) + c0141l2.crashlytics) - i11;
                                                if (i23 == 0 && r9 == r2) {
                                                    i27--;
                                                }
                                                i12 = i24;
                                                r5 = r9;
                                                i13 = i27;
                                                i5 = i21;
                                                while (r5 < c0141l2.loadAd && i13 < c0141l2.amazon && c13161l.loadAd(r5, i13)) {
                                                    i13++;
                                                    r5++;
                                                }
                                                r10[i11 + i5] = r5;
                                                if (i12 != 0) {
                                                    i14 = iLoadAd - i11;
                                                    i6 = iYandex;
                                                    if (i14 < i25 + 1 && i14 <= i23 - 1 && iArr[i14 + i5] <= r5) {
                                                        c7582l = new C7582l();
                                                        c7582l.yandex = r2;
                                                        c7582l.loadAd = i27;
                                                        c7582l.crashlytics = r5;
                                                        c7582l.amazon = i13;
                                                        c7582l.purchase = false;
                                                    }
                                                } else {
                                                    i6 = iYandex;
                                                }
                                                i26 = i11 + 2;
                                                obj2 = obj;
                                                i24 = i12;
                                                i21 = i5;
                                                iYandex = i6;
                                            } else {
                                                obj = obj2;
                                            }
                                            ?? r3 = r10[(i26 - 1) + i21];
                                            int i28 = r3 + 1;
                                            r2 = r3;
                                            r9 = i28;
                                            i11 = i26;
                                            int i29 = ((r9 - c0141l2.yandex) + c0141l2.crashlytics) - i11;
                                            if (i23 == 0) {
                                            }
                                            i12 = i24;
                                            r5 = r9;
                                            i13 = i29;
                                            i5 = i21;
                                            while (r5 < c0141l2.loadAd) {
                                                i13++;
                                                r5++;
                                            }
                                            r10[i11 + i5] = r5;
                                            if (i12 != 0) {
                                                i14 = iLoadAd - i11;
                                                i6 = iYandex;
                                                if (i14 < i25 + 1) {
                                                    continue;
                                                }
                                            } else {
                                                i6 = iYandex;
                                            }
                                            i26 = i11 + 2;
                                            obj2 = obj;
                                            i24 = i12;
                                            i21 = i5;
                                            iYandex = i6;
                                        } else {
                                            obj = obj2;
                                        }
                                        ?? r4 = r10[i26 + 1 + i21];
                                        r9 = r4;
                                        r2 = r4;
                                        i11 = i26;
                                        int i210 = ((r9 - c0141l2.yandex) + c0141l2.crashlytics) - i11;
                                        if (i23 == 0) {
                                        }
                                        i12 = i24;
                                        r5 = r9;
                                        i13 = i210;
                                        i5 = i21;
                                        while (r5 < c0141l2.loadAd) {
                                            i13++;
                                            r5++;
                                        }
                                        r10[i11 + i5] = r5;
                                        if (i12 != 0) {
                                            i14 = iLoadAd - i11;
                                            i6 = iYandex;
                                            if (i14 < i25 + 1) {
                                                continue;
                                            }
                                        } else {
                                            i6 = iYandex;
                                        }
                                        i26 = i11 + 2;
                                        obj2 = obj;
                                        i24 = i12;
                                        i21 = i5;
                                        iYandex = i6;
                                    } else {
                                        obj = obj2;
                                        i5 = i21;
                                        i6 = iYandex;
                                        c7582l = null;
                                    }
                                }
                                if (c7582l == null) {
                                    boolean z = (c0141l2.loadAd() - c0141l2.yandex()) % 2 == 0;
                                    int iLoadAd2 = c0141l2.loadAd() - c0141l2.yandex();
                                    int i30 = i25;
                                    while (true) {
                                        if (i30 <= i23) {
                                            if (i30 == i25 || (i30 != i23 && iArr[i30 + 1 + i5] < iArr[(i30 - 1) + i5])) {
                                                i7 = iArr[i30 + 1 + i5];
                                                i8 = i7;
                                            } else {
                                                i7 = iArr[(i30 - 1) + i5];
                                                i8 = i7 - 1;
                                            }
                                            boolean z2 = z;
                                            int i31 = c0141l2.amazon - ((c0141l2.loadAd - i8) - i30);
                                            int i32 = (i23 == 0 || i8 != i7) ? i31 : i31 + 1;
                                            int i33 = iLoadAd2;
                                            while (true) {
                                                if (i8 <= c0141l2.yandex || i31 <= c0141l2.crashlytics) {
                                                    i9 = i30;
                                                } else {
                                                    i9 = i30;
                                                    if (c13161l.loadAd(i8 - 1, i31 - 1)) {
                                                        i8--;
                                                        i31--;
                                                        i30 = i9;
                                                    }
                                                }
                                            }
                                            iArr[i9 + i5] = i8;
                                            if (!z2 || (i10 = i33 - i9) < i25 || i10 > i23 || r10[i10 + i5] < i8) {
                                                i30 = i9 + 2;
                                                z = z2;
                                                iLoadAd2 = i33;
                                            } else {
                                                C7582l c7582l2 = new C7582l();
                                                c7582l2.yandex = i8;
                                                c7582l2.loadAd = i31;
                                                c7582l2.crashlytics = i7;
                                                c7582l2.amazon = i32;
                                                c7582l2.purchase = true;
                                                c7582l = c7582l2;
                                            }
                                        } else {
                                            c7582l = null;
                                        }
                                    }
                                    if (c7582l == null) {
                                        i23++;
                                        i19 = i4;
                                        obj2 = obj;
                                        i21 = i5;
                                        iYandex = i6;
                                        i18 = 1;
                                        i16 = 0;
                                    }
                                }
                            } else {
                                obj = obj2;
                                i4 = i19;
                                i5 = i21;
                                c7582l = null;
                            }
                        }
                    }
                    if (c7582l != null) {
                        if (c7582l.yandex() > 0) {
                            int i34 = c7582l.amazon;
                            int i35 = c7582l.loadAd;
                            int i36 = i34 - i35;
                            int i37 = c7582l.crashlytics;
                            int i38 = c7582l.yandex;
                            int i39 = i37 - i38;
                            if (i36 == i39) {
                                c10384l = new C10384l(i38, i35, i39);
                            } else if (c7582l.purchase) {
                                c10384l = new C10384l(i38, i35, c7582l.yandex());
                            } else {
                                c10384l = i36 > i39 ? new C10384l(i38, i35 + 1, c7582l.yandex()) : new C10384l(i38 + 1, i35, c7582l.yandex());
                            }
                            arrayList.add(c10384l);
                        }
                        C0141l c0141l3 = arrayList3.isEmpty() ? new C0141l() : (C0141l) arrayList3.remove(arrayList3.size() - 1);
                        c0141l3.yandex = c0141l2.yandex;
                        c0141l3.crashlytics = c0141l2.crashlytics;
                        c0141l3.loadAd = c7582l.yandex;
                        c0141l3.amazon = c7582l.loadAd;
                        arrayList2.add(c0141l3);
                        c0141l2.loadAd = c0141l2.loadAd;
                        c0141l2.amazon = c0141l2.amazon;
                        c0141l2.yandex = c7582l.crashlytics;
                        c0141l2.crashlytics = c7582l.amazon;
                        arrayList2.add(c0141l2);
                    } else {
                        arrayList3.add(c0141l2);
                    }
                    i19 = i4;
                    obj2 = obj;
                    i21 = i5;
                    i18 = 1;
                    i16 = 0;
                }
                Object obj5 = obj2;
                int i40 = i19;
                Collections.sort(arrayList, AbstractC13880l.yandex);
                C17651l c17651l = new C17651l();
                c17651l.f34339l = arrayList;
                c17651l.f34338l = r10;
                c17651l.f34340l = iArr;
                Arrays.fill((int[]) r10, 0);
                Arrays.fill(iArr, 0);
                c17651l.f34335l = c13161l;
                RunnableC15098l runnableC15098l = (RunnableC15098l) c13161l.f25776l;
                int size3 = ((List) runnableC15098l.f29629l).size();
                c17651l.f34337l = size3;
                int size4 = ((List) runnableC15098l.f29633l).size();
                c17651l.f34336l = size4;
                c17651l.f34334l = true;
                C10384l c10384l2 = arrayList.isEmpty() ? null : (C10384l) arrayList.get(0);
                if (c10384l2 != null && c10384l2.yandex == 0 && c10384l2.loadAd == 0) {
                    i = 0;
                } else {
                    i = 0;
                    arrayList.add(0, new C10384l(0, 0, 0));
                }
                arrayList.add(new C10384l(size3, size4, i));
                for (C10384l c10384l3 : arrayList) {
                    for (int i41 = 0; i41 < c10384l3.crashlytics; i41++) {
                        int i42 = c10384l3.yandex + i41;
                        int i43 = c10384l3.loadAd + i41;
                        int i44 = c13161l.yandex(i42, i43) ? 1 : i40;
                        r10[i42] = (i43 << 4) | i44;
                        iArr[i43] = (i42 << 4) | i44;
                    }
                }
                if (c17651l.f34334l) {
                    int i45 = 0;
                    for (C10384l c10384l4 : arrayList) {
                        while (true) {
                            i2 = c10384l4.yandex;
                            if (i45 < i2) {
                                if (r10[i45] == 0) {
                                    int size5 = arrayList.size();
                                    int i46 = 0;
                                    for (int i47 = 0; i47 < size5; i47++) {
                                        C10384l c10384l5 = (C10384l) arrayList.get(i47);
                                        while (true) {
                                            i3 = c10384l5.loadAd;
                                            if (i46 < i3) {
                                                if (iArr[i46] == 0 && c13161l.loadAd(i45, i46)) {
                                                    int i48 = c13161l.yandex(i45, i46) ? 8 : 4;
                                                    r10[i45] = (i46 << 4) | i48;
                                                    iArr[i46] = i48 | (i45 << 4);
                                                }
                                                i46++;
                                            }
                                            break;
                                        }
                                        i46 = c10384l5.crashlytics + i3;
                                    }
                                }
                                i45++;
                            }
                        }
                        i45 = c10384l4.crashlytics + i2;
                    }
                }
                ((C12552l) obj5).crashlytics.execute(new RunnableC9929l(this, c17651l, false, 5));
                break;
            default:
                C8118l c8118l = (C8118l) obj3;
                Intent intent = (Intent) obj2;
                ?? r1 = (Service) ((C10846l) obj4).f21908l;
                InterfaceC5193l interfaceC5193l = (InterfaceC5193l) r1;
                int i49 = this.f29630l;
                if (interfaceC5193l.yandex(i49)) {
                    c8118l.f16911l.loadAd(Integer.valueOf(i49), "Local AppMeasurementService processed last upload request. StartId");
                    C8118l c8118l2 = C17417l.vip(r1, null, null, null).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.yandex("Completed wakeful intent.");
                    interfaceC5193l.loadAd(intent);
                }
                break;
        }
    }

    public RunnableC15098l(C12552l c12552l, List list, List list2, int i) {
        this.f29632l = c12552l;
        this.f29629l = list;
        this.f29633l = list2;
        this.f29630l = i;
    }
}
