package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lًْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7975l implements InterfaceC14033l {
    public abstract Uri admob(Uri uri);

    @Override // defpackage.InterfaceC14033l
    public final OutputStream amazon(Uri uri) {
        return ((C17525l) this).loadAd.amazon(admob(uri));
    }

    @Override // defpackage.InterfaceC14033l
    public final void billing(Uri uri, Uri uri2) throws IOException {
        C17525l c17525l = (C17525l) this;
        c17525l.loadAd.billing(admob(uri), admob(uri2));
    }

    @Override // defpackage.InterfaceC14033l
    public final void purchase(Uri uri) throws IOException {
        ((C17525l) this).loadAd.purchase(admob(uri));
    }
}
