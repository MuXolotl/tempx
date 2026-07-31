package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٓۜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14438l extends C2316l {
    public boolean admob;
    public final C15206l amazon;
    public AbstractC18026l billing;
    public final AbstractC14971l crashlytics;
    public boolean isPro;
    public C9185l mopub;
    public final C3994l purchase;
    public boolean subs;

    public C14438l(AbstractC14971l abstractC14971l) {
        this.crashlytics = abstractC14971l;
        C15206l c15206l = new C15206l();
        c15206l.crashlytics = new long[2];
        this.amazon = c15206l;
        this.purchase = new C3994l(2);
        this.subs = true;
        this.isPro = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean amazon(C8634l c8634l) {
        byte b;
        C3654l c3654l;
        C3994l c3994l = this.purchase;
        boolean z = false;
        z = false;
        z = false;
        if (c3994l.firebase() != 0) {
            AbstractC14971l abstractC14971l = this.crashlytics;
            if (abstractC14971l.f29462l) {
                AbstractC18026l abstractC18026l = abstractC14971l.f29452l;
                if ((abstractC18026l == null || (c3654l = abstractC18026l.f35281l) == null) ? false : c3654l.m1389private()) {
                    C9185l c9185l = this.mopub;
                    long j = this.billing.f20590l;
                    AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                    C17893l c17893l = null;
                    while (abstractC14971lLoadAd != null) {
                        if (abstractC14971lLoadAd instanceof InterfaceC13202l) {
                            ((InterfaceC13202l) abstractC14971lLoadAd).appmetrica(c9185l, EnumC9065l.f18652l, j);
                            b = false;
                        } else {
                            b = true;
                        }
                        if (b != false) {
                            if (((abstractC14971lLoadAd.f29450l & 16) != 0) != false && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i = 0;
                                for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                    if (((abstractC14971l2.f29450l & 16) != 0) != false) {
                                        i++;
                                        if (i == 1) {
                                            abstractC14971lLoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l == null) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l.crashlytics(abstractC14971l2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                    if (abstractC14971l.f29462l) {
                        C17893l c17893l2 = this.yandex;
                        Object[] objArr = c17893l2.f34848l;
                        int i2 = c17893l2.f34846l;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C14438l) objArr[i3]).amazon(c8634l);
                        }
                    }
                    z = true;
                }
            }
        }
        loadAd(c8634l);
        c3994l.loadAd();
        this.billing = null;
        return z;
    }

    public final void billing(long j, C12463l c12463l) {
        C15206l c15206l = this.amazon;
        if (c15206l.crashlytics(j) && c12463l.subs(this) < 0) {
            c15206l.purchase(j);
            this.purchase.isPro(j);
        }
        C17893l c17893l = this.yandex;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C14438l) objArr[i2]).billing(j, c12463l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void crashlytics() {
        C17893l c17893l = this.yandex;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C14438l) objArr[i2]).crashlytics();
        }
        ?? LoadAd = this.crashlytics;
        ?? c17893l2 = 0;
        while (LoadAd != 0) {
            if (LoadAd instanceof InterfaceC13202l) {
                ((InterfaceC13202l) LoadAd).mo1500throw();
            } else if ((LoadAd.f29450l & 16) != 0 && (LoadAd instanceof AbstractC11340l)) {
                AbstractC14971l abstractC14971l = ((AbstractC11340l) LoadAd).f22875l;
                int i3 = 0;
                c17893l2 = c17893l2;
                LoadAd = LoadAd;
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            c17893l2 = c17893l2;
                            LoadAd = abstractC14971l;
                        } else {
                            if (c17893l2 == 0) {
                                c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                            }
                            if (LoadAd != 0) {
                                c17893l2.crashlytics(LoadAd);
                                LoadAd = 0;
                            }
                            c17893l2.crashlytics(abstractC14971l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                    c17893l2 = c17893l2;
                    LoadAd = LoadAd;
                }
                if (i3 == 1) {
                }
            }
            LoadAd = AbstractC5573l.loadAd(c17893l2);
        }
    }

    @Override // defpackage.C2316l
    public final void loadAd(C8634l c8634l) {
        super.loadAd(c8634l);
        C9185l c9185l = this.mopub;
        if (c9185l == null) {
            return;
        }
        this.admob = this.subs;
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C15730l c15730l = (C15730l) list.get(i);
            boolean z = c15730l.amazon;
            long j = c15730l.yandex;
            boolean zAdcel = c8634l.adcel(j);
            boolean z2 = this.subs;
            if ((!z && !zAdcel) || (!z && !z2)) {
                this.amazon.purchase(j);
            }
        }
        this.subs = false;
        this.isPro = c9185l.billing == 5;
    }

    public final boolean purchase(C8634l c8634l, boolean z) {
        boolean z2;
        boolean z3;
        C3654l c3654l;
        if (this.purchase.firebase() == 0) {
            return false;
        }
        AbstractC14971l abstractC14971lLoadAd = this.crashlytics;
        if (abstractC14971lLoadAd.f29462l) {
            AbstractC18026l abstractC18026l = abstractC14971lLoadAd.f29452l;
            if ((abstractC18026l == null || (c3654l = abstractC18026l.f35281l) == null) ? false : c3654l.m1389private()) {
                C9185l c9185l = this.mopub;
                long j = this.billing.f20590l;
                AbstractC14971l abstractC14971lLoadAd2 = abstractC14971lLoadAd;
                C17893l c17893l = null;
                while (abstractC14971lLoadAd2 != null) {
                    if (abstractC14971lLoadAd2 instanceof InterfaceC13202l) {
                        ((InterfaceC13202l) abstractC14971lLoadAd2).appmetrica(c9185l, EnumC9065l.f18654l, j);
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (((abstractC14971lLoadAd2.f29450l & 16) != 0) && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                            int i = 0;
                            for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                                if ((abstractC14971l.f29450l & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC14971lLoadAd2 = abstractC14971l;
                                    } else {
                                        if (c17893l == null) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (abstractC14971lLoadAd2 != null) {
                                            c17893l.crashlytics(abstractC14971lLoadAd2);
                                            abstractC14971lLoadAd2 = null;
                                        }
                                        c17893l.crashlytics(abstractC14971l);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                    }
                    abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l);
                }
                if (abstractC14971lLoadAd.f29462l) {
                    C17893l c17893l2 = this.yandex;
                    Object[] objArr = c17893l2.f34848l;
                    int i2 = c17893l2.f34846l;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((C14438l) objArr[i3]).purchase(c8634l, z);
                    }
                }
                if (abstractC14971lLoadAd.f29462l) {
                    C17893l c17893l3 = null;
                    while (abstractC14971lLoadAd != null) {
                        if (abstractC14971lLoadAd instanceof InterfaceC13202l) {
                            ((InterfaceC13202l) abstractC14971lLoadAd).appmetrica(c9185l, EnumC9065l.f18653l, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((abstractC14971lLoadAd.f29450l & 16) != 0) && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i4 = 0;
                                for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                    if ((abstractC14971l2.f29450l & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l3 == null) {
                                                c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l3.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l3.crashlytics(abstractC14971l2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                        }
                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.crashlytics + ", children=" + this.yandex + ", pointerIds=" + this.amazon + ")";
    }

    /* JADX WARN: Code duplicated, block: B:126:0x028c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // defpackage.C2316l
    public final boolean yandex(C3994l c3994l, InterfaceC18212l interfaceC18212l, C8634l c8634l, boolean z) {
        C15206l c15206l;
        C3994l c3994l2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        C9185l c9185l;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        boolean zYandex = super.yandex(c3994l, interfaceC18212l, c8634l, z);
        ?? LoadAd = this.crashlytics;
        if (LoadAd.f29462l) {
            ?? c17893l = 0;
            while (LoadAd != 0) {
                if (LoadAd instanceof InterfaceC13202l) {
                    this.billing = AbstractC5573l.smaato((InterfaceC13202l) LoadAd, 16);
                } else if ((LoadAd.f29450l & 16) != 0 && (LoadAd instanceof AbstractC11340l)) {
                    AbstractC14971l abstractC14971l = ((AbstractC11340l) LoadAd).f22875l;
                    int i4 = 0;
                    while (abstractC14971l != null) {
                        if ((abstractC14971l.f29450l & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                                c17893l = c17893l;
                                LoadAd = abstractC14971l;
                            } else {
                                if (c17893l == 0) {
                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                }
                                if (LoadAd != 0) {
                                    c17893l.crashlytics(LoadAd);
                                    LoadAd = 0;
                                }
                                c17893l.crashlytics(abstractC14971l);
                            }
                        } else {
                            LoadAd = LoadAd;
                            c17893l = c17893l;
                        }
                        abstractC14971l = abstractC14971l.f29460l;
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                    }
                    if (i4 == 1) {
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                    } else {
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                    }
                }
                LoadAd = AbstractC5573l.loadAd(c17893l);
            }
            if (this.billing != null) {
                int iFirebase = c3994l.firebase();
                int i5 = 0;
                while (true) {
                    c15206l = this.amazon;
                    c3994l2 = this.purchase;
                    if (i5 >= iFirebase) {
                        break;
                    }
                    long jAdmob = c3994l.admob(i5);
                    C15730l c15730l = (C15730l) c3994l.smaato(i5);
                    if (c15206l.crashlytics(jAdmob)) {
                        long j = c15730l.mopub;
                        long j2 = c15730l.crashlytics;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(c15730l.loadAd().size());
                            List listLoadAd = c15730l.loadAd();
                            int size = listLoadAd.size();
                            int i6 = 0;
                            while (i6 < size) {
                                List list = listLoadAd;
                                C6624l c6624l = (C6624l) listLoadAd.get(i6);
                                C3994l c3994l3 = c3994l2;
                                long j3 = jAdmob;
                                long j4 = c6624l.loadAd;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    arrayList.add(new C6624l(c6624l.yandex, this.billing.mo2589native(interfaceC18212l, j4, true), c6624l.crashlytics, c6624l.amazon, c6624l.purchase));
                                }
                                i6++;
                                size = size;
                                listLoadAd = list;
                                c3994l2 = c3994l3;
                                jAdmob = j3;
                                c15730l = c15730l;
                            }
                            C3994l c3994l4 = c3994l2;
                            long j5 = jAdmob;
                            C15730l c15730l2 = new C15730l(c15730l.yandex, c15730l.loadAd, this.billing.mo2589native(interfaceC18212l, j2, true), c15730l.amazon, c15730l.purchase, c15730l.billing, this.billing.mo2589native(interfaceC18212l, j, true), c15730l.admob, c15730l.subs, arrayList, c15730l.isPro, c15730l.firebase, c15730l.smaato, c15730l.vip);
                            C15730l c15730l3 = c15730l.adcel;
                            if (c15730l3 == null) {
                                c15730l3 = c15730l;
                            }
                            c15730l2.adcel = c15730l3;
                            C15730l c15730l4 = c15730l.adcel;
                            if (c15730l4 != null) {
                                c15730l = c15730l4;
                            }
                            c15730l2.adcel = c15730l;
                            c3994l4.subs(j5, c15730l2);
                        }
                    }
                    i5++;
                    iFirebase = iFirebase;
                    zYandex = zYandex;
                }
                boolean z7 = zYandex;
                if (c3994l2.firebase() == 0) {
                    c15206l.loadAd = 0;
                    this.yandex.isPro();
                    return true;
                }
                int i7 = c15206l.loadAd;
                while (true) {
                    i7--;
                    if (-1 >= i7) {
                        break;
                    }
                    if (c3994l.billing(c15206l.crashlytics[i7]) < 0 && i7 < (i3 = c15206l.loadAd)) {
                        int i8 = i3 - 1;
                        int i9 = i7;
                        while (i9 < i8) {
                            long[] jArr = c15206l.crashlytics;
                            int i10 = i9 + 1;
                            jArr[i9] = jArr[i10];
                            i9 = i10;
                        }
                        c15206l.loadAd--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c3994l2.firebase());
                int iFirebase2 = c3994l2.firebase();
                for (int i11 = 0; i11 < iFirebase2; i11++) {
                    arrayList2.add(c3994l2.smaato(i11));
                }
                C9185l c9185l2 = new C9185l(arrayList2, c8634l);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i12);
                    if (c8634l.adcel(((C15730l) obj).yandex)) {
                        break;
                    }
                    i12++;
                }
                C15730l c15730l5 = (C15730l) obj;
                if (c15730l5 != null) {
                    boolean z8 = c15730l5.amazon;
                    if (z) {
                        z2 = false;
                        if (!this.subs && (z8 || c15730l5.admob)) {
                            long j6 = this.billing.f20590l;
                            long j7 = c15730l5.crashlytics;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            z3 = true;
                            this.subs = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j6 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j6 & 4294967295L)))));
                        }
                        z5 = this.subs;
                        z6 = this.admob;
                        if (z5 == z6 && ((i2 = c9185l2.billing) == 3 || i2 == 4 || i2 == 5)) {
                            c9185l2.billing = z5 ? 4 : 5;
                        } else {
                            i = c9185l2.billing;
                            if (i != 4 && z6 && !this.isPro) {
                                c9185l2.billing = 3;
                            } else if (i == 5 && z5 && z8) {
                                c9185l2.billing = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.subs = false;
                    }
                    z3 = true;
                    z5 = this.subs;
                    z6 = this.admob;
                    if (z5 == z6) {
                        i = c9185l2.billing;
                        if (i != 4) {
                            if (i == 5) {
                                c9185l2.billing = 3;
                            }
                        } else if (i == 5) {
                            c9185l2.billing = 3;
                        }
                    } else {
                        i = c9185l2.billing;
                        if (i != 4) {
                            if (i == 5) {
                                c9185l2.billing = 3;
                            }
                        } else if (i == 5) {
                            c9185l2.billing = 3;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z7 && c9185l2.billing == 3 && (c9185l = this.mopub) != null) {
                    ?? r1 = c9185l.yandex;
                    int size3 = r1.size();
                    ?? r4 = c9185l2.yandex;
                    if (size3 != r4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!C1187l.loadAd(((C15730l) r1.get(r5)).crashlytics, ((C15730l) r4.get(r5)).crashlytics)) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.mopub = c9185l2;
                return z4;
            }
        }
        return true;
    }
}
