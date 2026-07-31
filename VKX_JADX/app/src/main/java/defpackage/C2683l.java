package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2683l implements InterfaceC7456l, InterfaceC3404l, InterfaceC18517l, InterfaceC1082l, InterfaceC11652l, InterfaceC11527l, InterfaceC12202l, InterfaceC10377l, InterfaceC2785l, InterfaceC15244l, InterfaceC1953l, InterfaceC18679l, InterfaceC18044l, InterfaceC16004l, InterfaceC0737l, InterfaceC16975l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5813l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5814l;

    public /* synthetic */ C2683l(int i, Object obj) {
        this.f5814l = i;
        this.f5813l = obj;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        ((C13281l) obj).yandex((C2183l) this.f5813l);
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        int i = this.f5814l;
        Object obj = this.f5813l;
        switch (i) {
            case 11:
                exc.printStackTrace();
                ((C18014l) obj).m4461try(new C14391l(exc));
                break;
            default:
                exc.printStackTrace();
                ((C7044l) obj).m2160finally(new C4420l(exc));
                break;
        }
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        int i = this.f5814l;
        Object obj2 = this.f5813l;
        switch (i) {
            case 10:
                ((C1412l) obj2).invoke(obj);
                break;
            default:
                ((C17387l) obj2).invoke(obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        return Long.valueOf(((C7025l) this.f5813l).firebase(((Long) obj).longValue()));
    }

    public C9489l crashlytics(C18449l c18449l) throws IOException {
        C16171l c16171l = (C16171l) this.f5813l;
        URL url = (URL) c18449l.f36010l;
        String strRemoteconfig = AbstractC2991l.remoteconfig("CctTransportBackend");
        if (Log.isLoggable(strRemoteconfig, 4)) {
            Log.i(strRemoteconfig, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c16171l.mopub);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c18449l.f36012l;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C14965l c14965l = c16171l.yandex;
                    C6480l c6480l = (C6480l) c18449l.f36009l;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C9309l c9309l = (C9309l) c14965l.f29441l;
                    C18403l c18403l = new C18403l(bufferedWriter, c9309l.f19121l, c9309l.f19120l, c9309l.f19119l, c9309l.f19122l);
                    c18403l.admob(c6480l);
                    c18403l.isPro();
                    c18403l.loadAd.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strRemoteconfig2 = AbstractC2991l.remoteconfig("CctTransportBackend");
                    if (Log.isLoggable(strRemoteconfig2, 4)) {
                        Log.i(strRemoteconfig2, String.format("Status Code: %d", numValueOf));
                    }
                    AbstractC2991l.subs("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC2991l.subs("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C9489l(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C9489l(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C9489l c9489l = new C9489l(responseCode, (URL) null, C17131l.yandex(new BufferedReader(new InputStreamReader(gZIPInputStream))).yandex);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c9489l;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            AbstractC2991l.isPro("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C9489l(500, (URL) null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            AbstractC2991l.isPro("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C9489l(500, (URL) null, 0L);
        } catch (IOException e3) {
            e = e3;
            AbstractC2991l.isPro("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C9489l(400, (URL) null, 0L);
        } catch (C4726l e4) {
            e = e4;
            AbstractC2991l.isPro("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C9489l(400, (URL) null, 0L);
        }
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        int i = this.f5814l;
        Object obj = this.f5813l;
        switch (i) {
            case 0:
                ((C14750l) obj).mo2154l(new C15079l(6, c5807l));
                return "Job.asListenableFuture";
            default:
                C5762l c5762l = (C5762l) obj;
                c5762l.vip.mopub();
                if (c5762l.metrica.yandex()) {
                    C17485l c17485l = (C17485l) c5762l.metrica.getValue();
                    synchronized (c17485l.yandex) {
                        c17485l.loadAd.disable();
                        c17485l.crashlytics.clear();
                        c17485l.amazon = -1;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                c5762l.yandex.loadAd().yandex(new RunnableC7762l(c5762l, c5807l, 19), c5762l.amazon);
                return "CameraX shutdownInternal";
        }
    }

    @Override // defpackage.InterfaceC1082l
    public Object firebase(IInterface iInterface) {
        int i = this.f5814l;
        Object obj = this.f5813l;
        switch (i) {
            case 3:
                try {
                    C15858l c15858lOpenMicrophone = ((IAppHost) iInterface).openMicrophone(new C15858l((OpenMicrophoneRequest) obj));
                    if (c15858lOpenMicrophone == null) {
                        return null;
                    }
                    return (OpenMicrophoneResponse) c15858lOpenMicrophone.yandex();
                } catch (C9954l e) {
                    Log.e("CarApp", "Cannot open microphone", e);
                    return null;
                }
            default:
                ((IAppHost) iInterface).sendLocation((Location) obj);
                return null;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f5814l;
        Object obj2 = this.f5813l;
        switch (i) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((InterfaceC13521l) obj).advert((C16684l) obj2);
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((InterfaceC13521l) obj).mo2739package(((SurfaceHolderCallbackC18330l) obj2).yandex.f34717l);
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((InterfaceC13521l) obj).metrica((C7417l) obj2);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((InterfaceC13521l) obj).billing((C15074l) obj2);
                break;
            default:
                ((InterfaceC13521l) obj).mo2731case((C2848l) obj2);
                break;
        }
    }

    @Override // defpackage.InterfaceC18517l
    public void isPro(Object obj) {
        ((Function1) ((InterfaceC8714l) this.f5813l).getValue()).invoke(obj);
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
        C5976l c5976l = (C5976l) this.f5813l;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        c5976l.loadAd.set((C5976l) interfaceC15189l.get());
    }

    @Override // defpackage.InterfaceC0737l
    public C2432l mopub(C2432l c2432l) {
        String str = (String) ((Function0) this.f5813l).invoke();
        if (str == null) {
            return c2432l;
        }
        Map mapSingletonMap = Collections.singletonMap("Authorization", str);
        HashMap map = new HashMap(c2432l.purchase);
        map.putAll(mapSingletonMap);
        return new C2432l(c2432l.yandex, c2432l.loadAd, c2432l.crashlytics, c2432l.amazon, map, c2432l.billing, c2432l.mopub, c2432l.admob, c2432l.subs, c2432l.isPro);
    }

    @Override // defpackage.InterfaceC11527l
    public void onStopRecording() {
        AbstractC12994l.yandex((AbstractC12994l) this.f5813l);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x04ca  */
    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        String string;
        String str;
        C17044l c17044l;
        String str2;
        boolean z;
        int i;
        int i2;
        Throwable th;
        String str3;
        C4353l c4353l;
        C3823l c3823l;
        C3823l c3823lRemoteconfig;
        boolean z2;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        C6871l c6871lIsPro;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f5813l;
        int i3 = CrashlyticsRegistrar.amazon;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C14184l c14184l = (C14184l) c11644l.remoteconfig(C14184l.class);
        InterfaceC6095l interfaceC6095l = (InterfaceC6095l) c11644l.remoteconfig(InterfaceC6095l.class);
        C1263l c1263lM3175l = c11644l.m3175l(C5976l.class);
        C1263l c1263lM3175l2 = c11644l.m3175l(InterfaceC6235l.class);
        C1263l c1263lM3175l3 = c11644l.m3175l(InterfaceC8588l.class);
        ExecutorService executorService = (ExecutorService) c11644l.mo622l(crashlyticsRegistrar.yandex);
        ExecutorService executorService2 = (ExecutorService) c11644l.mo622l(crashlyticsRegistrar.loadAd);
        ExecutorService executorService3 = (ExecutorService) c11644l.mo622l(crashlyticsRegistrar.crashlytics);
        c14184l.yandex();
        Context context = c14184l.yandex;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.4 for " + packageName, null);
        C0554l c0554l = new C0554l();
        c0554l.f1958l = new ExecutorC4850l(executorService);
        c0554l.f1957l = new ExecutorC4850l(executorService);
        AbstractC4311l.mopub(null);
        c0554l.f1956l = new ExecutorC4850l(executorService2);
        C12714l c12714l = new C12714l();
        String str4 = ((C4702l) C12668l.yandex.loadAd(context)).yandex;
        c12714l.f25075l = str4;
        File filesDir = context.getFilesDir();
        c12714l.f25074l = filesDir;
        if (str4.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str4.length() > 40 ? AbstractC2632l.firebase(str4) : str4.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        C12714l.firebase(file);
        c12714l.f25072l = file;
        File file2 = new File(file, "open-sessions");
        C12714l.firebase(file2);
        c12714l.f25077l = file2;
        File file3 = new File(file, "reports");
        C12714l.firebase(file3);
        c12714l.f25076l = file3;
        File file4 = new File(file, "priority-reports");
        C12714l.firebase(file4);
        c12714l.f25078l = file4;
        File file5 = new File(file, "native-reports");
        C12714l.firebase(file5);
        c12714l.f25073l = file5;
        C16557l c16557l = new C16557l(c14184l);
        C9667l c9667l = new C9667l(context, packageName, interfaceC6095l, c16557l);
        C5976l c5976l = new C5976l(c1263lM3175l);
        C15546l c15546l = new C15546l(c1263lM3175l2);
        C7747l c7747l = new C7747l(c16557l, c12714l);
        EnumC9110l enumC9110l = EnumC9110l.f18712l;
        C4749l c4749l = C4749l.yandex;
        C2631l c2631lYandex = C4749l.yandex(enumC9110l);
        if (c2631lYandex.loadAd != null) {
            Log.d("FirebaseSessions", "Subscriber " + enumC9110l + " already registered.");
            str = null;
        } else {
            c2631lYandex.loadAd = c7747l;
            Log.d("FirebaseSessions", "Subscriber " + enumC9110l + " registered.");
            str = null;
            c2631lYandex.yandex.billing(null);
        }
        String str5 = str;
        C17044l c17044l2 = new C17044l(c14184l, c9667l, c5976l, c16557l, new C0662l(c15546l), new C0662l(c15546l), c12714l, c7747l, new C10685l(c1263lM3175l3), c0554l);
        C0554l c0554l2 = c17044l2.metrica;
        c14184l.yandex();
        String str6 = c14184l.crashlytics.loadAd;
        int iMopub = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iMopub == 0) {
            iMopub = AbstractC2632l.mopub(context, "com.crashlytics.android.build_id", "string");
        }
        String string2 = iMopub != 0 ? context.getResources().getString(iMopub) : str5;
        ArrayList<C10690l> arrayList = new ArrayList();
        int iMopub2 = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iMopub3 = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iMopub4 = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        int i4 = 2;
        if (iMopub2 == 0 || iMopub3 == 0 || iMopub4 == 0) {
            c17044l = c17044l2;
            str2 = str6;
            z = false;
            i = 1;
            i2 = 3;
            String str7 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iMopub2), Integer.valueOf(iMopub3), Integer.valueOf(iMopub4));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                th = null;
                Log.d("FirebaseCrashlytics", str7, null);
            } else {
                th = null;
            }
        } else {
            z = false;
            String[] stringArray = context.getResources().getStringArray(iMopub2);
            String[] stringArray2 = context.getResources().getStringArray(iMopub3);
            String[] stringArray3 = context.getResources().getStringArray(iMopub4);
            i = 1;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i5 = 0;
                while (i5 < stringArray3.length) {
                    int i6 = i5;
                    arrayList.add(new C10690l(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i5 = i6 + 1;
                    str6 = str6;
                    c17044l2 = c17044l2;
                }
                c17044l = c17044l2;
                str2 = str6;
            } else {
                c17044l = c17044l2;
                str2 = str6;
                String str8 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str8, null);
                }
            }
            th = null;
            i2 = 3;
        }
        String strStartapp = AbstractC14814l.startapp("Mapping file ID is: ", string2);
        if (Log.isLoggable("FirebaseCrashlytics", i2)) {
            Log.d("FirebaseCrashlytics", strStartapp, th);
        }
        for (C10690l c10690l : arrayList) {
            String str9 = c10690l.yandex;
            String str10 = c10690l.loadAd;
            String str11 = c10690l.crashlytics;
            StringBuilder sbLicense = AbstractC14814l.license("Build id for ", str9, " on ", str10, ": ");
            sbLicense.append(str11);
            String string3 = sbLicense.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string3, null);
            }
        }
        C10023l c10023l = new C10023l();
        c10023l.f20419l = context;
        c10023l.f20418l = null;
        String str12 = str2;
        try {
            C4127l c4127lYandex = C4127l.yandex(context, c9667l, str12, string2, arrayList, c10023l);
            String str13 = "Installer package name is: " + c4127lYandex.amazon;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str13, null);
            }
            C15655l c15655l = new C15655l(i4);
            String str14 = c4127lYandex.billing;
            String str15 = c4127lYandex.mopub;
            String strAmazon = c9667l.amazon();
            C15655l c15655l2 = new C15655l(11);
            C5008l c5008l = new C5008l(23, c15655l2);
            C7026l c7026l = new C7026l(c12714l);
            Locale locale = Locale.US;
            C1693l c1693l = new C1693l(AbstractC15560l.Signature("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str12, "/settings"), c15655l);
            String str16 = Build.MANUFACTURER;
            String str17 = C9667l.admob;
            String strPro = AbstractC9361l.pro(str16.replaceAll(str17, ""), "/", Build.MODEL.replaceAll(str17, ""));
            String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str17, "");
            String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str17, "");
            int iMopub5 = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iMopub5 == 0) {
                iMopub5 = AbstractC2632l.mopub(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {iMopub5 != 0 ? context.getResources().getString(iMopub5) : null, str12, str15, str14};
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (true) {
                if (i7 >= 4) {
                    break;
                }
                String str18 = strArr[i7];
                String[] strArr2 = strArr;
                if (str18 != null) {
                    arrayList2.add(str18.replace("-", "").toLowerCase(Locale.US));
                }
                i7++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            String string4 = sb2.toString();
            C17643l c17643l = new C17643l(str12, strPro, strReplaceAll, strReplaceAll2, c9667l, string4.length() > 0 ? AbstractC2632l.firebase(string4) : null, str15, str14, AbstractC9361l.ads(strAmazon == null ? i : 4));
            C7644l c7644l = new C7644l();
            AtomicReference atomicReference = new AtomicReference();
            c7644l.f15736l = atomicReference;
            c7644l.f15741l = new AtomicReference(new C2350l());
            c7644l.f15738l = context;
            c7644l.f15737l = c17643l;
            c7644l.f15740l = c15655l2;
            c7644l.f15734l = c5008l;
            c7644l.f15739l = c7026l;
            c7644l.f15742l = c1693l;
            c7644l.f15735l = c16557l;
            atomicReference.set(C17334l.m4312l(c15655l2));
            AtomicReference atomicReference2 = (AtomicReference) c7644l.f15741l;
            AtomicReference atomicReference3 = (AtomicReference) c7644l.f15736l;
            if (!((Context) c7644l.f15738l).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((C17643l) c7644l.f15737l).billing) || (c6871lIsPro = c7644l.isPro(i)) == null) {
                C6871l c6871lIsPro2 = c7644l.isPro(3);
                if (c6871lIsPro2 != null) {
                    atomicReference3.set(c6871lIsPro2);
                    ((C2350l) atomicReference2.get()).amazon(c6871lIsPro2);
                }
                C16557l c16557l2 = (C16557l) c7644l.f15735l;
                C3823l c3823l2 = ((C2350l) c16557l2.f32505l).yandex;
                synchronized (c16557l2.f32503l) {
                    c3823l = ((C2350l) c16557l2.f32506l).yandex;
                }
                c3823lRemoteconfig = AbstractC3586l.purchase(c3823l2, c3823l).remoteconfig((ExecutorC4850l) c0554l.f1958l, new C13645l(c7644l, c0554l, false, 14));
            } else {
                atomicReference3.set(c6871lIsPro);
                ((C2350l) atomicReference2.get()).amazon(c6871lIsPro);
                c3823lRemoteconfig = AbstractC4311l.mopub(null);
            }
            c3823lRemoteconfig.amazon(executorService3, new C8876l(27));
            C17044l c17044l3 = c17044l;
            C12714l c12714l2 = c17044l3.subs;
            Context context2 = c17044l3.yandex;
            if (context2 == null || (resources = context2.getResources()) == null) {
                z2 = true;
            } else {
                int iMopub6 = AbstractC2632l.mopub(context2, "com.crashlytics.RequireBuildId", "bool");
                if (iMopub6 > 0) {
                    z2 = resources.getBoolean(iMopub6);
                } else {
                    int iMopub7 = AbstractC2632l.mopub(context2, "com.crashlytics.RequireBuildId", "string");
                    if (iMopub7 > 0) {
                        z2 = Boolean.parseBoolean(context2.getString(iMopub7));
                    } else {
                        z2 = true;
                    }
                }
            }
            String str19 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04cd: IGET (r8v18 'str19' java.lang.String) = (r36v0 ?? I:??[OBJECT, ARRAY]) A[DECLARE_VAR] (LINE:1230) l￘ﾖ￙ﾔￛﾡ.loadAd java.lang.String in method: l￘ﾔ￙ﾘ￙ﾑ.remoteconfig(l￙ﾐ￘ﾗ￙ﾏ):java.lang.Object, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1733
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2683l.remoteconfig(lُِؗ):java.lang.Object");
        }

        @Override // defpackage.InterfaceC1953l
        public Object smaato(C3823l c3823l) {
            int i = this.f5814l;
            Object obj = this.f5813l;
            switch (i) {
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    return (C3823l) ((CallableC12781l) obj).call();
                default:
                    ((Runnable) obj).run();
                    return AbstractC4311l.mopub(null);
            }
        }

        @Override // defpackage.InterfaceC18044l
        public C13708l subs(int i, C11916l c11916l, int[] iArr) {
            C9205l c9205l = (C9205l) this.f5813l;
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i2 = 0; i2 < c11916l.yandex; i2++) {
                c16971lMetrica.crashlytics(new C11782l(i, c11916l, i2, c9205l, iArr[i2]));
            }
            return c16971lMetrica.mopub();
        }

        @Override // defpackage.InterfaceC11652l
        public Object yandex() {
            TemplateWrapper templateWrapper;
            C17568l c17568l = (C17568l) this.f5813l;
            AbstractC9859l.yandex();
            AbstractC9859l.yandex();
            ArrayDeque<C7297l> arrayDeque = c17568l.yandex;
            C7297l c7297l = (C7297l) arrayDeque.peek();
            Objects.requireNonNull(c7297l);
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Requesting template from Screen " + c7297l);
            }
            PaneTemplate paneTemplateAmazon = c7297l.amazon();
            TemplateWrapper templateWrapperWrap = (!c7297l.f15146l || (templateWrapper = c7297l.f15143l) == null) ? TemplateWrapper.wrap(paneTemplateAmazon) : TemplateWrapper.wrap(paneTemplateAmazon, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
            c7297l.f15146l = false;
            c7297l.f15143l = templateWrapperWrap;
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Returning " + paneTemplateAmazon + " from screen " + c7297l);
            }
            ArrayList arrayList = new ArrayList();
            for (C7297l c7297l2 : arrayDeque) {
                if (c7297l2.f15143l == null) {
                    c7297l2.f15143l = TemplateWrapper.wrap(c7297l2.amazon());
                }
                arrayList.add(new TemplateInfo(c7297l2.f15143l.getTemplate().getClass(), c7297l2.f15143l.getId()));
            }
            templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
            return templateWrapperWrap;
        }

        @Override // defpackage.InterfaceC0737l
        public Uri purchase(Uri uri) {
            return uri;
        }
    }
