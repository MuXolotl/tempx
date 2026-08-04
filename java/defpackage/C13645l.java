package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.WindowInsetsAnimation;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْۚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13645l implements InterfaceC0251l, InterfaceC10153l, InterfaceC3928l, InterfaceC13142l, InterfaceC13504l, InterfaceC14606l, InterfaceC17443l, InterfaceC10315l, InterfaceC9746l, InterfaceC13081l, InterfaceC2353l, InterfaceC6211l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f26670l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f26671l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26672l;

    public C13645l(int i) {
        this.f26672l = i;
        switch (i) {
            case 11:
                this.f26671l = new LinkedHashMap();
                this.f26670l = new LinkedHashMap();
                break;
            case 20:
                this.f26671l = new ConcurrentHashMap();
                this.f26670l = new AtomicInteger(0);
                break;
            default:
                this.f26671l = new C13660l();
                this.f26670l = new C13660l();
                break;
        }
    }

    public static C16017l ads(List list) {
        return list.isEmpty() ? C16017l.f31394l : new C16017l(list);
    }

    public static C0883l signatures(C13211l c13211l) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(188);
        int iPosition = byteBufferAllocate.position();
        while (c13211l.read(byteBufferAllocate) != -1 && byteBufferAllocate.hasRemaining()) {
        }
        if (byteBufferAllocate.position() - iPosition != 188) {
            return null;
        }
        byteBufferAllocate.flip();
        if (71 != (byteBufferAllocate.get() & 255)) {
            C18073l.admob();
            return null;
        }
        int i = byteBufferAllocate.getShort() & 8191;
        byte b = byteBufferAllocate.get();
        if ((b & 32) != 0) {
            AbstractC16291l.billing(byteBufferAllocate.get() & 255, byteBufferAllocate);
        }
        if ((b & 16) == 0) {
            byteBufferAllocate = null;
        }
        C0883l c0883l = new C0883l();
        c0883l.f2533l = i;
        c0883l.f2534l = byteBufferAllocate;
        return c0883l;
    }

    public static void startapp(C13645l c13645l, boolean z, boolean z2) {
        synchronized (c13645l) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) c13645l.f26670l) == null) {
                    if (((Context) c13645l.f26671l).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC6427l.vip("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) c13645l.f26671l).getSystemService("power");
                    if (powerManager == null) {
                        AbstractC6427l.vip("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        c13645l.f26670l = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) c13645l.f26670l;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public int Signature(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f26671l;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.f26670l).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public void ad(byte[] bArr) {
        long[] jArr = ((long[][]) this.f26670l)[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = ((long[][]) this.f26670l)[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        AbstractC10000l.Signature(j, bArr, 0);
        AbstractC10000l.Signature(j2, bArr, 8);
    }

    public void adcel() {
        int[] iArr = (int[]) this.f26671l;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f26670l = null;
    }

    @Override // defpackage.InterfaceC3928l
    public List admob(Integer num) {
        List listAdmob = ((InterfaceC3928l) this.f26671l).admob(null);
        C13006l c13006l = (C13006l) this.f26670l;
        int i = c13006l.license;
        return i < 0 ? listAdmob : AbstractC16901l.m4232new(AbstractC15096l.yandex(c13006l, num, i, Integer.valueOf(c13006l.inmobi(c13006l.loadAd, i))), listAdmob);
    }

    public void advert(int i, int i2) {
        int[] iArr = (int[]) this.f26671l;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        tapsense(i3);
        int[] iArr2 = (int[]) this.f26671l;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f26671l, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f26670l;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C14902l c14902l = (C14902l) ((ArrayList) this.f26670l).get(size);
            int i4 = c14902l.f29313l;
            if (i4 >= i) {
                c14902l.f29313l = i4 + i2;
            }
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        C7025l c7025l;
        switch (this.f26672l) {
            case 10:
                C7025l c7025l2 = (C7025l) obj;
                C3551l c3551l = (C3551l) this.f26670l;
                AbstractC5088l.yandex("Recorder", "VideoEncoder can be released: " + c7025l2);
                if (c7025l2 != null) {
                    ScheduledFuture scheduledFuture = c3551l.license;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (c7025l = c3551l.subscription) != null && c7025l == c7025l2) {
                        C3551l.vip(c7025l);
                    }
                    c3551l.ad = (C12158l) this.f26671l;
                    c3551l.subscription(null);
                    c3551l.startapp();
                    break;
                }
                break;
            default:
                ((InterfaceC13241l) this.f26671l).accept(new C7478l(0, (Surface) this.f26670l));
                break;
        }
    }

    public void applovin(AbstractC11411l abstractC11411l) {
        C13660l c13660l = (C13660l) this.f26671l;
        Object objMopub = ((C13660l) this.f26670l).mopub(abstractC11411l);
        if (objMopub != null) {
            if (!(objMopub instanceof C12463l)) {
                C18725l.loadAd();
                return;
            }
            C12463l c12463l = (C12463l) objMopub;
            Object[] objArr = c12463l.yandex;
            int i = c12463l.loadAd;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    C18725l.loadAd();
                    return;
                }
                C1306l c1306l = new C1306l(abstractC11411l);
                Object objMopub2 = c13660l.mopub(null);
                if (objMopub2 != null) {
                    if (objMopub2 instanceof C12463l) {
                        C12463l c12463l2 = (C12463l) objMopub2;
                        int i3 = c12463l2.loadAd;
                        Object[] objArr2 = c12463l2.yandex;
                        C8934l c8934lAdcel = AbstractC8576l.adcel(0, i3);
                        int i4 = c8934lAdcel.f15488l;
                        int i5 = c8934lAdcel.f15487l;
                        int i6 = 0;
                        if (i4 <= i5) {
                            while (true) {
                                objArr2[i4 - i6] = objArr2[i4];
                                if (((Boolean) c1306l.invoke(objArr2[i4])).booleanValue()) {
                                    i6++;
                                }
                                if (i4 == i5) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        Arrays.fill(objArr2, i3 - i6, i3, (Object) null);
                        c12463l2.loadAd -= i6;
                        if (c12463l2.isPro()) {
                            c13660l.smaato(null);
                        }
                        if (c12463l2.loadAd == 1) {
                            c13660l.vip(null, c12463l2.mopub());
                        }
                    } else if (((Boolean) c1306l.invoke(objMopub2)).booleanValue()) {
                        c13660l.smaato(null);
                    }
                }
            }
        }
    }

    public void appmetrica(C15074l c15074l) {
        Handler handler = (Handler) this.f26671l;
        if (handler != null) {
            handler.post(new RunnableC10311l(this, c15074l, 23));
        }
    }

    @Override // defpackage.InterfaceC10315l
    public Object billing(Object obj) {
        return ((Function1) this.f26670l).invoke(obj);
    }

    @Override // defpackage.InterfaceC13142l
    public void firebase(C2566l c2566l) {
        if (((C17893l) c2566l.yandex().f1691l).f34846l == 1) {
            C0840l c0840l = (C0840l) ((C17893l) c2566l.yandex().f1691l).f34848l[0];
            if (C12814l.purchase(AbstractC2296l.loadAd(c0840l.yandex, c0840l.loadAd)) == 1 && C12814l.amazon(c2566l.f5585l)) {
                C0840l c0840l2 = (C0840l) ((C17893l) c2566l.yandex().f1691l).f34848l[0];
                int iMopub = C12814l.mopub(AbstractC2296l.loadAd(c0840l2.yandex, c0840l2.loadAd));
                if (((C15308l) this.f26670l).admob() != iMopub) {
                    ((C10832l) this.f26671l).invoke();
                    premium(iMopub);
                    return;
                }
                return;
            }
        }
        premium(-1);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        C6162l c6162l = new C6162l(14);
        C12899l c12899l = new C12899l(13);
        Object obj = ((InterfaceC15897l) this.f26671l).get();
        InterfaceC15897l interfaceC15897l = (InterfaceC15897l) this.f26670l;
        return new C16163l(c6162l, c12899l, C17964l.billing, (C6377l) obj, interfaceC15897l);
    }

    public void isVip(int i, int i2) {
        int[] iArr = (int[]) this.f26671l;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        tapsense(i3);
        int[] iArr2 = (int[]) this.f26671l;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f26671l;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f26670l;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C14902l c14902l = (C14902l) ((ArrayList) this.f26670l).get(size);
            int i4 = c14902l.f29313l;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f26670l).remove(size);
                } else {
                    c14902l.f29313l = i4 - i2;
                }
            }
        }
    }

    public String license(String str) {
        String str2 = (String) this.f26670l;
        Resources resources = (Resources) this.f26671l;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // defpackage.InterfaceC6211l
    public C10758l loadAd(byte[] bArr) {
        InterfaceC9560l interfaceC9560l = (InterfaceC9560l) this.f26670l;
        C1561l c1561lPurchase = interfaceC9560l.purchase();
        byte[] bArr2 = c1561lPurchase.yandex;
        byte[] bArr3 = c1561lPurchase.loadAd;
        byte[] bArrStartapp = interfaceC9560l.startapp(bArr2, bArr);
        byte[] bArrAmazon = AbstractC17265l.amazon(bArr3, bArr);
        byte[] bArrAmazon2 = AbstractC17265l.amazon(AbstractC2383l.remoteconfig, AbstractC2383l.loadAd);
        C10828l c10828l = (C10828l) this.f26671l;
        int macLength = Mac.getInstance(c10828l.f21889l).getMacLength();
        byte[] bArr4 = AbstractC2383l.metrica;
        Charset charset = AbstractC0647l.yandex;
        return new C10758l(c10828l.yandex(c10828l.loadAd(AbstractC17265l.amazon(bArr4, bArrAmazon2, "eae_prk".getBytes(charset), bArrStartapp), null), macLength, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, macLength), bArr4, bArrAmazon2, "shared_secret".getBytes(charset), bArrAmazon)), bArr3);
    }

    @Override // defpackage.InterfaceC13142l
    public /* synthetic */ C3790l metrica() {
        return null;
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        switch (this.f26672l) {
            case 10:
                AbstractC5088l.yandex("Recorder", "Error in ReadyToReleaseFuture: " + th);
                break;
            default:
                AbstractC5641l.purchase("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof C12424l);
                ((InterfaceC13241l) this.f26671l).accept(new C7478l(1, (Surface) this.f26670l));
                break;
        }
    }

    public void premium(int i) {
        ((C15308l) this.f26670l).subs(i);
    }

    public void pro(byte[] bArr) {
        if (((long[][]) this.f26670l) == null) {
            this.f26670l = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else {
            byte[] bArr2 = (byte[]) this.f26671l;
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                i |= bArr2[i2] ^ bArr[i2];
            }
            if (((byte) (((i - 1) & (~i)) >> 31)) != 0) {
                return;
            }
        }
        byte[] bArr3 = new byte[16];
        this.f26671l = bArr3;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = bArr[i3];
        }
        byte[] bArr4 = (byte[]) this.f26671l;
        long[] jArr = ((long[][]) this.f26670l)[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            jArr[i5] = AbstractC10000l.loadAd(i4, bArr4);
            i4 += 8;
        }
        long[] jArr2 = ((long[][]) this.f26670l)[1];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
        for (int i6 = 2; i6 < 256; i6 += 2) {
            long[][] jArr3 = (long[][]) this.f26670l;
            long[] jArr4 = jArr3[i6 >> 1];
            long[] jArr5 = jArr3[i6];
            long j4 = jArr4[0];
            long j5 = jArr4[1];
            long j6 = j4 >> 63;
            long j7 = ((j4 ^ ((-2233785415175766016L) & j6)) << 1) | (j5 >>> 63);
            jArr5[0] = j7;
            long j8 = (j5 << 1) | (-j6);
            jArr5[1] = j8;
            long[] jArr6 = jArr3[1];
            long[] jArr7 = jArr3[i6 + 1];
            jArr7[0] = j7 ^ jArr6[0];
            jArr7[1] = jArr6[1] ^ j8;
        }
    }

    @Override // defpackage.InterfaceC13081l
    public int purchase(int i) {
        C16150l c16150l = (C16150l) this.f26671l;
        SparseArray sparseArray = (SparseArray) ((C18675l) this.f26670l).f36444l;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        if (!arrayList.contains(c16150l)) {
            arrayList.add(c16150l);
        }
        return i;
    }

    @Override // defpackage.InterfaceC3928l
    public boolean remoteconfig() {
        return ((InterfaceC3928l) this.f26671l).remoteconfig();
    }

    @Override // defpackage.InterfaceC0251l
    public StackTraceElement[] smaato(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC0251l[] interfaceC0251lArr = (InterfaceC0251l[]) this.f26671l;
        StackTraceElement[] stackTraceElementArrSmaato = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            InterfaceC0251l interfaceC0251l = interfaceC0251lArr[i];
            if (stackTraceElementArrSmaato.length <= 1024) {
                break;
            }
            stackTraceElementArrSmaato = interfaceC0251l.smaato(stackTraceElementArr);
        }
        return stackTraceElementArrSmaato.length > 1024 ? ((C10819l) this.f26670l).smaato(stackTraceElementArrSmaato) : stackTraceElementArrSmaato;
    }

    @Override // defpackage.InterfaceC10315l
    public Object subs(C15543l c15543l, Object obj) {
        return ((Function2) this.f26671l).invoke(c15543l, obj);
    }

    public void subscription(C9294l c9294l) {
        synchronized (c9294l) {
        }
        Handler handler = (Handler) this.f26671l;
        if (handler != null) {
            handler.post(new RunnableC11367l(this, c9294l, 1));
        }
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        if (c17778l.f34637l) {
            return;
        }
        ((C2397l) this.f26670l).subs(c18389l);
    }

    public void tapsense(int i) {
        int[] iArr = (int[]) this.f26671l;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f26671l = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f26671l = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f26671l;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
        Object obj;
        C2397l c2397l = (C2397l) this.f26670l;
        if (c2397l.signatures()) {
            return;
        }
        C6472l c6472l = (C6472l) this.f26671l;
        if (iOException instanceof C14758l) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message == null || !AbstractC12024l.appmetrica(message, "connect", true)) {
                iOException = AbstractC15190l.yandex(c6472l, iOException);
            } else {
                int i = AbstractC15190l.yandex;
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append((C2540l) c6472l.f13512l);
                sb.append(", connect_timeout=");
                C14152l c14152l = (C14152l) c6472l.loadAd();
                if (c14152l == null || (obj = c14152l.loadAd) == null) {
                    obj = "unknown";
                }
                sb.append(obj);
                sb.append(" ms]");
                iOException = new C2739l(sb.toString(), iOException);
            }
        }
        c2397l.subs(new C18435l(iOException));
    }

    @Override // defpackage.InterfaceC13504l
    /* JADX INFO: renamed from: throws */
    public byte[] mo1221throws(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((C9812l) this.f26671l).mo1221throws(i, bArr) : ((C2494l) this.f26670l).mo1221throws(i, bArr);
    }

    public String toString() {
        switch (this.f26672l) {
            case 23:
                return "var " + ((String) this.f26671l) + " = " + ((InterfaceC8396l) this.f26670l) + ';';
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((InterfaceC2353l) this.f26671l) + " + " + ((InterfaceC8396l) this.f26670l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC1833l.firebase("\nwhile (" + ((C0848l) this.f26671l) + ") {\n    " + AbstractC16901l.m4210case((List) this.f26670l, "\n", null, null, null, 62) + "\n};\n            ");
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            default:
                return super.toString();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "Bounds{lower=" + ((C15496l) this.f26671l) + " upper=" + ((C15496l) this.f26670l) + "}";
        }
    }

    @Override // defpackage.InterfaceC6211l
    /* JADX INFO: renamed from: transient */
    public byte[] mo1222transient(byte[] bArr, C18595l c18595l) {
        byte[] bArrStartapp = ((InterfaceC9560l) this.f26670l).startapp(((C0346l) c18595l.f36317l).loadAd(), bArr);
        byte[] bArrAmazon = AbstractC17265l.amazon(bArr, ((C0346l) c18595l.f36316l).loadAd());
        byte[] bArrAmazon2 = AbstractC17265l.amazon(AbstractC2383l.remoteconfig, AbstractC2383l.loadAd);
        C10828l c10828l = (C10828l) this.f26671l;
        int macLength = Mac.getInstance(c10828l.f21889l).getMacLength();
        byte[] bArr2 = AbstractC2383l.metrica;
        Charset charset = AbstractC0647l.yandex;
        return c10828l.yandex(c10828l.loadAd(AbstractC17265l.amazon(bArr2, bArrAmazon2, "eae_prk".getBytes(charset), bArrStartapp), null), macLength, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, macLength), bArr2, bArrAmazon2, "shared_secret".getBytes(charset), bArrAmazon));
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) throws Throwable {
        FileWriter fileWriter;
        C7644l c7644l = (C7644l) this.f26670l;
        JSONObject jSONObject = (JSONObject) ((ExecutorC4850l) ((C0554l) this.f26671l).f1956l).f9906l.submit(new CallableC9758l(1, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            C6871l c6871lInmobi = ((C5008l) c7644l.f15734l).inmobi(jSONObject);
            C7026l c7026l = (C7026l) c7644l.f15739l;
            long j = c6871lInmobi.crashlytics;
            c7026l.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) c7026l.f14720l);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                    AbstractC2632l.crashlytics(fileWriter, "Failed to close settings writer.");
                    C7644l.vip(jSONObject, "Loaded settings: ");
                    String str = ((C17643l) c7644l.f15737l).billing;
                    SharedPreferences.Editor editorEdit = ((Context) c7644l.f15738l).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) c7644l.f15736l).set(c6871lInmobi);
                    ((C2350l) ((AtomicReference) c7644l.f15741l).get()).amazon(c6871lInmobi);
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    AbstractC2632l.crashlytics(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC2632l.crashlytics(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return AbstractC4311l.mopub(null);
    }

    @Override // defpackage.InterfaceC6211l
    /* JADX INFO: renamed from: while */
    public byte[] mo1224while() throws GeneralSecurityException {
        byte[] bArr;
        switch (((C10828l) this.f26671l).f21889l) {
            case "HmacSha256":
                bArr = AbstractC2383l.billing;
                break;
            case "HmacSha384":
                bArr = AbstractC2383l.mopub;
                break;
            case "HmacSha512":
                bArr = AbstractC2383l.admob;
                break;
            default:
                C18262l.ads("Could not determine HPKE KDF ID");
                return null;
        }
        if (Arrays.equals(bArr, AbstractC2383l.billing)) {
            return AbstractC2383l.loadAd;
        }
        C18262l.ads("Could not determine HPKE KEM ID");
        return null;
    }

    @Override // defpackage.InterfaceC13081l
    public void yandex() {
        C18675l c18675l = (C18675l) this.f26670l;
        C16150l c16150l = (C16150l) this.f26671l;
        SparseArray sparseArray = (SparseArray) c18675l.f36444l;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove(c16150l) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.InterfaceC13081l
    public int crashlytics(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC13142l
    public /* synthetic */ void isPro(InterfaceC17593l interfaceC17593l) {
    }

    public /* synthetic */ C13645l(int i, boolean z) {
        this.f26672l = i;
    }

    public /* synthetic */ C13645l(Object obj, Object obj2, int i) {
        this.f26672l = i;
        this.f26671l = obj;
        this.f26670l = obj2;
    }

    public /* synthetic */ C13645l(Object obj, Object obj2, boolean z, int i) {
        this.f26672l = i;
        this.f26670l = obj;
        this.f26671l = obj2;
    }

    public C13645l(Context context) {
        this.f26672l = 17;
        AbstractC1051l.subs(context);
        Resources resources = context.getResources();
        this.f26671l = resources;
        this.f26670l = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public C13645l(Object obj) {
        this.f26672l = 15;
        this.f26671l = obj;
        this.f26670l = Thread.currentThread();
    }

    public C13645l(InterfaceC0251l[] interfaceC0251lArr) {
        this.f26672l = 3;
        this.f26671l = interfaceC0251lArr;
        this.f26670l = new C10819l(6);
    }

    public C13645l(C10828l c10828l) {
        InterfaceC9560l c6565l;
        this.f26672l = 28;
        this.f26671l = c10828l;
        try {
            Provider providerMopub = AbstractC17764l.mopub();
            if (providerMopub != null) {
                KeyFactory.getInstance("XDH", providerMopub);
                KeyAgreement.getInstance("XDH", providerMopub);
                c6565l = new C15053l(providerMopub);
                c6565l.purchase();
                this.f26670l = c6565l;
                return;
            }
            throw new GeneralSecurityException("Conscrypt is not available.");
        } catch (GeneralSecurityException unused) {
            c6565l = new C6565l(14);
        }
    }

    public C13645l(Handler handler, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l) {
        this.f26672l = 21;
        if (surfaceHolderCallbackC18330l != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f26671l = handler;
        this.f26670l = surfaceHolderCallbackC18330l;
    }

    public C13645l(WindowInsetsAnimation.Bounds bounds) {
        this.f26672l = 27;
        this.f26671l = C13499l.billing(bounds);
        this.f26670l = C13499l.purchase(bounds);
    }

    public C13645l(C10832l c10832l) {
        this.f26672l = 8;
        this.f26671l = c10832l;
        this.f26670l = new C15308l(-1);
    }

    public /* synthetic */ C13645l(int i, Object obj) {
        this.f26672l = i;
        this.f26671l = obj;
    }
}
