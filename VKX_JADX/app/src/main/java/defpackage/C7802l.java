package defpackage;

import java.io.File;

/* JADX INFO: renamed from: lًؙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7802l extends C8413l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7802l(File file, int i) {
        super(file, (File) null, "Cannot list files in a directory");
        switch (i) {
            case 2:
                super(file, (File) null, "The source file doesn't exist.");
                break;
            default:
                break;
        }
    }
}
