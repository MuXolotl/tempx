package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: lًٌٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8868l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f18224l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0458l f18225l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C0458l f18226l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public HttpURLConnection f18227l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f18228l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f18229l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f18230l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C2432l f18231l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f18232l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InputStream f18233l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f18234l;

    public C8868l(int i, int i2, C0458l c0458l) {
        super(true);
        this.f18229l = i;
        this.f18232l = i2;
        this.f18225l = c0458l;
        this.f18226l = new C0458l(27);
    }

    public final void Signature(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.f18233l;
            String str = AbstractC15323l.yandex;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C5759l(2000, 1, new InterruptedIOException());
            }
            if (i == -1) {
                throw new C5759l(2008);
            }
            j -= (long) i;
            firebase(i);
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        try {
            InputStream inputStream = this.f18233l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = AbstractC15323l.yandex;
                    throw new C5759l(2000, 3, e);
                }
            }
            this.f18233l = null;
            subscription();
            if (this.f18230l) {
                this.f18230l = false;
                startapp();
            }
            this.f18227l = null;
            this.f18231l = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.f18233l = null;
            subscription();
            if (this.f18230l) {
                this.f18230l = false;
                startapp();
            }
            this.f18227l = null;
            this.f18231l = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C5759l {
        long jMax;
        String str;
        this.f18231l = c2432l;
        this.f18228l = 0L;
        this.f18234l = 0L;
        adcel();
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            HttpURLConnection httpURLConnectionTapsense = tapsense(new URL(c2432l.yandex.toString()), c2432l.crashlytics, c2432l.amazon, c2432l.billing, c2432l.mopub, (c2432l.subs & 1) == 1, true, c2432l.purchase);
            long j = c2432l.mopub;
            long j2 = c2432l.billing;
            this.f18227l = httpURLConnectionTapsense;
            this.f18224l = httpURLConnectionTapsense.getResponseCode();
            httpURLConnectionTapsense.getResponseMessage();
            int i = this.f18224l;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionTapsense.getHeaderFields();
                if (this.f18224l == 416 && j2 == AbstractC18470l.loadAd(httpURLConnectionTapsense.getHeaderField("Content-Range"))) {
                    this.f18230l = true;
                    ads(c2432l);
                    if (j != -1) {
                        return j;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionTapsense.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC17553l.loadAd(errorStream);
                    } else {
                        String str2 = AbstractC15323l.yandex;
                    }
                } catch (IOException unused) {
                    String str3 = AbstractC15323l.yandex;
                }
                subscription();
                throw new C4590l(this.f18224l, this.f18224l == 416 ? new C12126l(2008) : null, headerFields);
            }
            httpURLConnectionTapsense.getContentType();
            if (this.f18224l != 200 || j2 == 0) {
                j2 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionTapsense.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j != -1) {
                this.f18234l = j;
            } else {
                String headerField = httpURLConnectionTapsense.getHeaderField("Content-Length");
                String headerField2 = httpURLConnectionTapsense.getHeaderField("Content-Range");
                Pattern pattern = AbstractC18470l.yandex;
                if (TextUtils.isEmpty(headerField)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField);
                    } catch (NumberFormatException unused2) {
                        AbstractC6427l.admob("HttpUtil", "Unexpected Content-Length [" + headerField + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    Matcher matcher = AbstractC18470l.yandex.matcher(headerField2);
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(2);
                            strGroup.getClass();
                            long j3 = Long.parseLong(strGroup);
                            String strGroup2 = matcher.group(1);
                            strGroup2.getClass();
                            str = "]";
                            long j4 = (j3 - Long.parseLong(strGroup2)) + 1;
                            if (jMax < 0) {
                                jMax = j4;
                            } else if (jMax != j4) {
                                try {
                                    AbstractC6427l.vip("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + str);
                                    jMax = Math.max(jMax, j4);
                                } catch (NumberFormatException unused3) {
                                    AbstractC6427l.admob("HttpUtil", "Unexpected Content-Range [" + headerField2 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.f18234l = jMax != -1 ? jMax - j2 : -1L;
            }
            try {
                this.f18233l = httpURLConnectionTapsense.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f18233l = new GZIPInputStream(this.f18233l);
                }
                this.f18230l = true;
                ads(c2432l);
                try {
                    Signature(j2);
                    return this.f18234l;
                } catch (IOException e) {
                    subscription();
                    if (e instanceof C5759l) {
                        throw ((C5759l) e);
                    }
                    throw new C5759l(2000, 1, e);
                }
            } catch (IOException e2) {
                subscription();
                throw new C5759l(2000, 1, e2);
            }
        } catch (IOException e3) {
            subscription();
            throw C5759l.yandex(1, e3);
        }
    }

    @Override // defpackage.AbstractC1994l, defpackage.InterfaceC14090l
    public final Map isPro() {
        HttpURLConnection httpURLConnection = this.f18227l;
        return httpURLConnection == null ? C15333l.f29966l : new C11358l(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C5759l {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f18234l;
            if (j != -1) {
                long j2 = j - this.f18228l;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f18233l;
                    String str = AbstractC15323l.yandex;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f18228l += (long) i3;
                        firebase(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f18233l;
                String str2 = AbstractC15323l.yandex;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f18228l += (long) i3;
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
        HttpURLConnection httpURLConnection = this.f18227l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC6427l.subs("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection tapsense(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f18229l);
        httpURLConnection.setReadTimeout(this.f18232l);
        HashMap map2 = new HashMap();
        C0458l c0458l = this.f18225l;
        if (c0458l != null) {
            map2.putAll(c0458l.m552package());
        }
        map2.putAll(this.f18226l.m552package());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strYandex = AbstractC18470l.yandex(j, j2);
        if (strYandex != null) {
            httpURLConnection.setRequestProperty("Range", strYandex);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C2432l.loadAd(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        HttpURLConnection httpURLConnection = this.f18227l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C2432l c2432l = this.f18231l;
        if (c2432l != null) {
            return c2432l.yandex;
        }
        return null;
    }
}
