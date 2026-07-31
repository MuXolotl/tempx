package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0555l {
    public static String amazon(String str) {
        Object obj = null;
        if (str != null) {
            return new C7847l(str, obj).loadAd();
        }
        C8339l.metrica("applicationId cannot be null");
        return null;
    }

    public static final C8108l billing(Iterable iterable) {
        Object objPrevious;
        List listM4243this = AbstractC16901l.m4243this(iterable, new C15696l(25));
        ListIterator listIterator = listM4243this.listIterator(listM4243this.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            C17838l c17838l = ((C8108l) objPrevious).crashlytics;
            InterfaceC13922l interfaceC13922l = C8108l.admob[0];
            if (((Boolean) c17838l.yandex).booleanValue()) {
                return (C8108l) objPrevious;
            }
        }
        objPrevious = null;
        return (C8108l) objPrevious;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void crashlytics(InterfaceC17242l interfaceC17242l, float f, long j, C6956l c6956l, int i, int i2) {
        float f2;
        long jPurchase;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        InterfaceC17242l interfaceC17242l2;
        float f3;
        long j2;
        C4224l c4224lAds;
        float f4;
        int i6;
        InterfaceC17242l interfaceC17242l3;
        boolean z3;
        boolean z4;
        Object objM2132native;
        c6956l.m2133new(-1534852205);
        int i7 = i | 6;
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i7 |= c6956l.crashlytics(f2) ? 32 : 16;
            }
            jPurchase = j;
            if ((i2 & 4) == 0 || !c6956l.purchase(jPurchase)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i4 = i7 | i3;
            i5 = 0;
            z = true;
            if ((i4 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i4 & 1, z2)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    i6 = i2 & 4;
                    interfaceC17242l3 = C4346l.f8873l;
                    if (i6 != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 25);
                        i4 &= -897;
                    }
                } else {
                    c6956l.m2124else();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    interfaceC17242l3 = interfaceC17242l;
                    f4 = f2;
                }
                c6956l.adcel();
                InterfaceC17242l interfaceC17242lVip = AbstractC0080l.vip(interfaceC17242l3.premium(AbstractC0080l.loadAd), f4);
                if ((i4 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((((i4 & 896) ^ 384) > 256 || !c6956l.purchase(jPurchase)) && (i4 & 384) != 256) {
                }
                z4 = z3 | z;
                objM2132native = c6956l.m2132native();
                if (z4 || objM2132native == C1867l.yandex) {
                    objM2132native = new C2710l(f4, i5, jPurchase);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC12155l.yandex(interfaceC17242lVip, (Function1) objM2132native, c6956l, 0);
                f3 = f4;
                interfaceC17242l2 = interfaceC17242l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                f3 = f2;
            }
            j2 = jPurchase;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C15225l(interfaceC17242l2, f3, j2, i, i2, 0);
            }
        }
        i7 = i | 54;
        f2 = f;
        jPurchase = j;
        if ((i2 & 4) == 0) {
            i3 = 128;
        } else {
            i3 = 128;
        }
        i4 = i7 | i3;
        i5 = 0;
        z = true;
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i4 & 1, z2)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                i6 = i2 & 4;
                interfaceC17242l3 = C4346l.f8873l;
                if (i6 != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 25);
                    i4 &= -897;
                }
            } else {
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                i6 = i2 & 4;
                interfaceC17242l3 = C4346l.f8873l;
                if (i6 != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 25);
                    i4 &= -897;
                }
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lVip2 = AbstractC0080l.vip(interfaceC17242l3.premium(AbstractC0080l.loadAd), f4);
            if ((i4 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z = ((i4 & 896) ^ 384) > 256 ? false : false;
            z4 = z3 | z;
            objM2132native = c6956l.m2132native();
            if (z4) {
                objM2132native = new C2710l(f4, i5, jPurchase);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C2710l(f4, i5, jPurchase);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12155l.yandex(interfaceC17242lVip2, (Function1) objM2132native, c6956l, 0);
            f3 = f4;
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            f3 = f2;
        }
        j2 = jPurchase;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15225l(interfaceC17242l2, f3, j2, i, i2, 0);
        }
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, float f, long j, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        float f2;
        InterfaceC17242l interfaceC17242l3;
        InterfaceC17242l interfaceC17242l4;
        float f3;
        c6956l.m2133new(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i | (c6956l.billing(interfaceC17242l2) ? 4 : 2);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        long jPurchase = j;
        int i5 = i3 | 48 | (((i2 & 4) == 0 && c6956l.purchase(jPurchase)) ? 256 : 128);
        int i6 = 1;
        if (c6956l.m2127for(i5 & 1, (i5 & 147) != 146)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                interfaceC17242l4 = i4 != 0 ? C4346l.f8873l : interfaceC17242l2;
                if ((i2 & 4) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 25);
                    i5 &= -897;
                }
                f3 = 1.0f;
            } else {
                c6956l.m2124else();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
                interfaceC17242l4 = interfaceC17242l2;
                f3 = f;
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.amazon(interfaceC17242l4, 1.0f), f3);
            boolean z = (((i5 & 896) ^ 384) > 256 && c6956l.purchase(jPurchase)) || (i5 & 384) == 256;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C2710l(f3, i6, jPurchase);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12155l.yandex(interfaceC17242lPurchase, (Function1) objM2132native, c6956l, 0);
            interfaceC17242l3 = interfaceC17242l4;
            f2 = f3;
        } else {
            c6956l.m2124else();
            f2 = f;
            interfaceC17242l3 = interfaceC17242l2;
        }
        long j2 = jPurchase;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15225l(interfaceC17242l3, f2, j2, i, i2, 1);
        }
    }

    public static SharedPreferences mopub(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static long purchase(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v8, types: [lٗٛٗ] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v5, types: [lٌؖۘ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٗٛٗ] */
    public static final void yandex(InterfaceC17242l interfaceC17242l, float f, long j, C6956l c6956l, final int i, final int i2) {
        long jPurchase;
        int i3;
        boolean z;
        ?? r14;
        final ?? r8;
        final float f2;
        final long j2;
        C4224l c4224lAds;
        int i4;
        ?? r15;
        float fLoadAd;
        c6956l.m2133new(1562471785);
        int i5 = i | 54;
        if ((i2 & 4) == 0) {
            jPurchase = j;
            int i6 = c6956l.purchase(jPurchase) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            i3 = i5 | i6;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    i4 = i2 & 4;
                    C4346l c4346l = C4346l.f8873l;
                    if (i4 != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 25);
                    }
                    f = 1.0f;
                    r15 = c4346l;
                } else {
                    c6956l.m2124else();
                    r15 = interfaceC17242l;
                }
                c6956l.adcel();
                if (C14467l.loadAd(f, 0.0f)) {
                    c6956l.m2123default(-1258401829);
                    fLoadAd = 1.0f / ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).loadAd();
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1258335272);
                    c6956l.startapp(false);
                    fLoadAd = f;
                }
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.amazon(r15, 1.0f), fLoadAd), jPurchase, AbstractC16837l.yandex), c6956l, 0);
                r14 = r15;
            } else {
                c6956l.m2124else();
                r14 = interfaceC17242l;
            }
            r8 = r14;
            f2 = f;
            j2 = jPurchase;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2(f2, j2, i, i2) { // from class: lْؔ۠

                    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                    public final /* synthetic */ long f25631l;

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ float f25632l;

                    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                    public final /* synthetic */ int f25634l;

                    {
                        this.f25634l = i2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(1);
                        AbstractC0555l.yandex(this.f25633l, this.f25632l, this.f25631l, (C6956l) obj, iPurchase, this.f25634l);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        jPurchase = j;
        i3 = i5 | i6;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                i4 = i2 & 4;
                C4346l c4346l2 = C4346l.f8873l;
                if (i4 != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 25);
                }
                f = 1.0f;
                r15 = c4346l2;
            } else {
                i4 = i2 & 4;
                C4346l c4346l3 = C4346l.f8873l;
                if (i4 != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 25);
                }
                f = 1.0f;
                r15 = c4346l3;
            }
            c6956l.adcel();
            if (C14467l.loadAd(f, 0.0f)) {
                c6956l.m2123default(-1258401829);
                fLoadAd = 1.0f / ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).loadAd();
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1258335272);
                c6956l.startapp(false);
                fLoadAd = f;
            }
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.amazon(r15, 1.0f), fLoadAd), jPurchase, AbstractC16837l.yandex), c6956l, 0);
            r14 = r15;
        } else {
            c6956l.m2124else();
            r14 = interfaceC17242l;
        }
        r8 = r14;
        f2 = f;
        j2 = jPurchase;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(f2, j2, i, i2) { // from class: lْؔ۠

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f25631l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ float f25632l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ int f25634l;

                {
                    this.f25634l = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC0555l.yandex(this.f25633l, this.f25632l, this.f25631l, (C6956l) obj, iPurchase, this.f25634l);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
