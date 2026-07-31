package defpackage;

import androidx.car.app.model.Alert;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lًٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3979l {
    public static final int[] yandex = {Alert.DURATION_SHOW_INDEFINITELY, -1, -1, -1, -1};
    public static final int[] loadAd = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] crashlytics = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static final C0861l Signature(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            C0861l c0861l = C0861l.crashlytics;
            return AbstractC12953l.smaato(tapsense(type, map, 0, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C11467l.Signature(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            C0861l c0861l2 = C0861l.crashlytics;
            return new C0861l(2, tapsense((Type) AbstractC8669l.m2401default(lowerBounds), map, 0, false, 6));
        }
        if (upperBounds.length != 1) {
            return C0861l.crashlytics;
        }
        C0861l c0861l3 = C0861l.crashlytics;
        return new C0861l(3, tapsense((Type) AbstractC8669l.m2401default(upperBounds), map, 0, false, 6));
    }

    public static void adcel(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j4 = j2 + (((long) iArr[i5]) & 4294967295L);
                long j5 = j3 + (((long) iArr2[i5]) & 4294967295L);
                int i6 = i5 - i3;
                long j6 = j4 - (((long) iArr3[i6]) & 4294967295L);
                long j7 = j5 - (((long) iArr4[i6]) & 4294967295L);
                iArr[i5] = (int) j6;
                j2 = j6 >> 32;
                iArr2[i5] = (int) j7;
                j3 = j7 >> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j8 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            int i13 = -i4;
            long j9 = j;
            long j10 = j2 + (((long) iArr[i7]) & j9);
            long j11 = j10 - (((long) ((i8 >>> i13) | (i11 << i4))) & j9);
            long j12 = (j8 + (((long) iArr2[i7]) & j9)) - (((long) ((i9 >>> i13) | (i12 << i4))) & j9);
            iArr[i7] = (int) j11;
            j2 = j11 >> c2;
            iArr2[i7] = (int) j12;
            j8 = j12 >> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j9;
        }
    }

    public static int admob(int[] iArr, int i) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return AbstractC14289l.mopub(iArr[i]) + (i * 32);
    }

    public static void ads(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C16050l.metrica(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            AbstractC4952l.isPro(5, 1, iArr3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: lًٕٙ -> 0x01a4, TryCatch #4 {lًٕٙ -> 0x01a4, blocks: (B:36:0x00bf, B:37:0x00c1, B:38:0x00c4, B:55:0x010e, B:39:0x00cd), top: B:109:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[Catch: lًٕٙ -> 0x01a4, TRY_LEAVE, TryCatch #4 {lًٕٙ -> 0x01a4, blocks: (B:36:0x00bf, B:37:0x00c1, B:38:0x00c4, B:55:0x010e, B:39:0x00cd), top: B:109:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9 A[Catch: lًٕٙ -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {lًٕٙ -> 0x01a0, blocks: (B:34:0x00bb, B:41:0x00d9, B:54:0x00ff, B:56:0x0113, B:60:0x0128, B:64:0x0130), top: B:103:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0179 -> B:18:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object amazon(defpackage.C5092l r27, int r28, int r29, defpackage.InterfaceC13490l r30, defpackage.AbstractC0283l r31) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3979l.amazon(lؘؗۗ, int, int, lْٛؐ, lّؑۧ):java.lang.Object");
    }

    public static C13267l billing(Type type, InterfaceC1122l interfaceC1122l, List list, boolean z) {
        return new C13267l(interfaceC1122l, list, z, C2580l.f5619l, null, false, false, false, null, new C12003l(type, 2));
    }

    public static final List crashlytics(Class cls) {
        return AbstractC17587l.adcel(new C8767l(AbstractC17587l.remoteconfig(cls, C5818l.f12235l), C5818l.f12231l, C6657l.f13994l));
    }

    public static void firebase(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        C16050l.smaato(iArr, iArr2, iArr4);
        smaato(iArr4, iArr3);
    }

    public static final boolean isPro(C5092l c5092l, int i) {
        return i <= c5092l.purchase() && c5092l.crashlytics() <= i;
    }

    public static void license(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C6541l.subs(AbstractC9361l.Signature(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }

    public static void loadAd(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j4 = j2 + (((long) iArr[i5]) & 4294967295L);
                long j5 = j3 + (((long) iArr2[i5]) & 4294967295L);
                int i6 = i5 - i3;
                long j6 = j4 + (((long) iArr3[i6]) & 4294967295L);
                long j7 = j5 + (((long) iArr4[i6]) & 4294967295L);
                iArr[i5] = (int) j6;
                j2 = j6 >>> 32;
                iArr2[i5] = (int) j7;
                j3 = j7 >>> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j8 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            int i13 = -i4;
            long j9 = j;
            long j10 = j2 + (((long) iArr[i7]) & j9);
            long j11 = j10 + (((long) ((i8 >>> i13) | (i11 << i4))) & j9);
            long j12 = j8 + (((long) iArr2[i7]) & j9) + (((long) ((i9 >>> i13) | (i12 << i4))) & j9);
            iArr[i7] = (int) j11;
            j2 = j11 >>> c2;
            iArr2[i7] = (int) j12;
            j8 = j12 >>> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j9;
        }
    }

    public static void metrica(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C16050l.vip(iArr, iArr3);
        while (true) {
            smaato(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                C16050l.vip(iArr2, iArr3);
            }
        }
    }

    public static int mopub(int[] iArr, int i) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return AbstractC14289l.mopub(iArr[i] ^ i2) + (i * 32);
    }

    public static final boolean purchase(boolean z, C5092l c5092l, int i) {
        if (z) {
            if (c5092l.crashlytics() > i) {
                return true;
            }
            return c5092l.crashlytics() == i && c5092l.amazon() > 0;
        }
        if (c5092l.crashlytics() < i) {
            return true;
        }
        return c5092l.crashlytics() == i && c5092l.amazon() < 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public static void remoteconfig(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((((long) i) & 4294967295L) * 2147483649L) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1]));
        iArr[1] = (int) j2;
        if (((j2 >>> 32) != 0 ? AbstractC4952l.Signature(5, 2, iArr) : 0) == 0) {
            if (iArr[4] == -1 || !C16050l.admob(iArr, yandex)) {
                return;
            }
        }
        AbstractC4952l.subs(5, -2147483647, iArr);
    }

    public static void smaato(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        remoteconfig(iArr2, (int) (j10 >>> 32));
    }

    public static void startapp(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = ((long) iArr5[i4]) & 4294967295L;
                long j5 = (j2 + (((long) iArr[i4]) & 4294967295L)) - j4;
                long j6 = (j3 + j4) - (((long) iArr2[i4]) & 4294967295L);
                int i5 = (int) j6;
                j3 = j6 >> 32;
                iArr5[i4] = i5;
                long j7 = j5 - (((long) i5) & 4294967295L);
                iArr[i4] = (int) j7;
                j2 = j7 >> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j8 = 0;
            long j9 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j10 = j;
                long j11 = (j8 + (((long) iArr[i4]) & j10)) - (((long) ((i6 >>> i10) | (i9 << i2))) & j10);
                int i11 = iArr2[i4];
                long j12 = (j9 + (((long) i9) & j10)) - (((long) ((i11 << i2) | (i7 >>> i10))) & j10);
                int i12 = (int) j12;
                j9 = j12 >> c2;
                iArr5[i4] = i12;
                long j13 = j11 - (((long) ((i8 >>> i10) | (i12 << i2))) & j10);
                iArr[i4] = (int) j13;
                j8 = j13 >> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j10;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j14 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j15 = (j2 + (((long) iArr[i15]) & 4294967295L)) - (((long) iArr4[i16]) & 4294967295L);
                long j16 = (j14 + (((long) iArr5[i15]) & 4294967295L)) - (((long) iArr2[i16]) & 4294967295L);
                iArr5[i15] = (int) j16;
                j14 = j16 >> 32;
                long j17 = j15 - (((long) iArr5[i16]) & 4294967295L);
                iArr[i15] = (int) j17;
                j2 = j17 >> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j18 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            int i23 = i14;
            long j19 = (j2 + (((long) iArr[i17]) & 4294967295L)) - (((long) ((i4 >>> i22) | (i21 << i14))) & 4294967295L);
            int i24 = iArr2[i20];
            long j20 = (j18 + (((long) iArr5[i17]) & 4294967295L)) - (((long) ((i24 << i23) | (i18 >>> i22))) & 4294967295L);
            iArr3[i17] = (int) j20;
            j18 = j20 >> 32;
            int i25 = iArr3[i20];
            long j21 = j19 - (((long) ((i25 << i23) | (i19 >>> i22))) & 4294967295L);
            iArr[i17] = (int) j21;
            j2 = j21 >> 32;
            i17++;
            i14 = i23;
            iArr5 = iArr3;
            i19 = i25;
            i18 = i24;
            i4 = i21;
            i3 = i;
        }
    }

    public static final C5160l subs(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (C5160l) AbstractC18202l.yandex.loadAd((Class) genericDeclaration);
        }
        C8936l.vip("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    public static final C15672l subscription(C13267l c13267l, Type type) {
        InterfaceC1122l interfaceC1122l = c13267l.f26049l;
        List<C0861l> list = c13267l.f26046l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (C0861l c0861l : list) {
            InterfaceC13012l interfaceC13012l = c0861l.loadAd;
            if (interfaceC13012l != null) {
                c0861l = new C0861l(3, interfaceC13012l);
            }
            arrayList.add(c0861l);
        }
        C13267l c13267lBilling = billing(type, interfaceC1122l, arrayList, true);
        C12003l c12003l = new C12003l(type, 3);
        boolean zEquals = c13267l.equals(c13267lBilling);
        Object c15672l = c13267l;
        if (!zEquals) {
            c15672l = new C15672l(c13267l, c13267lBilling, false, c12003l);
        }
        return (C15672l) c15672l;
    }

    public static InterfaceC13012l tapsense(Type type, Map map, int i, boolean z, int i2) {
        ArrayList arrayList;
        C13267l c13267lBilling;
        AbstractC6786l abstractC6786l;
        String strBilling;
        C5818l c5818l = C5818l.f12239l;
        C5818l c5818l2 = C5818l.f12259l;
        int i3 = (i2 & 2) != 0 ? 3 : i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        boolean z3 = type instanceof Class;
        C16781l c16781l = null;
        C2580l c2580l = C2580l.f5619l;
        if (z3) {
            Class cls = (Class) type;
            if (!crashlytics(cls).isEmpty() && !z2) {
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(cls);
                List listCrashlytics = crashlytics(cls);
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listCrashlytics, 10));
                Iterator it = listCrashlytics.iterator();
                while (it.hasNext()) {
                    Type type2 = (Type) AbstractC8669l.m2409native(((TypeVariable) AbstractC17587l.metrica(AbstractC17587l.remoteconfig((TypeVariable) it.next(), C5818l.f12236l))).getBounds());
                    C0861l c0861l = C0861l.crashlytics;
                    arrayList2.add(AbstractC12953l.smaato(tapsense(type2, map, 0, true, 2)));
                }
                C13267l c13267lBilling2 = billing(cls, interfaceC1388lLoadAd, arrayList2, false);
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(cls);
                List<TypeVariable> listCrashlytics2 = crashlytics(cls);
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listCrashlytics2, 10));
                for (TypeVariable typeVariable : listCrashlytics2) {
                    arrayList3.add(C0861l.crashlytics);
                }
                C13267l c13267lBilling3 = billing(cls, interfaceC1388lLoadAd2, arrayList3, true);
                return c13267lBilling2.equals(c13267lBilling3) ? c13267lBilling2 : new C15672l(c13267lBilling2, c13267lBilling3, true, new C7646l(6, cls));
            }
            if (cls.isArray()) {
                return subscription(billing(type, AbstractC18202l.yandex.loadAd(cls), Collections.singletonList(Signature(cls.getComponentType(), map)), false), type);
            }
            InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(cls);
            List<TypeVariable> listCrashlytics3 = crashlytics(cls);
            ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(listCrashlytics3, 10));
            for (TypeVariable typeVariable2 : listCrashlytics3) {
                arrayList4.add(C0861l.crashlytics);
            }
            c13267lBilling = billing(type, interfaceC1388lLoadAd3, arrayList4, false);
        } else {
            if (type instanceof GenericArrayType) {
                C0861l c0861lSignature = Signature(((GenericArrayType) type).getGenericComponentType(), map);
                Class clsMo1730private = ((InterfaceC13937l) AbstractC7370l.admob(c0861lSignature.loadAd)).mo1730private();
                C2312l c2312l = AbstractC5592l.yandex;
                return subscription(billing(type, AbstractC18202l.yandex.loadAd(Array.newInstance((Class<?>) clsMo1730private, 0).getClass()), Collections.singletonList(c0861lSignature), false), type);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd((Class) parameterizedType.getRawType());
                if (z2) {
                    List<Type> listAdcel = AbstractC17587l.adcel(new C8767l(AbstractC17587l.remoteconfig(parameterizedType, c5818l2), c5818l, C8534l.f17624l));
                    arrayList = new ArrayList(AbstractC14055l.billing(listAdcel, 10));
                    for (Type type3 : listAdcel) {
                        arrayList.add(C0861l.crashlytics);
                    }
                } else {
                    List listAdcel2 = AbstractC17587l.adcel(new C8767l(AbstractC17587l.remoteconfig(parameterizedType, c5818l2), c5818l, C8534l.f17624l));
                    ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(listAdcel2, 10));
                    Iterator it2 = listAdcel2.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(Signature((Type) it2.next(), map));
                    }
                    arrayList = arrayList5;
                }
                c13267lBilling = billing(type, interfaceC1388lLoadAd4, arrayList, false);
            } else {
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        C11467l.Signature(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls2 = type.getClass();
                    sb.append(" (");
                    sb.append(cls2);
                    sb.append(')');
                    throw new C3150l(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                AbstractC11726l abstractC11726l = (AbstractC11726l) map.get(typeVariable3);
                if (abstractC11726l == null) {
                    Iterator it3 = subs(typeVariable3).getTypeParameters().iterator();
                    boolean z4 = false;
                    Object obj = null;
                    while (true) {
                        if (!it3.hasNext()) {
                            if (!z4) {
                                break;
                            }
                            break;
                        }
                        Object next = it3.next();
                        if (AbstractC8576l.yandex(((AbstractC11726l) next).crashlytics(), typeVariable3.getName())) {
                            if (!z4) {
                                obj = next;
                                z4 = true;
                            }
                        }
                        obj = null;
                        break;
                    }
                    abstractC11726l = (AbstractC11726l) obj;
                    if (abstractC11726l == null) {
                        throw new C3150l("Type parameter " + typeVariable3.getName() + " is not found in " + subs(typeVariable3));
                    }
                }
                c13267lBilling = billing(type, abstractC11726l, c2580l, false);
            }
        }
        InterfaceC1122l interfaceC1122l = c13267lBilling.f26049l;
        InterfaceC1388l interfaceC1388l = interfaceC1122l instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122l : null;
        String str = C4632l.yandex;
        if (interfaceC1388l != null && (strBilling = interfaceC1388l.billing()) != null) {
            c16781l = new C16781l(strBilling);
        }
        C2312l c2312lSubs = C4632l.subs(c16781l);
        AbstractC6786l c15672l = c13267lBilling;
        c15672l = c13267lBilling;
        if (c2312lSubs != null && interfaceC1388l != null) {
            C13267l c13267l = new C13267l(interfaceC1122l, c13267lBilling.f26046l, c13267lBilling.f26052l, c2580l, null, false, false, false, AbstractC15788l.amazon(c2312lSubs, interfaceC1388l), new C12003l(type, 2));
            c15672l = c13267l.equals(c13267lBilling) ? c13267l : new C15672l(c13267l, c13267lBilling, false, new C12003l(type, 0));
        }
        int iInmobi = AbstractC5020l.inmobi(i3);
        if (iInmobi == 0) {
            return c15672l;
        }
        if (iInmobi == 1) {
            return c15672l.mo1771throw(true);
        }
        AbstractC6786l abstractC6786lMo1767extends = c15672l.mo1767extends();
        if (abstractC6786lMo1767extends == null) {
            abstractC6786l = abstractC6786lMo1767extends;
            abstractC6786l = c15672l;
        }
        abstractC6786l = abstractC6786lMo1767extends;
        AbstractC6786l abstractC6786lMo1765catch = c15672l.mo1765catch();
        AbstractC6786l abstractC6786l2 = c15672l;
        if (abstractC6786lMo1765catch != null) {
            abstractC6786l2 = abstractC6786lMo1765catch;
        }
        AbstractC6786l abstractC6786lMo1771throw = abstractC6786l2.mo1771throw(true);
        return abstractC6786l.equals(abstractC6786lMo1771throw) ? abstractC6786l : new C15672l(abstractC6786l, abstractC6786lMo1771throw, false, new C12003l(type, 1));
    }

    public static void vip(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C16050l.vip(iArr, iArr3);
        smaato(iArr3, iArr2);
    }

    public static void yandex(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = ((long) iArr5[i4]) & 4294967295L;
                long j5 = j2 + (((long) iArr[i4]) & 4294967295L) + j4;
                long j6 = j3 + j4 + (((long) iArr2[i4]) & 4294967295L);
                int i5 = (int) j6;
                j3 = j6 >>> 32;
                iArr5[i4] = i5;
                long j7 = j5 + (((long) i5) & 4294967295L);
                iArr[i4] = (int) j7;
                j2 = j7 >>> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j8 = 0;
            long j9 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j10 = j;
                long j11 = j8 + (((long) iArr[i4]) & j10) + (((long) ((i6 >>> i10) | (i9 << i2))) & j10);
                int i11 = iArr2[i4];
                long j12 = j9 + (((long) i9) & j10) + (((long) ((i11 << i2) | (i7 >>> i10))) & j10);
                int i12 = (int) j12;
                j9 = j12 >>> c2;
                iArr5[i4] = i12;
                long j13 = j11 + (((long) ((i8 >>> i10) | (i12 << i2))) & j10);
                iArr[i4] = (int) j13;
                j8 = j13 >>> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j10;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j14 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j15 = j2 + (((long) iArr[i15]) & 4294967295L) + (((long) iArr4[i16]) & 4294967295L);
                long j16 = j14 + (((long) iArr5[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
                iArr5[i15] = (int) j16;
                j14 = j16 >>> 32;
                long j17 = j15 + (((long) iArr5[i16]) & 4294967295L);
                iArr[i15] = (int) j17;
                j2 = j17 >>> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j18 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            int i23 = i14;
            long j19 = j2 + (((long) iArr[i17]) & 4294967295L) + (((long) ((i4 >>> i22) | (i21 << i14))) & 4294967295L);
            int i24 = iArr2[i20];
            long j20 = j18 + (((long) iArr5[i17]) & 4294967295L) + (((long) ((i24 << i23) | (i18 >>> i22))) & 4294967295L);
            iArr3[i17] = (int) j20;
            j18 = j20 >>> 32;
            int i25 = iArr3[i20];
            long j21 = j19 + (((long) ((i25 << i23) | (i19 >>> i22))) & 4294967295L);
            iArr[i17] = (int) j21;
            j2 = j21 >>> 32;
            i17++;
            i14 = i23;
            iArr5 = iArr3;
            i19 = i25;
            i18 = i24;
            i4 = i21;
            i3 = i;
        }
    }
}
