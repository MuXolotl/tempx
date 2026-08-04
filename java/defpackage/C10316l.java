package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lَٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10316l {
    public static final C13648l isPro;
    public static final C5321l subs = new C5321l(6);
    public final C0223l admob;
    public final String amazon;
    public final AbstractC8481l billing;
    public final String crashlytics;
    public final C7447l loadAd;
    public final C3142l mopub;
    public final boolean purchase;
    public volatile C18480l yandex;

    static {
        C15952l c15952l = C15952l.f31321l;
        int i = AbstractC8481l.f17529l;
        isPro = new C13648l(c15952l, false, C13825l.f26967l);
    }

    public C10316l(C7447l c7447l, C13648l c13648l) {
        this.loadAd = c7447l;
        Context context = c7447l.loadAd;
        String str = c13648l.amazon;
        if (str == null) {
            str = (String) c13648l.yandex.apply(context);
            c13648l.amazon = str;
        }
        this.crashlytics = str;
        this.amazon = "";
        this.purchase = c13648l.loadAd;
        this.billing = c13648l.crashlytics;
        this.yandex = null;
        this.mopub = new C3142l(1);
        this.admob = new C0223l(c7447l, str);
    }

    public final void loadAd() {
        C0223l c0223l = this.admob;
        C7447l c7447l = c0223l.yandex;
        C18222l c18222l = (C18222l) c7447l.amazon.get();
        String str = c0223l.crashlytics;
        c18222l.getClass();
        str.getClass();
        C1539l c1539l = c18222l.yandex;
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C1693l(str, 6);
        C3565l c3565lMopub = AbstractC7151l.mopub(C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex()).mopub(EnumC1535l.f3808l, new C16936l(25))), C15952l.f31324l, c7447l.yandex());
        int i = 1;
        C11651l c11651l = new C11651l(i, c0223l);
        C7447l c7447l2 = this.loadAd;
        AbstractC7151l.admob(c3565lMopub, c11651l, c7447l2.yandex()).yandex(new RunnableC0147l(this, c3565lMopub, i), c7447l2.yandex());
    }

    public final C18480l yandex() {
        C18480l c18480l;
        C18480l c18480l2 = this.yandex;
        if (c18480l2 != null) {
            return c18480l2;
        }
        synchronized (this) {
            try {
                c18480l = this.yandex;
                if (c18480l == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        C18480l c18480lYandex = this.admob.yandex();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i = ((C9754l) c18480lYandex.f36089l).f19892l - 2;
                        if (i == 15 || i == 16) {
                            c18480l = c18480lYandex;
                        } else {
                            C7447l c7447l = this.loadAd;
                            c7447l.mopub.yandex();
                            if (this.purchase || this.admob.loadAd() || !((String) c18480lYandex.f36084l).isEmpty()) {
                                final int i2 = 3;
                                c7447l.yandex().execute(new Runnable(this) { // from class: lؚٓۗ

                                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                    public final /* synthetic */ C10316l f28089l;

                                    {
                                        this.f28089l = this;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                    private final void yandex() {
                                        boolean z;
                                        AbstractC12138l abstractC12138lYandex;
                                        C10316l c10316l = this.f28089l;
                                        C7258l c7258l = c10316l.loadAd.subs;
                                        boolean z2 = c10316l.purchase;
                                        C4226l c4226l = C4226l.yandex;
                                        InterfaceC7674l interfaceC7674l = (InterfaceC7674l) c7258l.crashlytics.get();
                                        if (interfaceC7674l == null && !z2) {
                                            C5113l c5113l = C5113l.f11111l;
                                            return;
                                        }
                                        if ((c7258l.purchase & 64) == 0) {
                                            CopyOnWriteArrayList copyOnWriteArrayList = c7258l.billing;
                                            synchronized (copyOnWriteArrayList) {
                                                try {
                                                    int i3 = c7258l.purchase;
                                                    if ((i3 & 64) == 0) {
                                                        copyOnWriteArrayList.add(c4226l);
                                                        c7258l.purchase = i3 | 64;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        if (c7258l.admob == null) {
                                            synchronized (c7258l.mopub) {
                                                try {
                                                    if (c7258l.admob == null) {
                                                        if (interfaceC7674l == null) {
                                                            interfaceC7674l = C0912l.yandex;
                                                        }
                                                        Context context = c7258l.yandex;
                                                        int i4 = 0;
                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                            if (!AbstractC18452l.crashlytics(context)) {
                                                                z = true;
                                                            }
                                                            if (z) {
                                                                RunnableC10253l runnableC10253l = RunnableC10253l.f20875l;
                                                                InterfaceC11766l interfaceC11766l = c7258l.loadAd;
                                                                abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l, null), (Executor) interfaceC11766l.get()), new C3013l(c7258l, interfaceC7674l, i4), (Executor) interfaceC11766l.get());
                                                                c7258l.admob = abstractC12138lYandex;
                                                            } else {
                                                                abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                c7258l.admob = abstractC12138lYandex;
                                                            }
                                                            abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                        } else {
                                                            UserManager userManager = AbstractC18452l.yandex;
                                                        }
                                                        z = false;
                                                        if (z) {
                                                            RunnableC10253l runnableC10253l2 = RunnableC10253l.f20875l;
                                                            InterfaceC11766l interfaceC11766l2 = c7258l.loadAd;
                                                            abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l2, null), (Executor) interfaceC11766l2.get()), new C3013l(c7258l, interfaceC7674l, i4), (Executor) interfaceC11766l2.get());
                                                            c7258l.admob = abstractC12138lYandex;
                                                        } else {
                                                            abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                            c7258l.admob = abstractC12138lYandex;
                                                        }
                                                        abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3743l c3743l;
                                        C4113l c4113lLoadAd;
                                        boolean z = true;
                                        int i3 = 0;
                                        switch (i2) {
                                            case 0:
                                                this.f28089l.loadAd();
                                                return;
                                            case 1:
                                                C10316l c10316l = this.f28089l;
                                                C7447l c7447l2 = c10316l.loadAd;
                                                String str = c10316l.crashlytics;
                                                C1004l c1004l = AbstractC15628l.yandex;
                                                Object obj = C14823l.f29002l;
                                                Context context = c7447l2.loadAd;
                                                Pattern pattern = AbstractC15467l.yandex;
                                                C1424l c1424l = new C1424l(context, 24);
                                                c1424l.m916l("phenotype");
                                                c1424l.m950l("all_accounts.pb");
                                                Uri uriM943l = c1424l.m943l();
                                                if (uriM943l == null) {
                                                    C6541l.subs("Null uri");
                                                    return;
                                                }
                                                C14728l c14728lSignature = C14728l.Signature();
                                                if (c14728lSignature == null) {
                                                    C6541l.subs("Null schema");
                                                    return;
                                                }
                                                C13464l c13464lAmazon = AbstractC17238l.amazon(AbstractC15628l.yandex);
                                                C9258l c9258l = AbstractC1186l.f3181l;
                                                C13708l c13708l = C13708l.f26763l;
                                                C3743l c3743l2 = new C3743l(uriM943l, c14728lSignature, c13464lAmazon, c13708l);
                                                C3557l c3557l = AbstractC15628l.crashlytics;
                                                if (c3557l == null) {
                                                    synchronized (AbstractC15628l.loadAd) {
                                                        try {
                                                            c3557l = AbstractC15628l.crashlytics;
                                                            if (c3557l == null) {
                                                                HashMap map = new HashMap();
                                                                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c7447l2.yandex();
                                                                C2830l c2830l = (C2830l) c7447l2.billing.get();
                                                                C2286l c2286l = C2286l.yandex;
                                                                AbstractC12442l.isPro(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", c2286l);
                                                                C3557l c3557l2 = new C3557l();
                                                                c3557l2.f7480l = new ConcurrentHashMap();
                                                                scheduledExecutorServiceC6354lYandex.getClass();
                                                                c3557l2.f7479l = scheduledExecutorServiceC6354lYandex;
                                                                c2830l.getClass();
                                                                c3557l2.f7478l = c2830l;
                                                                c3557l2.f7481l = map;
                                                                AbstractC12442l.admob(!map.isEmpty());
                                                                c3557l2.f7482l = C13368l.crashlytics;
                                                                AbstractC15628l.crashlytics = c3557l2;
                                                                c3557l = c3557l2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    c7447l2 = c7447l2;
                                                    z = true;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3557l.f7480l;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriM943l);
                                                if (pairCreate == null) {
                                                    AbstractC12442l.isPro(uriM943l.isHierarchical(), "Uri must be hierarchical: %s", uriM943l);
                                                    String lastPathSegment = uriM943l.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    AbstractC12442l.isPro((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM943l);
                                                    C2286l c2286l2 = (C2286l) ((HashMap) c3557l.f7481l).get("singleproc");
                                                    AbstractC12442l.isPro(c2286l2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriM943l.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    C18012l c18012lAdmob = AbstractC7151l.admob(AbstractC7151l.purchase(uriM943l), (C13368l) c3557l.f7482l, EnumC1535l.f3808l);
                                                    Executor executor = (Executor) c3557l.f7479l;
                                                    C2830l c2830l2 = (C2830l) c3557l.f7478l;
                                                    c2286l2.getClass();
                                                    String str2 = strSubstring;
                                                    c3743l = c3743l2;
                                                    C5702l c5702l = new C5702l(new C18289l(str2, AbstractC7151l.purchase(uriM943l), new C1641l(c14728lSignature, C11337l.yandex()), executor, c2830l2, c13464lAmazon, new C18420l()), c18012lAdmob);
                                                    if (!c13708l.isEmpty()) {
                                                        c5702l.yandex(new C3013l(c13708l, executor, z ? 1 : 0));
                                                    }
                                                    pairCreate = Pair.create(c5702l, c3743l);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM943l, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                } else {
                                                    c3743l = c3743l2;
                                                }
                                                C5702l c5702l2 = (C5702l) pairCreate.first;
                                                C3743l c3743l3 = (C3743l) pairCreate.second;
                                                int i4 = 2;
                                                if (c3743l.equals(c3743l3)) {
                                                    C3565l c3565lLoadAd = c5702l2.loadAd(new C1164l(i4, str), c7447l2.yandex());
                                                    c3565lLoadAd.yandex(new RunnableC0147l(c10316l, c3565lLoadAd, 0), c7447l2.yandex());
                                                    return;
                                                }
                                                String strSmaato = AbstractC11028l.smaato("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C14728l.class.getSimpleName(), uriM943l);
                                                AbstractC12442l.isPro(uriM943l.equals(c3743l3.yandex), strSmaato, "uri");
                                                AbstractC12442l.isPro(c14728lSignature.equals(c3743l3.loadAd), strSmaato, "schema");
                                                AbstractC12442l.isPro(c13464lAmazon.equals(c3743l3.crashlytics), strSmaato, "handler");
                                                AbstractC12442l.isPro(c13708l.equals(c3743l3.amazon), strSmaato, "migrations");
                                                AbstractC12442l.isPro(obj.equals(obj), strSmaato, "variantConfig");
                                                C8339l.metrica(AbstractC11028l.smaato(strSmaato, "unknown"));
                                                return;
                                            case 2:
                                                yandex();
                                                return;
                                            default:
                                                C10316l c10316l2 = this.f28089l;
                                                C18480l c18480lYandex2 = c10316l2.yandex();
                                                String str3 = (String) c18480lYandex2.f36084l;
                                                C7447l c7447l3 = c10316l2.loadAd;
                                                C2079l c2079l = c7447l3.mopub;
                                                InterfaceC11766l interfaceC11766l = c7447l3.amazon;
                                                C8746l c8746lLoadAd = c2079l.loadAd();
                                                boolean z2 = c8746lLoadAd.subs;
                                                if (c8746lLoadAd.isPro) {
                                                    if (AbstractC1315l.purchase(str3) && !z2) {
                                                        C5113l c5113l = C5113l.f11111l;
                                                        return;
                                                    }
                                                    C13265l c13265lSignature = C13658l.Signature();
                                                    C9754l c9754l = (C9754l) c18480lYandex2.f36089l;
                                                    int i5 = c9754l.f19893l;
                                                    C10620l c10620lTapsense = C3377l.tapsense();
                                                    c10620lTapsense.loadAd();
                                                    ((C3377l) c10620lTapsense.f20498l).Signature(i5);
                                                    int i6 = c9754l.f19892l;
                                                    c10620lTapsense.loadAd();
                                                    ((C3377l) c10620lTapsense.f20498l).license(i6);
                                                    C3377l c3377l = (C3377l) c10620lTapsense.amazon();
                                                    c13265lSignature.loadAd();
                                                    ((C13658l) c13265lSignature.f20498l).pro(c3377l);
                                                    if (!AbstractC1315l.purchase(str3)) {
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).license(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = c10316l2.crashlytics;
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).ad(str4);
                                                    }
                                                    C18222l c18222l = (C18222l) interfaceC11766l.get();
                                                    C13658l c13658l = (C13658l) c13265lSignature.amazon();
                                                    C1539l c1539l = c18222l.yandex;
                                                    C10147l c10147lYandex = C8662l.yandex();
                                                    c10147lYandex.yandex = new C15848l(3, c13658l);
                                                    c10147lYandex.amazon = new C9138l[]{AbstractC9464l.purchase};
                                                    c10147lYandex.crashlytics = true;
                                                    c10147lYandex.loadAd = false;
                                                    c4113lLoadAd = C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex()).admob(EnumC1535l.f3808l, new C7847l(c1539l, c13658l)));
                                                } else {
                                                    if (AbstractC1315l.purchase(str3)) {
                                                        C5113l c5113l2 = C5113l.f11111l;
                                                        return;
                                                    }
                                                    C18222l c18222l2 = (C18222l) interfaceC11766l.get();
                                                    c18222l2.getClass();
                                                    str3.getClass();
                                                    c4113lLoadAd = C18222l.loadAd(c18222l2.yandex.billing(str3));
                                                }
                                                AbstractC7151l.loadAd(c4113lLoadAd, C9303l.class, new C11651l(i3, c10316l2), c7447l3.yandex());
                                                return;
                                        }
                                    }
                                });
                                c7447l.yandex.applovin((AbstractC15619l) c18480lYandex.f36088l, this.billing, this.crashlytics);
                                if (!this.amazon.equals("")) {
                                    final int i3 = 1;
                                    c7447l.yandex().execute(new Runnable(this) { // from class: lؚٓۗ

                                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                        public final /* synthetic */ C10316l f28089l;

                                        {
                                            this.f28089l = this;
                                        }

                                        /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                        /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                        private final void yandex() {
                                            boolean z;
                                            AbstractC12138l abstractC12138lYandex;
                                            C10316l c10316l = this.f28089l;
                                            C7258l c7258l = c10316l.loadAd.subs;
                                            boolean z2 = c10316l.purchase;
                                            C4226l c4226l = C4226l.yandex;
                                            InterfaceC7674l interfaceC7674l = (InterfaceC7674l) c7258l.crashlytics.get();
                                            if (interfaceC7674l == null && !z2) {
                                                C5113l c5113l = C5113l.f11111l;
                                                return;
                                            }
                                            if ((c7258l.purchase & 64) == 0) {
                                                CopyOnWriteArrayList copyOnWriteArrayList = c7258l.billing;
                                                synchronized (copyOnWriteArrayList) {
                                                    try {
                                                        int i4 = c7258l.purchase;
                                                        if ((i4 & 64) == 0) {
                                                            copyOnWriteArrayList.add(c4226l);
                                                            c7258l.purchase = i4 | 64;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            if (c7258l.admob == null) {
                                                synchronized (c7258l.mopub) {
                                                    try {
                                                        if (c7258l.admob == null) {
                                                            if (interfaceC7674l == null) {
                                                                interfaceC7674l = C0912l.yandex;
                                                            }
                                                            Context context = c7258l.yandex;
                                                            int i5 = 0;
                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                if (!AbstractC18452l.crashlytics(context)) {
                                                                    z = true;
                                                                }
                                                                if (z) {
                                                                    RunnableC10253l runnableC10253l2 = RunnableC10253l.f20875l;
                                                                    InterfaceC11766l interfaceC11766l2 = c7258l.loadAd;
                                                                    abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l2, null), (Executor) interfaceC11766l2.get()), new C3013l(c7258l, interfaceC7674l, i5), (Executor) interfaceC11766l2.get());
                                                                    c7258l.admob = abstractC12138lYandex;
                                                                } else {
                                                                    abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                    c7258l.admob = abstractC12138lYandex;
                                                                }
                                                                abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                            } else {
                                                                UserManager userManager = AbstractC18452l.yandex;
                                                            }
                                                            z = false;
                                                            if (z) {
                                                                RunnableC10253l runnableC10253l3 = RunnableC10253l.f20875l;
                                                                InterfaceC11766l interfaceC11766l3 = c7258l.loadAd;
                                                                abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l3, null), (Executor) interfaceC11766l3.get()), new C3013l(c7258l, interfaceC7674l, i5), (Executor) interfaceC11766l3.get());
                                                                c7258l.admob = abstractC12138lYandex;
                                                            } else {
                                                                abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                c7258l.admob = abstractC12138lYandex;
                                                            }
                                                            abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3743l c3743l;
                                            C4113l c4113lLoadAd;
                                            boolean z = true;
                                            int i4 = 0;
                                            switch (i3) {
                                                case 0:
                                                    this.f28089l.loadAd();
                                                    return;
                                                case 1:
                                                    C10316l c10316l = this.f28089l;
                                                    C7447l c7447l2 = c10316l.loadAd;
                                                    String str = c10316l.crashlytics;
                                                    C1004l c1004l = AbstractC15628l.yandex;
                                                    Object obj = C14823l.f29002l;
                                                    Context context = c7447l2.loadAd;
                                                    Pattern pattern = AbstractC15467l.yandex;
                                                    C1424l c1424l = new C1424l(context, 24);
                                                    c1424l.m916l("phenotype");
                                                    c1424l.m950l("all_accounts.pb");
                                                    Uri uriM943l = c1424l.m943l();
                                                    if (uriM943l == null) {
                                                        C6541l.subs("Null uri");
                                                        return;
                                                    }
                                                    C14728l c14728lSignature = C14728l.Signature();
                                                    if (c14728lSignature == null) {
                                                        C6541l.subs("Null schema");
                                                        return;
                                                    }
                                                    C13464l c13464lAmazon = AbstractC17238l.amazon(AbstractC15628l.yandex);
                                                    C9258l c9258l = AbstractC1186l.f3181l;
                                                    C13708l c13708l = C13708l.f26763l;
                                                    C3743l c3743l2 = new C3743l(uriM943l, c14728lSignature, c13464lAmazon, c13708l);
                                                    C3557l c3557l = AbstractC15628l.crashlytics;
                                                    if (c3557l == null) {
                                                        synchronized (AbstractC15628l.loadAd) {
                                                            try {
                                                                c3557l = AbstractC15628l.crashlytics;
                                                                if (c3557l == null) {
                                                                    HashMap map = new HashMap();
                                                                    ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c7447l2.yandex();
                                                                    C2830l c2830l = (C2830l) c7447l2.billing.get();
                                                                    C2286l c2286l = C2286l.yandex;
                                                                    AbstractC12442l.isPro(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", c2286l);
                                                                    C3557l c3557l2 = new C3557l();
                                                                    c3557l2.f7480l = new ConcurrentHashMap();
                                                                    scheduledExecutorServiceC6354lYandex.getClass();
                                                                    c3557l2.f7479l = scheduledExecutorServiceC6354lYandex;
                                                                    c2830l.getClass();
                                                                    c3557l2.f7478l = c2830l;
                                                                    c3557l2.f7481l = map;
                                                                    AbstractC12442l.admob(!map.isEmpty());
                                                                    c3557l2.f7482l = C13368l.crashlytics;
                                                                    AbstractC15628l.crashlytics = c3557l2;
                                                                    c3557l = c3557l2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        c7447l2 = c7447l2;
                                                        z = true;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3557l.f7480l;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriM943l);
                                                    if (pairCreate == null) {
                                                        AbstractC12442l.isPro(uriM943l.isHierarchical(), "Uri must be hierarchical: %s", uriM943l);
                                                        String lastPathSegment = uriM943l.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        AbstractC12442l.isPro((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM943l);
                                                        C2286l c2286l2 = (C2286l) ((HashMap) c3557l.f7481l).get("singleproc");
                                                        AbstractC12442l.isPro(c2286l2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriM943l.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        C18012l c18012lAdmob = AbstractC7151l.admob(AbstractC7151l.purchase(uriM943l), (C13368l) c3557l.f7482l, EnumC1535l.f3808l);
                                                        Executor executor = (Executor) c3557l.f7479l;
                                                        C2830l c2830l2 = (C2830l) c3557l.f7478l;
                                                        c2286l2.getClass();
                                                        String str2 = strSubstring;
                                                        c3743l = c3743l2;
                                                        C5702l c5702l = new C5702l(new C18289l(str2, AbstractC7151l.purchase(uriM943l), new C1641l(c14728lSignature, C11337l.yandex()), executor, c2830l2, c13464lAmazon, new C18420l()), c18012lAdmob);
                                                        if (!c13708l.isEmpty()) {
                                                            c5702l.yandex(new C3013l(c13708l, executor, z ? 1 : 0));
                                                        }
                                                        pairCreate = Pair.create(c5702l, c3743l);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM943l, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                    } else {
                                                        c3743l = c3743l2;
                                                    }
                                                    C5702l c5702l2 = (C5702l) pairCreate.first;
                                                    C3743l c3743l3 = (C3743l) pairCreate.second;
                                                    int i5 = 2;
                                                    if (c3743l.equals(c3743l3)) {
                                                        C3565l c3565lLoadAd = c5702l2.loadAd(new C1164l(i5, str), c7447l2.yandex());
                                                        c3565lLoadAd.yandex(new RunnableC0147l(c10316l, c3565lLoadAd, 0), c7447l2.yandex());
                                                        return;
                                                    }
                                                    String strSmaato = AbstractC11028l.smaato("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C14728l.class.getSimpleName(), uriM943l);
                                                    AbstractC12442l.isPro(uriM943l.equals(c3743l3.yandex), strSmaato, "uri");
                                                    AbstractC12442l.isPro(c14728lSignature.equals(c3743l3.loadAd), strSmaato, "schema");
                                                    AbstractC12442l.isPro(c13464lAmazon.equals(c3743l3.crashlytics), strSmaato, "handler");
                                                    AbstractC12442l.isPro(c13708l.equals(c3743l3.amazon), strSmaato, "migrations");
                                                    AbstractC12442l.isPro(obj.equals(obj), strSmaato, "variantConfig");
                                                    C8339l.metrica(AbstractC11028l.smaato(strSmaato, "unknown"));
                                                    return;
                                                case 2:
                                                    yandex();
                                                    return;
                                                default:
                                                    C10316l c10316l2 = this.f28089l;
                                                    C18480l c18480lYandex2 = c10316l2.yandex();
                                                    String str3 = (String) c18480lYandex2.f36084l;
                                                    C7447l c7447l3 = c10316l2.loadAd;
                                                    C2079l c2079l = c7447l3.mopub;
                                                    InterfaceC11766l interfaceC11766l = c7447l3.amazon;
                                                    C8746l c8746lLoadAd = c2079l.loadAd();
                                                    boolean z2 = c8746lLoadAd.subs;
                                                    if (c8746lLoadAd.isPro) {
                                                        if (AbstractC1315l.purchase(str3) && !z2) {
                                                            C5113l c5113l = C5113l.f11111l;
                                                            return;
                                                        }
                                                        C13265l c13265lSignature = C13658l.Signature();
                                                        C9754l c9754l = (C9754l) c18480lYandex2.f36089l;
                                                        int i6 = c9754l.f19893l;
                                                        C10620l c10620lTapsense = C3377l.tapsense();
                                                        c10620lTapsense.loadAd();
                                                        ((C3377l) c10620lTapsense.f20498l).Signature(i6);
                                                        int i7 = c9754l.f19892l;
                                                        c10620lTapsense.loadAd();
                                                        ((C3377l) c10620lTapsense.f20498l).license(i7);
                                                        C3377l c3377l = (C3377l) c10620lTapsense.amazon();
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).pro(c3377l);
                                                        if (!AbstractC1315l.purchase(str3)) {
                                                            c13265lSignature.loadAd();
                                                            ((C13658l) c13265lSignature.f20498l).license(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = c10316l2.crashlytics;
                                                            c13265lSignature.loadAd();
                                                            ((C13658l) c13265lSignature.f20498l).ad(str4);
                                                        }
                                                        C18222l c18222l = (C18222l) interfaceC11766l.get();
                                                        C13658l c13658l = (C13658l) c13265lSignature.amazon();
                                                        C1539l c1539l = c18222l.yandex;
                                                        C10147l c10147lYandex = C8662l.yandex();
                                                        c10147lYandex.yandex = new C15848l(3, c13658l);
                                                        c10147lYandex.amazon = new C9138l[]{AbstractC9464l.purchase};
                                                        c10147lYandex.crashlytics = true;
                                                        c10147lYandex.loadAd = false;
                                                        c4113lLoadAd = C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex()).admob(EnumC1535l.f3808l, new C7847l(c1539l, c13658l)));
                                                    } else {
                                                        if (AbstractC1315l.purchase(str3)) {
                                                            C5113l c5113l2 = C5113l.f11111l;
                                                            return;
                                                        }
                                                        C18222l c18222l2 = (C18222l) interfaceC11766l.get();
                                                        c18222l2.getClass();
                                                        str3.getClass();
                                                        c4113lLoadAd = C18222l.loadAd(c18222l2.yandex.billing(str3));
                                                    }
                                                    AbstractC7151l.loadAd(c4113lLoadAd, C9303l.class, new C11651l(i4, c10316l2), c7447l3.yandex());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.admob.loadAd()) {
                                    final int i4 = 2;
                                    c7447l.yandex().execute(new Runnable(this) { // from class: lؚٓۗ

                                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                        public final /* synthetic */ C10316l f28089l;

                                        {
                                            this.f28089l = this;
                                        }

                                        /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                        /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                        private final void yandex() {
                                            boolean z;
                                            AbstractC12138l abstractC12138lYandex;
                                            C10316l c10316l = this.f28089l;
                                            C7258l c7258l = c10316l.loadAd.subs;
                                            boolean z2 = c10316l.purchase;
                                            C4226l c4226l = C4226l.yandex;
                                            InterfaceC7674l interfaceC7674l = (InterfaceC7674l) c7258l.crashlytics.get();
                                            if (interfaceC7674l == null && !z2) {
                                                C5113l c5113l = C5113l.f11111l;
                                                return;
                                            }
                                            if ((c7258l.purchase & 64) == 0) {
                                                CopyOnWriteArrayList copyOnWriteArrayList = c7258l.billing;
                                                synchronized (copyOnWriteArrayList) {
                                                    try {
                                                        int i5 = c7258l.purchase;
                                                        if ((i5 & 64) == 0) {
                                                            copyOnWriteArrayList.add(c4226l);
                                                            c7258l.purchase = i5 | 64;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            if (c7258l.admob == null) {
                                                synchronized (c7258l.mopub) {
                                                    try {
                                                        if (c7258l.admob == null) {
                                                            if (interfaceC7674l == null) {
                                                                interfaceC7674l = C0912l.yandex;
                                                            }
                                                            Context context = c7258l.yandex;
                                                            int i6 = 0;
                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                if (!AbstractC18452l.crashlytics(context)) {
                                                                    z = true;
                                                                }
                                                                if (z) {
                                                                    RunnableC10253l runnableC10253l3 = RunnableC10253l.f20875l;
                                                                    InterfaceC11766l interfaceC11766l3 = c7258l.loadAd;
                                                                    abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l3, null), (Executor) interfaceC11766l3.get()), new C3013l(c7258l, interfaceC7674l, i6), (Executor) interfaceC11766l3.get());
                                                                    c7258l.admob = abstractC12138lYandex;
                                                                } else {
                                                                    abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                    c7258l.admob = abstractC12138lYandex;
                                                                }
                                                                abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                            } else {
                                                                UserManager userManager = AbstractC18452l.yandex;
                                                            }
                                                            z = false;
                                                            if (z) {
                                                                RunnableC10253l runnableC10253l4 = RunnableC10253l.f20875l;
                                                                InterfaceC11766l interfaceC11766l4 = c7258l.loadAd;
                                                                abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l4, null), (Executor) interfaceC11766l4.get()), new C3013l(c7258l, interfaceC7674l, i6), (Executor) interfaceC11766l4.get());
                                                                c7258l.admob = abstractC12138lYandex;
                                                            } else {
                                                                abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                c7258l.admob = abstractC12138lYandex;
                                                            }
                                                            abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3743l c3743l;
                                            C4113l c4113lLoadAd;
                                            boolean z = true;
                                            int i5 = 0;
                                            switch (i4) {
                                                case 0:
                                                    this.f28089l.loadAd();
                                                    return;
                                                case 1:
                                                    C10316l c10316l = this.f28089l;
                                                    C7447l c7447l2 = c10316l.loadAd;
                                                    String str = c10316l.crashlytics;
                                                    C1004l c1004l = AbstractC15628l.yandex;
                                                    Object obj = C14823l.f29002l;
                                                    Context context = c7447l2.loadAd;
                                                    Pattern pattern = AbstractC15467l.yandex;
                                                    C1424l c1424l = new C1424l(context, 24);
                                                    c1424l.m916l("phenotype");
                                                    c1424l.m950l("all_accounts.pb");
                                                    Uri uriM943l = c1424l.m943l();
                                                    if (uriM943l == null) {
                                                        C6541l.subs("Null uri");
                                                        return;
                                                    }
                                                    C14728l c14728lSignature = C14728l.Signature();
                                                    if (c14728lSignature == null) {
                                                        C6541l.subs("Null schema");
                                                        return;
                                                    }
                                                    C13464l c13464lAmazon = AbstractC17238l.amazon(AbstractC15628l.yandex);
                                                    C9258l c9258l = AbstractC1186l.f3181l;
                                                    C13708l c13708l = C13708l.f26763l;
                                                    C3743l c3743l2 = new C3743l(uriM943l, c14728lSignature, c13464lAmazon, c13708l);
                                                    C3557l c3557l = AbstractC15628l.crashlytics;
                                                    if (c3557l == null) {
                                                        synchronized (AbstractC15628l.loadAd) {
                                                            try {
                                                                c3557l = AbstractC15628l.crashlytics;
                                                                if (c3557l == null) {
                                                                    HashMap map = new HashMap();
                                                                    ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c7447l2.yandex();
                                                                    C2830l c2830l = (C2830l) c7447l2.billing.get();
                                                                    C2286l c2286l = C2286l.yandex;
                                                                    AbstractC12442l.isPro(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", c2286l);
                                                                    C3557l c3557l2 = new C3557l();
                                                                    c3557l2.f7480l = new ConcurrentHashMap();
                                                                    scheduledExecutorServiceC6354lYandex.getClass();
                                                                    c3557l2.f7479l = scheduledExecutorServiceC6354lYandex;
                                                                    c2830l.getClass();
                                                                    c3557l2.f7478l = c2830l;
                                                                    c3557l2.f7481l = map;
                                                                    AbstractC12442l.admob(!map.isEmpty());
                                                                    c3557l2.f7482l = C13368l.crashlytics;
                                                                    AbstractC15628l.crashlytics = c3557l2;
                                                                    c3557l = c3557l2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        c7447l2 = c7447l2;
                                                        z = true;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3557l.f7480l;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriM943l);
                                                    if (pairCreate == null) {
                                                        AbstractC12442l.isPro(uriM943l.isHierarchical(), "Uri must be hierarchical: %s", uriM943l);
                                                        String lastPathSegment = uriM943l.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        AbstractC12442l.isPro((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM943l);
                                                        C2286l c2286l2 = (C2286l) ((HashMap) c3557l.f7481l).get("singleproc");
                                                        AbstractC12442l.isPro(c2286l2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriM943l.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        C18012l c18012lAdmob = AbstractC7151l.admob(AbstractC7151l.purchase(uriM943l), (C13368l) c3557l.f7482l, EnumC1535l.f3808l);
                                                        Executor executor = (Executor) c3557l.f7479l;
                                                        C2830l c2830l2 = (C2830l) c3557l.f7478l;
                                                        c2286l2.getClass();
                                                        String str2 = strSubstring;
                                                        c3743l = c3743l2;
                                                        C5702l c5702l = new C5702l(new C18289l(str2, AbstractC7151l.purchase(uriM943l), new C1641l(c14728lSignature, C11337l.yandex()), executor, c2830l2, c13464lAmazon, new C18420l()), c18012lAdmob);
                                                        if (!c13708l.isEmpty()) {
                                                            c5702l.yandex(new C3013l(c13708l, executor, z ? 1 : 0));
                                                        }
                                                        pairCreate = Pair.create(c5702l, c3743l);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM943l, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                    } else {
                                                        c3743l = c3743l2;
                                                    }
                                                    C5702l c5702l2 = (C5702l) pairCreate.first;
                                                    C3743l c3743l3 = (C3743l) pairCreate.second;
                                                    int i6 = 2;
                                                    if (c3743l.equals(c3743l3)) {
                                                        C3565l c3565lLoadAd = c5702l2.loadAd(new C1164l(i6, str), c7447l2.yandex());
                                                        c3565lLoadAd.yandex(new RunnableC0147l(c10316l, c3565lLoadAd, 0), c7447l2.yandex());
                                                        return;
                                                    }
                                                    String strSmaato = AbstractC11028l.smaato("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C14728l.class.getSimpleName(), uriM943l);
                                                    AbstractC12442l.isPro(uriM943l.equals(c3743l3.yandex), strSmaato, "uri");
                                                    AbstractC12442l.isPro(c14728lSignature.equals(c3743l3.loadAd), strSmaato, "schema");
                                                    AbstractC12442l.isPro(c13464lAmazon.equals(c3743l3.crashlytics), strSmaato, "handler");
                                                    AbstractC12442l.isPro(c13708l.equals(c3743l3.amazon), strSmaato, "migrations");
                                                    AbstractC12442l.isPro(obj.equals(obj), strSmaato, "variantConfig");
                                                    C8339l.metrica(AbstractC11028l.smaato(strSmaato, "unknown"));
                                                    return;
                                                case 2:
                                                    yandex();
                                                    return;
                                                default:
                                                    C10316l c10316l2 = this.f28089l;
                                                    C18480l c18480lYandex2 = c10316l2.yandex();
                                                    String str3 = (String) c18480lYandex2.f36084l;
                                                    C7447l c7447l3 = c10316l2.loadAd;
                                                    C2079l c2079l = c7447l3.mopub;
                                                    InterfaceC11766l interfaceC11766l = c7447l3.amazon;
                                                    C8746l c8746lLoadAd = c2079l.loadAd();
                                                    boolean z2 = c8746lLoadAd.subs;
                                                    if (c8746lLoadAd.isPro) {
                                                        if (AbstractC1315l.purchase(str3) && !z2) {
                                                            C5113l c5113l = C5113l.f11111l;
                                                            return;
                                                        }
                                                        C13265l c13265lSignature = C13658l.Signature();
                                                        C9754l c9754l = (C9754l) c18480lYandex2.f36089l;
                                                        int i7 = c9754l.f19893l;
                                                        C10620l c10620lTapsense = C3377l.tapsense();
                                                        c10620lTapsense.loadAd();
                                                        ((C3377l) c10620lTapsense.f20498l).Signature(i7);
                                                        int i8 = c9754l.f19892l;
                                                        c10620lTapsense.loadAd();
                                                        ((C3377l) c10620lTapsense.f20498l).license(i8);
                                                        C3377l c3377l = (C3377l) c10620lTapsense.amazon();
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).pro(c3377l);
                                                        if (!AbstractC1315l.purchase(str3)) {
                                                            c13265lSignature.loadAd();
                                                            ((C13658l) c13265lSignature.f20498l).license(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = c10316l2.crashlytics;
                                                            c13265lSignature.loadAd();
                                                            ((C13658l) c13265lSignature.f20498l).ad(str4);
                                                        }
                                                        C18222l c18222l = (C18222l) interfaceC11766l.get();
                                                        C13658l c13658l = (C13658l) c13265lSignature.amazon();
                                                        C1539l c1539l = c18222l.yandex;
                                                        C10147l c10147lYandex = C8662l.yandex();
                                                        c10147lYandex.yandex = new C15848l(3, c13658l);
                                                        c10147lYandex.amazon = new C9138l[]{AbstractC9464l.purchase};
                                                        c10147lYandex.crashlytics = true;
                                                        c10147lYandex.loadAd = false;
                                                        c4113lLoadAd = C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex()).admob(EnumC1535l.f3808l, new C7847l(c1539l, c13658l)));
                                                    } else {
                                                        if (AbstractC1315l.purchase(str3)) {
                                                            C5113l c5113l2 = C5113l.f11111l;
                                                            return;
                                                        }
                                                        C18222l c18222l2 = (C18222l) interfaceC11766l.get();
                                                        c18222l2.getClass();
                                                        str3.getClass();
                                                        c4113lLoadAd = C18222l.loadAd(c18222l2.yandex.billing(str3));
                                                    }
                                                    AbstractC7151l.loadAd(c4113lLoadAd, C9303l.class, new C11651l(i5, c10316l2), c7447l3.yandex());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                c18480l = c18480lYandex;
                            } else {
                                final int i5 = 0;
                                c7447l.yandex().execute(new Runnable(this) { // from class: lؚٓۗ

                                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                    public final /* synthetic */ C10316l f28089l;

                                    {
                                        this.f28089l = this;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:24:0x003d, B:27:0x0043, B:30:0x0048, B:32:0x0051, B:38:0x005e, B:40:0x0096, B:39:0x0083, B:35:0x0059, B:41:0x00a8), top: B:48:0x003d }] */
                                    private final void yandex() {
                                        boolean z;
                                        AbstractC12138l abstractC12138lYandex;
                                        C10316l c10316l = this.f28089l;
                                        C7258l c7258l = c10316l.loadAd.subs;
                                        boolean z2 = c10316l.purchase;
                                        C4226l c4226l = C4226l.yandex;
                                        InterfaceC7674l interfaceC7674l = (InterfaceC7674l) c7258l.crashlytics.get();
                                        if (interfaceC7674l == null && !z2) {
                                            C5113l c5113l = C5113l.f11111l;
                                            return;
                                        }
                                        if ((c7258l.purchase & 64) == 0) {
                                            CopyOnWriteArrayList copyOnWriteArrayList = c7258l.billing;
                                            synchronized (copyOnWriteArrayList) {
                                                try {
                                                    int i6 = c7258l.purchase;
                                                    if ((i6 & 64) == 0) {
                                                        copyOnWriteArrayList.add(c4226l);
                                                        c7258l.purchase = i6 | 64;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        if (c7258l.admob == null) {
                                            synchronized (c7258l.mopub) {
                                                try {
                                                    if (c7258l.admob == null) {
                                                        if (interfaceC7674l == null) {
                                                            interfaceC7674l = C0912l.yandex;
                                                        }
                                                        Context context = c7258l.yandex;
                                                        int i7 = 0;
                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                            if (!AbstractC18452l.crashlytics(context)) {
                                                                z = true;
                                                            }
                                                            if (z) {
                                                                RunnableC10253l runnableC10253l4 = RunnableC10253l.f20875l;
                                                                InterfaceC11766l interfaceC11766l4 = c7258l.loadAd;
                                                                abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l4, null), (Executor) interfaceC11766l4.get()), new C3013l(c7258l, interfaceC7674l, i7), (Executor) interfaceC11766l4.get());
                                                                c7258l.admob = abstractC12138lYandex;
                                                            } else {
                                                                abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                                c7258l.admob = abstractC12138lYandex;
                                                            }
                                                            abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                        } else {
                                                            UserManager userManager = AbstractC18452l.yandex;
                                                        }
                                                        z = false;
                                                        if (z) {
                                                            RunnableC10253l runnableC10253l5 = RunnableC10253l.f20875l;
                                                            InterfaceC11766l interfaceC11766l5 = c7258l.loadAd;
                                                            abstractC12138lYandex = AbstractC7151l.admob(AbstractC18452l.loadAd(context, Executors.callable(runnableC10253l5, null), (Executor) interfaceC11766l5.get()), new C3013l(c7258l, interfaceC7674l, i7), (Executor) interfaceC11766l5.get());
                                                            c7258l.admob = abstractC12138lYandex;
                                                        } else {
                                                            abstractC12138lYandex = ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, interfaceC7674l));
                                                            c7258l.admob = abstractC12138lYandex;
                                                        }
                                                        abstractC12138lYandex.yandex(new RunnableC10799l(15, abstractC12138lYandex), (Executor) c7258l.loadAd.get());
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3743l c3743l;
                                        C4113l c4113lLoadAd;
                                        boolean z = true;
                                        int i6 = 0;
                                        switch (i5) {
                                            case 0:
                                                this.f28089l.loadAd();
                                                return;
                                            case 1:
                                                C10316l c10316l = this.f28089l;
                                                C7447l c7447l2 = c10316l.loadAd;
                                                String str = c10316l.crashlytics;
                                                C1004l c1004l = AbstractC15628l.yandex;
                                                Object obj = C14823l.f29002l;
                                                Context context = c7447l2.loadAd;
                                                Pattern pattern = AbstractC15467l.yandex;
                                                C1424l c1424l = new C1424l(context, 24);
                                                c1424l.m916l("phenotype");
                                                c1424l.m950l("all_accounts.pb");
                                                Uri uriM943l = c1424l.m943l();
                                                if (uriM943l == null) {
                                                    C6541l.subs("Null uri");
                                                    return;
                                                }
                                                C14728l c14728lSignature = C14728l.Signature();
                                                if (c14728lSignature == null) {
                                                    C6541l.subs("Null schema");
                                                    return;
                                                }
                                                C13464l c13464lAmazon = AbstractC17238l.amazon(AbstractC15628l.yandex);
                                                C9258l c9258l = AbstractC1186l.f3181l;
                                                C13708l c13708l = C13708l.f26763l;
                                                C3743l c3743l2 = new C3743l(uriM943l, c14728lSignature, c13464lAmazon, c13708l);
                                                C3557l c3557l = AbstractC15628l.crashlytics;
                                                if (c3557l == null) {
                                                    synchronized (AbstractC15628l.loadAd) {
                                                        try {
                                                            c3557l = AbstractC15628l.crashlytics;
                                                            if (c3557l == null) {
                                                                HashMap map = new HashMap();
                                                                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c7447l2.yandex();
                                                                C2830l c2830l = (C2830l) c7447l2.billing.get();
                                                                C2286l c2286l = C2286l.yandex;
                                                                AbstractC12442l.isPro(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", c2286l);
                                                                C3557l c3557l2 = new C3557l();
                                                                c3557l2.f7480l = new ConcurrentHashMap();
                                                                scheduledExecutorServiceC6354lYandex.getClass();
                                                                c3557l2.f7479l = scheduledExecutorServiceC6354lYandex;
                                                                c2830l.getClass();
                                                                c3557l2.f7478l = c2830l;
                                                                c3557l2.f7481l = map;
                                                                AbstractC12442l.admob(!map.isEmpty());
                                                                c3557l2.f7482l = C13368l.crashlytics;
                                                                AbstractC15628l.crashlytics = c3557l2;
                                                                c3557l = c3557l2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    c7447l2 = c7447l2;
                                                    z = true;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3557l.f7480l;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriM943l);
                                                if (pairCreate == null) {
                                                    AbstractC12442l.isPro(uriM943l.isHierarchical(), "Uri must be hierarchical: %s", uriM943l);
                                                    String lastPathSegment = uriM943l.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    AbstractC12442l.isPro((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM943l);
                                                    C2286l c2286l2 = (C2286l) ((HashMap) c3557l.f7481l).get("singleproc");
                                                    AbstractC12442l.isPro(c2286l2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriM943l.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    C18012l c18012lAdmob = AbstractC7151l.admob(AbstractC7151l.purchase(uriM943l), (C13368l) c3557l.f7482l, EnumC1535l.f3808l);
                                                    Executor executor = (Executor) c3557l.f7479l;
                                                    C2830l c2830l2 = (C2830l) c3557l.f7478l;
                                                    c2286l2.getClass();
                                                    String str2 = strSubstring;
                                                    c3743l = c3743l2;
                                                    C5702l c5702l = new C5702l(new C18289l(str2, AbstractC7151l.purchase(uriM943l), new C1641l(c14728lSignature, C11337l.yandex()), executor, c2830l2, c13464lAmazon, new C18420l()), c18012lAdmob);
                                                    if (!c13708l.isEmpty()) {
                                                        c5702l.yandex(new C3013l(c13708l, executor, z ? 1 : 0));
                                                    }
                                                    pairCreate = Pair.create(c5702l, c3743l);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM943l, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                } else {
                                                    c3743l = c3743l2;
                                                }
                                                C5702l c5702l2 = (C5702l) pairCreate.first;
                                                C3743l c3743l3 = (C3743l) pairCreate.second;
                                                int i7 = 2;
                                                if (c3743l.equals(c3743l3)) {
                                                    C3565l c3565lLoadAd = c5702l2.loadAd(new C1164l(i7, str), c7447l2.yandex());
                                                    c3565lLoadAd.yandex(new RunnableC0147l(c10316l, c3565lLoadAd, 0), c7447l2.yandex());
                                                    return;
                                                }
                                                String strSmaato = AbstractC11028l.smaato("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C14728l.class.getSimpleName(), uriM943l);
                                                AbstractC12442l.isPro(uriM943l.equals(c3743l3.yandex), strSmaato, "uri");
                                                AbstractC12442l.isPro(c14728lSignature.equals(c3743l3.loadAd), strSmaato, "schema");
                                                AbstractC12442l.isPro(c13464lAmazon.equals(c3743l3.crashlytics), strSmaato, "handler");
                                                AbstractC12442l.isPro(c13708l.equals(c3743l3.amazon), strSmaato, "migrations");
                                                AbstractC12442l.isPro(obj.equals(obj), strSmaato, "variantConfig");
                                                C8339l.metrica(AbstractC11028l.smaato(strSmaato, "unknown"));
                                                return;
                                            case 2:
                                                yandex();
                                                return;
                                            default:
                                                C10316l c10316l2 = this.f28089l;
                                                C18480l c18480lYandex2 = c10316l2.yandex();
                                                String str3 = (String) c18480lYandex2.f36084l;
                                                C7447l c7447l3 = c10316l2.loadAd;
                                                C2079l c2079l = c7447l3.mopub;
                                                InterfaceC11766l interfaceC11766l = c7447l3.amazon;
                                                C8746l c8746lLoadAd = c2079l.loadAd();
                                                boolean z2 = c8746lLoadAd.subs;
                                                if (c8746lLoadAd.isPro) {
                                                    if (AbstractC1315l.purchase(str3) && !z2) {
                                                        C5113l c5113l = C5113l.f11111l;
                                                        return;
                                                    }
                                                    C13265l c13265lSignature = C13658l.Signature();
                                                    C9754l c9754l = (C9754l) c18480lYandex2.f36089l;
                                                    int i8 = c9754l.f19893l;
                                                    C10620l c10620lTapsense = C3377l.tapsense();
                                                    c10620lTapsense.loadAd();
                                                    ((C3377l) c10620lTapsense.f20498l).Signature(i8);
                                                    int i9 = c9754l.f19892l;
                                                    c10620lTapsense.loadAd();
                                                    ((C3377l) c10620lTapsense.f20498l).license(i9);
                                                    C3377l c3377l = (C3377l) c10620lTapsense.amazon();
                                                    c13265lSignature.loadAd();
                                                    ((C13658l) c13265lSignature.f20498l).pro(c3377l);
                                                    if (!AbstractC1315l.purchase(str3)) {
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).license(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = c10316l2.crashlytics;
                                                        c13265lSignature.loadAd();
                                                        ((C13658l) c13265lSignature.f20498l).ad(str4);
                                                    }
                                                    C18222l c18222l = (C18222l) interfaceC11766l.get();
                                                    C13658l c13658l = (C13658l) c13265lSignature.amazon();
                                                    C1539l c1539l = c18222l.yandex;
                                                    C10147l c10147lYandex = C8662l.yandex();
                                                    c10147lYandex.yandex = new C15848l(3, c13658l);
                                                    c10147lYandex.amazon = new C9138l[]{AbstractC9464l.purchase};
                                                    c10147lYandex.crashlytics = true;
                                                    c10147lYandex.loadAd = false;
                                                    c4113lLoadAd = C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex()).admob(EnumC1535l.f3808l, new C7847l(c1539l, c13658l)));
                                                } else {
                                                    if (AbstractC1315l.purchase(str3)) {
                                                        C5113l c5113l2 = C5113l.f11111l;
                                                        return;
                                                    }
                                                    C18222l c18222l2 = (C18222l) interfaceC11766l.get();
                                                    c18222l2.getClass();
                                                    str3.getClass();
                                                    c4113lLoadAd = C18222l.loadAd(c18222l2.yandex.billing(str3));
                                                }
                                                AbstractC7151l.loadAd(c4113lLoadAd, C9303l.class, new C11651l(i6, c10316l2), c7447l3.yandex());
                                                return;
                                        }
                                    }
                                });
                                c18480l = new C18480l(C15643l.signatures(), (C9754l) c18480lYandex.f36089l);
                            }
                        }
                        if (!this.purchase || ((C9754l) c18480l.f36089l).f19892l != 17) {
                            this.yandex = c18480l;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18480l;
    }
}
