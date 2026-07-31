package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙِ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6411l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f13392l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13393l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13394l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f13395l;

    public /* synthetic */ C6411l(InterfaceC2262l interfaceC2262l, InterfaceC12244l interfaceC12244l, C0072l c0072l) {
        this.f13394l = 17;
        this.f13393l = interfaceC2262l;
        this.f13395l = interfaceC12244l;
        this.f13392l = c0072l;
    }

    private final Object billing(Object obj) {
        C3366l c3366l = (C3366l) obj;
        List listRemoteconfig = AbstractC14055l.remoteconfig(new C9735l(((C9735l) ((InterfaceC12244l) this.f13395l).getValue()).yandex), new C9735l(((C9735l) ((InterfaceC12244l) this.f13393l).getValue()).yandex), new C9735l(((C9735l) ((InterfaceC12244l) this.f13392l).getValue()).yandex));
        Float fValueOf = Float.valueOf(0.0f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32));
        C6906l c6906l = new C6906l(listRemoteconfig, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long j = C9735l.isPro;
        C8195l c8195l = new C8195l(fValueOf, new C9735l(j));
        Float fValueOf2 = Float.valueOf(1.0f);
        long j2 = C9735l.purchase;
        return c3366l.yandex(new C4693l(0, new C6411l(c6906l, C1083l.pro(new C8195l[]{c8195l, new C8195l(fValueOf2, new C9735l(j2))}), C1083l.pro(new C8195l[]{new C8195l(fValueOf, new C9735l(j2)), new C8195l(fValueOf2, new C9735l(j))}), 21)));
    }

    private final Object yandex(Object obj) {
        boolean z;
        C12217l c12217l = (C12217l) this.f13392l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f13393l;
        Context context = (Context) this.f13395l;
        C18624l c18624l = (C18624l) obj;
        c18624l.yandex();
        C12463l c12463l = c18624l.yandex;
        EnumC11323l enumC11323l = EnumC11323l.Autofill;
        int i = 0;
        int i2 = 1;
        boolean z2 = (C12814l.amazon(c12217l.yandex.amazon().f12061l) || !c12217l.remoteconfig() || c12217l.amazon) ? false : true;
        InterfaceC14029l interfaceC14029l = null;
        C0339l c0339l = new C0339l(interfaceC2262l, new C16203l(c12217l, interfaceC14029l, i), i2);
        Resources resources = context.getResources();
        EnumC6775l enumC6775l = EnumC6775l.f14201l;
        C17796l c17796l = new C17796l(c0339l, interfaceC14029l, c12217l, enumC6775l, 19);
        if (z2) {
            c12463l.yandex(new C5249l(AbstractC0135l.yandex, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, c17796l));
        }
        EnumC11323l enumC11323l2 = EnumC11323l.Autofill;
        boolean z3 = (C12814l.amazon(c12217l.yandex.amazon().f12061l) || c12217l.amazon) ? false : true;
        C0339l c0339l2 = new C0339l(interfaceC2262l, new C16203l(c12217l, interfaceC14029l, i2), i2);
        Resources resources2 = context.getResources();
        C17796l c17796l2 = new C17796l(c0339l2, interfaceC14029l, c12217l, enumC6775l, 19);
        if (z3) {
            c12463l.yandex(new C5249l(AbstractC0135l.loadAd, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, c17796l2));
        }
        EnumC11323l enumC11323l3 = EnumC11323l.Autofill;
        if (!c12217l.remoteconfig()) {
            z = false;
        } else if (c12217l.isVip.f14494l) {
            z = true;
        } else {
            Function0 function0 = c12217l.vip;
            if (function0 != null && function0.invoke() != null) {
                C18725l.loadAd();
            }
            z = false;
        }
        C0339l c0339l3 = new C0339l(interfaceC2262l, new C16203l(c12217l, interfaceC14029l, 2), i2);
        Resources resources3 = context.getResources();
        C17796l c17796l3 = new C17796l(c0339l3, interfaceC14029l, c12217l, enumC6775l, 19);
        if (z) {
            c12463l.yandex(new C5249l(AbstractC0135l.crashlytics, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, c17796l3));
        }
        EnumC11323l enumC11323l4 = EnumC11323l.Autofill;
        C16328l c16328l = c12217l.yandex;
        boolean z4 = C12814l.purchase(c16328l.amazon().f12061l) != c16328l.amazon().f12057l.length();
        C18497l c18497l = new C18497l(c12217l, 7);
        C18497l c18497l2 = new C18497l(c12217l, 8);
        Resources resources4 = context.getResources();
        C17796l c17796l4 = new C17796l(c18497l2, c18497l, c12217l, EnumC6775l.f14199l, 19);
        if (z4) {
            c12463l.yandex(new C5249l(AbstractC0135l.amazon, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c17796l4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            EnumC11323l enumC11323l5 = EnumC11323l.Autofill;
            if (c12217l.remoteconfig() && C12814l.amazon(c12217l.yandex.amazon().f12061l)) {
                i = 1;
            }
            C18497l c18497l3 = new C18497l(c12217l, 9);
            Resources resources5 = context.getResources();
            C17796l c17796l5 = new C17796l(c18497l3, interfaceC14029l, c12217l, enumC6775l, 19);
            if (i != 0) {
                c12463l.yandex(new C5249l(enumC11323l5.f22827l, resources5.getString(enumC11323l5.f22826l), enumC11323l5.f22825l, c17796l5));
            }
        }
        c18624l.yandex();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:356:0x08c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [lٌْٙ] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, lٌْٙ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15012l c15012l;
        Integer numPurchase;
        Integer numAmazon;
        Integer numAmazon2;
        Integer numPurchase2;
        C0327l c0327l;
        C0327l c0327l2;
        C11224l c11224l;
        C11224l c11224l2;
        C0327l c0327l3;
        C0327l c0327l4;
        C11224l c11224l3;
        C11224l c11224l4;
        Integer numAmazon3;
        Integer numPurchase3;
        Integer numPurchase4;
        Integer numAmazon4;
        C13568l c13568l;
        C0639l c0639l;
        int i = this.f13394l;
        int i2 = 10;
        int i3 = 22;
        int i4 = 17;
        final int i5 = 2;
        int i6 = 3;
        boolean z = false;
        z = false;
        ?? r3 = 0;
        C0639l c0639l2 = null;
        r3 = 0;
        Object obj2 = this.f13392l;
        Object obj3 = this.f13395l;
        Object obj4 = this.f13393l;
        final int i7 = 1;
        switch (i) {
            case 0:
                C9270l c9270l = (C9270l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(790956681, true, new C0541l((InterfaceC2262l) obj4, c9270l, i3)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(558035634, true, new C16561l(9, c9270l)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1315177903, true, new C0541l((InterfaceC12244l) obj3, c9270l, 23)), 3);
                return Unit.INSTANCE;
            case 1:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj2;
                InterfaceC6947l interfaceC6947l = (InterfaceC6947l) obj3;
                C6742l c6742l = (C6742l) obj;
                long j = ((C14174l) ((C18200l) obj4).get()).yandex;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fMo868instanceof = c6742l.mo868instanceof(4.0f);
                    C13601l c13601l = c6742l.f14144l;
                    float fMo868instanceof2 = c6742l.mo868instanceof(interfaceC11780l.loadAd(c6742l.getLayoutDirection()));
                    float fYandex = interfaceC6947l.yandex(AbstractC5573l.ads(fIntBitsToFloat), AbstractC5573l.ads((Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32)) - fMo868instanceof2) - c6742l.mo868instanceof(interfaceC11780l.crashlytics(c6742l.getLayoutDirection()))), c6742l.getLayoutDirection()) + fMo868instanceof2;
                    float f = fIntBitsToFloat / 2.0f;
                    float f2 = fYandex + f;
                    float f3 = (f2 - f) - fMo868instanceof;
                    float f4 = f3 < 0.0f ? 0.0f : f3;
                    float f5 = f2 + f + fMo868instanceof;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32));
                    float f6 = f5 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f5;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                    float f7 = (-fIntBitsToFloat3) / 2.0f;
                    float f8 = fIntBitsToFloat3 / 2.0f;
                    C18449l c18449l = c13601l.f26629l;
                    long jM4551private = c18449l.m4551private();
                    c18449l.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449l.f36010l).remoteconfig(f4, f7, f6, f8, 0);
                        c6742l.yandex();
                    } finally {
                        AbstractC0653l.license(c18449l, jM4551private);
                    }
                } else {
                    c6742l.yandex();
                }
                return Unit.INSTANCE;
            case 2:
                C0324l c0324l = (C0324l) obj4;
                C1336l c1336l2 = (C1336l) obj;
                ?? r1 = (InterfaceC13238l) ((InterfaceC12244l) obj3).getValue();
                C11130l c11130l = C11130l.f22344l;
                c1336l2.firebase(((AbstractC7095l) r1).pro(), new C5640l(r1, 14), new C5640l(r1, 15, z), new C15578l(802480018, true, new C18125l(r1, c0324l, i7)));
                if (((Boolean) ((InterfaceC12244l) obj2).getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-2126650915, true, new C0461l(c0324l, i7)), 3);
                }
                return Unit.INSTANCE;
            case 3:
                C8874l c8874l = (C8874l) obj4;
                C16691l c16691l = (C16691l) obj3;
                C13660l c13660l = c8874l.f18241l;
                if (c13660l.loadAd(obj2)) {
                    C10754l.license(obj2, " was used multiple times ", "Key ");
                    return null;
                }
                c8874l.f18242l.remove(obj2);
                c13660l.vip(obj2, c16691l);
                return new C15386l(c8874l, obj2, c16691l, i5);
            case 4:
                C9122l c9122l = (C9122l) obj3;
                C15730l c15730l = (C15730l) obj;
                if (((InterfaceC17435l) obj4).remoteconfig(c15730l.crashlytics, (C11379l) obj2)) {
                    c15730l.yandex();
                    c9122l.f18750l = true;
                }
                return Unit.INSTANCE;
            case 5:
                C3399l c3399l = (C3399l) obj4;
                C15428l c15428l = (C15428l) obj2;
                C16248l c16248l = (C16248l) obj3;
                if (C9658l.crashlytics(c3399l.yandex(), c15428l.loadAd) < 0) {
                    long j2 = c15428l.loadAd;
                    AtomicReference atomicReference = c3399l.f7242l;
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Long l = (Long) obj5;
                        if (l == null) {
                            C8339l.smaato("Start the timer with startTimer before calling addTime");
                            return null;
                        }
                        if (j2 <= 0) {
                            C8339l.metrica("Cannot call addTime with a negative duration");
                            return null;
                        }
                        Long lValueOf = Long.valueOf(C9658l.amazon(j2) + l.longValue());
                        do {
                            if (atomicReference.compareAndSet(obj5, lValueOf)) {
                            }
                        } while (atomicReference.get() == obj5);
                    }
                }
                AbstractC10999l.mopub(c3399l, null, 0, new C10355l(c16248l, r3, i7), 3);
                return Unit.INSTANCE;
            case 6:
                C6922l c6922l = (C6922l) obj4;
                C1336l c1336l3 = (C1336l) obj;
                ?? r2 = (InterfaceC13238l) ((InterfaceC12244l) obj3).getValue();
                c1336l3.firebase(((AbstractC7095l) r2).pro(), new C3768l(new C1698l(i2), (Object) r2, 26), new C5640l(r2, 18, z), new C15578l(802480018, true, new C6780l(r2, c6922l, 29)));
                if (((Boolean) ((InterfaceC12244l) obj2).getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-1927257136, true, new C16561l(i4, c6922l)), 3);
                }
                return Unit.INSTANCE;
            case 7:
                C12513l c12513l = (C12513l) obj3;
                Throwable th = (Throwable) obj;
                ((C15079l) obj4).invoke(th);
                C7119l c7119l = (C7119l) ((C10038l) obj2).f20466l;
                c7119l.firebase(th, false);
                while (true) {
                    Object objYandex = C0381l.yandex(c7119l.tapsense());
                    if (objYandex == null) {
                        return Unit.INSTANCE;
                    }
                    c12513l.invoke(objYandex, th);
                }
                break;
            case 8:
                AbstractC10999l.mopub((InterfaceC2262l) obj4, null, 0, new C15352l((InterfaceC6940l) obj2, (InterfaceC8714l) obj3, r3, 6), 3);
                return Unit.INSTANCE;
            case 9:
                C4280l c4280l = (C4280l) obj4;
                InterfaceC16983l interfaceC16983l = (InterfaceC16983l) obj3;
                Throwable th2 = (Throwable) obj;
                if (!(th2 instanceof C9262l) || ((C9262l) th2).f19044l != 3) {
                    throw null;
                }
                AbstractC10999l.mopub(c4280l.loadAd.purchase, null, 0, new C1914l(c4280l, interfaceC16983l, (AbstractC14950l) null, (InterfaceC14029l) null), 3);
                return Unit.INSTANCE;
            case 10:
                C9122l c9122l2 = (C9122l) obj4;
                C15012l c15012l2 = (C15012l) obj2;
                C14264l c14264l = (C14264l) obj3;
                C15012l c15012l3 = (C15012l) obj;
                if (c9122l2.f18750l) {
                    Object obj6 = c15012l3.yandex;
                    int i8 = c15012l3.crashlytics;
                    int i9 = c15012l3.loadAd;
                    if ((obj6 instanceof C14264l) && i9 == c15012l2.loadAd && i8 == c15012l2.crashlytics) {
                        if (c14264l == null) {
                            c14264l = new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                        }
                        c15012l = new C15012l(c14264l, i9, i8);
                    } else {
                        c15012l = c15012l3;
                    }
                } else {
                    c15012l = c15012l3;
                }
                c9122l2.f18750l = c15012l2.equals(c15012l3);
                return c15012l;
            case 11:
                Function1 function1 = (Function1) obj2;
                C12983l c12983l = (C12983l) ((C10700l) obj3).f21708l;
                C0639l c0639lLoadAd = ((C18595l) obj4).loadAd((List) obj);
                if (c12983l != null) {
                    c12983l.yandex(null, c0639lLoadAd);
                }
                function1.invoke(c0639lLoadAd);
                return Unit.INSTANCE;
            case 12:
                C10167l c10167l = (C10167l) obj2;
                C9122l c9122l3 = (C9122l) obj3;
                C14078l c14078l = (C14078l) obj;
                int i10 = 4;
                switch (((EnumC14173l) obj4).ordinal()) {
                    case 0:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (C12814l.amazon(c14078l.billing)) {
                                c14078l.subs();
                                Unit unit = Unit.INSTANCE;
                            } else {
                                boolean zBilling = c14078l.billing();
                                long j3 = c14078l.billing;
                                if (zBilling) {
                                    int iMopub = C12814l.mopub(j3);
                                    c14078l.adcel(iMopub, iMopub);
                                } else {
                                    int iBilling = C12814l.billing(j3);
                                    c14078l.adcel(iBilling, iBilling);
                                }
                            }
                        }
                        break;
                    case 1:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (C12814l.amazon(c14078l.billing)) {
                                c14078l.remoteconfig();
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                boolean zBilling2 = c14078l.billing();
                                long j4 = c14078l.billing;
                                if (zBilling2) {
                                    int iBilling2 = C12814l.billing(j4);
                                    c14078l.adcel(iBilling2, iBilling2);
                                } else {
                                    int iMopub2 = C12814l.mopub(j4);
                                    c14078l.adcel(iMopub2, iMopub2);
                                }
                            }
                        }
                        break;
                    case 2:
                        C4397l c4397l = c14078l.purchase;
                        c4397l.yandex = null;
                        C3625l c3625l = c14078l.mopub;
                        String str = c3625l.f7563l;
                        String str2 = c3625l.f7563l;
                        if (str.length() > 0) {
                            if (c14078l.billing()) {
                                c4397l.yandex = null;
                                if (str2.length() > 0 && (numAmazon = c14078l.amazon()) != null) {
                                    int iIntValue = numAmazon.intValue();
                                    c14078l.adcel(iIntValue, iIntValue);
                                }
                            } else {
                                c4397l.yandex = null;
                                if (str2.length() > 0 && (numPurchase = c14078l.purchase()) != null) {
                                    int iIntValue2 = numPurchase.intValue();
                                    c14078l.adcel(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        C4397l c4397l2 = c14078l.purchase;
                        c4397l2.yandex = null;
                        C3625l c3625l2 = c14078l.mopub;
                        String str3 = c3625l2.f7563l;
                        String str4 = c3625l2.f7563l;
                        if (str3.length() > 0) {
                            if (c14078l.billing()) {
                                c4397l2.yandex = null;
                                if (str4.length() > 0 && (numPurchase2 = c14078l.purchase()) != null) {
                                    int iIntValue3 = numPurchase2.intValue();
                                    c14078l.adcel(iIntValue3, iIntValue3);
                                }
                            } else {
                                c4397l2.yandex = null;
                                if (str4.length() > 0 && (numAmazon2 = c14078l.amazon()) != null) {
                                    int iIntValue4 = numAmazon2.intValue();
                                    c14078l.adcel(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        c14078l.isPro();
                        break;
                    case 5:
                        c14078l.smaato();
                        break;
                    case 6:
                        c14078l.metrica();
                        break;
                    case 7:
                        c14078l.vip();
                        break;
                    case 8:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (c14078l.billing()) {
                                c14078l.metrica();
                            } else {
                                c14078l.vip();
                            }
                        }
                        break;
                    case 9:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (c14078l.billing()) {
                                c14078l.vip();
                            } else {
                                c14078l.metrica();
                            }
                        }
                        break;
                    case 10:
                        if (c14078l.mopub.f7563l.length() > 0 && (c0327l = c14078l.crashlytics) != null) {
                            int iMopub3 = c14078l.mopub(c0327l, -1);
                            c14078l.adcel(iMopub3, iMopub3);
                        }
                        break;
                    case 11:
                        if (c14078l.mopub.f7563l.length() > 0 && (c0327l2 = c14078l.crashlytics) != null) {
                            int iMopub4 = c14078l.mopub(c0327l2, 1);
                            c14078l.adcel(iMopub4, iMopub4);
                        }
                        break;
                    case 12:
                    case 48:
                        Unit unit3 = Unit.INSTANCE;
                        break;
                    case 13:
                        if (c14078l.mopub.f7563l.length() > 0 && (c11224l = c14078l.subs) != null) {
                            int iAdmob = c14078l.admob(c11224l, -1);
                            c14078l.adcel(iAdmob, iAdmob);
                        }
                        break;
                    case 14:
                        if (c14078l.mopub.f7563l.length() > 0 && (c11224l2 = c14078l.subs) != null) {
                            int iAdmob2 = c14078l.admob(c11224l2, 1);
                            c14078l.adcel(iAdmob2, iAdmob2);
                        }
                        break;
                    case 15:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            c14078l.adcel(0, 0);
                        }
                        break;
                    case 16:
                        c14078l.purchase.yandex = null;
                        C3625l c3625l3 = c14078l.mopub;
                        if (c3625l3.f7563l.length() > 0) {
                            int length = c3625l3.f7563l.length();
                            c14078l.adcel(length, length);
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        c10167l.loadAd.amazon(false);
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        c10167l.loadAd.startapp();
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        c10167l.loadAd.billing();
                        break;
                    case 20:
                        List listYandex = c14078l.yandex(new C5562l(i6));
                        if (listYandex != null) {
                            c10167l.yandex(listYandex);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        break;
                    case 21:
                        List listYandex2 = c14078l.yandex(new C5562l(i10));
                        if (listYandex2 != null) {
                            c10167l.yandex(listYandex2);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        break;
                    case 22:
                        List listYandex3 = c14078l.yandex(new C5562l(5));
                        if (listYandex3 != null) {
                            c10167l.yandex(listYandex3);
                            Unit unit6 = Unit.INSTANCE;
                        }
                        break;
                    case 23:
                        List listYandex4 = c14078l.yandex(new C5562l(6));
                        if (listYandex4 != null) {
                            c10167l.yandex(listYandex4);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        List listYandex5 = c14078l.yandex(new C5562l(7));
                        if (listYandex5 != null) {
                            c10167l.yandex(listYandex5);
                            Unit unit8 = Unit.INSTANCE;
                        }
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        List listYandex6 = c14078l.yandex(new C5562l(8));
                        if (listYandex6 != null) {
                            c10167l.yandex(listYandex6);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        c14078l.purchase.yandex = null;
                        C3625l c3625l4 = c14078l.mopub;
                        if (c3625l4.f7563l.length() > 0) {
                            c14078l.adcel(0, c3625l4.f7563l.length());
                        }
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        c14078l.subs();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        c14078l.remoteconfig();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        if (c14078l.mopub.f7563l.length() > 0 && (c0327l3 = c14078l.crashlytics) != null) {
                            int iMopub5 = c14078l.mopub(c0327l3, -1);
                            c14078l.adcel(iMopub5, iMopub5);
                        }
                        c14078l.startapp();
                        break;
                    case 30:
                        if (c14078l.mopub.f7563l.length() > 0 && (c0327l4 = c14078l.crashlytics) != null) {
                            int iMopub6 = c14078l.mopub(c0327l4, 1);
                            c14078l.adcel(iMopub6, iMopub6);
                        }
                        c14078l.startapp();
                        break;
                    case 31:
                        if (c14078l.mopub.f7563l.length() > 0 && (c11224l3 = c14078l.subs) != null) {
                            int iAdmob3 = c14078l.admob(c11224l3, -1);
                            c14078l.adcel(iAdmob3, iAdmob3);
                        }
                        c14078l.startapp();
                        break;
                    case 32:
                        if (c14078l.mopub.f7563l.length() > 0 && (c11224l4 = c14078l.subs) != null) {
                            int iAdmob4 = c14078l.admob(c11224l4, 1);
                            c14078l.adcel(iAdmob4, iAdmob4);
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            c14078l.adcel(0, 0);
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        c14078l.purchase.yandex = null;
                        C3625l c3625l5 = c14078l.mopub;
                        if (c3625l5.f7563l.length() > 0) {
                            int length2 = c3625l5.f7563l.length();
                            c14078l.adcel(length2, length2);
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        C4397l c4397l3 = c14078l.purchase;
                        c4397l3.yandex = null;
                        C3625l c3625l6 = c14078l.mopub;
                        String str5 = c3625l6.f7563l;
                        String str6 = c3625l6.f7563l;
                        if (str5.length() > 0) {
                            if (c14078l.billing()) {
                                c4397l3.yandex = null;
                                if (str6.length() > 0 && (numPurchase3 = c14078l.purchase()) != null) {
                                    int iIntValue5 = numPurchase3.intValue();
                                    c14078l.adcel(iIntValue5, iIntValue5);
                                }
                            } else {
                                c4397l3.yandex = null;
                                if (str6.length() > 0 && (numAmazon3 = c14078l.amazon()) != null) {
                                    int iIntValue6 = numAmazon3.intValue();
                                    c14078l.adcel(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        C4397l c4397l4 = c14078l.purchase;
                        c4397l4.yandex = null;
                        C3625l c3625l7 = c14078l.mopub;
                        String str7 = c3625l7.f7563l;
                        String str8 = c3625l7.f7563l;
                        if (str7.length() > 0) {
                            if (c14078l.billing()) {
                                c4397l4.yandex = null;
                                if (str8.length() > 0 && (numAmazon4 = c14078l.amazon()) != null) {
                                    int iIntValue7 = numAmazon4.intValue();
                                    c14078l.adcel(iIntValue7, iIntValue7);
                                }
                            } else {
                                c4397l4.yandex = null;
                                if (str8.length() > 0 && (numPurchase4 = c14078l.purchase()) != null) {
                                    int iIntValue8 = numPurchase4.intValue();
                                    c14078l.adcel(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        c14078l.isPro();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        c14078l.smaato();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        c14078l.metrica();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        c14078l.vip();
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (c14078l.billing()) {
                                c14078l.metrica();
                            } else {
                                c14078l.vip();
                            }
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            if (c14078l.billing()) {
                                c14078l.vip();
                            } else {
                                c14078l.metrica();
                            }
                        }
                        c14078l.startapp();
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        c14078l.purchase.yandex = null;
                        if (c14078l.mopub.f7563l.length() > 0) {
                            long j5 = c14078l.billing;
                            int i11 = C12814l.crashlytics;
                            int i12 = (int) (j5 & 4294967295L);
                            c14078l.adcel(i12, i12);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        if (c10167l.purchase) {
                            c9122l3.f18750l = c10167l.yandex.ad.f21224l.ads.loadAd(c10167l.smaato);
                        } else {
                            c10167l.yandex(Collections.singletonList(new C0597l("\n", 1)));
                        }
                        Unit unit10 = Unit.INSTANCE;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        if (c10167l.purchase) {
                            c9122l3.f18750l = false;
                        } else {
                            c10167l.yandex(Collections.singletonList(new C0597l("\t", 1)));
                        }
                        Unit unit11 = Unit.INSTANCE;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        C16399l c16399l = c10167l.admob;
                        if (c16399l != null) {
                            c16399l.yandex(C0639l.yandex(c14078l.admob, c14078l.mopub, c14078l.billing, 4));
                        }
                        C16399l c16399l2 = c10167l.admob;
                        if (c16399l2 != null) {
                            C13568l c13568l2 = c16399l2.yandex;
                            if (c13568l2 != null && (c13568l = (C13568l) c13568l2.f26581l) != null) {
                                c16399l2.yandex = c13568l;
                                c16399l2.crashlytics -= ((C0639l) c13568l2.f26580l).yandex.f7563l.length();
                                c16399l2.loadAd = new C13568l(c16399l2.loadAd, (C0639l) c13568l2.f26580l, 23);
                                c0639l = (C0639l) c13568l.f26580l;
                            }
                            if (r3 != 0) {
                                r3 = c0639l;
                                c10167l.firebase.invoke(r3);
                                Unit unit12 = Unit.INSTANCE;
                            }
                        }
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        C16399l c16399l3 = c10167l.admob;
                        if (c16399l3 != null) {
                            C13568l c13568l3 = c16399l3.loadAd;
                            if (c13568l3 != null) {
                                c16399l3.loadAd = (C13568l) c13568l3.f26581l;
                                C0639l c0639l3 = (C0639l) c13568l3.f26580l;
                                c16399l3.yandex = new C13568l(c16399l3.yandex, c0639l3, 23);
                                c16399l3.crashlytics = c0639l3.yandex.f7563l.length() + c16399l3.crashlytics;
                                c0639l2 = (C0639l) c13568l3.f26580l;
                            }
                            if (c0639l2 != null) {
                                c10167l.firebase.invoke(c0639l2);
                                Unit unit13 = Unit.INSTANCE;
                            }
                        }
                        break;
                    default:
                        C18725l.billing();
                        return null;
                }
                r3 = c0639l;
                return Unit.INSTANCE;
            case 13:
                final C16173l c16173l = (C16173l) obj2;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                Context context = (Context) obj3;
                C18624l c18624l = (C18624l) obj;
                c18624l.yandex();
                C12463l c12463l = c18624l.yandex;
                EnumC11323l enumC11323l = EnumC11323l.Autofill;
                boolean z2 = (C12814l.amazon(c16173l.vip().loadAd) || !c16173l.isPro() || c16173l.mopub == null) ? false : true;
                C0339l c0339l = new C0339l(interfaceC2262l, new C5806l(c16173l, r3, i7), z ? 1 : 0);
                Resources resources = context.getResources();
                C10261l c10261l = new C10261l(c0339l, r3, i7);
                if (z2) {
                    c12463l.yandex(new C5249l(AbstractC0135l.yandex, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, c10261l));
                }
                EnumC11323l enumC11323l2 = EnumC11323l.Autofill;
                boolean z3 = (C12814l.amazon(c16173l.vip().loadAd) || c16173l.mopub == null) ? false : true;
                C0339l c0339l2 = new C0339l(interfaceC2262l, new C5806l(c16173l, r3, i5), z ? 1 : 0);
                Resources resources2 = context.getResources();
                C10261l c10261l2 = new C10261l(c0339l2, r3, i7);
                if (z3) {
                    c12463l.yandex(new C5249l(AbstractC0135l.loadAd, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, c10261l2));
                }
                EnumC11323l enumC11323l3 = EnumC11323l.Autofill;
                boolean z4 = c16173l.isPro() && ((Boolean) c16173l.pro.getValue()).booleanValue() && c16173l.mopub != null;
                C0339l c0339l3 = new C0339l(interfaceC2262l, new C5806l(c16173l, r3, i6), z ? 1 : 0);
                Resources resources3 = context.getResources();
                C10261l c10261l3 = new C10261l(c0339l3, r3, i7);
                if (z4) {
                    c12463l.yandex(new C5249l(AbstractC0135l.crashlytics, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, c10261l3));
                }
                EnumC11323l enumC11323l4 = EnumC11323l.Autofill;
                boolean z5 = C12814l.purchase(c16173l.vip().loadAd) != c16173l.vip().yandex.f7563l.length();
                final int i13 = z ? 1 : 0;
                Function0 function0 = new Function0() { // from class: lِؗۨ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i14 = i13;
                        C16173l c16173l2 = c16173l;
                        switch (i14) {
                            case 0:
                                return Boolean.valueOf(!c16173l2.signatures);
                            case 1:
                                C0639l c0639lPurchase = C16173l.purchase(c16173l2.vip().yandex, AbstractC2296l.loadAd(0, c16173l2.vip().yandex.f7563l.length()));
                                c16173l2.crashlytics.invoke(c0639lPurchase);
                                long j6 = c0639lPurchase.loadAd;
                                c16173l2.license = new C12814l(j6);
                                c16173l2.tapsense = C0639l.yandex(c16173l2.tapsense, null, j6, 5);
                                c16173l2.admob(true);
                                return Unit.INSTANCE;
                            default:
                                Function0 function2 = c16173l2.billing;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                Function0 function2 = new Function0() { // from class: lِؗۨ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i14 = i7;
                        C16173l c16173l2 = c16173l;
                        switch (i14) {
                            case 0:
                                return Boolean.valueOf(!c16173l2.signatures);
                            case 1:
                                C0639l c0639lPurchase = C16173l.purchase(c16173l2.vip().yandex, AbstractC2296l.loadAd(0, c16173l2.vip().yandex.f7563l.length()));
                                c16173l2.crashlytics.invoke(c0639lPurchase);
                                long j6 = c0639lPurchase.loadAd;
                                c16173l2.license = new C12814l(j6);
                                c16173l2.tapsense = C0639l.yandex(c16173l2.tapsense, null, j6, 5);
                                c16173l2.admob(true);
                                return Unit.INSTANCE;
                            default:
                                Function0 function3 = c16173l2.billing;
                                if (function3 != null) {
                                    function3.invoke();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                C10261l c10261l4 = new C10261l(function2, function0, i7);
                if (z5) {
                    c12463l.yandex(new C5249l(AbstractC0135l.amazon, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c10261l4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    EnumC11323l enumC11323l5 = EnumC11323l.Autofill;
                    if (c16173l.isPro() && C12814l.amazon(c16173l.vip().loadAd)) {
                        z = true;
                    }
                    Function0 function3 = new Function0() { // from class: lِؗۨ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i14 = i5;
                            C16173l c16173l2 = c16173l;
                            switch (i14) {
                                case 0:
                                    return Boolean.valueOf(!c16173l2.signatures);
                                case 1:
                                    C0639l c0639lPurchase = C16173l.purchase(c16173l2.vip().yandex, AbstractC2296l.loadAd(0, c16173l2.vip().yandex.f7563l.length()));
                                    c16173l2.crashlytics.invoke(c0639lPurchase);
                                    long j6 = c0639lPurchase.loadAd;
                                    c16173l2.license = new C12814l(j6);
                                    c16173l2.tapsense = C0639l.yandex(c16173l2.tapsense, null, j6, 5);
                                    c16173l2.admob(true);
                                    return Unit.INSTANCE;
                                default:
                                    Function0 function4 = c16173l2.billing;
                                    if (function4 != null) {
                                        function4.invoke();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    C10261l c10261l5 = new C10261l(function3, r3, i7);
                    if (z) {
                        c12463l.yandex(new C5249l(enumC11323l5.f22827l, resources5.getString(enumC11323l5.f22826l), enumC11323l5.f22825l, c10261l5));
                    }
                }
                c18624l.yandex();
                return Unit.INSTANCE;
            case 14:
                C17078l c17078l = (C17078l) obj4;
                C12217l c12217l = (C12217l) obj2;
                c17078l.f33243l = AbstractC1848l.yandex(c12217l.firebase().crashlytics());
                ((C17078l) obj3).f33243l = 0L;
                c12217l.smaato.setValue(Boolean.TRUE);
                InterfaceC18212l interfaceC18212lAdcel = c12217l.adcel();
                c12217l.metrica.setValue(new C1187l(interfaceC18212lAdcel != null ? interfaceC18212lAdcel.amazon(0L) : 9205357640488583168L));
                c12217l.isVip(EnumC1826l.f4235l, c17078l.f33243l);
                return Unit.INSTANCE;
            case 15:
                C12217l c12217l2 = (C12217l) obj2;
                C9495l c9495l = (C9495l) obj3;
                C1187l c1187l = (C1187l) obj;
                ((C5514l) obj4).invoke();
                boolean z6 = c12217l2.isPro;
                C10312l c10312l = c12217l2.loadAd;
                if (z6 && c12217l2.subs) {
                    c9495l.invoke();
                    if (c12217l2.yandex.amazon().f12057l.length() > 0) {
                        c12217l2.license(true);
                    }
                    c12217l2.pro(EnumC6775l.f14201l);
                    c12217l2.Signature(AbstractC3700l.billing(c10312l, c10312l.yandex(c1187l.yandex)));
                }
                return Unit.INSTANCE;
            case 16:
                return yandex(obj);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) obj4;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj3;
                C0072l c0072l = (C0072l) obj2;
                C1336l c1336l4 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-1857214850, true, new C15272l(interfaceC2262l2, interfaceC12244l, c0072l)), 3);
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-776133387, true, new C3091l(interfaceC2262l2, c0072l, i4)), 3);
                Iterator it = C0072l.f976l.iterator();
                while (it.hasNext()) {
                    C8195l c8195l = ((C15093l) it.next()).yandex;
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(647438617, true, new C16561l(i3, c8195l)), 3);
                    List list = (List) c8195l.f17097l;
                    c1336l4.firebase(list.size(), null, new C1178l(2, list), new C15578l(802480018, true, new C3127l(list, c0072l, interfaceC12244l, i2)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC14165l abstractC14165l = (AbstractC14165l) obj4;
                AbstractC14165l abstractC14165l2 = (AbstractC14165l) obj2;
                AbstractC14165l abstractC14165l3 = (AbstractC14165l) obj3;
                InterfaceC4141l interfaceC4141l = (InterfaceC4141l) obj;
                if (interfaceC4141l instanceof C12477l) {
                    return abstractC14165l != null ? new C12477l(abstractC14165l) : (C12477l) interfaceC4141l;
                }
                if (!(interfaceC4141l instanceof C10710l)) {
                    return interfaceC4141l;
                }
                C10710l c10710l = (C10710l) interfaceC4141l;
                C14542l c14542l = c10710l.loadAd;
                if (c14542l.crashlytics instanceof C16012l) {
                    return abstractC14165l2 != null ? new C10710l(abstractC14165l2, c14542l) : c10710l;
                }
                return abstractC14165l3 != null ? new C10710l(abstractC14165l3, c14542l) : c10710l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                String str9 = (String) obj4;
                String str10 = (String) obj2;
                Map map = (Map) obj3;
                C0090l c0090l = (C0090l) obj;
                c0090l.mo214l("X-VK-Android-Client", "new");
                c0090l.mo214l("X-Screen", "nowhere");
                if (str9 != null) {
                    c0090l.mo214l("Authorization", "Bearer ".concat(str9));
                }
                if (str10 != null) {
                    c0090l.mo214l("User-Agent", str10);
                }
                for (Map.Entry entry : map.entrySet()) {
                    c0090l.mo214l((String) entry.getKey(), (String) entry.getValue());
                }
                return Unit.INSTANCE;
            case 20:
                return billing(obj);
            default:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
                Canvas canvas = AbstractC10071l.yandex;
                Canvas canvas2 = ((C2151l) interfaceC14859lM4555synchronized).yandex;
                int iSaveLayer = canvas2.saveLayer(null, null);
                AbstractC9361l.vip(interfaceC13349l, (C6906l) obj4, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC9361l.vip(interfaceC13349l, (C6906l) obj2, 0L, 0L, 0.0f, null, null, 6, 62);
                AbstractC9361l.vip(interfaceC13349l, (C6906l) obj3, 0L, 0L, 0.0f, null, null, 6, 62);
                canvas2.restoreToCount(iSaveLayer);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C6411l(InterfaceC12244l interfaceC12244l, Object obj, InterfaceC12244l interfaceC12244l2, int i) {
        this.f13394l = i;
        this.f13395l = interfaceC12244l;
        this.f13393l = obj;
        this.f13392l = interfaceC12244l2;
    }

    public /* synthetic */ C6411l(Object obj, InterfaceC2262l interfaceC2262l, Context context, int i) {
        this.f13394l = i;
        this.f13392l = obj;
        this.f13393l = interfaceC2262l;
        this.f13395l = context;
    }

    public /* synthetic */ C6411l(Object obj, Object obj2, Object obj3, int i) {
        this.f13394l = i;
        this.f13393l = obj;
        this.f13392l = obj2;
        this.f13395l = obj3;
    }

    public /* synthetic */ C6411l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f13394l = i;
        this.f13393l = obj;
        this.f13392l = obj2;
        this.f13395l = obj4;
    }
}
