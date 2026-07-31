package androidx.recyclerview.widget;

import defpackage.C14965l;
import defpackage.C1759l;
import defpackage.C18644l;
import defpackage.C7353l;
import defpackage.C8339l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class yandex {
    public final admob amazon;
    public final C7353l yandex = new C7353l(30);
    public final ArrayList loadAd = new ArrayList();
    public final ArrayList crashlytics = new ArrayList();
    public int billing = 0;
    public final C14965l purchase = new C14965l(this);

    public yandex(admob admobVar) {
        this.amazon = admobVar;
    }

    public final C18644l admob(Object obj, int i, int i2, int i3) {
        C18644l c18644l = (C18644l) this.yandex.yandex();
        if (c18644l != null) {
            c18644l.yandex = i;
            c18644l.loadAd = i2;
            c18644l.amazon = i3;
            c18644l.crashlytics = obj;
            return c18644l;
        }
        C18644l c18644l2 = new C18644l();
        c18644l2.yandex = i;
        c18644l2.loadAd = i2;
        c18644l2.amazon = i3;
        c18644l2.crashlytics = obj;
        return c18644l2;
    }

    public final void amazon(C18644l c18644l) {
        int i;
        C7353l c7353l;
        int i2 = c18644l.yandex;
        if (i2 == 1 || i2 == 8) {
            C8339l.metrica("should not dispatch add or move for pre layout");
            return;
        }
        int iSmaato = smaato(c18644l.loadAd, i2);
        int i3 = c18644l.loadAd;
        int i4 = c18644l.yandex;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                C1759l.ads(c18644l, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c18644l.amazon;
            c7353l = this.yandex;
            if (i5 >= i7) {
                break;
            }
            int iSmaato2 = smaato((i * i5) + c18644l.loadAd, c18644l.yandex);
            int i8 = c18644l.yandex;
            if (i8 == 2 ? iSmaato2 != iSmaato : !(i8 == 4 && iSmaato2 == iSmaato + 1)) {
                C18644l c18644lAdmob = admob(c18644l.crashlytics, i8, iSmaato, i6);
                purchase(c18644lAdmob, i3);
                c18644lAdmob.crashlytics = null;
                c7353l.crashlytics(c18644lAdmob);
                if (c18644l.yandex == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iSmaato = iSmaato2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c18644l.crashlytics;
        c18644l.crashlytics = null;
        c7353l.crashlytics(c18644l);
        if (i6 > 0) {
            C18644l c18644lAdmob2 = admob(obj, c18644l.yandex, iSmaato, i6);
            purchase(c18644lAdmob2, i3);
            c18644lAdmob2.crashlytics = null;
            c7353l.crashlytics(c18644lAdmob2);
        }
    }

    public final int billing(int i, int i2) {
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        while (i2 < size) {
            C18644l c18644l = (C18644l) arrayList.get(i2);
            int i3 = c18644l.yandex;
            int i4 = c18644l.loadAd;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c18644l.amazon;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c18644l.amazon <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c18644l.amazon;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c18644l.amazon;
            }
            i2++;
        }
        return i;
    }

    public final void crashlytics() {
        loadAd();
        ArrayList arrayList = this.loadAd;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18644l c18644l = (C18644l) arrayList.get(i);
            int i2 = c18644l.yandex;
            admob admobVar = this.amazon;
            if (i2 == 1) {
                admobVar.loadAd(c18644l);
                int i3 = c18644l.loadAd;
                int i4 = c18644l.amazon;
                RecyclerView recyclerView = admobVar.f452l;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                admobVar.loadAd(c18644l);
                int i5 = c18644l.loadAd;
                int i6 = c18644l.amazon;
                RecyclerView recyclerView2 = admobVar.f452l;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.crashlytics += i6;
            } else if (i2 == 4) {
                admobVar.loadAd(c18644l);
                int i7 = c18644l.loadAd;
                int i8 = c18644l.amazon;
                Object obj = c18644l.crashlytics;
                RecyclerView recyclerView3 = admobVar.f452l;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                admobVar.loadAd(c18644l);
                int i9 = c18644l.loadAd;
                int i10 = c18644l.amazon;
                RecyclerView recyclerView4 = admobVar.f452l;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        firebase(arrayList);
        this.billing = 0;
    }

    public final void firebase(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18644l c18644l = (C18644l) arrayList.get(i);
            c18644l.crashlytics = null;
            this.yandex.crashlytics(c18644l);
        }
        arrayList.clear();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x0189  */
    /* JADX WARN: Code duplicated, block: B:181:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x013d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0177  */
    public final void isPro() {
        ArrayList arrayList;
        int i;
        byte b;
        boolean z;
        byte b2;
        C18644l c18644lAdmob;
        int i2;
        int i3;
        int i4;
        C18644l c18644lAdmob2;
        boolean z2;
        boolean z3;
        C18644l c18644lAdmob3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C14965l c14965l = this.purchase;
        c14965l.getClass();
        while (true) {
            arrayList = this.loadAd;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C18644l) arrayList.get(size)).yandex != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            yandex yandexVar = (yandex) c14965l.f29441l;
            C7353l c7353l = yandexVar.yandex;
            C18644l c18644l = (C18644l) arrayList.get(size);
            C18644l c18644l2 = (C18644l) arrayList.get(i13);
            int i14 = c18644l2.yandex;
            if (i14 == 1) {
                int i15 = c18644l.amazon;
                int i16 = c18644l2.loadAd;
                int i17 = i15 < i16 ? -1 : 0;
                int i18 = c18644l.loadAd;
                if (i18 < i16) {
                    i17++;
                }
                if (i16 <= i18) {
                    c18644l.loadAd = i18 + c18644l2.amazon;
                }
                int i19 = c18644l2.loadAd;
                if (i19 <= i15) {
                    c18644l.amazon = i15 + c18644l2.amazon;
                }
                c18644l2.loadAd = i19 + i17;
                arrayList.set(size, c18644l2);
                arrayList.set(i13, c18644l);
            } else if (i14 == 2) {
                int i20 = c18644l.loadAd;
                int i21 = c18644l.amazon;
                int i22 = c18644l2.loadAd;
                if (i20 < i21) {
                    z3 = i22 == i20 && c18644l2.amazon == i21 - i20;
                    z2 = false;
                } else if (i22 == i21 + 1 && c18644l2.amazon == i20 - i21) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i21 < i22) {
                    c18644l2.loadAd = i22 - 1;
                } else {
                    int i23 = c18644l2.amazon;
                    if (i21 < i22 + i23) {
                        c18644l2.amazon = i23 - 1;
                        c18644l.yandex = 2;
                        c18644l.amazon = 1;
                        if (c18644l2.amazon == 0) {
                            arrayList.remove(i13);
                            c18644l2.crashlytics = null;
                            c7353l.crashlytics(c18644l2);
                        }
                    }
                }
                int i24 = c18644l.loadAd;
                int i25 = c18644l2.loadAd;
                if (i24 <= i25) {
                    c18644l2.loadAd = i25 + 1;
                } else {
                    int i26 = i25 + c18644l2.amazon;
                    if (i24 < i26) {
                        c18644lAdmob3 = yandexVar.admob(null, 2, i24 + 1, i26 - i24);
                        c18644l2.amazon = c18644l.loadAd - c18644l2.loadAd;
                    }
                    if (z3) {
                        arrayList.set(size, c18644l2);
                        arrayList.remove(i13);
                        c18644l.crashlytics = null;
                        c7353l.crashlytics(c18644l);
                    } else {
                        if (z2) {
                            if (c18644lAdmob3 != null) {
                                i11 = c18644l.loadAd;
                                if (i11 > c18644lAdmob3.loadAd) {
                                    c18644l.loadAd = i11 - c18644lAdmob3.amazon;
                                }
                                i12 = c18644l.amazon;
                                if (i12 > c18644lAdmob3.loadAd) {
                                    c18644l.amazon = i12 - c18644lAdmob3.amazon;
                                }
                            }
                            i9 = c18644l.loadAd;
                            if (i9 > c18644l2.loadAd) {
                                c18644l.loadAd = i9 - c18644l2.amazon;
                            }
                            i10 = c18644l.amazon;
                            if (i10 > c18644l2.loadAd) {
                                c18644l.amazon = i10 - c18644l2.amazon;
                            }
                        } else {
                            if (c18644lAdmob3 != null) {
                                i7 = c18644l.loadAd;
                                if (i7 >= c18644lAdmob3.loadAd) {
                                    c18644l.loadAd = i7 - c18644lAdmob3.amazon;
                                }
                                i8 = c18644l.amazon;
                                if (i8 >= c18644lAdmob3.loadAd) {
                                    c18644l.amazon = i8 - c18644lAdmob3.amazon;
                                }
                            }
                            i5 = c18644l.loadAd;
                            if (i5 >= c18644l2.loadAd) {
                                c18644l.loadAd = i5 - c18644l2.amazon;
                            }
                            i6 = c18644l.amazon;
                            if (i6 >= c18644l2.loadAd) {
                                c18644l.amazon = i6 - c18644l2.amazon;
                            }
                        }
                        arrayList.set(size, c18644l2);
                        if (c18644l.loadAd != c18644l.amazon) {
                            arrayList.set(i13, c18644l);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (c18644lAdmob3 != null) {
                            arrayList.add(size, c18644lAdmob3);
                        }
                    }
                }
                c18644lAdmob3 = null;
                if (z3) {
                    arrayList.set(size, c18644l2);
                    arrayList.remove(i13);
                    c18644l.crashlytics = null;
                    c7353l.crashlytics(c18644l);
                } else {
                    if (z2) {
                        if (c18644lAdmob3 != null) {
                            i11 = c18644l.loadAd;
                            if (i11 > c18644lAdmob3.loadAd) {
                                c18644l.loadAd = i11 - c18644lAdmob3.amazon;
                            }
                            i12 = c18644l.amazon;
                            if (i12 > c18644lAdmob3.loadAd) {
                                c18644l.amazon = i12 - c18644lAdmob3.amazon;
                            }
                        }
                        i9 = c18644l.loadAd;
                        if (i9 > c18644l2.loadAd) {
                            c18644l.loadAd = i9 - c18644l2.amazon;
                        }
                        i10 = c18644l.amazon;
                        if (i10 > c18644l2.loadAd) {
                            c18644l.amazon = i10 - c18644l2.amazon;
                        }
                    } else {
                        if (c18644lAdmob3 != null) {
                            i7 = c18644l.loadAd;
                            if (i7 >= c18644lAdmob3.loadAd) {
                                c18644l.loadAd = i7 - c18644lAdmob3.amazon;
                            }
                            i8 = c18644l.amazon;
                            if (i8 >= c18644lAdmob3.loadAd) {
                                c18644l.amazon = i8 - c18644lAdmob3.amazon;
                            }
                        }
                        i5 = c18644l.loadAd;
                        if (i5 >= c18644l2.loadAd) {
                            c18644l.loadAd = i5 - c18644l2.amazon;
                        }
                        i6 = c18644l.amazon;
                        if (i6 >= c18644l2.loadAd) {
                            c18644l.amazon = i6 - c18644l2.amazon;
                        }
                    }
                    arrayList.set(size, c18644l2);
                    if (c18644l.loadAd != c18644l.amazon) {
                        arrayList.set(i13, c18644l);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (c18644lAdmob3 != null) {
                        arrayList.add(size, c18644lAdmob3);
                    }
                }
            } else if (i14 == 4) {
                int i27 = c18644l.amazon;
                int i28 = c18644l2.loadAd;
                if (i27 < i28) {
                    c18644l2.loadAd = i28 - 1;
                } else {
                    int i29 = c18644l2.amazon;
                    if (i27 < i28 + i29) {
                        c18644l2.amazon = i29 - 1;
                        c18644lAdmob = yandexVar.admob(c18644l2.crashlytics, 4, c18644l.loadAd, 1);
                    }
                    i2 = c18644l.loadAd;
                    i3 = c18644l2.loadAd;
                    if (i2 <= i3) {
                        c18644l2.loadAd = i3 + 1;
                    } else {
                        i4 = i3 + c18644l2.amazon;
                        if (i2 < i4) {
                            int i30 = i4 - i2;
                            c18644lAdmob2 = yandexVar.admob(c18644l2.crashlytics, 4, i2 + 1, i30);
                            c18644l2.amazon -= i30;
                        }
                        arrayList.set(i13, c18644l);
                        if (c18644l2.amazon > 0) {
                            arrayList.set(size, c18644l2);
                        } else {
                            arrayList.remove(size);
                            c18644l2.crashlytics = null;
                            c7353l.crashlytics(c18644l2);
                        }
                        if (c18644lAdmob != null) {
                            arrayList.add(size, c18644lAdmob);
                        }
                        if (c18644lAdmob2 != null) {
                            arrayList.add(size, c18644lAdmob2);
                        }
                    }
                    c18644lAdmob2 = null;
                    arrayList.set(i13, c18644l);
                    if (c18644l2.amazon > 0) {
                        arrayList.set(size, c18644l2);
                    } else {
                        arrayList.remove(size);
                        c18644l2.crashlytics = null;
                        c7353l.crashlytics(c18644l2);
                    }
                    if (c18644lAdmob != null) {
                        arrayList.add(size, c18644lAdmob);
                    }
                    if (c18644lAdmob2 != null) {
                        arrayList.add(size, c18644lAdmob2);
                    }
                }
                c18644lAdmob = null;
                i2 = c18644l.loadAd;
                i3 = c18644l2.loadAd;
                if (i2 <= i3) {
                    c18644l2.loadAd = i3 + 1;
                } else {
                    i4 = i3 + c18644l2.amazon;
                    if (i2 < i4) {
                        int i31 = i4 - i2;
                        c18644lAdmob2 = yandexVar.admob(c18644l2.crashlytics, 4, i2 + 1, i31);
                        c18644l2.amazon -= i31;
                    }
                    arrayList.set(i13, c18644l);
                    if (c18644l2.amazon > 0) {
                        arrayList.set(size, c18644l2);
                    } else {
                        arrayList.remove(size);
                        c18644l2.crashlytics = null;
                        c7353l.crashlytics(c18644l2);
                    }
                    if (c18644lAdmob != null) {
                        arrayList.add(size, c18644lAdmob);
                    }
                    if (c18644lAdmob2 != null) {
                        arrayList.add(size, c18644lAdmob2);
                    }
                }
                c18644lAdmob2 = null;
                arrayList.set(i13, c18644l);
                if (c18644l2.amazon > 0) {
                    arrayList.set(size, c18644l2);
                } else {
                    arrayList.remove(size);
                    c18644l2.crashlytics = null;
                    c7353l.crashlytics(c18644l2);
                }
                if (c18644lAdmob != null) {
                    arrayList.add(size, c18644lAdmob);
                }
                if (c18644lAdmob2 != null) {
                    arrayList.add(size, c18644lAdmob2);
                }
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            C18644l c18644lAdmob4 = (C18644l) arrayList.get(i32);
            int i33 = c18644lAdmob4.yandex;
            if (i33 != 1) {
                C7353l c7353l2 = this.yandex;
                admob admobVar = this.amazon;
                if (i33 == 2) {
                    int i34 = c18644lAdmob4.loadAd;
                    int i35 = c18644lAdmob4.amazon + i34;
                    int i36 = i34;
                    int i37 = 0;
                    byte b3 = -1;
                    while (i36 < i35) {
                        if (admobVar.crashlytics(i36) != null || yandex(i36)) {
                            if (b3 == 0) {
                                amazon(admob(null, 2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                subs(admob(null, 2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b3 = b2;
                    }
                    if (i37 != c18644lAdmob4.amazon) {
                        c18644lAdmob4.crashlytics = null;
                        c7353l2.crashlytics(c18644lAdmob4);
                        c18644lAdmob4 = admob(null, 2, i34, i37);
                    }
                    if (b3 == 0) {
                        amazon(c18644lAdmob4);
                    } else {
                        subs(c18644lAdmob4);
                    }
                } else if (i33 == 4) {
                    int i38 = c18644lAdmob4.loadAd;
                    int i39 = c18644lAdmob4.amazon + i38;
                    int i40 = i38;
                    int i41 = 0;
                    while (i38 < i39) {
                        if (admobVar.crashlytics(i38) != null || yandex(i38)) {
                            if (b == 0) {
                                amazon(admob(c18644lAdmob4.crashlytics, 4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                subs(admob(c18644lAdmob4.crashlytics, 4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != c18644lAdmob4.amazon) {
                        Object obj = c18644lAdmob4.crashlytics;
                        c18644lAdmob4.crashlytics = null;
                        c7353l2.crashlytics(c18644lAdmob4);
                        c18644lAdmob4 = admob(obj, 4, i40, i41);
                    }
                    if (b == 0) {
                        amazon(c18644lAdmob4);
                    } else {
                        subs(c18644lAdmob4);
                    }
                } else if (i33 == i) {
                    subs(c18644lAdmob4);
                }
            } else {
                subs(c18644lAdmob4);
            }
            i32++;
            i = 8;
            b = -1;
        }
        arrayList.clear();
    }

    public final void loadAd() {
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.amazon.loadAd((C18644l) arrayList.get(i));
        }
        firebase(arrayList);
        this.billing = 0;
    }

    public final boolean mopub() {
        return this.loadAd.size() > 0;
    }

    public final void purchase(C18644l c18644l, int i) {
        admob admobVar = this.amazon;
        admobVar.loadAd(c18644l);
        int i2 = c18644l.yandex;
        if (i2 == 2) {
            int i3 = c18644l.amazon;
            RecyclerView recyclerView = admobVar.f452l;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.crashlytics += i3;
            return;
        }
        if (i2 != 4) {
            C8339l.metrica("only remove and update ops can be dispatched in first pass");
            return;
        }
        int i4 = c18644l.amazon;
        Object obj = c18644l.crashlytics;
        RecyclerView recyclerView2 = admobVar.f452l;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int smaato(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.crashlytics;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C18644l c18644l = (C18644l) arrayList.get(size);
            int i5 = c18644l.yandex;
            int i6 = c18644l.loadAd;
            if (i5 == 8) {
                int i7 = c18644l.amazon;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c18644l.loadAd = i6 + 1;
                            c18644l.amazon = i7 + 1;
                        } else if (i2 == 2) {
                            c18644l.loadAd = i6 - 1;
                            c18644l.amazon = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c18644l.amazon = i7 + 1;
                    } else if (i2 == 2) {
                        c18644l.amazon = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c18644l.loadAd = i6 + 1;
                    } else if (i2 == 2) {
                        c18644l.loadAd = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c18644l.amazon;
                } else if (i5 == 2) {
                    i += c18644l.amazon;
                }
            } else if (i2 == 1) {
                c18644l.loadAd = i6 + 1;
            } else if (i2 == 2) {
                c18644l.loadAd = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C18644l c18644l2 = (C18644l) arrayList.get(size2);
            int i8 = c18644l2.yandex;
            int i9 = c18644l2.amazon;
            C7353l c7353l = this.yandex;
            if (i8 == 8) {
                if (i9 == c18644l2.loadAd || i9 < 0) {
                    arrayList.remove(size2);
                    c18644l2.crashlytics = null;
                    c7353l.crashlytics(c18644l2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c18644l2.crashlytics = null;
                c7353l.crashlytics(c18644l2);
            }
        }
        return i;
    }

    public final void subs(C18644l c18644l) {
        this.crashlytics.add(c18644l);
        int i = c18644l.yandex;
        admob admobVar = this.amazon;
        if (i == 1) {
            int i2 = c18644l.loadAd;
            int i3 = c18644l.amazon;
            RecyclerView recyclerView = admobVar.f452l;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c18644l.loadAd;
            int i5 = c18644l.amazon;
            RecyclerView recyclerView2 = admobVar.f452l;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c18644l.loadAd;
            int i7 = c18644l.amazon;
            Object obj = c18644l.crashlytics;
            RecyclerView recyclerView3 = admobVar.f452l;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            C1759l.ads(c18644l, "Unknown update op type for ");
            return;
        }
        int i8 = c18644l.loadAd;
        int i9 = c18644l.amazon;
        RecyclerView recyclerView4 = admobVar.f452l;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    public final boolean yandex(int i) {
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18644l c18644l = (C18644l) arrayList.get(i2);
            int i3 = c18644l.yandex;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c18644l.loadAd;
                    int i5 = c18644l.amazon + i4;
                    while (i4 < i5) {
                        if (billing(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (billing(c18644l.amazon, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
