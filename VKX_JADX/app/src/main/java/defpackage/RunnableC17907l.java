package defpackage;

import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l٘ٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC17907l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f34861l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Cgoto f34862l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final URL f34863l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34864l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Map f34865l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f34866l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f34867l;

    public RunnableC17907l(C11079l c11079l, String str, URL url, byte[] bArr, Map map, InterfaceC11139l interfaceC11139l) {
        Objects.requireNonNull(c11079l);
        this.f34862l = c11079l;
        AbstractC1051l.billing(str);
        AbstractC1051l.subs(url);
        this.f34863l = url;
        this.f34861l = bArr;
        this.f34867l = interfaceC11139l;
        this.f34866l = str;
        this.f34865l = map;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [l٘ٓٙ] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        RunnableC9860l runnableC9860l;
        C17923l c17923l;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r7;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r6;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        Object obj2 = this.f34867l;
        int i = this.f34864l;
        String str3 = "Content-Encoding";
        byte[] bArr = this.f34861l;
        Map map2 = this.f34865l;
        URL url = this.f34863l;
        Cgoto cgoto = this.f34862l;
        int responseCode2 = 0;
        String str4 = this.f34866l;
        switch (i) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                C11079l c11079l = (C11079l) cgoto;
                C17417l c17417l = (C17417l) c11079l.f833l;
                C17417l c17417l2 = (C17417l) c11079l.f833l;
                C17923l c17923l2 = c17417l.f33929l;
                C17417l.admob(c17923l2);
                c17923l2.m4443l();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    c17417l2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    C8118l c8118l = c17417l2.f33950l;
                                    C17417l.admob(c8118l);
                                    c8118l.f16908l.crashlytics(C8118l.m2260l(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c17923l = c17417l2.f33929l;
                            C17417l.admob(c17923l);
                            runnableC9860l = new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, iOException, (byte[]) null, map);
                            c17923l.m4449l(runnableC9860l);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    C8118l c8118l2 = c17417l2.f33950l;
                                    C17417l.admob(c8118l2);
                                    c8118l2.f16908l.crashlytics(C8118l.m2260l(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C17923l c17923l3 = c17417l2.f33929l;
                            C17417l.admob(c17923l3);
                            c17923l3.m4449l(new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        C13718l c13718l = c11079l.f13233l.f14452l;
                        C6901l.m2082case(c13718l);
                        byte[] bArrM3711l = c13718l.m3711l(bArr);
                        C8118l c8118l3 = c17417l2.f33950l;
                        C17417l.admob(c8118l3);
                        C14906l c14906l = c8118l3.f16911l;
                        int length = bArrM3711l.length;
                        c14906l.loadAd(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrM3711l);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c17923l = c17417l2.f33929l;
                            C17417l.admob(c17923l);
                            runnableC9860l = new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, iOException, (byte[]) null, map);
                            c17923l.m4449l(runnableC9860l);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C17923l c17923l4 = c17417l2.f33929l;
                            C17417l.admob(c17923l4);
                            c17923l4.m4449l(new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            c17923l = c17417l2.f33929l;
                                            C17417l.admob(c17923l);
                                            runnableC9860l = new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, (IOException) null, byteArray, headerFields);
                                            c17923l.m4449l(runnableC9860l);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            map = null;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c17923l = c17417l2.f33929l;
                            C17417l.admob(c17923l);
                            runnableC9860l = new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C17923l c17923l5 = c17417l2.f33929l;
                            C17417l.admob(c17923l5);
                            c17923l5.m4449l(new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c17923l = c17417l2.f33929l;
                        C17417l.admob(c17923l);
                        runnableC9860l = new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C17923l c17923l6 = c17417l2.f33929l;
                        C17417l.admob(c17923l6);
                        c17923l6.m4449l(new RunnableC9860l(this.f34866l, (InterfaceC11139l) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                C2489l c2489l = (C2489l) cgoto;
                C17417l c17417l3 = (C17417l) c2489l.f833l;
                C17417l c17417l4 = (C17417l) c2489l.f833l;
                C17923l c17923l7 = c17417l3.f33929l;
                C17417l.admob(c17923l7);
                c17923l7.m4443l();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    c17417l4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (IOException e8) {
                                e = e8;
                                str = null;
                                iOException2 = e;
                                outputStream2 = null;
                                r6 = str;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e9) {
                                        C8118l c8118l4 = c17417l4.f33950l;
                                        C17417l.admob(c8118l4);
                                        c8118l4.f16908l.crashlytics(C8118l.m2260l(str4), e9, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                yandex(responseCode2, iOException2, null, r6);
                                return;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            outputStream = null;
                            obj = null;
                            th2 = th;
                            r7 = obj;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e10) {
                                    C8118l c8118l5 = c17417l4.f33950l;
                                    C17417l.admob(c8118l5);
                                    c8118l5.f16908l.crashlytics(C8118l.m2260l(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            yandex(responseCode2, null, null, r7);
                            throw th2;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            C8118l c8118l6 = c17417l4.f33950l;
                            C17417l.admob(c8118l6);
                            C14906l c14906l2 = c8118l6.f16911l;
                            int length2 = byteArray2.length;
                            c14906l2.loadAd(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r6 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                yandex(responseCode2, iOException2, null, r6);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r7 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                yandex(responseCode2, null, null, r7);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            C8118l c8118l7 = c17417l4.f33950l;
                            C17417l.admob(c8118l7);
                            c8118l7.f16908l.loadAd(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream2.read(bArr3);
                                        if (i3 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            yandex(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i3);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = str3;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r6 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            yandex(responseCode2, iOException2, null, r6);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            obj = "Content-Encoding";
                            outputStream = null;
                            httpURLConnection2 = httpURLConnection2;
                            th2 = th;
                            r7 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            yandex(responseCode2, null, null, r7);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = null;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r6 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        yandex(responseCode2, iOException2, null, r6);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        outputStream = null;
                        obj = null;
                        th2 = th;
                        r7 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        yandex(responseCode2, null, null, r7);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r7 = 0;
                }
                break;
        }
    }

    public void yandex(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        C17923l c17923l = ((C17417l) ((C2489l) this.f34862l).f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new Runnable() { // from class: lْۜۗ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC17907l runnableC17907l = this.f26724l;
                ((InterfaceC15111l) runnableC17907l.f34867l).purchase(runnableC17907l.f34866l, i, iOException, bArr, map);
            }
        });
    }

    public RunnableC17907l(C2489l c2489l, String str, URL url, byte[] bArr, HashMap map, InterfaceC15111l interfaceC15111l) {
        Objects.requireNonNull(c2489l);
        this.f34862l = c2489l;
        AbstractC1051l.billing(str);
        this.f34863l = url;
        this.f34861l = bArr;
        this.f34867l = interfaceC15111l;
        this.f34866l = str;
        this.f34865l = map;
    }
}
