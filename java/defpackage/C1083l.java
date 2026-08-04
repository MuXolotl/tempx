package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٖؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1083l implements InterfaceC6688l, InterfaceC15446l, InterfaceC2702l, InterfaceC10240l, InterfaceC13540l, InterfaceC5152l, InterfaceC4852l, InterfaceC10377l, InterfaceC5404l, InterfaceC17562l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static C15399l f2983l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C1083l f2986l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3001l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1083l f2979l = new C1083l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1083l f2993l = new C1083l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8896l f2992l = new C8896l(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C1083l f2996l = new C1083l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C1083l f2980l = new C1083l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C1083l f2995l = new C1083l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C1083l f2990l = new C1083l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C1083l f2997l = new C1083l(9);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C1083l f2994l = new C1083l(10);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C1083l f2978l = new C1083l(11);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C5083l f2998l = new C5083l();

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C1083l f2991l = new C1083l(12);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C1083l f2984l = new C1083l(13);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C1083l f2988l = new C1083l(14);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C1083l f2999l = new C1083l(15);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C1083l f2987l = new C1083l(16);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C1083l f2982l = new C1083l(17);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C1083l f2981l = new C1083l(18);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C1083l f2977l = new C1083l(19);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C1083l f3000l = new C1083l(20);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C1083l f2985l = new C1083l(21);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C1083l f2989l = new C1083l(22);

    public /* synthetic */ C1083l(int i) {
        this.f3001l = i;
    }

    public static C14005l admob(List list, InterfaceC11865l interfaceC11865l, EnumC15893l enumC15893l) {
        List listM4213const = AbstractC16901l.m4213const(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM4213const.iterator();
        while (it.hasNext()) {
            AbstractC0757l abstractC0757lSubs = subs(null, it.next());
            if (abstractC0757lSubs != null) {
                arrayList.add(abstractC0757lSubs);
            }
        }
        return interfaceC11865l != null ? new C1691l(arrayList, interfaceC11865l.subs().adcel(enumC15893l)) : new C14005l(arrayList, new C6238l(12, enumC15893l));
    }

    public static C6906l ads(C8195l[] c8195lArr) {
        return subscription((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))));
    }

    public static C6906l license(List list, float f, float f2, int i) {
        return new C6906l(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L));
    }

    public static /* synthetic */ Serializable metrica(C1083l c1083l, int i, int i2, AbstractC0283l abstractC0283l, int i3) {
        C16287l.yandex.getClass();
        return c1083l.vip(C16287l.crashlytics(), false, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, abstractC0283l);
    }

    public static C6906l pro(C8195l[] c8195lArr) {
        return subscription((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [lَؚؑ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final Object purchase(String str, File file, Function2 function2, CancellationSignal cancellationSignal, C10803l c10803l) throws Throwable {
        Throwable th;
        Throwable th2;
        Long lValueOf;
        file.delete();
        ?? r6 = 0;
        Throwable th3 = null;
        if (!AbstractC12024l.appmetrica(str, ".mp3", false)) {
            C16552l c16552l = AbstractC11463l.yandex;
            Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4647l(str, file, function2, (InterfaceC14029l) r6, 26), c10803l);
            return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
        }
        if (AbstractC16648l.isVip(str, "/data/", false)) {
            C12382l c12382l = AbstractC5921l.f12465l;
            String str2 = C14025l.f27330l;
            ?? c7167l = new C7167l(c12382l.mo691continue(C6162l.ads(file), false));
            try {
                C1503l c1503l = new C1503l(c12382l.mo692default(C6162l.adcel(str, false)));
                try {
                    lValueOf = Long.valueOf(c7167l.mo736volatile(c1503l));
                    try {
                        c1503l.close();
                        th2 = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        c1503l.close();
                    } catch (Throwable th6) {
                        AbstractC11718l.yandex(th5, th6);
                    }
                    th2 = th5;
                    lValueOf = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                lValueOf.getClass();
                try {
                    c7167l.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
                if (th3 != null) {
                    throw th3;
                }
            } catch (Throwable th8) {
                th3 = th8;
                try {
                    c7167l.close();
                } catch (Throwable th9) {
                    AbstractC11718l.yandex(th3, th9);
                }
            }
        } else {
            C7167l c7167l2 = new C7167l(AbstractC7709l.amazon(file));
            try {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C11610l c11610l = AbstractC3629l.yandex;
                if (c11610l == null) {
                    c11610l = null;
                }
                C11644l c11644l = new C11644l(28);
                c11644l.m3157l(str);
                AbstractC6897l abstractC6897l = c11610l.yandex(new C17032l(c11644l)).billing().f35907l;
                if (abstractC6897l != null) {
                    try {
                        float fBilling = abstractC6897l.billing();
                        InterfaceC9473l interfaceC9473lMo1516l = abstractC6897l.mo1516l();
                        long j = 0;
                        while (true) {
                            if (!cancellationSignal.isCanceled()) {
                                long jAd = interfaceC9473lMo1516l.ad(c7167l2.f14998l, 8192L);
                                if (jAd == -1) {
                                    break;
                                }
                                j += jAd;
                                c7167l2.yandex();
                                if (function2 != null) {
                                    function2.invoke(Integer.valueOf((int) (((Number) AbstractC8576l.admob(Float.valueOf(j / fBilling), new C12015l(0.0f, 1.0f))).floatValue() * 100.0f)), 100);
                                }
                            } else {
                                file.delete();
                                break;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        try {
                            abstractC6897l.close();
                            th = null;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        try {
                            abstractC6897l.close();
                        } catch (Throwable th12) {
                            AbstractC11718l.yandex(th11, th12);
                        }
                        th = th11;
                    }
                    if (th != null) {
                        throw th;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                try {
                    c7167l2.close();
                } catch (Throwable th13) {
                    r6 = th13;
                }
            } catch (Throwable th14) {
                try {
                    c7167l2.close();
                } catch (Throwable th15) {
                    AbstractC11718l.yandex(th14, th15);
                }
                r6 = th14;
            }
            if (r6 != 0) {
                throw r6;
            }
        }
        return Unit.INSTANCE;
    }

    public static C6906l startapp(List list) {
        return new C6906l(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static AbstractC0757l subs(C10202l c10202l, Object obj) {
        if (obj instanceof Byte) {
            return new C14548l(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C3001l(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C18009l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C16954l(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C1802l((Character) obj);
        }
        if (obj instanceof Float) {
            return new C4823l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C4823l(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4823l((Boolean) obj);
        }
        if (obj instanceof String) {
            return new C7391l((String) obj);
        }
        if (obj instanceof byte[]) {
            return admob(AbstractC8669l.m2404final((byte[]) obj), c10202l, EnumC15893l.BYTE);
        }
        boolean z = obj instanceof short[];
        ?? SingletonList = C2580l.f5619l;
        int i = 0;
        if (z) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    SingletonList = new ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i < length2) {
                        SingletonList.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    SingletonList = Collections.singletonList(Short.valueOf(sArr[0]));
                }
            }
            return admob(SingletonList, c10202l, EnumC15893l.SHORT);
        }
        if (obj instanceof int[]) {
            return admob(AbstractC8669l.m2406goto((int[]) obj), c10202l, EnumC15893l.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    SingletonList = new ArrayList(jArr.length);
                    int length4 = jArr.length;
                    while (i < length4) {
                        SingletonList.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    SingletonList = Collections.singletonList(Long.valueOf(jArr[0]));
                }
            }
            return admob(SingletonList, c10202l, EnumC15893l.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length5 = cArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    SingletonList = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i < length6) {
                        SingletonList.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    SingletonList = Collections.singletonList(Character.valueOf(cArr[0]));
                }
            }
            return admob(SingletonList, c10202l, EnumC15893l.CHAR);
        }
        if (obj instanceof float[]) {
            return admob(AbstractC8669l.m2410new((float[]) obj), c10202l, EnumC15893l.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length7 = dArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    SingletonList = new ArrayList(dArr.length);
                    int length8 = dArr.length;
                    while (i < length8) {
                        SingletonList.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    SingletonList = Collections.singletonList(Double.valueOf(dArr[0]));
                }
            }
            return admob(SingletonList, c10202l, EnumC15893l.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C4868l(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        if (length9 != 0) {
            if (length9 != 1) {
                SingletonList = new ArrayList(zArr.length);
                int length10 = zArr.length;
                while (i < length10) {
                    SingletonList.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                SingletonList = Collections.singletonList(Boolean.valueOf(zArr[0]));
            }
        }
        return admob(SingletonList, c10202l, EnumC15893l.BOOLEAN);
    }

    public static C6906l subscription(C8195l[] c8195lArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(c8195lArr.length);
        for (C8195l c8195l : c8195lArr) {
            arrayList.add(new C9735l(((C9735l) c8195l.f17097l).yandex));
        }
        ArrayList arrayList2 = new ArrayList(c8195lArr.length);
        for (C8195l c8195l2 : c8195lArr) {
            arrayList2.add(Float.valueOf(((Number) c8195l2.f17098l).floatValue()));
        }
        return new C6906l(arrayList, arrayList2, j, j2);
    }

    public static C15110l tapsense(AbstractC14318l abstractC14318l, boolean z) {
        boolean zPurchase;
        if (abstractC14318l instanceof C15110l) {
            return (C15110l) abstractC14318l;
        }
        abstractC14318l.mo1339native();
        if ((abstractC14318l.mo1339native().pro() instanceof InterfaceC16902l) || (abstractC14318l instanceof C16597l)) {
            InterfaceC15234l interfaceC15234lPro = abstractC14318l.mo1339native().pro();
            C16687l c16687l = interfaceC15234lPro instanceof C16687l ? (C16687l) interfaceC15234lPro : null;
            zPurchase = true;
            if (c16687l == null || c16687l.f32706l) {
                zPurchase = (z && (abstractC14318l.mo1339native().pro() instanceof InterfaceC16902l)) ? AbstractC12008l.purchase(abstractC14318l) : true ^ AbstractC17860l.purchase(C13772l.f26883l.m3759l(), AbstractC16570l.billing(abstractC14318l), C5987l.subs);
            }
        } else {
            zPurchase = false;
        }
        if (!zPurchase) {
            return null;
        }
        if (abstractC14318l instanceof AbstractC4317l) {
            AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318l;
            AbstractC8576l.yandex(abstractC4317l.f8857l.mo1339native(), abstractC4317l.f8856l.mo1339native());
        }
        return new C15110l(AbstractC16570l.billing(abstractC14318l).mo8static(false), z);
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int i2 = 0;
        if (enumC9931l == EnumC9931l.f20223l) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        C3797l c3797l = AbstractC3940l.f8113l;
        if (Log.isLoggable((String) c3797l.f7903l, 6)) {
            Log.e("MobileVisionBase", c3797l.m1424extends("Error preloading model resource"), exc);
        }
    }

    @Override // defpackage.InterfaceC5404l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC4852l
    public Function0 billing(AbstractC15391l abstractC15391l) {
        ViewOnAttachStateChangeListenerC15229l viewOnAttachStateChangeListenerC15229l = new ViewOnAttachStateChangeListenerC15229l(abstractC15391l, 0);
        abstractC15391l.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15229l);
        return new C4307l(abstractC15391l, viewOnAttachStateChangeListenerC15229l, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32922l.firebase(C8403l.f17380l, new C7306l((Function2) abstractC5563l, false, null, 9));
    }

    @Override // defpackage.InterfaceC2702l
    public void crashlytics(C6106l c6106l) {
        c6106l.clear();
    }

    @Override // defpackage.InterfaceC2702l
    public boolean firebase(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:32|37|22|23|(1:25)) */
    /* JADX WARN: Code duplicated, block: B:25:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r3 = r5;
        r5 = r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:30:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object isPro(java.lang.String r6, java.io.File r7, kotlin.jvm.functions.Function2 r8, android.os.CancellationSignal r9, defpackage.AbstractC0283l r10) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.C10803l
            if (r0 == 0) goto L13
            r0 = r10
            lُّؓ r0 = (defpackage.C10803l) r0
            int r1 = r0.f21833l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21833l = r1
            goto L18
        L13:
            lُّؓ r0 = new lُّؓ
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r5 = r0.f21842l
            int r10 = r0.f21833l
            r1 = 1
            if (r10 == 0) goto L43
            if (r10 != r1) goto L3c
            int r6 = r0.f21836l
            int r7 = r0.f21840l
            int r8 = r0.f21835l
            android.os.CancellationSignal r9 = r0.f21834l
            kotlin.jvm.functions.Function2 r10 = r0.f21841l
            java.io.File r2 = r0.f21837l
            java.lang.String r3 = r0.f21838l
            defpackage.AbstractC2829l.crashlytics(r5)     // Catch: java.lang.Exception -> L33
            goto L7f
        L33:
            r5 = move-exception
            r4 = r8
            r8 = r7
            r7 = r2
            r2 = r0
            r0 = r9
            r9 = r10
            r10 = r4
            goto L86
        L3c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L43:
            defpackage.AbstractC2829l.crashlytics(r5)
            lٕؒ۟ r5 = defpackage.C1083l.f2983l
            if (r5 != 0) goto L57
            lٕؒ۟ r5 = new lٕؒ۟
            lٓۤۚ r10 = new lٓۤۚ
            r2 = 5
            r10.<init>(r2)
            r5.<init>(r10)
            defpackage.C1083l.f2983l = r5
        L57:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r10 = "This should not be visible here!"
            r5.<init>(r10)
            r5 = 0
            r10 = 3
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
            r5 = r6
            r6 = r8
        L66:
            r2.f21838l = r5     // Catch: java.lang.Exception -> L82
            r2.f21837l = r7     // Catch: java.lang.Exception -> L82
            r2.f21841l = r9     // Catch: java.lang.Exception -> L82
            r2.f21834l = r0     // Catch: java.lang.Exception -> L82
            r2.f21835l = r10     // Catch: java.lang.Exception -> L82
            r2.f21840l = r8     // Catch: java.lang.Exception -> L82
            r2.f21836l = r6     // Catch: java.lang.Exception -> L82
            r2.f21833l = r1     // Catch: java.lang.Exception -> L82
            java.lang.Object r5 = purchase(r5, r7, r9, r0, r2)     // Catch: java.lang.Exception -> L82
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r5 != r6) goto L7f
            return r6
        L7f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L82:
            r3 = move-exception
            r4 = r3
            r3 = r5
            r5 = r4
        L86:
            r5.printStackTrace()
            if (r6 == r10) goto L8f
            int r6 = r6 + 1
            r5 = r3
            goto L66
        L8f:
            r5.printStackTrace()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1083l.isPro(java.lang.String, java.io.File, kotlin.jvm.functions.Function2, android.os.CancellationSignal, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC10240l
    public boolean loadAd(InterfaceC17477l interfaceC17477l, C4799l c4799l) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object mopub(AudioTrack audioTrack, AbstractC0283l abstractC0283l) throws Throwable {
        C5872l c5872l;
        int iIntValue;
        if (abstractC0283l instanceof C5872l) {
            c5872l = (C5872l) abstractC0283l;
            int i = c5872l.f12367l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5872l.f12367l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5872l = new C5872l(this, abstractC0283l);
            }
        } else {
            c5872l = new C5872l(this, abstractC0283l);
        }
        Object objFirebase = c5872l.f12366l;
        int i2 = c5872l.f12367l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (f2983l == null) {
                f2983l = new C15399l(new C14529l(5));
            }
            C15399l c15399l = f2983l;
            if (c15399l != null) {
                String str = audioTrack.isPro;
                c5872l.f12367l = 1;
                C16552l c16552l = AbstractC11463l.yandex;
                objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4647l(c15399l, str, interfaceC14029l, 24), c5872l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                iIntValue = 0;
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objFirebase);
        iIntValue = ((Number) objFirebase).intValue();
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r11 == r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object remoteconfig(defpackage.AbstractC0283l r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C18193l
            if (r0 == 0) goto L13
            r0 = r11
            l٘ۛؑ r0 = (defpackage.C18193l) r0
            int r1 = r0.f35636l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35636l = r1
            goto L18
        L13:
            l٘ۛؑ r0 = new l٘ۛؑ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f35635l
            int r1 = r0.f35636l
            r2 = 13
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L37
            if (r1 != r4) goto L30
            defpackage.AbstractC2829l.crashlytics(r11)
            return r11
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            r10 = 0
            return r10
        L37:
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L82
        L3b:
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L6f
        L3f:
            defpackage.AbstractC2829l.crashlytics(r11)
            lُؚؗ r11 = defpackage.C10892l.yandex
            r11.getClass()
            lٌؚٜ r1 = defpackage.C10892l.startapp
            lٓؕٙ[] r8 = defpackage.C10892l.loadAd
            r9 = 10
            r8 = r8[r9]
            java.lang.Object r11 = r1.pro(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L87
            lٍؘٖ r10 = defpackage.C16287l.yandex
            r10.getClass()
            long r10 = defpackage.C16287l.crashlytics()
            r0.f35636l = r6
            r1 = -1337(0xfffffffffffffac7, float:NaN)
            java.io.Serializable r11 = defpackage.C11485l.license(r1, r10, r0)
            if (r11 != r7) goto L6f
            goto L8f
        L6f:
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L84
            r0.f35636l = r5
            lٖؒٙ r10 = defpackage.C1083l.f2987l
            java.io.Serializable r11 = metrica(r10, r3, r3, r0, r2)
            if (r11 != r7) goto L82
            goto L8f
        L82:
            java.util.List r11 = (java.util.List) r11
        L84:
            java.util.List r11 = (java.util.List) r11
            return r11
        L87:
            r0.f35636l = r4
            java.io.Serializable r10 = metrica(r10, r3, r3, r0, r2)
            if (r10 != r7) goto L90
        L8f:
            return r7
        L90:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1083l.remoteconfig(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r14 == r10) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object smaato(int r12, int r13, defpackage.AbstractC0283l r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.C1352l
            if (r0 == 0) goto L14
            r0 = r14
            lؒۜۙ r0 = (defpackage.C1352l) r0
            int r1 = r0.f3472l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3472l = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            lؒۜۙ r0 = new lؒۜۙ
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f3475l
            int r0 = r7.f3472l
            r1 = 3
            r8 = 2
            r9 = 1
            lٍؗؐ r10 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L42
            if (r0 == r9) goto L3a
            if (r0 == r8) goto L36
            if (r0 != r1) goto L2f
            defpackage.AbstractC2829l.crashlytics(r14)
            return r14
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r11)
            r11 = 0
            return r11
        L36:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L93
        L3a:
            int r13 = r7.f3473l
            int r12 = r7.f3474l
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L7c
        L42:
            defpackage.AbstractC2829l.crashlytics(r14)
            lُؚؗ r14 = defpackage.C10892l.yandex
            r14.getClass()
            lٌؚٜ r0 = defpackage.C10892l.startapp
            lٓؕٙ[] r2 = defpackage.C10892l.loadAd
            r3 = 10
            r2 = r2[r3]
            java.lang.Object r14 = r0.pro(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L98
            lُۥ۟ r1 = defpackage.C11485l.f23075l
            lٍؘٖ r11 = defpackage.C16287l.yandex
            r11.getClass()
            long r3 = defpackage.C16287l.crashlytics()
            r7.f3474l = r12
            r7.f3473l = r13
            r7.f3472l = r9
            r2 = -1337(0xfffffffffffffac7, float:NaN)
            r5 = r12
            r6 = r13
            java.io.Serializable r14 = r1.tapsense(r2, r3, r5, r6, r7)
            if (r14 != r10) goto L7a
            goto La6
        L7a:
            r12 = r5
            r13 = r6
        L7c:
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r11 = r14.isEmpty()
            if (r11 == 0) goto L95
            r7.f3474l = r12
            r7.f3473l = r13
            r7.f3472l = r8
            lٖؒٙ r11 = defpackage.C1083l.f2987l
            java.io.Serializable r14 = metrica(r11, r12, r13, r7, r9)
            if (r14 != r10) goto L93
            goto La6
        L93:
            java.util.List r14 = (java.util.List) r14
        L95:
            java.util.List r14 = (java.util.List) r14
            return r14
        L98:
            r5 = r12
            r6 = r13
            r7.f3474l = r5
            r7.f3473l = r6
            r7.f3472l = r1
            java.io.Serializable r11 = metrica(r11, r5, r6, r7, r9)
            if (r11 != r10) goto La7
        La6:
            return r10
        La7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1083l.smaato(int, int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C12966l c12966l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C11182l c11182l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C4083l c4083l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C0107l c0107l;
        InterfaceC13012l interfaceC13012lYandex;
        int i = this.f3001l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 9:
                if (abstractC0283l instanceof C12966l) {
                    c12966l = (C12966l) abstractC0283l;
                    int i2 = c12966l.f25418l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12966l.f25418l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12966l = new C12966l(this, abstractC0283l);
                    }
                } else {
                    c12966l = new C12966l(this, abstractC0283l);
                }
                Object objYandex = c12966l.f25419l;
                int i3 = c12966l.f25418l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c12966l.f25418l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c12966l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 13:
                if (abstractC0283l instanceof C11182l) {
                    c11182l = (C11182l) abstractC0283l;
                    int i4 = c11182l.f22475l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11182l.f22475l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11182l = new C11182l(this, abstractC0283l);
                    }
                } else {
                    c11182l = new C11182l(this, abstractC0283l);
                }
                Object objYandex2 = c11182l.f22476l;
                int i5 = c11182l.f22475l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C1273l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c11182l.f22475l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c11182l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C4083l) {
                    c4083l = (C4083l) abstractC0283l;
                    int i6 = c4083l.f8402l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4083l.f8402l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4083l = new C4083l(this, abstractC0283l);
                    }
                } else {
                    c4083l = new C4083l(this, abstractC0283l);
                }
                Object objYandex3 = c4083l.f8403l;
                int i7 = c4083l.f8402l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7220l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c4083l.f8402l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c4083l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C0107l) {
                    c0107l = (C0107l) abstractC0283l;
                    int i8 = c0107l.f1011l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0107l.f1011l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0107l = new C0107l(this, abstractC0283l);
                    }
                } else {
                    c0107l = new C0107l(this, abstractC0283l);
                }
                Object objYandex4 = c0107l.f1012l;
                int i9 = c0107l.f1011l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(InterfaceC7493l.class);
                try {
                    interfaceC13012lYandex = AbstractC18202l.yandex(InterfaceC7493l.class);
                } catch (Throwable unused4) {
                    interfaceC13012lYandex = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lYandex);
                c0107l.f1011l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c0107l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return new C0951l((InterfaceC7493l) objYandex4);
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse");
                return null;
        }
    }

    public String toString() {
        switch (this.f3001l) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable vip(long j, boolean z, int i, int i2, AbstractC0283l abstractC0283l) {
        C18613l c18613l;
        List listYandex;
        if (abstractC0283l instanceof C18613l) {
            c18613l = (C18613l) abstractC0283l;
            int i3 = c18613l.f36367l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18613l.f36367l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18613l = new C18613l(this, abstractC0283l);
            }
        } else {
            c18613l = new C18613l(this, abstractC0283l);
        }
        Object objM3168l = c18613l.f36366l;
        int i4 = c18613l.f36367l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c18613l.f36369l = j;
            c18613l.f36368l = z;
            c18613l.f36371l = i;
            c18613l.f36365l = i2;
            c18613l.f36367l = 1;
            objM3168l = C6336l.loadAd.m3168l(c18613l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c18613l.f36365l;
            i = c18613l.f36371l;
            z = c18613l.f36368l;
            j = c18613l.f36369l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        CachedLibrary cachedLibrary = (CachedLibrary) AbstractC11356l.loadAd(((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{new Long(j)}, 1)));
        if (cachedLibrary != null && (listYandex = cachedLibrary.yandex()) != null) {
            if (i2 > 0) {
                listYandex = listYandex.subList(AbstractC8576l.billing(i, AbstractC14055l.firebase(listYandex)), AbstractC8576l.billing(i + i2, AbstractC14055l.firebase(listYandex)));
            }
            if (listYandex != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listYandex) {
                    CachedTrack cachedTrack = (CachedTrack) obj;
                    if (z) {
                        if (cachedTrack.license() != null) {
                            arrayList.add(obj);
                        }
                    } else if (cachedTrack.license() == null) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CachedTrack) it.next()).crashlytics());
                }
                return arrayList2;
            }
        }
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC6688l
    public int yandex() {
        return 1;
    }
}
