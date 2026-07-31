package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C12382l extends AbstractC5921l {
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static ArrayList m3376super(C14025l c14025l, boolean z) {
        File file = c14025l.toFile();
        String[] list = file.list();
        if (list == null) {
            if (z) {
                if (!file.exists()) {
                    C8876l.billing(c14025l, "no such file: ");
                    return null;
                }
                C10754l.pro(c14025l, "failed to list ");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(c14025l.purchase(str));
        }
        AbstractC3826l.tapsense(arrayList);
        return arrayList;
    }

    @Override // defpackage.AbstractC5921l
    public final void adcel(C14025l c14025l, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c14025l.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            C10754l.pro(c14025l, "failed to delete ");
        } else if (z) {
            C8876l.billing(c14025l, "no such file: ");
        }
    }

    @Override // defpackage.AbstractC5921l
    public void billing(C14025l c14025l, C14025l c14025l2) {
        if (c14025l.toFile().renameTo(c14025l2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c14025l + " to " + c14025l2);
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: continue */
    public final InterfaceC10506l mo691continue(C14025l c14025l, boolean z) throws IOException {
        if (!z || !isVip(c14025l)) {
            return AbstractC7709l.amazon(c14025l.toFile());
        }
        throw new IOException(c14025l + " already exists.");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: default */
    public final InterfaceC14991l mo692default(C14025l c14025l) {
        return new C15900l(new FileInputStream(c14025l.toFile()), C3446l.amazon);
    }

    @Override // defpackage.AbstractC5921l
    public final List inmobi(C14025l c14025l) {
        return m3376super(c14025l, false);
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: private */
    public C18402l mo694private(C14025l c14025l) {
        File file = c14025l.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C18402l(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // defpackage.AbstractC5921l
    public final List signatures(C14025l c14025l) {
        return m3376super(c14025l, true);
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: switch */
    public final C13007l mo695switch(C14025l c14025l) {
        return new C13007l(true, new RandomAccessFile(c14025l.toFile(), "rw"));
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: throw */
    public final C13007l mo696throw(C14025l c14025l) {
        return new C13007l(false, new RandomAccessFile(c14025l.toFile(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.AbstractC5921l
    public final void vip(C14025l c14025l) throws IOException {
        if (c14025l.toFile().mkdir()) {
            return;
        }
        C18402l c18402lMo694private = mo694private(c14025l);
        if (c18402lMo694private == null || !c18402lMo694private.loadAd) {
            C10754l.pro(c14025l, "failed to create directory: ");
        }
    }

    @Override // defpackage.AbstractC5921l
    public final InterfaceC10506l yandex(C14025l c14025l) {
        return new C0328l(new FileOutputStream(c14025l.toFile(), true), new C3446l());
    }
}
