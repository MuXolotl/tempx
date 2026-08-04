package defpackage;

import android.text.Layout;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1040l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2881l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f2882l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2883l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f2884l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2885l;

    public /* synthetic */ C1040l(long j, float[] fArr, C9987l c9987l, C13250l c13250l) {
        this.f2883l = 3;
        this.f2882l = j;
        this.f2881l = fArr;
        this.f2885l = c9987l;
        this.f2884l = c13250l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        C7546l c7546l;
        boolean z;
        float fYandex;
        float fYandex2;
        float fYandex3;
        C16918l c16918l;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i = this.f2883l;
        long j2 = this.f2882l;
        int i2 = 4;
        Object obj2 = this.f2884l;
        boolean z2 = false;
        Object obj3 = this.f2885l;
        boolean z3 = true;
        Object obj4 = this.f2881l;
        switch (i) {
            case 0:
                C13157l c13157l = (C13157l) obj4;
                List list = (List) obj3;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2146524009, true, new C5214l(c13157l, 1)), 3);
                if (((Boolean) c13157l.f25773l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1800034468, true, new C5214l(c13157l, 2)), 3);
                    c1336l.firebase(list.size(), null, new Creturn(list, 6, false), new C15578l(802480018, true, new C15354l(list, c13157l, this.f2882l, interfaceC8714l)));
                    if (((EnumC4948l) c13157l.f25771l.getValue()) == EnumC4948l.f10079l) {
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1577076767, true, new C5214l(c13157l, 3)), 3);
                    }
                } else {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(59876211, true, new C5214l(c13157l, i2)), 3);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                C11925l c11925l = (C11925l) obj;
                c11925l.admob(1);
                interfaceC13349l.subscription(AbstractC14707l.billing(interfaceC13349l.admob()), c11925l, new C0464l((C12870l) obj3, (AbstractC9544l) obj2, 17));
                if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || C1187l.loadAd(j2, 0L)) {
                    AbstractC2576l.loadAd(interfaceC13349l, c11925l);
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        AbstractC2576l.loadAd(interfaceC13349l, c11925l);
                    } finally {
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C8896l c8896l = (C8896l) obj4;
                C10700l c10700l = (C10700l) obj3;
                long j3 = this.f2882l;
                AbstractC8939l abstractC8939l = (AbstractC8939l) obj2;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                float f = c8896l.yandex;
                float f2 = c8896l.loadAd;
                C13601l c13601l = c6742l.f14144l;
                ((C16543l) c13601l.f26629l.f36010l).inmobi(f, f2);
                try {
                    AbstractC9361l.subs(c6742l, (C14115l) c10700l.f21708l, j3, 0L, 0.0f, abstractC8939l, 0, 890);
                    return Unit.INSTANCE;
                } finally {
                    ((C16543l) c13601l.f26629l.f36010l).inmobi(-f, -f2);
                }
            case 3:
                float[] fArr = (float[]) obj4;
                C9987l c9987l = (C9987l) obj3;
                C13250l c13250l = (C13250l) obj2;
                C5048l c5048l = (C5048l) obj;
                int i3 = c5048l.loadAd;
                C7546l c7546l2 = c5048l.yandex;
                int iBilling = c5048l.crashlytics;
                int iMopub = i3 > C12814l.mopub(j2) ? c5048l.loadAd : C12814l.mopub(j2);
                if (iBilling >= C12814l.billing(j2)) {
                    iBilling = C12814l.billing(j2);
                }
                long jLoadAd = AbstractC2296l.loadAd(c5048l.amazon(iMopub), c5048l.amazon(iBilling));
                int i4 = c9987l.f20387l;
                C18118l c18118l = (C18118l) c7546l2.f15549l;
                int iMopub2 = C12814l.mopub(jLoadAd);
                int iBilling2 = C12814l.billing(jLoadAd);
                Layout layout = c18118l.billing;
                int length = layout.getText().length();
                if (iMopub2 < 0) {
                    AbstractC1786l.yandex("startOffset must be > 0");
                }
                if (iMopub2 >= length) {
                    AbstractC1786l.yandex("startOffset must be less than text length");
                }
                if (iBilling2 <= iMopub2) {
                    AbstractC1786l.yandex("endOffset must be greater than startOffset");
                }
                if (iBilling2 > length) {
                    AbstractC1786l.yandex("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (iBilling2 - iMopub2) * 4) {
                    AbstractC1786l.yandex("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iMopub3 = c18118l.mopub(iMopub2);
                int iMopub4 = c18118l.mopub(iBilling2 - 1);
                C0463l c0463l = new C0463l(c18118l);
                if (iMopub3 <= iMopub4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iMopub3);
                        int iBilling3 = c18118l.billing(iMopub3);
                        int iMax = Math.max(iMopub2, lineStart);
                        int iMin = Math.min(iBilling2, iBilling3);
                        float fSubs = c18118l.subs(iMopub3);
                        float fPurchase = c18118l.purchase(iMopub3);
                        j = jLoadAd;
                        boolean z4 = z3;
                        boolean z5 = layout.getParagraphDirection(iMopub3) == z4 ? z4 : z2;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z5 || zIsRtlCharAt) {
                                z = z5;
                                if (z && zIsRtlCharAt) {
                                    fYandex3 = c0463l.yandex(iMax, false, false, false);
                                    fYandex = c0463l.yandex(iMax + 1, z4, z4, false);
                                } else {
                                    if (z || !zIsRtlCharAt) {
                                        fYandex = c0463l.yandex(iMax, false, false, false);
                                        fYandex2 = c0463l.yandex(iMax + 1, z4, z4, false);
                                    } else {
                                        fYandex2 = c0463l.yandex(iMax, false, false, z4);
                                        fYandex = c0463l.yandex(iMax + 1, z4, z4, z4);
                                    }
                                    fYandex3 = fYandex2;
                                }
                            } else {
                                z = z5;
                                boolean z6 = z2;
                                fYandex = c0463l.yandex(iMax, z6, z6, z4);
                                fYandex3 = c0463l.yandex(iMax + 1, z4, z4, z4);
                            }
                            fArr[i4] = fYandex;
                            fArr[i4 + 1] = fSubs;
                            fArr[i4 + 2] = fYandex3;
                            fArr[i4 + 3] = fPurchase;
                            i4 += 4;
                            iMax++;
                            z5 = z;
                            c7546l2 = c7546l2;
                            z4 = true;
                            z2 = false;
                        }
                        c7546l = c7546l2;
                        if (iMopub3 != iMopub4) {
                            iMopub3++;
                            jLoadAd = j;
                            c7546l2 = c7546l;
                            z2 = false;
                            z3 = true;
                        }
                    }
                } else {
                    j = jLoadAd;
                    c7546l = c7546l2;
                }
                int iPurchase = (C12814l.purchase(j) * 4) + c9987l.f20387l;
                for (int i5 = c9987l.f20387l; i5 < iPurchase; i5 += 4) {
                    int i6 = i5 + 1;
                    float f3 = fArr[i6];
                    float f4 = c13250l.f26029l;
                    fArr[i6] = f3 + f4;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f4;
                }
                c9987l.f20387l = iPurchase;
                c13250l.f26029l = c7546l.subs() + c13250l.f26029l;
                return Unit.INSTANCE;
            case 4:
                C9111l c9111l = (C9111l) obj2;
                long j4 = this.f2882l;
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                float fFloatValue = ((Number) ((InterfaceC12244l) obj4).getValue()).floatValue();
                ((C1072l) obj3).getClass();
                float fMo868instanceof = interfaceC13349l2.mo868instanceof(4.0f);
                float fMo868instanceof2 = interfaceC13349l2.mo868instanceof(5.0f);
                float fMo868instanceof3 = interfaceC13349l2.mo868instanceof(14.0f);
                float fTapsense = AbstractC10310l.tapsense(fMo868instanceof, 0.0f, fFloatValue);
                float fTapsense2 = AbstractC10310l.tapsense(fMo868instanceof2, fMo868instanceof3 / 1.75f, fFloatValue);
                float fFloatValue2 = (fFloatValue == 1.0f ? Integer.valueOf(AbstractC5573l.ads(fTapsense2)) : Float.valueOf(fTapsense2)).floatValue();
                float fTapsense3 = AbstractC10310l.tapsense(0.0f, fFloatValue2, fFloatValue);
                float f5 = (fFloatValue2 * 2.0f) + fTapsense;
                float f6 = fTapsense + fFloatValue2;
                float fTapsense4 = AbstractC10310l.tapsense(f5, f6, fFloatValue);
                C9902l c9902l = c9111l.loadAd;
                C10086l c10086l = c9111l.yandex;
                C9902l c9902l2 = c9111l.crashlytics;
                c9902l.admob();
                c9902l.billing(0.0f, 0.0f);
                float f7 = -fMo868instanceof3;
                c9902l.purchase(fTapsense3, f7);
                c9902l.purchase(fFloatValue2, f7);
                c9902l.purchase(fFloatValue2, 0.0f);
                c9902l.loadAd();
                c9902l2.admob();
                c9902l2.billing(f6, 0.0f);
                c9902l2.purchase(f6, f7);
                c9902l2.purchase(fTapsense4, f7);
                c9902l2.purchase(f5, 0.0f);
                c9902l2.loadAd();
                float fTapsense5 = AbstractC10310l.tapsense(0.0f, fMo868instanceof3 / 8.0f, fFloatValue);
                ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(fTapsense5, 0.0f);
                try {
                    if (((Boolean) c10086l.getValue()).booleanValue()) {
                        fFloatValue = 1.0f - fFloatValue;
                    }
                    float f8 = ((Boolean) c10086l.getValue()).booleanValue() ? 90.0f : 0.0f;
                    float fTapsense6 = AbstractC10310l.tapsense(f8, 90.0f + f8, fFloatValue);
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)) / 2.0f;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC13349l2.admob() & 4294967295L)) / 2.0f;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat3);
                    long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                    C18449l c18449lMo2065break = interfaceC13349l2.mo2065break();
                    long jM4551private = c18449lMo2065break.m4551private();
                    c18449lMo2065break.m4555synchronized().mopub();
                    try {
                        try {
                            ((C16543l) c18449lMo2065break.f36010l).advert(fTapsense6, jFloatToRawIntBits3);
                            float fRint = (float) Math.rint((Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)) / 2.0f) - (f5 / 2.0f));
                            float fRint2 = (float) Math.rint((fMo868instanceof3 / 2.0f) + (Float.intBitsToFloat((int) (interfaceC13349l2.admob() & 4294967295L)) / 2.0f));
                            ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(fRint, fRint2);
                            try {
                                try {
                                    AbstractC9361l.remoteconfig(interfaceC13349l2, c9111l.loadAd, j4, 0.0f, null, 60);
                                    AbstractC9361l.remoteconfig(interfaceC13349l2, c9902l2, j4, 0.0f, null, 60);
                                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fRint, -fRint2);
                                    c18449lMo2065break.m4555synchronized().ads();
                                    c18449lMo2065break.m4534abstract(jM4551private);
                                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fTapsense5, -0.0f);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fRint, -fRint2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            jFloatToRawIntBits2 = jM4551private;
                            c18449lMo2065break.m4555synchronized().ads();
                            c18449lMo2065break.m4534abstract(jFloatToRawIntBits2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c18449lMo2065break.m4555synchronized().ads();
                        c18449lMo2065break.m4534abstract(jFloatToRawIntBits2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fTapsense5, -0.0f);
                    throw th5;
                }
                break;
            case 5:
                C7473l c7473l = (C7473l) obj4;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj3;
                long j5 = this.f2882l;
                C9902l c9902l3 = (C9902l) obj2;
                InterfaceC13349l interfaceC13349l3 = (InterfaceC13349l) obj;
                float fYandex4 = c7473l.yandex() / c7473l.mopub.admob();
                float fMax = (Math.max(Math.min(1.0f, fYandex4) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fAbs = Math.abs(fYandex4) - 1.0f;
                if (fAbs < 0.0f) {
                    fAbs = 0.0f;
                }
                if (fAbs > 2.0f) {
                    fAbs = 2.0f;
                }
                float fPow = (((fMax * 0.4f) - 0.25f) + (fAbs - (((float) Math.pow(fAbs, 2.0d)) / 4.0f))) * 0.5f;
                float f9 = fPow * 360.0f;
                float f10 = ((fMax * 0.8f) + fPow) * 360.0f;
                C4033l c4033l = new C4033l(fPow, f9, f10, Math.min(1.0f, fMax));
                float fFloatValue3 = ((Number) interfaceC12244l.getValue()).floatValue();
                long jMo2070l = interfaceC13349l3.mo2070l();
                C18449l c18449lMo2065break2 = interfaceC13349l3.mo2065break();
                long jM4551private2 = c18449lMo2065break2.m4551private();
                c18449lMo2065break2.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449lMo2065break2.f36010l).advert(fPow, jMo2070l);
                    float fMo868instanceof4 = interfaceC13349l3.mo868instanceof(AbstractC9962l.loadAd);
                    float f11 = AbstractC9962l.crashlytics;
                    float fMo868instanceof5 = (interfaceC13349l3.mo868instanceof(f11) / 2.0f) + fMo868instanceof4;
                    C8896l c8896l2 = new C8896l(Float.intBitsToFloat((int) (AbstractC8532l.mopub(interfaceC13349l3.admob()) >> 32)) - fMo868instanceof5, Float.intBitsToFloat((int) (AbstractC8532l.mopub(interfaceC13349l3.admob()) & 4294967295L)) - fMo868instanceof5, Float.intBitsToFloat((int) (AbstractC8532l.mopub(interfaceC13349l3.admob()) >> 32)) + fMo868instanceof5, Float.intBitsToFloat((int) (AbstractC8532l.mopub(interfaceC13349l3.admob()) & 4294967295L)) + fMo868instanceof5);
                    interfaceC13349l3.applovin(j5, f9, f10 - f9, c8896l2.admob(), c8896l2.mopub(), (768 & 64) != 0 ? 1.0f : fFloatValue3, new C0404l(interfaceC13349l3.mo868instanceof(f11), 0.0f, 2, 0, null, 26));
                    AbstractC9962l.crashlytics(interfaceC13349l3, c9902l3, c8896l2, j5, fFloatValue3, c4033l);
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449lMo2065break2, jM4551private2);
                }
            case 6:
                long j6 = this.f2882l;
                C9902l c9902l4 = (C9902l) obj2;
                InterfaceC13349l interfaceC13349l4 = (InterfaceC13349l) obj;
                float fInvoke = ((InterfaceC6477l) obj4).invoke();
                float fMax2 = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fAmazon = AbstractC8576l.amazon(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow2 = (((fMax2 * 0.4f) - 0.25f) + (fAmazon - (((float) Math.pow(fAmazon, 2.0d)) / 4.0f))) * 0.5f;
                float f12 = fPow2 * 360.0f;
                float f13 = ((fMax2 * 0.8f) + fPow2) * 360.0f;
                C4033l c4033l2 = new C4033l(fPow2, f12, f13, Math.min(1.0f, fMax2));
                float fFloatValue4 = ((Number) ((InterfaceC12244l) obj3).getValue()).floatValue();
                long jMo2070l2 = interfaceC13349l4.mo2070l();
                C18449l c18449lMo2065break3 = interfaceC13349l4.mo2065break();
                long jM4551private3 = c18449lMo2065break3.m4551private();
                c18449lMo2065break3.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449lMo2065break3.f36010l).advert(fPow2, jMo2070l2);
                    C8896l c8896lSubs = AbstractC7470l.subs((interfaceC13349l4.mo868instanceof(2.5f) / 2.0f) + interfaceC13349l4.mo868instanceof(5.5f), AbstractC8532l.mopub(interfaceC13349l4.admob()));
                    interfaceC13349l4.applovin(j6, f12, f13 - f12, c8896lSubs.admob(), c8896lSubs.mopub(), (768 & 64) != 0 ? 1.0f : fFloatValue4, new C0404l(interfaceC13349l4.mo868instanceof(2.5f), 0.0f, 0, 0, null, 26));
                    AbstractC9256l.crashlytics(interfaceC13349l4, c9902l4, c8896lSubs, j6, fFloatValue4, c4033l2);
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449lMo2065break3, jM4551private3);
                }
            default:
                InterfaceC16711l interfaceC16711l = (InterfaceC16711l) obj3;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj2;
                C11595l c11595l = (C11595l) obj;
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) ((Function0) obj4).invoke();
                if (interfaceC18212l != null && interfaceC18212l.mopub()) {
                    long j7 = c11595l.crashlytics;
                    long j8 = c11595l.yandex;
                    long j9 = c11595l.loadAd;
                    long j10 = c11595l.amazon;
                    float[] fArr2 = c11595l.billing;
                    if (fArr2 != null) {
                        float f14 = (int) (j8 >> 32);
                        float f15 = (int) j8;
                        float f16 = (int) (j9 >> 32);
                        float f17 = (int) j9;
                        C8896l c8896l3 = new C8896l(f14, f15, f16, f17);
                        if (fArr2.length >= 16) {
                            float f18 = fArr2[0];
                            float f19 = fArr2[1];
                            float f20 = fArr2[3];
                            float f21 = fArr2[4];
                            float f22 = fArr2[5];
                            float f23 = fArr2[7];
                            float f24 = fArr2[12];
                            float f25 = fArr2[13];
                            float f26 = fArr2[15];
                            float f27 = f20 * f14;
                            float f28 = f23 * f15;
                            float f29 = 1.0f / ((f27 + f28) + f26);
                            if ((Float.floatToRawIntBits(f29) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                f29 = 0.0f;
                            }
                            float f30 = f18 * f14;
                            float f31 = f21 * f15;
                            float f32 = (f30 + f31 + f24) * f29;
                            float f33 = f14 * f19;
                            float f34 = f15 * f22;
                            float f35 = (f33 + f34 + f25) * f29;
                            float f36 = f23 * f17;
                            float f37 = 1.0f / ((f27 + f36) + f26);
                            if ((Float.floatToRawIntBits(f37) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                f37 = 0.0f;
                            }
                            float f38 = f21 * f17;
                            float f39 = (f30 + f38 + f24) * f37;
                            float f40 = f22 * f17;
                            float f41 = (f33 + f40 + f25) * f37;
                            float f42 = f20 * f16;
                            float f43 = 1.0f / ((f42 + f28) + f26);
                            float f44 = f43;
                            if ((Float.floatToRawIntBits(f43) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                f44 = 0.0f;
                            }
                            float f45 = f18 * f16;
                            float f46 = (f45 + f31 + f24) * f44;
                            float f47 = f19 * f16;
                            float f48 = (f47 + f34 + f25) * f44;
                            float f49 = 1.0f / ((f42 + f36) + f26);
                            float f50 = f49;
                            if ((Float.floatToRawIntBits(f49) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                f50 = 0.0f;
                            }
                            float f51 = (f45 + f38 + f24) * f50;
                            float f52 = (f47 + f40 + f25) * f50;
                            c8896l3 = new C8896l(Math.min(f32, Math.min(f39, Math.min(f46, f51))), Math.min(f35, Math.min(f41, Math.min(f48, f52))), Math.max(f32, Math.max(f39, Math.max(f46, f51))), Math.max(f35, Math.max(f41, Math.max(f48, f52))));
                        }
                        C16918l c16918lSubs = AbstractC14231l.subs(c8896l3);
                        int i8 = (int) (j7 >> 32);
                        int i9 = (int) (j7 & 4294967295L);
                        c16918l = new C16918l(c16918lSubs.yandex + i8, c16918lSubs.loadAd + i9, c16918lSubs.crashlytics + i8, c16918lSubs.amazon + i9);
                    } else {
                        j2 = j2;
                        interfaceC16711l = interfaceC16711l;
                        int i10 = (int) (j10 >> 32);
                        int i11 = (int) (j10 & 4294967295L);
                        c16918l = new C16918l(((int) (j8 >> 32)) + i10, ((int) j8) + i11, ((int) (j9 >> 32)) + i10, ((int) j9) + i11);
                    }
                    long jStartapp = interfaceC18212l.startapp(0L);
                    float f53 = ((int) (j9 >> 32)) - ((int) (j8 >> 32));
                    float f54 = ((int) j9) - ((int) j8);
                    C8896l c8896lIsPro = AbstractC7470l.isPro(jStartapp, AbstractC14707l.mopub(interfaceC18212l.smaato()));
                    int i12 = (int) (j2 >> 32);
                    boolean z7 = ((float) c16918l.loadAd) > Float.intBitsToFloat((int) (jStartapp & 4294967295L));
                    Float.intBitsToFloat((int) (jStartapp >> 32));
                    boolean z8 = interfaceC16711l instanceof C14421l;
                    float f55 = (!z8 ? z7 : z7) ? f54 : 0.0f;
                    if (z8) {
                        jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC15645l.purchase(f53, i12, c8896lIsPro));
                        iFloatToRawIntBits = Float.floatToRawIntBits(f55);
                    } else {
                        jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC15645l.purchase(f53, i12, c8896lIsPro));
                        iFloatToRawIntBits = Float.floatToRawIntBits(f55);
                    }
                    long j11 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                    float[] fArrYandex = C10924l.yandex();
                    C10924l.isPro(fArrYandex, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
                    if (z8) {
                        if (z7) {
                            C10924l.purchase(fArrYandex);
                        }
                    } else if (z7) {
                        C10924l.purchase(fArrYandex);
                    }
                    interfaceC8714l2.setValue(new C10924l(fArrYandex));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1040l(InterfaceC13349l interfaceC13349l, long j, C12870l c12870l, AbstractC9544l abstractC9544l) {
        this.f2883l = 1;
        this.f2881l = interfaceC13349l;
        this.f2882l = j;
        this.f2885l = c12870l;
        this.f2884l = abstractC9544l;
    }

    public /* synthetic */ C1040l(InterfaceC12244l interfaceC12244l, C1072l c1072l, C9111l c9111l, long j) {
        this.f2883l = 4;
        this.f2881l = interfaceC12244l;
        this.f2885l = c1072l;
        this.f2884l = c9111l;
        this.f2882l = j;
    }

    public /* synthetic */ C1040l(Object obj, Object obj2, long j, Object obj3, int i) {
        this.f2883l = i;
        this.f2881l = obj;
        this.f2885l = obj2;
        this.f2882l = j;
        this.f2884l = obj3;
    }

    public /* synthetic */ C1040l(Function0 function0, long j, InterfaceC16711l interfaceC16711l, EnumC9931l enumC9931l, InterfaceC8714l interfaceC8714l) {
        this.f2883l = 7;
        this.f2881l = function0;
        this.f2882l = j;
        this.f2885l = interfaceC16711l;
        this.f2884l = interfaceC8714l;
    }
}
