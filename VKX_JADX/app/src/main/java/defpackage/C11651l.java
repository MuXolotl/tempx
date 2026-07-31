package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: renamed from: lِؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11651l implements InterfaceC12538l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11651l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) throws IOException {
        int i = this.yandex;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                C10316l c10316l = (C10316l) obj2;
                int i2 = ((C9303l) obj).f19114l;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !c10316l.admob.loadAd()) {
                    c10316l.loadAd();
                }
                return C5113l.f11111l;
            case 1:
                C0223l c0223l = (C0223l) obj2;
                c0223l.getClass();
                CallableC14455l callableC14455l = new CallableC14455l(c0223l, (C15643l) obj, 4);
                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c0223l.yandex.yandex();
                RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(callableC14455l);
                scheduledExecutorServiceC6354lYandex.execute(runnableFutureC13286l);
                return runnableFutureC13286l;
            case 2:
                return AbstractC7151l.billing((ListenableFuture) ((C2079l) obj2).purchase.get());
            case 3:
                return AbstractC7151l.purchase(((C1164l) obj2).apply(obj));
            case 4:
                return ((C5702l) obj2).purchase.m952l();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
