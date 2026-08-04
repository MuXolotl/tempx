package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؘۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6096l implements InterfaceC2165l, InterfaceC0208l, InterfaceC6642l, InterfaceC11989l, InterfaceC9765l, InterfaceC14257l, InterfaceC15241l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12883l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12879l = new C6096l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12876l = new C6096l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12881l = new C6096l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12880l = new C6096l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12882l = new C6096l(21);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12877l = new C6096l(22);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C6096l f12878l = new C6096l(23);

    public /* synthetic */ C6096l(int i) {
        this.f12883l = i;
    }

    public static void amazon(int i) {
        synchronized (UnmanagedSessionReceiver.yandex) {
            if (UnmanagedSessionReceiver.loadAd.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static void purchase(C0770l c0770l, Map.Entry entry) {
        AbstractC1552l abstractC1552l = (AbstractC1552l) entry.getKey();
        EnumC1865l enumC1865l = EnumC1865l.f4284l;
        abstractC1552l.getClass();
        throw null;
    }

    public static final float yandex(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x022d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0256  */
    /* JADX WARN: Code duplicated, block: B:161:0x0260  */
    /* JADX WARN: Code duplicated, block: B:164:0x026c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0284 A[LOOP:18: B:157:0x0254->B:168:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x0325  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:284:0x0281 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC15241l
    public int appmetrica(String str, String str2) {
        String str3;
        String str4;
        double d;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        int length;
        double dSubs;
        C15380l c15380l;
        C15380l c15380l2;
        C15380l c15380l3;
        C15380l c15380l4;
        C15380l c15380l5;
        int i6;
        C15380l c15380l6;
        C15380l c15380l7;
        C15380l c15380l8;
        double d2 = 100.0d;
        switch (this.f12883l) {
            case 7:
                if (str.length() <= str2.length()) {
                    str4 = str;
                    str3 = str2;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                int length2 = str4.length();
                int length3 = str3.length();
                int length4 = str4.length();
                int length5 = str3.length();
                char[] charArray = str4.toCharArray();
                char[] charArray2 = str3.toCharArray();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (length4 > 0 && length5 > 0 && charArray[i7] == charArray2[i8]) {
                    length4--;
                    length5--;
                    i7++;
                    i8++;
                    i9++;
                }
                while (true) {
                    if (length4 <= 0 || length5 <= 0) {
                        d = d2;
                    } else {
                        d = d2;
                        if (charArray[(i7 + length4) - 1] == charArray2[(i8 + length5) - 1]) {
                            length4--;
                            length5--;
                            d2 = d;
                        }
                    }
                }
                int i10 = length4 + 1;
                int i11 = length5 + 1;
                int i12 = i11 * i10;
                int i13 = 1;
                int[] iArr = new int[i12];
                for (int i14 = 0; i14 < i11; i14++) {
                    iArr[i14] = i14;
                }
                for (int i15 = 1; i15 < i10; i15++) {
                    iArr[i11 * i15] = i15;
                }
                int i16 = 1;
                while (i16 < i10) {
                    int i17 = (i16 - 1) * i11;
                    int i18 = i16 * i11;
                    int i19 = i10;
                    int i20 = (i18 + i11) - 1;
                    int i21 = i11;
                    char c = charArray[(i7 + i16) - 1];
                    int i22 = i18 + 1;
                    int i23 = length4;
                    int i24 = i22;
                    int i25 = i16;
                    int i26 = i8;
                    while (i24 <= i20) {
                        int i27 = i17 + 1;
                        int i28 = i26 + 1;
                        int i29 = i20;
                        int i30 = iArr[i17] + (c != charArray2[i26] ? 1 : 0);
                        char c2 = c;
                        int i31 = i25 + 1;
                        if (i31 <= i30) {
                            i30 = i31;
                        }
                        int i32 = iArr[i27] + 1;
                        i25 = i30 > i32 ? i32 : i30;
                        iArr[i24] = i25;
                        i24++;
                        c = c2;
                        i17 = i27;
                        i26 = i28;
                        i20 = i29;
                    }
                    i16++;
                    i10 = i19;
                    length4 = i23;
                    i11 = i21;
                }
                int i33 = i11;
                int i34 = i12 - 1;
                int i35 = iArr[i34];
                C15380l[] c15380lArr = new C15380l[i35];
                int i36 = i35;
                int i37 = length5;
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (length4 <= 0 && i37 <= 0) {
                            int i38 = i35;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                i2 = 5;
                                if (i38 != 0) {
                                    while (true) {
                                        c15380l5 = c15380lArr[i41];
                                        i6 = c15380l5.loadAd;
                                        if (i6 == 5 && (i38 = i38 - 1) != 0) {
                                            i41++;
                                        }
                                    }
                                    if (i38 != 0) {
                                        int i43 = c15380l5.crashlytics;
                                        if (i39 < i43 || i40 < c15380l5.amazon) {
                                            i42++;
                                            i40 = c15380l5.amazon;
                                            i39 = i43;
                                        }
                                        int iInmobi = AbstractC5020l.inmobi(i6);
                                        if (iInmobi == 0) {
                                            do {
                                                i39++;
                                                i38--;
                                                i41++;
                                                if (i38 == 0) {
                                                }
                                                c15380l8 = c15380lArr[i41];
                                                if (c15380l8.loadAd != i6 || i39 != c15380l8.crashlytics) {
                                                }
                                                break;
                                                break;
                                            } while (i40 == c15380l8.amazon);
                                        } else if (iInmobi == 2) {
                                            do {
                                                i40++;
                                                i38--;
                                                i41++;
                                                if (i38 == 0) {
                                                }
                                                c15380l7 = c15380lArr[i41];
                                                if (c15380l7.loadAd != i6 || i39 != c15380l7.crashlytics) {
                                                }
                                                break;
                                                break;
                                            } while (i40 == c15380l7.amazon);
                                        } else if (iInmobi == 3) {
                                            do {
                                                i39++;
                                                i40++;
                                                i38--;
                                                i41++;
                                                if (i38 == 0) {
                                                }
                                                c15380l6 = c15380lArr[i41];
                                                if (c15380l6.loadAd != i6 || i39 != c15380l6.crashlytics) {
                                                }
                                                break;
                                                break;
                                            } while (i40 == c15380l6.amazon);
                                        }
                                    }
                                }
                            }
                            if (i39 < length2 || i40 < length3) {
                                i42++;
                            }
                            int i44 = i42 + 1;
                            C15380l[] c15380lArr2 = new C15380l[i44];
                            int i45 = i35;
                            int i46 = 0;
                            int i47 = 0;
                            int i48 = 0;
                            int i49 = 0;
                            while (i45 != 0) {
                                while (true) {
                                    c15380l = c15380lArr[i48];
                                    if (c15380l.loadAd == i2 && (i45 = i45 - 1) != 0) {
                                        i48++;
                                    }
                                }
                                if (i45 == 0) {
                                    if (i46 >= length2 || i47 < length3) {
                                        i3 = 4;
                                        C15380l c15380l9 = new C15380l(4);
                                        c15380l9.loadAd = i46;
                                        c15380l9.crashlytics = i47;
                                        c15380l9.amazon = length2 - i46;
                                        c15380lArr2[i49] = c15380l9;
                                        i49++;
                                    } else {
                                        i3 = 4;
                                    }
                                    C15380l c15380l10 = new C15380l(i3);
                                    c15380l10.loadAd = length2;
                                    c15380l10.crashlytics = length3;
                                    c15380l10.amazon = 0;
                                    c15380lArr2[i49] = c15380l10;
                                    arrayList = new ArrayList();
                                    for (i4 = 0; i4 < i44; i4++) {
                                        C15380l c15380l11 = c15380lArr2[i4];
                                        i5 = c15380l11.crashlytics - c15380l11.loadAd;
                                        if (i5 <= 0) {
                                            i5 = 0;
                                        }
                                        length = str4.length() + i5;
                                        if (length > str3.length()) {
                                            length = str3.length();
                                        }
                                        dSubs = AbstractC9464l.subs(str4, str3.substring(i5, length));
                                        if (dSubs > 0.995d) {
                                            return 100;
                                        }
                                        arrayList.add(Double.valueOf(dSubs));
                                    }
                                    return (int) Math.round(((Double) Collections.max(arrayList)).doubleValue() * d);
                                }
                                int i50 = c15380l.crashlytics;
                                if (i46 < i50 || i47 < c15380l.amazon) {
                                    C15380l c15380l12 = new C15380l(4);
                                    c15380l12.loadAd = i46;
                                    c15380l12.crashlytics = i47;
                                    c15380l12.amazon = i50 - i46;
                                    i47 = c15380l.amazon;
                                    c15380lArr2[i49] = c15380l12;
                                    i49++;
                                    i46 = i50;
                                }
                                int i51 = c15380lArr[i48].loadAd;
                                int iInmobi2 = AbstractC5020l.inmobi(i51);
                                if (iInmobi2 == 0) {
                                    do {
                                        i46++;
                                        i45--;
                                        i48++;
                                        if (i45 != 0) {
                                            c15380l2 = c15380lArr[i48];
                                            if (c15380l2.loadAd != i51 || i46 != c15380l2.crashlytics) {
                                            }
                                        }
                                    } while (i47 == c15380l2.amazon);
                                } else if (iInmobi2 != 2) {
                                    if (iInmobi2 == 3) {
                                        do {
                                            i46++;
                                            i47++;
                                            i45--;
                                            i48++;
                                            if (i45 != 0) {
                                                c15380l4 = c15380lArr[i48];
                                                if (c15380l4.loadAd != i51 || i46 != c15380l4.crashlytics) {
                                                }
                                            }
                                        } while (i47 == c15380l4.amazon);
                                    }
                                    i2 = 5;
                                } else {
                                    do {
                                        i47++;
                                        i45--;
                                        i48++;
                                        if (i45 != 0) {
                                            c15380l3 = c15380lArr[i48];
                                            if (c15380l3.loadAd != i51 || i46 != c15380l3.crashlytics) {
                                            }
                                        }
                                    } while (i47 == c15380l3.amazon);
                                }
                                i2 = 5;
                            }
                            if (i46 >= length2) {
                                i3 = 4;
                                C15380l c15380l13 = new C15380l(4);
                                c15380l13.loadAd = i46;
                                c15380l13.crashlytics = i47;
                                c15380l13.amazon = length2 - i46;
                                c15380lArr2[i49] = c15380l13;
                                i49++;
                            } else {
                                i3 = 4;
                                C15380l c15380l14 = new C15380l(4);
                                c15380l14.loadAd = i46;
                                c15380l14.crashlytics = i47;
                                c15380l14.amazon = length2 - i46;
                                c15380lArr2[i49] = c15380l14;
                                i49++;
                            }
                            C15380l c15380l15 = new C15380l(i3);
                            c15380l15.loadAd = length2;
                            c15380l15.crashlytics = length3;
                            c15380l15.amazon = 0;
                            c15380lArr2[i49] = c15380l15;
                            arrayList = new ArrayList();
                            while (i4 < i44) {
                                C15380l c15380l16 = c15380lArr2[i4];
                                i5 = c15380l16.crashlytics - c15380l16.loadAd;
                                if (i5 <= 0) {
                                    i5 = 0;
                                }
                                length = str4.length() + i5;
                                if (length > str3.length()) {
                                    length = str3.length();
                                }
                                dSubs = AbstractC9464l.subs(str4, str3.substring(i5, length));
                                if (dSubs > 0.995d) {
                                    return 100;
                                }
                                arrayList.add(Double.valueOf(dSubs));
                            }
                            return (int) Math.round(((Double) Collections.max(arrayList)).doubleValue() * d);
                        }
                        if (length4 == 0 || i37 == 0) {
                            str4 = str4;
                        } else {
                            str4 = str4;
                            if (iArr[i34] == iArr[(i34 - i33) - 1] && charArray[(i7 + length4) - 1] == charArray2[(i8 + i37) - 1]) {
                                length4--;
                                i37--;
                                i34 -= length5 + 2;
                                str4 = str4;
                            }
                        }
                        if (b < 0 && i37 != 0 && iArr[i34] == iArr[i34 - 1] + 1) {
                            C15380l c15380l17 = new C15380l(3);
                            i36--;
                            c15380lArr[i36] = c15380l17;
                            c15380l17.loadAd = 3;
                            c15380l17.crashlytics = length4 + i9;
                            i37--;
                            c15380l17.amazon = i37 + i9;
                            i34--;
                        } else if (b > 0 && length4 != 0) {
                            int i52 = i34 - i33;
                            if (iArr[i34] == iArr[i52] + 1) {
                                C15380l c15380l18 = new C15380l(3);
                                i36--;
                                c15380lArr[i36] = c15380l18;
                                c15380l18.loadAd = i13;
                                length4--;
                                c15380l18.crashlytics = length4 + i9;
                                c15380l18.amazon = i37 + i9;
                                i34 = i52;
                            } else {
                                if (length4 == 0) {
                                }
                                if (b == 0) {
                                }
                                if (b == 0) {
                                    i = 1;
                                    i13 = i;
                                } else {
                                    i = 1;
                                    i13 = i;
                                }
                            }
                            i13 = 1;
                        } else {
                            if (length4 == 0 && i37 != 0 && iArr[i34] == iArr[(i34 - i33) - 1] + 1) {
                                i36--;
                                C15380l c15380l19 = new C15380l(3);
                                c15380lArr[i36] = c15380l19;
                                c15380l19.loadAd = 4;
                                length4--;
                                c15380l19.crashlytics = length4 + i9;
                                i37--;
                                c15380l19.amazon = i37 + i9;
                                i34 -= length5 + 2;
                                str4 = str4;
                                i13 = 1;
                            }
                            if (b == 0 || i37 == 0 || iArr[i34] != iArr[i34 - 1] + 1) {
                                if (b == 0 || length4 == 0) {
                                    i = 1;
                                } else {
                                    int i53 = i34 - i33;
                                    i13 = 1;
                                    if (iArr[i34] == iArr[i53] + 1) {
                                        i36--;
                                        C15380l c15380l20 = new C15380l(3);
                                        c15380lArr[i36] = c15380l20;
                                        c15380l20.loadAd = 1;
                                        length4--;
                                        c15380l20.crashlytics = length4 + i9;
                                        c15380l20.amazon = i37 + i9;
                                        b = 1;
                                        i34 = i53;
                                    } else {
                                        i = 1;
                                    }
                                }
                                i13 = i;
                            } else {
                                i36--;
                                C15380l c15380l21 = new C15380l(3);
                                c15380lArr[i36] = c15380l21;
                                c15380l21.loadAd = 3;
                                c15380l21.crashlytics = length4 + i9;
                                i37--;
                                c15380l21.amazon = i37 + i9;
                                i34--;
                                b = -1;
                                i13 = 1;
                            }
                        }
                        str4 = str4;
                        break;
                    }
                }
                break;
            default:
                return (int) Math.round(AbstractC9464l.subs(str, str2) * 100.0d);
        }
    }

    public C13283l crashlytics(Context context) {
        C13283l c13283l;
        C13283l c13283l2 = C13283l.firebase;
        if (c13283l2 != null) {
            return c13283l2;
        }
        synchronized (this) {
            c13283l = C13283l.firebase;
            if (c13283l == null) {
                c13283l = new C13283l(AbstractC8626l.yandex(context));
                C13283l.firebase = c13283l;
            }
        }
        return c13283l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    @Override // defpackage.InterfaceC6642l
    public boolean firebase(Object obj, Object obj2) {
        C11007l c11007l = (C11007l) obj;
        C11007l c11007l2 = (C11007l) obj2;
        if (c11007l == null || c11007l2 == null) {
            if ((c11007l == null) ^ (c11007l2 == null)) {
                return false;
            }
            return true;
        }
        if (c11007l.yandex == c11007l2.yandex && AbstractC8576l.yandex(c11007l.loadAd, c11007l2.loadAd) && c11007l.crashlytics == c11007l2.crashlytics && c11007l.amazon == c11007l2.amazon && c11007l.purchase == c11007l2.purchase) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC14257l
    public C15380l metrica(Context context, String str, InterfaceC6481l interfaceC6481l) {
        C15380l c15380l = new C15380l();
        int iBilling = interfaceC6481l.billing(context, str, true);
        c15380l.crashlytics = iBilling;
        if (iBilling != 0) {
            c15380l.amazon = 1;
            return c15380l;
        }
        int iSubs = interfaceC6481l.subs(context, str);
        c15380l.loadAd = iSubs;
        if (iSubs != 0) {
            c15380l.amazon = -1;
        }
        return c15380l;
    }

    public String toString() {
        switch (this.f12883l) {
            case 11:
                return "ReusedSlotId";
            case 14:
                int iHashCode = hashCode();
                AbstractC8576l.loadAd(16);
                return AbstractC14814l.ads("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", AbstractC18202l.yandex.loadAd(String.class).license(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f12883l) {
            case 16:
                return new Boolean(((Boolean) C17449l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(86400000L, 5, "measurement.config.cache_time").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(518400000L, 73, "measurement.upload.max_queue_time").get();
            case 20:
            default:
                List list4 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.uuid_generation", true, 8).get();
            case 21:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(65536L, 75, "measurement.upload.max_batch_size").get()).longValue());
            case 22:
                List list6 = AbstractC5981l.yandex;
                return (Boolean) C3072l.yandex.get();
        }
    }

    @Override // defpackage.InterfaceC0208l
    public Object vip(C16916l c16916l) throws C16916l {
        throw c16916l;
    }
}
