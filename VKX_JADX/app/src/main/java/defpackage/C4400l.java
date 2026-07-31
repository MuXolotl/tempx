package defpackage;

import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: lؖۛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400l extends AbstractC16869l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C4400l(InterfaceC9955l interfaceC9955l, Throwable th) {
        this.yandex = 2;
        StringBuilder sb = new StringBuilder("<html><body><h1>Internal Server Error</h1><h2>Request Information:</h2><pre>");
        InterfaceC14280l interfaceC14280lBilling = interfaceC9955l.billing();
        sb.append("Method: " + ((C17721l) ((C1080l) AbstractC5715l.yandex(interfaceC14280lBilling)).f2971l) + '\n');
        sb.append("Path: " + AbstractC7000l.billing(interfaceC14280lBilling) + '\n');
        sb.append("Parameters: " + interfaceC14280lBilling.vip() + '\n');
        sb.append("From origin: " + AbstractC5715l.yandex(interfaceC14280lBilling) + '\n');
        sb.append("</pre><h2>Stack Trace:</h2><pre>");
        Iterator it = AbstractC12024l.m3316class(AbstractC11718l.mopub(th)).iterator();
        while (it.hasNext()) {
            sb.append("<span style=\"color:blue;\">" + ((String) it.next()) + "</span><br>");
        }
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("<br>Caused by:<br>");
            Iterator it2 = AbstractC12024l.m3316class(AbstractC11718l.mopub(cause)).iterator();
            while (it2.hasNext()) {
                sb.append("<span style=\"color:green;\">" + ((String) it2.next()) + "</span><br>");
            }
        }
        sb.append("</pre></body></html>");
        this.loadAd = sb.toString();
    }

    @Override // defpackage.AbstractC8870l
    public C2759l amazon() {
        switch (this.yandex) {
            case 2:
                C2759l c2759l = C2759l.f5975l;
                return C2759l.f5974l;
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.AbstractC16869l
    public final InterfaceC9354l purchase() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return AbstractC6745l.isPro((InputStream) obj);
            case 1:
                return (InterfaceC9354l) obj;
            default:
                return AbstractC12300l.yandex(C17423l.smaato((String) obj, AbstractC9050l.yandex));
        }
    }

    public /* synthetic */ C4400l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}
