package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lَۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10664l extends C11338l {

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public int f21633l;

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public boolean f21634l;

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public C17375l[] f21635l;

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final C4847l f21636l;

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public boolean f21637l;

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public WeakReference f21638l;

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final HashSet f21639l;

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final C9379l f21640l;

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final C5390l f21641l;

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public WeakReference f21642l;

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public boolean f21643l;

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public int f21644l;

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public int f21645l;

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public WeakReference f21646l;

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public WeakReference f21647l;

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public C17375l[] f21648l;

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public int f21649l;

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public C16827l f21650l;

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public int f21651l;

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public int f21652l;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public ArrayList f21654return = new ArrayList();

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final C18449l f21653l = new C18449l(this);

    public C10664l() {
        C5390l c5390l = new C5390l();
        c5390l.f11538l = true;
        c5390l.f11544l = true;
        c5390l.f11542l = new ArrayList();
        new ArrayList();
        c5390l.f11539l = null;
        c5390l.f11540l = new C9379l();
        c5390l.f11541l = new ArrayList();
        c5390l.f11543l = this;
        c5390l.f11545l = this;
        this.f21641l = c5390l;
        this.f21650l = null;
        this.f21637l = false;
        this.f21636l = new C4847l();
        this.f21645l = 0;
        this.f21633l = 0;
        this.f21635l = new C17375l[4];
        this.f21648l = new C17375l[4];
        this.f21649l = 257;
        this.f21634l = false;
        this.f21643l = false;
        this.f21642l = null;
        this.f21638l = null;
        this.f21646l = null;
        this.f21647l = null;
        this.f21639l = new HashSet();
        this.f21640l = new C9379l();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static void m2936case(C11338l c11338l, C16827l c16827l, C9379l c9379l) {
        int i;
        int i2;
        if (c16827l == null) {
            return;
        }
        int i3 = c11338l.f22862public;
        int[] iArr = c11338l.tapsense;
        if (i3 == 8 || (c11338l instanceof C10526l) || (c11338l instanceof C0051l)) {
            c9379l.purchase = 0;
            c9379l.billing = 0;
            return;
        }
        int[] iArr2 = c11338l.f22844const;
        c9379l.yandex = iArr2[0];
        c9379l.loadAd = iArr2[1];
        c9379l.crashlytics = c11338l.metrica();
        c9379l.amazon = c11338l.subs();
        c9379l.subs = false;
        c9379l.isPro = 0;
        boolean z = c9379l.yandex == 3;
        boolean z2 = c9379l.loadAd == 3;
        boolean z3 = z && c11338l.f22856interface > 0.0f;
        boolean z4 = z2 && c11338l.f22856interface > 0.0f;
        if (z && c11338l.ads(0) && c11338l.ads == 0 && !z3) {
            c9379l.yandex = 2;
            if (z2 && c11338l.subscription == 0) {
                c9379l.yandex = 1;
            }
            z = false;
        }
        if (z2 && c11338l.ads(1) && c11338l.subscription == 0 && !z4) {
            c9379l.loadAd = 2;
            if (z && c11338l.ads == 0) {
                c9379l.loadAd = 1;
            }
            z2 = false;
        }
        if (c11338l.advert()) {
            c9379l.yandex = 1;
            z = false;
        }
        if (c11338l.isVip()) {
            c9379l.loadAd = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c9379l.yandex = 1;
            } else if (!z2) {
                if (c9379l.loadAd == 1) {
                    i2 = c9379l.amazon;
                } else {
                    c9379l.yandex = 2;
                    c16827l.loadAd(c11338l, c9379l);
                    i2 = c9379l.billing;
                }
                c9379l.yandex = 1;
                c9379l.crashlytics = (int) (c11338l.f22856interface * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c9379l.loadAd = 1;
            } else if (!z) {
                if (c9379l.yandex == 1) {
                    i = c9379l.crashlytics;
                } else {
                    c9379l.loadAd = 2;
                    c16827l.loadAd(c11338l, c9379l);
                    i = c9379l.purchase;
                }
                c9379l.loadAd = 1;
                int i4 = c11338l.f22863static;
                float f = c11338l.f22856interface;
                if (i4 == -1) {
                    c9379l.amazon = (int) (i / f);
                } else {
                    c9379l.amazon = (int) (f * i);
                }
            }
        }
        c16827l.loadAd(c11338l, c9379l);
        c11338l.m3059native(c9379l.purchase);
        c11338l.m3062synchronized(c9379l.billing);
        c11338l.inmobi = c9379l.admob;
        int i5 = c9379l.mopub;
        c11338l.f22858new = i5;
        c11338l.inmobi = i5 > 0;
        c9379l.isPro = 0;
    }

    @Override // defpackage.C11338l
    public final void applovin(C0554l c0554l) {
        super.applovin(c0554l);
        int size = this.f21654return.size();
        for (int i = 0; i < size; i++) {
            ((C11338l) this.f21654return.get(i)).applovin(c0554l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean m2937catch(int i, boolean z) {
        boolean z2;
        C5390l c5390l = this.f21641l;
        ArrayList<AbstractC14648l> arrayList = c5390l.f11542l;
        C10664l c10664l = (C10664l) c5390l.f11543l;
        boolean z3 = false;
        int iAdmob = c10664l.admob(0);
        int iAdmob2 = c10664l.admob(1);
        int iStartapp = c10664l.startapp();
        int iAdcel = c10664l.adcel();
        if (z && (iAdmob == 2 || iAdmob2 == 2)) {
            for (AbstractC14648l abstractC14648l : arrayList) {
                if (abstractC14648l.billing == i && !abstractC14648l.firebase()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iAdmob == 2) {
                    c10664l.m3061strictfp(1);
                    c10664l.m3059native(c5390l.purchase(c10664l, 0));
                    c10664l.amazon.purchase.amazon(c10664l.metrica());
                }
            } else if (z && iAdmob2 == 2) {
                c10664l.m3064volatile(1);
                c10664l.m3062synchronized(c5390l.purchase(c10664l, 1));
                c10664l.purchase.purchase.amazon(c10664l.subs());
            }
        }
        int[] iArr = c10664l.f22844const;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iMetrica = c10664l.metrica() + iStartapp;
                c10664l.amazon.subs.amazon(iMetrica);
                c10664l.amazon.purchase.amazon(iMetrica - iStartapp);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iSubs = c10664l.subs() + iAdcel;
                c10664l.purchase.subs.amazon(iSubs);
                c10664l.purchase.purchase.amazon(iSubs - iAdcel);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c5390l.admob();
        for (AbstractC14648l abstractC14648l2 : arrayList) {
            if (abstractC14648l2.billing == i && (abstractC14648l2.loadAd != c10664l || abstractC14648l2.mopub)) {
                abstractC14648l2.purchase();
            }
        }
        for (AbstractC14648l abstractC14648l3 : arrayList) {
            if (abstractC14648l3.billing == i && (z2 || abstractC14648l3.loadAd != c10664l)) {
                if (!abstractC14648l3.admob.isPro || !abstractC14648l3.subs.isPro || (!(abstractC14648l3 instanceof C8229l) && !abstractC14648l3.purchase.isPro)) {
                    c10664l.m3061strictfp(iAdmob);
                    c10664l.m3064volatile(iAdmob2);
                    return z3;
                }
            }
        }
        z3 = true;
        c10664l.m3061strictfp(iAdmob);
        c10664l.m3064volatile(iAdmob2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:352:0x0603  */
    /* JADX WARN: Code duplicated, block: B:366:0x0632  */
    /* JADX WARN: Code duplicated, block: B:384:0x0666 A[PHI: r31
  0x0666: PHI (r31v1 lٔ٘ؔ) = (r31v0 lٔ٘ؔ), (r31v11 lٔ٘ؔ), (r31v11 lٔ٘ؔ) binds: [B:151:0x0260, B:336:0x05cf, B:368:0x0635] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:470:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:472:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:474:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:476:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:479:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:481:0x0807 A[LOOP:34: B:480:0x0805->B:481:0x0807, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:485:0x081b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:490:0x0828 A[LOOP:33: B:489:0x0826->B:490:0x0828, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:493:0x085c  */
    /* JADX WARN: Code duplicated, block: B:497:0x086e  */
    /* JADX WARN: Code duplicated, block: B:502:0x088e  */
    /* JADX WARN: Code duplicated, block: B:503:0x089b  */
    /* JADX WARN: Code duplicated, block: B:506:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:507:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:509:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:511:0x08c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:517:0x08d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:524:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:525:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [lَۣؗ, lُۜؒ] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v118, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v86, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v69, types: [int] */
    /* JADX WARN: Type inference failed for: r6v82, types: [int] */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m2938else() {
        ?? r22;
        C14946l c14946l;
        int i;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        boolean[] zArr;
        boolean[] zArr2;
        int i2;
        boolean z4;
        int iMax;
        ?? r5;
        ?? r18;
        boolean z5;
        int iMax2;
        ?? r14;
        boolean z6;
        boolean z7;
        ?? r15;
        ?? r13;
        int i3;
        boolean z8;
        boolean z9;
        boolean z10;
        ?? r16;
        ?? r17;
        int i4;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zM2941switch;
        int size;
        int i5;
        boolean z11;
        C11338l c11338l;
        boolean z12;
        C9998l c9998l;
        C9998l c9998l2;
        int iLoadAd;
        int i6;
        C9998l c9998l3;
        C9998l c9998l4;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        boolean z14;
        this.f22846default = 0;
        this.f22849final = 0;
        this.f21634l = false;
        this.f21643l = false;
        int size2 = this.f21654return.size();
        int iMax7 = Math.max(0, metrica());
        int iMax8 = Math.max(0, subs());
        int[] iArr = this.f22844const;
        int i8 = iArr[1];
        int i9 = iArr[0];
        int i10 = this.f21652l;
        C14946l c14946l2 = this.f22864strictfp;
        C14946l c14946l3 = this.f22867synchronized;
        if (i10 == 0 && AbstractC15096l.billing(this.f21649l, 1)) {
            C16827l c16827l = this.f21650l;
            int i11 = iArr[0];
            int i12 = iArr[1];
            premium();
            ArrayList arrayList3 = this.f21654return;
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((C11338l) arrayList3.get(i13)).premium();
            }
            boolean z15 = this.f21637l;
            if (i11 == 1) {
                m3063throws(0, metrica());
            } else {
                c14946l3.subs(0);
                this.f22846default = 0;
            }
            int i14 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i14 < size3) {
                int[] iArr2 = iArr;
                C11338l c11338l2 = (C11338l) arrayList3.get(i14);
                int i15 = i14;
                if (c11338l2 instanceof C10526l) {
                    C10526l c10526l = (C10526l) c11338l2;
                    z14 = z16;
                    if (c10526l.f21416l == 1) {
                        int i16 = c10526l.f21418l;
                        if (i16 != -1) {
                            c10526l.m2929for(i16);
                        } else if (c10526l.f21415l != -1 && advert()) {
                            c10526l.m2929for(metrica() - c10526l.f21415l);
                        } else if (advert()) {
                            c10526l.m2929for((int) ((c10526l.f21419return * metrica()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else {
                    z14 = z16;
                    if ((c11338l2 instanceof C0051l) && ((C0051l) c11338l2).m261catch() == 0) {
                        z16 = z14;
                        z17 = true;
                    }
                    i14 = i15 + 1;
                    iArr = iArr2;
                }
                z16 = z14;
                i14 = i15 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z16) {
                for (int i17 = 0; i17 < size3; i17 = i7 + 1) {
                    C11338l c11338l3 = (C11338l) arrayList3.get(i17);
                    if (c11338l3 instanceof C10526l) {
                        C10526l c10526l2 = (C10526l) c11338l3;
                        i7 = i17;
                        if (c10526l2.f21416l == 1) {
                            AbstractC10464l.admob(0, c16827l, c10526l2, z15);
                        }
                    } else {
                        i7 = i17;
                    }
                }
            }
            AbstractC10464l.admob(0, c16827l, this, z15);
            if (z17) {
                for (int i18 = 0; i18 < size3; i18++) {
                    C11338l c11338l4 = (C11338l) arrayList3.get(i18);
                    if (c11338l4 instanceof C0051l) {
                        C0051l c0051l = (C0051l) c11338l4;
                        if (c0051l.m261catch() == 0 && c0051l.m263throw()) {
                            AbstractC10464l.admob(1, c16827l, c0051l, z15);
                        }
                    }
                }
            }
            if (i12 == 1) {
                m3060package(0, subs());
            } else {
                c14946l2.subs(0);
                this.f22849final = 0;
            }
            int i19 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i19 < size3) {
                C11338l c11338l5 = (C11338l) arrayList3.get(i19);
                int i20 = i19;
                if (c11338l5 instanceof C10526l) {
                    C10526l c10526l3 = (C10526l) c11338l5;
                    if (c10526l3.f21416l == 0) {
                        int i21 = c10526l3.f21418l;
                        if (i21 != -1) {
                            c10526l3.m2929for(i21);
                        } else if (c10526l3.f21415l != -1 && isVip()) {
                            c10526l3.m2929for(subs() - c10526l3.f21415l);
                        } else if (isVip()) {
                            c10526l3.m2929for((int) ((c10526l3.f21419return * subs()) + 0.5f));
                        }
                        z18 = true;
                    }
                } else if ((c11338l5 instanceof C0051l) && ((C0051l) c11338l5).m261catch() == 1) {
                    z19 = true;
                }
                i19 = i20 + 1;
            }
            if (z18) {
                for (int i22 = 0; i22 < size3; i22++) {
                    C11338l c11338l6 = (C11338l) arrayList3.get(i22);
                    if (c11338l6 instanceof C10526l) {
                        C10526l c10526l4 = (C10526l) c11338l6;
                        if (c10526l4.f21416l == 0) {
                            AbstractC10464l.remoteconfig(1, c16827l, c10526l4);
                        }
                    }
                }
            }
            AbstractC10464l.remoteconfig(0, c16827l, this);
            if (z19) {
                for (int i23 = 0; i23 < size3; i23++) {
                    C11338l c11338l7 = (C11338l) arrayList3.get(i23);
                    if (c11338l7 instanceof C0051l) {
                        C0051l c0051l2 = (C0051l) c11338l7;
                        if (c0051l2.m261catch() == 1 && c0051l2.m263throw()) {
                            AbstractC10464l.remoteconfig(1, c16827l, c0051l2);
                        }
                    }
                }
            }
            for (int i24 = 0; i24 < size3; i24++) {
                C11338l c11338l8 = (C11338l) arrayList3.get(i24);
                if (c11338l8.ad() && AbstractC10464l.purchase(c11338l8)) {
                    m2936case(c11338l8, c16827l, AbstractC10464l.yandex);
                    if (!(c11338l8 instanceof C10526l)) {
                        AbstractC10464l.admob(0, c16827l, c11338l8, z15);
                        AbstractC10464l.remoteconfig(0, c16827l, c11338l8);
                    } else if (((C10526l) c11338l8).f21416l == 0) {
                        AbstractC10464l.remoteconfig(0, c16827l, c11338l8);
                    } else {
                        AbstractC10464l.admob(0, c16827l, c11338l8, z15);
                    }
                }
            }
            for (int i25 = 0; i25 < size2; i25++) {
                C11338l c11338l9 = (C11338l) this.f21654return.get(i25);
                if (c11338l9.ad() && !(c11338l9 instanceof C10526l) && !(c11338l9 instanceof C0051l)) {
                    int iAdmob = c11338l9.admob(0);
                    int iAdmob2 = c11338l9.admob(1);
                    if (iAdmob != 3 || c11338l9.ads == 1 || iAdmob2 != 3 || c11338l9.subscription == 1) {
                        m2936case(c11338l9, this.f21650l, new C9379l());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        C4847l c4847l = this.f21636l;
        if (size2 <= 2 || !((i9 == 2 || i8 == 2) && AbstractC15096l.billing(this.f21649l, 1024))) {
            c14946l = c14946l3;
            i = iMax7;
            z = false;
        } else {
            C16827l c16827l2 = this.f21650l;
            ArrayList arrayList4 = this.f21654return;
            int size4 = arrayList4.size();
            int i26 = 0;
            while (true) {
                if (i26 < size4) {
                    C11338l c11338l10 = (C11338l) arrayList4.get(i26);
                    ?? r6 = r22[0];
                    ?? r7 = r22[1];
                    int[] iArr3 = c11338l10.f22844const;
                    int i27 = i26;
                    if (AbstractC1889l.admob(r6, r7, iArr3[0], iArr3[1])) {
                        i26 = i27 + 1;
                    } else {
                        c14946l = c14946l3;
                        i = iMax7;
                        z = false;
                    }
                } else {
                    int i28 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList<C0051l> arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i28 < size4) {
                        int i29 = i28;
                        C11338l c11338l11 = (C11338l) arrayList4.get(i28);
                        ArrayList arrayList11 = arrayList5;
                        ?? r8 = r22[0];
                        ArrayList arrayList12 = arrayList6;
                        ?? r9 = r22[1];
                        ArrayList arrayList13 = arrayList7;
                        int[] iArr4 = c11338l11.f22844const;
                        C14946l c14946l4 = c14946l3;
                        if (!AbstractC1889l.admob(r8, r9, iArr4[0], iArr4[1])) {
                            m2936case(c11338l11, c16827l2, this.f21640l);
                        }
                        boolean z20 = c11338l11 instanceof C10526l;
                        if (z20) {
                            C10526l c10526l5 = (C10526l) c11338l11;
                            if (c10526l5.f21416l == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(c10526l5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z13 = z20;
                            if (c10526l5.f21416l == 1) {
                                arrayList = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList.add(c10526l5);
                            } else {
                                arrayList = arrayList11;
                            }
                        } else {
                            z13 = z20;
                            arrayList = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (!(c11338l11 instanceof C0051l)) {
                            arrayList6 = arrayList12;
                        } else if (c11338l11 instanceof C0051l) {
                            C0051l c0051l3 = (C0051l) c11338l11;
                            if (c0051l3.m261catch() == 0) {
                                arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList2.add(c0051l3);
                            } else {
                                arrayList2 = arrayList12;
                            }
                            if (c0051l3.m261catch() == 1) {
                                ArrayList arrayList14 = arrayList8 == null ? new ArrayList() : arrayList8;
                                arrayList14.add(c0051l3);
                                arrayList8 = arrayList14;
                            }
                            arrayList6 = arrayList2;
                        } else {
                            C0051l c0051l4 = (C0051l) c11338l11;
                            arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                            arrayList6.add(c0051l4);
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            ArrayList arrayList15 = arrayList8;
                            arrayList15.add(c0051l4);
                            arrayList8 = arrayList15;
                        }
                        if (c11338l11.f22867synchronized.billing == null && c11338l11.f22873volatile.billing == null && !z13 && !(c11338l11 instanceof C0051l)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList9;
                            arrayList16.add(c11338l11);
                            arrayList9 = arrayList16;
                        }
                        if (c11338l11.f22864strictfp.billing == null && c11338l11.f22857native.billing == null && c11338l11.f22860private.billing == null && !z13 && !(c11338l11 instanceof C0051l)) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList17 = arrayList10;
                            arrayList17.add(c11338l11);
                            arrayList10 = arrayList17;
                        }
                        i28 = i29 + 1;
                        arrayList5 = arrayList;
                        c14946l3 = c14946l4;
                        c16827l2 = c16827l2;
                    }
                    ArrayList arrayList18 = arrayList5;
                    ArrayList<C0051l> arrayList19 = arrayList6;
                    c14946l = c14946l3;
                    ArrayList arrayList20 = arrayList7;
                    ArrayList<C9998l> arrayList21 = new ArrayList();
                    if (arrayList18 != null) {
                        Iterator it = arrayList18.iterator();
                        while (it.hasNext()) {
                            AbstractC1889l.billing((C10526l) it.next(), 0, arrayList21, null);
                        }
                    }
                    C9998l c9998l5 = null;
                    int i30 = 0;
                    if (arrayList19 != null) {
                        for (C0051l c0051l5 : arrayList19) {
                            C9998l c9998lBilling = AbstractC1889l.billing(c0051l5, i30, arrayList21, c9998l5);
                            c0051l5.m262for(i30, c9998lBilling, arrayList21);
                            c9998lBilling.yandex(arrayList21);
                            c9998l5 = null;
                            i30 = 0;
                        }
                    }
                    HashSet hashSet = mopub(2).yandex;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it2.next()).amazon, 0, arrayList21, null);
                        }
                    }
                    HashSet hashSet2 = mopub(4).yandex;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it3.next()).amazon, 0, arrayList21, null);
                        }
                    }
                    HashSet hashSet3 = mopub(7).yandex;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it4.next()).amazon, 0, arrayList21, null);
                        }
                    }
                    C9998l c9998l6 = null;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            AbstractC1889l.billing((C11338l) it5.next(), 0, arrayList21, null);
                        }
                    }
                    if (arrayList20 != null) {
                        Iterator it6 = arrayList20.iterator();
                        while (it6.hasNext()) {
                            AbstractC1889l.billing((C10526l) it6.next(), 1, arrayList21, null);
                        }
                    }
                    int i31 = 1;
                    if (arrayList8 != null) {
                        for (C0051l c0051l6 : arrayList8) {
                            C9998l c9998lBilling2 = AbstractC1889l.billing(c0051l6, i31, arrayList21, c9998l6);
                            c0051l6.m262for(i31, c9998lBilling2, arrayList21);
                            c9998lBilling2.yandex(arrayList21);
                            c9998l6 = null;
                            i31 = 1;
                        }
                    }
                    HashSet hashSet4 = mopub(3).yandex;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it7.next()).amazon, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet5 = mopub(6).yandex;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it8.next()).amazon, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet6 = mopub(5).yandex;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it9.next()).amazon, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet7 = mopub(7).yandex;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC1889l.billing(((C14946l) it10.next()).amazon, 1, arrayList21, null);
                        }
                    }
                    boolean z21 = true;
                    if (arrayList10 != null) {
                        Iterator it11 = arrayList10.iterator();
                        while (it11.hasNext()) {
                            AbstractC1889l.billing((C11338l) it11.next(), 1, arrayList21, null);
                        }
                    }
                    int i32 = 0;
                    while (i32 < size4) {
                        C11338l c11338l12 = (C11338l) arrayList4.get(i32);
                        int[] iArr5 = c11338l12.f22844const;
                        boolean z22 = z21;
                        if (iArr5[0] == 3 && iArr5[z22 ? 1 : 0] == 3) {
                            int i33 = c11338l12.f22874while;
                            int size5 = arrayList21.size();
                            int i34 = 0;
                            while (true) {
                                if (i34 >= size5) {
                                    i6 = i32;
                                    c9998l3 = null;
                                    break;
                                }
                                i6 = i32;
                                c9998l3 = (C9998l) arrayList21.get(i34);
                                int i35 = size5;
                                if (i33 == c9998l3.loadAd) {
                                    break;
                                }
                                i34++;
                                size5 = i35;
                                i32 = i6;
                            }
                            int i36 = c11338l12.f22853implements;
                            int size6 = arrayList21.size();
                            int i37 = 0;
                            while (true) {
                                if (i37 >= size6) {
                                    c9998l4 = null;
                                    break;
                                }
                                c9998l4 = (C9998l) arrayList21.get(i37);
                                int i38 = size6;
                                if (i36 == c9998l4.loadAd) {
                                    break;
                                }
                                i37++;
                                size6 = i38;
                            }
                            if (c9998l3 != null && c9998l4 != null) {
                                c9998l3.crashlytics(0, c9998l4);
                                c9998l4.crashlytics = 2;
                                arrayList21.remove(c9998l3);
                            }
                        } else {
                            i6 = i32;
                        }
                        i32 = i6 + 1;
                        z21 = true;
                    }
                    if (arrayList21.size() <= 1) {
                        i = iMax7;
                        z = false;
                    } else {
                        int i39 = 0;
                        if (r22[0] == 2) {
                            int i40 = 0;
                            c9998l = null;
                            for (C9998l c9998l7 : arrayList21) {
                                if (c9998l7.crashlytics != 1) {
                                    int iLoadAd2 = c9998l7.loadAd(c4847l, i39);
                                    if (iLoadAd2 > i40) {
                                        c9998l = c9998l7;
                                        i40 = iLoadAd2;
                                    }
                                    i39 = 0;
                                }
                            }
                            if (c9998l != null) {
                                m3061strictfp(1);
                                m3059native(i40);
                            } else {
                                c9998l = null;
                            }
                        } else {
                            c9998l = null;
                        }
                        if (r22[1] == 2) {
                            int i41 = 0;
                            c9998l2 = null;
                            for (C9998l c9998l8 : arrayList21) {
                                if (c9998l8.crashlytics != 0 && (iLoadAd = c9998l8.loadAd(c4847l, 1)) > i41) {
                                    c9998l2 = c9998l8;
                                    i41 = iLoadAd;
                                }
                            }
                            if (c9998l2 != null) {
                                m3064volatile(1);
                                m3062synchronized(i41);
                            } else {
                                c9998l2 = null;
                            }
                        } else {
                            c9998l2 = null;
                        }
                        if (c9998l == null && c9998l2 == null) {
                            i = iMax7;
                            z = false;
                        } else {
                            if (i9 == 2) {
                                if (iMax7 >= metrica() || iMax7 <= 0) {
                                    iMax7 = metrica();
                                } else {
                                    m3059native(iMax7);
                                    this.f21634l = true;
                                }
                            }
                            if (i8 == 2) {
                                if (iMax8 >= subs() || iMax8 <= 0) {
                                    iMax8 = subs();
                                } else {
                                    m3062synchronized(iMax8);
                                    this.f21643l = true;
                                }
                            }
                            i = iMax7;
                            z = true;
                        }
                    }
                }
            }
        }
        boolean z23 = m2941switch(64) || m2941switch(128);
        c4847l.getClass();
        c4847l.admob = false;
        if (this.f21649l == 0 || !z23) {
            c = 1;
        } else {
            c = 1;
            c4847l.admob = true;
        }
        ArrayList arrayList22 = this.f21654return;
        boolean z24 = r22[0] == 2 || r22[c] == 2;
        this.f21645l = 0;
        this.f21633l = 0;
        for (int i42 = 0; i42 < size2; i42++) {
            C11338l c11338l13 = (C11338l) this.f21654return.get(i42);
            if (c11338l13 instanceof C10664l) {
                ((C10664l) c11338l13).m2938else();
            }
        }
        boolean zM2941switch2 = m2941switch(64);
        ?? r19 = z;
        int i43 = 0;
        boolean z25 = true;
        while (z25) {
            int i44 = i43 + 1;
            try {
                c4847l.tapsense();
                this.f21645l = 0;
                this.f21633l = 0;
                purchase(c4847l);
                for (int i45 = 0; i45 < size2; i45++) {
                    ((C11338l) this.f21654return.get(i45)).purchase(c4847l);
                }
                m2942throw(c4847l);
                try {
                    WeakReference weakReference = this.f21642l;
                    if (weakReference == null || weakReference.get() == null) {
                        z2 = z24;
                    } else {
                        z2 = z24;
                        try {
                            c4847l.billing(c4847l.firebase((C14946l) this.f21642l.get()), c4847l.firebase(c14946l2), 0, 5);
                            this.f21642l = null;
                        } catch (Exception e) {
                            e = e;
                            z12 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z3 = z12;
                            zArr = AbstractC15096l.yandex;
                            if (z3) {
                                zArr[2] = false;
                                zM2941switch = m2941switch(64);
                                mo2928extends(c4847l, zM2941switch);
                                size = this.f21654return.size();
                                i5 = 0;
                                z11 = false;
                                while (i5 < size) {
                                    c11338l = (C11338l) this.f21654return.get(i5);
                                    c11338l.mo2928extends(c4847l, zM2941switch);
                                    boolean[] zArr3 = zArr;
                                    boolean z26 = zM2941switch;
                                    if (c11338l.admob == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    i5++;
                                    zArr = zArr3;
                                    zM2941switch = z26;
                                    z11 = z11;
                                }
                                zArr2 = zArr;
                                z4 = z11;
                            } else {
                                zArr2 = zArr;
                                mo2928extends(c4847l, zM2941switch2);
                                for (i2 = 0; i2 < size2; i2++) {
                                    ((C11338l) this.f21654return.get(i2)).mo2928extends(c4847l, zM2941switch2);
                                }
                                z4 = false;
                            }
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i4 = 0; i4 < size2; i4++) {
                                    C11338l c11338l14 = (C11338l) this.f21654return.get(i4);
                                    iMax3 = Math.max(iMax3, c11338l14.metrica() + c11338l14.f22846default);
                                    iMax4 = Math.max(iMax4, c11338l14.subs() + c11338l14.f22849final);
                                }
                                iMax5 = Math.max(this.f22852goto, iMax3);
                                iMax6 = Math.max(this.f22865super, iMax4);
                                r19 = r19;
                                z4 = z4;
                                if (i9 == 2) {
                                    r19 = r19;
                                    z4 = z4;
                                    m3059native(iMax5);
                                    r22[0] = 2;
                                    r19 = 1;
                                    z4 = true;
                                }
                                if (i8 == 2) {
                                    m3062synchronized(iMax6);
                                    r22[1] = 2;
                                    r19 = 1;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.f22852goto, metrica());
                            if (iMax > metrica()) {
                                m3059native(iMax);
                                r5 = 1;
                                r22[0] = 1;
                                z5 = true;
                                r18 = 1;
                            } else {
                                r5 = 1;
                                r18 = r19;
                                z5 = z4;
                            }
                            iMax2 = Math.max(this.f22865super, subs());
                            if (iMax2 > subs()) {
                                m3062synchronized(iMax2);
                                r22[r5] = r5;
                                r17 = r5;
                                z6 = r17 == true ? 1 : 0;
                            } else {
                                r14 = r18;
                            }
                            if (r14 == 0) {
                                z6 = z5;
                                if (r22[0] == 2) {
                                    r16 = r14;
                                    z10 = z6;
                                    if (metrica() > i) {
                                        this.f21634l = r5;
                                        r22[0] = r5;
                                        m3059native(i);
                                        ?? r110 = r5;
                                        z10 = r110 == true ? 1 : 0;
                                        r16 = r110;
                                    }
                                }
                                r14 = r17;
                                r16 = r14;
                                r16 = r14;
                                z10 = z6;
                                z10 = z6;
                                r15 = r16;
                                r15 = r16;
                                z7 = z10;
                                z7 = z10;
                                if (r22[r5] != 2) {
                                }
                                if (i44 > i3) {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = false;
                                } else {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = z8;
                                }
                                i43 = i44;
                                z24 = z2;
                                c14946l2 = c14946l2;
                                r19 = r13;
                                z25 = z9;
                            } else {
                                z6 = z5;
                                r14 = r17;
                                r15 = r14;
                                z7 = z6;
                            }
                            r15 = r16;
                            z7 = z10;
                            r13 = r15;
                            i3 = 8;
                            z8 = z7;
                            if (i44 > i3) {
                                r15 = r16;
                                z7 = z10;
                                z9 = false;
                            } else {
                                r15 = r16;
                                z7 = z10;
                                z9 = z8;
                            }
                            i43 = i44;
                            z24 = z2;
                            c14946l2 = c14946l2;
                            r19 = r13;
                            z25 = z9;
                        }
                    }
                    WeakReference weakReference2 = this.f21646l;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c4847l.billing(c4847l.firebase(this.f22857native), c4847l.firebase((C14946l) this.f21646l.get()), 0, 5);
                        this.f21646l = null;
                    }
                    WeakReference weakReference3 = this.f21638l;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        C14946l c14946l5 = c14946l;
                        try {
                            c14946l = c14946l5;
                            c4847l.billing(c4847l.firebase((C14946l) this.f21638l.get()), c4847l.firebase(c14946l5), 0, 5);
                            this.f21638l = null;
                        } catch (Exception e2) {
                            e = e2;
                            c14946l = c14946l5;
                            z12 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z3 = z12;
                            zArr = AbstractC15096l.yandex;
                            if (z3) {
                                zArr[2] = false;
                                zM2941switch = m2941switch(64);
                                mo2928extends(c4847l, zM2941switch);
                                size = this.f21654return.size();
                                i5 = 0;
                                z11 = false;
                                while (i5 < size) {
                                    c11338l = (C11338l) this.f21654return.get(i5);
                                    c11338l.mo2928extends(c4847l, zM2941switch);
                                    boolean[] zArr4 = zArr;
                                    boolean z27 = zM2941switch;
                                    if (c11338l.admob == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    i5++;
                                    zArr = zArr4;
                                    zM2941switch = z27;
                                    z11 = z11;
                                }
                                zArr2 = zArr;
                                z4 = z11;
                            } else {
                                zArr2 = zArr;
                                mo2928extends(c4847l, zM2941switch2);
                                while (i2 < size2) {
                                    ((C11338l) this.f21654return.get(i2)).mo2928extends(c4847l, zM2941switch2);
                                }
                                z4 = false;
                            }
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i4 < size2) {
                                    C11338l c11338l15 = (C11338l) this.f21654return.get(i4);
                                    iMax3 = Math.max(iMax3, c11338l15.metrica() + c11338l15.f22846default);
                                    iMax4 = Math.max(iMax4, c11338l15.subs() + c11338l15.f22849final);
                                }
                                iMax5 = Math.max(this.f22852goto, iMax3);
                                iMax6 = Math.max(this.f22865super, iMax4);
                                r19 = r19;
                                z4 = z4;
                                if (i9 == 2) {
                                    r19 = r19;
                                    z4 = z4;
                                    m3059native(iMax5);
                                    r22[0] = 2;
                                    r19 = 1;
                                    z4 = true;
                                }
                                if (i8 == 2) {
                                    m3062synchronized(iMax6);
                                    r22[1] = 2;
                                    r19 = 1;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.f22852goto, metrica());
                            if (iMax > metrica()) {
                                m3059native(iMax);
                                r5 = 1;
                                r22[0] = 1;
                                z5 = true;
                                r18 = 1;
                            } else {
                                r5 = 1;
                                r18 = r19;
                                z5 = z4;
                            }
                            iMax2 = Math.max(this.f22865super, subs());
                            if (iMax2 > subs()) {
                                m3062synchronized(iMax2);
                                r22[r5] = r5;
                                r17 = r5;
                                z6 = r17 == true ? 1 : 0;
                            } else {
                                r14 = r18;
                            }
                            if (r14 == 0) {
                                z6 = z5;
                                if (r22[0] == 2) {
                                    r16 = r14;
                                    z10 = z6;
                                    if (metrica() > i) {
                                        this.f21634l = r5;
                                        r22[0] = r5;
                                        m3059native(i);
                                        ?? r111 = r5;
                                        z10 = r111 == true ? 1 : 0;
                                        r16 = r111;
                                    }
                                }
                                r14 = r17;
                                r16 = r14;
                                r16 = r14;
                                z10 = z6;
                                z10 = z6;
                                r15 = r16;
                                r15 = r16;
                                z7 = z10;
                                z7 = z10;
                                if (r22[r5] != 2) {
                                }
                                if (i44 > i3) {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = false;
                                } else {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = z8;
                                }
                                i43 = i44;
                                z24 = z2;
                                c14946l2 = c14946l2;
                                r19 = r13;
                                z25 = z9;
                            } else {
                                z6 = z5;
                                r14 = r17;
                                r15 = r14;
                                z7 = z6;
                            }
                            r15 = r16;
                            z7 = z10;
                            r13 = r15;
                            i3 = 8;
                            z8 = z7;
                            if (i44 > i3) {
                                r15 = r16;
                                z7 = z10;
                                z9 = false;
                            } else {
                                r15 = r16;
                                z7 = z10;
                                z9 = z8;
                            }
                            i43 = i44;
                            z24 = z2;
                            c14946l2 = c14946l2;
                            r19 = r13;
                            z25 = z9;
                        }
                    }
                    WeakReference weakReference4 = this.f21647l;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        try {
                            try {
                                c4847l.billing(c4847l.firebase(this.f22873volatile), c4847l.firebase((C14946l) this.f21647l.get()), 0, 5);
                                try {
                                    this.f21647l = null;
                                } catch (Exception e3) {
                                    e = e3;
                                    z12 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z3 = z12;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z12 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z3 = z12;
                                zArr = AbstractC15096l.yandex;
                                if (z3) {
                                    zArr[2] = false;
                                    zM2941switch = m2941switch(64);
                                    mo2928extends(c4847l, zM2941switch);
                                    size = this.f21654return.size();
                                    i5 = 0;
                                    z11 = false;
                                    while (i5 < size) {
                                        c11338l = (C11338l) this.f21654return.get(i5);
                                        c11338l.mo2928extends(c4847l, zM2941switch);
                                        boolean[] zArr5 = zArr;
                                        boolean z28 = zM2941switch;
                                        if (c11338l.admob == -1) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        i5++;
                                        zArr = zArr5;
                                        zM2941switch = z28;
                                        z11 = z11;
                                    }
                                    zArr2 = zArr;
                                    z4 = z11;
                                } else {
                                    zArr2 = zArr;
                                    mo2928extends(c4847l, zM2941switch2);
                                    while (i2 < size2) {
                                        ((C11338l) this.f21654return.get(i2)).mo2928extends(c4847l, zM2941switch2);
                                    }
                                    z4 = false;
                                }
                                if (z2) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i4 < size2) {
                                        C11338l c11338l16 = (C11338l) this.f21654return.get(i4);
                                        iMax3 = Math.max(iMax3, c11338l16.metrica() + c11338l16.f22846default);
                                        iMax4 = Math.max(iMax4, c11338l16.subs() + c11338l16.f22849final);
                                    }
                                    iMax5 = Math.max(this.f22852goto, iMax3);
                                    iMax6 = Math.max(this.f22865super, iMax4);
                                    r19 = r19;
                                    z4 = z4;
                                    if (i9 == 2) {
                                        r19 = r19;
                                        z4 = z4;
                                        m3059native(iMax5);
                                        r22[0] = 2;
                                        r19 = 1;
                                        z4 = true;
                                    }
                                    if (i8 == 2) {
                                        m3062synchronized(iMax6);
                                        r22[1] = 2;
                                        r19 = 1;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.f22852goto, metrica());
                                if (iMax > metrica()) {
                                    m3059native(iMax);
                                    r5 = 1;
                                    r22[0] = 1;
                                    z5 = true;
                                    r18 = 1;
                                } else {
                                    r5 = 1;
                                    r18 = r19;
                                    z5 = z4;
                                }
                                iMax2 = Math.max(this.f22865super, subs());
                                if (iMax2 > subs()) {
                                    m3062synchronized(iMax2);
                                    r22[r5] = r5;
                                    r17 = r5;
                                    z6 = r17 == true ? 1 : 0;
                                } else {
                                    r14 = r18;
                                }
                                if (r14 == 0) {
                                    z6 = z5;
                                    if (r22[0] == 2) {
                                        r16 = r14;
                                        z10 = z6;
                                        if (metrica() > i) {
                                            this.f21634l = r5;
                                            r22[0] = r5;
                                            m3059native(i);
                                            ?? r112 = r5;
                                            z10 = r112 == true ? 1 : 0;
                                            r16 = r112;
                                        }
                                    }
                                    r14 = r17;
                                    r16 = r14;
                                    r16 = r14;
                                    z10 = z6;
                                    z10 = z6;
                                    r15 = r16;
                                    r15 = r16;
                                    z7 = z10;
                                    z7 = z10;
                                    if (r22[r5] != 2) {
                                    }
                                    if (i44 > i3) {
                                        r15 = r16;
                                        z7 = z10;
                                        z9 = false;
                                    } else {
                                        r15 = r16;
                                        z7 = z10;
                                        z9 = z8;
                                    }
                                    i43 = i44;
                                    z24 = z2;
                                    c14946l2 = c14946l2;
                                    r19 = r13;
                                    z25 = z9;
                                } else {
                                    z6 = z5;
                                    r14 = r17;
                                    r15 = r14;
                                    z7 = z6;
                                }
                                r15 = r16;
                                z7 = z10;
                                r13 = r15;
                                i3 = 8;
                                z8 = z7;
                                if (i44 > i3) {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = false;
                                } else {
                                    r15 = r16;
                                    z7 = z10;
                                    z9 = z8;
                                }
                                i43 = i44;
                                z24 = z2;
                                c14946l2 = c14946l2;
                                r19 = r13;
                                z25 = z9;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    c4847l.startapp();
                    z3 = true;
                } catch (Exception e6) {
                    e = e6;
                    z2 = z24;
                }
            } catch (Exception e7) {
                e = e7;
                z2 = z24;
                z12 = z25;
            }
            zArr = AbstractC15096l.yandex;
            if (z3) {
                zArr[2] = false;
                zM2941switch = m2941switch(64);
                mo2928extends(c4847l, zM2941switch);
                size = this.f21654return.size();
                i5 = 0;
                z11 = false;
                while (i5 < size) {
                    c11338l = (C11338l) this.f21654return.get(i5);
                    c11338l.mo2928extends(c4847l, zM2941switch);
                    boolean[] zArr6 = zArr;
                    boolean z29 = zM2941switch;
                    if (c11338l.admob == -1 || c11338l.subs != -1) {
                        z11 = true;
                    }
                    i5++;
                    zArr = zArr6;
                    zM2941switch = z29;
                    z11 = z11;
                }
                zArr2 = zArr;
                z4 = z11;
            } else {
                zArr2 = zArr;
                mo2928extends(c4847l, zM2941switch2);
                while (i2 < size2) {
                    ((C11338l) this.f21654return.get(i2)).mo2928extends(c4847l, zM2941switch2);
                }
                z4 = false;
            }
            if (z2 && i44 < 8 && zArr2[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i4 < size2) {
                    C11338l c11338l17 = (C11338l) this.f21654return.get(i4);
                    iMax3 = Math.max(iMax3, c11338l17.metrica() + c11338l17.f22846default);
                    iMax4 = Math.max(iMax4, c11338l17.subs() + c11338l17.f22849final);
                }
                iMax5 = Math.max(this.f22852goto, iMax3);
                iMax6 = Math.max(this.f22865super, iMax4);
                r19 = r19;
                z4 = z4;
                if (i9 == 2 && metrica() < iMax5) {
                    r19 = r19;
                    z4 = z4;
                    m3059native(iMax5);
                    r22[0] = 2;
                    r19 = 1;
                    z4 = true;
                }
                if (i8 == 2 && subs() < iMax6) {
                    m3062synchronized(iMax6);
                    r22[1] = 2;
                    r19 = 1;
                    z4 = true;
                }
            }
            iMax = Math.max(this.f22852goto, metrica());
            if (iMax > metrica()) {
                m3059native(iMax);
                r5 = 1;
                r22[0] = 1;
                z5 = true;
                r18 = 1;
            } else {
                r5 = 1;
                r18 = r19;
                z5 = z4;
            }
            iMax2 = Math.max(this.f22865super, subs());
            if (iMax2 > subs()) {
                m3062synchronized(iMax2);
                r22[r5] = r5;
                r17 = r5;
                z6 = r17 == true ? 1 : 0;
            } else {
                r14 = r18;
            }
            if (r14 == 0) {
                z6 = z5;
                if (r22[0] == 2 && i > 0) {
                    r16 = r14;
                    z10 = z6;
                    if (metrica() > i) {
                        this.f21634l = r5;
                        r22[0] = r5;
                        m3059native(i);
                        ?? r113 = r5;
                        z10 = r113 == true ? 1 : 0;
                        r16 = r113;
                    }
                }
                r14 = r17;
                r16 = r14;
                r16 = r14;
                z10 = z6;
                z10 = z6;
                r15 = r16;
                r15 = r16;
                z7 = z10;
                z7 = z10;
                if (r22[r5] != 2 && iMax8 > 0 && subs() > iMax8) {
                    this.f21643l = r5;
                    r22[r5] = r5;
                    m3062synchronized(iMax8);
                    i3 = 8;
                    r13 = 1;
                    z8 = true;
                }
                if (i44 > i3) {
                    r15 = r16;
                    z7 = z10;
                    z9 = false;
                } else {
                    r15 = r16;
                    z7 = z10;
                    z9 = z8;
                }
                i43 = i44;
                z24 = z2;
                c14946l2 = c14946l2;
                r19 = r13;
                z25 = z9;
            } else {
                z6 = z5;
                r14 = r17;
                r15 = r14;
                z7 = z6;
            }
            r15 = r16;
            z7 = z10;
            r13 = r15;
            i3 = 8;
            z8 = z7;
            if (i44 > i3) {
                r15 = r16;
                z7 = z10;
                z9 = false;
            } else {
                r15 = r16;
                z7 = z10;
                z9 = z8;
            }
            i43 = i44;
            z24 = z2;
            c14946l2 = c14946l2;
            r19 = r13;
            z25 = z9;
        }
        this.f21654return = arrayList22;
        if (r19 != 0) {
            r22[0] = i9;
            r22[1] = i8;
        }
        applovin(c4847l.remoteconfig);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m2939for(C11338l c11338l, int i) {
        if (i == 0) {
            int i2 = this.f21645l + 1;
            C17375l[] c17375lArr = this.f21648l;
            if (i2 >= c17375lArr.length) {
                this.f21648l = (C17375l[]) Arrays.copyOf(c17375lArr, c17375lArr.length * 2);
            }
            C17375l[] c17375lArr2 = this.f21648l;
            int i3 = this.f21645l;
            c17375lArr2[i3] = new C17375l(c11338l, 0, this.f21637l);
            this.f21645l = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f21633l + 1;
            C17375l[] c17375lArr3 = this.f21635l;
            if (i4 >= c17375lArr3.length) {
                this.f21635l = (C17375l[]) Arrays.copyOf(c17375lArr3, c17375lArr3.length * 2);
            }
            C17375l[] c17375lArr4 = this.f21635l;
            int i5 = this.f21633l;
            c17375lArr4[i5] = new C17375l(c11338l, 1, this.f21637l);
            this.f21633l = i5 + 1;
        }
    }

    @Override // defpackage.C11338l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void mo2940private(boolean z, boolean z2) {
        super.mo2940private(z, z2);
        int size = this.f21654return.size();
        for (int i = 0; i < size; i++) {
            ((C11338l) this.f21654return.get(i)).mo2940private(z, z2);
        }
    }

    @Override // defpackage.C11338l
    public final void signatures() {
        this.f21636l.tapsense();
        this.f21651l = 0;
        this.f21644l = 0;
        this.f21654return.clear();
        super.signatures();
    }

    @Override // defpackage.C11338l
    public final void smaato(StringBuilder sb) {
        sb.append(this.isPro + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f22845continue);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f22843class);
        sb.append("\n");
        Iterator it = this.f21654return.iterator();
        while (it.hasNext()) {
            ((C11338l) it.next()).smaato(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final boolean m2941switch(int i) {
        return (this.f21649l & i) == i;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m2942throw(C4847l c4847l) {
        C10664l c10664l;
        C4847l c4847l2;
        boolean zM2941switch = m2941switch(64);
        loadAd(c4847l, zM2941switch);
        int size = this.f21654return.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C11338l c11338l = (C11338l) this.f21654return.get(i);
            boolean[] zArr = c11338l.f22841case;
            zArr[0] = false;
            zArr[1] = false;
            if (c11338l instanceof C0051l) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C11338l c11338l2 = (C11338l) this.f21654return.get(i2);
                if (c11338l2 instanceof C0051l) {
                    C0051l c0051l = (C0051l) c11338l2;
                    for (int i3 = 0; i3 < c0051l.f937l; i3++) {
                        C11338l c11338l3 = c0051l.f938return[i3];
                        if (c0051l.f936l || c11338l3.crashlytics()) {
                            int i4 = c0051l.f934l;
                            if (i4 == 0 || i4 == 1) {
                                c11338l3.f22841case[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c11338l3.f22841case[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f21639l;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C11338l c11338l4 = (C11338l) this.f21654return.get(i5);
            c11338l4.getClass();
            if (c11338l4 instanceof C10526l) {
                c11338l4.loadAd(c4847l, zM2941switch);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((C11338l) it.next()).getClass();
                C18725l.loadAd();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C11338l) it2.next()).loadAd(c4847l, zM2941switch);
                }
                hashSet.clear();
            }
        }
        if (C4847l.adcel) {
            HashSet<C11338l> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                C11338l c11338l5 = (C11338l) this.f21654return.get(i6);
                c11338l5.getClass();
                if (!(c11338l5 instanceof C10526l)) {
                    hashSet2.add(c11338l5);
                }
            }
            c10664l = this;
            c4847l2 = c4847l;
            c10664l.yandex(this, c4847l2, hashSet2, this.f22844const[0] == 2 ? 0 : 1, false);
            for (C11338l c11338l6 : hashSet2) {
                AbstractC15096l.crashlytics(c10664l, c4847l2, c11338l6);
                c11338l6.loadAd(c4847l2, zM2941switch);
            }
        } else {
            c10664l = this;
            c4847l2 = c4847l;
            for (int i7 = 0; i7 < size; i7++) {
                C11338l c11338l7 = (C11338l) c10664l.f21654return.get(i7);
                if (c11338l7 instanceof C10664l) {
                    int[] iArr = c11338l7.f22844const;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        c11338l7.m3061strictfp(1);
                    }
                    if (i9 == 2) {
                        c11338l7.m3064volatile(1);
                    }
                    c11338l7.loadAd(c4847l2, zM2941switch);
                    if (i8 == 2) {
                        c11338l7.m3061strictfp(i8);
                    }
                    if (i9 == 2) {
                        c11338l7.m3064volatile(i9);
                    }
                } else {
                    AbstractC15096l.crashlytics(c10664l, c4847l2, c11338l7);
                    if (!(c11338l7 instanceof C10526l)) {
                        c11338l7.loadAd(c4847l2, zM2941switch);
                    }
                }
            }
        }
        if (c10664l.f21645l > 0) {
            AbstractC15960l.loadAd(c10664l, c4847l2, null, 0);
        }
        if (c10664l.f21633l > 0) {
            AbstractC15960l.loadAd(c10664l, c4847l2, null, 1);
        }
    }
}
