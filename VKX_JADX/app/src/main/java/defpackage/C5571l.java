package defpackage;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lٍؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5571l extends AbstractC0958l {
    public final Object metrica;
    public final /* synthetic */ int vip = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5571l(C15691l c15691l, Size size) {
        super(34, size);
        this.metrica = c15691l;
    }

    @Override // defpackage.AbstractC0958l
    public final ListenableFuture billing() {
        int i = this.vip;
        Object obj = this.metrica;
        switch (i) {
            case 0:
                return AbstractC11356l.mopub((Surface) obj);
            default:
                return ((C15691l) obj).admob;
        }
    }

    public C5571l(Surface surface, Size size, int i) {
        super(i, size);
        this.metrica = surface;
    }
}
