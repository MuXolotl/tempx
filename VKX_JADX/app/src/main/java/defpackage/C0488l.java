package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؑٞۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0488l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC14666l f1802l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1803l;

    public /* synthetic */ C0488l(AbstractActivityC14666l abstractActivityC14666l, int i) {
        this.f1803l = i;
        this.f1802l = abstractActivityC14666l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1803l;
        int i2 = 0;
        AbstractActivityC14666l abstractActivityC14666l = this.f1802l;
        switch (i) {
            case 0:
                abstractActivityC14666l.reportFullyDrawn();
                return Unit.INSTANCE;
            case 1:
                return new C2241l(new C0488l(abstractActivityC14666l, i2));
            case 2:
                C9349l c9349l = new C9349l();
                abstractActivityC14666l.getNavigationEventDispatcher().loadAd(c9349l);
                return c9349l;
            case 3:
                return new C6478l(abstractActivityC14666l.getApplication(), abstractActivityC14666l, abstractActivityC14666l.getIntent() != null ? abstractActivityC14666l.getIntent().getExtras() : null);
            default:
                C16390l c16390l = new C16390l(new RunnableC0863l(abstractActivityC14666l, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC14666l.f23523l.yandex(new C2578l(c16390l, abstractActivityC14666l, i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC7762l(abstractActivityC14666l, c16390l, 22));
                    }
                }
                return c16390l;
        }
    }
}
