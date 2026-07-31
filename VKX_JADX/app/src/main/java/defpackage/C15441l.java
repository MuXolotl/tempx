package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: lٕؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15441l extends AbstractC0377l {
    public final /* synthetic */ int admob;
    public final Animatable subs;

    public /* synthetic */ C15441l(Animatable animatable, int i) {
        this.admob = i;
        this.subs = animatable;
    }

    @Override // defpackage.AbstractC0377l
    public final void billing() {
        switch (this.admob) {
            case 0:
                this.subs.start();
                break;
            default:
                ((C9437l) this.subs).start();
                break;
        }
    }

    @Override // defpackage.AbstractC0377l
    public final void mopub() {
        switch (this.admob) {
            case 0:
                this.subs.stop();
                break;
            default:
                ((C9437l) this.subs).stop();
                break;
        }
    }
}
