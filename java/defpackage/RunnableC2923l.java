package defpackage;

/* JADX INFO: renamed from: lؔۜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2923l extends C14274l implements Runnable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f6364l;

    public RunnableC2923l(long j, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l, interfaceC14029l.metrica());
        this.f6364l = j;
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final String mo1268abstract() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo1268abstract());
        sb.append("(timeMillis=");
        return AbstractC12900l.smaato(sb, this.f6364l, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12932l interfaceC12932l = this.f26857l;
        AbstractC8532l.admob(interfaceC12932l);
        C0499l c0499l = (C0499l) interfaceC12932l.mo245l(C0499l.f1807l);
        String str = c0499l != null ? c0499l.f1808l : null;
        String strSubscription = AbstractC2812l.subscription(this.f6364l, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbIsVip = AbstractC5020l.isVip("Coroutine \"", str, "\" ");
            if (strSubscription.length() > 0) {
                strSubscription = Character.toLowerCase(strSubscription.charAt(0)) + strSubscription.substring(1);
            }
            sbIsVip.append(strSubscription);
            strSubscription = sbIsVip.toString();
        }
        pro(new C14749l(strSubscription, this));
    }
}
