package defpackage;

/* JADX INFO: renamed from: lٌؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8632l extends AbstractC2648l {
    public final C10459l amazon;
    public final C14965l billing;
    public final C13146l crashlytics;
    public final InterfaceC10696l loadAd;
    public final String mopub;
    public final InterfaceC3588l purchase;

    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    public C8632l(InterfaceC10696l interfaceC10696l, C13146l c13146l, C10459l c10459l, InterfaceC3588l interfaceC3588l, C14965l c14965l) {
        String string;
        String strAd;
        String string2;
        this.loadAd = interfaceC10696l;
        this.crashlytics = c13146l;
        this.amazon = c10459l;
        this.purchase = interfaceC3588l;
        this.billing = c14965l;
        if (c10459l.subs()) {
            strAd = interfaceC3588l.getString(c10459l.f21281l.f13452l) + interfaceC3588l.getString(c10459l.f21281l.f13456l);
        } else {
            C3429l c3429l = C11682l.yandex;
            C10728l c10728lLoadAd = C11682l.loadAd(c13146l, interfaceC3588l, c14965l, true);
            if (c10728lLoadAd == null) {
                C11467l.Signature(interfaceC10696l, "No field signature for property: ");
                throw null;
            }
            String str = c10728lLoadAd.loadAd;
            String str2 = c10728lLoadAd.crashlytics;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC4792l.yandex(str));
            InterfaceC8371l interfaceC8371lSignature = interfaceC10696l.Signature();
            if (AbstractC8576l.yandex(interfaceC10696l.admob(), AbstractC6004l.amazon) && (interfaceC8371lSignature instanceof C11296l)) {
                Integer num = (Integer) AbstractC0714l.loadAd(((C11296l) interfaceC8371lSignature).f22762l, AbstractC8450l.mopub);
                string = "$".concat(AbstractC3583l.yandex.f22430l.matcher((num == null || (string2 = interfaceC3588l.getString(num.intValue())) == null) ? "main" : string2).replaceAll("_"));
            } else if (AbstractC8576l.yandex(interfaceC10696l.admob(), AbstractC6004l.yandex) && (interfaceC8371lSignature instanceof InterfaceC9921l)) {
                InterfaceC8850l interfaceC8850l = ((C1689l) interfaceC10696l).f4066l;
                if (interfaceC8850l instanceof C8269l) {
                    C8269l c8269l = (C8269l) interfaceC8850l;
                    if (c8269l.f17172l != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String strAmazon = c8269l.f17173l.amazon();
                        sb2.append(C3498l.purchase(AbstractC12024l.m3348transient('/', strAmazon, strAmazon)).loadAd());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strAd = AbstractC9361l.ad(sb, string, "()", str2);
        }
        this.mopub = strAd;
    }

    @Override // defpackage.AbstractC2648l
    public final String loadAd() {
        return this.mopub;
    }
}
