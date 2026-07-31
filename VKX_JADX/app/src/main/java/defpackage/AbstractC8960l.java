package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.car.app.SessionInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8960l {
    public static final int[] yandex = {R.attr.colorPrimary};
    public static final int[] loadAd = {R.attr.colorPrimaryVariant};

    public static SessionInfo admob(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
            return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
        }
        C8339l.metrica("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        return null;
    }

    public static void amazon(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.applovin, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                billing(context, loadAd, "Theme.MaterialComponents");
            }
        }
        billing(context, yandex, "Theme.AppCompat");
    }

    public static void billing(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                C8339l.metrica(AbstractC15560l.Signature("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void crashlytics(final InterfaceC17242l interfaceC17242l, final long j, final long j2, final InterfaceC6347l interfaceC6347l, final List list, C6956l c6956l, final int i) {
        int i2;
        float f;
        c6956l.m2133new(-1776169461);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.purchase(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.purchase(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(list) ? 16384 : 8192;
        }
        if (!c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            c6956l.m2124else();
        } else {
            if (list.size() <= 1) {
                C8339l.metrica("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
            boolean zBilling = c6956l.billing(list);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zBilling || objM2132native == obj) {
                C10227l c10227lAdmob = AbstractC14055l.admob();
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    if (i4 < list.size()) {
                        c10227lAdmob.add(new C9783l(((C10282l) list.get(i3)).loadAd(), ((C10282l) list.get(i4)).loadAd()));
                    } else {
                        c10227lAdmob.add(new C9783l(((C10282l) list.get(i3)).loadAd(), ((C10282l) list.get(0)).loadAd()));
                    }
                    i3 = i4;
                }
                objM2132native = AbstractC14055l.purchase(c10227lAdmob);
                c6956l.m2147try(objM2132native);
            }
            final List list2 = (List) objM2132native;
            boolean zBilling2 = c6956l.billing(list);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling2 || objM2132native2 == obj) {
                float[] fArr = new float[4];
                int size2 = list.size();
                float fMin = 1.0f;
                int i5 = 0;
                f = 0.0f;
                while (i5 < size2) {
                    C10282l c10282l = (C10282l) list.get(i5);
                    int i6 = size2;
                    C10282l.yandex(c10282l, fArr, 2);
                    C10227l c10227l = c10282l.crashlytics;
                    float[] fArr2 = fArr;
                    long j3 = c10282l.loadAd;
                    int iPro = c10227l.pro();
                    float fMax = 0.0f;
                    int i7 = 0;
                    while (i7 < iPro) {
                        C10227l c10227l2 = c10227l;
                        C17841l c17841l = (C17841l) c10227l.get(i7);
                        int i8 = iPro;
                        float fMopub = c17841l.yandex[0] - AbstractC10433l.mopub(j3);
                        float fAdmob = c17841l.yandex[1] - AbstractC10433l.admob(j3);
                        float f2 = AbstractC12481l.loadAd;
                        int i9 = i7;
                        long jCrashlytics = c17841l.crashlytics(0.5f);
                        float fMopub2 = AbstractC10433l.mopub(jCrashlytics) - AbstractC10433l.mopub(j3);
                        float fAdmob2 = AbstractC10433l.admob(jCrashlytics) - AbstractC10433l.admob(j3);
                        fMax = Math.max(fMax, Math.max((fAdmob * fAdmob) + (fMopub * fMopub), (fAdmob2 * fAdmob2) + (fMopub2 * fMopub2)));
                        i7 = i9 + 1;
                        iPro = i8;
                        c10227l = c10227l2;
                    }
                    float fSqrt = (float) Math.sqrt(fMax);
                    float[] fArr3 = {AbstractC10433l.mopub(j3) - fSqrt, AbstractC10433l.admob(j3) - fSqrt, AbstractC10433l.mopub(j3) + fSqrt, AbstractC10433l.admob(j3) + fSqrt};
                    fMin = Math.min(fMin, Math.max((fArr2[2] - fArr2[0]) / (fArr3[2] - fArr3[0]), (fArr2[3] - fArr2[1]) / (fArr3[3] - fArr3[1])));
                    i5++;
                    size2 = i6;
                    fArr = fArr2;
                }
                objM2132native2 = Float.valueOf(fMin * AbstractC15854l.loadAd);
                c6956l.m2147try(objM2132native2);
            } else {
                f = 0.0f;
            }
            final float fFloatValue = ((Number) objM2132native2).floatValue();
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC6791l.yandex(f);
                c6956l.m2147try(objM2132native3);
            }
            final C5616l c5616l = (C5616l) objM2132native3;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj) {
                objM2132native4 = new C13765l(90.0f);
                c6956l.m2147try(objM2132native4);
            }
            final C13765l c13765l = (C13765l) objM2132native4;
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == obj) {
                objM2132native5 = AbstractC6791l.yandex(f);
                c6956l.m2147try(objM2132native5);
            }
            final C5616l c5616l2 = (C5616l) objM2132native5;
            boolean zBilling3 = c6956l.billing(list);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling3 || objM2132native6 == obj) {
                objM2132native6 = new C15308l(0);
                c6956l.m2147try(objM2132native6);
            }
            final C15308l c15308l = (C15308l) objM2132native6;
            boolean zAdmob = c6956l.admob(c5616l) | c6956l.billing(c15308l) | c6956l.admob(list2) | c6956l.admob(c5616l2);
            Object objM2132native7 = c6956l.m2132native();
            if (zAdmob || objM2132native7 == obj) {
                objM2132native7 = new C3792l(c5616l, list2, c15308l, c13765l, c5616l2, (InterfaceC14029l) null);
                c6956l.m2147try(objM2132native7);
            }
            AbstractC12311l.amazon(c6956l, list, (Function2) objM2132native7);
            Object objM2132native8 = c6956l.m2132native();
            if (objM2132native8 == obj) {
                objM2132native8 = AbstractC3478l.yandex();
                c6956l.m2147try(objM2132native8);
            }
            final C9902l c9902l = (C9902l) objM2132native8;
            Object objM2132native9 = c6956l.m2132native();
            if (objM2132native9 == obj) {
                Object c10924l = new C10924l(C10924l.yandex());
                c6956l.m2147try(c10924l);
                objM2132native9 = c10924l;
            }
            final float[] fArr4 = ((C10924l) objM2132native9).yandex;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC15185l.loadAd(interfaceC17242l);
            List list3 = AbstractC15854l.yandex;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.crashlytics(AbstractC0080l.firebase(interfaceC17242lLoadAd, 48.0f, 48.0f), 1.0f), interfaceC6347l), j, AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j4 = c6956l.f14595continue;
            int i10 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i10), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC17463l.loadAd(C4346l.f8873l, true);
            boolean zAdmob2 = c6956l.admob(c5616l) | c6956l.admob(c5616l2) | c6956l.admob(list2) | c6956l.billing(c15308l) | c6956l.admob(c9902l) | c6956l.crashlytics(fFloatValue) | c6956l.admob(fArr4) | ((i2 & 896) == 256);
            Object objM2132native10 = c6956l.m2132native();
            if (zAdmob2 || objM2132native10 == obj) {
                Object obj2 = new Function1() { // from class: lٌؚؗ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List list4 = list2;
                        C9902l c9902l2 = c9902l;
                        float f3 = fFloatValue;
                        float[] fArr5 = fArr4;
                        long j5 = j2;
                        C15308l c15308l2 = c15308l;
                        C6742l c6742l = (C6742l) obj3;
                        float fFloatValue2 = ((Number) c5616l.amazon()).floatValue();
                        float fAdmob3 = c13765l.admob();
                        float fFloatValue3 = ((Number) c5616l2.amazon()).floatValue() + fAdmob3 + (90.0f * fFloatValue2);
                        long jMo2070l = c6742l.f14144l.mo2070l();
                        C18449l c18449l = c6742l.f14144l.f26629l;
                        long jM4551private = c18449l.m4551private();
                        c18449l.m4555synchronized().mopub();
                        try {
                            ((C16543l) c18449l.f36010l).advert(fFloatValue3, jMo2070l);
                            AbstractC17716l.billing((C9783l) list4.get(c15308l2.admob()), fFloatValue2, c9902l2);
                            long jAdmob = c6742l.admob();
                            C10924l.amazon(fArr5);
                            C10924l.admob(fArr5, Float.intBitsToFloat((int) (jAdmob >> 32)) * f3, Float.intBitsToFloat((int) (4294967295L & jAdmob)) * f3, 4);
                            c9902l2.firebase(fArr5);
                            c9902l2.smaato(C1187l.admob(AbstractC8532l.mopub(jAdmob), c9902l2.amazon().billing()));
                            AbstractC9361l.remoteconfig(c6742l, c9902l2, j5, 0.0f, C5053l.yandex, 52);
                            return Unit.INSTANCE;
                        } finally {
                            AbstractC0653l.license(c18449l, jM4551private);
                        }
                    }
                };
                c6956l.m2147try(obj2);
                objM2132native10 = obj2;
            }
            AbstractC9334l.yandex(c6956l, AbstractC14289l.smaato(interfaceC17242lLoadAd2, (Function1) objM2132native10));
            c6956l.startapp(true);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٓٙۨ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    AbstractC8960l.crashlytics(interfaceC17242l, j, j2, interfaceC6347l, list, (C6956l) obj3, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static boolean isPro(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, long j, List list, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        long j2;
        List list2;
        c6956l.m2133new(387862047);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && c6956l.purchase(j)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                if (i4 != 0) {
                    interfaceC17242l = C4346l.f8873l;
                }
                if ((i2 & 2) != 0) {
                    List list3 = AbstractC15854l.yandex;
                    j = AbstractC15038l.purchase(c6956l, 26);
                    i3 &= -113;
                }
                list = AbstractC15854l.yandex;
            } else {
                c6956l.m2124else();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            int i5 = i3 & (-897);
            InterfaceC17242l interfaceC17242l3 = interfaceC17242l;
            long j3 = j;
            List list4 = list;
            c6956l.adcel();
            long j4 = C9735l.firebase;
            List list5 = AbstractC15854l.yandex;
            crashlytics(interfaceC17242l3, j4, j3, AbstractC2610l.loadAd(c6956l, 7), list4, c6956l, (i5 & 14) | 48 | ((i5 << 3) & 896));
            interfaceC17242l2 = interfaceC17242l3;
            j2 = j3;
            list2 = list4;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            j2 = j;
            list2 = list;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6013l(interfaceC17242l2, j2, list2, i, i2);
        }
    }

    public static C18673l mopub(String str, InterfaceC18477l interfaceC18477l, C7972l c7972l, Function1 function1, int i) {
        if ((i & 8) != 0) {
            function1 = new C4741l(4);
        }
        Function1 function2 = function1;
        C16552l c16552l = AbstractC11463l.yandex;
        return new C18673l(str, new C15053l(interfaceC18477l), c7972l, function2, AbstractC11990l.yandex(AbstractC10586l.billing(ExecutorC6708l.f14063l, AbstractC1295l.crashlytics())));
    }

    public static void purchase(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.applovin, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        C8339l.metrica("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static TypedArray subs(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        amazon(context, attributeSet, i, i2);
        purchase(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, long j, long j2, InterfaceC6347l interfaceC6347l, List list, C6956l c6956l, int i) {
        InterfaceC6347l interfaceC6347l2;
        List list2;
        InterfaceC6347l interfaceC6347lLoadAd;
        int i2;
        List list3;
        c6956l.m2133new(663218740);
        int i3 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16) | (c6956l.purchase(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 9216;
        if (c6956l.m2127for(i3 & 1, (i3 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                List list4 = AbstractC15854l.yandex;
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                i2 = i3 & (-64513);
                list3 = AbstractC15854l.yandex;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-64513);
                interfaceC6347lLoadAd = interfaceC6347l;
                list3 = list;
            }
            c6956l.adcel();
            InterfaceC6347l interfaceC6347l3 = interfaceC6347lLoadAd;
            crashlytics(interfaceC17242l, j, j2, interfaceC6347l3, list3, c6956l, i2 & 65534);
            interfaceC6347l2 = interfaceC6347l3;
            list2 = list3;
        } else {
            c6956l.m2124else();
            interfaceC6347l2 = interfaceC6347l;
            list2 = list;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16019l(interfaceC17242l, j, j2, interfaceC6347l2, list2, i);
        }
    }
}
