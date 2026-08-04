package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗۗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5096l implements InterfaceC10835l {
    public final /* synthetic */ InterfaceC13490l admob;
    public final /* synthetic */ InterfaceC2262l amazon;
    public final /* synthetic */ C0639l billing;
    public final /* synthetic */ InterfaceC2229l crashlytics;
    public final /* synthetic */ int isPro;
    public final /* synthetic */ C16173l loadAd;
    public final /* synthetic */ InterfaceC4005l mopub;
    public final /* synthetic */ Function1 purchase;
    public final /* synthetic */ C1739l subs;
    public final /* synthetic */ C17812l yandex;

    public C5096l(C17812l c17812l, C16173l c16173l, InterfaceC2229l interfaceC2229l, InterfaceC2262l interfaceC2262l, Function1 function1, C0639l c0639l, InterfaceC4005l interfaceC4005l, InterfaceC13490l interfaceC13490l, C1739l c1739l, int i) {
        this.yandex = c17812l;
        this.loadAd = c16173l;
        this.crashlytics = interfaceC2229l;
        this.amazon = interfaceC2262l;
        this.purchase = function1;
        this.billing = c0639l;
        this.mopub = interfaceC4005l;
        this.admob = interfaceC13490l;
        this.subs = c1739l;
        this.isPro = i;
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x0260  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0224  */
    /* JADX WARN: Code duplicated, block: B:99:0x022f  */
    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        C0327l c0327l;
        EnumC9931l enumC9931l;
        C0327l c0327l2;
        C0327l c0327l3;
        C5096l c5096l;
        int iLoadAd;
        InterfaceC18212l interfaceC18212l;
        C16173l c16173l;
        C3625l c3625l;
        int i;
        int iIsPro;
        int iAdmob;
        int i2;
        C11644l c11644l;
        C11644l c11644l2;
        C17812l c17812l = this.yandex;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C11224l c11224lAmazon = c17812l.amazon();
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            C0327l c0327l4 = c11224lAmazon != null ? c11224lAmazon.yandex : null;
            C5065l c5065l = c17812l.yandex;
            EnumC9931l layoutDirection = interfaceC7448l.getLayoutDirection();
            int i3 = c5065l.billing;
            boolean z = c5065l.purchase;
            int i4 = c5065l.crashlytics;
            if (c0327l4 != null) {
                C6222l c6222l = c0327l4.loadAd;
                C17555l c17555l = c0327l4.yandex;
                C3625l c3625l2 = c5065l.yandex;
                C11090l c11090l = c5065l.loadAd;
                List list2 = c5065l.subs;
                InterfaceC13490l interfaceC13490l = c5065l.mopub;
                InterfaceC16061l interfaceC16061l = c5065l.admob;
                C0327l c0327l5 = c0327l4;
                if (!c6222l.yandex.mo1545l()) {
                    C3625l c3625l3 = c17555l.yandex;
                    long j2 = c17555l.isPro;
                    if (AbstractC8576l.yandex(c3625l3, c3625l2) && c17555l.loadAd.amazon(c11090l) && AbstractC8576l.yandex(c17555l.crashlytics, list2) && c17555l.amazon == i4 && c17555l.purchase == z && c17555l.billing == i3 && AbstractC8576l.yandex(c17555l.mopub, interfaceC13490l)) {
                        enumC9931l = layoutDirection;
                        if (c17555l.admob == enumC9931l && AbstractC8576l.yandex(c17555l.subs, interfaceC16061l) && C15519l.isPro(j) == C15519l.isPro(j2)) {
                            if ((z || i3 == 2) && !(C15519l.admob(j) == C15519l.admob(j2) && C15519l.mopub(j) == C15519l.mopub(j2))) {
                                j = j;
                                i = 2;
                                c0327l = c0327l5;
                                c5065l.yandex(enumC9931l);
                                iIsPro = C15519l.isPro(j);
                                iAdmob = ((!z || i3 == i) && C15519l.amazon(j)) ? C15519l.admob(j) : Alert.DURATION_SHOW_INDEFINITELY;
                                if (z && i3 == i) {
                                    i2 = 1;
                                } else {
                                    i2 = i4;
                                }
                                if (iIsPro != iAdmob) {
                                    c11644l2 = c5065l.isPro;
                                    if (c11644l2 != null) {
                                        C8339l.smaato("layoutIntrinsics must be called first");
                                        return null;
                                    }
                                    iAdmob = AbstractC8576l.purchase(AbstractC0509l.loadAd(c11644l2.mo1547l()), iIsPro, iAdmob);
                                }
                                c11644l = c5065l.isPro;
                                if (c11644l != null) {
                                    C8339l.smaato("layoutIntrinsics must be called first");
                                    return null;
                                }
                                C6222l c6222l2 = new C6222l(c11644l, AbstractC13628l.billing(0, iAdmob, 0, C15519l.mopub(j)), i2, c5065l.billing);
                                c0327l2 = new C0327l(new C17555l(c5065l.yandex, c5065l.loadAd, c5065l.subs, c5065l.crashlytics, c5065l.purchase, c5065l.billing, c5065l.mopub, enumC9931l, c5065l.admob, j), c6222l2, AbstractC7563l.amazon(j, (((long) AbstractC0509l.loadAd(c6222l2.amazon)) << 32) | (((long) AbstractC0509l.loadAd(c6222l2.purchase)) & 4294967295L)));
                            } else {
                                c0327l = c0327l5;
                                c0327l2 = new C0327l(new C17555l(c17555l.yandex, c5065l.loadAd, c17555l.crashlytics, c17555l.amazon, c17555l.purchase, c17555l.billing, c17555l.mopub, c17555l.admob, c17555l.subs, j), c6222l, AbstractC7563l.amazon(j, (((long) AbstractC0509l.loadAd(c6222l.purchase)) & 4294967295L) | (((long) AbstractC0509l.loadAd(c6222l.amazon)) << 32)));
                            }
                        }
                    } else {
                        j = j;
                        c0327l = c0327l5;
                        enumC9931l = layoutDirection;
                    }
                    long j3 = c0327l2.crashlytics;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    c0327l3 = c0327l;
                    if (AbstractC8576l.yandex(c0327l3, c0327l2)) {
                        c5096l = this;
                    } else {
                        if (c11224lAmazon != null) {
                            interfaceC18212l = c11224lAmazon.crashlytics;
                        } else {
                            interfaceC18212l = null;
                        }
                        c17812l.subs.setValue(new C11224l(c0327l2, interfaceC18212l));
                        c17812l.startapp = false;
                        c5096l = this;
                        c16173l = c5096l.loadAd;
                        if (c16173l.firebase() && c16173l.isPro() && ((C12771l) c5096l.crashlytics).loadAd() && C12814l.amazon(((C12814l) c17812l.signatures.getValue()).yandex) && C12814l.amazon(((C12814l) c17812l.premium.getValue()).yandex) && c17812l.loadAd()) {
                            if (c0327l3 != null) {
                                c3625l = c0327l3.yandex.yandex;
                            } else {
                                c3625l = null;
                            }
                            if (!AbstractC8576l.yandex(c3625l, c0327l2.yandex.yandex)) {
                                AbstractC10999l.mopub(c5096l.amazon, null, 0, new C6637l(c16173l, c5096l.subs, (InterfaceC14029l) null, 10), 3);
                            }
                        }
                        c5096l.purchase.invoke(c0327l2);
                        AbstractC16817l.firebase(c17812l, c5096l.billing, c5096l.mopub);
                    }
                    if (c5096l.isPro == 1) {
                        iLoadAd = AbstractC0509l.loadAd(c0327l2.loadAd.loadAd(0));
                    } else {
                        iLoadAd = 0;
                    }
                    c17812l.mopub.setValue(new C14467l(c5096l.admob.mo872static(iLoadAd)));
                    return interfaceC7448l.isVip(iIntValue, iIntValue2, AbstractC8676l.remoteconfig(new C8195l(AbstractC12013l.yandex, Integer.valueOf(Math.round(c0327l2.amazon))), new C8195l(AbstractC12013l.loadAd, Integer.valueOf(Math.round(c0327l2.purchase)))), new C4741l(1));
                }
                enumC9931l = layoutDirection;
                c0327l = c0327l5;
            } else {
                j = j;
                c0327l = c0327l4;
                enumC9931l = layoutDirection;
            }
            i = 2;
            c5065l.yandex(enumC9931l);
            iIsPro = C15519l.isPro(j);
            if (z) {
            }
            if (z) {
                i2 = i4;
            } else {
                i2 = i4;
            }
            if (iIsPro != iAdmob) {
                c11644l2 = c5065l.isPro;
                if (c11644l2 != null) {
                    C8339l.smaato("layoutIntrinsics must be called first");
                    return null;
                }
                iAdmob = AbstractC8576l.purchase(AbstractC0509l.loadAd(c11644l2.mo1547l()), iIsPro, iAdmob);
            }
            c11644l = c5065l.isPro;
            if (c11644l != null) {
                C8339l.smaato("layoutIntrinsics must be called first");
                return null;
            }
            C6222l c6222l3 = new C6222l(c11644l, AbstractC13628l.billing(0, iAdmob, 0, C15519l.mopub(j)), i2, c5065l.billing);
            c0327l2 = new C0327l(new C17555l(c5065l.yandex, c5065l.loadAd, c5065l.subs, c5065l.crashlytics, c5065l.purchase, c5065l.billing, c5065l.mopub, enumC9931l, c5065l.admob, j), c6222l3, AbstractC7563l.amazon(j, (((long) AbstractC0509l.loadAd(c6222l3.amazon)) << 32) | (((long) AbstractC0509l.loadAd(c6222l3.purchase)) & 4294967295L)));
            long j4 = c0327l2.crashlytics;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            c0327l3 = c0327l;
            if (AbstractC8576l.yandex(c0327l3, c0327l2)) {
                if (c11224lAmazon != null) {
                    interfaceC18212l = c11224lAmazon.crashlytics;
                } else {
                    interfaceC18212l = null;
                }
                c17812l.subs.setValue(new C11224l(c0327l2, interfaceC18212l));
                c17812l.startapp = false;
                c5096l = this;
                c16173l = c5096l.loadAd;
                if (c16173l.firebase()) {
                    if (c0327l3 != null) {
                        c3625l = c0327l3.yandex.yandex;
                    } else {
                        c3625l = null;
                    }
                    if (!AbstractC8576l.yandex(c3625l, c0327l2.yandex.yandex)) {
                        AbstractC10999l.mopub(c5096l.amazon, null, 0, new C6637l(c16173l, c5096l.subs, (InterfaceC14029l) null, 10), 3);
                    }
                }
                c5096l.purchase.invoke(c0327l2);
                AbstractC16817l.firebase(c17812l, c5096l.billing, c5096l.mopub);
            } else {
                c5096l = this;
            }
            if (c5096l.isPro == 1) {
                iLoadAd = AbstractC0509l.loadAd(c0327l2.loadAd.loadAd(0));
            } else {
                iLoadAd = 0;
            }
            c17812l.mopub.setValue(new C14467l(c5096l.admob.mo872static(iLoadAd)));
            return interfaceC7448l.isVip(iIntValue3, iIntValue4, AbstractC8676l.remoteconfig(new C8195l(AbstractC12013l.yandex, Integer.valueOf(Math.round(c0327l2.amazon))), new C8195l(AbstractC12013l.loadAd, Integer.valueOf(Math.round(c0327l2.purchase)))), new C4741l(1));
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.ads(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        C17812l c17812l = this.yandex;
        c17812l.yandex.yandex(interfaceC12822l.getLayoutDirection());
        C11644l c11644l = c17812l.yandex.isPro;
        if (c11644l != null) {
            return AbstractC0509l.loadAd(c11644l.mo1547l());
        }
        C8339l.smaato("layoutIntrinsics must be called first");
        return 0;
    }
}
