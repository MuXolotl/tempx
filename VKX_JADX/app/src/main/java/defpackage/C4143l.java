package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٕؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4143l implements InterfaceC13241l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C4143l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC13241l
    public final void accept(Object obj) {
        int i = this.yandex;
        Object obj2 = this.crashlytics;
        Object obj3 = this.loadAd;
        switch (i) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                ((AbstractC5698l) obj).getClass();
                throw null;
            case 2:
                C8857l c8857l = (C8857l) obj3;
                C3214l c3214l = (C3214l) obj2;
                c3214l.close();
                Surface surface = (Surface) c8857l.f18209l.remove(c3214l);
                if (surface != null) {
                    C10628l c10628l = c8857l.f18211l;
                    AbstractC6123l.amazon((AtomicBoolean) c10628l.f21563l, true);
                    AbstractC6123l.crashlytics((Thread) c10628l.f21569l);
                    c10628l.remoteconfig(surface, true);
                    return;
                }
                return;
            default:
                C0284l c0284l = (C0284l) obj3;
                C3214l c3214l2 = (C3214l) obj2;
                c3214l2.close();
                Surface surface2 = (Surface) c0284l.f1298l.remove(c3214l2);
                if (surface2 != null) {
                    C5133l c5133l = c0284l.f1300l;
                    AbstractC6123l.amazon((AtomicBoolean) c5133l.f21563l, true);
                    AbstractC6123l.crashlytics((Thread) c5133l.f21569l);
                    c5133l.remoteconfig(surface2, true);
                    return;
                }
                return;
        }
    }
}
