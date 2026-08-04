package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lٍَۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10200l extends AbstractC2634l {
    public C9892l adcel;
    public C11440l ads;
    public int metrica;
    public boolean startapp;
    public C9598l vip;

    @Override // defpackage.AbstractC2634l
    public final void amazon(boolean z) {
        super.amazon(z);
        if (z) {
            this.vip = null;
            this.adcel = null;
            this.ads = null;
        }
        this.metrica = 0;
        this.startapp = false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b1  */
    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // defpackage.AbstractC2634l
    public final boolean crashlytics(C13143l c13143l, long j, C2494l c2494l) throws C17655l {
        C9598l c9598l;
        if (this.vip != null) {
            ((C5978l) c2494l.f5291l).getClass();
            return false;
        }
        C9892l c9892l = this.adcel;
        int i = 4;
        if (c9892l != null) {
            C11440l c11440l = this.ads;
            if (c11440l == null) {
                this.ads = AbstractC6968l.mopub(c13143l, true, true);
            } else {
                int i2 = c13143l.crashlytics;
                byte[] bArr = new byte[i2];
                System.arraycopy(c13143l.yandex, 0, bArr, 0, i2);
                int i3 = c9892l.yandex;
                int i4 = 5;
                AbstractC6968l.admob(5, c13143l, false);
                int iSignatures = c13143l.signatures() + 1;
                C5257l c5257l = new C5257l(c13143l.yandex);
                int i5 = 8;
                c5257l.metrica(c13143l.loadAd * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iSignatures) {
                        int i8 = i5;
                        if (c5257l.mopub(24) != 5653314) {
                            throw C17655l.yandex(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c5257l.amazon * 8) + c5257l.purchase));
                        }
                        int iMopub = c5257l.mopub(16);
                        int iMopub2 = c5257l.mopub(24);
                        if (c5257l.billing()) {
                            c5257l.metrica(i4);
                            int iMopub3 = 0;
                            while (iMopub3 < iMopub2) {
                                int i9 = 0;
                                for (int i10 = iMopub2 - iMopub3; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                iMopub3 += c5257l.mopub(i9);
                            }
                        } else {
                            boolean zBilling = c5257l.billing();
                            for (int i11 = 0; i11 < iMopub2; i11++) {
                                if (!zBilling) {
                                    c5257l.metrica(i4);
                                } else if (c5257l.billing()) {
                                    c5257l.metrica(i4);
                                }
                            }
                        }
                        int iMopub4 = c5257l.mopub(4);
                        if (iMopub4 > 2) {
                            throw C17655l.yandex(null, "lookup type greater than 2 not decodable: " + iMopub4);
                        }
                        if (iMopub4 == 1 || iMopub4 == 2) {
                            c5257l.metrica(32);
                            c5257l.metrica(32);
                            int iMopub5 = c5257l.mopub(4) + 1;
                            c5257l.metrica(1);
                            c5257l.metrica((int) ((iMopub4 == 1 ? iMopub != 0 ? (long) Math.floor(Math.pow(iMopub2, 1.0d / ((double) iMopub))) : 0L : ((long) iMopub2) * ((long) iMopub)) * ((long) iMopub5)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i12 = i5;
                        int i13 = 6;
                        int iMopub6 = c5257l.mopub(6) + 1;
                        for (int i14 = 0; i14 < iMopub6; i14++) {
                            if (c5257l.mopub(16) != 0) {
                                throw C17655l.yandex(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iMopub7 = c5257l.mopub(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 >= iMopub7) {
                                int iMopub8 = c5257l.mopub(i13) + 1;
                                int i18 = 0;
                                while (i18 < iMopub8) {
                                    if (c5257l.mopub(16) > 2) {
                                        throw C17655l.yandex(null, "residueType greater than 2 is not decodable");
                                    }
                                    c5257l.metrica(24);
                                    c5257l.metrica(24);
                                    c5257l.metrica(24);
                                    int iMopub9 = c5257l.mopub(i13) + 1;
                                    int i19 = 8;
                                    c5257l.metrica(8);
                                    int[] iArr = new int[iMopub9];
                                    for (int i20 = 0; i20 < iMopub9; i20++) {
                                        iArr[i20] = ((c5257l.billing() ? c5257l.mopub(5) : 0) * 8) + c5257l.mopub(3);
                                    }
                                    int i21 = 0;
                                    while (i21 < iMopub9) {
                                        int i22 = 0;
                                        while (i22 < i19) {
                                            if ((iArr[i21] & (1 << i22)) != 0) {
                                                c5257l.metrica(i19);
                                            }
                                            i22++;
                                            i19 = 8;
                                        }
                                        i21++;
                                        i19 = 8;
                                    }
                                    i18++;
                                    i13 = 6;
                                }
                                int iMopub10 = c5257l.mopub(i13) + 1;
                                for (int i23 = 0; i23 < iMopub10; i23++) {
                                    int iMopub11 = c5257l.mopub(16);
                                    if (iMopub11 != 0) {
                                        AbstractC6427l.admob("VorbisUtil", "mapping type other than 0 not supported: " + iMopub11);
                                    } else {
                                        int iMopub12 = c5257l.billing() ? c5257l.mopub(4) + 1 : 1;
                                        if (c5257l.billing()) {
                                            int iMopub13 = c5257l.mopub(8) + 1;
                                            for (int i24 = 0; i24 < iMopub13; i24++) {
                                                int i25 = i3 - 1;
                                                int i26 = 0;
                                                for (int i27 = i25; i27 > 0; i27 >>>= 1) {
                                                    i26++;
                                                }
                                                c5257l.metrica(i26);
                                                int i28 = 0;
                                                while (i25 > 0) {
                                                    i28++;
                                                    i25 >>>= 1;
                                                }
                                                c5257l.metrica(i28);
                                            }
                                        }
                                        if (c5257l.mopub(2) != 0) {
                                            throw C17655l.yandex(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iMopub12 > 1) {
                                            for (int i29 = 0; i29 < i3; i29++) {
                                                c5257l.metrica(4);
                                            }
                                        }
                                        for (int i30 = 0; i30 < iMopub12; i30++) {
                                            c5257l.metrica(8);
                                            c5257l.metrica(8);
                                            c5257l.metrica(8);
                                        }
                                    }
                                }
                                int iMopub14 = c5257l.mopub(6);
                                int i31 = iMopub14 + 1;
                                C14706l[] c14706lArr = new C14706l[i31];
                                for (int i32 = 0; i32 < i31; i32++) {
                                    boolean zBilling2 = c5257l.billing();
                                    c5257l.mopub(16);
                                    c5257l.mopub(16);
                                    c5257l.mopub(8);
                                    c14706lArr[i32] = new C14706l(zBilling2, 7);
                                }
                                if (!c5257l.billing()) {
                                    throw C17655l.yandex(null, "framing bit after modes not set as expected");
                                }
                                int i33 = 0;
                                while (iMopub14 > 0) {
                                    i33++;
                                    iMopub14 >>>= 1;
                                }
                                c9598l = new C9598l(c9892l, c11440l, bArr, c14706lArr, i33);
                                break;
                            }
                            int iMopub15 = c5257l.mopub(i7);
                            if (iMopub15 == 0) {
                                int i34 = i12;
                                c5257l.metrica(i34);
                                c5257l.metrica(16);
                                c5257l.metrica(16);
                                c5257l.metrica(6);
                                c5257l.metrica(i34);
                                int iMopub16 = c5257l.mopub(4) + 1;
                                int i35 = 0;
                                while (i35 < iMopub16) {
                                    c5257l.metrica(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iMopub15 != i15) {
                                    throw C17655l.yandex(null, "floor type greater than 1 not decodable: " + iMopub15);
                                }
                                int iMopub17 = c5257l.mopub(5);
                                int[] iArr2 = new int[iMopub17];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iMopub17; i37++) {
                                    int iMopub18 = c5257l.mopub(i);
                                    iArr2[i37] = iMopub18;
                                    if (iMopub18 > i36) {
                                        i36 = iMopub18;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr3 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    iArr3[i39] = c5257l.mopub(i17) + 1;
                                    int iMopub19 = c5257l.mopub(2);
                                    int i40 = i12;
                                    if (iMopub19 > 0) {
                                        c5257l.metrica(i40);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i41 = 0;
                                    for (int i42 = 1; i41 < (i42 << iMopub19); i42 = 1) {
                                        c5257l.metrica(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    iArr3 = iArr4;
                                    i12 = 8;
                                    i17 = 3;
                                }
                                int[] iArr5 = iArr3;
                                c5257l.metrica(2);
                                int iMopub20 = c5257l.mopub(4);
                                int i43 = 0;
                                int i44 = 0;
                                for (int i45 = 0; i45 < iMopub17; i45++) {
                                    i43 += iArr5[iArr2[i45]];
                                    while (i44 < i43) {
                                        c5257l.metrica(iMopub20);
                                        i44++;
                                    }
                                }
                            }
                            i16++;
                            i12 = 8;
                            i13 = 6;
                            i = 4;
                            i7 = 16;
                            i15 = 1;
                        }
                    }
                }
            }
            this.vip = c9598l;
            if (c9598l == null) {
                return true;
            }
            C9892l c9892l2 = (C9892l) c9598l.f19549l;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) c9892l2.mopub);
            arrayList.add((byte[]) c9598l.f19552l);
            C7417l c7417lBilling = AbstractC6968l.billing(AbstractC1186l.pro(((C11440l) c9598l.f19553l).f23023l));
            C12984l c12984l = new C12984l();
            c12984l.remoteconfig = AbstractC3825l.vip("audio/ogg");
            c12984l.vip = AbstractC3825l.vip("audio/vorbis");
            c12984l.admob = c9892l2.amazon;
            c12984l.subs = c9892l2.crashlytics;
            c12984l.f25447throws = c9892l2.yandex;
            c12984l.f25442package = c9892l2.loadAd;
            c12984l.adcel = arrayList;
            c12984l.firebase = c7417lBilling;
            c2494l.f5291l = new C5978l(c12984l);
            return true;
        }
        AbstractC6968l.admob(1, c13143l, false);
        c13143l.subscription();
        int iSignatures2 = c13143l.signatures();
        int iSubscription = c13143l.subscription();
        int iMetrica = c13143l.metrica();
        if (iMetrica <= 0) {
            iMetrica = -1;
        }
        int iMetrica2 = c13143l.metrica();
        int i46 = iMetrica2 > 0 ? iMetrica2 : -1;
        c13143l.metrica();
        int iSignatures3 = c13143l.signatures();
        int iPow = (int) Math.pow(2.0d, iSignatures3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iSignatures3 & 240) >> 4);
        c13143l.signatures();
        ?? CopyOf = Arrays.copyOf(c13143l.yandex, c13143l.crashlytics);
        C9892l c9892l3 = new C9892l();
        c9892l3.yandex = iSignatures2;
        c9892l3.loadAd = iSubscription;
        c9892l3.crashlytics = iMetrica;
        c9892l3.amazon = i46;
        c9892l3.purchase = iPow;
        c9892l3.billing = iPow2;
        c9892l3.mopub = CopyOf;
        this.adcel = c9892l3;
        c9598l = null;
        this.vip = c9598l;
        if (c9598l == null) {
            return true;
        }
        C9892l c9892l4 = (C9892l) c9598l.f19549l;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) c9892l4.mopub);
        arrayList2.add((byte[]) c9598l.f19552l);
        C7417l c7417lBilling2 = AbstractC6968l.billing(AbstractC1186l.pro(((C11440l) c9598l.f19553l).f23023l));
        C12984l c12984l2 = new C12984l();
        c12984l2.remoteconfig = AbstractC3825l.vip("audio/ogg");
        c12984l2.vip = AbstractC3825l.vip("audio/vorbis");
        c12984l2.admob = c9892l4.amazon;
        c12984l2.subs = c9892l4.crashlytics;
        c12984l2.f25447throws = c9892l4.yandex;
        c12984l2.f25442package = c9892l4.loadAd;
        c12984l2.adcel = arrayList2;
        c12984l2.firebase = c7417lBilling2;
        c2494l.f5291l = new C5978l(c12984l2);
        return true;
    }

    @Override // defpackage.AbstractC2634l
    public final long loadAd(C13143l c13143l) {
        byte b = c13143l.yandex[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C9598l c9598l = this.vip;
        c9598l.getClass();
        boolean z = ((C14706l[]) c9598l.f19554l)[(b >> 1) & (255 >>> (8 - c9598l.f19550l))].f28767l;
        C9892l c9892l = (C9892l) c9598l.f19549l;
        int i = !z ? c9892l.purchase : c9892l.billing;
        long j = this.startapp ? (this.metrica + i) / 4 : 0;
        byte[] bArr = c13143l.yandex;
        int length = bArr.length;
        int i2 = c13143l.crashlytics + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            c13143l.m3565private(bArrCopyOf.length, bArrCopyOf);
        } else {
            c13143l.m3561extends(i2);
        }
        byte[] bArr2 = c13143l.yandex;
        int i3 = c13143l.crashlytics;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.startapp = true;
        this.metrica = i;
        return j;
    }

    @Override // defpackage.AbstractC2634l
    public final void yandex(long j) {
        this.mopub = j;
        this.startapp = j != 0;
        C9892l c9892l = this.adcel;
        this.metrica = c9892l != null ? c9892l.purchase : 0;
    }
}
