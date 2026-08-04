package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10392l {
    public static final int[] yandex = {-21389, -2, -1, -1, -1};
    public static final int[] loadAd = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] crashlytics = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void adcel(int[] iArr, int[] iArr2) {
        if (AbstractC4952l.premium(5, 0, iArr, iArr2) != 0 || (iArr2[4] == -1 && C16050l.admob(iArr2, yandex))) {
            AbstractC4952l.amazon(5, 21389, iArr2);
        }
    }

    public static void admob(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C16050l.vip(iArr, iArr3);
        billing(iArr3, iArr2);
    }

    public static void ads(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C6541l.subs(AbstractC0653l.vip(i2, "at index "));
                return;
            }
        }
    }

    public static void amazon(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        C16050l.smaato(iArr, iArr2, iArr4);
        billing(iArr4, iArr3);
    }

    public static void billing(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = (21389 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = (21389 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[7]) & 4294967295L;
        long j6 = (21389 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[8]) & 4294967295L;
        long j8 = (21389 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[9]) & 4294967295L;
        long j10 = (21389 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = (j10 >>> 32) + j9;
        long j12 = j11 & 4294967295L;
        long j13 = (21389 * j12) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = j11 >>> 32;
        long j15 = (21389 * j14) + j12 + (((long) i2) & 4294967295L) + (j13 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j14 + (((long) i3) & 4294967295L) + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j17;
        if (((j17 >>> 32) == 0 ? 0 : AbstractC4952l.Signature(5, 4, iArr2)) != 0 || (iArr2[4] == -1 && C16050l.admob(iArr2, yandex))) {
            AbstractC4952l.amazon(5, 21389, iArr2);
        }
    }

    public static final InterfaceC1388l crashlytics(ClassLoader classLoader, String str) {
        Class clsIsPro = AbstractC5592l.isPro(classLoader, vip(str), 0);
        if (clsIsPro != null) {
            return AbstractC18202l.yandex.loadAd(clsIsPro);
        }
        return null;
    }

    public static final long firebase(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static void isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C16050l.metrica(iArr, iArr2, iArr3) != 0) {
            AbstractC4952l.m1653throws(5, 21389, iArr3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    public static final String loadAd(C6084l c6084l, AbstractC0601l abstractC0601l) {
        String strConcat;
        C1559l c1559l = AbstractC10565l.admob(c6084l).crashlytics;
        if (c1559l != null) {
            return c1559l.toString();
        }
        C3827l c3827l = AbstractC10565l.admob(c6084l).loadAd;
        if (c3827l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC4792l.yandex(c3827l.loadAd));
        C10038l c10038l = AbstractC15547l.vip;
        InterfaceC13922l[] interfaceC13922lArr = AbstractC15547l.yandex;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[33];
        if (((EnumC11212l) c10038l.m2845finally(c6084l)) == EnumC11212l.INTERNAL && (abstractC0601l instanceof C5160l)) {
            C9095l c9095lM1729instanceof = ((C5160l) abstractC0601l).m1729instanceof();
            String str = c9095lM1729instanceof != null ? AbstractC10565l.purchase(c9095lM1729instanceof).loadAd : null;
            if (str == null) {
                str = "main";
            }
            strConcat = "$".concat(AbstractC3583l.yandex.f22430l.matcher(str).replaceAll("_"));
        } else {
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[33];
            if (((EnumC11212l) c10038l.m2845finally(c6084l)) == EnumC11212l.PRIVATE && (abstractC0601l instanceof C9539l)) {
                C9539l c9539l = (C9539l) abstractC0601l;
                C2343l c2343l = ((C11400l) c9539l.f19442l.getValue()).amazon;
                InterfaceC13922l interfaceC13922l3 = C11400l.admob[0];
                C5222l c5222l = (C5222l) c2343l.invoke();
                if ((c5222l != null ? (EnumC4474l) c5222l.loadAd.crashlytics : null) == EnumC4474l.MULTIFILE_CLASS_PART) {
                    strConcat = "$".concat(c9539l.f19443l.getSimpleName());
                } else {
                    strConcat = "";
                }
            } else {
                strConcat = "";
            }
        }
        sb.append(strConcat);
        sb.append("()");
        sb.append(c3827l.crashlytics);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x024e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x0251  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6 A[LOOP:0: B:29:0x00d0->B:31:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0204  */
    /* JADX WARN: Code duplicated, block: B:92:0x0207  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    public static final AbstractC6786l metrica(C4258l c4258l, ClassLoader classLoader, C12843l c12843l, Function0 function0) {
        InterfaceC1122l interfaceC1122lYandex;
        InterfaceC1122l interfaceC1122lLoadAd;
        ArrayList arrayList;
        Iterator it;
        C4258l c4258l2;
        AbstractC6786l abstractC6786lMetrica;
        AbstractC13573l abstractC13573l;
        C0658l c0658l;
        String str;
        C13698l c13698l;
        AbstractC13573l abstractC13573l2;
        C0658l c0658l2;
        C9959l c9959lAmazon;
        Function0 function1;
        C4057l c4057l;
        Object obj;
        Object obj2;
        C13267l c13267l;
        boolean z;
        List list;
        C0861l c0861l;
        C13267l c13267l2;
        Object obj3;
        C13267l c13267l3;
        InterfaceC13012l interfaceC13012l;
        C0861l c0861l2;
        InterfaceC13012l interfaceC13012l2;
        String str2;
        ArrayList arrayList2 = c4258l.mopub;
        C10700l c10700l = new C10700l();
        List listAdcel = AbstractC17587l.adcel(new C6479l(new C8767l(AbstractC17587l.remoteconfig(c4258l, C5818l.f12245l), C5818l.f12251l, C8534l.f17624l), new C7927l(classLoader, c12843l, function0, c10700l), 1));
        AbstractC13573l abstractC13573l3 = c4258l.loadAd;
        if (abstractC13573l3 == null) {
            abstractC13573l3 = null;
        }
        if (abstractC13573l3 instanceof C0658l) {
            String str3 = ((C0658l) abstractC13573l3).crashlytics;
            if (AbstractC8576l.yandex(str3, "kotlin/Array")) {
                InterfaceC13012l interfaceC13012l3 = ((C0861l) AbstractC16901l.m4208abstract(listAdcel)).loadAd;
                if (interfaceC13012l3 == null) {
                    interfaceC13012l3 = AbstractC1806l.yandex;
                }
                Class clsMo1730private = ((InterfaceC13937l) AbstractC7370l.admob(interfaceC13012l3)).mo1730private();
                C2312l c2312l = AbstractC5592l.yandex;
                interfaceC1122lLoadAd = AbstractC18202l.yandex.loadAd(Array.newInstance((Class<?>) clsMo1730private, 0).getClass());
            } else {
                interfaceC1122lYandex = crashlytics(classLoader, str3);
                if (interfaceC1122lYandex == null) {
                    throw new C3150l("Class not found: ".concat(str3));
                }
            }
            C13698l c13698l2 = AbstractC15547l.Signature;
            InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[49];
            boolean zM3679package = c13698l2.m3679package(c4258l);
            ArrayList arrayList3 = ((C10005l) AbstractC11048l.amazon(arrayList2, C10005l.crashlytics)).loadAd;
            arrayList = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(smaato((C15357l) it.next(), classLoader));
            }
            c4258l2 = c4258l.amazon;
            if (c4258l2 != null) {
                abstractC6786lMetrica = metrica(c4258l2, classLoader, c12843l, null);
            } else {
                abstractC6786lMetrica = null;
            }
            C13698l c13698l3 = AbstractC15547l.pro;
            InterfaceC13922l[] interfaceC13922lArr = AbstractC15547l.yandex;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[51];
            boolean zM3679package2 = c13698l3.m3679package(c4258l);
            abstractC13573l = c4258l.loadAd;
            if (abstractC13573l == null) {
                abstractC13573l = null;
            }
            if (abstractC13573l instanceof C0658l) {
                c0658l = (C0658l) abstractC13573l;
            } else {
                c0658l = null;
            }
            if (c0658l != null) {
                str = c0658l.crashlytics;
            } else {
                str = null;
            }
            boolean zYandex = AbstractC8576l.yandex(str, "kotlin/Nothing");
            c13698l = AbstractC15547l.license;
            InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[50];
            boolean zM3679package3 = c13698l.m3679package(c4258l);
            abstractC13573l2 = c4258l.loadAd;
            if (abstractC13573l2 == null) {
                abstractC13573l2 = null;
            }
            InterfaceC1122l interfaceC1122l = interfaceC1122lLoadAd;
            if (abstractC13573l2 instanceof C0658l) {
                c0658l2 = (C0658l) abstractC13573l2;
            } else {
                c0658l2 = null;
            }
            if (c0658l2 != null || (str2 = c0658l2.crashlytics) == null) {
                c9959lAmazon = null;
            } else {
                C3624l c3624lVip = vip(str2);
                if (C4632l.smaato.containsKey(c3624lVip)) {
                    c9959lAmazon = AbstractC15788l.amazon(c3624lVip.yandex(), (InterfaceC1388l) interfaceC1122l);
                } else {
                    c9959lAmazon = null;
                }
            }
            c10700l.f21708l = new C13267l(interfaceC1122l, listAdcel, zM3679package, arrayList, abstractC6786lMetrica, zM3679package2, zYandex, zM3679package3, c9959lAmazon, function0);
            InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr[50];
            if (c13698l.m3679package(c4258l)) {
                obj2 = c10700l.f21708l;
                if (obj2 == null) {
                    c13267l = null;
                } else {
                    c13267l = (C13267l) obj2;
                }
                z = c13267l.f26053l;
                list = c13267l.f26046l;
                if (z) {
                    C8936l.smaato(c13267l, "Not a suspend function type: ");
                    return null;
                }
                c0861l = (C0861l) AbstractC16901l.m4220for(list.size() - 2, list);
                if (c0861l != null || (interfaceC13012l = c0861l.loadAd) == null || !AbstractC8576l.yandex(interfaceC13012l.mo1616package(), AbstractC18202l.yandex.loadAd(InterfaceC14029l.class)) || (c0861l2 = (C0861l) AbstractC16901l.m4236public(interfaceC13012l.mo1617throws())) == null || (interfaceC13012l2 = c0861l2.loadAd) == null) {
                    function1 = function0;
                    c13267l2 = null;
                } else {
                    InterfaceC1122l interfaceC1122l2 = c13267l.f26049l;
                    List listM4242synchronized = AbstractC16901l.m4242synchronized(2, list);
                    C0861l c0861l3 = C0861l.crashlytics;
                    function1 = function0;
                    c13267l2 = new C13267l(interfaceC1122l2, AbstractC16901l.m4218final(AbstractC12953l.smaato(interfaceC13012l2), listM4242synchronized), c13267l.f26052l, c13267l.f26051l, c13267l.f26054l, c13267l.f26047l, c13267l.f26048l, true, c13267l.f26050l, function1);
                }
                if (c13267l2 == null) {
                    StringBuilder sb = new StringBuilder("Invalid suspend function type: ");
                    obj3 = c10700l.f21708l;
                    if (obj3 == null) {
                        c13267l3 = null;
                    } else {
                        c13267l3 = (C13267l) obj3;
                    }
                    sb.append(c13267l3);
                    throw new C3150l(sb.toString());
                }
                c10700l.f21708l = c13267l2;
            } else {
                function1 = function0;
            }
            c4057l = c4258l.billing;
            if (c4057l == null && AbstractC8576l.yandex(c4057l.loadAd, "kotlin.jvm.PlatformType")) {
                Object obj4 = c10700l.f21708l;
                C13267l c13267l4 = obj4 == null ? null : (C13267l) obj4;
                C13267l c13267l5 = (C13267l) metrica(c4057l.yandex, classLoader, c12843l, null);
                return c13267l4.equals(c13267l5) ? c13267l4 : new C15672l(c13267l4, c13267l5, ((C10005l) AbstractC11048l.amazon(arrayList2, C10005l.crashlytics)).yandex, function1);
            }
            obj = c10700l.f21708l;
            if (obj == null) {
                return null;
            }
            return (C13267l) obj;
        }
        if (abstractC13573l3 instanceof C16288l) {
            interfaceC1122lYandex = new C13194l(vip(((C16288l) abstractC13573l3).crashlytics).yandex());
        } else {
            if (!(abstractC13573l3 instanceof C13960l)) {
                C18725l.billing();
                return null;
            }
            int i = ((C13960l) abstractC13573l3).crashlytics;
            interfaceC1122lYandex = c12843l.yandex(i);
            if (interfaceC1122lYandex == null) {
                interfaceC1122lYandex = new C18551l(i);
            }
        }
        interfaceC1122lLoadAd = interfaceC1122lYandex;
        C13698l c13698l4 = AbstractC15547l.Signature;
        InterfaceC13922l interfaceC13922l5 = AbstractC15547l.yandex[49];
        boolean zM3679package4 = c13698l4.m3679package(c4258l);
        ArrayList arrayList4 = ((C10005l) AbstractC11048l.amazon(arrayList2, C10005l.crashlytics)).loadAd;
        arrayList = new ArrayList(AbstractC14055l.billing(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList.add(smaato((C15357l) it.next(), classLoader));
        }
        c4258l2 = c4258l.amazon;
        if (c4258l2 != null) {
            abstractC6786lMetrica = metrica(c4258l2, classLoader, c12843l, null);
        } else {
            abstractC6786lMetrica = null;
        }
        C13698l c13698l5 = AbstractC15547l.pro;
        InterfaceC13922l[] interfaceC13922lArr2 = AbstractC15547l.yandex;
        InterfaceC13922l interfaceC13922l6 = interfaceC13922lArr2[51];
        boolean zM3679package5 = c13698l5.m3679package(c4258l);
        abstractC13573l = c4258l.loadAd;
        if (abstractC13573l == null) {
            abstractC13573l = null;
        }
        if (abstractC13573l instanceof C0658l) {
            c0658l = (C0658l) abstractC13573l;
        } else {
            c0658l = null;
        }
        if (c0658l != null) {
            str = c0658l.crashlytics;
        } else {
            str = null;
        }
        boolean zYandex2 = AbstractC8576l.yandex(str, "kotlin/Nothing");
        c13698l = AbstractC15547l.license;
        InterfaceC13922l interfaceC13922l7 = interfaceC13922lArr2[50];
        boolean zM3679package6 = c13698l.m3679package(c4258l);
        abstractC13573l2 = c4258l.loadAd;
        if (abstractC13573l2 == null) {
            abstractC13573l2 = null;
        }
        InterfaceC1122l interfaceC1122l3 = interfaceC1122lLoadAd;
        if (abstractC13573l2 instanceof C0658l) {
            c0658l2 = (C0658l) abstractC13573l2;
        } else {
            c0658l2 = null;
        }
        if (c0658l2 != null) {
            c9959lAmazon = null;
        } else {
            c9959lAmazon = null;
        }
        c10700l.f21708l = new C13267l(interfaceC1122l3, listAdcel, zM3679package4, arrayList, abstractC6786lMetrica, zM3679package5, zYandex2, zM3679package6, c9959lAmazon, function0);
        InterfaceC13922l interfaceC13922l8 = interfaceC13922lArr2[50];
        if (c13698l.m3679package(c4258l)) {
            obj2 = c10700l.f21708l;
            if (obj2 == null) {
                c13267l = null;
            } else {
                c13267l = (C13267l) obj2;
            }
            z = c13267l.f26053l;
            list = c13267l.f26046l;
            if (z) {
                C8936l.smaato(c13267l, "Not a suspend function type: ");
                return null;
            }
            c0861l = (C0861l) AbstractC16901l.m4220for(list.size() - 2, list);
            if (c0861l != null) {
                function1 = function0;
                c13267l2 = null;
            } else {
                function1 = function0;
                c13267l2 = null;
            }
            if (c13267l2 == null) {
                StringBuilder sb2 = new StringBuilder("Invalid suspend function type: ");
                obj3 = c10700l.f21708l;
                if (obj3 == null) {
                    c13267l3 = null;
                } else {
                    c13267l3 = (C13267l) obj3;
                }
                sb2.append(c13267l3);
                throw new C3150l(sb2.toString());
            }
            c10700l.f21708l = c13267l2;
        } else {
            function1 = function0;
        }
        c4057l = c4258l.billing;
        if (c4057l == null) {
        }
        obj = c10700l.f21708l;
        if (obj == null) {
            return null;
        }
        return (C13267l) obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void mopub(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (21389 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? AbstractC4952l.Signature(5, 3, iArr) : 0) == 0) {
            if (iArr[4] == -1 || !C16050l.admob(iArr, yandex)) {
                return;
            }
        }
        AbstractC4952l.amazon(5, 21389, iArr);
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((C16050l.remoteconfig(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && AbstractC4952l.adcel(10, iArr3, loadAd))) && AbstractC4952l.mopub(7, crashlytics, iArr3) != 0) {
            AbstractC4952l.tapsense(10, 7, iArr3);
        }
    }

    public static final Object remoteconfig(AbstractC7775l abstractC7775l, String str, String str2, ClassLoader classLoader) {
        List parameters;
        InterfaceC13012l interfaceC13012lMo1109synchronized;
        Class clsMo1730private;
        Class<?> clsMo1730private2;
        if (abstractC7775l instanceof C1020l) {
            return smaato(((C1020l) abstractC7775l).yandex, classLoader);
        }
        int i = 0;
        if (abstractC7775l instanceof C5413l) {
            C5413l c5413l = (C5413l) abstractC7775l;
            String str3 = c5413l.yandex;
            InterfaceC1388l interfaceC1388lCrashlytics = crashlytics(classLoader, str3);
            if (interfaceC1388lCrashlytics == null || (clsMo1730private2 = ((InterfaceC13937l) interfaceC1388lCrashlytics).mo1730private()) == null) {
                throw new C3150l("Unresolved class: ".concat(str3));
            }
            int i2 = c5413l.loadAd;
            for (int i3 = 0; i3 < i2; i3++) {
                clsMo1730private2 = Array.newInstance(clsMo1730private2, 0).getClass();
            }
            return clsMo1730private2;
        }
        Object obj = null;
        if (!(abstractC7775l instanceof C12909l)) {
            if (!(abstractC7775l instanceof C11469l)) {
                if (!(abstractC7775l instanceof C11898l)) {
                    if (abstractC7775l instanceof AbstractC12175l) {
                        return ((AbstractC12175l) abstractC7775l).yandex();
                    }
                    C18725l.billing();
                    return null;
                }
                String str4 = ((C11898l) abstractC7775l).yandex;
                Class clsIsPro = AbstractC5592l.isPro(classLoader, vip(str4), 0);
                if (clsIsPro != null) {
                    return clsIsPro;
                }
                throw new C3150l("Unresolved class: ".concat(str4));
            }
            C11469l c11469l = (C11469l) abstractC7775l;
            String str5 = c11469l.loadAd;
            String str6 = c11469l.yandex;
            Class clsIsPro2 = AbstractC5592l.isPro(classLoader, vip(str6), 0);
            if (clsIsPro2 == null) {
                throw new C3150l("Unresolved enum class: ".concat(str6));
            }
            Object[] enumConstants = clsIsPro2.getEnumConstants();
            int length = enumConstants.length;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object obj3 = enumConstants[i];
                if (AbstractC8576l.yandex(((Enum) obj3).name(), str5)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = obj3;
                }
                i++;
            }
            if (obj != null) {
                return obj;
            }
            throw new C3150l("Unresolved enum entry: " + str6 + '.' + str5);
        }
        InterfaceC1388l interfaceC1388lCrashlytics2 = crashlytics(classLoader, str);
        if (interfaceC1388lCrashlytics2 != null) {
            if (!((InterfaceC13937l) interfaceC1388lCrashlytics2).mo1730private().isAnnotation()) {
                interfaceC1388lCrashlytics2 = null;
            }
            if (interfaceC1388lCrashlytics2 != null) {
                InterfaceC5059l interfaceC5059l = (InterfaceC5059l) AbstractC16901l.m4224instanceof(interfaceC1388lCrashlytics2.adcel());
                if (interfaceC5059l != null && (parameters = interfaceC5059l.getParameters()) != null) {
                    Iterator it = parameters.iterator();
                    boolean z2 = false;
                    Object obj4 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (!z2) {
                                break;
                            }
                            break;
                        }
                        Object next = it.next();
                        if (AbstractC8576l.yandex(((AbstractC9707l) next).getName(), str2)) {
                            if (!z2) {
                                z2 = true;
                                obj4 = next;
                            }
                        }
                        obj4 = null;
                        break;
                    }
                    AbstractC9707l abstractC9707l = (AbstractC9707l) obj4;
                    if (abstractC9707l != null && (interfaceC13012lMo1109synchronized = abstractC9707l.mo1109synchronized()) != null) {
                        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012lMo1109synchronized.mo1616package();
                        InterfaceC1388l interfaceC1388l = interfaceC1122lMo1616package instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122lMo1616package : null;
                        if (interfaceC1388l == null || (clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private()) == null) {
                            C11467l.Signature(interfaceC13012lMo1109synchronized, "Array parameter type is not a class: ");
                            return null;
                        }
                        Class<?> componentType = AbstractC8576l.yandex(clsMo1730private.getComponentType(), InterfaceC1388l.class) ? Class.class : clsMo1730private.getComponentType();
                        ArrayList arrayList = ((C12909l) abstractC7775l).yandex;
                        Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Array.set(objNewInstance, i, remoteconfig((AbstractC7775l) it2.next(), str, null, classLoader));
                            i++;
                        }
                        return objNewInstance;
                    }
                }
                throw new C3150l(AbstractC14814l.adcel("No parameter ", str2, " found in annotation constructor of ", str));
            }
        }
        throw new C3150l("Not an annotation class: ".concat(str));
    }

    public static final Annotation smaato(C15357l c15357l, ClassLoader classLoader) {
        String str = c15357l.yandex;
        Class clsIsPro = AbstractC5592l.isPro(classLoader, vip(str), 0);
        if (clsIsPro == null) {
            throw new C3150l("Annotation class not found: ".concat(str));
        }
        Map map = c15357l.loadAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), remoteconfig((AbstractC7775l) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) AbstractC17824l.isPro(clsIsPro, linkedHashMap);
    }

    public static final int startapp(EnumC11212l enumC11212l) {
        int iOrdinal = enumC11212l.ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        int i = 1;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    i = 0;
                    if (iOrdinal == 5) {
                        return 0;
                    }
                    C18725l.billing();
                }
            }
            return i;
        }
        return 4;
    }

    public static void subs(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C16050l.vip(iArr, iArr3);
        while (true) {
            billing(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                C16050l.vip(iArr2, iArr3);
            }
        }
    }

    public static final C3624l vip(String str) {
        boolean zIsVip = AbstractC16648l.isVip(str, ".", false);
        if (zIsVip) {
            str = str.substring(1);
        }
        int iM3343switch = AbstractC12024l.m3343switch(str, '/', 0, 6);
        return new C3624l(new C2312l((iM3343switch == -1 ? "" : str.substring(0, iM3343switch)).replace('/', '.')), new C2312l(AbstractC12024l.m3348transient('/', str, str)), zIsVip);
    }

    public static final List yandex(C13975l c13975l, int i, int i2, ArrayList arrayList, C16761l c16761l, int i3, int i4, int i5, boolean z, Function1 function1) {
        int i6;
        C16761l c16761l2;
        int i7;
        Object obj;
        int i8;
        if (c13975l == null || arrayList.isEmpty() || (i6 = c16761l.loadAd) == 0) {
            return C2580l.f5619l;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            c16761l2 = AbstractC7124l.yandex;
        } else {
            C8934l c8934lAdcel = AbstractC8576l.adcel(0, i6);
            int i11 = c8934lAdcel.f15488l;
            int i12 = c8934lAdcel.f15487l;
            int iCrashlytics = -1;
            if (i11 <= i12) {
                while (c16761l.crashlytics(i11) <= i) {
                    iCrashlytics = c16761l.crashlytics(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (iCrashlytics == -1) {
                c16761l2 = AbstractC7124l.yandex;
            } else {
                C16761l c16761l3 = AbstractC7124l.yandex;
                c16761l2 = new C16761l(1);
                c16761l2.yandex(iCrashlytics);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList.get(i13);
            int index = ((InterfaceC9146l) obj2).getIndex();
            int[] iArr = c16761l.yandex;
            int i14 = c16761l.loadAd;
            for (int i15 = i10; i15 < i14; i15++) {
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
            i13++;
            i10 = 0;
        }
        int[] iArr2 = c16761l2.yandex;
        int i16 = c16761l2.loadAd;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((InterfaceC9146l) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            InterfaceC9146l interfaceC9146l = i19 == i9 ? (InterfaceC9146l) function1.invoke(Integer.valueOf(i18)) : (InterfaceC9146l) arrayList.remove(i19);
            int iCrashlytics2 = AbstractC3124l.crashlytics(interfaceC9146l, z);
            if (i19 == i9) {
                i17 = i17;
                i7 = RecyclerView.UNDEFINED_DURATION;
            } else {
                long jSmaato = interfaceC9146l.smaato(0);
                i7 = (int) (z ? jSmaato & 4294967295L : jSmaato >> 32);
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((InterfaceC9146l) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            InterfaceC9146l interfaceC9146l2 = (InterfaceC9146l) obj;
            if (interfaceC9146l2 != null) {
                long jSmaato2 = interfaceC9146l2.smaato(0);
                i8 = (int) (z ? jSmaato2 & 4294967295L : jSmaato2 >> 32);
            } else {
                i8 = RecyclerView.UNDEFINED_DURATION;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iCrashlytics2);
            }
            interfaceC9146l.metrica();
            interfaceC9146l.purchase(iMax, 0, i4, i5);
            arrayList2.add(interfaceC9146l);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }
}
