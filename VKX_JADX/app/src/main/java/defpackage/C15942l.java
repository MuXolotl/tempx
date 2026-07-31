package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxtv.VkxTvEntrypoint;

/* JADX INFO: renamed from: lٕۛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15942l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3095l f31308l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31309l;

    public /* synthetic */ C15942l(C3095l c3095l, int i) {
        this.f31309l = i;
        this.f31308l = c3095l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31309l;
        C3095l c3095l = this.f31308l;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = VkxTvEntrypoint.f36854l;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10936l c10936l = AbstractC16104l.yandex;
                    C10707l c10707l = AbstractC3459l.yandex;
                    C11090l c11090l = ((C9472l) c6956l.isPro(c10707l)).subs;
                    C11090l c11090l2 = AbstractC1193l.amazon;
                    C11090l c11090lPurchase = c11090l.purchase(c11090l2);
                    C11090l c11090lPurchase2 = ((C9472l) c6956l.isPro(c10707l)).admob.purchase(c11090l2);
                    AbstractC12811l.yandex(c10936l, null, new C9472l(((C9472l) c6956l.isPro(c10707l)).amazon.purchase(c11090l2), ((C9472l) c6956l.isPro(c10707l)).purchase.purchase(c11090l2), ((C9472l) c6956l.isPro(c10707l)).billing.purchase(c11090l2), ((C9472l) c6956l.isPro(c10707l)).mopub.purchase(c11090l2), c11090lPurchase2, c11090lPurchase, 32263), AbstractC14566l.amazon(1504246607, new C15942l(c3095l, i2), c6956l), c6956l, 3078, 2);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = VkxTvEntrypoint.f36854l;
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC16291l.crashlytics(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), AbstractC16837l.yandex, null, AbstractC14566l.amazon(-1043441068, new C16561l(27, c3095l), c6956l2), c6956l2, 58);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
