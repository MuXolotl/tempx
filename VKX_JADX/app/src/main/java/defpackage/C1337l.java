package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lؒۛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1337l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f3425l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f3426l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public RandomAccessFile f3427l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Uri f3428l;

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        this.f3428l = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3427l;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f3427l = null;
                if (this.f3426l) {
                    this.f3426l = false;
                    startapp();
                }
            } catch (IOException e) {
                throw new C0312l(e, 2000);
            }
        } catch (Throwable th) {
            this.f3427l = null;
            if (this.f3426l) {
                this.f3426l = false;
                startapp();
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C0312l {
        Uri uri = c2432l.yandex;
        long j = c2432l.billing;
        this.f3428l = uri;
        adcel();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f3427l = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c2432l.mopub;
                if (length == -1) {
                    length = this.f3427l.length() - j;
                }
                this.f3425l = length;
                if (length < 0) {
                    throw new C0312l(null, null, 2008);
                }
                this.f3426l = true;
                ads(c2432l);
                return this.f3425l;
            } catch (IOException e) {
                throw new C0312l(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C0312l(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbLicense = AbstractC14814l.license("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbLicense.append(fragment);
            throw new C0312l(sbLicense.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C0312l(e3, 2006);
        } catch (RuntimeException e4) {
            throw new C0312l(e4, 2000);
        }
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C0312l {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3425l;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f3427l;
            String str = AbstractC15323l.yandex;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f3425l -= (long) i3;
                firebase(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C0312l(e, 2000);
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f3428l;
    }
}
