package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٌٍؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9414l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InputStream f19258l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f19259l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AssetManager f19260l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f19261l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Uri f19262l;

    public C9414l(Context context) {
        super(false);
        this.f19260l = context.getAssets();
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        this.f19262l = null;
        try {
            try {
                InputStream inputStream = this.f19258l;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19258l = null;
                if (this.f19261l) {
                    this.f19261l = false;
                    startapp();
                }
            } catch (IOException e) {
                throw new C7184l(e, 2000);
            }
        } catch (Throwable th) {
            this.f19258l = null;
            if (this.f19261l) {
                this.f19261l = false;
                startapp();
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C7184l {
        try {
            Uri uri = c2432l.yandex;
            long j = c2432l.billing;
            this.f19262l = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            adcel();
            InputStream inputStreamOpen = this.f19260l.open(path, 1);
            this.f19258l = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C7184l(null, 2008);
            }
            long j2 = c2432l.mopub;
            if (j2 != -1) {
                this.f19259l = j2;
            } else {
                long jAvailable = this.f19258l.available();
                this.f19259l = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f19259l = -1L;
                }
            }
            this.f19261l = true;
            ads(c2432l);
            return this.f19259l;
        } catch (C7184l e) {
            throw e;
        } catch (IOException e2) {
            throw new C7184l(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C7184l {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f19259l;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C7184l(e, 2000);
                }
            }
            InputStream inputStream = this.f19258l;
            String str = AbstractC15323l.yandex;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f19259l;
                if (j2 != -1) {
                    this.f19259l = j2 - ((long) i3);
                }
                firebase(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f19262l;
    }
}
