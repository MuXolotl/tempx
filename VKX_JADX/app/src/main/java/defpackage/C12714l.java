package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: renamed from: lؚّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12714l implements InterfaceC14209l, InterfaceC17443l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f25072l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f25073l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f25074l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f25075l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f25076l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f25077l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f25078l;

    public C12714l(C1424l c1424l, InterfaceC17477l interfaceC17477l, C3624l c3624l, List list, InterfaceC5706l interfaceC5706l) {
        this.f25072l = c1424l;
        this.f25077l = interfaceC17477l;
        this.f25076l = c3624l;
        this.f25078l = list;
        this.f25073l = interfaceC5706l;
        this.f25075l = c1424l;
        this.f25074l = new HashMap();
    }

    public static C12714l billing(Context context, C9667l c9667l, C12714l c12714l, C4127l c4127l, C10023l c10023l, C6472l c6472l, C13645l c13645l, C7644l c7644l, C2494l c2494l, C7747l c7747l, C0554l c0554l) {
        C14941l c14941l = new C14941l(context, c9667l, c4127l, c13645l, c7644l);
        C17093l c17093l = new C17093l(c12714l, c7644l, c7747l);
        C9228l c9228l = C5761l.loadAd;
        C4225l.loadAd(context);
        return new C12714l(c14941l, c17093l, new C5761l(new C9516l(C4225l.yandex().crashlytics(new C16529l(C5761l.crashlytics, C5761l.amazon)).yandex("FIREBASE_CRASHLYTICS_REPORT", new C7017l("json"), C5761l.purchase), c7644l.firebase(), c2494l)), c10023l, c6472l, c9667l, c0554l);
    }

    public static synchronized void firebase(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static AbstractC2883l loadAd(C17358l c17358l, C6472l c6472l) {
        List listCrashlytics = ((C7375l) c6472l.f13510l).crashlytics();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listCrashlytics.size(); i++) {
            AbstractC1211l abstractC1211l = (AbstractC1211l) listCrashlytics.get(i);
            abstractC1211l.getClass();
            C0960l c0960l = new C0960l();
            C3996l c3996l = (C3996l) abstractC1211l;
            String str = c3996l.purchase;
            if (str == null) {
                C6541l.subs("Null variantId");
                return null;
            }
            String str2 = c3996l.loadAd;
            if (str2 == null) {
                C6541l.subs("Null rolloutId");
                return null;
            }
            c0960l.yandex = new C9895l(str2, str);
            String str3 = c3996l.crashlytics;
            if (str3 == null) {
                C6541l.subs("Null parameterKey");
                return null;
            }
            c0960l.loadAd = str3;
            c0960l.crashlytics = c3996l.amazon;
            c0960l.amazon = c3996l.billing;
            c0960l.purchase = (byte) (c0960l.purchase | 1);
            arrayList.add(c0960l.yandex());
        }
        if (arrayList.isEmpty()) {
            return c17358l;
        }
        C0495l c0495lYandex = c17358l.yandex();
        c0495lYandex.billing = new C1222l(arrayList);
        return c0495lYandex.yandex();
    }

    public static boolean metrica(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                metrica(file2);
            }
        }
        return file.delete();
    }

    public static String purchase(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static C5501l smaato(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new C5501l(14, (C2150l) C2494l.m1152l(C8082l.m2256package(byteArrayInputStream, C7597l.yandex())).m1196l().ad());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static List startapp(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static List subs(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                C6541l.subs("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                C6541l.subs("Null value");
                return null;
            }
            arrayList.add(new C15474l(str, str2));
        }
        Collections.sort(arrayList, new C2351l(23));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static C17358l yandex(C17358l c17358l, C10023l c10023l, C6472l c6472l, Map map) {
        Map mapUnmodifiableMap;
        C0495l c0495lYandex = c17358l.yandex();
        String strCrashlytics = ((InterfaceC12665l) c10023l.f20418l).crashlytics();
        if (strCrashlytics != null) {
            c0495lYandex.purchase = new C4473l(strCrashlytics);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        C11919l c11919l = (C11919l) c6472l.f13514l;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((C11787l) ((AtomicMarkableReference) c11919l.f23763l).getReference()).yandex();
        } else {
            HashMap map2 = new HashMap(((C11787l) ((AtomicMarkableReference) c11919l.f23763l).getReference()).yandex());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strLoadAd = C11787l.loadAd(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strLoadAd)) {
                    map2.put(strLoadAd, C11787l.loadAd(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
        }
        List listSubs = subs(mapUnmodifiableMap);
        List listSubs2 = subs(((C11787l) ((AtomicMarkableReference) ((C11919l) c6472l.f13516l).f23763l).getReference()).yandex());
        if (!listSubs.isEmpty() || !listSubs2.isEmpty()) {
            C5161l c5161l = (C5161l) c17358l.crashlytics;
            c0495lYandex.crashlytics = new C5161l(c5161l.yandex, listSubs, listSubs2, c5161l.amazon, c5161l.purchase, c5161l.billing, c5161l.mopub);
        }
        return c0495lYandex.yandex();
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract */
    public void mo1662abstract() {
        C1424l c1424l = (C1424l) this.f25072l;
        C3624l c3624l = (C3624l) this.f25076l;
        HashMap map = (HashMap) this.f25074l;
        boolean zM962try = false;
        if (c3624l.equals(AbstractC2721l.loadAd)) {
            Object obj = map.get(C3498l.purchase("value"));
            C16634l c16634l = obj instanceof C16634l ? (C16634l) obj : null;
            if (c16634l != null) {
                Object obj2 = c16634l.yandex;
                C12744l c12744l = obj2 instanceof C12744l ? (C12744l) obj2 : null;
                if (c12744l != null) {
                    zM962try = c1424l.m962try(c12744l.yandex.yandex);
                }
            }
        }
        if (zM962try || c1424l.m962try(c3624l)) {
            return;
        }
        ((List) this.f25078l).add(new C16826l(((InterfaceC17477l) this.f25077l).ad(), map, (InterfaceC5706l) this.f25073l));
    }

    public C3823l adcel(String str, Executor executor) {
        C2350l c2350l;
        ArrayList<File> arrayListLoadAd = ((C17093l) this.f25074l).loadAd();
        ArrayList<C4635l> arrayList = new ArrayList();
        for (File file : arrayListLoadAd) {
            try {
                C9228l c9228l = C17093l.mopub;
                String strPurchase = C17093l.purchase(file);
                c9228l.getClass();
                arrayList.add(new C4635l(C9228l.subs(strPurchase), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C4635l c4635l : arrayList) {
            if (str == null || str.equals(c4635l.loadAd)) {
                C5761l c5761l = (C5761l) this.f25072l;
                C11091l c11091l = c4635l.yandex;
                if (c11091l.billing == null || c11091l.mopub == null) {
                    C18530l c18530lLoadAd = ((C9667l) this.f25078l).loadAd(true);
                    C11091l c11091l2 = c4635l.yandex;
                    String str2 = c18530lLoadAd.yandex;
                    C10221l c10221lYandex = c11091l2.yandex();
                    c10221lYandex.purchase = str2;
                    C11091l c11091lYandex = c10221lYandex.yandex();
                    String str3 = c18530lLoadAd.loadAd;
                    C10221l c10221lYandex2 = c11091lYandex.yandex();
                    c10221lYandex2.billing = str3;
                    c4635l = new C4635l(c10221lYandex2.yandex(), c4635l.loadAd, c4635l.crashlytics);
                }
                boolean z = str != null;
                C9516l c9516l = c5761l.yandex;
                synchronized (c9516l.billing) {
                    try {
                        c2350l = new C2350l();
                        if (z) {
                            ((AtomicInteger) c9516l.subs.f5291l).getAndIncrement();
                            if (c9516l.billing.size() < c9516l.purchase) {
                                C17334l c17334l = C17334l.f33646l;
                                c17334l.m4316l("Enqueueing report: " + c4635l.loadAd);
                                c17334l.m4316l("Queue size: " + c9516l.billing.size());
                                c9516l.mopub.execute(new RunnableC7706l(c9516l, c4635l, c2350l, 2));
                                c17334l.m4316l("Closing task for report: " + c4635l.loadAd);
                                c2350l.amazon(c4635l);
                            } else {
                                c9516l.yandex();
                                String str4 = "Dropping report due to queue being full: " + c4635l.loadAd;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) c9516l.subs.f5290l).getAndIncrement();
                                c2350l.amazon(c4635l);
                            }
                        } else {
                            c9516l.loadAd(c4635l, c2350l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(c2350l.yandex.mopub(executor, new C11983l(this)));
            }
        }
        return AbstractC4311l.ads(arrayList2);
    }

    public File admob(String str, String str2) {
        File file = new File((File) this.f25077l, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void amazon(String str) {
        File file = new File((File) this.f25074l, str);
        if (file.exists() && metrica(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public synchronized C3585l crashlytics() {
        C3585l c3585l;
        try {
            if (((String) this.f25075l) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C3585l.f7509l) {
                try {
                    Context context = (Context) this.f25074l;
                    String str = (String) this.f25075l;
                    String str2 = (String) this.f25072l;
                    byte[] bArrCrashlytics = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrCrashlytics = AbstractC1315l.crashlytics(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(AbstractC15560l.Signature("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        C8339l.metrica("keysetName cannot be null");
                    }
                    String str3 = (String) this.f25077l;
                    if (bArrCrashlytics == null) {
                        if (str3 != null) {
                            this.f25076l = vip();
                        }
                        this.f25073l = mopub();
                    } else if (str3 != null) {
                        this.f25073l = remoteconfig(bArrCrashlytics);
                    } else {
                        this.f25073l = smaato(bArrCrashlytics);
                    }
                    c3585l = new C3585l(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c3585l;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        Context context = (Context) ((InterfaceC15897l) this.f25075l).get();
        C2690l c2690l = (C2690l) ((InterfaceC15897l) this.f25074l).get();
        C16163l c16163l = (C16163l) ((InterfaceC15897l) this.f25072l).get();
        C10111l c10111l = (C10111l) ((C12418l) this.f25077l).get();
        Executor executor = (Executor) ((InterfaceC15897l) this.f25076l).get();
        C16163l c16163l2 = (C16163l) ((InterfaceC15897l) this.f25078l).get();
        C6162l c6162l = new C6162l(14);
        C12899l c12899l = new C12899l(13);
        C16163l c16163l3 = (C16163l) ((InterfaceC15897l) this.f25073l).get();
        C7644l c7644l = new C7644l();
        c7644l.f15738l = context;
        c7644l.f15737l = c2690l;
        c7644l.f15734l = c16163l;
        c7644l.f15740l = c10111l;
        c7644l.f15739l = executor;
        c7644l.f15742l = c16163l2;
        c7644l.f15735l = c6162l;
        c7644l.f15736l = c12899l;
        c7644l.f15741l = c16163l3;
        return c7644l;
    }

    public void isPro(Throwable th, Thread thread, String str, C18724l c18724l, boolean z) {
        boolean zEquals = str.equals("crash");
        C14941l c14941l = (C14941l) this.f25075l;
        long j = c18724l.loadAd;
        Context context = c14941l.yandex;
        int i = context.getResources().getConfiguration().orientation;
        C13645l c13645l = c14941l.amazon;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C10038l c10038l = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c10038l = new C10038l(th2.getLocalizedMessage(), th2.getClass().getName(), c13645l.smaato(th2.getStackTrace()), c10038l, 28);
        }
        C10038l c10038l2 = c10038l;
        C0495l c0495l = new C0495l();
        c0495l.loadAd = str;
        c0495l.yandex = j;
        c0495l.mopub = (byte) (c0495l.mopub | 1);
        AbstractC1431l abstractC1431lLoadAd = C12668l.yandex.loadAd(context);
        int i2 = ((C4702l) abstractC1431lLoadAd).crashlytics;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListYandex = C12668l.yandex(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10038l2.f20466l;
        String name = thread.getName();
        if (name == null) {
            C6541l.subs("Null name");
            return;
        }
        List listAmazon = C14941l.amazon(stackTraceElementArr, 4);
        if (listAmazon == null) {
            C6541l.subs("Null frames");
            return;
        }
        arrayList.add(new C16498l(4, name, listAmazon));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrSmaato = c13645l.smaato(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        C6541l.subs("Null name");
                        return;
                    }
                    List listAmazon2 = C14941l.amazon(stackTraceElementArrSmaato, 0);
                    if (listAmazon2 == null) {
                        C6541l.subs("Null frames");
                        return;
                    }
                    arrayList.add(new C16498l(0, name2, listAmazon2));
                }
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        C16172l c16172lCrashlytics = C14941l.crashlytics(c10038l2, 0);
        C6990l c6990lPurchase = C14941l.purchase();
        List listYandex = c14941l.yandex();
        if (listYandex == null) {
            C6541l.subs("Null binaries");
            return;
        }
        c0495l.crashlytics = new C5161l(new C0139l(listUnmodifiableList, c16172lCrashlytics, null, c6990lPurchase, listYandex), null, null, boolValueOf, abstractC1431lLoadAd, arrayListYandex, i);
        c0495l.amazon = c14941l.loadAd(i);
        C17358l c17358lYandex = c0495l.yandex();
        Map map = c18724l.crashlytics;
        C10023l c10023l = (C10023l) this.f25077l;
        C6472l c6472l = (C6472l) this.f25076l;
        AbstractC2883l abstractC2883lLoadAd = loadAd(yandex(c17358lYandex, c10023l, c6472l, map), c6472l);
        if (z) {
            ((C17093l) this.f25074l).amazon(abstractC2883lLoadAd, c18724l.yandex, zEquals);
        } else {
            ((ExecutorC4850l) ((C0554l) this.f25073l).f1957l).yandex(new RunnableC14553l(this, abstractC2883lLoadAd, c18724l, zEquals, 3));
        }
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
        ((HashMap) this.f25074l).put(c3498l, new C17452l(c3624l, c3498l2));
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo1665l(C3498l c3498l, Object obj) {
        AbstractC0757l abstractC0757lSubs = C1083l.subs((C10202l) ((C1424l) this.f25075l).f3601l, obj);
        if (abstractC0757lSubs == null) {
            abstractC0757lSubs = new C15501l("Unsupported annotation argument: " + c3498l);
        }
        ((HashMap) this.f25074l).put(c3498l, abstractC0757lSubs);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
        ((HashMap) this.f25074l).put(c3498l, new C16634l(c14700l));
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        return new C10038l((C1424l) this.f25075l, c3498l, this);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        ArrayList arrayList = new ArrayList();
        C1424l c1424l = (C1424l) this.f25075l;
        return new C11644l(new C12714l(c1424l, AbstractC9033l.billing((C10202l) c1424l.f3601l, c3624l, (C12014l) c1424l.f3605l), c3624l, arrayList, InterfaceC5706l.f12087l), this, c3498l, arrayList);
    }

    public C5501l mopub() throws GeneralSecurityException {
        C3316l c3316l = (C3316l) this.f25078l;
        if (c3316l == null) {
            C18262l.ads("cannot read or generate keyset");
            return null;
        }
        AbstractC3302l abstractC3302lBilling = (AbstractC3302l) c3316l.f7072l;
        if (abstractC3302lBilling == null) {
            try {
                abstractC3302lBilling = AbstractC2130l.billing(c3316l.vip().purchase());
            } catch (GeneralSecurityException e) {
                throw new C6451l(15, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(abstractC3302lBilling)), e);
            }
        }
        C2494l c2494lM1153l = C2494l.m1153l(abstractC3302lBilling);
        Context context = (Context) this.f25074l;
        String str = (String) this.f25075l;
        C2494l c2494l = new C2494l(context, str, (String) this.f25072l);
        C8904l c8904l = (C8904l) this.f25076l;
        try {
            if (c8904l != null) {
                AbstractC11994l.smaato(c2494lM1153l, c2494l, c8904l, new byte[0]);
            } else {
                if (!((SharedPreferences.Editor) c2494l.f5291l).putString(str, AbstractC1315l.amazon(c2494lM1153l.m1196l().purchase())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            }
            return new C5501l(14, (C2150l) c2494lM1153l.m1196l().ad());
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public C5501l remoteconfig(byte[] bArr) {
        try {
            this.f25076l = new C1969l().loadAd((String) this.f25077l);
            try {
                return new C5501l(14, (C2150l) AbstractC11994l.subs(new C10685l(new ByteArrayInputStream(bArr)), (C8904l) this.f25076l, new byte[0]).m1196l().ad());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return smaato(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                C5501l c5501lSmaato = smaato(bArr);
                Object obj = C3585l.f7509l;
                Log.w("lٟؕۘ", "cannot use Android Keystore, it'll be disabled", e2);
                return c5501lSmaato;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public C8904l vip() throws KeyStoreException {
        Object obj = C3585l.f7509l;
        C1969l c1969l = new C1969l();
        try {
            boolean zYandex = C1969l.yandex((String) this.f25077l);
            try {
                return c1969l.loadAd((String) this.f25077l);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zYandex) {
                    throw new KeyStoreException(AbstractC15560l.Signature("the master key ", (String) this.f25077l, " exists but is unusable"), e);
                }
                Object obj2 = C3585l.f7509l;
                Log.w("lٟؕۘ", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = C3585l.f7509l;
            Log.w("lٟؕۘ", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public /* synthetic */ C12714l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f25075l = obj;
        this.f25074l = obj2;
        this.f25072l = obj3;
        this.f25077l = obj4;
        this.f25076l = obj5;
        this.f25078l = obj6;
        this.f25073l = obj7;
    }

    public C12714l() {
        this.f25074l = null;
        this.f25075l = null;
        this.f25072l = null;
        this.f25077l = null;
        this.f25076l = null;
        this.f25078l = null;
    }
}
