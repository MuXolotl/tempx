package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؗ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5203l implements InterfaceC0684l, InterfaceC1601l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC12932l f11277l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1601l f11278l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC0684l f11279l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Throwable f11280l;

    public C5203l(InterfaceC0684l interfaceC0684l) {
        C4910l c4910lYandex = AbstractC8618l.yandex();
        this.f11279l = interfaceC0684l;
        this.f11278l = c4910lYandex;
    }

    @Override // defpackage.InterfaceC1601l
    public final void billing(Object obj) {
        this.f11278l.billing(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f11279l.close();
    }

    @Override // defpackage.InterfaceC0684l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final InterfaceC14742l mo668l(String str) {
        return this.f11279l.mo668l(str);
    }

    public final void mopub(StringBuilder sb) {
        if (this.f11277l == null && this.f11280l == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC12932l interfaceC12932l = this.f11277l;
        if (interfaceC12932l != null) {
            sb.append("\t\tCoroutine: " + interfaceC12932l);
            sb.append('\n');
        }
        Throwable th = this.f11280l;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = AbstractC16901l.m4233package(1, AbstractC12024l.m3316class(AbstractC11718l.mopub(th))).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f11279l.toString();
    }

    @Override // defpackage.InterfaceC1601l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        return this.f11278l.yandex(interfaceC14029l);
    }
}
