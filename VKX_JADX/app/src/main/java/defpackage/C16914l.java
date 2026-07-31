package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16914l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f32988l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f32989l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32990l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32991l;

    public /* synthetic */ C16914l(Object obj, float f, long j, int i) {
        this.f32990l = i;
        this.f32991l = obj;
        this.f32989l = f;
        this.f32988l = j;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:143:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        long j2;
        int i = this.f32990l;
        char c = ' ';
        float f = this.f32989l;
        Object obj2 = this.f32991l;
        switch (i) {
            case 0:
                C11183l c11183l = (C11183l) obj2;
                long j3 = this.f32988l;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                InterfaceC1220l interfaceC1220l = AbstractC13958l.yandex;
                long j4 = c11183l.f22491l;
                if (j4 == 16) {
                    j4 = c11183l.f22481l.yandex;
                }
                if (j4 == 16) {
                    j4 = c11183l.f22482l.yandex;
                }
                if (j4 != 16) {
                    AbstractC9361l.metrica(interfaceC13349l, j4, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                long jM4551private = c18449lMo2065break.m4551private();
                c18449lMo2065break.m4555synchronized().mopub();
                try {
                    long j5 = 0;
                    ((C16543l) c18449lMo2065break.f36010l).isVip(f, f, 0L);
                    long jAdmob = C1187l.admob(j3, c11183l.f22503l);
                    long j6 = 9187343241974906880L;
                    if (((((jAdmob & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || C1187l.loadAd(jAdmob, 0L)) {
                        long j7 = 0;
                        for (C1625l c1625l : c11183l.f22498l) {
                            if (c1625l.mopub) {
                                throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                            }
                            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                            try {
                                long jLoadAd = c1625l.loadAd();
                                if ((jLoadAd & 9223372034707292159L) == 9205357640488583168L) {
                                    jLoadAd = j7;
                                }
                                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                                if (((((jLoadAd & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == j7) {
                                    j = j7;
                                    if (!C1187l.loadAd(jLoadAd, j)) {
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jLoadAd >> 32));
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLoadAd & 4294967295L));
                                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                                        try {
                                            C11925l c11925lYandex = c1625l.yandex();
                                            if (c11925lYandex == null) {
                                                c11925lYandex = null;
                                            } else {
                                                if (c11925lYandex.subscription) {
                                                    c11925lYandex = null;
                                                }
                                                if (c11925lYandex != null) {
                                                    long j8 = c11925lYandex.Signature;
                                                    if (((int) (j8 >> 32)) <= 0 || ((int) (j8 & 4294967295L)) <= 0) {
                                                        c11925lYandex = null;
                                                    }
                                                } else {
                                                    c11925lYandex = null;
                                                }
                                            }
                                            if (c11925lYandex != null) {
                                                AbstractC2576l.loadAd(interfaceC13349l, c11925lYandex);
                                            }
                                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                                        } catch (Throwable th) {
                                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                                            throw th;
                                        }
                                    }
                                    j7 = j;
                                } else {
                                    j = j7;
                                }
                                C11925l c11925lYandex2 = c1625l.yandex();
                                if (c11925lYandex2 == null) {
                                    c11925lYandex2 = null;
                                } else {
                                    if (c11925lYandex2.subscription) {
                                        c11925lYandex2 = null;
                                    }
                                    if (c11925lYandex2 != null) {
                                        long j9 = c11925lYandex2.Signature;
                                        if (((int) (j9 >> 32)) <= 0 || ((int) (j9 & 4294967295L)) <= 0) {
                                            c11925lYandex2 = null;
                                        }
                                    } else {
                                        c11925lYandex2 = null;
                                    }
                                }
                                if (c11925lYandex2 != null) {
                                    AbstractC2576l.loadAd(interfaceC13349l, c11925lYandex2);
                                }
                                j7 = j;
                            } catch (Throwable th2) {
                                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                                throw th2;
                            }
                        }
                    } else {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAdmob >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jAdmob & 4294967295L));
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fIntBitsToFloat3, fIntBitsToFloat4);
                        try {
                            for (C1625l c1625l2 : c11183l.f22498l) {
                                if (c1625l2.mopub) {
                                    throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                                }
                                AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                                Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                                char c2 = c;
                                AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                                try {
                                    long jLoadAd2 = c1625l2.loadAd();
                                    long j10 = (jLoadAd2 & 9223372034707292159L) != 9205357640488583168L ? jLoadAd2 : j5;
                                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                                    if (((((j10 & j6) ^ j6) - 4294967297L) & (-9223372034707292160L)) != j5 || C1187l.loadAd(j10, j5)) {
                                        j2 = j5;
                                        C11925l c11925lYandex3 = c1625l2.yandex();
                                        if (c11925lYandex3 == null) {
                                            c11925lYandex3 = null;
                                        } else {
                                            if (c11925lYandex3.subscription) {
                                                c11925lYandex3 = null;
                                            }
                                            if (c11925lYandex3 != null) {
                                                long j11 = c11925lYandex3.Signature;
                                                if (((int) (j11 >> c2)) <= 0 || ((int) (j11 & 4294967295L)) <= 0) {
                                                    c11925lYandex3 = null;
                                                }
                                            } else {
                                                c11925lYandex3 = null;
                                            }
                                        }
                                        if (c11925lYandex3 != null) {
                                            AbstractC2576l.loadAd(interfaceC13349l, c11925lYandex3);
                                        }
                                    } else {
                                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j10 >> c2));
                                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fIntBitsToFloat5, fIntBitsToFloat6);
                                        try {
                                            C11925l c11925lYandex4 = c1625l2.yandex();
                                            if (c11925lYandex4 == null) {
                                                j2 = j5;
                                                c11925lYandex4 = null;
                                            } else {
                                                if (c11925lYandex4.subscription) {
                                                    c11925lYandex4 = null;
                                                }
                                                if (c11925lYandex4 != null) {
                                                    long j12 = c11925lYandex4.Signature;
                                                    j2 = j5;
                                                    if (((int) (j12 >> c2)) <= 0 || ((int) (j12 & 4294967295L)) <= 0) {
                                                    }
                                                } else {
                                                    j2 = j5;
                                                }
                                                c11925lYandex4 = null;
                                            }
                                            if (c11925lYandex4 != null) {
                                                AbstractC2576l.loadAd(interfaceC13349l, c11925lYandex4);
                                            }
                                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                        } catch (Throwable th3) {
                                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                            throw th3;
                                        }
                                    }
                                    j6 = j6;
                                    c = c2;
                                    j5 = j2;
                                } catch (Throwable th4) {
                                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                                    throw th4;
                                }
                            }
                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        } catch (Throwable th5) {
                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            throw th5;
                        }
                    }
                    AbstractC0653l.license(c18449lMo2065break, jM4551private);
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    AbstractC0653l.license(c18449lMo2065break, jM4551private);
                    throw th6;
                }
            default:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                long j13 = ((C1530l) obj2).crashlytics;
                float fMo868instanceof = interfaceC13349l2.mo868instanceof(f);
                AbstractC9361l.adcel(interfaceC13349l2, j13, 0L, this.f32988l, (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo868instanceof))), null, 242);
                return Unit.INSTANCE;
        }
    }
}
