package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3793l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11674l f7890l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7891l = 0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC15929l c0592l;
        int i = this.f7891l;
        C11674l c11674l = this.f7890l;
        switch (i) {
            case 0:
                C8974l c8974l = (C8974l) AbstractC13402l.loadAd(c11674l, AbstractC10493l.loadAd);
                C8607l c8607l = c11674l.f23402l;
                if (c8974l == null) {
                    if (c8607l != null) {
                        c11674l.m3073l(c8607l);
                    }
                    c11674l.f23402l = null;
                } else if (c8607l == null) {
                    C1635l c1635l = new C1635l(c11674l, 0);
                    C3793l c3793l = new C3793l(c11674l, new C1635l(c11674l, 2), new C1635l(c11674l, 1));
                    C2403l c2403l = c11674l.f23401l;
                    boolean z = c11674l.f23403l;
                    float f = c11674l.f23400l;
                    C4776l c4776l = AbstractC18051l.yandex;
                    C8607l c8607l2 = new C8607l();
                    c8607l2.m3069l(new C18723l(c2403l, z, f, c1635l, c3793l));
                    c11674l.m3069l(c8607l2);
                    c11674l.f23402l = c8607l2;
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1878l interfaceC1878l = ((C14370l) AbstractC13402l.loadAd(c11674l, AbstractC16964l.yandex)).amazon;
                C1504l c1504l = (C1504l) AbstractC13402l.loadAd(c11674l, AbstractC10493l.yandex);
                AbstractC4115l c15218l = c11674l.f23397l ? new C15218l() : C17189l.yandex;
                if (c11674l.f23396l) {
                    C2109l c2109l = c1504l.yandex;
                    c0592l = new C0592l();
                } else {
                    c0592l = C7318l.subs;
                }
                return new C15172l(c15218l, c0592l, c11674l.f23404l ? new C4133l() : C7232l.crashlytics, c11674l.f23399l ? new C11254l() : C12127l.loadAd);
        }
    }

    public /* synthetic */ C3793l(C11674l c11674l, C1635l c1635l, C1635l c1635l2) {
        this.f7890l = c11674l;
    }
}
