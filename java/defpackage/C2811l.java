package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٟؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2811l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC10552l f6121l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6122l;

    public /* synthetic */ C2811l(AbstractC10552l abstractC10552l, int i) {
        this.f6122l = i;
        this.f6121l = abstractC10552l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6122l;
        AbstractC10552l abstractC10552l = this.f6121l;
        switch (i) {
            case 0:
                C1710l c1710lAmazon = abstractC10552l.mo700else().mo818extends().amazon();
                return c1710lAmazon == null ? AbstractC6689l.mopub(abstractC10552l.mo700else().mo818extends(), C2782l.f6058l) : c1710lAmazon;
            default:
                return AbstractC4927l.yandex(abstractC10552l, false);
        }
    }
}
