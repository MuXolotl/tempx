package defpackage;

/* JADX INFO: renamed from: lؓٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1880l implements InterfaceC16588l {
    public static final C1880l yandex = new C1880l();
    public static final C17606l loadAd = new C17606l("kotlin.time.Duration", C15358l.smaato);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        long j = ((C9658l) obj).f19702l;
        C6760l c6760l = C9658l.f19699l;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jIsPro = j < 0 ? C9658l.isPro(j) : j;
        long jAdmob = C9658l.admob(jIsPro, EnumC16636l.HOURS);
        boolean z = false;
        int iAdmob = C9658l.billing(jIsPro) ? 0 : (int) (C9658l.admob(jIsPro, EnumC16636l.MINUTES) % 60);
        int iAdmob2 = C9658l.billing(jIsPro) ? 0 : (int) (C9658l.admob(jIsPro, EnumC16636l.SECONDS) % 60);
        int iPurchase = C9658l.purchase(jIsPro);
        if (C9658l.billing(j)) {
            jAdmob = 9999999999999L;
        }
        boolean z2 = jAdmob != 0;
        boolean z3 = (iAdmob2 == 0 && iPurchase == 0) ? false : true;
        if (iAdmob != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jAdmob);
            sb.append('H');
        }
        if (z) {
            sb.append(iAdmob);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C9658l.loadAd(sb, iAdmob2, iPurchase, 9, "S", true);
        }
        interfaceC17739l.subscription(sb.toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C6760l c6760l = C9658l.f19699l;
        String strTapsense = interfaceC10726l.tapsense();
        try {
            long jVip = AbstractC15918l.vip(strTapsense);
            if (jVip == C9658l.f19700l) {
                throw new IllegalStateException("invariant failed");
            }
            return new C9658l(jVip);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC15560l.Signature("Invalid ISO duration string format: '", strTapsense, "'."), e);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
