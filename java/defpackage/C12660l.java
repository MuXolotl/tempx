package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12660l {
    public final ArrayList admob;
    public final C6295l amazon;
    public final ArrayList billing;
    public int crashlytics;
    public C5280l isPro;
    public C13698l loadAd;
    public final ArrayList mopub;
    public final ArrayList purchase;
    public final ArrayList subs;
    public final C13660l yandex;

    public C12660l() {
        long[] jArr = AbstractC12154l.yandex;
        this.yandex = new C13660l();
        C6295l c6295l = AbstractC13087l.yandex;
        this.amazon = new C6295l();
        this.purchase = new ArrayList();
        this.billing = new ArrayList();
        this.mopub = new ArrayList();
        this.admob = new ArrayList();
        this.subs = new ArrayList();
    }

    public static int admob(int[] iArr, InterfaceC9146l interfaceC9146l, boolean z) {
        int iRemoteconfig = interfaceC9146l.remoteconfig();
        int iMopub = interfaceC9146l.mopub() + iRemoteconfig;
        int iMax = 0;
        while (iRemoteconfig < iMopub) {
            int iCrashlytics = AbstractC3124l.crashlytics(interfaceC9146l, z) + iArr[iRemoteconfig];
            iArr[iRemoteconfig] = iCrashlytics;
            iMax = Math.max(iMax, iCrashlytics);
            iRemoteconfig++;
        }
        return iMax;
    }

    public static void crashlytics(InterfaceC9146l interfaceC9146l, int i, C14597l c14597l, boolean z) {
        int i2 = 0;
        long jSmaato = interfaceC9146l.smaato(0);
        long jYandex = z ? C5177l.yandex(0, i, 1, jSmaato) : C5177l.yandex(i, 0, 2, jSmaato);
        C7136l[] c7136lArr = c14597l.yandex;
        int length = c7136lArr.length;
        int i3 = 0;
        while (i2 < length) {
            C7136l c7136l = c7136lArr[i2];
            int i4 = i3 + 1;
            if (c7136l != null) {
                c7136l.smaato = C5177l.amazon(jYandex, C5177l.crashlytics(interfaceC9146l.smaato(i3), jSmaato));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:215:0x04df  */
    /* JADX WARN: Code duplicated, block: B:262:0x00d7 A[EDGE_INSN: B:262:0x00d7->B:49:0x00d7 BREAK  A[LOOP:2: B:35:0x0097->B:47:0x00d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0 A[LOOP:2: B:35:0x0097->B:47:0x00d0, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r6v41, types: [lٌؚ[]] */
    /* JADX WARN: Type inference failed for: r9v30, types: [lٌؚ[]] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void amazon(int r54, int r55, int r56, java.util.ArrayList r57, defpackage.C13698l r58, defpackage.Cgoto r59, boolean r60, boolean r61, int r62, boolean r63, int r64, int r65, defpackage.InterfaceC2262l r66, defpackage.InterfaceC3685l r67) {
        /*
            Method dump skipped, instruction units count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12660l.amazon(int, int, int, java.util.ArrayList, lْٜ۟, goto, boolean, boolean, int, boolean, int, int, lؓۦۨ, lؕ۟ۦ):void");
    }

    public final void billing(Object obj) {
        C14597l c14597l = (C14597l) this.yandex.smaato(obj);
        if (c14597l != null) {
            for (C7136l c7136l : c14597l.yandex) {
                if (c7136l != null) {
                    c7136l.amazon();
                }
            }
        }
    }

    public final long loadAd() {
        ArrayList arrayList = this.subs;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            C7136l c7136l = (C7136l) arrayList.get(i);
            C11925l c11925l = c7136l.metrica;
            if (c11925l != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c7136l.smaato >> 32)) + ((int) (c11925l.Signature >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c7136l.smaato & 4294967295L)) + ((int) (c11925l.Signature & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    public final void mopub(InterfaceC9146l interfaceC9146l, boolean z) {
        C7136l[] c7136lArr = ((C14597l) this.yandex.mopub(interfaceC9146l.getKey())).yandex;
        int length = c7136lArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C7136l c7136l = c7136lArr[i];
            int i3 = i2 + 1;
            if (c7136l != null) {
                long jSmaato = interfaceC9146l.smaato(i2);
                long j = c7136l.smaato;
                if (!C5177l.loadAd(j, 9223372034707292159L) && !C5177l.loadAd(j, jSmaato)) {
                    long jCrashlytics = C5177l.crashlytics(jSmaato, j);
                    InterfaceC17807l interfaceC17807l = c7136l.purchase;
                    if (interfaceC17807l != null) {
                        long jCrashlytics2 = C5177l.crashlytics(((C5177l) c7136l.ads.getValue()).yandex, jCrashlytics);
                        c7136l.admob(jCrashlytics2);
                        c7136l.mopub(true);
                        c7136l.mopub = z;
                        AbstractC10999l.mopub(c7136l.yandex, null, 0, new C11287l(c7136l, interfaceC17807l, jCrashlytics2, null), 3);
                    }
                }
                c7136l.smaato = jSmaato;
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void purchase() {
        C13660l c13660l = this.yandex;
        if (c13660l.isPro()) {
            Object[] objArr = c13660l.crashlytics;
            long[] jArr = c13660l.yandex;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (C7136l c7136l : ((C14597l) objArr[(i << 3) + i3]).yandex) {
                                    if (c7136l != null) {
                                        c7136l.amazon();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c13660l.yandex();
        }
    }

    public final C7136l yandex(int i, Object obj) {
        C14597l c14597l = (C14597l) this.yandex.mopub(obj);
        if (c14597l != null) {
            return c14597l.yandex[i];
        }
        return null;
    }
}
