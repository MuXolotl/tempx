package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: lؓۨؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2279l extends AbstractC4349l implements InterfaceC4202l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final File f4976l;

    public C2279l(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f4976l = file;
    }

    @Override // defpackage.InterfaceC4202l
    public final File zza() {
        return this.f4976l;
    }
}
