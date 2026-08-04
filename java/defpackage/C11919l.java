package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11919l implements InterfaceC14091l, InterfaceC12184l, InterfaceC2053l, InterfaceC10377l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f23763l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f23764l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23765l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f23766l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f23767l;

    public C11919l(byte b, int i) {
        this.f23765l = i;
        switch (i) {
            case 5:
                this.f23763l = new Object();
                this.f23767l = new ArrayList();
                this.f23766l = new ArrayList();
                this.f23764l = true;
                break;
            case 11:
                this.f23763l = new Object();
                this.f23767l = new ArrayDeque();
                this.f23766l = new AtomicReference();
                break;
            default:
                this.f23763l = new C15295l(1);
                break;
        }
    }

    public static final void yandex(C11919l c11919l) {
        Object obj;
        Map map;
        while (true) {
            synchronized (((C6096l) c11919l.f23763l)) {
                obj = c11919l.f23767l;
                map = (Map) c11919l.f23766l;
                Unit unit = Unit.INSTANCE;
            }
            for (Map.Entry entry : map.entrySet()) {
                Function1 function1 = (Function1) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    function1.invoke(obj);
                }
            }
            synchronized (((C6096l) c11919l.f23763l)) {
                if (obj == c11919l.f23767l) {
                    c11919l.f23764l = false;
                    return;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public void Signature(Runnable runnable, Executor executor) {
        synchronized (this.f23763l) {
            try {
                if (this.f23764l) {
                    ((ArrayDeque) this.f23767l).add(new C2486l(runnable, executor));
                } else {
                    this.f23764l = true;
                    isVip(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ad(String str) {
        SharedPreferences.Editor editorEdit = ((C16386l) this.f23766l).m4180l().edit();
        editorEdit.putString((String) this.f23763l, str);
        editorEdit.apply();
        this.f23767l = str;
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        int i;
        synchronized (((C3224l) this.f23766l)) {
            try {
                if (!(exc instanceof C3890l) || ((i = ((C3890l) exc).f8033l.f584l) != 8001 && i != 8002)) {
                    ((C3224l) this.f23766l).amazon((C1062l) this.f23763l, (C12648l) this.f23767l);
                } else if (this.f23764l) {
                    ((C3224l) this.f23766l).loadAd.remove((C12648l) this.f23767l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object admob() {
        Object obj;
        synchronized (((C6096l) this.f23763l)) {
            obj = this.f23767l;
        }
        return obj;
    }

    public void ads(boolean z) {
        if (z == this.f23764l) {
            return;
        }
        C14500l c14500l = (C14500l) this.f23766l;
        if (z) {
            final int i = 0;
            c14500l.amazon(new Runnable(this) { // from class: lٙٔ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C11919l f35929l;

                {
                    this.f35929l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    C11919l c11919l = this.f35929l;
                    switch (i2) {
                        case 0:
                            ((Context) c11919l.f23763l).registerReceiver((C1117l) c11919l.f23767l, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) c11919l.f23763l).unregisterReceiver((C1117l) c11919l.f23767l);
                            break;
                    }
                }
            });
            this.f23764l = true;
        } else {
            final int i2 = 1;
            c14500l.amazon(new Runnable(this) { // from class: lٙٔ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C11919l f35929l;

                {
                    this.f35929l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    C11919l c11919l = this.f35929l;
                    switch (i3) {
                        case 0:
                            ((Context) c11919l.f23763l).registerReceiver((C1117l) c11919l.f23767l, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) c11919l.f23763l).unregisterReceiver((C1117l) c11919l.f23767l);
                            break;
                    }
                }
            });
            this.f23764l = false;
        }
    }

    public void advert() {
        synchronized (this.f23763l) {
            try {
                if (((ArrayDeque) this.f23767l).isEmpty()) {
                    this.f23764l = false;
                    return;
                }
                C2486l c2486l = (C2486l) ((ArrayDeque) this.f23767l).remove();
                isVip(c2486l.loadAd, c2486l.yandex);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void amazon(boolean z) {
        C5613l c5613l = (C5613l) this.f23766l;
        synchronized (c5613l.f11920l) {
            try {
                if (this.f23764l) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC8576l.yandex(((C7976l) this.f23763l).mopub, this)) {
                    C5613l.yandex(c5613l, this, z);
                }
                this.f23764l = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6150l billing(C1441l c1441l) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), c1441l.yandex, "\"}".getBytes(charset)};
        long length = 0;
        for (int i = 0; i < 3; i++) {
            length += (long) bArr[i].length;
        }
        int i2 = (int) length;
        AbstractC12442l.billing(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i2));
        byte[] bArr2 = new byte[i2];
        int length2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr3 = bArr[i3];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        InterfaceC14090l interfaceC14090lPro = ((C5601l) this.f23763l).pro();
        String str = c1441l.loadAd;
        String string = C0674l.subs.toString();
        String strValueOf = String.valueOf(i2);
        AbstractC12832l.yandex("Content-Length", strValueOf);
        return AbstractC16670l.billing(interfaceC14090lPro, str, bArr2, C15333l.admob(2, new Object[]{"Content-Type", string, "Content-Length", strValueOf}, null));
    }

    @Override // defpackage.InterfaceC14091l
    public byte[] crashlytics() {
        C1438l c1438l;
        if (this.f23764l && (c1438l = (C1438l) this.f23767l) != null) {
            return ((C15295l) this.f23763l).billing(c1438l);
        }
        C8339l.smaato("Ed25519Signer not initialised for signature generation.");
        return null;
    }

    @Override // defpackage.InterfaceC2053l
    public void firebase() {
        SparseArray sparseArray = (SparseArray) this.f23766l;
        ((InterfaceC2053l) this.f23763l).firebase();
        if (this.f23764l) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((C2285l) sparseArray.valueAt(i)).subs = true;
            }
        }
    }

    @Override // defpackage.InterfaceC12184l
    public String getAlgorithmName() {
        return ((C4998l) this.f23763l).f10232l.getAlgorithmName().concat("/RFC3211Wrap");
    }

    @Override // defpackage.InterfaceC14091l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        int i = this.f23765l;
        this.f23764l = z;
        switch (i) {
            case 2:
                if (interfaceC9719l instanceof C6114l) {
                    interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
                }
                if (z) {
                    this.f23767l = (C1438l) interfaceC9719l;
                    this.f23766l = null;
                } else {
                    this.f23767l = null;
                    this.f23766l = (C6254l) interfaceC9719l;
                }
                if (!(interfaceC9719l instanceof EnumC2441l)) {
                    AbstractC8776l.yandex();
                    ((C15295l) this.f23763l).reset();
                } else {
                    C8339l.metrica("params should not be CryptoServicePurpose");
                }
                break;
            default:
                if (!(interfaceC9719l instanceof C6114l)) {
                    if (z) {
                        this.f23766l = AbstractC8776l.loadAd();
                    }
                    if (interfaceC9719l instanceof C0272l) {
                        this.f23767l = (C0272l) interfaceC9719l;
                    }
                } else {
                    C6114l c6114l = (C6114l) interfaceC9719l;
                    this.f23766l = c6114l.f12904l;
                    InterfaceC9719l interfaceC9719l2 = c6114l.f12903l;
                    if (interfaceC9719l2 instanceof C0272l) {
                        this.f23767l = (C0272l) interfaceC9719l2;
                    }
                }
                C8339l.metrica("RFC3211Wrap requires an IV");
                break;
        }
    }

    public synchronized boolean isPro() {
        Boolean bool;
        try {
            subs();
            bool = (Boolean) this.f23767l;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f23766l).yandex.admob();
    }

    public void isVip(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC16301l((Object) this, (Object) runnable, false, 24));
        } catch (RejectedExecutionException unused) {
            advert();
        }
    }

    public C15263l license(Function1 function1) {
        Map mapSingletonMap;
        Object obj;
        Map mapSingletonMap2;
        synchronized (((C6096l) this.f23763l)) {
            if (!((Map) this.f23766l).containsKey(function1)) {
                Map map = (Map) this.f23766l;
                Boolean bool = Boolean.FALSE;
                if (map.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(function1, bool);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(function1, bool);
                    mapSingletonMap = linkedHashMap;
                }
                this.f23766l = mapSingletonMap;
                Unit unit = Unit.INSTANCE;
                while (true) {
                    synchronized (((C6096l) this.f23763l)) {
                        obj = this.f23767l;
                    }
                    function1.invoke(obj);
                    synchronized (((C6096l) this.f23763l)) {
                        if (((Map) this.f23766l).containsKey(function1)) {
                            if (obj == this.f23767l) {
                                Map map2 = (Map) this.f23766l;
                                Boolean bool2 = Boolean.TRUE;
                                if (map2.isEmpty()) {
                                    mapSingletonMap2 = Collections.singletonMap(function1, bool2);
                                } else {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                    linkedHashMap2.put(function1, bool2);
                                    mapSingletonMap2 = linkedHashMap2;
                                }
                                this.f23766l = mapSingletonMap2;
                            } else {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
        }
        return new C15263l(this, function1, 10);
    }

    @Override // defpackage.InterfaceC14091l
    public boolean loadAd(byte[] bArr) {
        C6254l c6254l;
        if (!this.f23764l && (c6254l = (C6254l) this.f23766l) != null) {
            return ((C15295l) this.f23763l).isVip(c6254l, bArr);
        }
        C8339l.smaato("Ed25519Signer not initialised for verification");
        return false;
    }

    public Boolean metrica() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C14184l c14184l = ((FirebaseMessaging) this.f23766l).yandex;
        c14184l.yandex();
        Context context = c14184l.yandex;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public C14025l mopub(int i) {
        C14025l c14025l;
        C5613l c5613l = (C5613l) this.f23766l;
        synchronized (c5613l.f11920l) {
            if (this.f23764l) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f23767l)[i] = true;
            Object obj = ((C7976l) this.f23763l).amazon.get(i);
            AbstractC17824l.firebase(c5613l.f11924l, (C14025l) obj);
            c14025l = (C14025l) obj;
        }
        return c14025l;
    }

    public String pro() {
        if (!this.f23764l) {
            this.f23764l = true;
            C16386l c16386l = (C16386l) this.f23766l;
            this.f23767l = c16386l.m4180l().getString((String) this.f23763l, null);
        }
        return (String) this.f23767l;
    }

    public C6150l purchase(UUID uuid, C3584l c3584l) throws C3240l {
        String str;
        String str2 = c3584l.loadAd;
        if (this.f23764l || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f23767l;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            AbstractC12442l.metrica(uri, "The uri must be set.");
            throw new C3240l(new C2432l(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, C15333l.f29966l, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = AbstractC17252l.billing;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = AbstractC17252l.amazon.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f23766l)) {
            map2.putAll((HashMap) this.f23766l);
        }
        return AbstractC16670l.billing(((C5601l) this.f23763l).pro(), str2, c3584l.yandex, map2);
    }

    public boolean remoteconfig(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f23763l;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.f23767l;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.f23764l = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean smaato() {
        boolean z;
        synchronized (this.f23763l) {
            z = this.f23764l;
        }
        return z;
    }

    @Override // defpackage.InterfaceC2053l
    public InterfaceC8979l startapp(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.f23766l;
        InterfaceC2053l interfaceC2053l = (InterfaceC2053l) this.f23763l;
        if (i2 != 3 && i2 != 5) {
            this.f23764l = true;
        }
        if (i2 != 3) {
            return interfaceC2053l.startapp(i, i2);
        }
        C2285l c2285l = (C2285l) sparseArray.get(i);
        if (c2285l != null) {
            return c2285l;
        }
        C2285l c2285l2 = new C2285l(interfaceC2053l.startapp(i, i2), (InterfaceC5304l) this.f23767l);
        sparseArray.put(i, c2285l2);
        return c2285l2;
    }

    public synchronized void subs() {
        try {
            if (this.f23764l) {
                return;
            }
            Boolean boolMetrica = metrica();
            this.f23767l = boolMetrica;
            if (boolMetrica == null) {
                C8876l c8876l = new C8876l(29);
                C2825l c2825l = (C2825l) ((InterfaceC14242l) this.f23763l);
                c2825l.yandex(c2825l.crashlytics, c8876l);
            }
            this.f23764l = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void subscription(Object obj) {
        synchronized (((C6096l) this.f23763l)) {
            this.f23767l = obj;
            if (this.f23764l) {
                return;
            }
            this.f23764l = true;
            Unit unit = Unit.INSTANCE;
            yandex(this);
        }
    }

    @Override // defpackage.InterfaceC2053l
    public void tapsense(InterfaceC12703l interfaceC12703l) {
        ((InterfaceC2053l) this.f23763l).tapsense(interfaceC12703l);
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] unwrap(byte[] bArr, int i, int i2) throws C10352l {
        C4998l c4998l = (C4998l) this.f23763l;
        if (this.f23764l) {
            C8339l.smaato("not set for unwrapping");
            return null;
        }
        int iLicense = c4998l.f10232l.license();
        if (i2 < iLicense * 2) {
            C11467l.remoteconfig("input too short");
            return null;
        }
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[iLicense];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        System.arraycopy(bArr, 0, bArr3, 0, iLicense);
        c4998l.init(false, new C0272l(((C0272l) this.f23767l).f1272l, bArr3, 0, iLicense));
        for (int i3 = iLicense; i3 < i2; i3 += iLicense) {
            c4998l.tapsense(i3, i3, bArr2, bArr2);
        }
        System.arraycopy(bArr2, i2 - iLicense, bArr3, 0, iLicense);
        c4998l.init(false, new C0272l(((C0272l) this.f23767l).f1272l, bArr3, 0, iLicense));
        c4998l.tapsense(0, 0, bArr2, bArr2);
        c4998l.init(false, (C0272l) this.f23767l);
        for (int i4 = 0; i4 < i2; i4 += iLicense) {
            c4998l.tapsense(i4, i4, bArr2, bArr2);
        }
        int i5 = bArr2[0] & 255;
        int i6 = i2 - 4;
        boolean z = i5 > i6;
        byte[] bArr4 = z ? new byte[i6] : new byte[i5];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i7 = 0;
        int i8 = 0;
        while (i7 != 3) {
            int i9 = i7 + 1;
            i8 |= bArr2[i7 + 4] ^ ((byte) (~bArr2[i9]));
            i7 = i9;
        }
        Arrays.fill(bArr2, (byte) 0);
        if (!(i8 != 0) && !z) {
            return bArr4;
        }
        C11467l.remoteconfig("wrapped key corrupted");
        return null;
    }

    @Override // defpackage.InterfaceC14091l
    public void update(byte b) throws IOException {
        ((C15295l) this.f23763l).write(b);
    }

    public boolean vip(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f23763l;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.f23767l;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.f23764l = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] wrap(byte[] bArr, int i, int i2) {
        C4998l c4998l = (C4998l) this.f23763l;
        if (!this.f23764l) {
            C8339l.smaato("not set for wrapping");
            return null;
        }
        if (i2 > 255 || i2 < 0) {
            C8339l.metrica("input must be from 0 to 255 bytes");
            return null;
        }
        c4998l.init(true, (C0272l) this.f23767l);
        int iLicense = c4998l.f10232l.license();
        int i3 = i2 + 4;
        int i4 = iLicense * 2;
        if (i3 >= i4) {
            i4 = i3 % iLicense == 0 ? i3 : ((i3 / iLicense) + 1) * iLicense;
        }
        byte[] bArr2 = new byte[i4];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 4, i2);
        int length = bArr2.length - i3;
        byte[] bArr3 = new byte[length];
        ((SecureRandom) this.f23766l).nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i3, length);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i5 = 0; i5 < bArr2.length; i5 += iLicense) {
            c4998l.tapsense(i5, i5, bArr2, bArr2);
        }
        for (int i6 = 0; i6 < bArr2.length; i6 += iLicense) {
            c4998l.tapsense(i6, i6, bArr2, bArr2);
        }
        return bArr2;
    }

    @Override // defpackage.InterfaceC14091l
    public void update(byte[] bArr, int i, int i2) throws IOException {
        ((C15295l) this.f23763l).write(bArr, i, i2);
    }

    public C11919l(InterfaceC10952l interfaceC10952l) {
        this.f23765l = 9;
        this.f23763l = new C4998l(interfaceC10952l);
    }

    public C11919l(C3224l c3224l, C1062l c1062l, C12648l c12648l, boolean z) {
        this.f23765l = 13;
        this.f23763l = c1062l;
        this.f23767l = c12648l;
        this.f23764l = z;
        this.f23766l = c3224l;
    }

    public C11919l(C16386l c16386l, String str) {
        this.f23765l = 14;
        this.f23766l = c16386l;
        AbstractC1051l.billing(str);
        this.f23763l = str;
    }

    public C11919l(Object obj) {
        this.f23765l = 6;
        this.f23763l = new C6096l(5);
        this.f23767l = obj;
        this.f23766l = C14054l.f27396l;
    }

    public C11919l(InterfaceC2053l interfaceC2053l, InterfaceC5304l interfaceC5304l) {
        this.f23765l = 10;
        this.f23763l = interfaceC2053l;
        this.f23767l = interfaceC5304l;
        this.f23766l = new SparseArray();
    }

    public C11919l(Context context, Looper looper, Looper looper2, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, C18527l c18527l) {
        this.f23765l = 0;
        this.f23763l = context.getApplicationContext();
        this.f23766l = c18527l.yandex(looper, null);
        this.f23767l = new C1117l(this, c18527l.yandex(looper2, null), surfaceHolderCallbackC18330l);
    }

    public C11919l(String str, boolean z, C5601l c5601l) {
        this.f23765l = 4;
        AbstractC12442l.admob((z && TextUtils.isEmpty(str)) ? false : true);
        this.f23763l = c5601l;
        this.f23767l = str;
        this.f23764l = z;
        this.f23766l = new HashMap();
    }

    public C11919l(C6472l c6472l, boolean z) {
        this.f23765l = 12;
        this.f23766l = c6472l;
        this.f23767l = new AtomicReference(null);
        this.f23764l = z;
        this.f23763l = new AtomicMarkableReference(new C11787l(z ? 8192 : 1024), false);
    }

    public C11919l(C10554l c10554l, C2768l c2768l, InterfaceC1160l interfaceC1160l) {
        this.f23765l = 8;
        this.f23763l = c10554l;
        this.f23767l = c2768l;
        this.f23766l = interfaceC1160l;
        this.f23764l = true;
    }

    public C11919l(int i) {
        this.f23765l = 7;
        this.f23763l = new ReentrantLock();
        this.f23767l = new long[i];
        this.f23766l = new boolean[i];
    }

    public C11919l(C5613l c5613l, C7976l c7976l) {
        this.f23765l = 1;
        this.f23766l = c5613l;
        this.f23763l = c7976l;
        this.f23767l = new boolean[2];
    }

    public C11919l(FirebaseMessaging firebaseMessaging, InterfaceC14242l interfaceC14242l) {
        this.f23765l = 3;
        this.f23766l = firebaseMessaging;
        this.f23763l = interfaceC14242l;
    }
}
