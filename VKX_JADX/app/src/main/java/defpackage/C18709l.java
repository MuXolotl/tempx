package defpackage;

import android.media.session.MediaController;

/* JADX INFO: renamed from: lۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18709l extends C8024l {
    @Override // defpackage.C13161l
    /* JADX INFO: renamed from: private */
    public final void mo3584private(float f) {
        if (f != 0.0f) {
            ((MediaController.TransportControls) this.f25776l).setPlaybackSpeed(f);
        } else {
            C8339l.metrica("speed must not be zero");
        }
    }
}
