package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: lٗۛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17407l extends AbstractC12112l implements InterfaceC4202l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final File f33912l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FileOutputStream f33913l;

    public C17407l(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f33913l = fileOutputStream;
        this.f33912l = file;
    }

    @Override // defpackage.InterfaceC4202l
    public final File zza() {
        return this.f33912l;
    }
}
