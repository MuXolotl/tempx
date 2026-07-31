package androidx.car.app.model.signin;

import android.net.Uri;
import defpackage.InterfaceC11796l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class QRCodeSignInMethod implements InterfaceC11796l {
    private final Uri mUri;

    public QRCodeSignInMethod(Uri uri) {
        Objects.requireNonNull(uri);
        this.mUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public Uri getUri() {
        Uri uri = this.mUri;
        Objects.requireNonNull(uri);
        return uri;
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
