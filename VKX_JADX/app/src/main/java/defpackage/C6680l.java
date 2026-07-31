package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lؙُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6680l implements InterfaceC12538l {
    public final /* synthetic */ ServiceC16415l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C6680l(ServiceC16415l serviceC16415l, int i) {
        this.yandex = i;
        this.loadAd = serviceC16415l;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) {
        Object obj2;
        int i = this.yandex;
        ServiceC16415l serviceC16415l = this.loadAd;
        C9201l c9201l = (C9201l) obj;
        switch (i) {
            case 0:
                AbstractC12442l.metrica(c9201l, "LibraryResult must not be null");
                C1090l c1090l = new C1090l();
                if (c9201l.yandex != 0 || (obj2 = c9201l.crashlytics) == null) {
                    c1090l.smaato(null);
                } else {
                    C2427l c2427l = (C2427l) obj2;
                    byte[] bArr = c2427l.amazon.firebase;
                    if (bArr == null) {
                        c1090l.smaato(AbstractC18585l.yandex(c2427l, null));
                    } else {
                        ListenableFuture listenableFutureMo1119try = serviceC16415l.f32112l.remoteconfig.mo1119try(bArr);
                        RunnableC16241l runnableC16241l = new RunnableC16241l(c1090l, listenableFutureMo1119try, 0);
                        EnumC1535l enumC1535l = EnumC1535l.f3808l;
                        c1090l.yandex(runnableC16241l, enumC1535l);
                        listenableFutureMo1119try.yandex(new RunnableC10613l(listenableFutureMo1119try, c1090l, c2427l, 22), enumC1535l);
                    }
                }
                return c1090l;
            default:
                return ServiceC16415l.yandex(serviceC16415l, c9201l);
        }
    }
}
