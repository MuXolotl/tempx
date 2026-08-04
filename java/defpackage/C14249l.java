package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lٓٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14249l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11911l f27843l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27844l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC10022l f27845l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC1814l f27846l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16864l f27847l;
    private volatile /* synthetic */ int received = 0;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Object.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Object.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        f27843l = new C11911l("CustomResponse", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        f27844l = AtomicIntegerFieldUpdater.newUpdater(C14249l.class, "received");
    }

    public C14249l(C16864l c16864l) {
        this.f27847l = c16864l;
    }

    public final C17535l getAttributes() {
        InterfaceC1814l interfaceC1814l = this.f27846l;
        if (interfaceC1814l == null) {
            interfaceC1814l = null;
        }
        return interfaceC1814l.getAttributes();
    }

    public boolean loadAd() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpClientCall[");
        InterfaceC1814l interfaceC1814l = this.f27846l;
        if (interfaceC1814l == null) {
            interfaceC1814l = null;
        }
        sb.append(interfaceC1814l.getUrl());
        sb.append(", ");
        AbstractC10022l abstractC10022l = this.f27845l;
        sb.append((abstractC10022l != null ? abstractC10022l : null).mopub());
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        AbstractC10022l abstractC10022l = this.f27845l;
        if (abstractC10022l == null) {
            abstractC10022l = null;
        }
        return abstractC10022l.vip();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if (r8 == r5) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(defpackage.C11310l r7, defpackage.AbstractC0283l r8) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14249l.yandex(lُۚٔ, lّؑۧ):java.lang.Object");
    }
}
