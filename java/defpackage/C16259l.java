package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16259l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC3258l f31824l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31825l;

    public /* synthetic */ C16259l(AbstractC3258l abstractC3258l, int i) {
        this.f31825l = i;
        this.f31824l = abstractC3258l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f31825l;
        AbstractC3258l abstractC3258l = this.f31824l;
        switch (i) {
            case 0:
                C11425l c11425lCrashlytics = abstractC3258l.mo700else().mo818extends().crashlytics();
                if (c11425lCrashlytics != null) {
                    return c11425lCrashlytics;
                }
                C11425l c11425lBilling = AbstractC6689l.billing(abstractC3258l.mo700else().mo818extends(), C2782l.f6058l);
                c11425lBilling.m3086l(abstractC3258l.mo700else().mo818extends().yandex());
                return c11425lBilling;
            default:
                return AbstractC4927l.yandex(abstractC3258l, true);
        }
    }
}
