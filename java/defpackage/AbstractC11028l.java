package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11028l {
    public static final C15578l yandex = new C15578l(112755414, false, new C10272l(28));
    public static final C15578l loadAd = new C15578l(-1658786954, false, new C10272l(29));
    public static final C15578l crashlytics = new C15578l(-1422782481, false, new C13982l(0));
    public static final C15578l amazon = new C15578l(-163961305, false, new C13982l(1));
    public static final C15578l purchase = new C15578l(1584452801, false, new C1104l(18));
    public static final C15578l billing = new C15578l(924848592, false, new C1104l(19));

    public static final void admob(C15578l c15578l, Function2 function2, boolean z, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(150349467);
        int i2 = i | (c6956l.mopub(z) ? 256 : 128) | (c6956l.admob(function1) ? 2048 : 1024);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C1926l(i4, function1, z);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(c15578l, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, function2, null, AbstractC14566l.amazon(-564375362, new C4571l(i3, function1, z), c6956l), null, c6956l, 199686, 468);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(c15578l, function2, z, function1, i);
        }
    }

    public static final float amazon(float f) {
        return 1.0f - ((Number) AbstractC8576l.admob(Float.valueOf(((((Number) AbstractC8576l.admob(Float.valueOf(f), new C12015l(-12.0f, 12.0f))).floatValue() / 12.0f) + 1.0f) / 2.0f), new C12015l(0.0f, 1.0f))).floatValue();
    }

    public static final void billing(C6956l c6956l, int i) {
        c6956l.m2133new(394881784);
        int i2 = 0;
        if (c6956l.m2127for(i & 1, i != 0)) {
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(context);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C3392l(context, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.loadAd(unit, (Function1) objM2132native, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3755l(i, i2);
        }
    }

    public static final void crashlytics(final List list, final long j, final long j2, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        c6956l.m2133new(747321670);
        int i2 = i | (c6956l.admob(list) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16) | (c6956l.purchase(j2) ? 256 : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            final long j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.f2317synchronized;
            boolean zPurchase = ((i2 & 112) == 32) | c6956l.purchase(j3) | c6956l.admob(list) | ((i2 & 896) == 256);
            Object objM2132native = c6956l.m2132native();
            if (zPurchase || objM2132native == C1867l.yandex) {
                Function1 function1 = new Function1() { // from class: lٕٖؓ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C9902l c9902l;
                        C3366l c3366l = (C3366l) obj;
                        final float fLoadAd = c3366l.loadAd() * 1.5f;
                        final long j4 = j;
                        final C6906l c6906lLicense = C1083l.license(AbstractC14055l.remoteconfig(new C9735l(C9735l.loadAd(0.5f, j4)), new C9735l(j3)), 0.0f, 0.0f, 14);
                        final C9902l c9902lYandex = AbstractC3478l.yandex();
                        C9902l c9902lYandex2 = AbstractC3478l.yandex();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32));
                        List list2 = list;
                        float size = fIntBitsToFloat / (list2.size() - 1);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(AbstractC11028l.amazon(((Number) list2.get(0)).floatValue()) * Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)))) & 4294967295L);
                        int i3 = (int) (jFloatToRawIntBits >> 32);
                        c9902lYandex.billing(Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)));
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                        int i4 = (int) (jFloatToRawIntBits & 4294967295L);
                        c9902lYandex.purchase(fIntBitsToFloat2, Float.intBitsToFloat(i4));
                        c9902lYandex2.billing(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                        int iSmaato = AbstractC14055l.smaato(list2);
                        int i5 = 1;
                        if (1 <= iSmaato) {
                            while (true) {
                                long j5 = jFloatToRawIntBits;
                                AbstractC11028l.purchase(c9902lYandex, j5, size, Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)), ((Number) list2.get(i5)).floatValue());
                                float f = size;
                                c9902l = c9902lYandex2;
                                jFloatToRawIntBits = AbstractC11028l.purchase(c9902l, j5, f, Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)), ((Number) list2.get(i5)).floatValue());
                                size = f;
                                if (i5 == iSmaato) {
                                    break;
                                }
                                i5++;
                                c9902lYandex2 = c9902l;
                            }
                        } else {
                            c9902l = c9902lYandex2;
                        }
                        c9902lYandex.purchase(Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32)), Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)));
                        final long j6 = j2;
                        final C9902l c9902l2 = c9902l;
                        return c3366l.yandex(new C4693l(0, new Function1() { // from class: lؒۛؔ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / 2.0f;
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / 2.0f;
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat5)));
                                long j7 = j6;
                                float f2 = fLoadAd;
                                interfaceC13349l.mo2074volatile(j7, jFloatToRawIntBits2, jFloatToRawIntBits3, f2, (496 & 16) != 0 ? 0 : 0);
                                AbstractC9361l.remoteconfig(interfaceC13349l, c9902l2, j4, 0.0f, new C0404l(f2, 0.0f, 0, 0, null, 30), 52);
                                AbstractC9361l.smaato(interfaceC13349l, c9902lYandex, c6906lLicense, 0.0f, null, null, 60);
                                return Unit.INSTANCE;
                            }
                        }));
                    }
                };
                c6956l.m2147try(function1);
                objM2132native = function1;
            }
            AbstractC9334l.yandex(c6956l, AbstractC14289l.firebase(interfaceC17242l, (Function1) objM2132native));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(list, j, j2, interfaceC17242l, i) { // from class: lَۣۚ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f21470l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ long f21471l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ List f21472l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f21473l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC11028l.crashlytics(this.f21472l, this.f21471l, this.f21470l, this.f21473l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static boolean firebase(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final Activity isPro(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return isPro(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final void loadAd(C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1136490665);
        if ((i & 6) == 0) {
            i2 = (c6956l2.admob(c15578l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(c15578l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C10707l c10707l = AbstractC16964l.yandex;
            C11090l c11090l = new C11090l(((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, AbstractC7039l.isPro(14), null, null, 0L, 0L, 0, 0, 0L, 16777212);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3383l.yandex(AbstractC0080l.amazon(AbstractC0080l.purchase(C4346l.f8873l, 200.0f), 1.0f), ((C14370l) c6956l2.isPro(c10707l)).crashlytics.purchase, AbstractC13880l.yandex(((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l2, 0, 14), null, null, c15578l, c6956l, ((i3 << 15) & 458752) | 6, 24);
            c6956l2 = c6956l;
            AbstractC13010l.yandex(c11090l, c15578l2, c6956l2, i3 & 112);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(c15578l, (Object) c15578l2, (Object) interfaceC17242l, i, 13);
        }
    }

    public static final void mopub(String str, String str2, float f, Function1 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        float f2;
        String str3;
        String str4;
        InterfaceC17242l interfaceC17242l2;
        InterfaceC8714l interfaceC8714l;
        boolean z;
        C13863l c13863l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1284117108);
        int i2 = 2;
        int i3 = i | (c6956l2.billing(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= c6956l2.billing(str2) ? 32 : 16;
        }
        int i4 = i3 | (c6956l2.crashlytics(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.admob(function1) ? 2048 : 1024) | 24576;
        if (c6956l2.m2127for(i4 & 1, (i4 & 9363) != 9362)) {
            Object objM2132native = c6956l2.m2132native();
            int i5 = 6;
            C13863l c13863l2 = C1867l.yandex;
            if (objM2132native == c13863l2) {
                objM2132native = AbstractC8020l.smaato(new C0639l(0L, 6, String.valueOf(f)));
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l2) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native2;
            if (((Boolean) interfaceC8714l3.getValue()).booleanValue()) {
                c6956l2.m2123default(-140576172);
                Object objM2132native3 = c6956l2.m2132native();
                if (objM2132native3 == c13863l2) {
                    objM2132native3 = new C0289l(interfaceC8714l3, 11);
                    c6956l2.m2147try(objM2132native3);
                }
                c13863l = c13863l2;
                z = false;
                interfaceC8714l = interfaceC8714l3;
                AbstractC16291l.yandex((Function0) objM2132native3, AbstractC14566l.amazon(-838083641, new C12755l((Object) function1, (Object) interfaceC8714l3, (Object) interfaceC8714l2, 12), c6956l2), null, AbstractC14566l.amazon(2088423045, new C7605l(interfaceC8714l3, i2), c6956l2), null, AbstractC14566l.amazon(719962435, new C4210l(str, i5), c6956l2), AbstractC14566l.amazon(35732130, new C2104l(function1, interfaceC8714l2, interfaceC8714l3, str2, 3), c6956l2), null, 0L, 0L, 0L, 0L, null, c6956l, 1772598, 0, 16276);
                c6956l2 = c6956l;
            } else {
                interfaceC8714l = interfaceC8714l3;
                z = false;
                c13863l = c13863l2;
                c6956l2.m2123default(-143594642);
            }
            c6956l2.startapp(z);
            int i6 = AbstractC15548l.yandex;
            C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C0289l(interfaceC8714l, 9);
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native4, 15);
            str3 = str;
            str4 = str2;
            f2 = f;
            AbstractC13319l.yandex(AbstractC14566l.amazon(-272641326, new C4210l(str3, 7), c6956l), interfaceC17242lLoadAd, null, AbstractC14566l.amazon(-1419052139, new C11251l(str4, f2), c6956l), null, null, c15087lYandex, c6956l, 3078, 436);
            interfaceC17242l2 = c4346l;
        } else {
            f2 = f;
            str3 = str;
            str4 = str2;
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6960l(str3, str4, f2, function1, interfaceC17242l2, i);
        }
    }

    public static final long purchase(C9902l c9902l, long j, float f, float f2, float f3) {
        float fAmazon = amazon(f3) * f2;
        int i = (int) (j >> 32);
        float fIntBitsToFloat = (f / 2.0f) + Float.intBitsToFloat(i);
        c9902l.crashlytics(fIntBitsToFloat, Float.intBitsToFloat((int) (j & 4294967295L)), fIntBitsToFloat, fAmazon, Float.intBitsToFloat(i) + f, fAmazon);
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) + f)) << 32) | (((long) Float.floatToRawIntBits(fAmazon)) & 4294967295L);
    }

    public static String smaato(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbIsVip = AbstractC5020l.isVip("<", str2, " threw ");
                    sbIsVip.append(e.getClass().getName());
                    sbIsVip.append(">");
                    string = sbIsVip.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void subs(C6956l c6956l, int i) {
        c6956l.m2133new(193502176);
        int i2 = 1;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            boolean zAdmob = c6956l.admob(context);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C3392l(context, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.loadAd(1, (Function1) objM2132native, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3755l(i, i2);
        }
    }

    public static final void yandex(int i, C6956l c6956l, final boolean z) {
        Object obj;
        final long j;
        final long j2;
        Object obj2;
        Object obj3;
        c6956l.m2133new(-1560355159);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj4 = C1867l.yandex;
            if (objM2132native == obj4) {
                obj = objM2132native;
                float[] fArr = {0.5f, 0.2f, 0.3f, 0.2f, 0.5f};
                c6956l.m2147try(fArr);
                obj = fArr;
            }
            obj = objM2132native;
            final float[] fArr2 = (float[]) obj;
            Object objM2132native2 = c6956l.m2132native();
            Object obj5 = objM2132native2;
            if (objM2132native2 == obj4) {
                Object obj6 = z ? new float[]{0.75f, 0.4f, 0.4f, 0.4f, 0.75f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                c6956l.m2147try(obj6);
                obj5 = obj6;
            }
            final float[] fArr3 = (float[]) obj5;
            AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
            long j3 = ((C14370l) c6956l.isPro(abstractC5189l)).yandex.startapp;
            final long j4 = ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel;
            long j5 = ((C14370l) c6956l.isPro(abstractC5189l)).yandex.yandex;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j6 = c6956l.f14595continue;
            int i2 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l.m2123default(625378035);
            final int i3 = 0;
            for (int length = fArr2.length; i3 < length; length = length) {
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC0080l.vip(AbstractC0080l.purchase(c4346l, 108.0f), 8.0f), AbstractC7497l.yandex);
                boolean zPurchase = c6956l.purchase(j3) | c6956l.purchase(j5) | c6956l.admob(fArr3) | c6956l.amazon(i3) | c6956l.purchase(j4) | c6956l.admob(fArr2);
                Object objM2132native3 = c6956l.m2132native();
                if (zPurchase || objM2132native3 == obj4) {
                    long j7 = j3;
                    j = j5;
                    j2 = j7;
                    obj3 = obj4;
                    obj2 = new Function1() { // from class: l٘ۙ۟
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj7;
                            AbstractC9361l.metrica(interfaceC13349l, j2, 0L, 0L, 0.0f, null, null, 0, 126);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                            float[] fArr4 = fArr3;
                            int i4 = i3;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((1.0f - fArr4[i4]) * fIntBitsToFloat)) & 4294967295L);
                            float fMo868instanceof = interfaceC13349l.mo868instanceof(28.0f);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMo868instanceof);
                            AbstractC9361l.adcel(interfaceC13349l, j, jFloatToRawIntBits, 0L, (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L) | (jFloatToRawIntBits2 << 32), null, 244);
                            boolean z2 = z;
                            long j8 = j4;
                            float[] fArr5 = fArr2;
                            if (z2) {
                                AbstractC9361l.metrica(interfaceC13349l, j8, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((1.0f - fArr5[i4]) * Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)))) & 4294967295L), 0L, 0.0f, null, null, 0, 124);
                            } else {
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((1.0f - fArr5[i4]) * Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)))) & 4294967295L);
                                float fMo868instanceof2 = interfaceC13349l.mo868instanceof(28.0f);
                                AbstractC9361l.adcel(interfaceC13349l, j8, jFloatToRawIntBits3, 0L, (((long) Float.floatToRawIntBits(fMo868instanceof2)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof2)) & 4294967295L), null, 244);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(obj2);
                } else {
                    obj3 = obj4;
                    long j8 = j5;
                    obj2 = objM2132native3;
                    j2 = j3;
                    j = j8;
                }
                AbstractC12155l.yandex(interfaceC17242lCrashlytics, (Function1) obj2, c6956l, 0);
                i3++;
                long j9 = j;
                j3 = j2;
                j5 = j9;
                obj4 = obj3;
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4584l(i, 5, z);
        }
    }
}
