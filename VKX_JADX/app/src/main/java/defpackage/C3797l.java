package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۧٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3797l implements InterfaceC11116l, InterfaceC0589l, InterfaceC9474l, InterfaceC14606l, InterfaceC17377l, InterfaceC9526l, InterfaceC7882l, InterfaceC12184l, InterfaceC10346l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3797l f7900l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3797l f7901l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f7902l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f7903l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7904l;

    static {
        int i = 1;
        f7901l = new C3797l("dhDefaultParams", C2396l.class, i);
        f7900l = new C3797l("dsaDefaultParams", C12933l.class, i);
    }

    public C3797l(int i) {
        this.f7904l = i;
        switch (i) {
            case 10:
                C15715l c15715l = new C15715l();
                c15715l.yandex = AbstractC1805l.crashlytics(C2580l.f5619l);
                this.f7903l = c15715l;
                this.f7902l = new C0458l(10);
                break;
            case 15:
                this.f7903l = new HashSet();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f7903l = new C10358l();
                this.f7902l = new C6344l(2);
                break;
            default:
                C5138l c5138l = new C5138l((char) 0, 4);
                c5138l.f11181l = new ArrayList();
                this.f7903l = c5138l;
                this.f7902l = new C1414l(900.0f, 1.0f);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static C3797l appmetrica(String... strArr) {
        String str;
        try {
            C3844l[] c3844lArr = new C3844l[strArr.length];
            C0869l c0869l = new C0869l();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = AbstractC9542l.f19444l;
                c0869l.m709instanceof(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                c0869l.m721l(i2, i3, str2);
                            }
                            c0869l.m718l(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            c0869l.m721l(i2, i3, str2);
                        }
                        c0869l.m718l(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    c0869l.m721l(i2, length, str2);
                }
                c0869l.m709instanceof(34);
                c0869l.readByte();
                c3844lArr[i] = c0869l.premium(c0869l.f2526l);
            }
            return new C3797l((String[]) strArr.clone(), AbstractC14770l.firebase(c3844lArr), 28);
        } catch (IOException e) {
            C8339l.subs(e);
            return null;
        }
    }

    public static C0458l purchase() {
        C0458l c0458l = new C0458l(20, false);
        c0458l.f1691l = new HashMap();
        c0458l.f1690l = new HashMap();
        return c0458l;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static C3797l yandex(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C3797l(channel, fileLockLock, 14);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    public void Signature(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, Bundle bundle, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.Signature(abstractComponentCallbacksC4411l, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void ad(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.ad(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void adcel(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.adcel(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        AbstractC17780l abstractC17780l;
        AbstractC11918l abstractC11918l = (AbstractC11918l) this.f7903l;
        C16364l c16364l = interfaceC14356l instanceof C16364l ? (C16364l) interfaceC14356l : null;
        int iPurchase = AbstractC11173l.purchase(abstractC11918l);
        int i = iPurchase > 250 ? 6 : 5;
        int i2 = 1 << i;
        if (c16364l != null && (abstractC17780l = c16364l.loadAd) != null && abstractC17780l.purchase() >= i2) {
            return c16364l;
        }
        int i3 = ((iPurchase + i) - 1) / i;
        int i4 = i + 1;
        AbstractC8859l[] abstractC8859lArr = new AbstractC8859l[i4];
        abstractC8859lArr[0] = (AbstractC8859l) this.f7902l;
        for (int i5 = 1; i5 < i; i5++) {
            abstractC8859lArr[i5] = abstractC8859lArr[i5 - 1].ad(i3);
        }
        abstractC8859lArr[i] = abstractC8859lArr[0].license(abstractC8859lArr[1]);
        abstractC11918l.startapp(abstractC8859lArr, 0, i4, null);
        AbstractC8859l[] abstractC8859lArr2 = new AbstractC8859l[i2];
        abstractC8859lArr2[0] = abstractC8859lArr[0];
        for (int i6 = i - 1; i6 >= 0; i6--) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i6];
            int i7 = 1 << i6;
            for (int i8 = i7; i8 < i2; i8 += i7 << 1) {
                abstractC8859lArr2[i8] = abstractC8859lArr2[i8 - i7].yandex(abstractC8859l);
            }
        }
        abstractC11918l.startapp(abstractC8859lArr2, 0, i2, null);
        C16364l c16364l2 = new C16364l();
        c16364l2.yandex = null;
        c16364l2.loadAd = null;
        c16364l2.crashlytics = -1;
        c16364l2.loadAd = abstractC11918l.loadAd(abstractC8859lArr2, i2);
        c16364l2.yandex = abstractC8859lArr[i];
        c16364l2.crashlytics = i;
        return c16364l2;
    }

    public void ads(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        C13734l c13734l = (C13734l) this.f7903l;
        AbstractActivityC16046l abstractActivityC16046l = c13734l.pro.f13181l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c13734l.advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.ads(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object advert(AbstractC0283l abstractC0283l) throws Throwable {
        C11322l c11322l;
        int i;
        int i2;
        C14249l c14249l;
        int i3;
        AbstractC10022l abstractC10022l;
        AbstractC10022l abstractC10022l2;
        if (abstractC0283l instanceof C11322l) {
            c11322l = (C11322l) abstractC0283l;
            int i4 = c11322l.f22818l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11322l.f22818l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11322l = new C11322l(this, abstractC0283l);
            }
        } else {
            c11322l = new C11322l(this, abstractC0283l);
        }
        Object objYandex = c11322l.f22817l;
        int i5 = c11322l.f22818l;
        Object obj = EnumC9342l.f19165l;
        try {
            if (i5 == 0) {
                AbstractC2829l.crashlytics(objYandex);
                C6806l c6806l = new C6806l();
                C6806l c6806l2 = (C6806l) this.f7903l;
                c6806l.purchase = c6806l2.purchase;
                c6806l.crashlytics(c6806l2);
                C16864l c16864l = (C16864l) this.f7902l;
                c11322l.f22820l = 0;
                c11322l.f22819l = 0;
                c11322l.f22818l = 1;
                objYandex = c16864l.yandex(c6806l, c11322l);
                if (objYandex != obj) {
                    i = 0;
                    i2 = 0;
                }
                return obj;
            }
            if (i5 == 1) {
                i = c11322l.f22819l;
                i2 = c11322l.f22820l;
                AbstractC2829l.crashlytics(objYandex);
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC10022l abstractC10022l3 = c11322l.f22816l;
                    AbstractC2829l.crashlytics(objYandex);
                    return abstractC10022l3;
                }
                i = c11322l.f22819l;
                i3 = c11322l.f22820l;
                c14249l = c11322l.f22822l;
                AbstractC2829l.crashlytics(objYandex);
            }
            abstractC10022l = ((C14249l) objYandex).f27845l;
            if (abstractC10022l != null) {
                abstractC10022l = null;
            }
            abstractC10022l2 = c14249l.f27845l;
            if (abstractC10022l2 != null) {
                abstractC10022l2 = null;
            }
            c11322l.f22822l = null;
            c11322l.f22816l = abstractC10022l;
            c11322l.f22820l = i3;
            c11322l.f22819l = i;
            c11322l.f22818l = 3;
            if (subs(abstractC10022l2, c11322l) != obj) {
                return obj;
            }
            return abstractC10022l;
            C14249l c14249l2 = (C14249l) objYandex;
            c11322l.f22822l = c14249l2;
            c11322l.f22820l = i2;
            c11322l.f22819l = i;
            c11322l.f22818l = 2;
            Object objAmazon = AbstractC13841l.amazon(c14249l2, c11322l);
            if (objAmazon != obj) {
                int i6 = i2;
                c14249l = c14249l2;
                objYandex = objAmazon;
                i3 = i6;
                abstractC10022l = ((C14249l) objYandex).f27845l;
                if (abstractC10022l != null) {
                    abstractC10022l = null;
                }
                abstractC10022l2 = c14249l.f27845l;
                if (abstractC10022l2 != null) {
                    abstractC10022l2 = null;
                }
                c11322l.f22822l = null;
                c11322l.f22816l = abstractC10022l;
                c11322l.f22820l = i3;
                c11322l.f22819l = i;
                c11322l.f22818l = 3;
                if (subs(abstractC10022l2, c11322l) != obj) {
                    return abstractC10022l;
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw AbstractC15852l.purchase(e);
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        C3214l c3214l = (C3214l) obj;
        c3214l.getClass();
        ((InterfaceC13989l) ((C11644l) this.f7902l).f23358l).loadAd(c3214l);
    }

    public void applovin() throws IOException {
        String str = (String) this.f7903l;
        if (((FileChannel) this.f7902l) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f7902l = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f7902l;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f7902l = null;
            C4875l.remoteconfig(AbstractC15560l.Signature("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // defpackage.InterfaceC10346l
    public InterfaceC6797l apply() {
        return ((C9117l) this.f7903l).billing(this.f7902l);
    }

    @Override // defpackage.InterfaceC10346l
    public boolean billing(C15263l c15263l) {
        return true;
    }

    @Override // defpackage.InterfaceC9526l
    public ListenableFuture call() {
        ExecutorC5263l executorC5263l = (ExecutorC5263l) this.f7903l;
        int i = ExecutorC5263l.f11347l;
        if (executorC5263l.compareAndSet(EnumC7860l.f16398l, EnumC7860l.f16396l)) {
            return ((InterfaceC9526l) this.f7902l).call();
        }
        C9674l c9674l = C9674l.f19753l;
        return c9674l != null ? c9674l : new C9674l();
    }

    @Override // defpackage.InterfaceC17377l
    public long crashlytics() {
        return ((Long) ((C2683l) this.f7903l).mo1368apply(Long.valueOf(((C10819l) this.f7902l).crashlytics()))).longValue();
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: default */
    public ListenableFuture mo1118default(C3852l c3852l) {
        Uri uri;
        byte[] bArr;
        C10111l c10111l = (C10111l) this.f7902l;
        if (c10111l != null && (((uri = (Uri) c10111l.f20586l) != null && uri.equals(c3852l.vip)) || ((bArr = (byte[]) c10111l.f20587l) != null && Arrays.equals(bArr, c3852l.firebase)))) {
            ListenableFuture listenableFuture = (ListenableFuture) ((C10111l) this.f7902l).f20589l;
            listenableFuture.getClass();
            return listenableFuture;
        }
        ListenableFuture listenableFutureMo1118default = ((InterfaceC9474l) this.f7903l).mo1118default(c3852l);
        if (listenableFutureMo1118default == null) {
            return null;
        }
        this.f7902l = new C10111l(c3852l, listenableFutureMo1118default);
        return listenableFutureMo1118default;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public String m1424extends(String str) {
        String str2 = (String) this.f7902l;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean firebase(int i) {
        return ((C4094l) this.f7903l).yandex.get(i);
    }

    @Override // defpackage.InterfaceC12184l
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        return (BalloonAnchorOverlayView) this.f7903l;
    }

    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (interfaceC9719l instanceof C6114l) {
            interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
        }
        C17106l c17106l = (C17106l) interfaceC9719l;
        ((C10358l) this.f7903l).init(z, c17106l.f33271l);
        C6344l c6344l = (C6344l) this.f7902l;
        InterfaceC9719l interfaceC9719l2 = c17106l.f33271l;
        byte[] bArr = c17106l.f33272l;
        c6344l.init(new C0272l(interfaceC9719l2, bArr, 0, bArr.length));
    }

    public void inmobi(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC16451l interfaceC16451l = "clx".equals(bundle2.getString("_o")) ? (C0554l) this.f7903l : (C3585l) this.f7902l;
            if (interfaceC16451l == null) {
                return;
            }
            interfaceC16451l.metrica(string, bundle2);
        }
    }

    @Override // defpackage.InterfaceC17377l
    public long isPro() {
        return ((Long) ((C2683l) this.f7903l).mo1368apply(Long.valueOf(((C10819l) this.f7902l).isPro()))).longValue();
    }

    public C0607l isVip(Context context, String str, InputStream inputStream, String str2, String str3) {
        C0607l c0607lCrashlytics;
        EnumC13563l enumC13563l;
        C7972l c7972l = (C7972l) this.f7903l;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC17968l.yandex();
            EnumC13563l enumC13563l2 = EnumC13563l.ZIP;
            c0607lCrashlytics = str3 != null ? AbstractC8446l.crashlytics(context, new ZipInputStream(new FileInputStream(c7972l.m2241return(str, inputStream, enumC13563l2))), str) : AbstractC8446l.crashlytics(context, new ZipInputStream(inputStream), null);
            enumC13563l = enumC13563l2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC17968l.yandex();
            enumC13563l = EnumC13563l.GZIP;
            c0607lCrashlytics = str3 != null ? AbstractC8446l.yandex(new GZIPInputStream(new FileInputStream(c7972l.m2241return(str, inputStream, enumC13563l))), str) : AbstractC8446l.yandex(new GZIPInputStream(inputStream), null);
        } else {
            AbstractC17968l.yandex();
            enumC13563l = EnumC13563l.JSON;
            c0607lCrashlytics = str3 != null ? AbstractC8446l.yandex(new FileInputStream(c7972l.m2241return(str, inputStream, enumC13563l).getAbsolutePath()), str) : AbstractC8446l.yandex(inputStream, null);
        }
        if (str3 != null && c0607lCrashlytics.yandex != null) {
            File file = new File(c7972l.m2224class(), C7972l.m2218synchronized(str, enumC13563l, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC17968l.yandex();
            if (!zRenameTo) {
                AbstractC17968l.loadAd("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c0607lCrashlytics;
    }

    public void license(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.license(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public boolean loadAd() {
        synchronized (this) {
            if (((AtomicBoolean) this.f7902l).get()) {
                return false;
            }
            ((AtomicInteger) this.f7903l).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.InterfaceC10346l
    /* JADX INFO: renamed from: lْٓؒ */
    public boolean mo1191l() {
        return true;
    }

    public void metrica(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.metrica(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        int i = ((C3716l) this.f7903l).billing;
        if (i == 2 && (th instanceof CancellationException)) {
            AbstractC5088l.yandex("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        } else {
            AbstractC5088l.Signature("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(AbstractC7985l.crashlytics(i)), th);
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public Enum m1425native(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) ((Map) this.f7902l).get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public void m1426package(C11253l c11253l) {
        ExecutorC14538l executorC14538l = (ExecutorC14538l) this.f7902l;
        C10685l c10685l = (C10685l) this.f7903l;
        int i = c11253l.loadAd;
        if (i == 0) {
            executorC14538l.execute(new RunnableC9929l(c10685l, c11253l.yandex, 6));
        } else {
            executorC14538l.execute(new RunnableC16326l(c10685l, i, 0));
        }
    }

    public Object premium(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7902l;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((Function1) this.f7903l).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m1427private() {
        synchronized (this) {
            ((AtomicInteger) this.f7903l).decrementAndGet();
            if (((AtomicInteger) this.f7903l).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public void pro(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.pro(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void remoteconfig(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        C13734l c13734l = (C13734l) this.f7903l;
        AbstractActivityC16046l abstractActivityC16046l = c13734l.pro.f13181l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c13734l.advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.remoteconfig(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public Object signatures(Enum r2) throws GeneralSecurityException {
        Object obj = ((Map) this.f7903l).get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }

    public void smaato(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.smaato(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void startapp(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.startapp(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m1428strictfp() {
        try {
            ((FileLock) this.f7902l).release();
            ((FileChannel) this.f7903l).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object subs(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C11016l c11016l;
        if (abstractC0283l instanceof C11016l) {
            c11016l = (C11016l) abstractC0283l;
            int i = c11016l.f22207l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11016l.f22207l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11016l = new C11016l(this, abstractC0283l);
            }
        } else {
            c11016l = new C11016l(this, abstractC0283l);
        }
        Object obj = c11016l.f22206l;
        int i2 = c11016l.f22207l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C0462l c0462l = (C0462l) AbstractC11174l.mopub(abstractC10022l.vip());
            c0462l.m3885new(Unit.INSTANCE);
            C11911l c11911l = AbstractC17371l.yandex;
            if (!abstractC10022l.loadAd().getAttributes().loadAd(AbstractC17371l.loadAd)) {
                try {
                    AbstractC5170l.loadAd(abstractC10022l.crashlytics());
                } catch (Throwable unused) {
                }
            }
            c11016l.f22207l = 1;
            Object objMo2158switch = c0462l.mo2158switch(c11016l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMo2158switch == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    public void subscription(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.subscription(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m1429synchronized(C15034l c15034l) {
        ((HashSet) this.f7903l).add(c15034l);
        if (((C15034l) this.f7902l) != null) {
            return;
        }
        this.f7902l = c15034l;
        C1441l c1441lCrashlytics = c15034l.loadAd.crashlytics();
        c15034l.isVip = c1441lCrashlytics;
        HandlerC7734l handlerC7734l = c15034l.subscription;
        String str = AbstractC15323l.yandex;
        c1441lCrashlytics.getClass();
        handlerC7734l.getClass();
        handlerC7734l.obtainMessage(1, new C5226l(C13071l.mopub.getAndIncrement(), true, SystemClock.elapsedRealtime(), c1441lCrashlytics)).sendToTarget();
    }

    public void tapsense(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.tapsense(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m1430throws(Exception exc, boolean z) {
        this.f7902l = null;
        HashSet hashSet = (HashSet) this.f7903l;
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(hashSet);
        hashSet.clear();
        C9258l c9258lListIterator = abstractC1186lSignature.listIterator(0);
        while (c9258lListIterator.hasNext()) {
            C15034l c15034l = (C15034l) c9258lListIterator.next();
            c15034l.getClass();
            c15034l.smaato(z ? 1 : 3, exc);
        }
    }

    public String toString() {
        switch (this.f7904l) {
            case 20:
                return ((InterfaceC9526l) this.f7902l).toString();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "HttpStatement[" + ((C6806l) this.f7903l).yandex + ']';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: try */
    public ListenableFuture mo1119try(byte[] bArr) {
        byte[] bArr2;
        C10111l c10111l = (C10111l) this.f7902l;
        if (c10111l == null || (bArr2 = (byte[]) c10111l.f20587l) == null || !Arrays.equals(bArr2, bArr)) {
            ListenableFuture listenableFutureMo1119try = ((InterfaceC9474l) this.f7903l).mo1119try(bArr);
            this.f7902l = new C10111l(bArr, listenableFutureMo1119try);
            return listenableFutureMo1119try;
        }
        ListenableFuture listenableFuture = (ListenableFuture) ((C10111l) this.f7902l).f20589l;
        listenableFuture.getClass();
        return listenableFuture;
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] unwrap(byte[] bArr, int i, int i2) {
        C6344l c6344l = (C6344l) this.f7902l;
        c6344l.getClass();
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        C10358l c10358l = (C10358l) this.f7903l;
        c10358l.tapsense(0, 0, bArr, bArr2);
        c10358l.tapsense(8, 8, bArr, bArr2);
        c10358l.tapsense(16, 16, bArr, bArr2);
        c10358l.tapsense(24, 24, bArr, bArr2);
        byte[] bArr3 = new byte[4];
        c6344l.update(bArr2, 0, i3);
        c6344l.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, i2 - 4, bArr4, 0, 4);
        if (AbstractC14024l.smaato(bArr3, bArr4)) {
            return bArr2;
        }
        C8339l.smaato("mac mismatch");
        return null;
    }

    public void vip(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C13734l) this.f7903l).advert;
        if (abstractComponentCallbacksC4411l2 != null) {
            abstractComponentCallbacksC4411l2.admob().metrica.vip(abstractComponentCallbacksC4411l, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7902l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C7955l m1431volatile() throws IOException {
        File file = (File) this.f7902l;
        File file2 = (File) this.f7903l;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                AbstractC6427l.vip("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new C7955l(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new C7955l(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] wrap(byte[] bArr, int i, int i2) {
        C6344l c6344l = (C6344l) this.f7902l;
        c6344l.update(bArr, 0, i2);
        byte[] bArr2 = new byte[i2 + 4];
        C10358l c10358l = (C10358l) this.f7903l;
        c10358l.tapsense(0, 0, bArr, bArr2);
        c10358l.tapsense(8, 8, bArr, bArr2);
        c10358l.tapsense(16, 16, bArr, bArr2);
        c10358l.tapsense(24, 24, bArr, bArr2);
        c6344l.doFinal(bArr2, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC10346l
    public void cancel() {
    }

    public /* synthetic */ C3797l(Object obj, Object obj2, int i) {
        this.f7904l = i;
        this.f7903l = obj;
        this.f7902l = obj2;
    }

    public C3797l(String str, C5795l c5795l, C14823l c14823l) {
        this.f7904l = 4;
        this.f7902l = str;
        this.f7903l = c5795l;
    }

    public C3797l(String str, String str2) {
        this.f7904l = 25;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f7903l = str;
            this.f7902l = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public /* synthetic */ C3797l(int i, boolean z) {
        this.f7904l = i;
    }

    public C3797l(Function1 function1) {
        this.f7904l = 12;
        this.f7903l = function1;
        this.f7902l = new ConcurrentHashMap();
    }

    public C3797l(C13734l c13734l) {
        this.f7904l = 23;
        this.f7903l = c13734l;
        this.f7902l = new CopyOnWriteArrayList();
    }

    public C3797l(String str) {
        this.f7904l = 21;
        this.f7903l = str.concat(".lck");
    }

    public C3797l(C10832l c10832l) {
        this.f7904l = 11;
        this.f7903l = new AtomicInteger(0);
        this.f7902l = new AtomicBoolean(false);
    }

    public C3797l(InterfaceC9474l interfaceC9474l) {
        this.f7904l = 8;
        this.f7903l = interfaceC9474l;
    }

    public C3797l(File file) {
        this.f7904l = 6;
        this.f7903l = file;
        this.f7902l = new File(file.getPath() + ".bak");
    }

    public C3797l(C4094l c4094l, SparseArray sparseArray) {
        this.f7904l = 2;
        this.f7903l = c4094l;
        SparseBooleanArray sparseBooleanArray = c4094l.yandex;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iLoadAd = c4094l.loadAd(i);
            C5597l c5597l = (C5597l) sparseArray.get(iLoadAd);
            c5597l.getClass();
            sparseArray2.append(iLoadAd, c5597l);
        }
        this.f7902l = sparseArray2;
    }

    public C3797l(C11644l c11644l, C3716l c3716l) {
        this.f7904l = 17;
        this.f7902l = c11644l;
        this.f7903l = c3716l;
    }
}
