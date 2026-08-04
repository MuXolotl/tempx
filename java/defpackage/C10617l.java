package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lَْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10617l implements InterfaceC8782l, InterfaceC17649l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f21537l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final boolean f21538l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1770l f21539l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14513l f21540l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C8915l[] f21541l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C8915l[] f21542l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C13698l f21543l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C5501l f21544l = new C5501l(12, this);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final long f21545l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6827l f21546l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final appmetrica f21547l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C8750l f21548l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC2417l f21549l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final IdentityHashMap f21550l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C17849l f21551l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC0729l f21552l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7713l f21553l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C14823l f21554l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC3783l f21555l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13281l f21556l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C5501l f21557l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f21558l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f21559l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C6882l f21560l;

    public C10617l(appmetrica appmetricaVar, C6827l c6827l, C1770l c1770l, C7713l c7713l, InterfaceC0729l interfaceC0729l, C13281l c13281l, C14513l c14513l, C13698l c13698l, InterfaceC3783l interfaceC3783l, C14823l c14823l, boolean z, int i, C17849l c17849l) {
        this.f21547l = appmetricaVar;
        this.f21546l = c6827l;
        this.f21539l = c1770l;
        this.f21553l = c7713l;
        this.f21552l = interfaceC0729l;
        this.f21556l = c13281l;
        this.f21540l = c14513l;
        this.f21543l = c13698l;
        this.f21555l = interfaceC3783l;
        this.f21554l = c14823l;
        this.f21538l = z;
        this.f21558l = i;
        this.f21551l = c17849l;
        c14823l.getClass();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        this.f21560l = new C6882l(c13708l, c13708l);
        this.f21550l = new IdentityHashMap();
        this.f21557l = new C5501l(28);
        this.f21542l = new C8915l[0];
        this.f21541l = new C8915l[0];
        this.f21545l = Long.MIN_VALUE;
    }

    public static C5978l firebase(C5978l c5978l, C5978l c5978l2, boolean z) {
        C7417l c7417l;
        int i;
        String str;
        String str2;
        AbstractC1186l abstractC1186l;
        int i2;
        int i3;
        String str3;
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        if (c5978l2 != null) {
            str2 = c5978l2.firebase;
            c7417l = c5978l2.smaato;
            i2 = c5978l2.f12619package;
            i = c5978l2.purchase;
            i3 = c5978l2.billing;
            str = c5978l2.amazon;
            str3 = c5978l2.loadAd;
            abstractC1186l = c5978l2.crashlytics;
        } else {
            String strAd = AbstractC15323l.ad(1, c5978l.firebase);
            c7417l = c5978l.smaato;
            if (z) {
                i2 = c5978l.f12619package;
                i = c5978l.purchase;
                i3 = c5978l.billing;
                str = c5978l.amazon;
                str3 = c5978l.loadAd;
                str2 = strAd;
                abstractC1186l = c5978l.crashlytics;
            } else {
                i = 0;
                str = null;
                str2 = strAd;
                abstractC1186l = c13708l;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strAmazon = AbstractC3825l.amazon(str2);
        int i4 = z ? c5978l.admob : -1;
        int i5 = z ? c5978l.subs : -1;
        C12984l c12984l = new C12984l();
        c12984l.yandex = c5978l.yandex;
        c12984l.loadAd = str3;
        c12984l.crashlytics = AbstractC1186l.Signature(abstractC1186l);
        c12984l.remoteconfig = AbstractC3825l.vip(c5978l.vip);
        c12984l.vip = AbstractC3825l.vip(strAmazon);
        c12984l.isPro = str2;
        c12984l.firebase = c7417l;
        c12984l.admob = i4;
        c12984l.subs = i5;
        c12984l.f25447throws = i2;
        c12984l.purchase = i;
        c12984l.billing = i3;
        c12984l.amazon = str;
        return new C5978l(c12984l);
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        if (this.f21548l != null) {
            return this.f21560l.adcel(c11495l);
        }
        for (C8915l c8915l : this.f21542l) {
            if (!c8915l.f18365l) {
                C7751l c7751l = new C7751l();
                c7751l.yandex = c8915l.f18323l;
                c8915l.adcel(new C11495l(c7751l));
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() throws IOException {
        for (C8915l c8915l : this.f21542l) {
            c8915l.m2433package();
            if (c8915l.f18326l && !c8915l.f18365l) {
                throw C17655l.yandex(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        return this.f21560l.ads();
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f21560l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        return this.f21560l.billing();
    }

    public final C8915l crashlytics(String str, int i, C16091l[] c16091lArr, C5978l[] c5978lArr, C5978l c5978l, List list, Map map, long j) throws Throwable {
        C8915l c8915l = new C8915l(str, i, this.f21544l, new C14299l(this.f21547l, this.f21546l, c16091lArr, c5978lArr, this.f21539l, this.f21553l, this.f21557l, list, this.f21551l), map, this.f21555l, j, c5978l, this.f21552l, this.f21556l, this.f21540l, this.f21543l, this.f21558l, null);
        long j2 = this.f21545l;
        c8915l.f18363l = j2;
        if (c8915l.f18354l) {
            for (C4251l c4251l : c8915l.f18321l) {
                c4251l.m4097throws(j2);
            }
        }
        return c8915l;
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) throws Throwable {
        for (C8915l c8915l : this.f21541l) {
            if (c8915l.f18354l && !c8915l.inmobi()) {
                int length = c8915l.f18321l.length;
                for (int i = 0; i < length; i++) {
                    c8915l.f18321l[i].isPro(j, c8915l.f18332l[i]);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        this.f21560l.license(j);
    }

    @Override // defpackage.InterfaceC17649l
    public final boolean loadAd(Uri uri, C14785l c14785l, boolean z) {
        int i;
        boolean z2;
        boolean zCrashlytics;
        int iSignatures;
        C8915l[] c8915lArr = this.f21542l;
        int length = c8915lArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            C8915l c8915l = c8915lArr[i2];
            C14299l c14299l = c8915l.f18352l;
            C16091l[] c16091lArr = c14299l.purchase;
            C6827l c6827l = c14299l.mopub;
            int length2 = c16091lArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    C16091l c16091l = c16091lArr[i3];
                    C16293l c16293l = (C16293l) c6827l.f14267l.get(uri);
                    if (c16091l.equals(c16293l != null ? c16293l.yandex : null)) {
                        C8128l c8128lSignature = !z ? c8915l.f18359l.Signature(c14299l.yandex(uri), c14785l) : null;
                        c14299l.metrica = uri;
                        if (c8128lSignature != null) {
                            int i4 = c8128lSignature.f16932l;
                            i = i2;
                            boolean z4 = false;
                            long j = c8128lSignature.f16931l;
                            if (i4 == 1) {
                                z2 = false;
                                C16293l c16293l2 = (C16293l) c6827l.f14267l.get(uri);
                                if (c16293l2 != null) {
                                    zCrashlytics = C16293l.crashlytics(c16293l2, uri, j);
                                }
                            } else {
                                if (i4 != 2) {
                                    C8339l.smaato(AbstractC0653l.vip(i4, "Invalid fallback selection type: "));
                                    return false;
                                }
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= c16091lArr.length) {
                                        z2 = z4;
                                        i5 = -1;
                                        break;
                                    }
                                    C16091l c16091l2 = c16091lArr[i5];
                                    z2 = z4;
                                    C16293l c16293l3 = (C16293l) c6827l.f14267l.get(uri);
                                    if (c16091l2.equals(c16293l3 != null ? c16293l3.yandex : null)) {
                                        break;
                                    }
                                    i5++;
                                    z4 = z2;
                                }
                                if (i5 != -1 && (iSignatures = c14299l.ads.signatures(i5)) != -1 && c14299l.ads.license(iSignatures, j)) {
                                    C16293l c16293l4 = (C16293l) c6827l.f14267l.get(uri);
                                    if (c16293l4 != null ? C16293l.crashlytics(c16293l4, uri, j) : z2) {
                                        zCrashlytics = true;
                                    }
                                }
                            }
                            z3 |= zCrashlytics;
                            i2 = i + 1;
                        }
                        zCrashlytics = z2;
                        z3 |= zCrashlytics;
                        i2 = i + 1;
                    } else {
                        i3++;
                    }
                }
                i = i2;
                z2 = false;
                zCrashlytics = z2;
                z3 |= zCrashlytics;
                i2 = i + 1;
            }
        }
        this.f21549l.mo614throws(this);
        return z3;
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        C8750l c8750l = this.f21548l;
        c8750l.getClass();
        return c8750l;
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        for (C8915l c8915l : this.f21541l) {
            if (c8915l.f18319l == 2) {
                C14299l c14299l = c8915l.f18352l;
                C6827l c6827l = c14299l.mopub;
                int iSmaato = c14299l.ads.smaato();
                C16091l[] c16091lArr = c14299l.purchase;
                C16272l c16272lAmazon = (iSmaato >= c16091lArr.length || iSmaato == -1) ? null : c6827l.amazon(true, c16091lArr[c14299l.ads.subscription()].crashlytics());
                if (c16272lAmazon == null) {
                    break;
                }
                AbstractC1186l abstractC1186l = c16272lAmazon.ads;
                if (abstractC1186l.isEmpty()) {
                    break;
                }
                long j2 = c16272lAmazon.admob - c6827l.f14262l;
                long j3 = j - j2;
                int iAmazon = AbstractC15323l.amazon(abstractC1186l, Long.valueOf(j3), true);
                long j4 = ((C4234l) abstractC1186l.get(iAmazon)).f20476l;
                return c17654l.yandex(j3, j4, (!c16272lAmazon.crashlytics || iAmazon == abstractC1186l.size() - 1) ? j4 : ((C4234l) abstractC1186l.get(iAmazon + 1)).f20476l) + j2;
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x02af  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:160:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) throws Throwable {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        C14299l c14299l;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        C8915l[] c8915lArr;
        C8915l c8915l;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        ?? r30;
        int[] iArr3 = new int[interfaceC10376lArr.length];
        int[] iArr4 = new int[interfaceC10376lArr.length];
        int i7 = 0;
        while (true) {
            int length = interfaceC10376lArr.length;
            identityHashMap = this.f21550l;
            if (i7 >= length) {
                break;
            }
            InterfaceC11759l interfaceC11759l = interfaceC11759lArr[i7];
            iArr3[i7] = interfaceC11759l == null ? -1 : ((Integer) identityHashMap.get(interfaceC11759l)).intValue();
            iArr4[i7] = -1;
            InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i7];
            if (interfaceC10376l != null) {
                C11916l c11916lFirebase = interfaceC10376l.firebase();
                int i8 = 0;
                while (true) {
                    C8915l[] c8915lArr2 = this.f21542l;
                    if (i8 >= c8915lArr2.length) {
                        break;
                    }
                    C8915l c8915l2 = c8915lArr2[i8];
                    c8915l2.pro();
                    if (c8915l2.f18336l.loadAd(c11916lFirebase) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = interfaceC10376lArr.length;
        int length3 = interfaceC10376lArr.length;
        InterfaceC11759l[] interfaceC11759lArr2 = new InterfaceC11759l[length3];
        int length4 = interfaceC10376lArr.length;
        InterfaceC10376l[] interfaceC10376lArr2 = new InterfaceC10376l[length4];
        boolean z4 = false;
        C8915l[] c8915lArr3 = new C8915l[this.f21542l.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new InterfaceC11759l[length2];
        Object[] objArr7 = interfaceC11759lArr2;
        while (i10 < this.f21542l.length) {
            int i12 = length2;
            ?? r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= interfaceC10376lArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? interfaceC11759lArr[r7] : null;
                interfaceC10376lArr2[r7] = iArr4[r7] == i10 ? interfaceC10376lArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            C8915l c8915l3 = this.f21542l[i10];
            C18449l c18449l = c8915l3.f18348l;
            int i13 = i10;
            C14299l c14299l2 = c8915l3.f18352l;
            C16091l[] c16091lArr = c14299l2.purchase;
            C6827l c6827l = c14299l2.mopub;
            ArrayList arrayList = c8915l3.f18364l;
            c8915l3.pro();
            int i14 = c8915l3.f18343l;
            Object[] objArr9 = objArr7;
            ?? r8 = z4;
            while (r8 < length4) {
                C3978l c3978l = (C3978l) objArr9[r8];
                if (c3978l == null || (interfaceC10376lArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    c8915l3.f18343l--;
                    if (c3978l.f8171l != -1) {
                        C8915l c8915l4 = c3978l.f8172l;
                        int i15 = c3978l.f8173l;
                        c8915l4.pro();
                        c8915l4.f18356l.getClass();
                        int i16 = c8915l4.f18356l[i15];
                        if (i16 >= 0) {
                            AbstractC12442l.subscription(c8915l4.f18332l[i16]);
                            c8915l4.f18332l[i16] = z4;
                        }
                        c3978l.f8171l = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                interfaceC10376lArr2 = interfaceC10376lArr2;
                r8 = r30 + 1;
            }
            InterfaceC10376l[] interfaceC10376lArr3 = interfaceC10376lArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (c8915l3.f18344l) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != c8915l3.f18323l) {
                        z = true;
                    }
                }
                z = z4;
            }
            InterfaceC10376l interfaceC10376l2 = c14299l2.ads;
            boolean z7 = z;
            InterfaceC10376l interfaceC10376l3 = interfaceC10376l2;
            ?? r9 = z4;
            while (r9 < length4) {
                ?? r31 = r9;
                InterfaceC10376l interfaceC10376l4 = interfaceC10376lArr3[r31 == true ? 1 : 0];
                if (interfaceC10376l4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iLoadAd = c8915l3.f18336l.loadAd(interfaceC10376l4.firebase());
                    if (iLoadAd == c8915l3.f18333l) {
                        Uri uriCrashlytics = c16091lArr[c14299l2.ads.subscription()].crashlytics();
                        C16293l c16293l = (C16293l) c6827l.f14267l.get(uriCrashlytics);
                        if (c16293l != null) {
                            C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uriCrashlytics, uriCrashlytics);
                            c16456l.getClass();
                            c16456l.f32173l = z4;
                        }
                        c14299l2.ads = interfaceC10376l4;
                        interfaceC10376l3 = interfaceC10376l4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        c8915l3.f18343l++;
                        C3978l c3978l2 = new C3978l(c8915l3, iLoadAd);
                        objArr9[r31 == true ? 1 : 0] = c3978l2;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (c8915l3.f18356l != null) {
                            c3978l2.loadAd();
                            int i17 = c8915l3.f18356l[iLoadAd];
                            if (z8 || i17 < 0) {
                                z7 = z8;
                            } else {
                                C4251l c4251l = c8915l3.f18321l[i17];
                                z7 = (c4251l.subscription() == 0 || c4251l.inmobi(j, z6)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i18 = length4;
            boolean z9 = z7;
            if (c8915l3.f18343l == 0) {
                Uri uriCrashlytics2 = c16091lArr[c14299l2.ads.subscription()].crashlytics();
                C16293l c16293l2 = (C16293l) c6827l.f14267l.get(uriCrashlytics2);
                if (c16293l2 != null) {
                    C16456l c16456l2 = (C16456l) AbstractC2812l.adcel(c16293l2.loadAd, uriCrashlytics2, uriCrashlytics2);
                    c16456l2.getClass();
                    c16456l2.f32173l = false;
                }
                c14299l2.vip = null;
                c8915l3.f18318l = null;
                c8915l3.f18353l = true;
                arrayList.clear();
                if (c18449l.m4537catch()) {
                    if (c8915l3.f18354l) {
                        for (C4251l c4251l2 : c8915l3.f18321l) {
                            c4251l2.firebase();
                        }
                    }
                    c18449l.isVip();
                } else {
                    c8915l3.m2434strictfp();
                }
                c14299l = c14299l2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                c8915lArr = c8915lArr3;
                c8915l = c8915l3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(interfaceC10376l3, interfaceC10376l2)) {
                    c14299l = c14299l2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    c8915lArr = c8915lArr3;
                    c8915l = c8915l3;
                } else {
                    if (c8915l3.f18344l) {
                        c14299l = c14299l2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        c8915lArr = c8915lArr3;
                        c8915l = c8915l3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        C7377l c7377lApplovin = c8915l3.applovin();
                        long j3 = j2;
                        InterfaceC7405l[] interfaceC7405lArrLoadAd = c14299l2.loadAd(c7377lApplovin, j);
                        c14299l = c14299l2;
                        List list = c8915l3.f18350l;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        c8915lArr = c8915lArr3;
                        c8915l = c8915l3;
                        InterfaceC10376l interfaceC10376l5 = interfaceC10376l3;
                        interfaceC10376l5.isPro(j, j3, -9223372036854775807L, list, interfaceC7405lArrLoadAd);
                        if (interfaceC10376l5.subscription() != c14299l.admob.loadAd(c7377lApplovin.amazon)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    c8915l.f18353l = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        c8915l.m2437volatile(j, z2);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    c8915l.m2437volatile(j, z2);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = c8915l.f18341l;
            arrayList2.clear();
            for (int i19 = 0; i19 < i4; i19++) {
                Object obj = objArr9[i19];
                if (obj != null) {
                    arrayList2.add((C3978l) obj);
                }
            }
            c8915l.f18344l = true;
            int i20 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i20 < interfaceC10376lArr.length) {
                Object obj2 = objArr9[i20];
                int i21 = i3;
                if (iArr2[i20] == i21) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i20] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i21));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i20] == i21) {
                        AbstractC12442l.subscription(obj2 == null);
                    }
                }
                i20++;
                objArr11 = objArr5;
                i3 = i21;
            }
            Object[] objArr12 = objArr11;
            int i22 = i3;
            int i23 = i11;
            if (z11) {
                c8915lArr[i23] = c8915l;
                i11 = i23 + 1;
                if (i23 == 0) {
                    c14299l.smaato = true;
                    if (z3) {
                        ((SparseArray) this.f21557l.f11764l).clear();
                        z5 = true;
                    } else {
                        C8915l[] c8915lArr4 = this.f21541l;
                        if (c8915lArr4.length == 0 || c8915l != c8915lArr4[0]) {
                            ((SparseArray) this.f21557l.f11764l).clear();
                            z5 = true;
                        }
                    }
                } else {
                    c14299l.smaato = i22 < this.f21537l;
                }
            }
            i10 = i22 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            c8915lArr3 = c8915lArr;
            objArr7 = objArr9;
            interfaceC10376lArr2 = interfaceC10376lArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i18;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, interfaceC11759lArr, z12 ? 1 : 0, length2);
        C8915l[] c8915lArr5 = (C8915l[]) AbstractC15323l.m3972interface(i11, c8915lArr3);
        this.f21541l = c8915lArr5;
        C13708l c13708lPro = AbstractC1186l.pro(c8915lArr5);
        AbstractList abstractListIsPro = AbstractC7280l.isPro(new C2922l(7), c13708lPro);
        this.f21554l.getClass();
        this.f21560l = new C6882l(c13708lPro, abstractListIsPro);
        return j;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) throws Throwable {
        C8915l[] c8915lArr = this.f21541l;
        if (c8915lArr.length > 0) {
            boolean zM2437volatile = c8915lArr[0].m2437volatile(j, false);
            int i = 1;
            while (true) {
                C8915l[] c8915lArr2 = this.f21541l;
                if (i >= c8915lArr2.length) {
                    break;
                }
                c8915lArr2[i].m2437volatile(j, zM2437volatile);
                i++;
            }
            if (zM2437volatile) {
                ((SparseArray) this.f21557l.f11764l).clear();
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) throws Throwable {
        String str;
        appmetrica appmetricaVar;
        boolean z;
        Map map;
        AbstractC1186l abstractC1186l;
        C8915l[] c8915lArr;
        int i;
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        AbstractC1186l abstractC1186l2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.f21549l = interfaceC2417l;
        C6827l c6827l = this.f21546l;
        c6827l.getClass();
        c6827l.f14266l.add(this);
        C9887l c9887l = c6827l.f14264l;
        c9887l.getClass();
        Map map3 = Collections.EMPTY_MAP;
        AbstractC1186l abstractC1186lPurchase = c6827l.purchase(0);
        abstractC1186lPurchase.getClass();
        AbstractC1186l abstractC1186lPurchase2 = c6827l.purchase(2);
        abstractC1186lPurchase2.getClass();
        AbstractC1186l abstractC1186lPurchase3 = c6827l.purchase(3);
        abstractC1186lPurchase3.getClass();
        boolean zIsEmpty = abstractC1186lPurchase.isEmpty();
        this.f21559l = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        appmetrica appmetricaVar2 = this.f21547l;
        boolean z4 = this.f21538l;
        if (zIsEmpty) {
            str = "ID3";
            appmetricaVar = appmetricaVar2;
            z = z4;
            map = map3;
            abstractC1186l = abstractC1186lPurchase3;
        } else {
            C5978l c5978l = c9887l.admob;
            List list2 = c9887l.subs;
            int size = abstractC1186lPurchase.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < abstractC1186lPurchase.size(); i6++) {
                C5978l c5978l2 = ((C16091l) abstractC1186lPurchase.get(i6)).yandex.yandex;
                int i7 = c5978l2.pro;
                String str2 = c5978l2.firebase;
                if (i7 > 0 || AbstractC15323l.ad(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (AbstractC15323l.ad(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            C16091l[] c16091lArr = new C16091l[i3];
            C5978l[] c5978lArr = new C5978l[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < abstractC1186lPurchase.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i12] == 2) {
                    }
                    i12++;
                    list2 = list;
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    C16091l c16091l = (C16091l) abstractC1186lPurchase.get(i12);
                    c16091lArr[i11] = c16091l;
                    c5978lArr[i11] = c16091l.yandex.yandex;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = c5978lArr[0].firebase;
            int iPro = AbstractC15323l.pro(2, str3);
            int i13 = 1;
            int iPro2 = AbstractC15323l.pro(1, str3);
            boolean z6 = (iPro2 == 1 || (iPro2 == 0 && abstractC1186lPurchase2.isEmpty())) && iPro <= 1 && iPro2 + iPro > 0;
            if (z5 || iPro2 <= 0) {
                i13 = 0;
            }
            z = z4;
            abstractC1186l = abstractC1186lPurchase3;
            appmetricaVar = appmetricaVar2;
            C8915l c8915lCrashlytics = crashlytics("main", i13, c16091lArr, c5978lArr, c5978l, list3, map3, j);
            arrayList3.add(c8915lCrashlytics);
            arrayList4.add(iArr2);
            if (z && z6) {
                ArrayList arrayList5 = new ArrayList();
                if (iPro > 0) {
                    C5978l[] c5978lArr2 = new C5978l[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        C5978l c5978l3 = c5978lArr[i14];
                        String strAd = AbstractC15323l.ad(2, c5978l3.firebase);
                        String strAmazon = AbstractC3825l.amazon(strAd);
                        C5978l[] c5978lArr3 = c5978lArr;
                        C12984l c12984l = new C12984l();
                        c12984l.yandex = c5978l3.yandex;
                        c12984l.loadAd = c5978l3.loadAd;
                        c12984l.crashlytics = AbstractC1186l.Signature(c5978l3.crashlytics);
                        c12984l.remoteconfig = AbstractC3825l.vip(c5978l3.vip);
                        c12984l.vip = AbstractC3825l.vip(strAmazon);
                        c12984l.isPro = strAd;
                        c12984l.firebase = c5978l3.smaato;
                        c12984l.admob = c5978l3.admob;
                        c12984l.subs = c5978l3.subs;
                        c12984l.Signature = c5978l3.license;
                        c12984l.license = c5978l3.pro;
                        c12984l.advert = c5978l3.isVip;
                        c12984l.purchase = c5978l3.purchase;
                        c12984l.billing = c5978l3.billing;
                        c12984l.appmetrica = c5978l3.inmobi;
                        c5978lArr2[i14] = new C5978l(c12984l);
                        i14++;
                        c5978lArr = c5978lArr3;
                        map3 = map3;
                    }
                    C5978l[] c5978lArr4 = c5978lArr;
                    map = map3;
                    arrayList5.add(new C11916l("main", c5978lArr2));
                    if (iPro2 > 0 && (c5978l != null || abstractC1186lPurchase2.isEmpty())) {
                        C12984l c12984lYandex = firebase(c5978lArr4[0], c5978l, false).yandex();
                        c12984lYandex.smaato = "main";
                        arrayList5.add(new C11916l("main:audio", new C5978l(c12984lYandex)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String strVip = AbstractC0653l.vip(i15, "main:cc:");
                            C12984l c12984lYandex2 = appmetricaVar.vip((C5978l) list3.get(i15)).yandex();
                            c12984lYandex2.smaato = "main";
                            arrayList5.add(new C11916l(strVip, new C5978l(c12984lYandex2)));
                        }
                    }
                } else {
                    map = map3;
                    C5978l[] c5978lArr5 = new C5978l[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        c5978lArr5[i16] = firebase(c5978lArr[i16], c5978l, true);
                    }
                    arrayList5.add(new C11916l("main", c5978lArr5));
                }
                C12984l c12984l2 = new C12984l();
                str = "ID3";
                c12984l2.yandex = str;
                c12984l2.vip = AbstractC3825l.vip("application/id3");
                c12984l2.smaato = "main";
                C11916l c11916l = new C11916l("main:id3", new C5978l(c12984l2));
                arrayList5.add(c11916l);
                c8915lCrashlytics.m2435synchronized((C11916l[]) arrayList5.toArray(new C11916l[0]), arrayList5.indexOf(c11916l));
            } else {
                map = map3;
                str = "ID3";
                appmetricaVar = appmetricaVar;
            }
        }
        ArrayList arrayList6 = new ArrayList(abstractC1186lPurchase2.size());
        ArrayList arrayList7 = new ArrayList(abstractC1186lPurchase2.size());
        ArrayList arrayList8 = new ArrayList(abstractC1186lPurchase2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < abstractC1186lPurchase2.size()) {
            String str4 = ((C16091l) abstractC1186lPurchase2.get(i17)).yandex.crashlytics;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z7 = true;
                for (int i18 = 0; i18 < abstractC1186lPurchase2.size(); i18++) {
                    if (str4.equals(((C16091l) abstractC1186lPurchase2.get(i18)).yandex.crashlytics)) {
                        C16091l c16091l2 = (C16091l) abstractC1186lPurchase2.get(i18);
                        C5978l c5978l4 = c16091l2.yandex.yandex;
                        arrayList8.add(Integer.valueOf(i18));
                        arrayList6.add(c16091l2);
                        arrayList7.add(c5978l4);
                        z7 &= AbstractC15323l.pro(1, c5978l4.firebase) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = AbstractC15323l.yandex;
                i2 = i17;
                hashSet2 = hashSet3;
                abstractC1186l2 = abstractC1186lPurchase2;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                C8915l c8915lCrashlytics2 = crashlytics(strConcat, 1, (C16091l[]) arrayList6.toArray(new C16091l[0]), (C5978l[]) arrayList7.toArray(new C5978l[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList4.add(AbstractC9966l.subscription(arrayList2));
                arrayList3.add(c8915lCrashlytics2);
                if (z && z7) {
                    String strConcat2 = strConcat.concat(":id3");
                    C12984l c12984l3 = new C12984l();
                    c12984l3.yandex = str;
                    c12984l3.vip = AbstractC3825l.vip("application/id3");
                    c12984l3.smaato = strConcat;
                    c8915lCrashlytics2.m2435synchronized(new C11916l[]{new C11916l(strConcat, (C5978l[]) arrayList.toArray(new C5978l[0])), new C11916l(strConcat2, new C5978l(c12984l3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i17;
                abstractC1186l2 = abstractC1186lPurchase2;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i17 = i2 + 1;
            arrayList7 = arrayList;
            abstractC1186lPurchase2 = abstractC1186l2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.f21537l = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(abstractC1186l.size());
        ArrayList arrayList10 = new ArrayList(abstractC1186l.size());
        ArrayList arrayList11 = new ArrayList(abstractC1186l.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < abstractC1186l.size()) {
            abstractC1186l = abstractC1186l;
            String str6 = ((C16091l) abstractC1186l.get(i19)).yandex.crashlytics;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i20 = 0; i20 < abstractC1186l.size(); i20++) {
                    if (str6.equals(((C16091l) abstractC1186l.get(i20)).yandex.crashlytics)) {
                        C16091l c16091l3 = (C16091l) abstractC1186l.get(i20);
                        arrayList11.add(Integer.valueOf(i20));
                        arrayList9.add(c16091l3);
                        arrayList10.add(c16091l3.yandex.yandex);
                    }
                }
                String strConcat3 = "subtitle:".concat(str6);
                C5978l[] c5978lArr6 = (C5978l[]) arrayList10.toArray(new C5978l[0]);
                String str7 = AbstractC15323l.yandex;
                C16091l[] c16091lArr2 = (C16091l[]) arrayList9.toArray(new C16091l[0]);
                C9258l c9258l = AbstractC1186l.f3181l;
                i = i19;
                hashSet = hashSet4;
                C8915l c8915lCrashlytics3 = crashlytics(strConcat3, 3, c16091lArr2, c5978lArr6, null, C13708l.f26763l, map4, j);
                arrayList4.add(AbstractC9966l.subscription(arrayList11));
                arrayList3.add(c8915lCrashlytics3);
                int length = c5978lArr6.length;
                C5978l[] c5978lArr7 = new C5978l[length];
                for (int i21 = 0; i21 < length; i21++) {
                    c5978lArr7[i21] = appmetricaVar.vip(c5978lArr6[i21]);
                }
                c8915lCrashlytics3.m2435synchronized(new C11916l[]{new C11916l(strConcat3, c5978lArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i19;
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.f21542l = (C8915l[]) arrayList3.toArray(new C8915l[0]);
        this.f21559l = this.f21542l.length;
        int i22 = 0;
        while (true) {
            int i23 = this.f21537l;
            c8915lArr = this.f21542l;
            if (i22 >= i23) {
                break;
            }
            c8915lArr[i22].f18352l.smaato = true;
            i22++;
        }
        for (C8915l c8915l : c8915lArr) {
            if (!c8915l.f18365l) {
                C7751l c7751l = new C7751l();
                c7751l.yandex = c8915l.f18323l;
                c8915l.adcel(new C11495l(c7751l));
            }
        }
        this.f21541l = this.f21542l;
    }

    @Override // defpackage.InterfaceC17649l
    public final void yandex() {
        for (C8915l c8915l : this.f21542l) {
            C18449l c18449l = c8915l.f18348l;
            C14299l c14299l = c8915l.f18352l;
            ArrayList arrayList = c8915l.f18364l;
            if (!arrayList.isEmpty()) {
                C7377l c7377l = (C7377l) AbstractC11356l.purchase(arrayList);
                int iCrashlytics = c14299l.crashlytics(c7377l);
                int i = c7377l.metrica;
                if (iCrashlytics == 1) {
                    if (!c7377l.billing()) {
                        AbstractC12442l.subscription(i != -1);
                        C16272l c16272lAmazon = c14299l.mopub.amazon(false, c7377l.remoteconfig);
                        c16272lAmazon.getClass();
                        AbstractC1186l abstractC1186l = c16272lAmazon.ads;
                        int i2 = (int) (c7377l.isPro - c16272lAmazon.firebase);
                        c7377l.f15299native = i2 < 0 ? 0L : ((C6823l) (i2 < abstractC1186l.size() ? ((C4234l) abstractC1186l.get(i2)).f8669l : c16272lAmazon.subscription).get(i)).f20470l;
                    }
                } else if (iCrashlytics == 0) {
                    c8915l.f18367l.post(new RunnableC0336l(c8915l, c7377l, 25));
                } else if (iCrashlytics == 2 && !c8915l.f18326l && c18449l.m4537catch()) {
                    c18449l.isVip();
                }
            }
        }
        this.f21549l.mo614throws(this);
    }
}
