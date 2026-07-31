package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16925l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f33008l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33009l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C8030l f33010l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16925l(C8030l c8030l, AbstractC10113l abstractC10113l) {
        super(1);
        this.f33010l = c8030l;
        this.f33008l = abstractC10113l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        char c;
        long j2;
        C8896l c8896lIsPro;
        long jAdmob;
        InterfaceC18212l interfaceC18212lAmazon;
        int i = this.f33009l;
        C8030l c8030l = this.f33010l;
        AbstractC10113l abstractC10113l = this.f33008l;
        C1187l c1187l = null;
        switch (i) {
            case 0:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                c8030l.f16716l = true;
                c8030l.f16718l = null;
                AbstractC3386l abstractC3386lTapsense = c8030l.f16717l.purchase().crashlytics.tapsense();
                if (c8030l.f16717l.admob() && abstractC3386lTapsense.amazon()) {
                    C12014l c12014lPurchase = abstractC3386lTapsense.purchase();
                    if (c12014lPurchase == null) {
                        C8936l.smaato(abstractC3386lTapsense, "Match State is configured, but target data is null. State = ");
                        return null;
                    }
                    C8896l c8896lCrashlytics = abstractC3386lTapsense.crashlytics();
                    if (c8896lCrashlytics == null) {
                        C8936l.smaato(abstractC3386lTapsense, "Match State is configured, but current bounds is null. State = ");
                        return null;
                    }
                    if (c8030l.f16717l.purchase().loadAd.loadAd()) {
                        InterfaceC18212l interfaceC18212lAmazon2 = abstractC9601l.amazon();
                        if (interfaceC18212lAmazon2 == null) {
                            abstractC9601l.mopub(abstractC10113l, 0, 0, 0.0f);
                        } else {
                            boolean zLoadAd = c8030l.f16717l.purchase().crashlytics.tapsense().loadAd();
                            long jMo2593throws = c8030l.m2255l().mo2593throws(interfaceC18212lAmazon2, 0L);
                            AbstractC17549l.billing(c12014lPurchase);
                            C0633l c0633l = c8030l.f16717l;
                            if (zLoadAd) {
                                j = 4294967295L;
                                c0633l.amazon().yandex(c8896lCrashlytics, AbstractC17549l.billing(c12014lPurchase), null);
                            } else {
                                j = 4294967295L;
                                c0633l.amazon().yandex(c8896lCrashlytics, AbstractC17549l.billing(c12014lPurchase), new C13657l(0));
                            }
                            C8896l c8896lCrashlytics2 = c8030l.f16717l.amazon().crashlytics();
                            if (c8896lCrashlytics2 != null) {
                                c = ' ';
                                c1187l = new C1187l(C1187l.subs(C1187l.admob(c8896lCrashlytics2.admob(), ((C1187l) ((C10086l) c12014lPurchase.f23940l).getValue()).yandex), ((C1187l) ((C10086l) c12014lPurchase.f23943l).getValue()).yandex));
                            } else {
                                c = ' ';
                            }
                            if (c8030l.f16717l.amazon().loadAd() || !zLoadAd) {
                                long j3 = c1187l != null ? c1187l.yandex : jMo2593throws;
                                if (c1187l == null) {
                                    j2 = jMo2593throws;
                                    c8896lIsPro = AbstractC7470l.isPro(j2, AbstractC14707l.mopub(interfaceC18212lAmazon2.smaato()));
                                } else {
                                    j2 = jMo2593throws;
                                    c8896lIsPro = AbstractC7470l.isPro(c1187l.yandex, c8896lCrashlytics2.mopub());
                                }
                                c8030l.f16717l.purchase().crashlytics.tapsense().subs(c8896lIsPro);
                                jAdmob = j3;
                            } else {
                                jAdmob = c1187l != null ? c1187l.yandex : c8896lCrashlytics.admob();
                                j2 = jMo2593throws;
                            }
                            long jAdmob2 = C1187l.admob(jAdmob, j2);
                            abstractC9601l.mopub(abstractC10113l, Math.round(Float.intBitsToFloat((int) (jAdmob2 >> c))), Math.round(Float.intBitsToFloat((int) (jAdmob2 & j))), 0.0f);
                        }
                    } else if (c8030l.f16717l.amazon().loadAd()) {
                        abstractC9601l.mopub(abstractC10113l, 0, 0, 0.0f);
                    } else {
                        InterfaceC18212l interfaceC18212lAmazon3 = abstractC9601l.amazon();
                        long jIsPro = interfaceC18212lAmazon3 != null ? AbstractC3383l.isPro(C1187l.admob(c8896lCrashlytics.admob(), c8030l.m2255l().mo2593throws(interfaceC18212lAmazon3, 0L))) : 0L;
                        abstractC9601l.mopub(abstractC10113l, (int) (jIsPro >> 32), (int) (jIsPro & 4294967295L), 0.0f);
                    }
                } else {
                    abstractC9601l.mopub(abstractC10113l, 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
            default:
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                abstractC9601l2.mopub(abstractC10113l, 0, 0, 0.0f);
                C14509l c14509lPurchase = c8030l.f16717l.purchase();
                C0633l c0633l2 = c8030l.f16717l;
                C17724l c17724l = c14509lPurchase.crashlytics;
                c17724l.license();
                if (!AbstractC8576l.yandex(c17724l.tapsense(), C10323l.yandex) && c0633l2.admob()) {
                    AbstractC3386l abstractC3386lTapsense2 = c17724l.tapsense();
                    if (c0633l2.amazon().loadAd() && abstractC3386lTapsense2.loadAd() && (interfaceC18212lAmazon = abstractC9601l2.amazon()) != null) {
                        long jMopub = AbstractC14707l.mopub(interfaceC18212lAmazon.smaato());
                        C14632l c14632l = c0633l2.purchase().loadAd;
                        InterfaceC18212l interfaceC18212l = c0633l2.purchase().loadAd.f28638l;
                        if (interfaceC18212l == null) {
                            C8339l.metrica("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            return null;
                        }
                        long jCrashlytics = c14632l.f28635l.crashlytics(interfaceC18212l, interfaceC18212lAmazon);
                        C14632l c14632l2 = c0633l2.purchase().loadAd;
                        InterfaceC18212l interfaceC18212l2 = c0633l2.purchase().loadAd.f28638l;
                        if (interfaceC18212l2 == null) {
                            C8339l.metrica("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            return null;
                        }
                        ((C10086l) c17724l.purchase).setValue(c17724l.tapsense().yandex((C14509l) c17724l.amazon, (C8030l) c17724l.mopub, jMopub, jCrashlytics, interfaceC18212l2.mo2589native(interfaceC18212lAmazon, 0L, (6 & 4) != 0)));
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16925l(AbstractC10113l abstractC10113l, C8030l c8030l) {
        super(1);
        this.f33008l = abstractC10113l;
        this.f33010l = c8030l;
    }
}
