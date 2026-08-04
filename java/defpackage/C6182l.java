package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؙؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6182l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long f13035l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0458l f13036l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC0629l f13037l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C18389l f13038l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C11610l f13039l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f13040l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C2432l f13041l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0458l f13042l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InputStream f13043l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f13044l;

    static {
        AbstractC17959l.yandex("media3.datasource.okhttp");
    }

    public C6182l(C11610l c11610l, C0458l c0458l, C0908l c0908l) {
        super(true);
        c11610l.getClass();
        this.f13039l = c11610l;
        this.f13036l = c0458l;
        this.f13037l = c0908l;
        this.f13042l = new C0458l(27);
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        if (this.f13040l) {
            this.f13040l = false;
            startapp();
            subscription();
        }
        this.f13038l = null;
        this.f13041l = null;
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C5759l {
        C6705l c6705lCrashlytics;
        C7346l c7346lYandex;
        this.f13041l = c2432l;
        this.f13044l = 0L;
        this.f13035l = 0L;
        adcel();
        long j = c2432l.billing;
        int i = c2432l.crashlytics;
        long j2 = c2432l.mopub;
        String string = c2432l.yandex.toString();
        try {
            C13170l c13170l = new C13170l();
            c13170l.isPro(null, string);
            c6705lCrashlytics = c13170l.crashlytics();
        } catch (IllegalArgumentException unused) {
            c6705lCrashlytics = null;
        }
        if (c6705lCrashlytics == null) {
            throw new C5759l("Malformed URL", 1004);
        }
        C11644l c11644l = new C11644l(28);
        c11644l.f23358l = c6705lCrashlytics;
        HashMap map = new HashMap();
        C0458l c0458l = this.f13036l;
        if (c0458l != null) {
            map.putAll(c0458l.m552package());
        }
        map.putAll(this.f13042l.m552package());
        map.putAll(c2432l.purchase);
        for (Map.Entry entry : map.entrySet()) {
            c11644l.m3154l((String) entry.getKey(), (String) entry.getValue());
        }
        String strYandex = AbstractC18470l.yandex(j, j2);
        if (strYandex != null) {
            ((C16543l) c11644l.f23361l).loadAd("Range", strYandex);
        }
        if ((c2432l.subs & 1) != 1) {
            ((C16543l) c11644l.f23361l).loadAd("Accept-Encoding", "identity");
        }
        byte[] bArr = c2432l.amazon;
        if (bArr != null) {
            c7346lYandex = C15655l.yandex(bArr.length, null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = AbstractC15323l.loadAd;
            c7346lYandex = C15655l.yandex(bArr2.length, null, bArr2);
        } else {
            c7346lYandex = null;
        }
        c11644l.m3145l(C2432l.loadAd(i), c7346lYandex);
        C17778l c17778lYandex = this.f13039l.yandex(new C17032l(c11644l));
        try {
            C1090l c1090l = new C1090l();
            c17778lYandex.purchase(new C5501l(19, c1090l));
            try {
                C18389l c18389l = (C18389l) c1090l.get();
                this.f13038l = c18389l;
                AbstractC6897l abstractC6897l = c18389l.f35907l;
                abstractC6897l.getClass();
                this.f13043l = abstractC6897l.mo1516l().mo713l();
                int i2 = c18389l.f35915l;
                if (!c18389l.f35909l) {
                    if (i2 == 416 && j == AbstractC18470l.loadAd(c18389l.f35918l.amazon("Content-Range"))) {
                        this.f13040l = true;
                        ads(c2432l);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f13043l;
                        inputStream.getClass();
                        AbstractC17553l.loadAd(inputStream);
                    } catch (IOException unused2) {
                        String str = AbstractC15323l.yandex;
                    }
                    TreeMap treeMapAdmob = c18389l.f35918l.admob();
                    subscription();
                    throw new C4590l(i2, i2 == 416 ? new C12126l(2008) : null, treeMapAdmob);
                }
                C12105l c12105lMopub = abstractC6897l.mopub();
                String str2 = c12105lMopub != null ? c12105lMopub.yandex : "";
                InterfaceC0629l interfaceC0629l = this.f13037l;
                if (interfaceC0629l != null && !interfaceC0629l.apply(str2)) {
                    subscription();
                    throw new C2216l(AbstractC14814l.startapp("Invalid content type: ", str2), 2003);
                }
                long j3 = (i2 != 200 || j == 0) ? 0L : j;
                if (j2 != -1) {
                    this.f13035l = j2;
                } else {
                    long jBilling = abstractC6897l.billing();
                    this.f13035l = jBilling != -1 ? jBilling - j3 : -1L;
                }
                this.f13040l = true;
                ads(c2432l);
                try {
                    tapsense(j3);
                    return this.f13035l;
                } catch (C5759l e) {
                    subscription();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                c17778lYandex.amazon();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw C5759l.yandex(1, e3);
        }
    }

    @Override // defpackage.AbstractC1994l, defpackage.InterfaceC14090l
    public final Map isPro() {
        C18389l c18389l = this.f13038l;
        return c18389l == null ? Collections.EMPTY_MAP : c18389l.f35918l.admob();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C5759l {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f13035l;
            if (j != -1) {
                long j2 = j - this.f13044l;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f13043l;
                    String str = AbstractC15323l.yandex;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f13044l += (long) i3;
                        firebase(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f13043l;
                String str2 = AbstractC15323l.yandex;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f13044l += (long) i3;
                    firebase(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = AbstractC15323l.yandex;
            throw C5759l.yandex(2, e);
        }
    }

    public final void subscription() {
        C18389l c18389l = this.f13038l;
        if (c18389l != null) {
            AbstractC6897l abstractC6897l = c18389l.f35907l;
            abstractC6897l.getClass();
            abstractC6897l.close();
        }
        this.f13043l = null;
    }

    public final void tapsense(long j) throws C5759l {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096L);
                InputStream inputStream = this.f13043l;
                String str = AbstractC15323l.yandex;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new C5759l(2008);
                }
                j -= (long) i;
                firebase(i);
            } catch (IOException e) {
                if (!(e instanceof C5759l)) {
                    throw new C5759l(2000);
                }
                throw ((C5759l) e);
            }
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        C18389l c18389l = this.f13038l;
        if (c18389l != null) {
            return Uri.parse(c18389l.f35911l.yandex.subs);
        }
        C2432l c2432l = this.f13041l;
        if (c2432l != null) {
            return c2432l.yandex;
        }
        return null;
    }
}
