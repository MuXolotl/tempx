package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: lٍؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1737l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AssetFileDescriptor f4138l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public FileInputStream f4139l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f4140l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Context f4141l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f4142l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C2432l f4143l;

    public C1737l(Context context) {
        super(false);
        this.f4141l = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
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
            r5.f4143l = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f4139l     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f4139l = r0
            android.content.res.AssetFileDescriptor r3 = r5.f4138l     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f4138l = r0
            boolean r0 = r5.f4140l
            if (r0 == 0) goto L2b
            r5.f4140l = r2
            r5.startapp()
        L2b:
            return
        L2c:
            lٍؘٙ r4 = new lٍؘٙ     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f4138l = r0
            boolean r0 = r5.f4140l
            if (r0 == 0) goto L3d
            r5.f4140l = r2
            r5.startapp()
        L3d:
            throw r1
        L3e:
            lٍؘٙ r4 = new lٍؘٙ     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f4139l = r0
            android.content.res.AssetFileDescriptor r4 = r5.f4138l     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f4138l = r0
            boolean r0 = r5.f4140l
            if (r0 == 0) goto L5d
            r5.f4140l = r2
            r5.startapp()
        L5d:
            throw r3
        L5e:
            lٍؘٙ r4 = new lٍؘٙ     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f4138l = r0
            boolean r0 = r5.f4140l
            if (r0 == 0) goto L6f
            r5.f4140l = r2
            r5.startapp()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1737l.close():void");
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C5572l {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f4143l = c2432l;
        adcel();
        Uri uri = c2432l.yandex;
        long j = c2432l.mopub;
        long j2 = c2432l.billing;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f4141l;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C5572l("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C5572l("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C5572l("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C5572l("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C5572l("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC9361l.pro(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new C5572l("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C5572l("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f4138l = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f4138l.getFileDescriptor());
            this.f4139l = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C5572l(null, null, 2008);
                }
                long startOffset = this.f4138l.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C5572l(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f4142l = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f4142l = size;
                        if (size < 0) {
                            throw new C5572l(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f4142l = j3;
                    if (j3 < 0) {
                        throw new C12126l(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f4142l;
                    this.f4142l = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f4140l = true;
                ads(c2432l);
                return j != -1 ? j : this.f4142l;
            } catch (C5572l e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C5572l(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C5572l(null, e4, 2005);
        }
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C5572l {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4142l;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C5572l(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f4139l;
            String str = AbstractC15323l.yandex;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.f4142l;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.f4142l = j2 - ((long) i3);
                }
                firebase(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new C5572l("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        C2432l c2432l = this.f4143l;
        if (c2432l != null) {
            return c2432l.yandex;
        }
        return null;
    }
}
