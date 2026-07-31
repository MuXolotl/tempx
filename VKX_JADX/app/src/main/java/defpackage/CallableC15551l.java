package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lًَٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC15551l implements Callable {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public CallableC15551l(BinderC15526l binderC15526l, C13236l c13236l, String str) {
        this.yandex = 4;
        this.loadAd = binderC15526l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.yandex) {
            case 0:
                ((RunnableC11297l) this.loadAd).run();
                return null;
            case 1:
                ((Runnable) this.loadAd).run();
                return null;
            case 2:
                return ((Context) this.loadAd).getSharedPreferences("google_sdk_flags", 0);
            case 3:
                return new C8570l(((C8315l) this.loadAd).f17205l);
            case 4:
                BinderC15526l binderC15526l = (BinderC15526l) this.loadAd;
                binderC15526l.purchase.m2089continue();
                C11079l c11079l = binderC15526l.purchase.f14455l;
                C6901l.m2082case(c11079l);
                c11079l.mo211l();
                throw new IllegalStateException("Unexpected call on client side");
            case 5:
                return C18318l.crashlytics.yandex(((C4845l) this.loadAd).mopub);
            case 6:
                return C18318l.crashlytics.yandex(((C11734l) this.loadAd).yandex);
            case 7:
                C0848l c0848l = (C0848l) this.loadAd;
                synchronized (((C5702l) c0848l.f2498l).mopub) {
                    c0848l.f2499l = null;
                    break;
                }
                return null;
            default:
                return C18318l.crashlytics.yandex(((C17781l) this.loadAd).mopub);
        }
    }

    public /* synthetic */ CallableC15551l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}
