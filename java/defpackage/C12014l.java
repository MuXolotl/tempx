package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٞ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C12014l implements InterfaceC9474l, InterfaceC6060l, InterfaceC14209l, InterfaceC10466l, InterfaceC7373l, InterfaceC17215l, InterfaceC15930l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C16543l f23937l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C16543l f23938l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C12014l f23939l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f23940l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f23941l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23942l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f23943l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f23944l;

    static {
        Boolean bool = Boolean.FALSE;
        int i = 11;
        f23937l = new C16543l(i, bool);
        f23938l = new C16543l(i, bool);
    }

    public C12014l(Typeface typeface, C3746l c3746l) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f23942l = 18;
        this.f23943l = typeface;
        this.f23941l = c3746l;
        this.f23944l = new C11886l(1024);
        int iYandex = c3746l.yandex(6);
        if (iYandex != 0) {
            int i5 = iYandex + c3746l.f31319l;
            i = ((ByteBuffer) c3746l.f31320l).getInt(((ByteBuffer) c3746l.f31320l).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f23940l = new char[i * 2];
        int iYandex2 = c3746l.yandex(6);
        if (iYandex2 != 0) {
            int i6 = iYandex2 + c3746l.f31319l;
            i2 = ((ByteBuffer) c3746l.f31320l).getInt(((ByteBuffer) c3746l.f31320l).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C2049l c2049l = new C2049l(this, i7);
            C0680l c0680lLoadAd = c2049l.loadAd();
            int iYandex3 = c0680lLoadAd.yandex(4);
            Character.toChars(iYandex3 != 0 ? ((ByteBuffer) c0680lLoadAd.f31320l).getInt(iYandex3 + c0680lLoadAd.f31319l) : 0, (char[]) this.f23940l, i7 * 2);
            C0680l c0680lLoadAd2 = c2049l.loadAd();
            int iYandex4 = c0680lLoadAd2.yandex(16);
            if (iYandex4 != 0) {
                int i8 = iYandex4 + c0680lLoadAd2.f31319l;
                i3 = ((ByteBuffer) c0680lLoadAd2.f31320l).getInt(((ByteBuffer) c0680lLoadAd2.f31320l).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC5641l.loadAd(i3 > 0, "invalid metadata codepoint length");
            C11886l c11886l = (C11886l) this.f23944l;
            C0680l c0680lLoadAd3 = c2049l.loadAd();
            int iYandex5 = c0680lLoadAd3.yandex(16);
            if (iYandex5 != 0) {
                int i9 = iYandex5 + c0680lLoadAd3.f31319l;
                i4 = ((ByteBuffer) c0680lLoadAd3.f31320l).getInt(((ByteBuffer) c0680lLoadAd3.f31320l).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c11886l.yandex(c2049l, 0, i4 - 1);
        }
    }

    public static synchronized C12014l ad() {
        try {
            if (f23939l == null) {
                f23939l = new C12014l(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23939l;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static void m3297case(C12014l c12014l, RunnableC11777l runnableC11777l, C17778l c17778l, RunnableC11777l runnableC11777l2, int i) {
        C16543l c16543l;
        RunnableC11777l runnableC11777l3;
        if ((i & 1) != 0) {
            runnableC11777l = null;
        }
        if ((i & 2) != 0) {
            c17778l = null;
        }
        if ((i & 4) != 0) {
            runnableC11777l2 = null;
        }
        c12014l.getClass();
        TimeZone timeZone = AbstractC11432l.yandex;
        boolean zIsShutdown = ((ThreadPoolExecutor) c12014l.smaato()).isShutdown();
        synchronized (c12014l) {
            if (c17778l != null) {
                try {
                    if (!((ArrayDeque) c12014l.f23944l).remove(c17778l)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC11777l2 != null) {
                runnableC11777l2.f23571l.decrementAndGet();
                if (!((ArrayDeque) c12014l.f23940l).remove(runnableC11777l2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC11777l != null) {
                ((ArrayDeque) c12014l.f23943l).add(runnableC11777l);
                C17778l c17778l2 = runnableC11777l.f23570l;
                if (!c17778l2.f34619l) {
                    String str = c17778l2.f34624l.yandex.amazon;
                    Iterator it = ((ArrayDeque) c12014l.f23940l).iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator it2 = ((ArrayDeque) c12014l.f23943l).iterator();
                            do {
                                if (!it2.hasNext()) {
                                    runnableC11777l3 = null;
                                    break;
                                }
                                runnableC11777l3 = (RunnableC11777l) it2.next();
                            } while (!AbstractC8576l.yandex(runnableC11777l3.f23570l.f34624l.yandex.amazon, str));
                        } else {
                            runnableC11777l3 = (RunnableC11777l) it.next();
                        }
                    } while (!AbstractC8576l.yandex(runnableC11777l3.f23570l.f34624l.yandex.amazon, str));
                    if (runnableC11777l3 != null) {
                        runnableC11777l.f23571l = runnableC11777l3.f23571l;
                    }
                }
            }
            if ((c17778l != null || runnableC11777l2 != null) && (zIsShutdown || ((ArrayDeque) c12014l.f23940l).isEmpty())) {
                ((ArrayDeque) c12014l.f23944l).isEmpty();
            }
            int i2 = 10;
            if (zIsShutdown) {
                List listM4213const = AbstractC16901l.m4213const((ArrayDeque) c12014l.f23943l);
                ((ArrayDeque) c12014l.f23943l).clear();
                c16543l = new C16543l(i2, listM4213const);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((ArrayDeque) c12014l.f23943l).iterator();
                while (it3.hasNext()) {
                    RunnableC11777l runnableC11777l4 = (RunnableC11777l) it3.next();
                    if (((ArrayDeque) c12014l.f23940l).size() >= 64) {
                        break;
                    }
                    if (runnableC11777l4.f23571l.get() < 5) {
                        it3.remove();
                        runnableC11777l4.f23571l.incrementAndGet();
                        arrayList.add(runnableC11777l4);
                        ((ArrayDeque) c12014l.f23940l).add(runnableC11777l4);
                    }
                }
                c16543l = new C16543l(i2, arrayList);
            }
        }
        int size = ((List) c16543l.f32482l).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            RunnableC11777l runnableC11777l5 = (RunnableC11777l) ((List) c16543l.f32482l).get(i3);
            if (runnableC11777l5 == runnableC11777l) {
                z = false;
            } else {
                runnableC11777l5.f23570l.f34630l.getClass();
            }
            if (zIsShutdown) {
                runnableC11777l5.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                runnableC11777l5.f23570l.firebase(interruptedIOException);
                runnableC11777l5.f23572l.mo1671throw(interruptedIOException);
            } else {
                ExecutorService executorServiceSmaato = c12014l.smaato();
                C17778l c17778l3 = runnableC11777l5.f23570l;
                TimeZone timeZone2 = AbstractC11432l.yandex;
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceSmaato).execute(runnableC11777l5);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        runnableC11777l5.f23570l.firebase(interruptedIOException2);
                        runnableC11777l5.f23572l.mo1671throw(interruptedIOException2);
                        c17778l3.f34625l.yandex.remoteconfig(runnableC11777l5);
                    }
                } catch (Throwable th2) {
                    c17778l3.f34625l.yandex.remoteconfig(runnableC11777l5);
                    throw th2;
                }
            }
        }
        if (!z || runnableC11777l == null) {
            return;
        }
        runnableC11777l.f23570l.f34630l.getClass();
    }

    public AbstractC1186l Signature() {
        AbstractC1186l abstractC1186lSignature;
        synchronized (this.f23941l) {
            abstractC1186lSignature = AbstractC1186l.Signature(((C11154l) this.f23940l).values());
        }
        return abstractC1186lSignature;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract */
    public void mo1662abstract() {
        switch (this.f23942l) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f23940l;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C18595l) this.f23944l).f36316l).put((C12876l) this.f23941l, arrayList);
                }
                break;
            default:
                ((C12714l) this.f23940l).mo1662abstract();
                ((ArrayList) ((C10038l) this.f23944l).f20463l).add(new C18438l((InterfaceC1910l) AbstractC16901l.m4208abstract((ArrayList) this.f23943l)));
                break;
        }
    }

    public C8363l adcel(AbstractC12048l abstractC12048l) {
        ArrayList arrayList = (ArrayList) this.f23944l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8363l c8363l = (C8363l) arrayList.get(i);
            if (c8363l != null && c8363l.loadAd == abstractC12048l) {
                return c8363l;
            }
        }
        C8363l c8363l2 = new C8363l((Context) this.f23940l, abstractC12048l);
        arrayList.add(c8363l2);
        return c8363l2;
    }

    public void admob(C6499l c6499l, int i, InterfaceC1374l interfaceC1374l) {
        synchronized (this.f23941l) {
            try {
                C6694l c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
                if (c6694l != null) {
                    C16616l c16616l = c6694l.mopub;
                    c16616l.getClass();
                    C6921l c6921l = new C6921l(5);
                    c6921l.crashlytics(c16616l.yandex);
                    c6921l.loadAd(i);
                    c6694l.mopub = new C16616l(c6921l.purchase());
                    c6694l.crashlytics.add(interfaceC1374l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C16616l ads(C6499l c6499l) {
        synchronized (this.f23941l) {
            try {
                C6694l c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
                if (c6694l == null) {
                    return null;
                }
                return c6694l.purchase;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C14723l advert(C6499l c6499l) {
        synchronized (this.f23941l) {
            try {
                return ((C6694l) ((C11154l) this.f23944l).get(c6499l)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7373l
    public void amazon(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    public boolean applovin(Context context) {
        if (((Boolean) this.f23944l) == null) {
            this.f23944l = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f23940l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f23944l).booleanValue();
    }

    public boolean appmetrica(Context context) {
        if (((Boolean) this.f23940l) == null) {
            this.f23940l = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f23940l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f23940l).booleanValue();
    }

    @Override // defpackage.InterfaceC6060l
    public InterfaceC14209l billing(C3624l c3624l, C7155l c7155l) {
        return ((C1424l) ((C18595l) this.f23944l).f36317l).m956protected(c3624l, c7155l, (ArrayList) this.f23940l);
    }

    /* JADX INFO: renamed from: catch */
    public void mo1552catch() {
        C14932l c14932l = new C14932l(this, (ServiceC16415l) this.f23943l);
        this.f23940l = c14932l;
        c14932l.onCreate();
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m3298class(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f23941l = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m3299continue(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f23940l = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC7373l
    public boolean crashlytics() {
        return true;
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: default */
    public ListenableFuture mo1118default(C3852l c3852l) {
        byte[] bArr = c3852l.firebase;
        if (bArr != null) {
            return mo1119try(bArr);
        }
        Uri uri = c3852l.vip;
        if (uri == null) {
            return null;
        }
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f23940l;
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC16840l.purchase(2, ExecutorC6708l.f14063l, interfaceC2262l, new C16567l(uri, this, null));
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public boolean m3300else(AbstractC12048l abstractC12048l, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f23941l;
        C8363l c8363lAdcel = adcel(abstractC12048l);
        C5128l c5128l = (C5128l) this.f23943l;
        Menu menuC0062l = (Menu) c5128l.get(menu);
        if (menuC0062l == null) {
            menuC0062l = new MenuC0062l((Context) this.f23940l, (MenuC4984l) menu);
            c5128l.put(menu, menuC0062l);
        }
        return callback.onCreateActionMode(c8363lAdcel, menuC0062l);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public boolean m3301extends(C6499l c6499l, int i) {
        C6694l c6694l;
        synchronized (this.f23941l) {
            c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
        }
        return c6694l != null && c6694l.amazon.yandex(i);
    }

    public C11232l firebase() throws GeneralSecurityException {
        C15026l c15026l = (C15026l) this.f23941l;
        if (c15026l == null) {
            C18262l.ads("HPKE KEM parameter is not set");
            return null;
        }
        C6636l c6636l = (C6636l) this.f23940l;
        if (c6636l == null) {
            C18262l.ads("HPKE KDF parameter is not set");
            return null;
        }
        if (((C2204l) this.f23944l) == null) {
            C18262l.ads("HPKE AEAD parameter is not set");
            return null;
        }
        if (((C9676l) this.f23943l) == null) {
            C18262l.ads("HPKE variant is not set");
            return null;
        }
        if (c15026l != C15026l.admob || c6636l.equals(C6636l.amazon)) {
            return new C11232l((C15026l) this.f23941l, (C6636l) this.f23940l, (C2204l) this.f23944l, (C9676l) this.f23943l);
        }
        C18262l.ads("Only SHA256 KDF is supported with X-Wing KEM");
        return null;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean m3302for(C6499l c6499l, C12417l c12417l) {
        C6694l c6694l;
        synchronized (this.f23941l) {
            c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
        }
        if (c6694l == null) {
            return false;
        }
        AbstractC8481l abstractC8481l = c6694l.amazon.yandex;
        c12417l.getClass();
        return abstractC8481l.contains(c12417l) || C14869l.vip(c12417l.loadAd);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C10443l((C14184l) ((C14461l) this.f23941l).f28328l, (C8137l) ((InterfaceC15897l) this.f23940l).get(), (InterfaceC12932l) ((InterfaceC15897l) this.f23944l).get(), (C7909l) ((InterfaceC2661l) this.f23943l).get());
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m3303interface() {
        this.f23944l = 16;
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    public C1908l isVip(C6499l c6499l) {
        synchronized (this.f23941l) {
            try {
                return ((C6694l) ((C11154l) this.f23944l).get(c6499l)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6499l license(Object obj) {
        C6499l c6499l;
        synchronized (this.f23941l) {
            c6499l = (C6499l) ((C11154l) this.f23940l).get(obj);
        }
        return c6499l;
    }

    @Override // defpackage.InterfaceC7373l
    public BigInteger loadAd() {
        byte[] bArr = (byte[]) this.f23940l;
        byte[] bArr2 = (byte[]) this.f23944l;
        C0361l c0361l = (C0361l) this.f23941l;
        int iMopub = AbstractC16784l.mopub((BigInteger) this.f23943l);
        byte[] bArr3 = new byte[iMopub];
        while (true) {
            int i = 0;
            while (i < iMopub) {
                c0361l.update(bArr2, 0, bArr2.length);
                c0361l.doFinal(bArr2, 0);
                int iMin = Math.min(iMopub - i, bArr2.length);
                System.arraycopy(bArr2, 0, bArr3, i, iMin);
                i += iMin;
            }
            int i2 = iMopub * 8;
            int iBitLength = ((BigInteger) this.f23943l).bitLength();
            BigInteger bigInteger = AbstractC16784l.yandex;
            BigInteger bigInteger2 = new BigInteger(1, bArr3);
            if (i2 > iBitLength) {
                bigInteger2 = bigInteger2.shiftRight(i2 - iBitLength);
            }
            if (bigInteger2.signum() > 0 && bigInteger2.compareTo((BigInteger) this.f23943l) < 0) {
                return bigInteger2;
            }
            c0361l.update(bArr2, 0, bArr2.length);
            c0361l.update((byte) 0);
            c0361l.doFinal(bArr, 0);
            c0361l.init(new C13886l(bArr));
            c0361l.update(bArr2, 0, bArr2.length);
            c0361l.doFinal(bArr2, 0);
        }
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
        ((C12714l) this.f23941l).mo1664l(c3498l, c3624l, c3498l2);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo1665l(C3498l c3498l, Object obj) {
        ((C12714l) this.f23941l).mo1665l(c3498l, obj);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
        ((C12714l) this.f23941l).mo1666l(c3498l, c14700l);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        return ((C12714l) this.f23941l).mo1667l(c3498l);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        return ((C12714l) this.f23941l).mo1668l(c3624l, c3498l);
    }

    public void metrica(final C6499l c6499l) {
        synchronized (this.f23941l) {
            try {
                C6694l c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
                if (c6694l == null) {
                    return;
                }
                final C16616l c16616l = c6694l.mopub;
                c6694l.mopub = C16616l.loadAd;
                c6694l.crashlytics.add(new InterfaceC1374l(c6499l, c16616l) { // from class: lؘٖٗ
                    public final /* synthetic */ C6499l loadAd;

                    @Override // defpackage.InterfaceC1374l
                    public final ListenableFuture run() {
                        C3726l c3726l = (C3726l) ((WeakReference) this.yandex.f23943l).get();
                        if (c3726l != null) {
                            c3726l.signatures(this.loadAd);
                        }
                        return C5113l.f11111l;
                    }
                });
                if (c6694l.billing) {
                    return;
                }
                c6694l.billing = true;
                vip(c6694l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void mopub(Object obj, C6499l c6499l, C14023l c14023l, C16616l c16616l) {
        synchronized (this.f23941l) {
            try {
                C6499l c6499lLicense = license(obj);
                if (c6499lLicense == null) {
                    ((C11154l) this.f23940l).put(obj, c6499l);
                    ((C11154l) this.f23944l).put(c6499l, new C6694l(obj, new C13904l(4), c14023l, c16616l));
                } else {
                    C6694l c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499lLicense);
                    c6694l.getClass();
                    c6694l.amazon = c14023l;
                    c6694l.purchase = c16616l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean m3304native(C6499l c6499l, int i) {
        C6694l c6694l;
        synchronized (this.f23941l) {
            c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
        }
        C3726l c3726l = (C3726l) ((WeakReference) this.f23943l).get();
        return c6694l != null && c6694l.purchase.yandex(i) && c3726l != null && c3726l.tapsense.vip().yandex(i);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        AbstractC2249l abstractC2249l4;
        if (((AbstractC2249l) this.f23943l) == null) {
            this.f23943l = abstractC2249l3.crashlytics();
        }
        AbstractC2249l abstractC2249l5 = (AbstractC2249l) this.f23943l;
        if (abstractC2249l5 == null) {
            abstractC2249l5 = null;
        }
        int iLoadAd = abstractC2249l5.loadAd();
        int i = 0;
        while (true) {
            abstractC2249l4 = (AbstractC2249l) this.f23943l;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l4 == null) {
                abstractC2249l4 = null;
            }
            abstractC2249l4.purchase(i, ((InterfaceC13221l) this.f23941l).get(i).amazon(abstractC2249l.yandex(i), abstractC2249l2.yandex(i), abstractC2249l3.yandex(i)));
            i++;
        }
        if (abstractC2249l4 == null) {
            return null;
        }
        return abstractC2249l4;
    }

    public C13904l premium(C6499l c6499l) {
        C6694l c6694l;
        synchronized (this.f23941l) {
            c6694l = (C6694l) ((C11154l) this.f23944l).get(c6499l);
        }
        if (c6694l != null) {
            return c6694l.loadAd;
        }
        return null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean m3305private(C9522l c9522l) {
        if (((C9522l) this.f23940l).equals(c9522l)) {
            return true;
        }
        C12014l c12014l = (C12014l) this.f23941l;
        return c12014l != null ? c12014l.m3305private(c9522l) : false;
    }

    public C16701l pro() {
        C7996l c7996l = ((ServiceC16415l) this.f23943l).f32114l;
        if (c7996l != null) {
            return c7996l.amazon;
        }
        C8339l.smaato("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    }

    @Override // defpackage.InterfaceC7373l
    public void purchase(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f23940l;
        byte[] bArr3 = (byte[]) this.f23944l;
        C0361l c0361l = (C0361l) this.f23941l;
        this.f23943l = bigInteger;
        int length = bArr.length * 8;
        int iBitLength = bigInteger.bitLength();
        BigInteger bigInteger3 = AbstractC16784l.yandex;
        BigInteger bigInteger4 = new BigInteger(1, bArr);
        if (length > iBitLength) {
            bigInteger4 = bigInteger4.shiftRight(length - iBitLength);
        }
        if (bigInteger4.compareTo(bigInteger) >= 0) {
            bigInteger4 = bigInteger4.subtract(bigInteger);
        }
        int iMopub = AbstractC16784l.mopub(bigInteger);
        byte[] bArrYandex = AbstractC16784l.yandex(iMopub, bigInteger2);
        byte[] bArrYandex2 = AbstractC16784l.yandex(iMopub, bigInteger4);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr3, (byte) 1);
        c0361l.init(new C13886l(bArr2));
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.update((byte) 0);
        c0361l.update(bArrYandex, 0, bArrYandex.length);
        c0361l.update(bArrYandex2, 0, bArrYandex2.length);
        c0361l.doFinal(bArr2, 0);
        c0361l.init(new C13886l(bArr2, 0, bArr2.length));
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.doFinal(bArr3, 0);
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.update((byte) 1);
        c0361l.update(bArrYandex, 0, bArrYandex.length);
        c0361l.update(bArrYandex2, 0, bArrYandex2.length);
        c0361l.doFinal(bArr2, 0);
        c0361l.init(new C13886l(bArr2, 0, bArr2.length));
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.doFinal(bArr3, 0);
    }

    public void remoteconfig(RunnableC11777l runnableC11777l) {
        m3297case(this, null, null, runnableC11777l, 3);
    }

    public synchronized ExecutorService smaato() {
        try {
            if (((ThreadPoolExecutor) this.f23941l) == null) {
                this.f23941l = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC10406l(AbstractC11432l.loadAd + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ThreadPoolExecutor) this.f23941l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    @Override // defpackage.InterfaceC17215l
    public void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        int[] iArr;
        C17456l c17456l;
        int i3;
        int i4;
        int iSignatures;
        int i5;
        int i6;
        int iAppmetrica;
        C11731l c11731l = (C11731l) this.f23944l;
        C13143l c13143l = (C13143l) this.f23940l;
        C13143l c13143l2 = (C13143l) this.f23941l;
        c13143l2.m3565private(i + i2, bArr);
        c13143l2.m3562for(i);
        if (((Inflater) this.f23943l) == null) {
            this.f23943l = new Inflater();
        }
        if (AbstractC15323l.m3959case(c13143l2, c13143l, (Inflater) this.f23943l)) {
            c13143l2.m3565private(c13143l.crashlytics, c13143l.yandex);
        }
        int i7 = 0;
        c11731l.amazon = 0;
        int[] iArr2 = c11731l.loadAd;
        C13143l c13143l3 = c11731l.yandex;
        c11731l.purchase = 0;
        c11731l.billing = 0;
        c11731l.mopub = 0;
        c11731l.admob = 0;
        c11731l.subs = 0;
        c13143l3.m3563native(0);
        c11731l.crashlytics = false;
        ArrayList arrayList = new ArrayList();
        while (c13143l2.yandex() >= 3) {
            int i8 = c13143l2.crashlytics;
            int iSignatures2 = c13143l2.signatures();
            int iM3567synchronized = c13143l2.m3567synchronized();
            int i9 = c13143l2.loadAd + iM3567synchronized;
            if (i9 > i8) {
                c13143l2.m3562for(i8);
                i3 = i7;
                iArr = iArr2;
                c17456l = null;
            } else {
                char c = 128;
                if (iSignatures2 != 128) {
                    switch (iSignatures2) {
                        case 20:
                            if (iM3567synchronized % 5 == 2) {
                                c13143l2.m3568throw(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iM3567synchronized / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iSignatures3 = c13143l2.signatures();
                                    char c2 = c;
                                    double dSignatures = c13143l2.signatures();
                                    double dSignatures2 = c13143l2.signatures() - 128;
                                    int[] iArr3 = iArr2;
                                    double dSignatures3 = c13143l2.signatures() - 128;
                                    iArr3[iSignatures3] = AbstractC15323l.isPro((int) ((dSignatures3 * 1.772d) + dSignatures), 0, 255) | (c13143l2.signatures() << 24) | (AbstractC15323l.isPro((int) ((1.402d * dSignatures2) + dSignatures), 0, 255) << 16) | (AbstractC15323l.isPro((int) ((dSignatures - (0.34414d * dSignatures3)) - (dSignatures2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                c11731l.crashlytics = true;
                            } else {
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iM3567synchronized >= 4) {
                                c13143l2.m3568throw(3);
                                int i12 = iM3567synchronized - 4;
                                if (((128 & c13143l2.signatures()) != 0 ? 1 : i7) == 0) {
                                    i5 = c13143l3.loadAd;
                                    i6 = c13143l3.crashlytics;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        c13143l2.firebase(i5, iMin, c13143l3.yandex);
                                        c13143l3.m3562for(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iAppmetrica = c13143l2.appmetrica()) >= 4) {
                                    c11731l.admob = c13143l2.m3567synchronized();
                                    c11731l.subs = c13143l2.m3567synchronized();
                                    c13143l3.m3563native(iAppmetrica - 4);
                                    i12 = iM3567synchronized - 11;
                                    i5 = c13143l3.loadAd;
                                    i6 = c13143l3.crashlytics;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        c13143l2.firebase(i5, iMin2, c13143l3.yandex);
                                        c13143l3.m3562for(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iM3567synchronized >= 19) {
                                c11731l.amazon = c13143l2.m3567synchronized();
                                c11731l.purchase = c13143l2.m3567synchronized();
                                c13143l2.m3568throw(11);
                                c11731l.billing = c13143l2.m3567synchronized();
                                c11731l.mopub = c13143l2.m3567synchronized();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    c17456l = null;
                } else {
                    iArr = iArr2;
                    if (c11731l.amazon == 0 || c11731l.purchase == 0 || c11731l.admob == 0 || c11731l.subs == 0 || (i4 = c13143l3.crashlytics) == 0 || c13143l3.loadAd != i4 || !c11731l.crashlytics) {
                        c17456l = null;
                    } else {
                        c13143l3.m3562for(0);
                        int i13 = c11731l.admob * c11731l.subs;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iSignatures4 = c13143l3.signatures();
                            if (iSignatures4 != 0) {
                                iSignatures = i14 + 1;
                                iArr4[i14] = iArr[iSignatures4];
                            } else {
                                int iSignatures5 = c13143l3.signatures();
                                if (iSignatures5 != 0) {
                                    iSignatures = ((iSignatures5 & 64) == 0 ? iSignatures5 & 63 : ((iSignatures5 & 63) << 8) | c13143l3.signatures()) + i14;
                                    Arrays.fill(iArr4, i14, iSignatures, (iSignatures5 & 128) == 0 ? iArr[0] : iArr[c13143l3.signatures()]);
                                }
                            }
                            i14 = iSignatures;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, c11731l.admob, c11731l.subs, Bitmap.Config.ARGB_8888);
                        float f = c11731l.billing;
                        float f2 = c11731l.amazon;
                        float f3 = f / f2;
                        float f4 = c11731l.mopub;
                        float f5 = c11731l.purchase;
                        c17456l = new C17456l(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, c11731l.admob / f2, c11731l.subs / f5, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
                    }
                    i3 = 0;
                    c11731l.amazon = 0;
                    c11731l.purchase = 0;
                    c11731l.billing = 0;
                    c11731l.mopub = 0;
                    c11731l.admob = 0;
                    c11731l.subs = 0;
                    c13143l3.m3563native(0);
                    c11731l.crashlytics = false;
                }
                c13143l2.m3562for(i9);
            }
            if (c17456l != null) {
                arrayList.add(c17456l);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        interfaceC18679l.accept(new C8755l(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public C12714l m3306static(int i, C3624l c3624l, C7155l c7155l) {
        C12876l c12876l = new C12876l(((C12876l) this.f23941l).yandex + '@' + i);
        C18595l c18595l = (C18595l) this.f23943l;
        HashMap map = (HashMap) c18595l.f36316l;
        List arrayList = (List) map.get(c12876l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(c12876l, arrayList);
        }
        return ((C1424l) c18595l.f36317l).m956protected(c3624l, c7155l, arrayList);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean m3307strictfp(C6499l c6499l) {
        boolean z;
        synchronized (this.f23941l) {
            z = ((C11154l) this.f23944l).get(c6499l) != null;
        }
        return z;
    }

    public C3281l subs() throws GeneralSecurityException {
        Integer num = (Integer) this.f23941l;
        if (num == null) {
            C18262l.ads("Key size is not set");
            return null;
        }
        if (((Integer) this.f23940l) == null) {
            C18262l.ads("IV size is not set");
            return null;
        }
        if (((C17927l) this.f23943l) == null) {
            C18262l.ads("Variant is not set");
            return null;
        }
        if (((Integer) this.f23944l) != null) {
            return new C3281l(num.intValue(), ((Integer) this.f23940l).intValue(), ((Integer) this.f23944l).intValue(), (C17927l) this.f23943l);
        }
        C18262l.ads("Tag size is not set");
        return null;
    }

    @Override // defpackage.InterfaceC15930l
    public AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        AbstractC2249l abstractC2249l4;
        if (((AbstractC2249l) this.f23944l) == null) {
            this.f23944l = abstractC2249l3.crashlytics();
        }
        AbstractC2249l abstractC2249l5 = (AbstractC2249l) this.f23944l;
        if (abstractC2249l5 == null) {
            abstractC2249l5 = null;
        }
        int iLoadAd = abstractC2249l5.loadAd();
        int i = 0;
        while (true) {
            abstractC2249l4 = (AbstractC2249l) this.f23944l;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l4 == null) {
                abstractC2249l4 = null;
            }
            abstractC2249l4.purchase(i, ((InterfaceC13221l) this.f23941l).get(i).crashlytics(abstractC2249l.yandex(i), abstractC2249l2.yandex(i), abstractC2249l3.yandex(i), j));
            i++;
        }
        if (abstractC2249l4 == null) {
            return null;
        }
        return abstractC2249l4;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m3308switch(C6499l c6499l) {
        synchronized (this.f23941l) {
            try {
                C6694l c6694l = (C6694l) ((C11154l) this.f23944l).remove(c6499l);
                if (c6694l == null) {
                    return;
                }
                ((C11154l) this.f23940l).remove(c6694l.yandex);
                c6694l.loadAd.admob();
                C3726l c3726l = (C3726l) ((WeakReference) this.f23943l).get();
                if (c3726l == null || c3726l.metrica()) {
                    return;
                }
                AbstractC15323l.m3966final(c3726l.smaato, new RunnableC7754l(c3726l, c6499l, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C3217l m3309synchronized(Object obj, String str, C7695l c7695l, C6921l c6921l) {
        C17326l c17326l = new C17326l();
        c17326l.f33637l = C5746l.f12138l;
        c17326l.f33636l = EnumC2771l.f6018l;
        C5138l c5138l = new C5138l((InterfaceC12356l) this.f23940l, c17326l);
        C10023l c10023l = new C10023l(c7695l);
        if (c6921l == null) {
            c6921l = new C6921l(4);
        }
        C6921l c6921l2 = c6921l;
        C17873l c17873l = new C17873l((C17873l) this.f23944l, true, 0);
        Function2 function2 = (Function2) this.f23943l;
        ((C4917l) this.f23941l).getClass();
        return new C3217l(obj, str, function2.invoke(obj, new C16793l(c5138l, c10023l, c6921l2, c17873l)), c17326l, c10023l, c6921l2, c17873l);
    }

    public InterfaceC17477l tapsense(C3624l c3624l, List list) {
        return (InterfaceC17477l) ((C0098l) this.f23943l).invoke(new C14459l(c3624l, list));
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public boolean m3310throw(AbstractC12048l abstractC12048l, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f23941l).onActionItemClicked(adcel(abstractC12048l), new MenuItemC12957l((Context) this.f23940l, (InterfaceMenuItemC5349l) menuItem));
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        AbstractC2249l abstractC2249l4;
        if (((AbstractC2249l) this.f23940l) == null) {
            this.f23940l = abstractC2249l.crashlytics();
        }
        AbstractC2249l abstractC2249l5 = (AbstractC2249l) this.f23940l;
        if (abstractC2249l5 == null) {
            abstractC2249l5 = null;
        }
        int iLoadAd = abstractC2249l5.loadAd();
        int i = 0;
        while (true) {
            abstractC2249l4 = (AbstractC2249l) this.f23940l;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l4 == null) {
                abstractC2249l4 = null;
            }
            abstractC2249l4.purchase(i, ((InterfaceC13221l) this.f23941l).get(i).purchase(abstractC2249l.yandex(i), abstractC2249l2.yandex(i), abstractC2249l3.yandex(i), j));
            i++;
        }
        if (abstractC2249l4 == null) {
            return null;
        }
        return abstractC2249l4;
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: try */
    public ListenableFuture mo1119try(byte[] bArr) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f23940l;
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC16840l.purchase(2, ExecutorC6708l.f14063l, interfaceC2262l, new C14951l(bArr, null, 12));
    }

    public void vip(C6694l c6694l) {
        C3726l c3726l = (C3726l) ((WeakReference) this.f23943l).get();
        if (c3726l == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            InterfaceC1374l interfaceC1374l = (InterfaceC1374l) c6694l.crashlytics.poll();
            if (interfaceC1374l == null) {
                c6694l.billing = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            C12014l c12014l = this;
            AbstractC15323l.m3966final(c3726l.smaato, new RunnableC12388l(c3726l, this.license(c6694l.yandex), new RunnableC0295l(c12014l, interfaceC1374l, atomicBoolean2, c6694l, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            this = c12014l;
        }
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        int iLoadAd = abstractC2249l.loadAd();
        long jMax = 0;
        for (int i = 0; i < iLoadAd; i++) {
            jMax = Math.max(jMax, ((InterfaceC13221l) this.f23941l).get(i).loadAd(abstractC2249l.yandex(i), abstractC2249l2.yandex(i), abstractC2249l3.yandex(i)));
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC15930l
    public /* synthetic */ boolean yandex() {
        return false;
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ void reset() {
    }

    public C12014l(InterfaceC16922l interfaceC16922l) {
        this.f23942l = 14;
        C0361l c0361l = new C0361l(interfaceC16922l);
        this.f23941l = c0361l;
        int i = c0361l.f1426l;
        this.f23944l = new byte[i];
        this.f23940l = new byte[i];
    }

    public /* synthetic */ C12014l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f23942l = i;
        this.f23941l = obj;
        this.f23940l = obj2;
        this.f23944l = obj3;
        this.f23943l = obj4;
    }

    public C12014l(C16412l c16412l, InterfaceC11865l interfaceC11865l) {
        this.f23942l = 19;
        this.f23941l = c16412l;
        this.f23940l = interfaceC11865l;
        this.f23944l = c16412l.loadAd(new C4409l(this, 0));
        this.f23943l = c16412l.loadAd(new C4409l(this, 1));
    }

    public C12014l(Context context, C18662l c18662l, C15406l c15406l) {
        this.f23942l = 1;
        this.f23941l = context;
        this.f23940l = c18662l;
        this.f23944l = c15406l;
        this.f23943l = new C8688l(new C13802l(9, this));
    }

    public C12014l(C3726l c3726l) {
        this.f23942l = 8;
        this.f23940l = new C11154l(0);
        this.f23944l = new C11154l(0);
        this.f23941l = new Object();
        this.f23943l = new WeakReference(c3726l);
    }

    public /* synthetic */ C12014l(int i, boolean z) {
        this.f23942l = i;
    }

    public C12014l(C18595l c18595l, C12876l c12876l) {
        this.f23942l = 2;
        this.f23943l = c18595l;
        this.f23942l = 2;
        this.f23944l = c18595l;
        this.f23941l = c12876l;
        this.f23940l = new ArrayList();
    }

    public C12014l(int i) {
        this.f23942l = i;
        switch (i) {
            case 11:
                this.f23943l = new ArrayDeque();
                this.f23940l = new ArrayDeque();
                this.f23944l = new ArrayDeque();
                break;
            case 20:
                this.f23941l = new C13143l();
                this.f23940l = new C13143l();
                this.f23944l = new C11731l();
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f23941l = new C11154l(0);
                this.f23940l = new SparseArray();
                this.f23944l = new C3994l((Object) null);
                this.f23943l = new C11154l(0);
                break;
            default:
                this.f23941l = null;
                this.f23940l = null;
                this.f23944l = null;
                this.f23943l = new ArrayDeque();
                break;
        }
    }

    public C12014l(InterfaceC15897l interfaceC15897l, C11969l c11969l, InterfaceC7042l interfaceC7042l) {
        this.f23942l = 6;
        this.f23941l = interfaceC15897l;
        this.f23940l = c11969l;
        this.f23944l = interfaceC7042l;
        this.f23943l = AbstractC0622l.amazon(new C5163l(this, null, 22));
    }

    public C12014l(Context context, ActionMode.Callback callback) {
        this.f23942l = 25;
        this.f23940l = context;
        this.f23941l = callback;
        this.f23944l = new ArrayList();
        this.f23943l = new C5128l(0);
    }

    public C12014l(ServiceC16415l serviceC16415l) {
        this.f23942l = 17;
        this.f23943l = serviceC16415l;
        this.f23941l = new ArrayList();
    }

    public C12014l(C12714l c12714l, C10038l c10038l, ArrayList arrayList) {
        this.f23942l = 5;
        this.f23940l = c12714l;
        this.f23944l = c10038l;
        this.f23943l = arrayList;
        this.f23941l = c12714l;
    }

    public C12014l(C11296l c11296l) {
        this.f23942l = 10;
        this.f23943l = c11296l;
        List list = c11296l.f22762l.f13776l;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC18719l.firebase((InterfaceC3588l) c11296l.f22763l.f15737l, ((C16400l) obj).f32097l), obj);
        }
        this.f23941l = linkedHashMap;
        C11296l c11296l2 = (C11296l) this.f23943l;
        this.f23940l = ((C16412l) ((C0511l) c11296l2.f22763l.f15738l).yandex).crashlytics(new C3768l(this, c11296l2, 6));
        C16412l c16412l = (C16412l) ((C0511l) ((C11296l) this.f23943l).f22763l.f15738l).yandex;
        C7646l c7646l = new C7646l(15, this);
        c16412l.getClass();
        this.f23944l = new C2278l(c16412l, c7646l);
    }

    public C12014l(long j, long j2, long j3) {
        this.f23942l = 26;
        this.f23941l = AbstractC8020l.smaato(new C14174l(j));
        this.f23940l = AbstractC8020l.smaato(new C1187l(j2));
        this.f23944l = AbstractC8020l.smaato(new C1187l(j3));
        this.f23943l = AbstractC8020l.smaato(new C1187l(j2));
    }

    public C12014l(InterfaceC13221l interfaceC13221l) {
        this.f23942l = 29;
        this.f23941l = interfaceC13221l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12014l(InterfaceC6269l interfaceC6269l) {
        this(new C14965l(interfaceC6269l));
        this.f23942l = 29;
    }

    public C12014l(C8750l c8750l, boolean[] zArr) {
        this.f23942l = 21;
        this.f23941l = c8750l;
        this.f23940l = zArr;
        int i = c8750l.yandex;
        this.f23944l = new boolean[i];
        this.f23943l = new boolean[i];
    }
}
