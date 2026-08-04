package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚؚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3250l {
    public final C1080l amazon;
    public final InterfaceC8979l[] crashlytics;
    public final List loadAd;
    public final /* synthetic */ int yandex;

    public C3250l(int i, List list) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = list;
                this.crashlytics = new InterfaceC8979l[list.size()];
                C1080l c1080l = new C1080l(new C4568l(11, this));
                this.amazon = c1080l;
                c1080l.m801throw(3);
                break;
            default:
                this.loadAd = list;
                this.crashlytics = new InterfaceC8979l[list.size()];
                this.amazon = new C1080l(new C4568l(1, this));
                break;
        }
    }

    public final void loadAd(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        int i = this.yandex;
        List list = this.loadAd;
        InterfaceC8979l[] interfaceC8979lArr = this.crashlytics;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < interfaceC8979lArr.length; i2++) {
                    cstatic.yandex();
                    cstatic.amazon();
                    InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 3);
                    C5978l c5978l = (C5978l) list.get(i2);
                    String str = c5978l.metrica;
                    AbstractC12442l.isPro("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                    String str2 = c5978l.yandex;
                    if (str2 == null) {
                        cstatic.amazon();
                        str2 = (String) cstatic.purchase;
                    }
                    C12984l c12984l = new C12984l();
                    c12984l.yandex = str2;
                    c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                    c12984l.vip = AbstractC3825l.vip(str);
                    c12984l.purchase = c5978l.purchase;
                    c12984l.amazon = c5978l.amazon;
                    c12984l.f25441native = c5978l.f12620private;
                    c12984l.adcel = c5978l.ads;
                    AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
                    interfaceC8979lArr[i2] = interfaceC8979lStartapp;
                }
                break;
            default:
                for (int i3 = 0; i3 < interfaceC8979lArr.length; i3++) {
                    cstatic.yandex();
                    cstatic.amazon();
                    InterfaceC8979l interfaceC8979lStartapp2 = interfaceC2053l.startapp(cstatic.crashlytics, 3);
                    C5978l c5978l2 = (C5978l) list.get(i3);
                    String str3 = c5978l2.metrica;
                    AbstractC12442l.isPro("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                    C12984l c12984l2 = new C12984l();
                    cstatic.amazon();
                    c12984l2.yandex = (String) cstatic.purchase;
                    c12984l2.remoteconfig = AbstractC3825l.vip("video/mp2t");
                    c12984l2.vip = AbstractC3825l.vip(str3);
                    c12984l2.purchase = c5978l2.purchase;
                    c12984l2.amazon = c5978l2.amazon;
                    c12984l2.f25441native = c5978l2.f12620private;
                    c12984l2.adcel = c5978l2.ads;
                    AbstractC9029l.license(c12984l2, interfaceC8979lStartapp2);
                    interfaceC8979lArr[i3] = interfaceC8979lStartapp2;
                }
                break;
        }
    }

    public void yandex(long j, C13143l c13143l) {
        if (c13143l.yandex() < 9) {
            return;
        }
        int iRemoteconfig = c13143l.remoteconfig();
        int iRemoteconfig2 = c13143l.remoteconfig();
        int iSignatures = c13143l.signatures();
        if (iRemoteconfig == 434 && iRemoteconfig2 == 1195456820 && iSignatures == 3) {
            this.amazon.amazon(j, c13143l);
        }
    }
}
