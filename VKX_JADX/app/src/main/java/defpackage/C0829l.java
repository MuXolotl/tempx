package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lؒؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0829l implements InterfaceC12538l {
    public final /* synthetic */ int amazon;
    public final /* synthetic */ ArrayList crashlytics;
    public final /* synthetic */ C3013l loadAd;
    public final /* synthetic */ int yandex = 0;

    public /* synthetic */ C0829l(C3013l c3013l, int i, ArrayList arrayList) {
        this.loadAd = c3013l;
        this.amazon = i;
        this.crashlytics = arrayList;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) {
        switch (this.yandex) {
            case 0:
                int i = this.amazon;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) AbstractC7151l.crashlytics((Future) this.crashlytics.get(i2))).booleanValue()) {
                        ((List) this.loadAd.loadAd).get(i2).getClass();
                        C18725l.loadAd();
                        return null;
                    }
                }
                AbstractC1186l abstractC1186lTapsense = AbstractC1186l.tapsense(arrayList);
                CallableC11305l callableC11305l = new CallableC11305l();
                C8911l c8911l = new C8911l(abstractC1186lTapsense, true);
                c8911l.f18308l = new C10313l(c8911l, callableC11305l);
                c8911l.subscription();
                return c8911l;
            default:
                AbstractC12570l abstractC12570l = (AbstractC12570l) obj;
                ArrayList arrayList2 = this.crashlytics;
                AbstractC1186l abstractC1186lTapsense2 = AbstractC1186l.tapsense(arrayList2);
                C3013l c3013l = this.loadAd;
                C17516l c17516lYandex = AbstractC6854l.yandex(new C17219l(c3013l, abstractC12570l, this.amazon, arrayList2, 18));
                Executor executor = (Executor) c3013l.crashlytics;
                C8911l c8911l2 = new C8911l(abstractC1186lTapsense2, false);
                c8911l2.f18308l = new C10313l(c8911l2, c17516lYandex, executor);
                c8911l2.subscription();
                return c8911l2;
        }
    }

    public /* synthetic */ C0829l(C3013l c3013l, ArrayList arrayList, int i) {
        this.loadAd = c3013l;
        this.crashlytics = arrayList;
        this.amazon = i;
    }
}
