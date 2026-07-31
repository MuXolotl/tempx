package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11940l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C12136l f23783l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11940l(C12136l c12136l, int i) {
        super(1);
        this.f23784l = i;
        this.f23783l = c12136l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23784l;
        C12136l c12136l = this.f23783l;
        switch (i) {
            case 0:
                c12136l.amazon = true;
                c12136l.billing.invoke();
                return Unit.INSTANCE;
            default:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C8006l c8006l = c12136l.loadAd;
                float f = c12136l.firebase;
                float f2 = c12136l.smaato;
                C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                long jM4551private = c18449lMo2065break.m4551private();
                c18449lMo2065break.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449lMo2065break.f36010l).isVip(f, f2, 0L);
                    c8006l.yandex(interfaceC13349l);
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449lMo2065break, jM4551private);
                }
        }
    }
}
