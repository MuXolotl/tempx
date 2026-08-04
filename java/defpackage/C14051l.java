package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lَٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14051l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2157l f27392l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27393l;

    public /* synthetic */ C14051l(C2157l c2157l, int i) {
        this.f27393l = i;
        this.f27392l = c2157l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objYandex;
        C6839l c6839l;
        int i = this.f27393l;
        C4346l c4346l = C4346l.f8873l;
        final C2157l c2157l = this.f27392l;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                InterfaceC9069l interfaceC9069l = c2157l.f4793l;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (interfaceC9069l instanceof C9080l) {
                        objYandex = ((C9080l) interfaceC9069l).yandex;
                    } else if (interfaceC9069l instanceof C0399l) {
                        objYandex = ((C0399l) interfaceC9069l).yandex;
                    } else {
                        if (!(interfaceC9069l instanceof C15268l)) {
                            C18725l.billing();
                            return null;
                        }
                        objYandex = ((C15268l) interfaceC9069l).yandex.yandex();
                    }
                    Object obj4 = objYandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    long j = ((C14370l) c6956l.isPro(c10707l)).yandex.startapp;
                    if (interfaceC9069l instanceof C15268l) {
                        c6956l.m2123default(1934032278);
                        c6956l.startapp(false);
                        c6839l = AbstractC7497l.yandex;
                    } else {
                        c6956l.m2123default(1934053606);
                        c6839l = ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics;
                        c6956l.startapp(false);
                    }
                    AbstractC17307l.billing(obj4, 0, j, 0L, 0, 0.0f, false, c6839l, null, null, c6956l, 0, 890);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC9069l interfaceC9069l2 = c2157l.f4793l;
                    if (interfaceC9069l2 instanceof C0399l) {
                        c6956l2.m2123default(-269872558);
                        AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(887136628, new Function2() { // from class: lٟؕ٘
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i4 = i2;
                                C2157l c2157l2 = c2157l;
                                switch (i4) {
                                    case 0:
                                        C6956l c6956l3 = (C6956l) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            AudioTrack audioTrack = ((C0399l) c2157l2.f4793l).yandex;
                                            AbstractC0133l.purchase(audioTrack.amazon, audioTrack.ads, 0L, 0L, null, c6956l3, 0, 28);
                                        } else {
                                            c6956l3.m2124else();
                                        }
                                        break;
                                    default:
                                        C6956l c6956l4 = (C6956l) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC13010l.loadAd(((C0399l) c2157l2.f4793l).yandex.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l4, 0, 24960, 241662);
                                        } else {
                                            c6956l4.m2124else();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l2), AbstractC14566l.amazon(1126003061, new Function2() { // from class: lٟؕ٘
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i4 = i3;
                                C2157l c2157l2 = c2157l;
                                switch (i4) {
                                    case 0:
                                        C6956l c6956l3 = (C6956l) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            AudioTrack audioTrack = ((C0399l) c2157l2.f4793l).yandex;
                                            AbstractC0133l.purchase(audioTrack.amazon, audioTrack.ads, 0L, 0L, null, c6956l3, 0, 28);
                                        } else {
                                            c6956l3.m2124else();
                                        }
                                        break;
                                    default:
                                        C6956l c6956l4 = (C6956l) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC13010l.loadAd(((C0399l) c2157l2.f4793l).yandex.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l4, 0, 24960, 241662);
                                        } else {
                                            c6956l4.m2124else();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l2), c6956l2, (iIntValue2 & 14) | 432);
                        c6956l2.startapp(false);
                    } else if (interfaceC9069l2 instanceof C9080l) {
                        c6956l2.m2123default(-268945224);
                        AbstractC0133l.purchase(((C9080l) interfaceC9069l2).yandex.mopub, null, 0L, 0L, interfaceC15451l.yandex(c4346l, 1.0f, true), c6956l2, 48, 12);
                        c6956l2.startapp(false);
                    } else {
                        if (!(interfaceC9069l2 instanceof C15268l)) {
                            throw AbstractC12900l.billing(-1671275387, c6956l2, false);
                        }
                        c6956l2.m2123default(-268546533);
                        AbstractC0133l.purchase(((C15268l) interfaceC9069l2).yandex.yandex, null, 0L, 0L, interfaceC15451l.yandex(c4346l, 1.0f, true), c6956l2, 48, 12);
                        c6956l2.startapp(false);
                    }
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC0133l.amazon(AbstractC14566l.amazon(565499485, new C14051l(c2157l, i2), c6956l3), AbstractC14566l.amazon(1325633724, new C14051l(c2157l, i3), c6956l3), AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), null, c6956l3, 438, 8);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
