package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18615l extends AbstractC0775l {
    public boolean admob;
    public final appmetrica amazon;
    public boolean billing;
    public final AbstractC14790l crashlytics;
    public int mopub;
    public int purchase = -1;
    public long[] subs;

    public C18615l(AbstractC14790l abstractC14790l, appmetrica appmetricaVar) {
        this.crashlytics = abstractC14790l;
        this.amazon = appmetricaVar;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int Signature(InterfaceC18035l interfaceC18035l) {
        return AbstractC15613l.loadAd(interfaceC18035l, this.amazon.adcel(this.subs));
    }

    public int admob(InterfaceC18035l interfaceC18035l) {
        int iLoadAd;
        long[] jArrPurchase;
        long[] jArrPurchase2;
        int i;
        int i2;
        long jM160throws;
        int iMopub;
        int i3;
        int i4;
        long jM160throws2;
        AbstractC14790l abstractC14790l = this.crashlytics;
        C16215l c16215l = abstractC14790l.yandex;
        boolean z = c16215l.yandex;
        int i5 = 255;
        int i6 = 1;
        appmetrica appmetricaVar = this.amazon;
        int i7 = -1;
        if (z) {
            while (true) {
                if ((!this.billing && appmetricaVar.advert() == i5) || (this.billing && this.mopub >= this.purchase)) {
                    return i7;
                }
                C12823l c12823lAds = appmetricaVar.ads();
                String strCrashlytics = (String) c12823lAds.f25200l;
                Long l = (Long) c12823lAds.f25199l;
                C12339l c12339l = (C12339l) c12823lAds.f25198l;
                long[] jArr = c12339l != null ? c12339l.f24434l : null;
                if (strCrashlytics == null && l != null) {
                    strCrashlytics = AbstractC15613l.crashlytics(interfaceC18035l, l.longValue());
                }
                C12339l c12339l2 = jArr != null ? new C12339l(jArr) : null;
                long[] jArr2 = c12339l2 != null ? c12339l2.f24434l : null;
                this.mopub += i6;
                iLoadAd = strCrashlytics != null ? interfaceC18035l.amazon(strCrashlytics) : -3;
                if (iLoadAd == -3) {
                    C6129l c6129l = (C6129l) appmetricaVar.f492l;
                    ArrayList arrayList = new ArrayList();
                    appmetricaVar.isVip(jArr2);
                    do {
                        int iAdvert = appmetricaVar.advert();
                        int i8 = iAdvert & 224;
                        int i9 = i6;
                        if ((iAdvert & 31) == 31 && (i8 == 128 || i8 == 160 || i8 == 64 || i8 == 96)) {
                            arrayList.add(Integer.valueOf(i7));
                        } else {
                            if (appmetricaVar.advert() == i5) {
                                Integer num = (Integer) AbstractC3984l.signatures(arrayList);
                                if (num == null || num.intValue() != i7) {
                                    throw AbstractC14231l.yandex(appmetricaVar.advert(), "next data item");
                                }
                                appmetrica.signatures(arrayList);
                            } else {
                                int iAdvert2 = appmetricaVar.advert() & 224;
                                int iAdvert3 = appmetricaVar.advert();
                                i = i7;
                                int i10 = iAdvert3 & 224;
                                int i11 = iAdvert3 & 31;
                                if (i10 == 64 || i10 == 96 || i10 == 128) {
                                    int iAdvert4 = appmetricaVar.advert() & 31;
                                    if (iAdvert4 <= 23) {
                                        jM160throws = iAdvert4;
                                    } else {
                                        switch (iAdvert4) {
                                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                                i2 = i9;
                                                break;
                                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                                i2 = 2;
                                                break;
                                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                                i2 = 4;
                                                break;
                                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                i2 = 8;
                                                break;
                                            default:
                                                C18353l.remoteconfig(iAdvert4, AbstractC15613l.amazon(i10).concat(" length"), AbstractC14231l.admob(appmetricaVar.advert()));
                                                return 0;
                                        }
                                        jM160throws = appmetrica.m160throws(c6129l, i2);
                                    }
                                    iMopub = appmetrica.mopub(i10, jM160throws, Alert.DURATION_SHOW_INDEFINITELY);
                                } else if (i10 != 160) {
                                    switch (i11) {
                                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                            iMopub = i9;
                                            break;
                                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                            iMopub = 2;
                                            break;
                                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                            iMopub = 4;
                                            break;
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                            iMopub = 8;
                                            break;
                                        default:
                                            iMopub = 0;
                                            break;
                                    }
                                } else {
                                    int iAdvert5 = appmetricaVar.advert() & 31;
                                    if (iAdvert5 <= 23) {
                                        jM160throws2 = iAdvert5;
                                    } else {
                                        switch (iAdvert5) {
                                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                                i4 = i9;
                                                break;
                                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                                i4 = 2;
                                                break;
                                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                                i4 = 4;
                                                break;
                                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                i4 = 8;
                                                break;
                                            default:
                                                C18353l.startapp(AbstractC2812l.Signature("Unexpected value encoding when reading map length. Expected addition info value < 28, got ", iAdvert5, " (decoded from "), AbstractC14231l.admob(appmetricaVar.advert()));
                                                return 0;
                                        }
                                        jM160throws2 = appmetrica.m160throws(c6129l, i4);
                                    }
                                    iMopub = appmetrica.mopub(i10, jM160throws2, 1073741823) * 2;
                                }
                                if (iAdvert2 == 128 || iAdvert2 == 160) {
                                    if (iMopub > 0) {
                                        arrayList.add(Integer.valueOf(iMopub));
                                    } else {
                                        appmetrica.signatures(arrayList);
                                    }
                                } else if (iAdvert2 != 192) {
                                    c6129l.loadAd += iMopub;
                                    appmetrica.signatures(arrayList);
                                } else {
                                    int iAdvert6 = appmetricaVar.advert() & 31;
                                    if (iAdvert6 > 23) {
                                        switch (iAdvert6) {
                                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                                i3 = i9;
                                                break;
                                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                                i3 = 2;
                                                break;
                                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                                i3 = 4;
                                                break;
                                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                i3 = 8;
                                                break;
                                            default:
                                                C18353l.startapp(AbstractC2812l.Signature("Unexpected value encoding when reading tag. Expected addition info value < 28, got ", iAdvert6, " (decoded from "), AbstractC14231l.admob(appmetricaVar.advert()));
                                                return 0;
                                        }
                                        appmetrica.m160throws(c6129l, i3);
                                    }
                                }
                            }
                            appmetricaVar.appmetrica();
                            i6 = i9;
                            i7 = i;
                            i5 = 255;
                        }
                        i = i7;
                        appmetricaVar.appmetrica();
                        i6 = i9;
                        i7 = i;
                        i5 = 255;
                    } while (!arrayList.isEmpty());
                } else if (abstractC14790l.yandex.purchase && (jArrPurchase2 = AbstractC1295l.purchase(interfaceC18035l, iLoadAd)) != null) {
                    appmetrica.m151continue(jArrPurchase2, jArr2);
                }
            }
        } else {
            if ((!this.billing && appmetricaVar.advert() == 255) || (this.billing && this.mopub >= this.purchase)) {
                return -1;
            }
            C12823l c12823lAds2 = appmetricaVar.ads();
            String strCrashlytics2 = (String) c12823lAds2.f25200l;
            Long l2 = (Long) c12823lAds2.f25199l;
            C12339l c12339l3 = (C12339l) c12823lAds2.f25198l;
            long[] jArr3 = c12339l3 != null ? c12339l3.f24434l : null;
            if (strCrashlytics2 == null && l2 != null && (strCrashlytics2 = AbstractC15613l.crashlytics(interfaceC18035l, l2.longValue())) == null) {
                throw new C5016l("CborLabel unknown: " + l2.longValue() + " for " + interfaceC18035l);
            }
            if (strCrashlytics2 == null) {
                throw new C5016l("Expected (tagged) string or number, got nothing for " + interfaceC18035l);
            }
            C12339l c12339l4 = jArr3 != null ? new C12339l(jArr3) : null;
            long[] jArr4 = c12339l4 != null ? c12339l4.f24434l : null;
            this.mopub++;
            iLoadAd = AbstractC15613l.loadAd(interfaceC18035l, strCrashlytics2);
            if (abstractC14790l.yandex.purchase && (jArrPurchase = AbstractC1295l.purchase(interfaceC18035l, iLoadAd)) != null) {
                appmetrica.m151continue(jArrPurchase, jArr4);
            }
        }
        this.admob = AbstractC1295l.subs(interfaceC18035l, iLoadAd);
        this.subs = c16215l.billing ? AbstractC1295l.mopub(interfaceC18035l, iLoadAd) : null;
        return iLoadAd;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final short applovin() {
        return (short) this.amazon.startapp(this.subs, -32768L, 32767L, 65535L, "Short");
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final float appmetrica() {
        float fYandex;
        appmetrica appmetricaVar = this.amazon;
        C6129l c6129l = (C6129l) appmetricaVar.f492l;
        appmetricaVar.isVip(this.subs);
        int iAdvert = appmetricaVar.advert();
        if (iAdvert == 249) {
            appmetrica.firebase(c6129l, 2);
            fYandex = AbstractC15613l.yandex((short) ((c6129l.loadAd() << 8) | c6129l.loadAd()));
        } else {
            if (iAdvert != 250) {
                throw AbstractC14231l.yandex(iAdvert, "float header");
            }
            appmetrica.firebase(c6129l, 4);
            int iLoadAd = 0;
            for (int i = 0; i < 4; i++) {
                iLoadAd = (iLoadAd << 8) | c6129l.loadAd();
            }
            fYandex = Float.intBitsToFloat(iLoadAd);
        }
        appmetricaVar.appmetrica();
        return fYandex;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final char billing() {
        return (char) this.amazon.startapp(this.subs, 0L, 65535L, -1L, "Char");
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        C18615l c12474l;
        boolean zAdmob = AbstractC1295l.admob(interfaceC18035l);
        appmetrica appmetricaVar = this.amazon;
        AbstractC14790l abstractC14790l = this.crashlytics;
        if (zAdmob) {
            c12474l = new C12474l(abstractC14790l, appmetricaVar);
        } else {
            AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
            if (AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon) || (abstractC2021lBilling instanceof C0196l)) {
                c12474l = new C12474l(abstractC14790l, appmetricaVar);
            } else {
                c12474l = AbstractC8576l.yandex(abstractC2021lBilling, C2861l.amazon) ? new C2472l(abstractC14790l, appmetricaVar) : new C18615l(abstractC14790l, appmetricaVar);
            }
        }
        long[] jArrBilling = abstractC14790l.yandex.mopub ? AbstractC1295l.billing(interfaceC18035l) : null;
        long[] jArr = this.subs;
        if (jArr != null) {
            if (jArrBilling == null) {
                jArrBilling = jArr;
            } else {
                C13698l c13698l = new C13698l((byte) 0, 13);
                c13698l.firebase(jArr);
                c13698l.firebase(jArrBilling);
                long[] jArr2 = (long[]) c13698l.f26746l;
                jArrBilling = new long[c13698l.m3681static()];
                c13698l.m3673final(jArr2, jArrBilling);
            }
        }
        c12474l.mo1140native(jArrBilling);
        return c12474l;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final long license() {
        return this.amazon.metrica(this.subs);
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.crashlytics.loadAd;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final Object mopub(InterfaceC16588l interfaceC16588l) {
        boolean z;
        if (!this.admob || !AbstractC8576l.yandex(interfaceC16588l.purchase(), C7235l.crashlytics.loadAd)) {
            if (this.admob) {
                z = true;
            } else {
                InterfaceC18035l interfaceC18035lPurchase = interfaceC16588l.purchase();
                z = false;
                if (interfaceC18035lPurchase.purchase() && AbstractC1295l.subs(interfaceC18035lPurchase, 0)) {
                    z = true;
                }
            }
            this.admob = z;
            return interfaceC16588l.loadAd(this);
        }
        long[] jArr = this.subs;
        appmetrica appmetricaVar = this.amazon;
        appmetricaVar.isVip(jArr);
        int iAdvert = appmetricaVar.advert();
        int i = iAdvert & 224;
        if (i == 64) {
            byte[] bArrInmobi = appmetricaVar.inmobi();
            appmetricaVar.appmetrica();
            return bArrInmobi;
        }
        if (i != 128) {
            throw AbstractC14231l.yandex(iAdvert, "start of byte string");
        }
        throw new C5016l("Expected a start of a byte string, but found " + AbstractC14231l.admob(iAdvert) + ", which corresponds to the start of an array. Make sure you correctly set 'alwaysUseByteString' setting and/or 'kotlinx.serialization.cbor.ByteString' annotation.");
    }

    /* JADX INFO: renamed from: native */
    public void mo1140native(long[] jArr) {
        int iM162case = this.amazon.m162case(jArr, 191, 160, "map");
        if (iM162case >= 0) {
            this.billing = true;
            this.purchase = iM162case;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean pro() {
        int iAdvert = this.amazon.advert();
        return !(iAdvert == 246 || iAdvert == 160);
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean purchase() {
        boolean z;
        long[] jArr = this.subs;
        appmetrica appmetricaVar = this.amazon;
        appmetricaVar.isVip(jArr);
        int iAdvert = appmetricaVar.advert();
        if (iAdvert == 244) {
            z = false;
        } else {
            if (iAdvert != 245) {
                throw AbstractC14231l.yandex(iAdvert, "boolean value");
            }
            z = true;
        }
        appmetricaVar.appmetrica();
        return z;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final byte signatures() {
        return (byte) this.amazon.startapp(this.subs, -128L, 127L, 255L, "Byte");
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final void startapp() {
        long[] jArr = this.subs;
        appmetrica appmetricaVar = this.amazon;
        appmetricaVar.isVip(jArr);
        int iAdvert = appmetricaVar.advert();
        if (iAdvert == 246 || iAdvert == 160) {
            appmetricaVar.appmetrica();
            return;
        }
        throw AbstractC14231l.yandex(appmetricaVar.advert(), "null value (" + AbstractC15862l.subs(246) + ") or empty map (" + AbstractC15862l.subs(160) + ')');
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final String tapsense() {
        return this.amazon.adcel(this.subs);
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws */
    public final double mo677throws() {
        float fYandex;
        double dLongBitsToDouble;
        appmetrica appmetricaVar = this.amazon;
        C6129l c6129l = (C6129l) appmetricaVar.f492l;
        appmetricaVar.isVip(this.subs);
        int iAdvert = appmetricaVar.advert();
        int i = 0;
        switch (iAdvert) {
            case 249:
                appmetrica.firebase(c6129l, 2);
                fYandex = AbstractC15613l.yandex((short) ((c6129l.loadAd() << 8) | c6129l.loadAd()));
                dLongBitsToDouble = fYandex;
                appmetricaVar.appmetrica();
                return dLongBitsToDouble;
            case 250:
                appmetrica.firebase(c6129l, 4);
                int iLoadAd = 0;
                while (i < 4) {
                    iLoadAd = (iLoadAd << 8) | c6129l.loadAd();
                    i++;
                }
                fYandex = Float.intBitsToFloat(iLoadAd);
                dLongBitsToDouble = fYandex;
                appmetricaVar.appmetrica();
                return dLongBitsToDouble;
            case 251:
                appmetrica.firebase(c6129l, 8);
                long jLoadAd = 0;
                while (i < 8) {
                    jLoadAd = (jLoadAd << 8) | ((long) c6129l.loadAd());
                    i++;
                }
                dLongBitsToDouble = Double.longBitsToDouble(jLoadAd);
                appmetricaVar.appmetrica();
                return dLongBitsToDouble;
            default:
                throw AbstractC14231l.yandex(iAdvert, "double header");
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int vip() {
        return (int) this.amazon.startapp(this.subs, -2147483648L, 2147483647L, 4294967295L, "Int");
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC14988l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        if (this.billing) {
            return;
        }
        appmetrica appmetricaVar = this.amazon;
        int iAdvert = appmetricaVar.advert();
        if (iAdvert != 255) {
            throw AbstractC14231l.yandex(iAdvert, "byte ".concat(AbstractC14231l.admob(255)));
        }
        appmetricaVar.appmetrica();
    }
}
