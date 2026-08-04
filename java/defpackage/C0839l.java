package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0839l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2281l f2485l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2486l;

    public /* synthetic */ C0839l(C2281l c2281l, int i) {
        this.f2486l = i;
        this.f2485l = c2281l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2486l;
        C4346l c4346l = C4346l.f8873l;
        C2281l c2281l = this.f2485l;
        int i2 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.eq3_legacy_bass_boost_warning), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 8.0f, 5), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).billing, c6956l, 48, 0, 131064);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.eq3_legacy_bass_boost_warning_description), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 48, 0, 131068);
                    boolean zAdmob = c6956l.admob(c2281l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C9816l(c2281l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f);
                    C6839l c6839l = AbstractC13106l.billing(c6956l).crashlytics;
                    C17253l c17253l = C12719l.yandex;
                    AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lAmazon, false, c6839l, C12719l.yandex(AbstractC13106l.purchase(c6956l).vip, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12), null, null, null, C5795l.amazon, c6956l, 805306416, 484);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC3383l.yandex(AbstractC3605l.smaato(c4346l, 16.0f), null, null, null, null, AbstractC14566l.amazon(-553153611, new C0839l(c2281l, i2), c6956l2), c6956l2, 196614, 30);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
