package defpackage;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: lًٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C8024l extends C13161l {
    @Override // defpackage.C13161l
    public final void ad() {
        ((MediaController.TransportControls) this.f25776l).prepare();
    }

    @Override // defpackage.C13161l
    public final void advert(String str, Bundle bundle) {
        ((MediaController.TransportControls) this.f25776l).prepareFromMediaId(str, bundle);
    }

    @Override // defpackage.C13161l
    public final void applovin(Uri uri, Bundle bundle) {
        ((MediaController.TransportControls) this.f25776l).prepareFromUri(uri, bundle);
    }

    @Override // defpackage.C13161l
    public final void signatures(String str, Bundle bundle) {
        ((MediaController.TransportControls) this.f25776l).prepareFromSearch(str, bundle);
    }
}
