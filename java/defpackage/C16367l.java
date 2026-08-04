package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import android.util.Log;
import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16367l implements InterfaceC0713l, InterfaceC1541l, InterfaceC13055l, InterfaceC4789l, InterfaceC8170l, InterfaceC0251l, InterfaceC10153l, InterfaceC14458l, InterfaceC15853l, InterfaceC15446l, InterfaceC11545l, InterfaceC9765l, InterfaceC12925l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C16367l f32009l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32016l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32006l = new C16367l(15);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32012l = new C16367l(16);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32011l = new C16367l(17);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32014l = new C16367l(18);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32007l = new C16367l(19);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32008l = new C16367l(20);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32013l = new C16367l(21);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32010l = new C16367l(22);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ C16367l f32015l = new C16367l(24);

    public /* synthetic */ C16367l(int i) {
        this.f32016l = i;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x045b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0471  */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x0471, please report this as an issue */
    public static C2106l advert(CharSequence charSequence) {
        int i;
        InterfaceC7267l interfaceC7267lPurchase;
        int i2;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        char cCharAt2;
        int i6 = 0;
        if (charSequence.length() == 0) {
            interfaceC7267lPurchase = new C18396l("An empty string is not a valid Instant", charSequence, i6);
        } else {
            char cCharAt3 = charSequence.charAt(0);
            int i7 = 1;
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i8 = i;
            while (i8 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i8)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (charSequence.charAt(i8) - '0');
                i8++;
            }
            int i9 = i8 - i;
            if (i9 > 10) {
                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected at most 10 digits for the year number, got " + i9 + " digits");
            } else if (i9 != 10 || AbstractC8576l.subs(charSequence.charAt(i), 50) < 0) {
                int i10 = 4;
                if (i9 < 4) {
                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "The year number must be padded to 4 digits, got " + i9 + " digits");
                } else if (cCharAt3 == '+' && i9 == 4) {
                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
                } else if (cCharAt3 != ' ' || i9 == 4) {
                    if (cCharAt3 == '-') {
                        iCharAt = -iCharAt;
                    }
                    int i11 = i8 + 16;
                    if (charSequence.length() < i11) {
                        interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "The input string is too short");
                    } else {
                        interfaceC7267lPurchase = AbstractC9549l.purchase(charSequence, "'-'", i8, new C17049l(29));
                        if (interfaceC7267lPurchase == null && (interfaceC7267lPurchase = AbstractC9549l.purchase(charSequence, "'-'", i8 + 3, new C2613l(i6))) == null && (interfaceC7267lPurchase = AbstractC9549l.purchase(charSequence, "'T' or 't'", i8 + 6, new C2613l(i7))) == null && (interfaceC7267lPurchase = AbstractC9549l.purchase(charSequence, "':'", i8 + 9, new C2613l(2))) == null && (interfaceC7267lPurchase = AbstractC9549l.purchase(charSequence, "':'", i8 + 12, new C2613l(3))) == null) {
                            int i12 = 0;
                            while (i12 < 10) {
                                C18396l c18396lPurchase = AbstractC9549l.purchase(charSequence, "an ASCII digit", AbstractC9549l.loadAd[i12] + i8, new C2613l(i10));
                                if (c18396lPurchase != null) {
                                    interfaceC7267lPurchase = c18396lPurchase;
                                } else {
                                    i12++;
                                    i10 = 4;
                                }
                            }
                            int iMopub = AbstractC9549l.mopub(charSequence, i8 + 1);
                            int iMopub2 = AbstractC9549l.mopub(charSequence, i8 + 4);
                            int iMopub3 = AbstractC9549l.mopub(charSequence, i8 + 7);
                            int iMopub4 = AbstractC9549l.mopub(charSequence, i8 + 10);
                            int iMopub5 = AbstractC9549l.mopub(charSequence, i8 + 13);
                            int i13 = i8 + 15;
                            if (charSequence.charAt(i13) == '.') {
                                i13 = i11;
                                int iCharAt2 = 0;
                                while (i13 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i13)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i13) - '0');
                                    i13++;
                                }
                                int i14 = i13 - i11;
                                if (1 > i14 || i14 >= 10) {
                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "1..9 digits are supported for the fraction of the second, got " + i14 + " digits");
                                } else {
                                    i2 = iCharAt2 * AbstractC9549l.yandex[9 - i14];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i13 >= charSequence.length()) {
                                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = charSequence.charAt(i13);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = charSequence.length() - i13;
                                    if (length > 9) {
                                        interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "The UTC offset string \"" + AbstractC9549l.admob(charSequence.subSequence(i13, charSequence.length()).toString(), 16) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i13, charSequence.length()).toString() + '\"');
                                    } else {
                                        for (int i15 = 0; i15 < 2 && (i5 = AbstractC9549l.crashlytics[i15] + i13) < charSequence.length(); i15++) {
                                            if (charSequence.charAt(i5) != ':') {
                                                StringBuilder sbSignature = AbstractC2812l.Signature("Expected ':' at index ", i5, ", got '");
                                                sbSignature.append(charSequence.charAt(i5));
                                                sbSignature.append('\'');
                                                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, sbSignature.toString());
                                            }
                                        }
                                        int i16 = 0;
                                        while (i16 < 6 && (i4 = AbstractC9549l.amazon[i16] + i13) < charSequence.length()) {
                                            char cCharAt5 = charSequence.charAt(i4);
                                            int i17 = i16;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbSignature2 = AbstractC2812l.Signature("Expected an ASCII digit at index ", i4, ", got '");
                                                sbSignature2.append(charSequence.charAt(i4));
                                                sbSignature2.append('\'');
                                                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, sbSignature2.toString());
                                            } else {
                                                i16 = i17 + 1;
                                            }
                                        }
                                        int iMopub6 = AbstractC9549l.mopub(charSequence, i13 + 1);
                                        int iMopub7 = length > 3 ? AbstractC9549l.mopub(charSequence, i13 + 4) : 0;
                                        int iMopub8 = length > 6 ? AbstractC9549l.mopub(charSequence, i13 + 7) : 0;
                                        if (iMopub7 > 59) {
                                            interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iMopub7);
                                        } else if (iMopub8 > 59) {
                                            interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected offset-second-of-minute in 0..59, got " + iMopub8);
                                        } else if (iMopub6 <= 17 || (iMopub6 == 18 && iMopub7 == 0 && iMopub8 == 0)) {
                                            i3 = ((iMopub7 * 60) + (iMopub6 * 3600) + iMopub8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iMopub || iMopub >= 13) {
                                                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected a month number in 1..12, got " + iMopub);
                                            } else if (1 > iMopub2) {
                                                StringBuilder sbSubscription = AbstractC14814l.subscription(iMopub, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                sbSubscription.append(iMopub2);
                                                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, sbSubscription.toString());
                                            } else {
                                                int i18 = iCharAt & 3;
                                                if (iMopub2 > (iMopub != 2 ? (iMopub == 4 || iMopub == 6 || iMopub == 9 || iMopub == 11) ? 30 : 31 : i18 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbSubscription2 = AbstractC14814l.subscription(iMopub, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                    sbSubscription2.append(iMopub2);
                                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, sbSubscription2.toString());
                                                } else if (iMopub3 > 23) {
                                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected hour in 0..23, got " + iMopub3);
                                                } else if (iMopub4 > 59) {
                                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected minute-of-hour in 0..59, got " + iMopub4);
                                                } else if (iMopub5 > 59) {
                                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected second-of-minute in 0..59, got " + iMopub5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iMopub * 367) - 362) / 12)) + ((long) (iMopub2 - 1));
                                                    if (iMopub > 2) {
                                                        j3 = (i18 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    interfaceC7267lPurchase = new C8128l((((j3 - 719528) * 86400) + ((long) (((iMopub4 * 60) + (iMopub3 * 3600)) + iMopub5))) - ((long) i3), i2);
                                                }
                                            }
                                        } else {
                                            interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i13, charSequence.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i19 = i13 + 1;
                                    if (charSequence.length() == i19) {
                                        i3 = 0;
                                        if (1 <= iMopub) {
                                            interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected a month number in 1..12, got " + iMopub);
                                        } else {
                                            interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected a month number in 1..12, got " + iMopub);
                                        }
                                    } else {
                                        interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Extra text after the instant at position " + i19);
                                    }
                                } else {
                                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected the UTC offset at position " + i13 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                } else {
                    interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
                }
            } else {
                interfaceC7267lPurchase = AbstractC9549l.billing(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i9 + " digits");
            }
        }
        return interfaceC7267lPurchase.toInstant();
    }

    public static C2106l license(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? C2106l.f4734l : C2106l.f4733l;
        }
        if (j4 < -31557014167219200L) {
            return C2106l.f4733l;
        }
        if (j4 > 31556889864403199L) {
            return C2106l.f4734l;
        }
        long j5 = j2 % 1000000000;
        return new C2106l(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        switch (this.f32016l) {
            case 15:
                C0022l c0022l = C16014l.f31391package;
                C10567l c10567l = (C10567l) ((C4184l) obj).metrica();
                C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                Parcel parcelM743l = c10567l.m743l();
                AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                c10567l.m747l(parcelM743l, 1);
                ((C2350l) obj2).loadAd(null);
                break;
            default:
                int i = C1539l.firebase;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object ad(Context context, int i, AbstractC0283l abstractC0283l) {
        C11135l c11135l;
        C3152l c3152lAdcel;
        if (abstractC0283l instanceof C11135l) {
            c11135l = (C11135l) abstractC0283l;
            int i2 = c11135l.f22350l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11135l.f22350l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11135l = new C11135l(this, abstractC0283l);
            }
        } else {
            c11135l = new C11135l(this, abstractC0283l);
        }
        Object objCrashlytics = c11135l.f22353l;
        int i3 = c11135l.f22350l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(objCrashlytics);
                C18188l c18188l = C18188l.yandex;
                C15656l c15656l = C15656l.loadAd;
                String strBilling = AbstractC16422l.billing(i);
                c11135l.f22352l = context;
                c11135l.f22351l = i;
                c11135l.f22350l = 1;
                objCrashlytics = c18188l.crashlytics(context, c15656l, strBilling, c11135l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objCrashlytics == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i3 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = c11135l.f22351l;
                context = c11135l.f22352l;
                AbstractC2829l.crashlytics(objCrashlytics);
            }
            c3152lAdcel = (C3152l) objCrashlytics;
        } catch (C16916l e) {
            Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + i + " is corrupted", e);
            c3152lAdcel = C3152l.adcel();
        } catch (IOException e2) {
            Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i, e2);
            c3152lAdcel = C3152l.adcel();
        }
        Context context2 = context;
        int i4 = i;
        InterfaceC10996l<C13782l> interfaceC10996lAds = c3152lAdcel.ads();
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(interfaceC10996lAds, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (C13782l c13782l : interfaceC10996lAds) {
            linkedHashMap.put(c13782l.startapp(), new Integer(c13782l.adcel()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        return new C6045l(context2, linkedHashMap2, c3152lAdcel.subscription(), i4, AbstractC16901l.m4227l(linkedHashMap2.values()));
    }

    @Override // defpackage.InterfaceC13055l
    public int adcel() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.InterfaceC4789l
    public boolean admob(AbstractC14971l abstractC14971l) {
        return AbstractC14425l.firebase(AbstractC8320l.yandex(AbstractC5573l.metrica(abstractC14971l), false));
    }

    @Override // defpackage.InterfaceC14458l
    public InterfaceC6942l amazon(C6930l c6930l) {
        return new C14970l(5, EnumC0920l.f2595l);
    }

    @Override // defpackage.InterfaceC4789l
    public boolean billing(AbstractC14971l abstractC14971l) {
        return false;
    }

    @Override // defpackage.InterfaceC12925l
    public C4687l crashlytics(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC13055l
    public boolean firebase(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.InterfaceC1541l
    public C11911l getKey() {
        return C3422l.f7274l;
    }

    @Override // defpackage.InterfaceC4789l
    public boolean isPro(C18333l c18333l, C3654l c3654l) {
        return false;
    }

    @Override // defpackage.InterfaceC12925l
    public boolean loadAd(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC15853l
    public /* synthetic */ Size metrica(C18680l c18680l, C15421l c15421l) {
        return null;
    }

    @Override // defpackage.InterfaceC4789l
    public int mopub() {
        return 8;
    }

    @Override // defpackage.InterfaceC15853l
    public List pro(C15421l c15421l) {
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC13055l
    public MediaCodecInfo purchase(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.InterfaceC4789l
    public boolean remoteconfig(C3654l c3654l) {
        C6264l c6264lAdvert = c3654l.advert();
        boolean z = false;
        if (c6264lAdvert != null && c6264lAdvert.f13226l) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // defpackage.InterfaceC0251l
    public StackTraceElement[] smaato(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // defpackage.InterfaceC13055l
    public boolean startapp(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.InterfaceC4789l
    public void subs(C3654l c3654l, long j, C18333l c18333l, int i, boolean z) {
        C18289l c18289l = c3654l.f7703l;
        AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase;
        C6148l c6148l = AbstractC18026l.f35263l;
        ((AbstractC18026l) c18289l.purchase).m4492l(AbstractC18026l.f35264l, abstractC18026l.m4488l(j, true), c18333l, 1, z);
    }

    @Override // defpackage.InterfaceC13055l
    public boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        c18389l.close();
    }

    public String toString() {
        switch (this.f32016l) {
            case 10:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1541l
    public Object vip(Function1 function1) {
        C10023l c10023l = new C10023l(29);
        function1.invoke(c10023l);
        return new C3422l((C13991l) c10023l.f20418l, (ArrayList) c10023l.f20419l);
    }

    @Override // defpackage.InterfaceC1541l
    public void yandex(C16864l c16864l, Object obj) {
        C3422l c3422l = (C3422l) obj;
        InterfaceC14029l interfaceC14029l = null;
        c16864l.f32922l.firebase(C8403l.f17378l, new C5134l(c3422l, interfaceC14029l, 0));
        c16864l.f32914l.firebase(C8403l.f17396l, new C5134l(c3422l, interfaceC14029l, 1));
        c16864l.f32921l.firebase(C8403l.f17386l, new C7306l(c3422l, interfaceC14029l, 4));
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f32016l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(50000L, 72, "measurement.upload.max_public_events_per_day").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(5000L, 47, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(604800000L, 34, "measurement.upload.refresh_blacklisted_config_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                return (Long) C1801l.yandex.billing(-1L, 4, "measurement.test.long_flag").get();
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Boolean) C4515l.yandex.yandex("measurement.config.default_flag_values", true, 10).get();
            default:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C15477l.loadAd.get();
        }
    }

    @Override // defpackage.InterfaceC8170l
    public void ads() {
    }

    @Override // defpackage.InterfaceC0713l
    public void applovin() {
    }

    @Override // defpackage.InterfaceC0713l
    public void Signature(C10756l c10756l) {
    }

    @Override // defpackage.InterfaceC0713l
    /* JADX INFO: renamed from: continue */
    public void mo670continue(C14722l c14722l) {
    }

    @Override // defpackage.InterfaceC0713l
    /* JADX INFO: renamed from: extends */
    public void mo671extends(C18262l c18262l) {
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
    }

    @Override // defpackage.InterfaceC8170l
    public void tapsense(int i, Object obj) {
    }
}
