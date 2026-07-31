package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lٍۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC17818l extends AbstractBinderC15260l {
    public final /* synthetic */ C2350l admob;
    public final /* synthetic */ int mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC17818l(C7560l c7560l, C2350l c2350l) {
        super(0);
        this.mopub = 0;
        this.admob = c2350l;
        Objects.requireNonNull(c7560l);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: return */
    public final void mo3949return(Bundle bundle) {
        int i = this.mopub;
        C2350l c2350l = this.admob;
        switch (i) {
            case 0:
                c2350l.loadAd(bundle);
                break;
            case 1:
                c2350l.loadAd(bundle);
                break;
            default:
                c2350l.loadAd(bundle);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC17818l(C7560l c7560l, C2350l c2350l, int i) {
        super(0);
        this.mopub = i;
        this.admob = c2350l;
    }
}
