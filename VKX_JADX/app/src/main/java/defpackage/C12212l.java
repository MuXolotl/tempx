package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: renamed from: lِۣۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12212l {
    public boolean admob;
    public boolean amazon;
    public boolean billing;
    public final InterfaceC11759l[] crashlytics;
    public final C16717l firebase;
    public final AbstractC1091l[] isPro;
    public final Object loadAd;
    public C9598l metrica;
    public C11496l mopub;
    public boolean purchase;
    public C12212l remoteconfig;
    public final C5044l smaato;
    public long startapp;
    public final boolean[] subs;
    public C8750l vip;
    public final InterfaceC8782l yandex;

    public C12212l(AbstractC1091l[] abstractC1091lArr, long j, C16717l c16717l, C0554l c0554l, C5044l c5044l, C11496l c11496l, C9598l c9598l) {
        this.isPro = abstractC1091lArr;
        this.startapp = j;
        this.firebase = c16717l;
        this.smaato = c5044l;
        C5019l c5019l = c11496l.yandex;
        this.loadAd = c5019l.yandex;
        this.mopub = c11496l;
        this.vip = C8750l.amazon;
        this.metrica = c9598l;
        this.crashlytics = new InterfaceC11759l[abstractC1091lArr.length];
        this.subs = new boolean[abstractC1091lArr.length];
        long j2 = c11496l.loadAd;
        long j3 = c11496l.purchase;
        boolean z = c11496l.mopub;
        c5044l.getClass();
        Object obj = c5019l.yandex;
        int i = C12164l.vip;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C5019l c5019lYandex = c5019l.yandex(pair.second);
        C16548l c16548l = (C16548l) ((HashMap) c5044l.purchase).get(obj2);
        c16548l.getClass();
        ((HashSet) c5044l.admob).add(c16548l);
        C16455l c16455l = (C16455l) ((HashMap) c5044l.billing).get(c16548l);
        if (c16455l != null) {
            c16455l.yandex.purchase(c16455l.loadAd);
        }
        c16548l.crashlytics.add(c5019lYandex);
        InterfaceC8782l interfaceC8782lLoadAd = c16548l.yandex.loadAd(c5019lYandex, c0554l, j2);
        ((IdentityHashMap) c5044l.amazon).put(interfaceC8782lLoadAd, c16548l);
        c5044l.amazon();
        if (j3 != -9223372036854775807L) {
            interfaceC8782lLoadAd = new C15810l(interfaceC8782lLoadAd, !z, 0L, j3, 0);
        }
        this.yandex = interfaceC8782lLoadAd;
    }

    public final boolean admob() {
        if (this.purchase) {
            return mopub() || amazon() - this.mopub.loadAd >= -9223372036854775807L;
        }
        return false;
    }

    public final long amazon() {
        if (!this.purchase) {
            return this.mopub.loadAd;
        }
        long jAds = this.billing ? this.yandex.ads() : Long.MIN_VALUE;
        return jAds == Long.MIN_VALUE ? this.mopub.billing : jAds;
    }

    public final void billing(float f, AbstractC10759l abstractC10759l, boolean z) {
        this.purchase = true;
        this.vip = this.yandex.metrica();
        C9598l c9598lIsPro = isPro(f, abstractC10759l, z);
        C11496l c11496l = this.mopub;
        long jMax = c11496l.loadAd;
        long j = c11496l.billing;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jYandex = yandex(c9598lIsPro, jMax, false, new boolean[this.isPro.length]);
        long j2 = this.startapp;
        C11496l c11496l2 = this.mopub;
        this.startapp = (c11496l2.loadAd - jYandex) + j2;
        this.mopub = c11496l2.loadAd(jYandex, c11496l2.crashlytics);
    }

    public final void crashlytics() {
        if (this.remoteconfig != null) {
            return;
        }
        int i = 0;
        while (true) {
            C9598l c9598l = this.metrica;
            if (i >= c9598l.f19550l) {
                return;
            }
            boolean zPremium = c9598l.premium(i);
            InterfaceC10376l interfaceC10376l = ((InterfaceC10376l[]) this.metrica.f19553l)[i];
            if (zPremium && interfaceC10376l != null) {
                interfaceC10376l.startapp();
            }
            i++;
        }
    }

    public final void firebase() {
        InterfaceC8782l interfaceC8782l = this.yandex;
        if (interfaceC8782l instanceof C15810l) {
            long j = this.mopub.purchase;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C15810l c15810l = (C15810l) interfaceC8782l;
            c15810l.f31050l = 0L;
            c15810l.f31044l = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02f6  */
    public final C9598l isPro(float f, AbstractC10759l abstractC10759l, boolean z) {
        C9205l c9205l;
        String str;
        int[] iArr;
        C8750l[] c8750lArr;
        int[][][] iArr2;
        int[] iArr3;
        C8750l[] c8750lArr2;
        C13708l c13708lIsVip;
        int[] iArr4;
        long[][] jArr;
        String languageTag;
        Pair pairMetrica;
        CaptioningManager captioningManager;
        Locale locale;
        boolean z2;
        Context context;
        int[] iArr5;
        C16717l c16717l = this.firebase;
        AbstractC1091l[] abstractC1091lArr = this.isPro;
        C8750l c8750l = this.vip;
        c16717l.getClass();
        int i = 1;
        int[] iArr6 = new int[abstractC1091lArr.length + 1];
        int length = abstractC1091lArr.length + 1;
        C11916l[][] c11916lArr = new C11916l[length][];
        int[][][] iArr7 = new int[abstractC1091lArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = c8750l.yandex;
            c11916lArr[i2] = new C11916l[i3];
            iArr7[i2] = new int[i3][];
        }
        int length2 = abstractC1091lArr.length;
        int[] iArr8 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr8[i4] = abstractC1091lArr[i4].applovin();
        }
        int i5 = 0;
        while (i5 < c8750l.yandex) {
            C11916l c11916lYandex = c8750l.yandex(i5);
            int i6 = c11916lYandex.crashlytics == 5 ? i : 0;
            int length3 = abstractC1091lArr.length;
            int i7 = i;
            int i8 = 0;
            int i9 = 0;
            while (i8 < abstractC1091lArr.length) {
                AbstractC1091l abstractC1091l = abstractC1091lArr[i8];
                C8750l c8750l2 = c8750l;
                int[] iArr9 = iArr6;
                int i10 = i;
                int iMax = 0;
                for (int i11 = 0; i11 < c11916lYandex.yandex; i11++) {
                    iMax = Math.max(iMax, abstractC1091l.premium(c11916lYandex.amazon[i11]) & 7);
                }
                int i12 = iArr9[i8] == 0 ? i10 : 0;
                if (iMax > i9 || (iMax == i9 && i6 != 0 && i7 == 0 && i12 != 0)) {
                    i9 = iMax;
                    i7 = i12;
                    length3 = i8;
                }
                i8++;
                i = i10;
                c8750l = c8750l2;
                iArr6 = iArr9;
            }
            C8750l c8750l3 = c8750l;
            int[] iArr10 = iArr6;
            int i13 = i;
            if (length3 == abstractC1091lArr.length) {
                iArr5 = new int[c11916lYandex.yandex];
            } else {
                AbstractC1091l abstractC1091l2 = abstractC1091lArr[length3];
                int[] iArr11 = new int[c11916lYandex.yandex];
                for (int i14 = 0; i14 < c11916lYandex.yandex; i14++) {
                    iArr11[i14] = abstractC1091l2.premium(c11916lYandex.amazon[i14]);
                }
                iArr5 = iArr11;
            }
            int i15 = iArr10[length3];
            c11916lArr[length3][i15] = c11916lYandex;
            iArr7[length3][i15] = iArr5;
            iArr10[length3] = i15 + 1;
            i5++;
            i = i13;
            c8750l = c8750l3;
            iArr6 = iArr10;
        }
        int[] iArr12 = iArr6;
        int i16 = i;
        C8750l[] c8750lArr3 = new C8750l[abstractC1091lArr.length];
        String[] strArr = new String[abstractC1091lArr.length];
        int[] iArr13 = new int[abstractC1091lArr.length];
        for (int i17 = 0; i17 < abstractC1091lArr.length; i17++) {
            int i18 = iArr12[i17];
            c8750lArr3[i17] = new C8750l((C11916l[]) AbstractC15323l.m3972interface(i18, c11916lArr[i17]));
            iArr7[i17] = (int[][]) AbstractC15323l.m3972interface(i18, iArr7[i17]);
            strArr[i17] = abstractC1091lArr[i17].isPro();
            iArr13[i17] = abstractC1091lArr[i17].f3012l;
        }
        C10940l c10940l = new C10940l(iArr13, c8750lArr3, iArr8, iArr7, new C8750l((C11916l[]) AbstractC15323l.m3972interface(iArr12[abstractC1091lArr.length], c11916lArr[abstractC1091lArr.length])));
        synchronized (c16717l.crashlytics) {
            c16717l.mopub = Thread.currentThread();
            c9205l = c16717l.billing;
        }
        if (c16717l.isPro == null && (context = c16717l.amazon) != null) {
            c16717l.isPro = Boolean.valueOf(AbstractC15323l.m3964else(context));
        }
        if (c9205l.f18941l && Build.VERSION.SDK_INT >= 32 && c16717l.admob == null) {
            c16717l.admob = new C3582l(c16717l.amazon, new RunnableC16112l(29, c16717l), c16717l.isPro);
        }
        int i19 = c10940l.yandex;
        C17833l[] c17833lArr = new C17833l[i19];
        C16717l.amazon(c10940l, c9205l, c17833lArr);
        C16717l.loadAd(c10940l, c9205l, c17833lArr);
        C16717l.crashlytics(c10940l, c9205l, c17833lArr);
        Context context2 = c16717l.amazon;
        int i20 = c10940l.yandex;
        Pair pairBilling = C16717l.billing(c17833lArr, i16);
        if (pairBilling == null) {
            int i21 = 0;
            while (true) {
                if (i21 >= i20) {
                    z2 = false;
                    break;
                }
                if (2 == iArr13[i21] && c8750lArr3[i21].yandex > 0) {
                    z2 = true;
                    break;
                }
                i21++;
            }
            pairBilling = C16717l.metrica(1, c10940l, iArr7, new C4018l(z2, c16717l, c9205l, iArr8), new C2351l(10));
            if (pairBilling != null) {
                c17833lArr[((Integer) pairBilling.second).intValue()] = (C17833l) pairBilling.first;
            }
        }
        if (pairBilling == null) {
            str = null;
        } else {
            C17833l c17833l = (C17833l) pairBilling.first;
            str = c17833l.yandex.amazon[c17833l.loadAd[0]].amazon;
        }
        Pair pairBilling2 = C16717l.billing(c17833lArr, 2);
        Pair pairBilling3 = C16717l.billing(c17833lArr, 4);
        if (pairBilling2 == null && pairBilling3 == null) {
            Pair pairMetrica2 = c9205l.pro.yandex == 2 ? null : C16717l.metrica(2, c10940l, iArr7, new C0615l(c9205l, str, iArr8, (!c9205l.firebase || context2 == null) ? null : AbstractC15323l.advert(context2)), new C2351l(9));
            Pair pairMetrica3 = ((c9205l.inmobi || pairMetrica2 == null) && c9205l.pro.yandex != 2) ? C16717l.metrica(4, c10940l, iArr7, new C2683l(20, c9205l), new C2351l(8)) : null;
            if (pairMetrica3 != null) {
                c17833lArr[((Integer) pairMetrica3.second).intValue()] = (C17833l) pairMetrica3.first;
            } else if (pairMetrica2 != null) {
                c17833lArr[((Integer) pairMetrica2.second).intValue()] = (C17833l) pairMetrica2.first;
            }
        }
        int i22 = 3;
        if (C16717l.billing(c17833lArr, 3) == null) {
            if (c9205l.pro.yandex == 2) {
                pairMetrica = null;
            } else {
                if (!c9205l.premium || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    languageTag = null;
                } else {
                    String str2 = AbstractC15323l.yandex;
                    languageTag = locale.toLanguageTag();
                }
                pairMetrica = C16717l.metrica(3, c10940l, iArr7, new C17706l(c9205l, str, languageTag, i22), new C2351l(11));
            }
            if (pairMetrica != null) {
                c17833lArr[((Integer) pairMetrica.second).intValue()] = (C17833l) pairMetrica.first;
            }
        }
        int iAds = AbstractC4338l.ads(0, 0, 0, 0);
        if (c9205l.pro.yandex == 2) {
            iArr = iArr13;
            c8750lArr = c8750lArr3;
            iArr2 = iArr7;
        } else {
            C4146l c4146l = new C4146l(4);
            int i23 = 0;
            while (i23 < i19) {
                C17833l c17833l2 = c17833lArr[i23];
                if (c17833l2 != null) {
                    C11916l c11916l = c17833l2.yandex;
                    if (c9205l.f18942l.get(i23)) {
                        iArr3 = iArr13;
                    } else {
                        iArr3 = iArr13;
                        if (!c9205l.f10155strictfp.contains(Integer.valueOf(c11916l.crashlytics))) {
                            c4146l.yandex(c11916l.loadAd);
                            int i24 = 0;
                            while (true) {
                                int[] iArr14 = c17833l2.loadAd;
                                c8750lArr2 = c8750lArr3;
                                if (i24 < iArr14.length) {
                                    String str3 = c11916l.amazon[iArr14[i24]].remoteconfig;
                                    if (str3 != null) {
                                        c4146l.crashlytics(str3);
                                    }
                                    i24++;
                                    c8750lArr3 = c8750lArr2;
                                }
                            }
                        }
                    }
                    c8750lArr2 = c8750lArr3;
                } else {
                    iArr3 = iArr13;
                    c8750lArr2 = c8750lArr3;
                }
                i23++;
                iArr13 = iArr3;
                c8750lArr3 = c8750lArr2;
            }
            iArr = iArr13;
            c8750lArr = c8750lArr3;
            AbstractC8481l abstractC8481lMopub = c4146l.mopub();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i25 = 0;
            while (i25 < i20) {
                if (iArr[i25] == 5) {
                    C8750l c8750l4 = c8750lArr[i25];
                    int i26 = 0;
                    while (i26 < c8750l4.yandex) {
                        C11916l c11916lYandex2 = c8750l4.yandex(i26);
                        arrayList.add(c11916lYandex2);
                        int i27 = i25;
                        int[] iArr15 = (int[]) iArr7[i25][i26].clone();
                        C8750l c8750l5 = c8750l4;
                        int[][][] iArr16 = iArr7;
                        for (int i28 = 0; i28 < iArr15.length; i28++) {
                            String str4 = c11916lYandex2.amazon[i28].remoteconfig;
                            if (str4 != null && !abstractC8481lMopub.contains(str4)) {
                                iArr15[i28] = iAds;
                            }
                        }
                        arrayList2.add(iArr15);
                        i26++;
                        c8750l4 = c8750l5;
                        i25 = i27;
                        iArr7 = iArr16;
                    }
                }
                i25++;
                iArr7 = iArr7;
            }
            iArr2 = iArr7;
            int size = arrayList.size();
            C11916l[] c11916lArr2 = new C11916l[size];
            AbstractC12442l.subscription(arrayList.size() == size);
            arrayList.toArray(c11916lArr2);
            C8750l c8750l6 = new C8750l(c11916lArr2);
            int size2 = arrayList2.size();
            int[][] iArr17 = new int[size2][];
            AbstractC12442l.subscription(arrayList2.size() == size2);
            arrayList2.toArray(iArr17);
            for (int i29 = 0; i29 < i20; i29++) {
                if (iArr[i29] == 5) {
                    C17833l c17833lVip = C16717l.vip(c8750l6, iArr17, c9205l);
                    c17833lArr[i29] = c17833lVip;
                    if (c17833lVip == null) {
                        break;
                    }
                    Arrays.fill(iArr17[c8750l6.loadAd(c17833lVip.yandex)], iAds);
                }
            }
        }
        for (int i30 = 0; i30 < i20; i30++) {
            int i31 = iArr[i30];
            if (i31 != 2 && i31 != 1) {
                if (i31 != 3 && i31 != 4) {
                    if (i31 != 5 && c17833lArr[i30] == null) {
                        c17833lArr[i30] = C16717l.vip(c8750lArr[i30], iArr2[i30], c9205l);
                    }
                }
            }
        }
        C16717l.amazon(c10940l, c9205l, c17833lArr);
        C16717l.loadAd(c10940l, c9205l, c17833lArr);
        C16717l.crashlytics(c10940l, c9205l, c17833lArr);
        C8565l c8565l = c16717l.purchase;
        C7713l c7713l = c16717l.loadAd;
        c7713l.getClass();
        c8565l.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (C17833l c17833l3 : c17833lArr) {
            if (c17833l3 == null || c17833l3.loadAd.length <= 1) {
                arrayList3.add(null);
            } else {
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                c16971lMetrica.crashlytics(new C13558l(0L, 0L));
                arrayList3.add(c16971lMetrica);
            }
        }
        int length4 = c17833lArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i32 = 0; i32 < c17833lArr.length; i32++) {
            C17833l c17833l4 = c17833lArr[i32];
            if (c17833l4 == null) {
                jArr2[i32] = new long[0];
            } else {
                int[] iArr18 = c17833l4.loadAd;
                jArr2[i32] = new long[iArr18.length];
                for (int i33 = 0; i33 < iArr18.length; i33++) {
                    long j = c17833l4.yandex.amazon[iArr18[i33]].isPro;
                    long[] jArr3 = jArr2[i32];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i33] = j;
                }
                Arrays.sort(jArr2[i32]);
            }
        }
        int[] iArr19 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i34 = 0; i34 < length4; i34++) {
            long[] jArr5 = jArr2[i34];
            jArr4[i34] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        C7284l.yandex(arrayList3, jArr4);
        AbstractC12832l.loadAd(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C0058l.f957l);
        C13636l c13636l = new C13636l();
        C15423l c15423l = new C15423l(treeMap);
        c15423l.f30138l = c13636l;
        int i35 = 0;
        while (i35 < length4) {
            long[] jArr6 = jArr2[i35];
            if (jArr6.length <= 1) {
                iArr4 = iArr19;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                int i36 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i35];
                    iArr4 = iArr19;
                    double dLog = 0.0d;
                    if (i36 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    long j2 = jArr7[i36];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i36] = dLog;
                    i36++;
                    iArr19 = iArr4;
                    jArr2 = jArr8;
                }
                jArr = jArr2;
                int i37 = length5 - 1;
                double d = dArr[i37] - dArr[0];
                int i38 = 0;
                while (i38 < i37) {
                    double d2 = dArr[i38];
                    i38++;
                    c15423l.isPro(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i38]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i35));
                    d = d;
                }
            }
            i35++;
            length4 = length4;
            iArr19 = iArr4;
            jArr2 = jArr;
        }
        int[] iArr20 = iArr19;
        long[][] jArr9 = jArr2;
        Collection c9897l = c15423l.f14026l;
        if (c9897l == null) {
            c9897l = new C9897l(1, c15423l);
            c15423l.f14026l = c9897l;
        }
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(c9897l);
        for (int i39 = 0; i39 < abstractC1186lSignature.size(); i39++) {
            int iIntValue = ((Integer) abstractC1186lSignature.get(i39)).intValue();
            int i40 = iArr20[iIntValue] + 1;
            iArr20[iIntValue] = i40;
            jArr4[iIntValue] = jArr9[iIntValue][i40];
            C7284l.yandex(arrayList3, jArr4);
        }
        for (int i41 = 0; i41 < c17833lArr.length; i41++) {
            if (arrayList3.get(i41) != null) {
                jArr4[i41] = jArr4[i41] * 2;
            }
        }
        C7284l.yandex(arrayList3, jArr4);
        C16971l c16971lMetrica2 = AbstractC1186l.metrica();
        for (int i42 = 0; i42 < arrayList3.size(); i42++) {
            C16971l c16971l = (C16971l) arrayList3.get(i42);
            c16971lMetrica2.crashlytics(c16971l == null ? C13708l.f26763l : c16971l.mopub());
        }
        C13708l c13708lMopub = c16971lMetrica2.mopub();
        InterfaceC10376l[] interfaceC10376lArr = new InterfaceC10376l[c17833lArr.length];
        for (int i43 = 0; i43 < c17833lArr.length; i43++) {
            C17833l c17833l5 = c17833lArr[i43];
            if (c17833l5 != null) {
                int[] iArr21 = c17833l5.loadAd;
                if (iArr21.length != 0) {
                    int length6 = iArr21.length;
                    C11916l c11916l2 = c17833l5.yandex;
                    interfaceC10376lArr[i43] = length6 == 1 ? new C6997l(c11916l2, new int[]{iArr21[0]}) : new C7284l(c11916l2, iArr21, c7713l, (AbstractC1186l) c13708lMopub.get(i43));
                }
            }
        }
        C17614l[] c17614lArr = new C17614l[i19];
        for (int i44 = 0; i44 < i19; i44++) {
            c17614lArr[i44] = (c9205l.f18942l.get(i44) || c9205l.f10155strictfp.contains(Integer.valueOf(c10940l.loadAd[i44])) || (c10940l.loadAd[i44] != -2 && interfaceC10376lArr[i44] == null)) ? null : C17614l.crashlytics;
        }
        if (c9205l.pro.yandex != 0) {
            int i45 = 0;
            int i46 = 0;
            int i47 = -1;
            while (true) {
                if (i45 >= c10940l.yandex) {
                    if (i46 != 1) {
                        break;
                    }
                    int i48 = c9205l.pro.loadAd ? 1 : 2;
                    C17614l c17614l = c17614lArr[i47];
                    c17614lArr[i47] = new C17614l(i48, c17614l != null && c17614l.loadAd);
                    break;
                }
                int i49 = c10940l.loadAd[i45];
                InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i45];
                if (i49 != 1 && interfaceC10376l != null) {
                    break;
                }
                if (i49 == 1 && interfaceC10376l != null && interfaceC10376l.length() == 1) {
                    if (C16717l.remoteconfig(c9205l, iArr2[i45][c10940l.crashlytics[i45].loadAd(interfaceC10376l.firebase())][interfaceC10376l.adcel(0)], interfaceC10376l.tapsense())) {
                        i46++;
                        i47 = i45;
                    }
                }
                i45++;
            }
        }
        Pair pairCreate = Pair.create(c17614lArr, interfaceC10376lArr);
        InterfaceC10376l[] interfaceC10376lArr2 = (InterfaceC10376l[]) pairCreate.second;
        int length7 = interfaceC10376lArr2.length;
        List[] listArr = new List[length7];
        for (int i50 = 0; i50 < interfaceC10376lArr2.length; i50++) {
            InterfaceC10376l interfaceC10376l2 = interfaceC10376lArr2[i50];
            if (interfaceC10376l2 != null) {
                c13708lIsVip = AbstractC1186l.isVip(interfaceC10376l2);
            } else {
                C9258l c9258l = AbstractC1186l.f3181l;
                c13708lIsVip = C13708l.f26763l;
            }
            listArr[i50] = c13708lIsVip;
        }
        C16971l c16971l2 = new C16971l(4);
        int i51 = 0;
        while (true) {
            int i52 = c10940l.yandex;
            C8750l[] c8750lArr4 = c10940l.crashlytics;
            if (i51 >= i52) {
                break;
            }
            C8750l c8750l7 = c8750lArr4[i51];
            int i53 = 0;
            while (i53 < c8750l7.yandex) {
                C11916l c11916lYandex3 = c8750l7.yandex(i53);
                int i54 = c8750lArr4[i51].yandex(i53).yandex;
                int[] iArr22 = new int[i54];
                int i55 = 0;
                int i56 = 0;
                while (i56 < i54) {
                    List[] listArr2 = listArr;
                    if ((c10940l.purchase[i51][i53][i56] & 7) == 4) {
                        iArr22[i55] = i56;
                        i55++;
                    }
                    i56++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr22, i55);
                int iMin = 16;
                int i57 = i51;
                int i58 = 0;
                String str5 = null;
                boolean z3 = false;
                int i59 = 0;
                while (i58 < iArrCopyOf.length) {
                    int[] iArr23 = iArrCopyOf;
                    String str6 = c8750lArr4[i57].yandex(i53).amazon[iArrCopyOf[i58]].metrica;
                    int i60 = i59 + 1;
                    if (i59 == 0) {
                        str5 = str6;
                    } else {
                        z3 = (!Objects.equals(str5, str6)) | z3;
                    }
                    iMin = Math.min(iMin, c10940l.purchase[i57][i53][i58] & 24);
                    i58++;
                    i59 = i60;
                    iArrCopyOf = iArr23;
                }
                if (z3) {
                    iMin = Math.min(iMin, c10940l.amazon[i57]);
                }
                boolean z4 = iMin != 0;
                int i61 = c11916lYandex3.yandex;
                int[] iArr24 = new int[i61];
                boolean[] zArr = new boolean[i61];
                int i62 = 0;
                while (i62 < c11916lYandex3.yandex) {
                    iArr24[i62] = c10940l.purchase[i57][i53][i62] & 7;
                    int i63 = 0;
                    boolean z5 = false;
                    while (i63 < length7) {
                        List list = listArr3[i63];
                        int i64 = length7;
                        C8750l c8750l8 = c8750l7;
                        int i65 = 0;
                        while (i65 < list.size()) {
                            InterfaceC10376l interfaceC10376l3 = (InterfaceC10376l) list.get(i65);
                            int i66 = i65;
                            if (interfaceC10376l3.firebase().equals(c11916lYandex3) && interfaceC10376l3.signatures(i62) != -1) {
                                z5 = true;
                                break;
                            }
                            i65 = i66 + 1;
                        }
                        i63++;
                        length7 = i64;
                        c8750l7 = c8750l8;
                    }
                    zArr[i62] = z5;
                    i62++;
                    c8750l7 = c8750l7;
                }
                c16971l2.crashlytics(new C14446l(c11916lYandex3, z4, iArr24, zArr));
                i53++;
                listArr = listArr3;
                i51 = i57;
                length7 = length7;
                c8750l7 = c8750l7;
            }
            i51++;
        }
        C8750l c8750l9 = c10940l.billing;
        for (int i67 = 0; i67 < c8750l9.yandex; i67++) {
            C11916l c11916lYandex4 = c8750l9.yandex(i67);
            int[] iArr25 = new int[c11916lYandex4.yandex];
            Arrays.fill(iArr25, 0);
            c16971l2.crashlytics(new C14446l(c11916lYandex4, false, iArr25, new boolean[c11916lYandex4.yandex]));
        }
        C9598l c9598l = new C9598l((C17614l[]) pairCreate.first, (InterfaceC10376l[]) pairCreate.second, new C1047l(c16971l2.mopub()), c10940l);
        for (int i68 = 0; i68 < c9598l.f19550l; i68++) {
            boolean zPremium = c9598l.premium(i68);
            InterfaceC10376l[] interfaceC10376lArr3 = (InterfaceC10376l[]) c9598l.f19553l;
            if (zPremium) {
                AbstractC12442l.subscription(interfaceC10376lArr3[i68] != null || this.isPro[i68].f3012l == -2);
            } else {
                AbstractC12442l.subscription(interfaceC10376lArr3[i68] == null);
            }
        }
        for (InterfaceC10376l interfaceC10376l4 : (InterfaceC10376l[]) c9598l.f19553l) {
            if (interfaceC10376l4 != null) {
                interfaceC10376l4.pro(f);
                interfaceC10376l4.vip(z);
            }
        }
        return c9598l;
    }

    public final void loadAd() {
        if (this.remoteconfig != null) {
            return;
        }
        int i = 0;
        while (true) {
            C9598l c9598l = this.metrica;
            if (i >= c9598l.f19550l) {
                return;
            }
            boolean zPremium = c9598l.premium(i);
            InterfaceC10376l interfaceC10376l = ((InterfaceC10376l[]) this.metrica.f19553l)[i];
            if (zPremium && interfaceC10376l != null) {
                interfaceC10376l.admob();
            }
            i++;
        }
    }

    public final boolean mopub() {
        if (this.purchase) {
            return !this.billing || this.yandex.ads() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long purchase() {
        return this.mopub.loadAd + this.startapp;
    }

    public final void subs() {
        loadAd();
        InterfaceC8782l interfaceC8782l = this.yandex;
        try {
            boolean z = interfaceC8782l instanceof C15810l;
            C5044l c5044l = this.smaato;
            if (z) {
                c5044l.admob(((C15810l) interfaceC8782l).f31047l);
            } else {
                c5044l.admob(interfaceC8782l);
            }
        } catch (RuntimeException e) {
            AbstractC6427l.subs("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final long yandex(C9598l c9598l, long j, boolean z, boolean[] zArr) {
        AbstractC1091l[] abstractC1091lArr;
        InterfaceC11759l[] interfaceC11759lArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c9598l.f19550l) {
                break;
            }
            if (z || !c9598l.signatures(this.metrica, i)) {
                z2 = false;
            }
            this.subs[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC1091lArr = this.isPro;
            int length = abstractC1091lArr.length;
            interfaceC11759lArr = this.crashlytics;
            if (i2 >= length) {
                break;
            }
            if (abstractC1091lArr[i2].f3012l == -2) {
                interfaceC11759lArr[i2] = null;
            }
            i2++;
        }
        loadAd();
        this.metrica = c9598l;
        crashlytics();
        long jPurchase = this.yandex.purchase((InterfaceC10376l[]) c9598l.f19553l, this.subs, this.crashlytics, zArr, j);
        for (int i3 = 0; i3 < abstractC1091lArr.length; i3++) {
            if (abstractC1091lArr[i3].f3012l == -2 && this.metrica.premium(i3)) {
                interfaceC11759lArr[i3] = new C6565l(0);
            }
        }
        this.billing = false;
        for (int i4 = 0; i4 < interfaceC11759lArr.length; i4++) {
            if (interfaceC11759lArr[i4] != null) {
                AbstractC12442l.subscription(c9598l.premium(i4));
                if (abstractC1091lArr[i4].f3012l != -2) {
                    this.billing = true;
                }
            } else {
                AbstractC12442l.subscription(((InterfaceC10376l[]) c9598l.f19553l)[i4] == null);
            }
        }
        return jPurchase;
    }
}
