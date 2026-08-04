package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lْۘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13610l implements InterfaceC12538l {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13610l(Object obj, Object obj2, Object obj3, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = obj3;
    }

    @Override // defpackage.InterfaceC12538l
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        switch (this.yandex) {
            case 0:
                C18289l c18289l = (C18289l) this.loadAd;
                C18012l c18012l = (C18012l) this.crashlytics;
                C18012l c18012l2 = (C18012l) this.amazon;
                if (AbstractC7151l.crashlytics(c18012l).equals(AbstractC7151l.crashlytics(c18012l2))) {
                    return AbstractC7151l.purchase(obj);
                }
                C18012l c18012lAdmob = AbstractC7151l.admob(c18012l2, AbstractC6854l.loadAd(new C3013l(c18289l, c18012l2, 2)), (ExecutorC1688l) c18289l.purchase);
                synchronized (c18289l.subs) {
                    break;
                }
                return c18012lAdmob;
            default:
                C5702l c5702l = (C5702l) this.loadAd;
                return c5702l.crashlytics.remoteconfig((C3013l) this.crashlytics, (Executor) this.amazon);
        }
    }
}
