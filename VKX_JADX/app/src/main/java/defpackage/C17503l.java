package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: renamed from: lۣٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17503l {
    public static final C3781l ads = new C3781l(1);
    public static final Charset subscription = Charset.forName("UTF-8");
    public final C4127l admob;
    public final C6472l amazon;
    public final C9667l billing;
    public final C10023l crashlytics;
    public final InterfaceC9762l firebase;
    public final C5976l isPro;
    public final C16557l loadAd;
    public final C12714l mopub;
    public final C0554l purchase;
    public final C12714l remoteconfig;
    public final C7747l smaato;
    public final C10023l subs;
    public C2858l vip;
    public final Context yandex;
    public final C2350l metrica = new C2350l();
    public final C2350l startapp = new C2350l();
    public final C2350l adcel = new C2350l();

    public C17503l(Context context, C9667l c9667l, C16557l c16557l, C12714l c12714l, C10023l c10023l, C4127l c4127l, C6472l c6472l, C10023l c10023l2, C12714l c12714l2, C5976l c5976l, InterfaceC9762l interfaceC9762l, C7747l c7747l, C0554l c0554l) {
        new AtomicBoolean(false);
        this.yandex = context;
        this.billing = c9667l;
        this.loadAd = c16557l;
        this.mopub = c12714l;
        this.crashlytics = c10023l;
        this.admob = c4127l;
        this.amazon = c6472l;
        this.subs = c10023l2;
        this.isPro = c5976l;
        this.firebase = interfaceC9762l;
        this.smaato = c7747l;
        this.remoteconfig = c12714l2;
        this.purchase = c0554l;
    }

    public static C3823l yandex(C17503l c17503l) {
        C3823l c3823lPurchase;
        c17503l.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C12714l.startapp(((File) c17503l.mopub.f25072l).listFiles(ads))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    c3823lPurchase = AbstractC4311l.mopub(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    c3823lPurchase = AbstractC4311l.purchase(new ScheduledThreadPoolExecutor(1), new CallableC10449l(c17503l, j));
                }
                arrayList.add(c3823lPurchase);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return AbstractC4311l.ads(arrayList);
    }

    public final void admob(C3823l c3823l) {
        C3823l c3823l2;
        C3823l c3823lPurchase;
        C2350l c2350l = this.metrica;
        C12714l c12714l = ((C17093l) this.remoteconfig.f25074l).loadAd;
        if (C12714l.startapp(((File) c12714l.f25076l).listFiles()).isEmpty() && C12714l.startapp(((File) c12714l.f25078l).listFiles()).isEmpty() && C12714l.startapp(((File) c12714l.f25073l).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c2350l.amazon(Boolean.FALSE);
            return;
        }
        C17334l c17334l = C17334l.f33646l;
        c17334l.m4318l("Crash reports are available to be sent.");
        C16557l c16557l = this.loadAd;
        if (c16557l.yandex()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c2350l.amazon(Boolean.FALSE);
            c3823lPurchase = AbstractC4311l.mopub(Boolean.TRUE);
        } else {
            c17334l.m4316l("Automatic data collection is disabled.");
            c17334l.m4318l("Notifying that unsent reports are available.");
            c2350l.amazon(Boolean.TRUE);
            synchronized (c16557l.f32503l) {
                c3823l2 = ((C2350l) c16557l.f32506l).yandex;
            }
            C15718l c15718l = new C15718l(27);
            c3823l2.getClass();
            ExecutorC17086l executorC17086l = AbstractC8333l.yandex;
            C3823l c3823l3 = new C3823l();
            c3823l2.loadAd.appmetrica(new C13005l(executorC17086l, c15718l, c3823l3));
            c3823l2.subscription();
            c17334l.m4316l("Waiting for send/deleteUnsentReports to be called.");
            c3823lPurchase = AbstractC3586l.purchase(c3823l3, this.startapp.yandex);
        }
        c3823lPurchase.remoteconfig((ExecutorC4850l) this.purchase.f1958l, new C18595l(this, c3823l, false, 14));
    }

    public final boolean amazon(C7644l c7644l) throws Throwable {
        C0554l.license();
        C2858l c2858l = this.vip;
        if (c2858l != null && c2858l.purchase.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            loadAd(true, c7644l, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String billing() throws IOException {
        InputStream resourceAsStream;
        Context context = this.yandex;
        int iMopub = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iMopub == 0 ? null : context.getResources().getString(iMopub);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(subscription), 0);
        }
        ClassLoader classLoader = C17503l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
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
            resourceAsStream.close();
            throw th4;
        }
    }

    public final void crashlytics(String str, Boolean bool) {
        String str2;
        String str3;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strStartapp = AbstractC14814l.startapp("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strStartapp, null);
        }
        Locale locale = Locale.US;
        C9667l c9667l = this.billing;
        C4127l c4127l = this.admob;
        C8061l c8061l = new C8061l(c9667l.crashlytics, c4127l.billing, c4127l.mopub, c9667l.crashlytics().yandex, AbstractC9361l.ads(c4127l.amazon != null ? 4 : 1), c4127l.admob);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        C7210l c7210l = new C7210l(AbstractC2632l.isPro());
        Context context = this.yandex;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        EnumC4230l enumC4230l = EnumC4230l.f8665l;
        String str6 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str6)) {
            EnumC4230l enumC4230l2 = (EnumC4230l) EnumC4230l.f8664l.get(str6.toLowerCase(locale));
            if (enumC4230l2 != null) {
                enumC4230l = enumC4230l2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = enumC4230l.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jYandex = AbstractC2632l.yandex(context);
        boolean zSubs = AbstractC2632l.subs();
        int iBilling = AbstractC2632l.billing();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        this.isPro.amazon(str, jCurrentTimeMillis, new C11024l(c8061l, c7210l, new C1434l(iOrdinal, iAvailableProcessors, jYandex, blockCount, zSubs, iBilling)));
        if (!bool.booleanValue() || str == null) {
            str2 = str5;
            str3 = str8;
            i = 4;
        } else {
            C6472l c6472l = this.amazon;
            synchronized (((String) c6472l.f13515l)) {
                c6472l.f13515l = str;
                str2 = str5;
                str3 = str8;
                i = 4;
                ((ExecutorC4850l) ((C0554l) c6472l.f13509l).f1957l).yandex(new RunnableC4063l(c6472l, str, ((C11787l) ((AtomicMarkableReference) ((C11919l) c6472l.f13514l).f23763l).getReference()).yandex(), ((C7375l) c6472l.f13510l).crashlytics(), 20));
            }
        }
        C10023l c10023l = this.subs;
        ((InterfaceC12665l) c10023l.f20418l).yandex();
        c10023l.f20418l = C10023l.f20417l;
        if (str != null) {
            c10023l.f20418l = new C5175l(((C12714l) c10023l.f20419l).admob(str, "userlog"));
        }
        this.smaato.loadAd(str);
        C12714l c12714l = this.remoteconfig;
        C14941l c14941l = (C14941l) c12714l.f25075l;
        Charset charset = AbstractC2236l.yandex;
        C10221l c10221l = new C10221l();
        c10221l.yandex = "20.0.4";
        C4127l c4127l2 = c14941l.crashlytics;
        String str10 = c4127l2.yandex;
        if (str10 == null) {
            C6541l.subs("Null gmpAppId");
            return;
        }
        c10221l.loadAd = str10;
        C9667l c9667l2 = c14941l.loadAd;
        String str11 = c9667l2.crashlytics().yandex;
        if (str11 == null) {
            C6541l.subs("Null installationUuid");
            return;
        }
        c10221l.amazon = str11;
        c10221l.purchase = c9667l2.crashlytics().loadAd;
        c10221l.billing = c9667l2.crashlytics().crashlytics;
        String str12 = c4127l2.billing;
        if (str12 == null) {
            C6541l.subs("Null buildVersion");
            return;
        }
        c10221l.admob = str12;
        String str13 = c4127l2.mopub;
        if (str13 == null) {
            C6541l.subs("Null displayVersion");
            return;
        }
        c10221l.subs = str13;
        c10221l.crashlytics = i;
        c10221l.remoteconfig = (byte) (c10221l.remoteconfig | 1);
        C4320l c4320l = new C4320l();
        c4320l.billing = false;
        byte b = (byte) (c4320l.remoteconfig | 2);
        c4320l.amazon = jCurrentTimeMillis;
        c4320l.remoteconfig = (byte) (b | 1);
        if (str == null) {
            C6541l.subs("Null identifier");
            return;
        }
        c4320l.loadAd = str;
        String str14 = C14941l.mopub;
        if (str14 == null) {
            C6541l.subs("Null generator");
            return;
        }
        c4320l.yandex = str14;
        String str15 = c9667l2.crashlytics;
        if (str15 == null) {
            C6541l.subs("Null identifier");
            return;
        }
        String str16 = c9667l2.crashlytics().yandex;
        C10023l c10023l2 = c4127l2.admob;
        if (((C18595l) c10023l2.f20418l) == null) {
            c10023l2.f20418l = new C18595l(c10023l2);
        }
        C18595l c18595l = (C18595l) c10023l2.f20418l;
        String str17 = (String) c18595l.f36317l;
        if (c18595l == null) {
            c10023l2.f20418l = new C18595l(c10023l2);
        }
        c4320l.mopub = new C4463l(str15, str12, str13, str16, str17, (String) ((C18595l) c10023l2.f20418l).f36316l);
        C10028l c10028l = new C10028l();
        c10028l.yandex = 3;
        c10028l.purchase = (byte) (c10028l.purchase | 1);
        if (str4 == null) {
            C6541l.subs("Null version");
            return;
        }
        c10028l.loadAd = str4;
        if (str2 == null) {
            C6541l.subs("Null buildVersion");
            return;
        }
        c10028l.crashlytics = str2;
        c10028l.amazon = AbstractC2632l.isPro();
        c10028l.purchase = (byte) (c10028l.purchase | 2);
        c4320l.subs = c10028l.yandex();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str6) && (num = (Integer) C14941l.billing.get(str6.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jYandex2 = AbstractC2632l.yandex(c14941l.yandex);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zSubs2 = AbstractC2632l.subs();
        int iBilling2 = AbstractC2632l.billing();
        C15017l c15017l = new C15017l();
        c15017l.yandex = iIntValue;
        byte b2 = (byte) (c15017l.isPro | 1);
        c15017l.isPro = b2;
        if (str7 == 0) {
            C6541l.subs("Null model");
            return;
        }
        c15017l.loadAd = str7;
        c15017l.crashlytics = iAvailableProcessors2;
        c15017l.amazon = jYandex2;
        c15017l.purchase = blockCount2;
        c15017l.billing = zSubs2;
        c15017l.mopub = iBilling2;
        c15017l.isPro = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str18 = str3;
        if (str18 == null) {
            C6541l.subs("Null manufacturer");
            return;
        }
        c15017l.admob = str18;
        if (str9 == null) {
            C6541l.subs("Null modelClass");
            return;
        }
        c15017l.subs = str9;
        c4320l.isPro = c15017l.yandex();
        c4320l.smaato = 3;
        c4320l.remoteconfig = (byte) (c4320l.remoteconfig | 4);
        c10221l.isPro = c4320l.yandex();
        C11091l c11091lYandex = c10221l.yandex();
        C12714l c12714l2 = ((C17093l) c12714l.f25074l).loadAd;
        AbstractC5638l abstractC5638l = c11091lYandex.firebase;
        if (abstractC5638l == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str19 = ((C9428l) abstractC5638l).loadAd;
        try {
            C17093l.mopub.getClass();
            C17093l.billing(c12714l2.admob(str19, "report"), C9228l.yandex.billing(c11091lYandex));
            File fileAdmob = c12714l2.admob(str19, "start-time");
            long j = ((C9428l) abstractC5638l).amazon;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileAdmob), C17093l.purchase);
            try {
                outputStreamWriter.write("");
                fileAdmob.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strStartapp2 = AbstractC14814l.startapp("Could not persist report for session ", str19);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strStartapp2, e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x05d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [lًؓۖ] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v30, types: [int] */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void loadAd(boolean z, C7644l c7644l, boolean z2) throws Throwable {
        ArrayList arrayList;
        int i;
        int i2;
        ?? r10;
        boolean z3;
        String str;
        boolean z4;
        String[] list;
        Throwable th;
        List listLoadAd;
        ApplicationExitInfo next;
        String strPurchase;
        int i3;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        C0554l.license();
        ArrayList arrayList2 = new ArrayList(((C17093l) this.remoteconfig.f25074l).crashlytics());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && c7644l.firebase().loadAd.crashlytics) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.yandex.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    C12714l c12714l = this.mopub;
                    C10023l c10023l = new C10023l(c12714l);
                    c10023l.f20418l = C10023l.f20417l;
                    if (str2 != null) {
                        c10023l.f20418l = new C5175l(c12714l.admob(str2, "userlog"));
                    }
                    C12714l c12714l2 = this.mopub;
                    C0554l c0554l = this.purchase;
                    C16532l c16532l = new C16532l(c12714l2);
                    i = 4;
                    C6472l c6472l = new C6472l(str2, c12714l2, c0554l);
                    i2 = 8;
                    ((C11787l) ((AtomicMarkableReference) ((C11919l) c6472l.f13514l).f23763l).getReference()).amazon(c16532l.crashlytics(str2, false));
                    ((C11787l) ((AtomicMarkableReference) ((C11919l) c6472l.f13516l).f23763l).getReference()).amazon(c16532l.crashlytics(str2, true));
                    ((AtomicMarkableReference) c6472l.f13511l).set(c16532l.amazon(str2), false);
                    C7375l c7375l = (C7375l) c6472l.f13510l;
                    File fileAdmob = c12714l2.admob(str2, "rollouts-state");
                    if (!fileAdmob.exists() || fileAdmob.length() == 0) {
                        C16532l.mopub(fileAdmob, "The file has a length of zero for session: " + str2);
                        listLoadAd = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(fileAdmob);
                            try {
                                try {
                                    listLoadAd = C16532l.loadAd(AbstractC2632l.smaato(fileInputStream2));
                                    String str3 = "Loaded rollouts state:\n" + listLoadAd + "\nfor session " + str2;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str3, null);
                                    }
                                    AbstractC2632l.crashlytics(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    AbstractC2632l.crashlytics(fileInputStream, "Failed to close rollouts state file.");
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                C16532l.billing(fileAdmob);
                                AbstractC2632l.crashlytics(fileInputStream2, "Failed to close rollouts state file.");
                                listLoadAd = Collections.EMPTY_LIST;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                            AbstractC2632l.crashlytics(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (c7375l) {
                        c7375l.loadAd.clear();
                        if (listLoadAd.size() > c7375l.yandex) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + c7375l.yandex, null);
                            c7375l.loadAd.addAll(listLoadAd.subList(0, c7375l.yandex));
                        } else {
                            c7375l.loadAd.addAll(listLoadAd);
                        }
                    }
                    C12714l c12714l3 = this.remoteconfig;
                    C17093l c17093l = (C17093l) c12714l3.f25074l;
                    long jLastModified = c17093l.loadAd.admob(str2, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strStartapp = AbstractC14814l.startapp("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strStartapp, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        C14941l c14941l = (C14941l) c12714l3.f25075l;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strPurchase = traceInputStream != null ? C12714l.purchase(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                        }
                        C2007l c2007l = new C2007l();
                        c2007l.amazon = next.getImportance();
                        c2007l.isPro = (byte) (c2007l.isPro | 4);
                        String processName = next.getProcessName();
                        if (processName == null) {
                            C6541l.subs("Null processName");
                            return;
                        }
                        c2007l.loadAd = processName;
                        c2007l.crashlytics = next.getReason();
                        c2007l.isPro = (byte) (c2007l.isPro | 2);
                        c2007l.mopub = next.getTimestamp();
                        c2007l.isPro = (byte) (c2007l.isPro | 32);
                        c2007l.yandex = next.getPid();
                        c2007l.isPro = (byte) (c2007l.isPro | 1);
                        c2007l.purchase = next.getPss();
                        c2007l.isPro = (byte) (c2007l.isPro | 8);
                        c2007l.billing = next.getRss();
                        c2007l.isPro = (byte) (c2007l.isPro | 16);
                        c2007l.admob = strPurchase;
                        C1379l c1379lYandex = c2007l.yandex();
                        int i5 = c14941l.yandex.getResources().getConfiguration().orientation;
                        C0495l c0495l = new C0495l();
                        c0495l.loadAd = "anr";
                        long j = c1379lYandex.mopub;
                        c0495l.yandex = j;
                        c0495l.mopub = (byte) (c0495l.mopub | 1);
                        C4127l c4127l = c14941l.crashlytics;
                        if (!c14941l.purchase.firebase().loadAd.amazon || c4127l.crashlytics.size() <= 0) {
                            arrayList = arrayList2;
                            i3 = i5;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = c4127l.crashlytics.iterator();
                            while (it2.hasNext()) {
                                C10690l c10690l = (C10690l) it2.next();
                                int i6 = i5;
                                String str4 = c10690l.yandex;
                                if (str4 == null) {
                                    C6541l.subs("Null libraryName");
                                    return;
                                }
                                Iterator it3 = it2;
                                String str5 = c10690l.loadAd;
                                if (str5 == null) {
                                    C6541l.subs("Null arch");
                                    return;
                                }
                                String str6 = c10690l.crashlytics;
                                if (str6 == null) {
                                    C6541l.subs("Null buildId");
                                    return;
                                }
                                arrayList3.add(new C13365l(str5, str4, str6));
                                it2 = it3;
                                i5 = i6;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i3 = i5;
                            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                        }
                        C2007l c2007l2 = new C2007l();
                        c2007l2.amazon = c1379lYandex.amazon;
                        byte b = (byte) (c2007l2.isPro | 4);
                        c2007l2.isPro = b;
                        String str7 = c1379lYandex.loadAd;
                        if (str7 == null) {
                            C6541l.subs("Null processName");
                            return;
                        }
                        c2007l2.loadAd = str7;
                        c2007l2.crashlytics = c1379lYandex.crashlytics;
                        c2007l2.mopub = j;
                        c2007l2.yandex = c1379lYandex.yandex;
                        c2007l2.purchase = c1379lYandex.purchase;
                        c2007l2.billing = c1379lYandex.billing;
                        c2007l2.isPro = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                        c2007l2.admob = c1379lYandex.admob;
                        c2007l2.subs = listUnmodifiableList;
                        C1379l c1379lYandex2 = c2007l2.yandex();
                        int i7 = c1379lYandex2.amazon;
                        Boolean boolValueOf = Boolean.valueOf(i7 != 100);
                        String str8 = c1379lYandex2.loadAd;
                        int i8 = c1379lYandex2.yandex;
                        C16647l c16647l = new C16647l();
                        c16647l.yandex = str8;
                        c16647l.loadAd = i8;
                        byte b2 = (byte) (c16647l.purchase | 1);
                        c16647l.crashlytics = i7;
                        c16647l.amazon = false;
                        c16647l.purchase = (byte) (((byte) (b2 | 2)) | 4);
                        C4702l c4702lYandex = c16647l.yandex();
                        C6990l c6990lPurchase = C14941l.purchase();
                        List listYandex = c14941l.yandex();
                        if (listYandex == null) {
                            C6541l.subs("Null binaries");
                            return;
                        }
                        c0495l.crashlytics = new C5161l(new C0139l(null, null, c1379lYandex2, c6990lPurchase, listYandex), null, null, boolValueOf, c4702lYandex, null, i3);
                        c0495l.amazon = c14941l.loadAd(i3);
                        C17358l c17358lYandex = c0495l.yandex();
                        String strStartapp2 = AbstractC14814l.startapp("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strStartapp2, null);
                        }
                        c17093l.amazon(C12714l.loadAd(C12714l.yandex(c17358lYandex, c10023l, c6472l, Collections.EMPTY_MAP), c6472l), str2, true);
                    }
                } else {
                    arrayList = arrayList2;
                    i = 4;
                    i2 = 8;
                    String strStartapp3 = AbstractC14814l.startapp("No ApplicationExitInfo available. Session: ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strStartapp3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 4;
                i2 = 8;
                String strVip = AbstractC0653l.vip(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strVip, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 4;
            i2 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.isPro.crashlytics(str2)) {
            String strStartapp4 = AbstractC14814l.startapp("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th = null;
                Log.v("FirebaseCrashlytics", strStartapp4, null);
            } else {
                th = null;
            }
            this.isPro.yandex(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
            r10 = th;
        } else {
            r10 = 0;
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.smaato.loadAd(r10);
            str = null;
        }
        C12714l c12714l4 = this.remoteconfig;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C17093l c17093l2 = (C17093l) c12714l4.f25074l;
        C12714l c12714l5 = c17093l2.loadAd;
        c12714l5.amazon(".com.google.firebase.crashlytics");
        c12714l5.amazon(".com.google.firebase.crashlytics-ndk");
        if (!((String) c12714l5.f25075l).isEmpty()) {
            c12714l5.amazon(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) c12714l5.f25074l;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: lٕؑؓ
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z3; r11 < length; r11++) {
                    c12714l5.amazon(list[r11]);
                }
            }
        }
        NavigableSet<String> navigableSetCrashlytics = c17093l2.crashlytics();
        if (str != null) {
            navigableSetCrashlytics.remove(str);
        }
        int i9 = i2;
        if (navigableSetCrashlytics.size() > i9) {
            while (navigableSetCrashlytics.size() > i9) {
                String str10 = (String) navigableSetCrashlytics.last();
                String strStartapp5 = AbstractC14814l.startapp("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strStartapp5, null);
                }
                C12714l.metrica(new File((File) c12714l5.f25077l, str10));
                navigableSetCrashlytics.remove(str10);
            }
        }
        for (String str11 : navigableSetCrashlytics) {
            String strStartapp6 = AbstractC14814l.startapp("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strStartapp6, null);
            }
            C9228l c9228l = C17093l.mopub;
            C3781l c3781l = C17093l.subs;
            File file2 = new File((File) c12714l5.f25077l, str11);
            file2.mkdirs();
            List<File> listStartapp = C12714l.startapp(file2.listFiles(c3781l));
            if (listStartapp.isEmpty()) {
                String strSignature = AbstractC15560l.Signature("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strSignature, null);
                }
            } else {
                Collections.sort(listStartapp);
                ArrayList arrayList4 = new ArrayList();
                boolean z5 = z3;
                for (File file3 : listStartapp) {
                    try {
                        String strPurchase2 = C17093l.purchase(file3);
                        c9228l.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strPurchase2));
                            try {
                                C17358l c17358lPurchase = C9228l.purchase(jsonReader);
                                jsonReader.close();
                                arrayList4.add(c17358lPurchase);
                                if (z5) {
                                    z4 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z4 = true;
                                    } else {
                                        z4 = z3;
                                    }
                                }
                                z5 = z4;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strAmazon = new C16532l(c12714l5).amazon(str11);
                    String strYandex = c17093l2.amazon.yandex(str11);
                    File fileAdmob2 = c12714l5.admob(str11, "report");
                    try {
                        String strPurchase3 = C17093l.purchase(fileAdmob2);
                        c9228l.getClass();
                        C11091l c11091lSubs = C9228l.subs(strPurchase3);
                        C10221l c10221lYandex = c11091lSubs.yandex();
                        AbstractC5638l abstractC5638l = c11091lSubs.firebase;
                        if (abstractC5638l != null) {
                            try {
                                C4320l c4320lYandex = abstractC5638l.yandex();
                                c4320lYandex.purchase = Long.valueOf(jCurrentTimeMillis);
                                c4320lYandex.billing = z5;
                                try {
                                    c4320lYandex.remoteconfig = (byte) (c4320lYandex.remoteconfig | 2);
                                    if (strAmazon != null) {
                                        c4320lYandex.admob = new C13482l(strAmazon);
                                    }
                                    c10221lYandex.isPro = c4320lYandex.yandex();
                                } catch (IOException e6) {
                                    e = e6;
                                }
                            } catch (IOException e7) {
                                e = e7;
                            }
                        }
                        C11091l c11091lYandex = c10221lYandex.yandex();
                        C10221l c10221lYandex2 = c11091lYandex.yandex();
                        c10221lYandex2.mopub = strYandex;
                        AbstractC5638l abstractC5638l2 = c11091lYandex.firebase;
                        if (abstractC5638l2 != null) {
                            C4320l c4320lYandex2 = abstractC5638l2.yandex();
                            c4320lYandex2.crashlytics = strYandex;
                            c10221lYandex2.isPro = c4320lYandex2.yandex();
                        }
                        C11091l c11091lYandex2 = c10221lYandex2.yandex();
                        AbstractC5638l abstractC5638l3 = c11091lYandex2.firebase;
                        if (abstractC5638l3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        C10221l c10221lYandex3 = c11091lYandex2.yandex();
                        C4320l c4320lYandex3 = abstractC5638l3.yandex();
                        c4320lYandex3.firebase = arrayList4;
                        c10221lYandex3.isPro = c4320lYandex3.yandex();
                        C11091l c11091lYandex3 = c10221lYandex3.yandex();
                        AbstractC5638l abstractC5638l4 = c11091lYandex3.firebase;
                        if (abstractC5638l4 != null) {
                            String str12 = "appQualitySessionId: " + strYandex;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e8) {
                                        e = e8;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileAdmob2, e);
                                    }
                                }
                                C17093l.billing(z5 ? new File((File) c12714l5.f25078l, ((C9428l) abstractC5638l4).loadAd) : new File((File) c12714l5.f25076l, ((C9428l) abstractC5638l4).loadAd), C9228l.yandex.billing(c11091lYandex3));
                            } catch (IOException e9) {
                                e = e9;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileAdmob2, e);
                            }
                        }
                        e = e8;
                    } catch (IOException e10) {
                        e = e10;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileAdmob2, e);
                }
                C12714l.metrica(new File((File) c12714l5.f25077l, str11));
                z3 = false;
            }
            C12714l.metrica(new File((File) c12714l5.f25077l, str11));
            z3 = false;
        }
        C14513l c14513l = c17093l2.crashlytics.firebase().yandex;
        ArrayList arrayListLoadAd = c17093l2.loadAd();
        int size = arrayListLoadAd.size();
        int i10 = i;
        if (size <= i10) {
            return;
        }
        Iterator it4 = arrayListLoadAd.subList(i10, size).iterator();
        while (it4.hasNext()) {
            ((File) it4.next()).delete();
        }
    }

    public final void mopub() {
        try {
            String strBilling = billing();
            if (strBilling != null) {
                try {
                    this.amazon.crashlytics(strBilling);
                } catch (IllegalArgumentException e) {
                    Context context = this.yandex;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final String purchase() {
        NavigableSet navigableSetCrashlytics = ((C17093l) this.remoteconfig.f25074l).crashlytics();
        if (navigableSetCrashlytics.isEmpty()) {
            return null;
        }
        return (String) navigableSetCrashlytics.first();
    }
}
