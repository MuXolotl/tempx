package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖۦۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16783l extends AbstractC14910l {
    public final C11315l loadAd;

    public C16783l(Function0 function0) {
        super(function0);
        this.loadAd = new C11315l();
    }

    @Override // defpackage.AbstractC14910l
    public final void loadAd(Object obj) {
        synchronized (this) {
            try {
                if (this.loadAd.pro() < AbstractC5081l.yandex) {
                    this.loadAd.addLast(obj);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC14910l
    public final Object yandex() {
        Object objRemoveLast;
        synchronized (this) {
            C11315l c11315l = this.loadAd;
            objRemoveLast = c11315l.isEmpty() ? null : c11315l.removeLast();
        }
        return objRemoveLast == null ? this.yandex.invoke() : objRemoveLast;
    }
}
