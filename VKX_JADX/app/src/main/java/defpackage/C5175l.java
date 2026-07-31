package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: lؗۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5175l implements InterfaceC12665l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Charset f11240l = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C15770l f11241l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final File f11242l;

    public C5175l(File file) {
        this.f11242l = file;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // defpackage.InterfaceC12665l
    public final String crashlytics() {
        C6129l c6129l;
        byte[] bArr;
        if (this.f11242l.exists()) {
            loadAd();
            C15770l c15770l = this.f11241l;
            if (c15770l == null) {
                c6129l = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[c15770l.m4113synchronized()];
                try {
                    this.f11241l.vip(new C13568l(bArr2, iArr, 11));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                int i = iArr[0];
                c6129l = new C6129l();
                c6129l.yandex = bArr2;
                c6129l.loadAd = i;
            }
        } else {
            c6129l = null;
        }
        if (c6129l == null) {
            bArr = null;
        } else {
            int i2 = c6129l.loadAd;
            bArr = new byte[i2];
            System.arraycopy(c6129l.yandex, 0, bArr, 0, i2);
        }
        if (bArr != null) {
            return new String(bArr, f11240l);
        }
        return null;
    }

    public final void loadAd() {
        File file = this.f11242l;
        if (this.f11241l == null) {
            try {
                this.f11241l = new C15770l(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.InterfaceC12665l
    public final void smaato(long j, String str) {
        loadAd();
        if (this.f11241l == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.f11241l.yandex(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f11240l));
            while (!this.f11241l.adcel() && this.f11241l.m4113synchronized() > 65536) {
                this.f11241l.signatures();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    @Override // defpackage.InterfaceC12665l
    public final void yandex() {
        AbstractC2632l.crashlytics(this.f11241l, "There was a problem closing the Crashlytics log file.");
        this.f11241l = null;
    }
}
