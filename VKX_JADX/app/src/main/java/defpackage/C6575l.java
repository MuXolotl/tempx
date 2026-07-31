package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lؙٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6575l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C6575l f13728l = new C6575l();

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return null;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
    }
}
