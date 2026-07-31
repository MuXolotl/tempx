package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4062l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2586l f8357l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8358l = 1;

    public /* synthetic */ C4062l(C4875l c4875l, C2586l c2586l) {
        this.f8357l = c2586l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8358l;
        C2586l c2586l = this.f8357l;
        switch (i) {
            case 0:
                InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(c2586l).f7668l;
                c2586l.f5637l.admob();
                return Integer.valueOf(AbstractC5573l.ads(0.33333334f * c2586l.f5640l.admob()));
            default:
                C15308l c15308l = c2586l.f5637l;
                if (c15308l.admob() <= c2586l.f5640l.admob()) {
                    return null;
                }
                ((C18649l) c2586l.f5641l.getValue()).getClass();
                return Float.valueOf(c2586l.m1229l() + c15308l.admob());
        }
    }

    public /* synthetic */ C4062l(C2586l c2586l) {
        this.f8357l = c2586l;
    }
}
