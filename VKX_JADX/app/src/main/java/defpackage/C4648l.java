package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lّؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4648l implements InterfaceC12202l, InterfaceC10377l, InterfaceC16369l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3823l f9456l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Exception f9457l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f9458l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9459l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f9460l = new Object();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f9461l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f9462l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9463l;

    public C4648l(int i, C3823l c3823l) {
        this.f9459l = i;
        this.f9456l = c3823l;
    }

    @Override // defpackage.InterfaceC10377l
    public final void adcel(Exception exc) {
        synchronized (this.f9460l) {
            this.f9461l++;
            this.f9457l = exc;
            yandex();
        }
    }

    @Override // defpackage.InterfaceC12202l
    public final void amazon(Object obj) {
        synchronized (this.f9460l) {
            this.f9462l++;
            yandex();
        }
    }

    @Override // defpackage.InterfaceC16369l
    public final void mopub() {
        synchronized (this.f9460l) {
            this.f9463l++;
            this.f9458l = true;
            yandex();
        }
    }

    public final void yandex() {
        int i = this.f9462l;
        int i2 = this.f9461l;
        int i3 = i + i2 + this.f9463l;
        int i4 = this.f9459l;
        if (i3 == i4) {
            Exception exc = this.f9457l;
            C3823l c3823l = this.f9456l;
            if (exc == null) {
                if (this.f9458l) {
                    c3823l.adcel();
                    return;
                } else {
                    c3823l.vip(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            c3823l.startapp(new ExecutionException(sb.toString(), this.f9457l));
        }
    }
}
