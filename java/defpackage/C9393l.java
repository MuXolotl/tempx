package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lًٍؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9393l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AssetFileDescriptor f19236l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public FileInputStream f19237l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f19238l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ContentResolver f19239l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f19240l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Uri f19241l;

    public C9393l(Context context) {
        super(false);
        this.f19239l = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // defpackage.InterfaceC14090l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f19241l = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f19237l     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f19237l = r0
            android.content.res.AssetFileDescriptor r3 = r5.f19236l     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f19236l = r0
            boolean r0 = r5.f19238l
            if (r0 == 0) goto L2b
            r5.f19238l = r2
            r5.startapp()
        L2b:
            return
        L2c:
            lؚۙۥ r4 = new lؚۙۥ     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f19236l = r0
            boolean r0 = r5.f19238l
            if (r0 == 0) goto L3d
            r5.f19238l = r2
            r5.startapp()
        L3d:
            throw r1
        L3e:
            lؚۙۥ r4 = new lؚۙۥ     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f19237l = r0
            android.content.res.AssetFileDescriptor r4 = r5.f19236l     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f19236l = r0
            boolean r0 = r5.f19238l
            if (r0 == 0) goto L5d
            r5.f19238l = r2
            r5.startapp()
        L5d:
            throw r3
        L5e:
            lؚۙۥ r4 = new lؚۙۥ     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f19236l = r0
            boolean r0 = r5.f19238l
            if (r0 == 0) goto L6f
            r5.f19238l = r2
            r5.startapp()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9393l.close():void");
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C7492l {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c2432l.yandex;
                long j = c2432l.mopub;
                long j2 = c2432l.billing;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f19241l = uriNormalizeScheme;
                adcel();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f19239l;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f19236l = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C7492l(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new C7492l(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f19237l = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C7492l(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C7492l(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f19240l = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f19240l = jPosition;
                        if (jPosition < 0) {
                            throw new C7492l(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f19240l = j3;
                    if (j3 < 0) {
                        throw new C7492l(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f19240l;
                    this.f19240l = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f19238l = true;
                ads(c2432l);
                return j != -1 ? j : this.f19240l;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (C7492l e3) {
            throw e3;
        }
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C7492l {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f19240l;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C7492l(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f19237l;
            String str = AbstractC15323l.yandex;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f19240l;
                if (j2 != -1) {
                    this.f19240l = j2 - ((long) i3);
                }
                firebase(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f19241l;
    }
}
