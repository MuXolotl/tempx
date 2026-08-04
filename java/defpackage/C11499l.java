package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11499l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC16860l f23109l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10822l f23110l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23111l;

    public /* synthetic */ C11499l(C10822l c10822l, AbstractC16860l abstractC16860l, int i) {
        this.f23111l = i;
        this.f23110l = c10822l;
        this.f23109l = abstractC16860l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f23111l;
        AbstractC16860l abstractC16860l = this.f23109l;
        C10822l c10822l = this.f23110l;
        switch (i) {
            case 0:
                C17838l c17838l = c10822l.yandex.loadAd;
                InterfaceC13922l interfaceC13922l = C9911l.f20154final[0];
                return AbstractC12024l.m3326implements(((C13594l) c17838l.yandex).loadAd(abstractC16860l.isPro(AbstractC3333l.applovin), c10822l), "Collection");
            default:
                C17838l c17838l2 = c10822l.yandex.loadAd;
                InterfaceC13922l interfaceC13922l2 = C9911l.f20154final[0];
                return AbstractC12024l.m3326implements(((C13594l) c17838l2.yandex).loadAd(abstractC16860l.firebase("Array"), c10822l), "Array");
        }
    }
}
