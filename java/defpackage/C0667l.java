package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0667l implements InterfaceC11295l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f2140l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2141l;

    public /* synthetic */ C0667l(int i, Object obj) {
        this.f2141l = i;
        this.f2140l = obj;
    }

    public final String toString() {
        int i = this.f2141l;
        Object obj = this.f2140l;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + AbstractC17549l.purchase(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC11791l) obj) + ']';
        }
    }

    @Override // defpackage.InterfaceC11295l
    public final void yandex(Throwable th) {
        int i = this.f2141l;
        Object obj = this.f2140l;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                ((InterfaceC11791l) obj).yandex();
                break;
        }
    }
}
