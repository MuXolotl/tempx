package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7105l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9544l f14875l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14876l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12818l f14877l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7105l(AbstractC9544l abstractC9544l, C12818l c12818l, int i) {
        super(1);
        this.f14876l = i;
        this.f14875l = abstractC9544l;
        this.f14877l = c12818l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f14876l;
        float f = 2.0f;
        float f2 = 1.0f;
        C12818l c12818l = this.f14877l;
        switch (i) {
            case 0:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fBilling = C14174l.billing(interfaceC13349l.admob());
                float fCrashlytics = C14174l.crashlytics(interfaceC13349l.admob());
                C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                long jM4551private = c18449lMo2065break.m4551private();
                c18449lMo2065break.m4555synchronized().mopub();
                ((C16543l) c18449lMo2065break.f36010l).remoteconfig(0.0f, 0.0f, fBilling, fCrashlytics, 1);
                long j = C9735l.amazon;
                long j2 = C9735l.purchase;
                float fMo868instanceof = interfaceC13349l.mo868instanceof(8.0f);
                int iCeil = (int) Math.ceil(C14174l.billing(interfaceC13349l.admob()) / fMo868instanceof);
                int iCeil2 = (int) Math.ceil(C14174l.crashlytics(interfaceC13349l.admob()) / fMo868instanceof);
                int i2 = 0;
                while (i2 < iCeil) {
                    int i3 = 0;
                    while (i3 < iCeil2) {
                        float f3 = f;
                        AbstractC9361l.metrica(interfaceC13349l, (i2 + i3) % 2 == 0 ? j : j2, AbstractC2296l.yandex(i2 * fMo868instanceof, i3 * fMo868instanceof), AbstractC8532l.yandex(fMo868instanceof, fMo868instanceof), 0.0f, null, null, 0, 120);
                        i3++;
                        jM4551private = jM4551private;
                        f = f3;
                        f2 = f2;
                        fMo868instanceof = fMo868instanceof;
                        iCeil = iCeil;
                        iCeil2 = iCeil2;
                        i2 = i2;
                    }
                    i2++;
                    f = f;
                    f2 = f2;
                }
                float f4 = f;
                float f5 = f2;
                AbstractC0653l.license(c18449lMo2065break, jM4551private);
                AbstractC9361l.vip(interfaceC13349l, this.f14875l, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC9361l.metrica(interfaceC13349l, C9735l.crashlytics, 0L, 0L, 0.0f, new C0404l(interfaceC13349l.mo868instanceof(0.5f), 0.0f, 0, 0, null, 30), null, 0, 110);
                float fBilling2 = (f5 - c12818l.amazon) * C14174l.billing(interfaceC13349l.admob());
                float fMo868instanceof2 = interfaceC13349l.mo868instanceof(4.0f);
                float fMo868instanceof3 = interfaceC13349l.mo868instanceof(f5);
                AbstractC11790l.amazon(interfaceC13349l, AbstractC2296l.yandex(fBilling2 - fMo868instanceof2, -fMo868instanceof3), AbstractC8532l.yandex(fMo868instanceof2 * f4, (fMo868instanceof3 * f4) + C14174l.crashlytics(interfaceC13349l.admob())), fMo868instanceof3);
                break;
            default:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                AbstractC9361l.vip(interfaceC13349l2, this.f14875l, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC9361l.metrica(interfaceC13349l2, C9735l.crashlytics, 0L, 0L, 0.0f, new C0404l(interfaceC13349l2.mo868instanceof(0.5f), 0.0f, 0, 0, null, 30), null, 0, 110);
                float fCrashlytics2 = C14174l.crashlytics(interfaceC13349l2.admob());
                float f6 = fCrashlytics2 - ((c12818l.yandex * fCrashlytics2) / 360.0f);
                float fMo868instanceof4 = interfaceC13349l2.mo868instanceof(4.0f);
                float fMo868instanceof5 = interfaceC13349l2.mo868instanceof(1.0f);
                AbstractC11790l.amazon(interfaceC13349l2, AbstractC2296l.yandex(-fMo868instanceof5, f6 - fMo868instanceof4), AbstractC8532l.yandex((fMo868instanceof5 * 2.0f) + C14174l.billing(interfaceC13349l2.admob()), fMo868instanceof4 * 2.0f), fMo868instanceof5);
                break;
        }
        return Unit.INSTANCE;
    }
}
