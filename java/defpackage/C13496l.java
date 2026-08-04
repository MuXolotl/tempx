package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13496l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5866l f26510l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26511l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13496l(C5866l c5866l, int i) {
        super(0);
        this.f26511l = i;
        this.f26510l = c5866l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jSubs;
        int i = this.f26511l;
        C5866l c5866l = this.f26510l;
        switch (i) {
            case 0:
                C1644l c1644lAdmob = c5866l.admob();
                int iOrdinal = c1644lAdmob.metrica.ordinal();
                if (iOrdinal == 0) {
                    jSubs = c1644lAdmob.subs() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return null;
                    }
                    jSubs = c1644lAdmob.subs() >> 32;
                }
                return Float.valueOf(((int) jSubs) * 0.05f);
            default:
                return c5866l.admob().metrica;
        }
    }
}
