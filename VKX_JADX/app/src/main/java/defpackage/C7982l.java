package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7982l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0777l f16635l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7982l(C0777l c0777l, int i) {
        super(1);
        this.f16636l = i;
        this.f16635l = c0777l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f16636l;
        C0777l c0777l = this.f16635l;
        switch (i) {
            case 0:
                return Double.valueOf(c0777l.vip.amazon(AbstractC8576l.crashlytics(((Number) obj).doubleValue(), c0777l.purchase, c0777l.billing)));
            default:
                return Double.valueOf(AbstractC8576l.crashlytics(c0777l.firebase.amazon(((Number) obj).doubleValue()), c0777l.purchase, c0777l.billing));
        }
    }
}
