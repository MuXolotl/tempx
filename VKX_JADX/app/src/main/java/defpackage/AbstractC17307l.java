package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17307l {
    public static final C15578l yandex = new C15578l(-617673835, false, new C7277l(9));
    public static final C15578l loadAd = new C15578l(389007412, false, new C7277l(10));
    public static final C15578l crashlytics = new C15578l(401322129, false, new C7277l(11));

    public static final float admob(List list, Resources resources) {
        Iterator it = list.iterator();
        float dimension = 0.0f;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v0, types: [lؚِؑ] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, lٌؙِ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final void amazon(final InterfaceC17242l interfaceC17242l, final C3625l c3625l, final Function1 function1, final boolean z, final Map map, final C11090l c11090l, final int i, final boolean z2, final int i2, final int i3, final InterfaceC16061l interfaceC16061l, final C17005l c17005l, final Function1 function2, C6956l c6956l, final int i4, final int i5) {
        C4487l c4487l;
        Function0 function0;
        C8195l c8195l;
        Function1 function3;
        ?? r9;
        Object obj;
        Object c7096l;
        boolean z3;
        ?? r4;
        Object obj2;
        Object obj3;
        Object obj4;
        ?? arrayList;
        c6956l.m2133new(-2118572703);
        int i6 = (i4 & 6) == 0 ? (c6956l.billing(interfaceC17242l) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i6 |= c6956l.billing(c3625l) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c6956l.mopub(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c6956l.admob(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c6956l.billing(c11090l) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c6956l.amazon(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= c6956l.mopub(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= c6956l.amazon(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= c6956l.amazon(i3) ? 536870912 : 268435456;
        }
        int i7 = (i5 & 6) == 0 ? i5 | (c6956l.admob(interfaceC16061l) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i7 |= c6956l.admob(c17005l) ? 32 : 16;
        }
        int i8 = i6;
        if ((i5 & 384) == 0) {
            i7 |= c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c6956l.admob(function2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= (32768 & i5) == 0 ? c6956l.billing(null) : c6956l.admob(null) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i8 & 1, ((i8 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean zPurchase = AbstractC1213l.purchase(c3625l);
            C13863l c13863l = C1867l.yandex;
            if (zPurchase) {
                c6956l.m2123default(145641571);
                boolean z4 = (i8 & 112) == 32;
                Object objM2132native = c6956l.m2132native();
                Object obj5 = objM2132native;
                if (z4 || objM2132native == c13863l) {
                    C4487l c4487l2 = new C4487l(c3625l);
                    c6956l.m2147try(c4487l2);
                    obj5 = c4487l2;
                }
                c4487l = (C4487l) obj5;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(145707228);
                c6956l.startapp(false);
                c4487l = null;
            }
            if (AbstractC1213l.purchase(c3625l)) {
                c6956l.m2123default(145905443);
                boolean zBilling = ((i8 & 112) == 32) | c6956l.billing(c4487l);
                Object objM2132native2 = c6956l.m2132native();
                Object obj6 = objM2132native2;
                if (zBilling || objM2132native2 == c13863l) {
                    Ctry ctry = new Ctry(c4487l, c3625l, 20);
                    c6956l.m2147try(ctry);
                    obj6 = ctry;
                }
                function0 = (Function0) obj6;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(146002721);
                boolean z5 = (i8 & 112) == 32;
                Object objM2132native3 = c6956l.m2132native();
                Object obj7 = objM2132native3;
                if (z5 || objM2132native3 == c13863l) {
                    C9636l c9636l = new C9636l(21, c3625l);
                    c6956l.m2147try(c9636l);
                    obj7 = c9636l;
                }
                function0 = (Function0) obj7;
                c6956l.startapp(false);
            }
            if (z) {
                if (map != null) {
                    C8195l c8195l2 = AbstractC8543l.yandex;
                    if (map.isEmpty()) {
                        function0 = function0;
                        c8195l = AbstractC8543l.yandex;
                    } else {
                        int length = c3625l.f7563l.length();
                        List list = c3625l.f7564l;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i9 = 0;
                            while (i9 < size) {
                                List list2 = list;
                                C15012l c15012l = (C15012l) list.get(i9);
                                int i10 = size;
                                Object obj8 = c15012l.yandex;
                                int i11 = i9;
                                int i12 = c15012l.crashlytics;
                                int i13 = c15012l.loadAd;
                                String str = c15012l.amazon;
                                if ((obj8 instanceof C9891l) && "androidx.compose.foundation.text.inlineContent".equals(str) && AbstractC0255l.loadAd(0, length, i13, i12)) {
                                    arrayList.add(new C15012l(i13, i12, ((C9891l) c15012l.yandex).yandex, str));
                                }
                                i9 = i11 + 1;
                                size = i10;
                                list = list2;
                            }
                        } else {
                            arrayList = C2580l.f5619l;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            if (map.get(((C15012l) arrayList.get(i14)).yandex) != null) {
                                C18725l.loadAd();
                                return;
                            }
                        }
                        c8195l = new C8195l(arrayList2, arrayList3);
                    }
                } else {
                    function0 = function0;
                    c8195l = AbstractC8543l.yandex;
                }
                function3 = null;
            } else {
                c4487l = c4487l;
                function0 = function0;
                function3 = null;
                c8195l = new C8195l(null, null);
            }
            List list3 = (List) c8195l.f17098l;
            List list4 = (List) c8195l.f17097l;
            if (z) {
                c6956l.m2123default(146318828);
                Object objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == c13863l) {
                    obj4 = objM2132native4;
                    C10086l c10086lSmaato = AbstractC8020l.smaato(function3);
                    c6956l.m2147try(c10086lSmaato);
                    obj4 = c10086lSmaato;
                }
                obj4 = objM2132native4;
                c6956l.startapp(false);
                r9 = (InterfaceC8714l) obj4;
            } else {
                c6956l.m2123default(146406588);
                c6956l.startapp(false);
                r9 = function3;
            }
            if (z) {
                c6956l.m2123default(146499837);
                boolean zBilling2 = c6956l.billing(r9);
                Object objM2132native5 = c6956l.m2132native();
                if (zBilling2 || objM2132native5 == c13863l) {
                    obj3 = objM2132native5;
                    C9922l c9922l = new C9922l(r9, 11);
                    c6956l.m2147try(c9922l);
                    obj3 = c9922l;
                }
                function3 = (Function1) obj3;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(146571260);
                c6956l.startapp(false);
            }
            Function1 function4 = function3;
            int i15 = (i8 >> 3) & 14;
            C4487l c4487l3 = c4487l;
            AbstractC5312l.yandex(c3625l, c11090l, interfaceC16061l, list3, z2, c6956l);
            C3625l c3625l2 = (C3625l) function0.invoke();
            boolean zAdmob = c6956l.admob(c4487l3) | ((i8 & 896) == 256);
            Object objM2132native6 = c6956l.m2132native();
            Object obj9 = objM2132native6;
            if (zAdmob || objM2132native6 == c13863l) {
                C3883l c3883l = new C3883l(c4487l3, function1, 0);
                c6956l.m2147try(c3883l);
                obj9 = c3883l;
            }
            InterfaceC17242l interfaceC17242lSmaato = smaato(interfaceC17242l, c3625l2, c11090l, (Function1) obj9, i, z2, i2, i3, interfaceC16061l, list3, function4, c17005l, function2);
            if (z) {
                c6956l.m2123default(147956465);
                boolean zAdmob2 = c6956l.admob(c4487l3);
                Object objM2132native7 = c6956l.m2132native();
                if (zAdmob2 || objM2132native7 == c13863l) {
                    obj = objM2132native7;
                    C1378l c1378l = new C1378l(c4487l3, 1);
                    c6956l.m2147try(c1378l);
                    obj = c1378l;
                }
                Function0 function5 = (Function0) obj;
                boolean zBilling3 = c6956l.billing(r9);
                Object objM2132native8 = c6956l.m2132native();
                Object obj10 = objM2132native8;
                if (zBilling3 || objM2132native8 == c13863l) {
                    C0289l c0289l = new C0289l(r9, 5);
                    c6956l.m2147try(c0289l);
                    obj10 = c0289l;
                }
                c7096l = new C7096l(function5, (Function0) obj10, 2);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(147779703);
                boolean zAdmob3 = c6956l.admob(c4487l3);
                Object objM2132native9 = c6956l.m2132native();
                if (zAdmob3 || objM2132native9 == c13863l) {
                    r4 = 0;
                    C1378l c1378l2 = new C1378l(c4487l3, false ? 1 : 0);
                    c6956l.m2147try(c1378l2);
                    obj2 = c1378l2;
                } else {
                    r4 = 0;
                    obj2 = objM2132native9;
                }
                c7096l = new C17999l(r4, (Function0) obj2);
                c6956l.startapp(r4);
            }
            long j = c6956l.f14595continue;
            int i16 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c7096l, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i16), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            if (c4487l3 == null) {
                c6956l.m2123default(-433557001);
                z3 = false;
                c6956l.startapp(false);
            } else {
                z3 = false;
                c6956l.m2123default(-291080374);
                c4487l3.yandex(c6956l, 0);
                c6956l.startapp(false);
                Unit unit = Unit.INSTANCE;
            }
            if (list4 == null) {
                c6956l.m2123default(-433506223);
            } else {
                c6956l.m2123default(-433506222);
                AbstractC8543l.yandex(c3625l, list4, c6956l, i15);
                Unit unit2 = Unit.INSTANCE;
            }
            c6956l.startapp(z3);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُ۟ۜ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int iPurchase = AbstractC0545l.purchase(i4 | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i5);
                    AbstractC17307l.amazon(interfaceC17242l, c3625l, function1, z, map, c11090l, i, z2, i2, i3, interfaceC16061l, c17005l, function2, (C6956l) obj11, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:155:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:160:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0246  */
    /* JADX WARN: Code duplicated, block: B:166:0x025f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0270  */
    /* JADX WARN: Code duplicated, block: B:170:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0297  */
    /* JADX WARN: Code duplicated, block: B:174:0x029e  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:182:0x030b  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    public static final void billing(final Object obj, int i, long j, long j2, int i2, float f, boolean z, InterfaceC6347l interfaceC6347l, String str, InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i3, final int i4) {
        long j3;
        long j4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        final int i18;
        final String str2;
        final long j5;
        final long j6;
        final int i19;
        final float f3;
        final InterfaceC6347l interfaceC6347l2;
        final InterfaceC17242l interfaceC17242l2;
        final boolean z4;
        C4224l c4224lAds;
        int i20;
        float f4;
        InterfaceC6347l interfaceC6347l3;
        String str3;
        int i21;
        InterfaceC17242l interfaceC17242l3;
        Resources resources;
        Resources.Theme theme;
        long j7;
        long j8;
        boolean zBilling;
        Object objM2132native;
        Object obj2;
        TypedValue typedValue;
        int i22;
        XmlResourceParser xml;
        int next;
        C3408l c3408lTapsense;
        Object objM2132native2;
        C9477l c9477l;
        C1791l c1791l;
        c6956l.m2133new(1720625454);
        int i23 = (i3 & 6) == 0 ? i3 | (c6956l.admob(obj) ? 4 : 2) : i3;
        int i24 = i4 & 2;
        if (i24 != 0) {
            i23 |= 48;
        } else if ((i3 & 48) == 0) {
            i23 |= c6956l.amazon(i == 0 ? -1 : AbstractC5020l.inmobi(i)) ? 32 : 16;
        }
        if ((i4 & 4) == 0) {
            j3 = j;
            int i25 = c6956l.purchase(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            int i26 = i23 | i25;
            if ((i4 & 8) == 0) {
                j4 = j2;
                int i27 = c6956l.purchase(j4) ? 2048 : 1024;
                int i28 = i26 | i27;
                if ((i4 & 16) == 0) {
                    i5 = i2;
                    int i29 = c6956l.amazon(i5) ? 16384 : 8192;
                    i6 = i28 | i29;
                    i7 = i4 & 32;
                    if (i7 != 0) {
                        if ((i3 & 196608) == 0) {
                            f2 = f;
                            if (c6956l.crashlytics(f2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i6 |= i8;
                        }
                        i9 = i4 & 64;
                        if (i9 != 0) {
                            if ((i3 & 1572864) == 0) {
                                z2 = z;
                                if (c6956l.mopub(z2)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i6 |= i10;
                            }
                            if ((i3 & 12582912) != 0) {
                                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                            }
                            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i11 != 0) {
                                i13 = i6 | 100663296;
                            } else {
                                int i30 = i6;
                                if (c6956l.billing(str)) {
                                    i12 = 67108864;
                                } else {
                                    i12 = 33554432;
                                }
                                i13 = i30 | i12;
                            }
                            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            if (i14 != 0) {
                                i16 = i13 | 805306368;
                            } else {
                                if (c6956l.billing(interfaceC17242l)) {
                                    i15 = 536870912;
                                } else {
                                    i15 = 268435456;
                                }
                                i16 = i13 | i15;
                            }
                            i17 = i16;
                            if ((i17 & 306783379) != 306783378) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (c6956l.m2127for(i17 & 1, z3)) {
                                c6956l.m2141switch();
                                if ((i3 & 1) != 0 || c6956l.ad()) {
                                    if (i24 != 0) {
                                        i20 = 1;
                                    } else {
                                        i20 = i;
                                    }
                                    if ((i4 & 4) != 0) {
                                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                        i17 &= -897;
                                    }
                                    if ((i4 & 8) != 0) {
                                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                        i17 &= -7169;
                                    }
                                    if ((i4 & 16) != 0) {
                                        i17 &= -57345;
                                        i5 = R.drawable.ic_music_outline_28;
                                    }
                                    if (i7 != 0) {
                                        f4 = 48.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if (i9 != 0) {
                                        z2 = false;
                                    }
                                    if ((i4 & 128) != 0) {
                                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                        i17 &= -29360129;
                                    } else {
                                        interfaceC6347l3 = interfaceC6347l;
                                    }
                                    if (i11 != 0) {
                                        str3 = null;
                                    } else {
                                        str3 = str;
                                    }
                                    if (i14 != 0) {
                                        i21 = i17;
                                        interfaceC17242l3 = C4346l.f8873l;
                                    } else {
                                        i21 = i17;
                                    }
                                    c6956l.adcel();
                                    int i31 = ((i21 >> 9) & 112) | 6;
                                    AbstractC5189l abstractC5189l = AbstractC1242l.loadAd;
                                    Context context = (Context) c6956l.isPro(abstractC5189l);
                                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                                    int i32 = i20;
                                    theme = context.getTheme();
                                    j7 = j3;
                                    j8 = j4;
                                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                                    objM2132native = c6956l.m2132native();
                                    obj2 = C1867l.yandex;
                                    if (zBilling || objM2132native == obj2) {
                                        typedValue = new TypedValue();
                                        resources.getValue(i5, typedValue, true);
                                        xml = resources.getXml(i5);
                                        next = xml.next();
                                        for (i22 = 1; next != 2 && next != i22; i22 = 1) {
                                            next = xml.next();
                                        }
                                        if (next != 2) {
                                            throw new XmlPullParserException("No start tag found");
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                                    objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj2) {
                                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                        c6956l.m2147try(objM2132native2);
                                    }
                                    C3354l c3354l = (C3354l) objM2132native2;
                                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l));
                                    c9477l.ads = 1;
                                    c9477l.crashlytics = obj;
                                    c9477l.crashlytics(AbstractC9029l.purchase(i32));
                                    if (str3 != null) {
                                        c1791l = new C1791l(str3, C14054l.f27396l);
                                    } else {
                                        c1791l = null;
                                    }
                                    c9477l.remoteconfig = c1791l;
                                    c9477l.purchase = str3;
                                    if (z2) {
                                        C13767l c13767lLoadAd = c9477l.loadAd();
                                        Boolean bool = Boolean.TRUE;
                                        c13767lLoadAd.yandex(C12014l.f23937l, bool);
                                        c9477l.loadAd().yandex(C12014l.f23938l, bool);
                                    }
                                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l, c3354l, C4176l.yandex, c6956l, 36912, 6, 31712);
                                    j5 = j7;
                                    j6 = j8;
                                    f3 = f4;
                                    interfaceC6347l2 = interfaceC6347l3;
                                    str2 = str3;
                                    i19 = i5;
                                    interfaceC17242l2 = interfaceC17242l3;
                                    i18 = i32;
                                } else {
                                    c6956l.m2124else();
                                    if ((i4 & 4) != 0) {
                                        i17 &= -897;
                                    }
                                    if ((i4 & 8) != 0) {
                                        i17 &= -7169;
                                    }
                                    if ((i4 & 16) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((i4 & 128) != 0) {
                                        i17 &= -29360129;
                                    }
                                    i20 = i;
                                    str3 = str;
                                    i21 = i17;
                                    f4 = f2;
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                interfaceC17242l3 = interfaceC17242l;
                                c6956l.adcel();
                                int i33 = ((i21 >> 9) & 112) | 6;
                                AbstractC5189l abstractC5189l2 = AbstractC1242l.loadAd;
                                Context context2 = (Context) c6956l.isPro(abstractC5189l2);
                                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                                int i34 = i20;
                                theme = context2.getTheme();
                                j7 = j3;
                                j8 = j4;
                                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i33 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i33 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                                objM2132native = c6956l.m2132native();
                                obj2 = C1867l.yandex;
                                if (zBilling) {
                                    typedValue = new TypedValue();
                                    resources.getValue(i5, typedValue, true);
                                    xml = resources.getXml(i5);
                                    next = xml.next();
                                    while (next != 2) {
                                        next = xml.next();
                                    }
                                    if (next != 2) {
                                        throw new XmlPullParserException("No start tag found");
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                    c6956l.m2147try(objM2132native);
                                } else {
                                    typedValue = new TypedValue();
                                    resources.getValue(i5, typedValue, true);
                                    xml = resources.getXml(i5);
                                    next = xml.next();
                                    while (next != 2) {
                                        next = xml.next();
                                    }
                                    if (next != 2) {
                                        throw new XmlPullParserException("No start tag found");
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                    c6956l.m2147try(objM2132native);
                                }
                                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                                objM2132native2 = c6956l.m2132native();
                                if (objM2132native2 == obj2) {
                                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                    c6956l.m2147try(objM2132native2);
                                }
                                C3354l c3354l2 = (C3354l) objM2132native2;
                                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l2));
                                c9477l.ads = 1;
                                c9477l.crashlytics = obj;
                                c9477l.crashlytics(AbstractC9029l.purchase(i34));
                                if (str3 != null) {
                                    c1791l = new C1791l(str3, C14054l.f27396l);
                                } else {
                                    c1791l = null;
                                }
                                c9477l.remoteconfig = c1791l;
                                c9477l.purchase = str3;
                                if (z2) {
                                    C13767l c13767lLoadAd2 = c9477l.loadAd();
                                    Boolean bool2 = Boolean.TRUE;
                                    c13767lLoadAd2.yandex(C12014l.f23937l, bool2);
                                    c9477l.loadAd().yandex(C12014l.f23938l, bool2);
                                }
                                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l2, c3354l2, C4176l.yandex, c6956l, 36912, 6, 31712);
                                j5 = j7;
                                j6 = j8;
                                f3 = f4;
                                interfaceC6347l2 = interfaceC6347l3;
                                str2 = str3;
                                i19 = i5;
                                interfaceC17242l2 = interfaceC17242l3;
                                i18 = i34;
                            } else {
                                c6956l.m2124else();
                                i18 = i;
                                str2 = str;
                                j5 = j3;
                                j6 = j4;
                                i19 = i5;
                                f3 = f2;
                                interfaceC6347l2 = interfaceC6347l;
                                interfaceC17242l2 = interfaceC17242l;
                            }
                            z4 = z2;
                            c4224lAds = c6956l.ads();
                            if (c4224lAds != null) {
                                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ((Integer) obj4).getClass();
                                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                        }
                        i6 |= 1572864;
                        z2 = z;
                        if ((i3 & 12582912) != 0) {
                            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                        }
                        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i11 != 0) {
                            i13 = i6 | 100663296;
                        } else {
                            int i35 = i6;
                            if (c6956l.billing(str)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i35 | i12;
                        }
                        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        if (i14 != 0) {
                            i16 = i13 | 805306368;
                        } else {
                            if (c6956l.billing(interfaceC17242l)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i16 = i13 | i15;
                        }
                        i17 = i16;
                        if ((i17 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c6956l.m2127for(i17 & 1, z3)) {
                            c6956l.m2141switch();
                            if ((i3 & 1) != 0) {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            } else {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            }
                            c6956l.adcel();
                            int i36 = ((i21 >> 9) & 112) | 6;
                            AbstractC5189l abstractC5189l3 = AbstractC1242l.loadAd;
                            Context context3 = (Context) c6956l.isPro(abstractC5189l3);
                            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                            int i37 = i20;
                            theme = context3.getTheme();
                            j7 = j3;
                            j8 = j4;
                            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i36 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i36 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                            objM2132native = c6956l.m2132native();
                            obj2 = C1867l.yandex;
                            if (zBilling) {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit4 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            } else {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit5 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            }
                            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                            objM2132native2 = c6956l.m2132native();
                            if (objM2132native2 == obj2) {
                                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                c6956l.m2147try(objM2132native2);
                            }
                            C3354l c3354l3 = (C3354l) objM2132native2;
                            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l3));
                            c9477l.ads = 1;
                            c9477l.crashlytics = obj;
                            c9477l.crashlytics(AbstractC9029l.purchase(i37));
                            if (str3 != null) {
                                c1791l = new C1791l(str3, C14054l.f27396l);
                            } else {
                                c1791l = null;
                            }
                            c9477l.remoteconfig = c1791l;
                            c9477l.purchase = str3;
                            if (z2) {
                                C13767l c13767lLoadAd3 = c9477l.loadAd();
                                Boolean bool3 = Boolean.TRUE;
                                c13767lLoadAd3.yandex(C12014l.f23937l, bool3);
                                c9477l.loadAd().yandex(C12014l.f23938l, bool3);
                            }
                            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l3, c3354l3, C4176l.yandex, c6956l, 36912, 6, 31712);
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            interfaceC6347l2 = interfaceC6347l3;
                            str2 = str3;
                            i19 = i5;
                            interfaceC17242l2 = interfaceC17242l3;
                            i18 = i37;
                        } else {
                            c6956l.m2124else();
                            i18 = i;
                            str2 = str;
                            j5 = j3;
                            j6 = j4;
                            i19 = i5;
                            f3 = f2;
                            interfaceC6347l2 = interfaceC6347l;
                            interfaceC17242l2 = interfaceC17242l;
                        }
                        z4 = z2;
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 196608;
                    f2 = f;
                    i9 = i4 & 64;
                    if (i9 != 0) {
                        if ((i3 & 1572864) == 0) {
                            z2 = z;
                            if (c6956l.mopub(z2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((i3 & 12582912) != 0) {
                            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                        }
                        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i11 != 0) {
                            i13 = i6 | 100663296;
                        } else {
                            int i38 = i6;
                            if (c6956l.billing(str)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i38 | i12;
                        }
                        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        if (i14 != 0) {
                            i16 = i13 | 805306368;
                        } else {
                            if (c6956l.billing(interfaceC17242l)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i16 = i13 | i15;
                        }
                        i17 = i16;
                        if ((i17 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c6956l.m2127for(i17 & 1, z3)) {
                            c6956l.m2141switch();
                            if ((i3 & 1) != 0) {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            } else {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            }
                            c6956l.adcel();
                            int i39 = ((i21 >> 9) & 112) | 6;
                            AbstractC5189l abstractC5189l4 = AbstractC1242l.loadAd;
                            Context context4 = (Context) c6956l.isPro(abstractC5189l4);
                            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                            int i310 = i20;
                            theme = context4.getTheme();
                            j7 = j3;
                            j8 = j4;
                            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i39 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i39 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                            objM2132native = c6956l.m2132native();
                            obj2 = C1867l.yandex;
                            if (zBilling) {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit6 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            } else {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit7 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            }
                            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                            objM2132native2 = c6956l.m2132native();
                            if (objM2132native2 == obj2) {
                                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                c6956l.m2147try(objM2132native2);
                            }
                            C3354l c3354l4 = (C3354l) objM2132native2;
                            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l4));
                            c9477l.ads = 1;
                            c9477l.crashlytics = obj;
                            c9477l.crashlytics(AbstractC9029l.purchase(i310));
                            if (str3 != null) {
                                c1791l = new C1791l(str3, C14054l.f27396l);
                            } else {
                                c1791l = null;
                            }
                            c9477l.remoteconfig = c1791l;
                            c9477l.purchase = str3;
                            if (z2) {
                                C13767l c13767lLoadAd4 = c9477l.loadAd();
                                Boolean bool4 = Boolean.TRUE;
                                c13767lLoadAd4.yandex(C12014l.f23937l, bool4);
                                c9477l.loadAd().yandex(C12014l.f23938l, bool4);
                            }
                            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l4, c3354l4, C4176l.yandex, c6956l, 36912, 6, 31712);
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            interfaceC6347l2 = interfaceC6347l3;
                            str2 = str3;
                            i19 = i5;
                            interfaceC17242l2 = interfaceC17242l3;
                            i18 = i310;
                        } else {
                            c6956l.m2124else();
                            i18 = i;
                            str2 = str;
                            j5 = j3;
                            j6 = j4;
                            i19 = i5;
                            f3 = f2;
                            interfaceC6347l2 = interfaceC6347l;
                            interfaceC17242l2 = interfaceC17242l;
                        }
                        z4 = z2;
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    z2 = z;
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i311 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i311 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i312 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l5 = AbstractC1242l.loadAd;
                        Context context5 = (Context) c6956l.isPro(abstractC5189l5);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i313 = i20;
                        theme = context5.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i312 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i312 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit8 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit9 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l5 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l5));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i313));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd5 = c9477l.loadAd();
                            Boolean bool5 = Boolean.TRUE;
                            c13767lLoadAd5.yandex(C12014l.f23937l, bool5);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool5);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l5, c3354l5, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i313;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i5 = i2;
                i6 = i28 | i29;
                i7 = i4 & 32;
                if (i7 != 0) {
                    if ((i3 & 196608) == 0) {
                        f2 = f;
                        if (c6956l.crashlytics(f2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                        if ((i3 & 1572864) == 0) {
                            z2 = z;
                            if (c6956l.mopub(z2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((i3 & 12582912) != 0) {
                            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                        }
                        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i11 != 0) {
                            i13 = i6 | 100663296;
                        } else {
                            int i314 = i6;
                            if (c6956l.billing(str)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i314 | i12;
                        }
                        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        if (i14 != 0) {
                            i16 = i13 | 805306368;
                        } else {
                            if (c6956l.billing(interfaceC17242l)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i16 = i13 | i15;
                        }
                        i17 = i16;
                        if ((i17 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c6956l.m2127for(i17 & 1, z3)) {
                            c6956l.m2141switch();
                            if ((i3 & 1) != 0) {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            } else {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            }
                            c6956l.adcel();
                            int i315 = ((i21 >> 9) & 112) | 6;
                            AbstractC5189l abstractC5189l6 = AbstractC1242l.loadAd;
                            Context context6 = (Context) c6956l.isPro(abstractC5189l6);
                            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                            int i316 = i20;
                            theme = context6.getTheme();
                            j7 = j3;
                            j8 = j4;
                            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i315 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i315 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                            objM2132native = c6956l.m2132native();
                            obj2 = C1867l.yandex;
                            if (zBilling) {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit10 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            } else {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit11 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            }
                            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                            objM2132native2 = c6956l.m2132native();
                            if (objM2132native2 == obj2) {
                                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                c6956l.m2147try(objM2132native2);
                            }
                            C3354l c3354l6 = (C3354l) objM2132native2;
                            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l6));
                            c9477l.ads = 1;
                            c9477l.crashlytics = obj;
                            c9477l.crashlytics(AbstractC9029l.purchase(i316));
                            if (str3 != null) {
                                c1791l = new C1791l(str3, C14054l.f27396l);
                            } else {
                                c1791l = null;
                            }
                            c9477l.remoteconfig = c1791l;
                            c9477l.purchase = str3;
                            if (z2) {
                                C13767l c13767lLoadAd6 = c9477l.loadAd();
                                Boolean bool6 = Boolean.TRUE;
                                c13767lLoadAd6.yandex(C12014l.f23937l, bool6);
                                c9477l.loadAd().yandex(C12014l.f23938l, bool6);
                            }
                            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l6, c3354l6, C4176l.yandex, c6956l, 36912, 6, 31712);
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            interfaceC6347l2 = interfaceC6347l3;
                            str2 = str3;
                            i19 = i5;
                            interfaceC17242l2 = interfaceC17242l3;
                            i18 = i316;
                        } else {
                            c6956l.m2124else();
                            i18 = i;
                            str2 = str;
                            j5 = j3;
                            j6 = j4;
                            i19 = i5;
                            f3 = f2;
                            interfaceC6347l2 = interfaceC6347l;
                            interfaceC17242l2 = interfaceC17242l;
                        }
                        z4 = z2;
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    z2 = z;
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i317 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i317 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i318 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l7 = AbstractC1242l.loadAd;
                        Context context7 = (Context) c6956l.isPro(abstractC5189l7);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i319 = i20;
                        theme = context7.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i318 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i318 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit12 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit13 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l7 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l7));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i319));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd7 = c9477l.loadAd();
                            Boolean bool7 = Boolean.TRUE;
                            c13767lLoadAd7.yandex(C12014l.f23937l, bool7);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool7);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l7, c3354l7, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i319;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 196608;
                f2 = f;
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i3110 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i3110 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i3111 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l8 = AbstractC1242l.loadAd;
                        Context context8 = (Context) c6956l.isPro(abstractC5189l8);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i3112 = i20;
                        theme = context8.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit14 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit15 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l8 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l8));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i3112));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd8 = c9477l.loadAd();
                            Boolean bool8 = Boolean.TRUE;
                            c13767lLoadAd8.yandex(C12014l.f23937l, bool8);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool8);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l8, c3354l8, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i3112;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i3113 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i3113 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i3114 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l9 = AbstractC1242l.loadAd;
                    Context context9 = (Context) c6956l.isPro(abstractC5189l9);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i3115 = i20;
                    theme = context9.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3114 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3114 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit16 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit17 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l9 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l9));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i3115));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd9 = c9477l.loadAd();
                        Boolean bool9 = Boolean.TRUE;
                        c13767lLoadAd9.yandex(C12014l.f23937l, bool9);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool9);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l9, c3354l9, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i3115;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            j4 = j2;
            int i210 = i26 | i27;
            if ((i4 & 16) == 0) {
                i5 = i2;
                if (c6956l.amazon(i5)) {
                }
                i6 = i210 | i29;
                i7 = i4 & 32;
                if (i7 != 0) {
                    if ((i3 & 196608) == 0) {
                        f2 = f;
                        if (c6956l.crashlytics(f2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                        if ((i3 & 1572864) == 0) {
                            z2 = z;
                            if (c6956l.mopub(z2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((i3 & 12582912) != 0) {
                            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                        }
                        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i11 != 0) {
                            i13 = i6 | 100663296;
                        } else {
                            int i3116 = i6;
                            if (c6956l.billing(str)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i3116 | i12;
                        }
                        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        if (i14 != 0) {
                            i16 = i13 | 805306368;
                        } else {
                            if (c6956l.billing(interfaceC17242l)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i16 = i13 | i15;
                        }
                        i17 = i16;
                        if ((i17 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c6956l.m2127for(i17 & 1, z3)) {
                            c6956l.m2141switch();
                            if ((i3 & 1) != 0) {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            } else {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            }
                            c6956l.adcel();
                            int i3117 = ((i21 >> 9) & 112) | 6;
                            AbstractC5189l abstractC5189l10 = AbstractC1242l.loadAd;
                            Context context10 = (Context) c6956l.isPro(abstractC5189l10);
                            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                            int i3118 = i20;
                            theme = context10.getTheme();
                            j7 = j3;
                            j8 = j4;
                            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3117 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3117 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                            objM2132native = c6956l.m2132native();
                            obj2 = C1867l.yandex;
                            if (zBilling) {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit18 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            } else {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit19 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            }
                            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                            objM2132native2 = c6956l.m2132native();
                            if (objM2132native2 == obj2) {
                                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                c6956l.m2147try(objM2132native2);
                            }
                            C3354l c3354l10 = (C3354l) objM2132native2;
                            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l10));
                            c9477l.ads = 1;
                            c9477l.crashlytics = obj;
                            c9477l.crashlytics(AbstractC9029l.purchase(i3118));
                            if (str3 != null) {
                                c1791l = new C1791l(str3, C14054l.f27396l);
                            } else {
                                c1791l = null;
                            }
                            c9477l.remoteconfig = c1791l;
                            c9477l.purchase = str3;
                            if (z2) {
                                C13767l c13767lLoadAd10 = c9477l.loadAd();
                                Boolean bool10 = Boolean.TRUE;
                                c13767lLoadAd10.yandex(C12014l.f23937l, bool10);
                                c9477l.loadAd().yandex(C12014l.f23938l, bool10);
                            }
                            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l10, c3354l10, C4176l.yandex, c6956l, 36912, 6, 31712);
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            interfaceC6347l2 = interfaceC6347l3;
                            str2 = str3;
                            i19 = i5;
                            interfaceC17242l2 = interfaceC17242l3;
                            i18 = i3118;
                        } else {
                            c6956l.m2124else();
                            i18 = i;
                            str2 = str;
                            j5 = j3;
                            j6 = j4;
                            i19 = i5;
                            f3 = f2;
                            interfaceC6347l2 = interfaceC6347l;
                            interfaceC17242l2 = interfaceC17242l;
                        }
                        z4 = z2;
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    z2 = z;
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i3119 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i3119 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i31110 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l11 = AbstractC1242l.loadAd;
                        Context context11 = (Context) c6956l.isPro(abstractC5189l11);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i31111 = i20;
                        theme = context11.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31110 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31110 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit110 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit111 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l11 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l11));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i31111));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd11 = c9477l.loadAd();
                            Boolean bool11 = Boolean.TRUE;
                            c13767lLoadAd11.yandex(C12014l.f23937l, bool11);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool11);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l11, c3354l11, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i31111;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 196608;
                f2 = f;
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i31112 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i31112 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i31113 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l12 = AbstractC1242l.loadAd;
                        Context context12 = (Context) c6956l.isPro(abstractC5189l12);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i31114 = i20;
                        theme = context12.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31113 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31113 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit112 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit113 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l12 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l12));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i31114));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd12 = c9477l.loadAd();
                            Boolean bool12 = Boolean.TRUE;
                            c13767lLoadAd12.yandex(C12014l.f23937l, bool12);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool12);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l12, c3354l12, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i31114;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i31115 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i31115 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i31116 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l13 = AbstractC1242l.loadAd;
                    Context context13 = (Context) c6956l.isPro(abstractC5189l13);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i31117 = i20;
                    theme = context13.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31116 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31116 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit114 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit115 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l13 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l13));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i31117));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd13 = c9477l.loadAd();
                        Boolean bool13 = Boolean.TRUE;
                        c13767lLoadAd13.yandex(C12014l.f23937l, bool13);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool13);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l13, c3354l13, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i31117;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i5 = i2;
            i6 = i210 | i29;
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 196608) == 0) {
                    f2 = f;
                    if (c6956l.crashlytics(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i31118 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i31118 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i31119 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l14 = AbstractC1242l.loadAd;
                        Context context14 = (Context) c6956l.isPro(abstractC5189l14);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i311110 = i20;
                        theme = context14.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31119 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31119 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit116 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit117 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l14 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l14));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i311110));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd14 = c9477l.loadAd();
                            Boolean bool14 = Boolean.TRUE;
                            c13767lLoadAd14.yandex(C12014l.f23937l, bool14);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool14);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l14, c3354l14, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i311110;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i311111 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i311111 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i311112 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l15 = AbstractC1242l.loadAd;
                    Context context15 = (Context) c6956l.isPro(abstractC5189l15);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i311113 = i20;
                    theme = context15.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311112 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311112 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit118 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit119 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l15 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l15));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i311113));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd15 = c9477l.loadAd();
                        Boolean bool15 = Boolean.TRUE;
                        c13767lLoadAd15.yandex(C12014l.f23937l, bool15);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool15);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l15, c3354l15, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i311113;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            f2 = f;
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((i3 & 1572864) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i311114 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i311114 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i311115 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l16 = AbstractC1242l.loadAd;
                    Context context16 = (Context) c6956l.isPro(abstractC5189l16);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i311116 = i20;
                    theme = context16.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311115 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311115 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit1110 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit1111 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l16 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l16));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i311116));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd16 = c9477l.loadAd();
                        Boolean bool16 = Boolean.TRUE;
                        c13767lLoadAd16.yandex(C12014l.f23937l, bool16);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool16);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l16, c3354l16, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i311116;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 1572864;
            z2 = z;
            if ((i3 & 12582912) != 0) {
                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
            }
            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i13 = i6 | 100663296;
            } else {
                int i311117 = i6;
                if (c6956l.billing(str)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i311117 | i12;
            }
            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i14 != 0) {
                i16 = i13 | 805306368;
            } else {
                if (c6956l.billing(interfaceC17242l)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            if ((i17 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i17 & 1, z3)) {
                c6956l.m2141switch();
                if ((i3 & 1) != 0) {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                } else {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                }
                c6956l.adcel();
                int i311118 = ((i21 >> 9) & 112) | 6;
                AbstractC5189l abstractC5189l17 = AbstractC1242l.loadAd;
                Context context17 = (Context) c6956l.isPro(abstractC5189l17);
                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                int i311119 = i20;
                theme = context17.getTheme();
                j7 = j3;
                j8 = j4;
                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311118 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311118 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                objM2132native = c6956l.m2132native();
                obj2 = C1867l.yandex;
                if (zBilling) {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1112 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                } else {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1113 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                }
                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj2) {
                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                    c6956l.m2147try(objM2132native2);
                }
                C3354l c3354l17 = (C3354l) objM2132native2;
                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l17));
                c9477l.ads = 1;
                c9477l.crashlytics = obj;
                c9477l.crashlytics(AbstractC9029l.purchase(i311119));
                if (str3 != null) {
                    c1791l = new C1791l(str3, C14054l.f27396l);
                } else {
                    c1791l = null;
                }
                c9477l.remoteconfig = c1791l;
                c9477l.purchase = str3;
                if (z2) {
                    C13767l c13767lLoadAd17 = c9477l.loadAd();
                    Boolean bool17 = Boolean.TRUE;
                    c13767lLoadAd17.yandex(C12014l.f23937l, bool17);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool17);
                }
                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l17, c3354l17, C4176l.yandex, c6956l, 36912, 6, 31712);
                j5 = j7;
                j6 = j8;
                f3 = f4;
                interfaceC6347l2 = interfaceC6347l3;
                str2 = str3;
                i19 = i5;
                interfaceC17242l2 = interfaceC17242l3;
                i18 = i311119;
            } else {
                c6956l.m2124else();
                i18 = i;
                str2 = str;
                j5 = j3;
                j6 = j4;
                i19 = i5;
                f3 = f2;
                interfaceC6347l2 = interfaceC6347l;
                interfaceC17242l2 = interfaceC17242l;
            }
            z4 = z2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j3 = j;
        int i211 = i23 | i25;
        if ((i4 & 8) == 0) {
            j4 = j2;
            if (c6956l.purchase(j4)) {
            }
            int i212 = i211 | i27;
            if ((i4 & 16) == 0) {
                i5 = i2;
                if (c6956l.amazon(i5)) {
                }
                i6 = i212 | i29;
                i7 = i4 & 32;
                if (i7 != 0) {
                    if ((i3 & 196608) == 0) {
                        f2 = f;
                        if (c6956l.crashlytics(f2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                        if ((i3 & 1572864) == 0) {
                            z2 = z;
                            if (c6956l.mopub(z2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((i3 & 12582912) != 0) {
                            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                        }
                        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i11 != 0) {
                            i13 = i6 | 100663296;
                        } else {
                            int i3111110 = i6;
                            if (c6956l.billing(str)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i3111110 | i12;
                        }
                        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        if (i14 != 0) {
                            i16 = i13 | 805306368;
                        } else {
                            if (c6956l.billing(interfaceC17242l)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i16 = i13 | i15;
                        }
                        i17 = i16;
                        if ((i17 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c6956l.m2127for(i17 & 1, z3)) {
                            c6956l.m2141switch();
                            if ((i3 & 1) != 0) {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            } else {
                                if (i24 != 0) {
                                    i20 = 1;
                                } else {
                                    i20 = i;
                                }
                                if ((i4 & 4) != 0) {
                                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                    i17 &= -897;
                                }
                                if ((i4 & 8) != 0) {
                                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                    i17 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i17 &= -57345;
                                    i5 = R.drawable.ic_music_outline_28;
                                }
                                if (i7 != 0) {
                                    f4 = 48.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                if ((i4 & 128) != 0) {
                                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                    i17 &= -29360129;
                                } else {
                                    interfaceC6347l3 = interfaceC6347l;
                                }
                                if (i11 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i14 != 0) {
                                    i21 = i17;
                                    interfaceC17242l3 = C4346l.f8873l;
                                } else {
                                    i21 = i17;
                                    interfaceC17242l3 = interfaceC17242l;
                                }
                            }
                            c6956l.adcel();
                            int i3111111 = ((i21 >> 9) & 112) | 6;
                            AbstractC5189l abstractC5189l18 = AbstractC1242l.loadAd;
                            Context context18 = (Context) c6956l.isPro(abstractC5189l18);
                            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                            int i3111112 = i20;
                            theme = context18.getTheme();
                            j7 = j3;
                            j8 = j4;
                            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111111 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111111 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                            objM2132native = c6956l.m2132native();
                            obj2 = C1867l.yandex;
                            if (zBilling) {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit1114 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            } else {
                                typedValue = new TypedValue();
                                resources.getValue(i5, typedValue, true);
                                xml = resources.getXml(i5);
                                next = xml.next();
                                while (next != 2) {
                                    next = xml.next();
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                Unit unit1115 = Unit.INSTANCE;
                                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                                c6956l.m2147try(objM2132native);
                            }
                            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                            objM2132native2 = c6956l.m2132native();
                            if (objM2132native2 == obj2) {
                                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                                c6956l.m2147try(objM2132native2);
                            }
                            C3354l c3354l18 = (C3354l) objM2132native2;
                            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l18));
                            c9477l.ads = 1;
                            c9477l.crashlytics = obj;
                            c9477l.crashlytics(AbstractC9029l.purchase(i3111112));
                            if (str3 != null) {
                                c1791l = new C1791l(str3, C14054l.f27396l);
                            } else {
                                c1791l = null;
                            }
                            c9477l.remoteconfig = c1791l;
                            c9477l.purchase = str3;
                            if (z2) {
                                C13767l c13767lLoadAd18 = c9477l.loadAd();
                                Boolean bool18 = Boolean.TRUE;
                                c13767lLoadAd18.yandex(C12014l.f23937l, bool18);
                                c9477l.loadAd().yandex(C12014l.f23938l, bool18);
                            }
                            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l18, c3354l18, C4176l.yandex, c6956l, 36912, 6, 31712);
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            interfaceC6347l2 = interfaceC6347l3;
                            str2 = str3;
                            i19 = i5;
                            interfaceC17242l2 = interfaceC17242l3;
                            i18 = i3111112;
                        } else {
                            c6956l.m2124else();
                            i18 = i;
                            str2 = str;
                            j5 = j3;
                            j6 = j4;
                            i19 = i5;
                            f3 = f2;
                            interfaceC6347l2 = interfaceC6347l;
                            interfaceC17242l2 = interfaceC17242l;
                        }
                        z4 = z2;
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    z2 = z;
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i3111113 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i3111113 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i3111114 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l19 = AbstractC1242l.loadAd;
                        Context context19 = (Context) c6956l.isPro(abstractC5189l19);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i3111115 = i20;
                        theme = context19.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111114 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111114 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit1116 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit1117 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l19 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l19));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i3111115));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd19 = c9477l.loadAd();
                            Boolean bool19 = Boolean.TRUE;
                            c13767lLoadAd19.yandex(C12014l.f23937l, bool19);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool19);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l19, c3354l19, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i3111115;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 196608;
                f2 = f;
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i3111116 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i3111116 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i3111117 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l110 = AbstractC1242l.loadAd;
                        Context context110 = (Context) c6956l.isPro(abstractC5189l110);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i3111118 = i20;
                        theme = context110.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111117 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111117 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit1118 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit1119 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l110 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l110));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i3111118));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd110 = c9477l.loadAd();
                            Boolean bool110 = Boolean.TRUE;
                            c13767lLoadAd110.yandex(C12014l.f23937l, bool110);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool110);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l110, c3354l110, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i3111118;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i3111119 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i3111119 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i31111110 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l111 = AbstractC1242l.loadAd;
                    Context context111 = (Context) c6956l.isPro(abstractC5189l111);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i31111111 = i20;
                    theme = context111.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111110 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111110 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11110 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11111 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l111 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l111));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i31111111));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd111 = c9477l.loadAd();
                        Boolean bool111 = Boolean.TRUE;
                        c13767lLoadAd111.yandex(C12014l.f23937l, bool111);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool111);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l111, c3354l111, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i31111111;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i5 = i2;
            i6 = i212 | i29;
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 196608) == 0) {
                    f2 = f;
                    if (c6956l.crashlytics(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i31111112 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i31111112 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i31111113 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l112 = AbstractC1242l.loadAd;
                        Context context112 = (Context) c6956l.isPro(abstractC5189l112);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i31111114 = i20;
                        theme = context112.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111113 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111113 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit11112 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit11113 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l112 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l112));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i31111114));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd112 = c9477l.loadAd();
                            Boolean bool112 = Boolean.TRUE;
                            c13767lLoadAd112.yandex(C12014l.f23937l, bool112);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool112);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l112, c3354l112, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i31111114;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i31111115 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i31111115 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i31111116 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l113 = AbstractC1242l.loadAd;
                    Context context113 = (Context) c6956l.isPro(abstractC5189l113);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i31111117 = i20;
                    theme = context113.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111116 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111116 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11114 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11115 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l113 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l113));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i31111117));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd113 = c9477l.loadAd();
                        Boolean bool113 = Boolean.TRUE;
                        c13767lLoadAd113.yandex(C12014l.f23937l, bool113);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool113);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l113, c3354l113, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i31111117;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            f2 = f;
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((i3 & 1572864) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i31111118 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i31111118 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i31111119 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l114 = AbstractC1242l.loadAd;
                    Context context114 = (Context) c6956l.isPro(abstractC5189l114);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i311111110 = i20;
                    theme = context114.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111119 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111119 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11116 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit11117 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l114 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l114));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i311111110));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd114 = c9477l.loadAd();
                        Boolean bool114 = Boolean.TRUE;
                        c13767lLoadAd114.yandex(C12014l.f23937l, bool114);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool114);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l114, c3354l114, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i311111110;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 1572864;
            z2 = z;
            if ((i3 & 12582912) != 0) {
                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
            }
            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i13 = i6 | 100663296;
            } else {
                int i311111111 = i6;
                if (c6956l.billing(str)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i311111111 | i12;
            }
            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i14 != 0) {
                i16 = i13 | 805306368;
            } else {
                if (c6956l.billing(interfaceC17242l)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            if ((i17 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i17 & 1, z3)) {
                c6956l.m2141switch();
                if ((i3 & 1) != 0) {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                } else {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                }
                c6956l.adcel();
                int i311111112 = ((i21 >> 9) & 112) | 6;
                AbstractC5189l abstractC5189l115 = AbstractC1242l.loadAd;
                Context context115 = (Context) c6956l.isPro(abstractC5189l115);
                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                int i311111113 = i20;
                theme = context115.getTheme();
                j7 = j3;
                j8 = j4;
                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311111112 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311111112 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                objM2132native = c6956l.m2132native();
                obj2 = C1867l.yandex;
                if (zBilling) {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit11118 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                } else {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit11119 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                }
                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj2) {
                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                    c6956l.m2147try(objM2132native2);
                }
                C3354l c3354l115 = (C3354l) objM2132native2;
                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l115));
                c9477l.ads = 1;
                c9477l.crashlytics = obj;
                c9477l.crashlytics(AbstractC9029l.purchase(i311111113));
                if (str3 != null) {
                    c1791l = new C1791l(str3, C14054l.f27396l);
                } else {
                    c1791l = null;
                }
                c9477l.remoteconfig = c1791l;
                c9477l.purchase = str3;
                if (z2) {
                    C13767l c13767lLoadAd115 = c9477l.loadAd();
                    Boolean bool115 = Boolean.TRUE;
                    c13767lLoadAd115.yandex(C12014l.f23937l, bool115);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool115);
                }
                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l115, c3354l115, C4176l.yandex, c6956l, 36912, 6, 31712);
                j5 = j7;
                j6 = j8;
                f3 = f4;
                interfaceC6347l2 = interfaceC6347l3;
                str2 = str3;
                i19 = i5;
                interfaceC17242l2 = interfaceC17242l3;
                i18 = i311111113;
            } else {
                c6956l.m2124else();
                i18 = i;
                str2 = str;
                j5 = j3;
                j6 = j4;
                i19 = i5;
                f3 = f2;
                interfaceC6347l2 = interfaceC6347l;
                interfaceC17242l2 = interfaceC17242l;
            }
            z4 = z2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j4 = j2;
        int i213 = i211 | i27;
        if ((i4 & 16) == 0) {
            i5 = i2;
            if (c6956l.amazon(i5)) {
            }
            i6 = i213 | i29;
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 196608) == 0) {
                    f2 = f;
                    if (c6956l.crashlytics(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((i3 & 1572864) == 0) {
                        z2 = z;
                        if (c6956l.mopub(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((i3 & 12582912) != 0) {
                        i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                    }
                    i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i13 = i6 | 100663296;
                    } else {
                        int i311111114 = i6;
                        if (c6956l.billing(str)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i311111114 | i12;
                    }
                    i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    if (i14 != 0) {
                        i16 = i13 | 805306368;
                    } else {
                        if (c6956l.billing(interfaceC17242l)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i16 = i13 | i15;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i17 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i3 & 1) != 0) {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        } else {
                            if (i24 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i;
                            }
                            if ((i4 & 4) != 0) {
                                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                                i17 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                                i17 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i17 &= -57345;
                                i5 = R.drawable.ic_music_outline_28;
                            }
                            if (i7 != 0) {
                                f4 = 48.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i4 & 128) != 0) {
                                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                                i17 &= -29360129;
                            } else {
                                interfaceC6347l3 = interfaceC6347l;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i14 != 0) {
                                i21 = i17;
                                interfaceC17242l3 = C4346l.f8873l;
                            } else {
                                i21 = i17;
                                interfaceC17242l3 = interfaceC17242l;
                            }
                        }
                        c6956l.adcel();
                        int i311111115 = ((i21 >> 9) & 112) | 6;
                        AbstractC5189l abstractC5189l116 = AbstractC1242l.loadAd;
                        Context context116 = (Context) c6956l.isPro(abstractC5189l116);
                        resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                        int i311111116 = i20;
                        theme = context116.getTheme();
                        j7 = j3;
                        j8 = j4;
                        zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311111115 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311111115 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                        objM2132native = c6956l.m2132native();
                        obj2 = C1867l.yandex;
                        if (zBilling) {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit111110 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        } else {
                            typedValue = new TypedValue();
                            resources.getValue(i5, typedValue, true);
                            xml = resources.getXml(i5);
                            next = xml.next();
                            while (next != 2) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            Unit unit111111 = Unit.INSTANCE;
                            objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                            c6956l.m2147try(objM2132native);
                        }
                        c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj2) {
                            objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                            c6956l.m2147try(objM2132native2);
                        }
                        C3354l c3354l116 = (C3354l) objM2132native2;
                        c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l116));
                        c9477l.ads = 1;
                        c9477l.crashlytics = obj;
                        c9477l.crashlytics(AbstractC9029l.purchase(i311111116));
                        if (str3 != null) {
                            c1791l = new C1791l(str3, C14054l.f27396l);
                        } else {
                            c1791l = null;
                        }
                        c9477l.remoteconfig = c1791l;
                        c9477l.purchase = str3;
                        if (z2) {
                            C13767l c13767lLoadAd116 = c9477l.loadAd();
                            Boolean bool116 = Boolean.TRUE;
                            c13767lLoadAd116.yandex(C12014l.f23937l, bool116);
                            c9477l.loadAd().yandex(C12014l.f23938l, bool116);
                        }
                        AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l116, c3354l116, C4176l.yandex, c6956l, 36912, 6, 31712);
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        interfaceC6347l2 = interfaceC6347l3;
                        str2 = str3;
                        i19 = i5;
                        interfaceC17242l2 = interfaceC17242l3;
                        i18 = i311111116;
                    } else {
                        c6956l.m2124else();
                        i18 = i;
                        str2 = str;
                        j5 = j3;
                        j6 = j4;
                        i19 = i5;
                        f3 = f2;
                        interfaceC6347l2 = interfaceC6347l;
                        interfaceC17242l2 = interfaceC17242l;
                    }
                    z4 = z2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                                AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                z2 = z;
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i311111117 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i311111117 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i311111118 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l117 = AbstractC1242l.loadAd;
                    Context context117 = (Context) c6956l.isPro(abstractC5189l117);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i311111119 = i20;
                    theme = context117.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i311111118 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i311111118 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111112 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111113 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l117 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l117));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i311111119));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd117 = c9477l.loadAd();
                        Boolean bool117 = Boolean.TRUE;
                        c13767lLoadAd117.yandex(C12014l.f23937l, bool117);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool117);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l117, c3354l117, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i311111119;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            f2 = f;
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((i3 & 1572864) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i3111111110 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i3111111110 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i3111111111 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l118 = AbstractC1242l.loadAd;
                    Context context118 = (Context) c6956l.isPro(abstractC5189l118);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i3111111112 = i20;
                    theme = context118.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111111111 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111111111 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111114 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111115 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l118 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l118));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i3111111112));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd118 = c9477l.loadAd();
                        Boolean bool118 = Boolean.TRUE;
                        c13767lLoadAd118.yandex(C12014l.f23937l, bool118);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool118);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l118, c3354l118, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i3111111112;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 1572864;
            z2 = z;
            if ((i3 & 12582912) != 0) {
                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
            }
            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i13 = i6 | 100663296;
            } else {
                int i3111111113 = i6;
                if (c6956l.billing(str)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i3111111113 | i12;
            }
            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i14 != 0) {
                i16 = i13 | 805306368;
            } else {
                if (c6956l.billing(interfaceC17242l)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            if ((i17 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i17 & 1, z3)) {
                c6956l.m2141switch();
                if ((i3 & 1) != 0) {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                } else {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                }
                c6956l.adcel();
                int i3111111114 = ((i21 >> 9) & 112) | 6;
                AbstractC5189l abstractC5189l119 = AbstractC1242l.loadAd;
                Context context119 = (Context) c6956l.isPro(abstractC5189l119);
                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                int i3111111115 = i20;
                theme = context119.getTheme();
                j7 = j3;
                j8 = j4;
                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111111114 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111111114 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                objM2132native = c6956l.m2132native();
                obj2 = C1867l.yandex;
                if (zBilling) {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit111116 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                } else {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit111117 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                }
                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj2) {
                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                    c6956l.m2147try(objM2132native2);
                }
                C3354l c3354l119 = (C3354l) objM2132native2;
                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l119));
                c9477l.ads = 1;
                c9477l.crashlytics = obj;
                c9477l.crashlytics(AbstractC9029l.purchase(i3111111115));
                if (str3 != null) {
                    c1791l = new C1791l(str3, C14054l.f27396l);
                } else {
                    c1791l = null;
                }
                c9477l.remoteconfig = c1791l;
                c9477l.purchase = str3;
                if (z2) {
                    C13767l c13767lLoadAd119 = c9477l.loadAd();
                    Boolean bool119 = Boolean.TRUE;
                    c13767lLoadAd119.yandex(C12014l.f23937l, bool119);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool119);
                }
                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l119, c3354l119, C4176l.yandex, c6956l, 36912, 6, 31712);
                j5 = j7;
                j6 = j8;
                f3 = f4;
                interfaceC6347l2 = interfaceC6347l3;
                str2 = str3;
                i19 = i5;
                interfaceC17242l2 = interfaceC17242l3;
                i18 = i3111111115;
            } else {
                c6956l.m2124else();
                i18 = i;
                str2 = str;
                j5 = j3;
                j6 = j4;
                i19 = i5;
                f3 = f2;
                interfaceC6347l2 = interfaceC6347l;
                interfaceC17242l2 = interfaceC17242l;
            }
            z4 = z2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i5 = i2;
        i6 = i213 | i29;
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((i3 & 196608) == 0) {
                f2 = f;
                if (c6956l.crashlytics(f2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((i3 & 1572864) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((i3 & 12582912) != 0) {
                    i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
                }
                i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i13 = i6 | 100663296;
                } else {
                    int i3111111116 = i6;
                    if (c6956l.billing(str)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i3111111116 | i12;
                }
                i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                } else {
                    if (c6956l.billing(interfaceC17242l)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                if ((i17 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i17 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i3 & 1) != 0) {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    } else {
                        if (i24 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i;
                        }
                        if ((i4 & 4) != 0) {
                            j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                            i17 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i17 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i17 &= -57345;
                            i5 = R.drawable.ic_music_outline_28;
                        }
                        if (i7 != 0) {
                            f4 = 48.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if ((i4 & 128) != 0) {
                            interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                            i17 &= -29360129;
                        } else {
                            interfaceC6347l3 = interfaceC6347l;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i14 != 0) {
                            i21 = i17;
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            i21 = i17;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                    }
                    c6956l.adcel();
                    int i3111111117 = ((i21 >> 9) & 112) | 6;
                    AbstractC5189l abstractC5189l1110 = AbstractC1242l.loadAd;
                    Context context1110 = (Context) c6956l.isPro(abstractC5189l1110);
                    resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                    int i3111111118 = i20;
                    theme = context1110.getTheme();
                    j7 = j3;
                    j8 = j4;
                    zBilling = c6956l.billing(resources.getConfiguration()) | ((((i3111111117 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i3111111117 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                    objM2132native = c6956l.m2132native();
                    obj2 = C1867l.yandex;
                    if (zBilling) {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111118 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    } else {
                        typedValue = new TypedValue();
                        resources.getValue(i5, typedValue, true);
                        xml = resources.getXml(i5);
                        next = xml.next();
                        while (next != 2) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        Unit unit111119 = Unit.INSTANCE;
                        objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                        c6956l.m2147try(objM2132native);
                    }
                    c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                        c6956l.m2147try(objM2132native2);
                    }
                    C3354l c3354l1110 = (C3354l) objM2132native2;
                    c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l1110));
                    c9477l.ads = 1;
                    c9477l.crashlytics = obj;
                    c9477l.crashlytics(AbstractC9029l.purchase(i3111111118));
                    if (str3 != null) {
                        c1791l = new C1791l(str3, C14054l.f27396l);
                    } else {
                        c1791l = null;
                    }
                    c9477l.remoteconfig = c1791l;
                    c9477l.purchase = str3;
                    if (z2) {
                        C13767l c13767lLoadAd1110 = c9477l.loadAd();
                        Boolean bool1110 = Boolean.TRUE;
                        c13767lLoadAd1110.yandex(C12014l.f23937l, bool1110);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool1110);
                    }
                    AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l1110, c3354l1110, C4176l.yandex, c6956l, 36912, 6, 31712);
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    interfaceC6347l2 = interfaceC6347l3;
                    str2 = str3;
                    i19 = i5;
                    interfaceC17242l2 = interfaceC17242l3;
                    i18 = i3111111118;
                } else {
                    c6956l.m2124else();
                    i18 = i;
                    str2 = str;
                    j5 = j3;
                    j6 = j4;
                    i19 = i5;
                    f3 = f2;
                    interfaceC6347l2 = interfaceC6347l;
                    interfaceC17242l2 = interfaceC17242l;
                }
                z4 = z2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iPurchase = AbstractC0545l.purchase(i3 | 1);
                            AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 1572864;
            z2 = z;
            if ((i3 & 12582912) != 0) {
                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
            }
            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i13 = i6 | 100663296;
            } else {
                int i3111111119 = i6;
                if (c6956l.billing(str)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i3111111119 | i12;
            }
            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i14 != 0) {
                i16 = i13 | 805306368;
            } else {
                if (c6956l.billing(interfaceC17242l)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            if ((i17 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i17 & 1, z3)) {
                c6956l.m2141switch();
                if ((i3 & 1) != 0) {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                } else {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                }
                c6956l.adcel();
                int i31111111110 = ((i21 >> 9) & 112) | 6;
                AbstractC5189l abstractC5189l1111 = AbstractC1242l.loadAd;
                Context context1111 = (Context) c6956l.isPro(abstractC5189l1111);
                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                int i31111111111 = i20;
                theme = context1111.getTheme();
                j7 = j3;
                j8 = j4;
                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111111110 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111111110 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                objM2132native = c6956l.m2132native();
                obj2 = C1867l.yandex;
                if (zBilling) {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1111110 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                } else {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1111111 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                }
                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj2) {
                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                    c6956l.m2147try(objM2132native2);
                }
                C3354l c3354l1111 = (C3354l) objM2132native2;
                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l1111));
                c9477l.ads = 1;
                c9477l.crashlytics = obj;
                c9477l.crashlytics(AbstractC9029l.purchase(i31111111111));
                if (str3 != null) {
                    c1791l = new C1791l(str3, C14054l.f27396l);
                } else {
                    c1791l = null;
                }
                c9477l.remoteconfig = c1791l;
                c9477l.purchase = str3;
                if (z2) {
                    C13767l c13767lLoadAd1111 = c9477l.loadAd();
                    Boolean bool1111 = Boolean.TRUE;
                    c13767lLoadAd1111.yandex(C12014l.f23937l, bool1111);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool1111);
                }
                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l1111, c3354l1111, C4176l.yandex, c6956l, 36912, 6, 31712);
                j5 = j7;
                j6 = j8;
                f3 = f4;
                interfaceC6347l2 = interfaceC6347l3;
                str2 = str3;
                i19 = i5;
                interfaceC17242l2 = interfaceC17242l3;
                i18 = i31111111111;
            } else {
                c6956l.m2124else();
                i18 = i;
                str2 = str;
                j5 = j3;
                j6 = j4;
                i19 = i5;
                f3 = f2;
                interfaceC6347l2 = interfaceC6347l;
                interfaceC17242l2 = interfaceC17242l;
            }
            z4 = z2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 196608;
        f2 = f;
        i9 = i4 & 64;
        if (i9 != 0) {
            if ((i3 & 1572864) == 0) {
                z2 = z;
                if (c6956l.mopub(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i6 |= i10;
            }
            if ((i3 & 12582912) != 0) {
                i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
            }
            i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i13 = i6 | 100663296;
            } else {
                int i31111111112 = i6;
                if (c6956l.billing(str)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i31111111112 | i12;
            }
            i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i14 != 0) {
                i16 = i13 | 805306368;
            } else {
                if (c6956l.billing(interfaceC17242l)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            if ((i17 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i17 & 1, z3)) {
                c6956l.m2141switch();
                if ((i3 & 1) != 0) {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                } else {
                    if (i24 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i;
                    }
                    if ((i4 & 4) != 0) {
                        j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                        i17 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i17 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i17 &= -57345;
                        i5 = R.drawable.ic_music_outline_28;
                    }
                    if (i7 != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if ((i4 & 128) != 0) {
                        interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        i17 &= -29360129;
                    } else {
                        interfaceC6347l3 = interfaceC6347l;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i14 != 0) {
                        i21 = i17;
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        i21 = i17;
                        interfaceC17242l3 = interfaceC17242l;
                    }
                }
                c6956l.adcel();
                int i31111111113 = ((i21 >> 9) & 112) | 6;
                AbstractC5189l abstractC5189l1112 = AbstractC1242l.loadAd;
                Context context1112 = (Context) c6956l.isPro(abstractC5189l1112);
                resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
                int i31111111114 = i20;
                theme = context1112.getTheme();
                j7 = j3;
                j8 = j4;
                zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111111113 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111111113 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
                objM2132native = c6956l.m2132native();
                obj2 = C1867l.yandex;
                if (zBilling) {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1111112 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                } else {
                    typedValue = new TypedValue();
                    resources.getValue(i5, typedValue, true);
                    xml = resources.getXml(i5);
                    next = xml.next();
                    while (next != 2) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    Unit unit1111113 = Unit.INSTANCE;
                    objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                    c6956l.m2147try(objM2132native);
                }
                c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj2) {
                    objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                    c6956l.m2147try(objM2132native2);
                }
                C3354l c3354l1112 = (C3354l) objM2132native2;
                c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l1112));
                c9477l.ads = 1;
                c9477l.crashlytics = obj;
                c9477l.crashlytics(AbstractC9029l.purchase(i31111111114));
                if (str3 != null) {
                    c1791l = new C1791l(str3, C14054l.f27396l);
                } else {
                    c1791l = null;
                }
                c9477l.remoteconfig = c1791l;
                c9477l.purchase = str3;
                if (z2) {
                    C13767l c13767lLoadAd1112 = c9477l.loadAd();
                    Boolean bool1112 = Boolean.TRUE;
                    c13767lLoadAd1112.yandex(C12014l.f23937l, bool1112);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool1112);
                }
                AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l1112, c3354l1112, C4176l.yandex, c6956l, 36912, 6, 31712);
                j5 = j7;
                j6 = j8;
                f3 = f4;
                interfaceC6347l2 = interfaceC6347l3;
                str2 = str3;
                i19 = i5;
                interfaceC17242l2 = interfaceC17242l3;
                i18 = i31111111114;
            } else {
                c6956l.m2124else();
                i18 = i;
                str2 = str;
                j5 = j3;
                j6 = j4;
                i19 = i5;
                f3 = f2;
                interfaceC6347l2 = interfaceC6347l;
                interfaceC17242l2 = interfaceC17242l;
            }
            z4 = z2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iPurchase = AbstractC0545l.purchase(i3 | 1);
                        AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 1572864;
        z2 = z;
        if ((i3 & 12582912) != 0) {
            i6 |= ((i4 & 128) == 0 || !c6956l.billing(interfaceC6347l)) ? 4194304 : 8388608;
        }
        i11 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i11 != 0) {
            i13 = i6 | 100663296;
        } else {
            int i31111111115 = i6;
            if (c6956l.billing(str)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i13 = i31111111115 | i12;
        }
        i14 = i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        if (i14 != 0) {
            i16 = i13 | 805306368;
        } else {
            if (c6956l.billing(interfaceC17242l)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i16 = i13 | i15;
        }
        i17 = i16;
        if ((i17 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i17 & 1, z3)) {
            c6956l.m2141switch();
            if ((i3 & 1) != 0) {
                if (i24 != 0) {
                    i20 = 1;
                } else {
                    i20 = i;
                }
                if ((i4 & 4) != 0) {
                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                    i17 &= -897;
                }
                if ((i4 & 8) != 0) {
                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    i17 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i17 &= -57345;
                    i5 = R.drawable.ic_music_outline_28;
                }
                if (i7 != 0) {
                    f4 = 48.0f;
                } else {
                    f4 = f2;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                if ((i4 & 128) != 0) {
                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                    i17 &= -29360129;
                } else {
                    interfaceC6347l3 = interfaceC6347l;
                }
                if (i11 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i14 != 0) {
                    i21 = i17;
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    i21 = i17;
                    interfaceC17242l3 = interfaceC17242l;
                }
            } else {
                if (i24 != 0) {
                    i20 = 1;
                } else {
                    i20 = i;
                }
                if ((i4 & 4) != 0) {
                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                    i17 &= -897;
                }
                if ((i4 & 8) != 0) {
                    j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    i17 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i17 &= -57345;
                    i5 = R.drawable.ic_music_outline_28;
                }
                if (i7 != 0) {
                    f4 = 48.0f;
                } else {
                    f4 = f2;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                if ((i4 & 128) != 0) {
                    interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                    i17 &= -29360129;
                } else {
                    interfaceC6347l3 = interfaceC6347l;
                }
                if (i11 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i14 != 0) {
                    i21 = i17;
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    i21 = i17;
                    interfaceC17242l3 = interfaceC17242l;
                }
            }
            c6956l.adcel();
            int i31111111116 = ((i21 >> 9) & 112) | 6;
            AbstractC5189l abstractC5189l1113 = AbstractC1242l.loadAd;
            Context context1113 = (Context) c6956l.isPro(abstractC5189l1113);
            resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
            int i31111111117 = i20;
            theme = context1113.getTheme();
            j7 = j3;
            j8 = j4;
            zBilling = c6956l.billing(resources.getConfiguration()) | ((((i31111111116 & 112) ^ 48) <= 32 && c6956l.amazon(i5)) || (i31111111116 & 48) == 32) | c6956l.billing(resources) | c6956l.billing(theme);
            objM2132native = c6956l.m2132native();
            obj2 = C1867l.yandex;
            if (zBilling) {
                typedValue = new TypedValue();
                resources.getValue(i5, typedValue, true);
                xml = resources.getXml(i5);
                next = xml.next();
                while (next != 2) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Unit unit1111114 = Unit.INSTANCE;
                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                c6956l.m2147try(objM2132native);
            } else {
                typedValue = new TypedValue();
                resources.getValue(i5, typedValue, true);
                xml = resources.getXml(i5);
                next = xml.next();
                while (next != 2) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Unit unit1111115 = Unit.INSTANCE;
                objM2132native = AbstractC15960l.isPro(theme, resources, xml, typedValue.changingConfigurations).yandex;
                c6956l.m2147try(objM2132native);
            }
            c3408lTapsense = AbstractC13041l.tapsense((C5197l) objM2132native, c6956l);
            objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj2) {
                objM2132native2 = new C3354l(c3408lTapsense, j7, j8);
                c6956l.m2147try(objM2132native2);
            }
            C3354l c3354l1113 = (C3354l) objM2132native2;
            c9477l = new C9477l((Context) c6956l.isPro(abstractC5189l1113));
            c9477l.ads = 1;
            c9477l.crashlytics = obj;
            c9477l.crashlytics(AbstractC9029l.purchase(i31111111117));
            if (str3 != null) {
                c1791l = new C1791l(str3, C14054l.f27396l);
            } else {
                c1791l = null;
            }
            c9477l.remoteconfig = c1791l;
            c9477l.purchase = str3;
            if (z2) {
                C13767l c13767lLoadAd1113 = c9477l.loadAd();
                Boolean bool1113 = Boolean.TRUE;
                c13767lLoadAd1113.yandex(C12014l.f23937l, bool1113);
                c9477l.loadAd().yandex(C12014l.f23938l, bool1113);
            }
            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242l3, f4), interfaceC6347l3), c3354l1113, c3354l1113, C4176l.yandex, c6956l, 36912, 6, 31712);
            j5 = j7;
            j6 = j8;
            f3 = f4;
            interfaceC6347l2 = interfaceC6347l3;
            str2 = str3;
            i19 = i5;
            interfaceC17242l2 = interfaceC17242l3;
            i18 = i31111111117;
        } else {
            c6956l.m2124else();
            i18 = i;
            str2 = str;
            j5 = j3;
            j6 = j4;
            i19 = i5;
            f3 = f2;
            interfaceC6347l2 = interfaceC6347l;
            interfaceC17242l2 = interfaceC17242l;
        }
        z4 = z2;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؗؔۖ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iPurchase = AbstractC0545l.purchase(i3 | 1);
                    AbstractC17307l.billing(obj, i18, j5, j6, i19, f3, z4, interfaceC6347l2, str2, interfaceC17242l2, (C6956l) obj3, iPurchase, i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static float crashlytics(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static InterfaceC12001l firebase(InterfaceC12001l interfaceC12001l, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return interfaceC12001l.billing(new C1491l(remoteconfig(0.0f), remoteconfig(f), remoteconfig((i & 4) != 0 ? 0.0f : 32.0f), remoteconfig((i & 8) != 0 ? 0.0f : 8.0f)));
    }

    public static InterfaceC12001l isPro(InterfaceC12001l interfaceC12001l, float f, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        float f2 = (i & 2) == 0 ? 8.0f : 0.0f;
        return interfaceC12001l.billing(new C1491l(remoteconfig(f), remoteconfig(f2), remoteconfig(f), remoteconfig(f2)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x016d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:133:0x020b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02be  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    public static final void loadAd(final String str, final InterfaceC17242l interfaceC17242l, final C11090l c11090l, Function1 function1, int i, boolean z, final int i2, int i3, C6956l c6956l, final int i4, final int i5) {
        int i6;
        final Function1 function2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zAdmob;
        int i17;
        boolean z2;
        final int i18;
        final int i19;
        final boolean z3;
        C4224l c4224lAds;
        Function1 function3;
        int i20;
        boolean z4;
        C11611l c11611l;
        C17005l c17005l;
        Executor executor;
        boolean z5;
        int i21;
        int i22;
        Function1 function4;
        InterfaceC17242l interfaceC17242lSmaato;
        Function0 function0;
        long j;
        boolean zAdmob2;
        Object objM2132native;
        int i23;
        long jLongValue;
        boolean zPurchase;
        Object objM2132native2;
        int i24;
        c6956l.m2133new(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (c6956l.billing(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c6956l.billing(c11090l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i25 = i5 & 8;
        if (i25 == 0) {
            if ((i4 & 3072) == 0) {
                function2 = function1;
                i6 |= c6956l.admob(function2) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    i8 = i;
                    if (c6956l.amazon(i8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i6 |= i9;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    if ((196608 & i4) == 0) {
                        if (c6956l.mopub(z)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i6 |= i11;
                    }
                    if ((1572864 & i4) == 0) {
                        if (c6956l.amazon(i2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i6 |= i24;
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i4) == 0) {
                            i13 = i3;
                            if (c6956l.amazon(i13)) {
                                i14 = 8388608;
                            } else {
                                i14 = 4194304;
                            }
                            i6 |= i14;
                        }
                        i15 = i6 | 100663296;
                        i16 = i6;
                        if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                            i15 = i16 | 905969664;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zAdmob = c6956l.billing(null);
                            } else {
                                zAdmob = c6956l.admob(null);
                            }
                            if (zAdmob) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i15 |= i17;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (c6956l.m2127for(i15 & 1, z2)) {
                            if (i25 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i7 != 0) {
                                i20 = 1;
                            } else {
                                i20 = i8;
                            }
                            if (i10 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i12 != 0) {
                                i13 = 1;
                            }
                            AbstractC17653l.purchase(i13, i2);
                            c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                            if (c11611l != null) {
                                c6956l.m2123default(356427477);
                                j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                                Object[] objArr = {c11611l};
                                C13645l c13645l = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                                zAdmob2 = c6956l.admob(c11611l);
                                objM2132native = c6956l.m2132native();
                                Object obj = C1867l.yandex;
                                if (!zAdmob2 || objM2132native == obj) {
                                    i23 = 0;
                                    objM2132native = new C0661l(c11611l, i23);
                                    c6956l.m2147try(objM2132native);
                                } else {
                                    i23 = 0;
                                }
                                jLongValue = ((Number) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, i23)).longValue();
                                zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                                objM2132native2 = c6956l.m2132native();
                                if (zPurchase || objM2132native2 == obj) {
                                    objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                    c6956l.m2147try(objM2132native2);
                                }
                                c6956l.startapp(false);
                                c17005l = (C17005l) objM2132native2;
                            } else {
                                c6956l.m2123default(357055103);
                                c6956l.startapp(false);
                                c17005l = null;
                            }
                            InterfaceC16061l interfaceC16061l = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                            executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                            if (executor == null && AbstractC5312l.loadAd(str.length())) {
                                c6956l.m2123default(-1250263182);
                                try {
                                    boolean z6 = z4;
                                    try {
                                        RunnableC0295l runnableC0295l = new RunnableC0295l(c11090l, (EnumC9931l) c6956l.isPro(AbstractC4751l.vip), str, (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob), interfaceC16061l, z6);
                                        interfaceC16061l = interfaceC16061l;
                                        z4 = z6;
                                        executor.execute(runnableC0295l);
                                    } catch (RejectedExecutionException unused) {
                                        interfaceC16061l = interfaceC16061l;
                                        z4 = z6;
                                    }
                                } catch (RejectedExecutionException unused2) {
                                }
                                z5 = false;
                                c6956l.startapp(false);
                            } else {
                                z5 = false;
                                c6956l.m2123default(-1248455541);
                                c6956l.startapp(false);
                            }
                            if (c17005l == null || function3 != null) {
                                i21 = i13;
                                i22 = i20;
                                c6956l.m2123default(357432497);
                                function4 = function3;
                                interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                                c6956l.startapp(z5);
                            } else {
                                c6956l.m2123default(358076243);
                                c6956l.startapp(z5);
                                i21 = i13;
                                i22 = i20;
                                interfaceC17242lSmaato = interfaceC17242l.premium(new C16125l(str, c11090l, interfaceC16061l, i22, z4, i2, i21));
                                function4 = function3;
                            }
                            C10327l c10327l = C10327l.billing;
                            long j2 = c6956l.f14595continue;
                            int i26 = (int) (j2 ^ (j2 >>> 32));
                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                            InterfaceC8801l.firebase.getClass();
                            function0 = C3438l.loadAd;
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(function0);
                            } else {
                                c6956l.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l, c10327l, C3438l.mopub);
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                            AbstractC8182l.purchase(c6956l, C3438l.firebase);
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                            AbstractC8182l.billing(c6956l, Integer.valueOf(i26), C3438l.isPro);
                            c6956l.startapp(true);
                            z3 = z4;
                            i19 = i21;
                            i18 = i22;
                            function2 = function4;
                        } else {
                            c6956l.m2124else();
                            i18 = i8;
                            i19 = i13;
                            z3 = z;
                        }
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj2, AbstractC0545l.purchase(i4 | 1), i5);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i6 |= 12582912;
                    i13 = i3;
                    i15 = i6 | 100663296;
                    i16 = i6;
                    if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        i15 = i16 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zAdmob = c6956l.billing(null);
                        } else {
                            zAdmob = c6956l.admob(null);
                        }
                        if (zAdmob) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i15 |= i17;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i15 & 1, z2)) {
                        if (i25 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i7 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i8;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i13 = 1;
                        }
                        AbstractC17653l.purchase(i13, i2);
                        c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                        if (c11611l != null) {
                            c6956l.m2123default(356427477);
                            j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                            Object[] objArr2 = {c11611l};
                            C13645l c13645l2 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                            zAdmob2 = c6956l.admob(c11611l);
                            objM2132native = c6956l.m2132native();
                            Object obj2 = C1867l.yandex;
                            if (zAdmob2) {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            } else {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            }
                            jLongValue = ((Number) AbstractC0825l.smaato(objArr2, c13645l2, (Function0) objM2132native, c6956l, i23)).longValue();
                            zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                            objM2132native2 = c6956l.m2132native();
                            if (zPurchase) {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            }
                            c6956l.startapp(false);
                            c17005l = (C17005l) objM2132native2;
                        } else {
                            c6956l.m2123default(357055103);
                            c6956l.startapp(false);
                            c17005l = null;
                        }
                        InterfaceC16061l interfaceC16061l2 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                        executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                        if (executor == null) {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        } else {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        }
                        if (c17005l == null) {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        } else {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        }
                        C10327l c10327l2 = C10327l.billing;
                        long j3 = c6956l.f14595continue;
                        int i27 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                        InterfaceC8801l.firebase.getClass();
                        function0 = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(function0);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c10327l2, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i27), C3438l.isPro);
                        c6956l.startapp(true);
                        z3 = z4;
                        i19 = i21;
                        i18 = i22;
                        function2 = function4;
                    } else {
                        c6956l.m2124else();
                        i18 = i8;
                        i19 = i13;
                        z3 = z;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj3, AbstractC0545l.purchase(i4 | 1), i5);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 196608;
                if ((1572864 & i4) == 0) {
                    if (c6956l.amazon(i2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i6 |= i24;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        i13 = i3;
                        if (c6956l.amazon(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                    i15 = i6 | 100663296;
                    i16 = i6;
                    if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        i15 = i16 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zAdmob = c6956l.billing(null);
                        } else {
                            zAdmob = c6956l.admob(null);
                        }
                        if (zAdmob) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i15 |= i17;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i15 & 1, z2)) {
                        if (i25 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i7 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i8;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i13 = 1;
                        }
                        AbstractC17653l.purchase(i13, i2);
                        c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                        if (c11611l != null) {
                            c6956l.m2123default(356427477);
                            j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                            Object[] objArr3 = {c11611l};
                            C13645l c13645l3 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                            zAdmob2 = c6956l.admob(c11611l);
                            objM2132native = c6956l.m2132native();
                            Object obj3 = C1867l.yandex;
                            if (zAdmob2) {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            } else {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            }
                            jLongValue = ((Number) AbstractC0825l.smaato(objArr3, c13645l3, (Function0) objM2132native, c6956l, i23)).longValue();
                            zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                            objM2132native2 = c6956l.m2132native();
                            if (zPurchase) {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            }
                            c6956l.startapp(false);
                            c17005l = (C17005l) objM2132native2;
                        } else {
                            c6956l.m2123default(357055103);
                            c6956l.startapp(false);
                            c17005l = null;
                        }
                        InterfaceC16061l interfaceC16061l3 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                        executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                        if (executor == null) {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        } else {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        }
                        if (c17005l == null) {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        } else {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        }
                        C10327l c10327l3 = C10327l.billing;
                        long j4 = c6956l.f14595continue;
                        int i28 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                        InterfaceC8801l.firebase.getClass();
                        function0 = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(function0);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c10327l3, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, C3438l.billing);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, C3438l.amazon);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i28), C3438l.isPro);
                        c6956l.startapp(true);
                        z3 = z4;
                        i19 = i21;
                        i18 = i22;
                        function2 = function4;
                    } else {
                        c6956l.m2124else();
                        i18 = i8;
                        i19 = i13;
                        z3 = z;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj4, AbstractC0545l.purchase(i4 | 1), i5);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i13 = i3;
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr4 = {c11611l};
                        C13645l c13645l4 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj4 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr4, c13645l4, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l4 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l4 = C10327l.billing;
                    long j5 = c6956l.f14595continue;
                    int i29 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i29), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj5, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 24576;
            i8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    if (c6956l.mopub(z)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (c6956l.amazon(i2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i6 |= i24;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        i13 = i3;
                        if (c6956l.amazon(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                    i15 = i6 | 100663296;
                    i16 = i6;
                    if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        i15 = i16 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zAdmob = c6956l.billing(null);
                        } else {
                            zAdmob = c6956l.admob(null);
                        }
                        if (zAdmob) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i15 |= i17;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i15 & 1, z2)) {
                        if (i25 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i7 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i8;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i13 = 1;
                        }
                        AbstractC17653l.purchase(i13, i2);
                        c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                        if (c11611l != null) {
                            c6956l.m2123default(356427477);
                            j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                            Object[] objArr5 = {c11611l};
                            C13645l c13645l5 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                            zAdmob2 = c6956l.admob(c11611l);
                            objM2132native = c6956l.m2132native();
                            Object obj5 = C1867l.yandex;
                            if (zAdmob2) {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            } else {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            }
                            jLongValue = ((Number) AbstractC0825l.smaato(objArr5, c13645l5, (Function0) objM2132native, c6956l, i23)).longValue();
                            zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                            objM2132native2 = c6956l.m2132native();
                            if (zPurchase) {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            }
                            c6956l.startapp(false);
                            c17005l = (C17005l) objM2132native2;
                        } else {
                            c6956l.m2123default(357055103);
                            c6956l.startapp(false);
                            c17005l = null;
                        }
                        InterfaceC16061l interfaceC16061l5 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                        executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                        if (executor == null) {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        } else {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        }
                        if (c17005l == null) {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        } else {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        }
                        C10327l c10327l5 = C10327l.billing;
                        long j6 = c6956l.f14595continue;
                        int i210 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                        InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
                        InterfaceC8801l.firebase.getClass();
                        function0 = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(function0);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c10327l5, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, C3438l.billing);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, C3438l.amazon);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i210), C3438l.isPro);
                        c6956l.startapp(true);
                        z3 = z4;
                        i19 = i21;
                        i18 = i22;
                        function2 = function4;
                    } else {
                        c6956l.m2124else();
                        i18 = i8;
                        i19 = i13;
                        z3 = z;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj6, AbstractC0545l.purchase(i4 | 1), i5);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i13 = i3;
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr6 = {c11611l};
                        C13645l c13645l6 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj6 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr6, c13645l6, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l6 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l6 = C10327l.billing;
                    long j7 = c6956l.f14595continue;
                    int i211 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l6, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i211), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj7, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            if ((1572864 & i4) == 0) {
                if (c6956l.amazon(i2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i6 |= i24;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    i13 = i3;
                    if (c6956l.amazon(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr7 = {c11611l};
                        C13645l c13645l7 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj7 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr7, c13645l7, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l7 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l7 = C10327l.billing;
                    long j8 = c6956l.f14595continue;
                    int i212 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l7, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling7, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i212), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj8, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i13 = i3;
            i15 = i6 | 100663296;
            i16 = i6;
            if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                i15 = i16 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zAdmob = c6956l.billing(null);
                } else {
                    zAdmob = c6956l.admob(null);
                }
                if (zAdmob) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i15 |= i17;
            }
            if ((i15 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i15 & 1, z2)) {
                if (i25 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i7 != 0) {
                    i20 = 1;
                } else {
                    i20 = i8;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i13 = 1;
                }
                AbstractC17653l.purchase(i13, i2);
                c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                if (c11611l != null) {
                    c6956l.m2123default(356427477);
                    j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                    Object[] objArr8 = {c11611l};
                    C13645l c13645l8 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                    zAdmob2 = c6956l.admob(c11611l);
                    objM2132native = c6956l.m2132native();
                    Object obj8 = C1867l.yandex;
                    if (zAdmob2) {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    } else {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    }
                    jLongValue = ((Number) AbstractC0825l.smaato(objArr8, c13645l8, (Function0) objM2132native, c6956l, i23)).longValue();
                    zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                    objM2132native2 = c6956l.m2132native();
                    if (zPurchase) {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    }
                    c6956l.startapp(false);
                    c17005l = (C17005l) objM2132native2;
                } else {
                    c6956l.m2123default(357055103);
                    c6956l.startapp(false);
                    c17005l = null;
                }
                InterfaceC16061l interfaceC16061l8 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                if (executor == null) {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                }
                if (c17005l == null) {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                } else {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                }
                C10327l c10327l8 = C10327l.billing;
                long j9 = c6956l.f14595continue;
                int i213 = (int) (j9 ^ (j9 >>> 32));
                InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                InterfaceC18556l interfaceC18556lSmaato8 = c6956l.smaato();
                InterfaceC8801l.firebase.getClass();
                function0 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c10327l8, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato8, C3438l.billing);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling8, C3438l.amazon);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i213), C3438l.isPro);
                c6956l.startapp(true);
                z3 = z4;
                i19 = i21;
                i18 = i22;
                function2 = function4;
            } else {
                c6956l.m2124else();
                i18 = i8;
                i19 = i13;
                z3 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj9, Object obj10) {
                        ((Integer) obj10).getClass();
                        AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj9, AbstractC0545l.purchase(i4 | 1), i5);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 3072;
        function2 = function1;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i4 & 24576) == 0) {
                i8 = i;
                if (c6956l.amazon(i8)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i6 |= i9;
            }
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    if (c6956l.mopub(z)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (c6956l.amazon(i2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i6 |= i24;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        i13 = i3;
                        if (c6956l.amazon(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                    i15 = i6 | 100663296;
                    i16 = i6;
                    if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        i15 = i16 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zAdmob = c6956l.billing(null);
                        } else {
                            zAdmob = c6956l.admob(null);
                        }
                        if (zAdmob) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i15 |= i17;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i15 & 1, z2)) {
                        if (i25 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i7 != 0) {
                            i20 = 1;
                        } else {
                            i20 = i8;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i13 = 1;
                        }
                        AbstractC17653l.purchase(i13, i2);
                        c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                        if (c11611l != null) {
                            c6956l.m2123default(356427477);
                            j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                            Object[] objArr9 = {c11611l};
                            C13645l c13645l9 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                            zAdmob2 = c6956l.admob(c11611l);
                            objM2132native = c6956l.m2132native();
                            Object obj9 = C1867l.yandex;
                            if (zAdmob2) {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            } else {
                                i23 = 0;
                                objM2132native = new C0661l(c11611l, i23);
                                c6956l.m2147try(objM2132native);
                            }
                            jLongValue = ((Number) AbstractC0825l.smaato(objArr9, c13645l9, (Function0) objM2132native, c6956l, i23)).longValue();
                            zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                            objM2132native2 = c6956l.m2132native();
                            if (zPurchase) {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C17005l(jLongValue, c11611l, j);
                                c6956l.m2147try(objM2132native2);
                            }
                            c6956l.startapp(false);
                            c17005l = (C17005l) objM2132native2;
                        } else {
                            c6956l.m2123default(357055103);
                            c6956l.startapp(false);
                            c17005l = null;
                        }
                        InterfaceC16061l interfaceC16061l9 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                        executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                        if (executor == null) {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        } else {
                            z5 = false;
                            c6956l.m2123default(-1248455541);
                            c6956l.startapp(false);
                        }
                        if (c17005l == null) {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        } else {
                            i21 = i13;
                            i22 = i20;
                            c6956l.m2123default(357432497);
                            function4 = function3;
                            interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                            c6956l.startapp(z5);
                        }
                        C10327l c10327l9 = C10327l.billing;
                        long j10 = c6956l.f14595continue;
                        int i214 = (int) (j10 ^ (j10 >>> 32));
                        InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                        InterfaceC18556l interfaceC18556lSmaato9 = c6956l.smaato();
                        InterfaceC8801l.firebase.getClass();
                        function0 = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(function0);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c10327l9, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato9, C3438l.billing);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling9, C3438l.amazon);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i214), C3438l.isPro);
                        c6956l.startapp(true);
                        z3 = z4;
                        i19 = i21;
                        i18 = i22;
                        function2 = function4;
                    } else {
                        c6956l.m2124else();
                        i18 = i8;
                        i19 = i13;
                        z3 = z;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj10, Object obj11) {
                                ((Integer) obj11).getClass();
                                AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj10, AbstractC0545l.purchase(i4 | 1), i5);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i13 = i3;
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr10 = {c11611l};
                        C13645l c13645l10 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj10 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr10, c13645l10, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l10 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l10 = C10327l.billing;
                    long j11 = c6956l.f14595continue;
                    int i215 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling10 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato10 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l10, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato10, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling10, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i215), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            ((Integer) obj12).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj11, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            if ((1572864 & i4) == 0) {
                if (c6956l.amazon(i2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i6 |= i24;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    i13 = i3;
                    if (c6956l.amazon(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr11 = {c11611l};
                        C13645l c13645l11 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj11 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr11, c13645l11, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l11 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l11 = C10327l.billing;
                    long j12 = c6956l.f14595continue;
                    int i216 = (int) (j12 ^ (j12 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling11 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato11 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l11, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato11, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling11, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i216), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj12, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i13 = i3;
            i15 = i6 | 100663296;
            i16 = i6;
            if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                i15 = i16 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zAdmob = c6956l.billing(null);
                } else {
                    zAdmob = c6956l.admob(null);
                }
                if (zAdmob) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i15 |= i17;
            }
            if ((i15 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i15 & 1, z2)) {
                if (i25 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i7 != 0) {
                    i20 = 1;
                } else {
                    i20 = i8;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i13 = 1;
                }
                AbstractC17653l.purchase(i13, i2);
                c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                if (c11611l != null) {
                    c6956l.m2123default(356427477);
                    j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                    Object[] objArr12 = {c11611l};
                    C13645l c13645l12 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                    zAdmob2 = c6956l.admob(c11611l);
                    objM2132native = c6956l.m2132native();
                    Object obj12 = C1867l.yandex;
                    if (zAdmob2) {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    } else {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    }
                    jLongValue = ((Number) AbstractC0825l.smaato(objArr12, c13645l12, (Function0) objM2132native, c6956l, i23)).longValue();
                    zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                    objM2132native2 = c6956l.m2132native();
                    if (zPurchase) {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    }
                    c6956l.startapp(false);
                    c17005l = (C17005l) objM2132native2;
                } else {
                    c6956l.m2123default(357055103);
                    c6956l.startapp(false);
                    c17005l = null;
                }
                InterfaceC16061l interfaceC16061l12 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                if (executor == null) {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                }
                if (c17005l == null) {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                } else {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                }
                C10327l c10327l12 = C10327l.billing;
                long j13 = c6956l.f14595continue;
                int i217 = (int) (j13 ^ (j13 >>> 32));
                InterfaceC17242l interfaceC17242lBilling12 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                InterfaceC18556l interfaceC18556lSmaato12 = c6956l.smaato();
                InterfaceC8801l.firebase.getClass();
                function0 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c10327l12, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato12, C3438l.billing);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling12, C3438l.amazon);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i217), C3438l.isPro);
                c6956l.startapp(true);
                z3 = z4;
                i19 = i21;
                i18 = i22;
                function2 = function4;
            } else {
                c6956l.m2124else();
                i18 = i8;
                i19 = i13;
                z3 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj13, Object obj14) {
                        ((Integer) obj14).getClass();
                        AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj13, AbstractC0545l.purchase(i4 | 1), i5);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 24576;
        i8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
            if ((196608 & i4) == 0) {
                if (c6956l.mopub(z)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i6 |= i11;
            }
            if ((1572864 & i4) == 0) {
                if (c6956l.amazon(i2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i6 |= i24;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    i13 = i3;
                    if (c6956l.amazon(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
                i15 = i6 | 100663296;
                i16 = i6;
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i15 = i16 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zAdmob = c6956l.billing(null);
                    } else {
                        zAdmob = c6956l.admob(null);
                    }
                    if (zAdmob) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
                if ((i15 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i15 & 1, z2)) {
                    if (i25 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i7 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i8;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    AbstractC17653l.purchase(i13, i2);
                    c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                    if (c11611l != null) {
                        c6956l.m2123default(356427477);
                        j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                        Object[] objArr13 = {c11611l};
                        C13645l c13645l13 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                        zAdmob2 = c6956l.admob(c11611l);
                        objM2132native = c6956l.m2132native();
                        Object obj13 = C1867l.yandex;
                        if (zAdmob2) {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        } else {
                            i23 = 0;
                            objM2132native = new C0661l(c11611l, i23);
                            c6956l.m2147try(objM2132native);
                        }
                        jLongValue = ((Number) AbstractC0825l.smaato(objArr13, c13645l13, (Function0) objM2132native, c6956l, i23)).longValue();
                        zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                        objM2132native2 = c6956l.m2132native();
                        if (zPurchase) {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C17005l(jLongValue, c11611l, j);
                            c6956l.m2147try(objM2132native2);
                        }
                        c6956l.startapp(false);
                        c17005l = (C17005l) objM2132native2;
                    } else {
                        c6956l.m2123default(357055103);
                        c6956l.startapp(false);
                        c17005l = null;
                    }
                    InterfaceC16061l interfaceC16061l13 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                    executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                    if (executor == null) {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    } else {
                        z5 = false;
                        c6956l.m2123default(-1248455541);
                        c6956l.startapp(false);
                    }
                    if (c17005l == null) {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    } else {
                        i21 = i13;
                        i22 = i20;
                        c6956l.m2123default(357432497);
                        function4 = function3;
                        interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                        c6956l.startapp(z5);
                    }
                    C10327l c10327l13 = C10327l.billing;
                    long j14 = c6956l.f14595continue;
                    int i218 = (int) (j14 ^ (j14 >>> 32));
                    InterfaceC17242l interfaceC17242lBilling13 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC18556l interfaceC18556lSmaato13 = c6956l.smaato();
                    InterfaceC8801l.firebase.getClass();
                    function0 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c10327l13, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato13, C3438l.billing);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling13, C3438l.amazon);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i218), C3438l.isPro);
                    c6956l.startapp(true);
                    z3 = z4;
                    i19 = i21;
                    i18 = i22;
                    function2 = function4;
                } else {
                    c6956l.m2124else();
                    i18 = i8;
                    i19 = i13;
                    z3 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj14, Object obj15) {
                            ((Integer) obj15).getClass();
                            AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj14, AbstractC0545l.purchase(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i13 = i3;
            i15 = i6 | 100663296;
            i16 = i6;
            if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                i15 = i16 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zAdmob = c6956l.billing(null);
                } else {
                    zAdmob = c6956l.admob(null);
                }
                if (zAdmob) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i15 |= i17;
            }
            if ((i15 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i15 & 1, z2)) {
                if (i25 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i7 != 0) {
                    i20 = 1;
                } else {
                    i20 = i8;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i13 = 1;
                }
                AbstractC17653l.purchase(i13, i2);
                c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                if (c11611l != null) {
                    c6956l.m2123default(356427477);
                    j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                    Object[] objArr14 = {c11611l};
                    C13645l c13645l14 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                    zAdmob2 = c6956l.admob(c11611l);
                    objM2132native = c6956l.m2132native();
                    Object obj14 = C1867l.yandex;
                    if (zAdmob2) {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    } else {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    }
                    jLongValue = ((Number) AbstractC0825l.smaato(objArr14, c13645l14, (Function0) objM2132native, c6956l, i23)).longValue();
                    zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                    objM2132native2 = c6956l.m2132native();
                    if (zPurchase) {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    }
                    c6956l.startapp(false);
                    c17005l = (C17005l) objM2132native2;
                } else {
                    c6956l.m2123default(357055103);
                    c6956l.startapp(false);
                    c17005l = null;
                }
                InterfaceC16061l interfaceC16061l14 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                if (executor == null) {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                }
                if (c17005l == null) {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                } else {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                }
                C10327l c10327l14 = C10327l.billing;
                long j15 = c6956l.f14595continue;
                int i219 = (int) (j15 ^ (j15 >>> 32));
                InterfaceC17242l interfaceC17242lBilling14 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                InterfaceC18556l interfaceC18556lSmaato14 = c6956l.smaato();
                InterfaceC8801l.firebase.getClass();
                function0 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c10327l14, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato14, C3438l.billing);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling14, C3438l.amazon);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i219), C3438l.isPro);
                c6956l.startapp(true);
                z3 = z4;
                i19 = i21;
                i18 = i22;
                function2 = function4;
            } else {
                c6956l.m2124else();
                i18 = i8;
                i19 = i13;
                z3 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj15, Object obj16) {
                        ((Integer) obj16).getClass();
                        AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj15, AbstractC0545l.purchase(i4 | 1), i5);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 196608;
        if ((1572864 & i4) == 0) {
            if (c6956l.amazon(i2)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i6 |= i24;
        }
        i12 = i5 & 128;
        if (i12 != 0) {
            if ((12582912 & i4) == 0) {
                i13 = i3;
                if (c6956l.amazon(i13)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i6 |= i14;
            }
            i15 = i6 | 100663296;
            i16 = i6;
            if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                i15 = i16 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zAdmob = c6956l.billing(null);
                } else {
                    zAdmob = c6956l.admob(null);
                }
                if (zAdmob) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i15 |= i17;
            }
            if ((i15 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i15 & 1, z2)) {
                if (i25 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i7 != 0) {
                    i20 = 1;
                } else {
                    i20 = i8;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i13 = 1;
                }
                AbstractC17653l.purchase(i13, i2);
                c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
                if (c11611l != null) {
                    c6956l.m2123default(356427477);
                    j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                    Object[] objArr15 = {c11611l};
                    C13645l c13645l15 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                    zAdmob2 = c6956l.admob(c11611l);
                    objM2132native = c6956l.m2132native();
                    Object obj15 = C1867l.yandex;
                    if (zAdmob2) {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    } else {
                        i23 = 0;
                        objM2132native = new C0661l(c11611l, i23);
                        c6956l.m2147try(objM2132native);
                    }
                    jLongValue = ((Number) AbstractC0825l.smaato(objArr15, c13645l15, (Function0) objM2132native, c6956l, i23)).longValue();
                    zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                    objM2132native2 = c6956l.m2132native();
                    if (zPurchase) {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C17005l(jLongValue, c11611l, j);
                        c6956l.m2147try(objM2132native2);
                    }
                    c6956l.startapp(false);
                    c17005l = (C17005l) objM2132native2;
                } else {
                    c6956l.m2123default(357055103);
                    c6956l.startapp(false);
                    c17005l = null;
                }
                InterfaceC16061l interfaceC16061l15 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
                executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
                if (executor == null) {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    c6956l.m2123default(-1248455541);
                    c6956l.startapp(false);
                }
                if (c17005l == null) {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                } else {
                    i21 = i13;
                    i22 = i20;
                    c6956l.m2123default(357432497);
                    function4 = function3;
                    interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                    c6956l.startapp(z5);
                }
                C10327l c10327l15 = C10327l.billing;
                long j16 = c6956l.f14595continue;
                int i2110 = (int) (j16 ^ (j16 >>> 32));
                InterfaceC17242l interfaceC17242lBilling15 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                InterfaceC18556l interfaceC18556lSmaato15 = c6956l.smaato();
                InterfaceC8801l.firebase.getClass();
                function0 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c10327l15, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato15, C3438l.billing);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling15, C3438l.amazon);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i2110), C3438l.isPro);
                c6956l.startapp(true);
                z3 = z4;
                i19 = i21;
                i18 = i22;
                function2 = function4;
            } else {
                c6956l.m2124else();
                i18 = i8;
                i19 = i13;
                z3 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj16, AbstractC0545l.purchase(i4 | 1), i5);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 12582912;
        i13 = i3;
        i15 = i6 | 100663296;
        i16 = i6;
        if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            i15 = i16 | 905969664;
        } else if ((i4 & 805306368) == 0) {
            if ((i4 & 1073741824) == 0) {
                zAdmob = c6956l.billing(null);
            } else {
                zAdmob = c6956l.admob(null);
            }
            if (zAdmob) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i15 |= i17;
        }
        if ((i15 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i15 & 1, z2)) {
            if (i25 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (i7 != 0) {
                i20 = 1;
            } else {
                i20 = i8;
            }
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i12 != 0) {
                i13 = 1;
            }
            AbstractC17653l.purchase(i13, i2);
            c11611l = (C11611l) c6956l.isPro(AbstractC8548l.yandex);
            if (c11611l != null) {
                c6956l.m2123default(356427477);
                j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd;
                Object[] objArr16 = {c11611l};
                C13645l c13645l16 = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                zAdmob2 = c6956l.admob(c11611l);
                objM2132native = c6956l.m2132native();
                Object obj16 = C1867l.yandex;
                if (zAdmob2) {
                    i23 = 0;
                    objM2132native = new C0661l(c11611l, i23);
                    c6956l.m2147try(objM2132native);
                } else {
                    i23 = 0;
                    objM2132native = new C0661l(c11611l, i23);
                    c6956l.m2147try(objM2132native);
                }
                jLongValue = ((Number) AbstractC0825l.smaato(objArr16, c13645l16, (Function0) objM2132native, c6956l, i23)).longValue();
                zPurchase = c6956l.purchase(jLongValue) | c6956l.billing(c11611l) | c6956l.purchase(j);
                objM2132native2 = c6956l.m2132native();
                if (zPurchase) {
                    objM2132native2 = new C17005l(jLongValue, c11611l, j);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C17005l(jLongValue, c11611l, j);
                    c6956l.m2147try(objM2132native2);
                }
                c6956l.startapp(false);
                c17005l = (C17005l) objM2132native2;
            } else {
                c6956l.m2123default(357055103);
                c6956l.startapp(false);
                c17005l = null;
            }
            InterfaceC16061l interfaceC16061l16 = (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase);
            executor = (Executor) c6956l.isPro(AbstractC5312l.yandex);
            if (executor == null) {
                z5 = false;
                c6956l.m2123default(-1248455541);
                c6956l.startapp(false);
            } else {
                z5 = false;
                c6956l.m2123default(-1248455541);
                c6956l.startapp(false);
            }
            if (c17005l == null) {
                i21 = i13;
                i22 = i20;
                c6956l.m2123default(357432497);
                function4 = function3;
                interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                c6956l.startapp(z5);
            } else {
                i21 = i13;
                i22 = i20;
                c6956l.m2123default(357432497);
                function4 = function3;
                interfaceC17242lSmaato = smaato(interfaceC17242l, new C3625l(str), c11090l, function4, i22, z4, i2, i21, (InterfaceC16061l) c6956l.isPro(AbstractC4751l.firebase), null, null, c17005l, null);
                c6956l.startapp(z5);
            }
            C10327l c10327l16 = C10327l.billing;
            long j17 = c6956l.f14595continue;
            int i2111 = (int) (j17 ^ (j17 >>> 32));
            InterfaceC17242l interfaceC17242lBilling16 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
            InterfaceC18556l interfaceC18556lSmaato16 = c6956l.smaato();
            InterfaceC8801l.firebase.getClass();
            function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c10327l16, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato16, C3438l.billing);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling16, C3438l.amazon);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i2111), C3438l.isPro);
            c6956l.startapp(true);
            z3 = z4;
            i19 = i21;
            i18 = i22;
            function2 = function4;
        } else {
            c6956l.m2124else();
            i18 = i8;
            i19 = i13;
            z3 = z;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُۖۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj17, Object obj18) {
                    ((Integer) obj18).getClass();
                    AbstractC17307l.loadAd(str, interfaceC17242l, c11090l, function2, i18, z3, i2, i19, (C6956l) obj17, AbstractC0545l.purchase(i4 | 1), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ArrayList mopub(List list, Function0 function0) {
        C5601l c5601l;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i2);
            C15263l c15263l = ((C13336l) interfaceC6357l.Signature()).f26179l;
            C4487l c4487l = (C4487l) c15263l.f29858l;
            C15012l c15012l = (C15012l) c15263l.f29857l;
            C0327l c0327l = (C0327l) c4487l.yandex.getValue();
            int i3 = 9;
            if (c0327l == null) {
                c5601l = new C5601l(new C1712l(8), i, i, i3);
            } else {
                C15012l c15012lCrashlytics = C4487l.crashlytics(c15012l, c0327l);
                if (c15012lCrashlytics == null) {
                    c5601l = new C5601l(new C1712l(i3), i, i, i3);
                } else {
                    C16918l c16918lSubs = AbstractC14231l.subs(c0327l.firebase(c15012lCrashlytics.loadAd, c15012lCrashlytics.crashlytics).amazon());
                    c5601l = new C5601l(new C5767l(25, c16918lSubs), c16918lSubs.amazon(), c16918lSubs.loadAd(), i3);
                }
            }
            int i4 = c5601l.f11897l;
            int i5 = c5601l.f11896l;
            arrayList.add(new C8195l(interfaceC6357l.adcel(AbstractC13628l.billing(i4, i4, i5, i5)), (Function0) c5601l.f11899l));
        }
        return arrayList;
    }

    public static float purchase(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final C14218l remoteconfig(float f) {
        return new C14218l(2, f);
    }

    public static final InterfaceC17242l smaato(InterfaceC17242l interfaceC17242l, C3625l c3625l, C11090l c11090l, Function1 function1, int i, boolean z, int i2, int i3, InterfaceC16061l interfaceC16061l, List list, Function1 function2, C17005l c17005l, Function1 function3) {
        if (c17005l == null) {
            return interfaceC17242l.premium(C4346l.f8873l).premium(new C2423l(c3625l, c11090l, interfaceC16061l, function1, i, z, i2, i3, list, function2, function3));
        }
        return interfaceC17242l.premium(c17005l.f33135l).premium(new C9972l(c3625l, c11090l, interfaceC16061l, function1, i, z, i2, i3, list, function2, c17005l));
    }

    public static int subs(int i, float f, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fCrashlytics = crashlytics(((i >> 16) & 255) / 255.0f);
        float fCrashlytics2 = crashlytics(((i >> 8) & 255) / 255.0f);
        float fCrashlytics3 = crashlytics((i & 255) / 255.0f);
        float fCrashlytics4 = crashlytics(((i2 >> 16) & 255) / 255.0f);
        float fCrashlytics5 = crashlytics(((i2 >> 8) & 255) / 255.0f);
        float fCrashlytics6 = crashlytics((i2 & 255) / 255.0f);
        float fSignature = AbstractC4338l.Signature(f3, f2, f, f2);
        float fSignature2 = AbstractC4338l.Signature(fCrashlytics4, fCrashlytics, f, fCrashlytics);
        float fSignature3 = AbstractC4338l.Signature(fCrashlytics5, fCrashlytics2, f, fCrashlytics2);
        float fSignature4 = AbstractC4338l.Signature(fCrashlytics6, fCrashlytics3, f, fCrashlytics3);
        float fPurchase = purchase(fSignature2) * 255.0f;
        float fPurchase2 = purchase(fSignature3) * 255.0f;
        return Math.round(purchase(fSignature4) * 255.0f) | (Math.round(fPurchase) << 16) | (Math.round(fSignature * 255.0f) << 24) | (Math.round(fPurchase2) << 8);
    }

    public static final void yandex(final C3625l c3625l, final InterfaceC17242l interfaceC17242l, final C11090l c11090l, final Function1 function1, final int i, final boolean z, final int i2, final int i3, final Map map, C6956l c6956l, final int i4, final int i5, final int i6) {
        int i7;
        boolean z2;
        int i8;
        C17005l c17005l;
        boolean z3;
        boolean z4;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1343466571);
        if ((i4 & 6) == 0) {
            i7 = (c6956l2.billing(c3625l) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= c6956l2.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= c6956l2.billing(c11090l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= c6956l2.admob(function1) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= c6956l2.amazon(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            z2 = z;
            i7 |= c6956l2.mopub(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i4) == 0) {
            i7 |= c6956l2.amazon(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i7 |= c6956l2.amazon(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i7 |= c6956l2.admob(map) ? 67108864 : 33554432;
        }
        int i9 = i7 | 805306368;
        if ((i6 & 1024) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = i5 | ((i5 & 8) == 0 ? c6956l2.billing(null) : c6956l2.admob(null) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if (c6956l2.m2127for(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            AbstractC17653l.purchase(i3, i2);
            C11611l c11611l = (C11611l) c6956l2.isPro(AbstractC8548l.yandex);
            C13863l c13863l = C1867l.yandex;
            if (c11611l != null) {
                c6956l2.m2123default(1588272647);
                long j = ((C8620l) c6956l2.isPro(AbstractC4524l.yandex)).loadAd;
                Object[] objArr = {c11611l};
                C13645l c13645l = new C13645l(new C15707l(7, c11611l), new C10351l(15), 13);
                boolean zAdmob = c6956l2.admob(c11611l);
                Object objM2132native = c6956l2.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new C0661l(c11611l, 1);
                    c6956l2.m2147try(objM2132native);
                }
                long jLongValue = ((Number) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l2, 0)).longValue();
                boolean zPurchase = c6956l2.purchase(jLongValue) | c6956l2.billing(c11611l) | c6956l2.purchase(j);
                Object objM2132native2 = c6956l2.m2132native();
                if (zPurchase || objM2132native2 == c13863l) {
                    objM2132native2 = new C17005l(jLongValue, c11611l, j);
                    c6956l2.m2147try(objM2132native2);
                }
                c6956l2.startapp(false);
                c17005l = (C17005l) objM2132native2;
            } else {
                c6956l2.m2123default(1588900273);
                c6956l2.startapp(false);
                c17005l = null;
            }
            C8195l c8195l = AbstractC8543l.yandex;
            int length = c3625l.f7563l.length();
            List list = c3625l.f7564l;
            if (list == null) {
                z3 = false;
                z4 = false;
                break;
            }
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z3 = false;
                    z4 = false;
                    break;
                }
                C15012l c15012l = (C15012l) list.get(i10);
                if ((c15012l.yandex instanceof C9891l) && "androidx.compose.foundation.text.inlineContent".equals(c15012l.amazon)) {
                    z3 = false;
                    if (AbstractC0255l.loadAd(0, length, c15012l.loadAd, c15012l.crashlytics)) {
                        z4 = true;
                        break;
                    }
                }
                i10++;
            }
            boolean zPurchase2 = AbstractC1213l.purchase(c3625l);
            InterfaceC16061l interfaceC16061l = (InterfaceC16061l) c6956l2.isPro(AbstractC4751l.firebase);
            if (z4 || zPurchase2) {
                boolean z5 = z3;
                C17005l c17005l2 = c17005l;
                c6956l2.m2123default(1590195670);
                boolean z6 = (i9 & 14) == 4 ? true : z5;
                Object objM2132native3 = c6956l2.m2132native();
                if (z6 || objM2132native3 == c13863l) {
                    objM2132native3 = AbstractC8020l.smaato(c3625l);
                    c6956l2.m2147try(objM2132native3);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native3;
                C3625l c3625l2 = (C3625l) interfaceC8714l.getValue();
                boolean zBilling = c6956l2.billing(interfaceC8714l);
                Object objM2132native4 = c6956l2.m2132native();
                if (zBilling || objM2132native4 == c13863l) {
                    objM2132native4 = new C9922l(interfaceC8714l, 10);
                    c6956l2.m2147try(objM2132native4);
                }
                int i11 = i9 << 6;
                amazon(interfaceC17242l, c3625l2, function1, z4, map, c11090l, i, z, i2, i3, interfaceC16061l, c17005l2, (Function1) objM2132native4, c6956l2, ((i9 >> 3) & 910) | ((i9 >> 12) & 57344) | ((i9 << 9) & 458752) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), ((i9 >> 21) & 896) | (57344 & (i8 << 12)));
                c6956l2 = c6956l2;
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(1589148149);
                AbstractC5312l.yandex(c3625l, c11090l, interfaceC16061l, null, z2, c6956l2);
                InterfaceC17242l interfaceC17242lSmaato = smaato(interfaceC17242l, c3625l, c11090l, function1, i, z, i2, i3, interfaceC16061l, null, null, c17005l, null);
                C10327l c10327l = C10327l.billing;
                long j2 = c6956l2.f14595continue;
                int i12 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, c10327l, C3438l.mopub);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i12), C3438l.isPro);
                c6956l2.startapp(true);
                c6956l2.startapp(false);
                c6956l2 = c6956l2;
            }
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍٔٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC17307l.yandex(c3625l, interfaceC17242l, c11090l, function1, i, z, i2, i3, map, (C6956l) obj, AbstractC0545l.purchase(i4 | 1), AbstractC0545l.purchase(i5), i6);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
