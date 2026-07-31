package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؚٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7251l implements InterfaceC14833l {
    public boolean adcel;
    public final SparseArray admob;
    public InterfaceC8865l ads;
    public final C13143l amazon;
    public final C17368l billing;
    public final List crashlytics;
    public final C12587l firebase;
    public final SparseBooleanArray isPro;
    public final int loadAd;
    public boolean metrica;
    public final InterfaceC5304l mopub;
    public final SparseIntArray purchase;
    public InterfaceC2053l remoteconfig;
    public C16269l smaato;
    public boolean startapp;
    public final SparseBooleanArray subs;
    public int subscription;
    public int tapsense;
    public int vip;
    public final int yandex;

    public C7251l(int i, int i2, InterfaceC5304l interfaceC5304l, C16391l c16391l, C17368l c17368l) {
        this.billing = c17368l;
        this.yandex = i;
        this.loadAd = i2;
        this.mopub = interfaceC5304l;
        if (i == 1 || i == 2) {
            this.crashlytics = Collections.singletonList(c16391l);
        } else {
            ArrayList arrayList = new ArrayList();
            this.crashlytics = arrayList;
            arrayList.add(c16391l);
        }
        this.amazon = new C13143l(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.subs = sparseBooleanArray;
        this.isPro = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.admob = sparseArray;
        this.purchase = new SparseIntArray();
        this.firebase = new C12587l(1);
        this.remoteconfig = InterfaceC2053l.pro;
        this.tapsense = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC8865l) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C14144l(new C13568l(this)));
        this.ads = null;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        C16269l c16269l;
        AbstractC12442l.subscription(this.yandex != 2);
        List list = this.crashlytics;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16391l c16391l = (C16391l) list.get(i);
            boolean z = c16391l.purchase() == -9223372036854775807L;
            if (!z) {
                long jAmazon = c16391l.amazon();
                z = (jAmazon == -9223372036854775807L || jAmazon == 0 || jAmazon == j2) ? false : true;
            }
            if (z) {
                c16391l.mopub(j2);
            }
        }
        if (j2 != 0 && (c16269l = this.smaato) != null) {
            c16269l.amazon(j2);
        }
        this.amazon.m3563native(0);
        this.purchase.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.admob;
            if (i2 >= sparseArray.size()) {
                this.subscription = 0;
                return;
            } else {
                ((InterfaceC8865l) sparseArray.valueAt(i2)).billing();
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        if ((this.loadAd & 1) == 0) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.mopub);
        }
        this.remoteconfig = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        byte[] bArr = this.amazon.yandex;
        C11826l c11826l = (C11826l) interfaceC10430l;
        c11826l.billing(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c11826l.purchase(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [lٌٙؓ] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        InterfaceC10430l interfaceC10430l2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        InterfaceC8865l interfaceC8865l;
        boolean z;
        long jCrashlytics;
        long length = interfaceC10430l.getLength();
        int i5 = this.yandex;
        boolean z2 = i5 == 2;
        if (this.metrica) {
            long j = -9223372036854775807L;
            C12587l c12587l = this.firebase;
            if (length != -1 && !z2 && !c12587l.amazon) {
                int i6 = this.tapsense;
                C16391l c16391l = c12587l.loadAd;
                C13143l c13143l = c12587l.crashlytics;
                if (i6 <= 0) {
                    c12587l.yandex(interfaceC10430l);
                    return 0;
                }
                if (c12587l.billing) {
                    if (c12587l.admob == -9223372036854775807L) {
                        c12587l.yandex(interfaceC10430l);
                        return 0;
                    }
                    if (c12587l.purchase) {
                        long j2 = c12587l.mopub;
                        if (j2 == -9223372036854775807L) {
                            c12587l.yandex(interfaceC10430l);
                            return 0;
                        }
                        c12587l.subs = c16391l.crashlytics(c12587l.admob) - c16391l.loadAd(j2);
                        c12587l.yandex(interfaceC10430l);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, interfaceC10430l.getLength());
                    if (interfaceC10430l.getPosition() != 0) {
                        c1014l.f2761l = 0L;
                        return 1;
                    }
                    c13143l.m3563native(iMin);
                    interfaceC10430l.smaato();
                    interfaceC10430l.yandex(0, iMin, c13143l.yandex);
                    int i7 = c13143l.crashlytics;
                    for (int i8 = c13143l.loadAd; i8 < i7; i8++) {
                        if (c13143l.yandex[i8] == 71) {
                            jCrashlytics = AbstractC2576l.crashlytics(c13143l, i8, i6);
                            if (jCrashlytics != -9223372036854775807L) {
                                c12587l.mopub = jCrashlytics;
                                c12587l.purchase = true;
                                return 0;
                            }
                        }
                    }
                    jCrashlytics = -9223372036854775807L;
                    c12587l.mopub = jCrashlytics;
                    c12587l.purchase = true;
                    return 0;
                }
                long length2 = interfaceC10430l.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (interfaceC10430l.getPosition() != j3) {
                    c1014l.f2761l = j3;
                    return 1;
                }
                c13143l.m3563native(iMin2);
                interfaceC10430l.smaato();
                interfaceC10430l.yandex(0, iMin2, c13143l.yandex);
                int i9 = c13143l.loadAd;
                int i10 = c13143l.crashlytics;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = c13143l.yandex;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jCrashlytics2 = AbstractC2576l.crashlytics(c13143l, i11, i6);
                                if (jCrashlytics2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jCrashlytics2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                c12587l.admob = j;
                c12587l.billing = true;
                return 0;
            }
            if (this.startapp) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.startapp = true;
                long j4 = c12587l.subs;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    C16269l c16269l = new C16269l(new C17334l(25), new C13698l(this.tapsense, c12587l.loadAd), j4, j4 + 1, 0L, length, 188L, 940);
                    this.smaato = c16269l;
                    this.remoteconfig.tapsense(c16269l.yandex);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.remoteconfig.tapsense(new C9828l(j4));
                }
            }
            if (this.adcel) {
                this.adcel = z;
                amazon(0L, 0L);
                if (interfaceC10430l.getPosition() != 0) {
                    c1014l.f2761l = 0L;
                    return i;
                }
            }
            C16269l c16269l2 = this.smaato;
            if (c16269l2 != null && c16269l2.crashlytics != null) {
                return c16269l2.loadAd(interfaceC10430l, c1014l);
            }
            interfaceC10430l2 = interfaceC10430l;
            r1 = z;
        } else {
            interfaceC10430l2 = interfaceC10430l;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        C13143l c13143l2 = this.amazon;
        byte[] bArr2 = c13143l2.yandex;
        if (9400 - c13143l2.loadAd < 188) {
            int iYandex = c13143l2.yandex();
            if (iYandex > 0) {
                System.arraycopy(bArr2, c13143l2.loadAd, bArr2, r1, iYandex);
            }
            c13143l2.m3565private(iYandex, bArr2);
        }
        while (true) {
            int iYandex2 = c13143l2.yandex();
            ?? r7 = this.admob;
            if (iYandex2 >= 188) {
                int i15 = c13143l2.loadAd;
                int i16 = c13143l2.crashlytics;
                byte[] bArr3 = c13143l2.yandex;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                c13143l2.m3562for(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.subscription;
                    this.subscription = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw C17655l.yandex(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.subscription = r1;
                }
                int i20 = c13143l2.crashlytics;
                if (i18 > i20) {
                    return r1;
                }
                int iRemoteconfig = c13143l2.remoteconfig();
                if ((8388608 & iRemoteconfig) != 0) {
                    c13143l2.m3562for(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iRemoteconfig) != 0 ? 1 : r1;
                int i21 = (2096896 & iRemoteconfig) >> 8;
                ?? r14 = (iRemoteconfig & 32) != 0 ? 1 : r1;
                if ((iRemoteconfig & 16) != 0) {
                    interfaceC8865l = (InterfaceC8865l) r7.get(i21);
                }
                if (r8 == 0) {
                    r8 = interfaceC8865l;
                    c13143l2.m3562for(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iRemoteconfig & 15;
                    SparseIntArray sparseIntArray = this.purchase;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        c13143l2.m3562for(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.billing();
                    }
                }
                if (r14 != 0) {
                    int iSignatures = c13143l2.signatures();
                    r10 = (r10 == true ? 1 : 0) | ((c13143l2.signatures() & 64) != 0 ? i4 : r1);
                    c13143l2.m3568throw(iSignatures - 1);
                }
                boolean z3 = this.metrica;
                if (i3 == i4 || z3 || !this.isPro.get(i21, r1)) {
                    c13143l2.m3561extends(i18);
                    r8.yandex(r10, c13143l2);
                    c13143l2.m3561extends(i20);
                }
                if (i3 != i4 && !z3 && this.metrica && length != -1) {
                    this.adcel = true;
                }
                c13143l2.m3562for(i18);
                return r1;
            }
            int i24 = c13143l2.crashlytics;
            int i25 = interfaceC10430l2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    InterfaceC8865l interfaceC8865l2 = (InterfaceC8865l) r7.valueAt(r4);
                    if (interfaceC8865l2 instanceof C14073l) {
                        C14073l c14073l = (C14073l) interfaceC8865l2;
                        ?? r3 = (!z2 || c14073l.crashlytics()) ? i : r1;
                        if (c14073l.crashlytics == 3 && c14073l.isPro == -1 && ((!z2 || !(c14073l.yandex instanceof C9619l)) && r3 != 0)) {
                            c14073l.yandex(i, new C13143l());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            c13143l2.m3561extends(i24 + i25);
            i = 1;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
