package defpackage;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;

/* JADX INFO: renamed from: lؙؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6215l implements Handler.Callback {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC8782l f13130l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC14384l f13131l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7294l f13132l = new C7294l(this);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f13133l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC10759l f13134l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17954l f13135l;

    public C6215l(C17954l c17954l) {
        this.f13135l = c17954l;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C7294l c7294l = this.f13132l;
        C17954l c17954l = this.f13135l;
        if (!this.f13133l) {
            try {
                int i = message.what;
                if (i == 1) {
                    AbstractC14384l abstractC14384lAmazon = c17954l.yandex.amazon((C2427l) message.obj);
                    this.f13131l = abstractC14384lAmazon;
                    abstractC14384lAmazon.firebase(c7294l, null, C17849l.crashlytics);
                    c17954l.crashlytics.mopub(2);
                    return true;
                }
                if (i == 2) {
                    try {
                        InterfaceC8782l interfaceC8782l = this.f13130l;
                        if (interfaceC8782l == null) {
                            AbstractC14384l abstractC14384l = this.f13131l;
                            abstractC14384l.getClass();
                            abstractC14384l.isPro();
                        } else {
                            interfaceC8782l.admob();
                        }
                        c17954l.crashlytics.admob(2, 100);
                        return true;
                    } catch (IOException e) {
                        C15404l c15404l = c17954l.purchase.yandex;
                        synchronized (c15404l.f30096l) {
                            C1090l c1090l = c15404l.f30100l;
                            c1090l.getClass();
                            c1090l.remoteconfig(e);
                            c17954l.yandex();
                            return true;
                        }
                    }
                }
                if (i == 3) {
                    InterfaceC8782l interfaceC8782l2 = this.f13130l;
                    interfaceC8782l2.getClass();
                    C7751l c7751l = new C7751l();
                    c7751l.yandex = 0L;
                    interfaceC8782l2.adcel(new C11495l(c7751l));
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                try {
                    if (this.f13130l != null) {
                        AbstractC14384l abstractC14384l2 = this.f13131l;
                        abstractC14384l2.getClass();
                        abstractC14384l2.vip(this.f13130l);
                    }
                    AbstractC14384l abstractC14384l3 = this.f13131l;
                    if (abstractC14384l3 != null) {
                        abstractC14384l3.metrica(c7294l);
                    }
                    return true;
                } finally {
                    c17954l.crashlytics.purchase();
                    C17954l.mopub.loadAd();
                    this.f13133l = true;
                }
                c17954l.purchase.yandex(e);
                c17954l.yandex();
                return true;
            } catch (RuntimeException e2) {
                c17954l.purchase.yandex(e2);
                c17954l.yandex();
                return true;
            }
        }
        return true;
    }
}
