package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Rational;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؚؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7026l implements InterfaceC5457l, InterfaceC12387l, InterfaceC15283l, InterfaceC14606l, InterfaceC5706l, InterfaceC12973l, InterfaceC4969l, InterfaceC2002l, InterfaceC13221l, InterfaceC9330l, InterfaceC5194l, InterfaceC10162l, InterfaceC9526l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C7026l f14719l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f14720l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14721l;

    public C7026l(int i) {
        this.f14721l = i;
        switch (i) {
            case 10:
                this.f14720l = new C13143l(10);
                break;
            case 16:
                this.f14720l = new C3994l((Object) null);
                break;
            default:
                this.f14720l = new String[]{"Other", "Master volume", "Front right", "Front left", "Back right", "Back left", "Front centre", "Back centre", "Subwoofer"};
                break;
        }
    }

    public static int[] startapp(int i, int i2, byte[] bArr) {
        int[] iArr = new int[i2];
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            while (i4 < i) {
                bigIntegerAdd = bigIntegerAdd.shiftLeft(8).add(BigInteger.valueOf(bArr[i3] & 255));
                i3++;
                i4 += 8;
            }
            i4 -= i;
            iArr[i5] = bigIntegerAdd.shiftRight(i4).mod(BigInteger.valueOf(2L).pow(i)).intValue();
        }
        return iArr;
    }

    public static C7026l tapsense() {
        if (f14719l == null) {
            synchronized (C7026l.class) {
                try {
                    if (f14719l == null) {
                        f14719l = new C7026l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14719l;
    }

    public Integer Signature(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f14720l;
        if (sharedPreferences.contains(str)) {
            return Integer.valueOf(sharedPreferences.getInt(str, 0));
        }
        return null;
    }

    public byte[] ad(C18396l[] c18396lArr, byte[] bArr, byte[] bArr2, C5138l c5138l) {
        char c = 2;
        byte[][] bArr3 = new byte[2][];
        AbstractC6716l abstractC6716l = (AbstractC6716l) this.f14720l;
        int i = abstractC6716l.admob;
        byte[][] bArr4 = new byte[i][];
        int i2 = abstractC6716l.mopub;
        int[] iArrStartapp = startapp(i2, i, bArr);
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArrStartapp[i4];
            byte[] bArr5 = (byte[]) c18396lArr[i4].f35933l;
            c5138l.m1714l(i3);
            c5138l.m1717l((i4 << i2) + i5);
            bArr3[i3] = abstractC6716l.yandex(c5138l, bArr2, bArr5);
            byte[][] bArr6 = (byte[][]) c18396lArr[i4].f35934l;
            c5138l.m1717l((i4 << i2) + i5);
            int i6 = i3;
            while (i6 < i2) {
                int i7 = i6 + 1;
                c5138l.m1714l(i7);
                int i8 = i5 & (1 << i6);
                char c2 = c;
                byte[] bArr7 = (byte[]) c5138l.f11181l;
                int i9 = i3;
                if (i8 == 0) {
                    c5138l.m1717l(AbstractC10000l.yandex(28, bArr7) / 2);
                    bArr3[1] = abstractC6716l.loadAd(bArr2, c5138l, bArr3[i9], bArr6[i6]);
                } else {
                    c5138l.m1717l((AbstractC10000l.yandex(28, bArr7) - 1) / 2);
                    bArr3[1] = abstractC6716l.loadAd(bArr2, c5138l, bArr6[i6], bArr3[i9]);
                }
                bArr3[i9] = bArr3[1];
                i3 = i9;
                i6 = i7;
                c = c2;
            }
            bArr4[i4] = bArr3[i3];
            i4++;
            c = c;
        }
        C5138l c5138l2 = new C5138l(c5138l);
        c5138l2.m1715l(4);
        c5138l2.m1709const(c5138l.m1711goto());
        return abstractC6716l.billing(c5138l2, bArr2, AbstractC14024l.isPro(bArr4));
    }

    public C16208l adcel() {
        Context context = (Context) this.f14720l;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C16208l c16208l = new C16208l();
        c16208l.f31712l = C15594l.yandex(AbstractC18647l.yandex);
        C0656l c0656l = new C0656l(context);
        c16208l.f31711l = c0656l;
        int i = 5;
        c16208l.f31710l = C15594l.yandex(new C13568l(c0656l, new C16543l(8, c0656l), i));
        C0656l c0656l2 = c16208l.f31711l;
        c16208l.f31714l = new C14965l(c0656l2);
        InterfaceC15897l interfaceC15897lYandex = C15594l.yandex(new C13645l(c16208l.f31714l, C15594l.yandex(new C3585l(13, c0656l2)), 12));
        c16208l.f31713l = interfaceC15897lYandex;
        int i2 = 9;
        C2183l c2183l = new C2183l(i2);
        C0656l c0656l3 = c16208l.f31711l;
        C12418l c12418l = new C12418l(c0656l3, interfaceC15897lYandex, c2183l, i);
        InterfaceC15897l interfaceC15897l = c16208l.f31712l;
        InterfaceC15897l interfaceC15897l2 = c16208l.f31710l;
        c16208l.f31715l = C15594l.yandex(new C5991l(new C11644l(interfaceC15897l, interfaceC15897l2, c12418l, interfaceC15897lYandex, interfaceC15897lYandex, 11), new C12714l(c0656l3, interfaceC15897l2, interfaceC15897lYandex, c12418l, interfaceC15897l, interfaceC15897lYandex, interfaceC15897lYandex), new C7502l(interfaceC15897l, interfaceC15897lYandex, c12418l, interfaceC15897lYandex), i2));
        return c16208l;
    }

    @Override // defpackage.InterfaceC12387l
    public boolean admob(C5254l c5254l) {
        return c5254l.m1754l((C5254l) this.f14720l);
    }

    public C11352l ads() {
        C10946l c10946lMopub;
        C11919l c11919l = (C11919l) this.f14720l;
        C5613l c5613l = (C5613l) c11919l.f23766l;
        synchronized (c5613l.f11920l) {
            c11919l.amazon(true);
            c10946lMopub = c5613l.mopub(((C7976l) c11919l.f23763l).yandex);
        }
        if (c10946lMopub != null) {
            return new C11352l(c10946lMopub);
        }
        return null;
    }

    public C8634l advert(C13568l c13568l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        long j;
        boolean z;
        long jM3773strictfp;
        C3994l c3994l = (C3994l) this.f14720l;
        C3994l c3994l2 = new C3994l(((List) c13568l.f26581l).size());
        List list = (List) c13568l.f26581l;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C0704l c0704l = (C0704l) list.get(i);
            long j2 = c0704l.yandex;
            C11169l c11169l = (C11169l) c3994l.amazon(j2);
            if (c11169l == null) {
                j = c0704l.loadAd;
                jM3773strictfp = c0704l.amazon;
                z = false;
            } else {
                long j3 = c11169l.yandex;
                j = j3;
                z = c11169l.crashlytics;
                jM3773strictfp = viewTreeObserverOnGlobalLayoutListenerC13840l.m3773strictfp(c11169l.loadAd);
            }
            long j4 = c0704l.yandex;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            c3994l2.subs(j4, new C15730l(j4, c0704l.loadAd, c0704l.amazon, c0704l.purchase, c0704l.billing, j, jM3773strictfp, z, c0704l.mopub, c0704l.subs, c0704l.isPro, c0704l.firebase, c0704l.smaato, c0704l.remoteconfig));
            boolean z2 = c0704l.purchase;
            if (z2) {
                c3994l.subs(j2, new C11169l(c0704l.loadAd, c0704l.crashlytics, z2));
            } else {
                c3994l.isPro(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new C8634l(c3994l2, c13568l, 10);
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        C3075l c3075l = (C3075l) obj;
        C7025l c7025l = (C7025l) this.f14720l;
        long jCrashlytics = c7025l.adcel.crashlytics();
        C7025l c7025l2 = c3075l.subs;
        if (!c7025l2.crashlytics) {
            jCrashlytics = c7025l2.firebase(jCrashlytics);
        }
        if (c3075l.billing.get()) {
            C8339l.smaato("The buffer is submitted or canceled.");
            return;
        }
        int i = 0;
        AbstractC5641l.yandex(jCrashlytics >= 0);
        c3075l.mopub = jCrashlytics;
        AtomicBoolean atomicBoolean = c3075l.billing;
        if (atomicBoolean.get()) {
            C8339l.smaato("The buffer is submitted or canceled.");
            return;
        }
        c3075l.admob = true;
        C5807l c5807l = c3075l.purchase;
        ByteBuffer byteBuffer = c3075l.crashlytics;
        if (!atomicBoolean.getAndSet(true)) {
            try {
                c3075l.yandex.queueInputBuffer(c3075l.loadAd, byteBuffer.position(), byteBuffer.limit(), c3075l.mopub, c3075l.admob ? 4 : 0);
                c5807l.loadAd(null);
            } catch (IllegalStateException e) {
                c5807l.amazon(e);
            }
        }
        ListenableFuture listenableFutureAdmob = AbstractC11356l.admob(c3075l.amazon);
        listenableFutureAdmob.yandex(new RunnableC9929l(listenableFutureAdmob, new C15053l(this), i), c7025l.admob);
    }

    public JSONObject applovin() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f14720l;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC2632l.smaato(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        AbstractC2632l.crashlytics(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    AbstractC2632l.crashlytics(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC2632l.crashlytics(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2632l.crashlytics(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public synchronized void appmetrica(C13774l c13774l) {
        try {
            C13774l c13774l2 = c13774l.purchase;
            C13774l c13774l3 = c13774l.amazon;
            c13774l.purchase = null;
            c13774l.amazon = null;
            if (c13774l3 != null) {
                c13774l3.purchase = c13774l2;
            } else {
                this.f14720l = c13774l2;
            }
            if (c13774l2 != null) {
                c13774l2.amazon = c13774l3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5194l
    public void billing(String str, long j, long j2, long j3) {
        AbstractC0538l abstractC0538l = (AbstractC0538l) this.f14720l;
        try {
            abstractC0538l.billing(new C7983l(abstractC0538l, new Status(2103, null, null, null)));
        } catch (IllegalStateException e) {
            C0022l c0022l = C17186l.isPro;
            Log.e(c0022l.yandex, c0022l.amazon("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = abstractC0538l.vip.admob.iterator();
        while (it.hasNext()) {
            ((C7801l) it.next()).purchase(str, j, 2103, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        return (AbstractC2722l) this.f14720l;
    }

    @Override // defpackage.InterfaceC12973l
    public InterfaceC1142l crashlytics() {
        return (C11268l) this.f14720l;
    }

    @Override // defpackage.InterfaceC9330l
    public void firebase(InterfaceC9719l interfaceC9719l, byte[] bArr, int i) {
        AbstractC12589l.m3424strictfp(interfaceC9719l);
        throw null;
    }

    @Override // defpackage.InterfaceC13221l
    public InterfaceC6269l get(int i) {
        return (C9081l) this.f14720l;
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = ((String[]) this.f14720l)[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 8;
    }

    @Override // defpackage.InterfaceC9330l
    public void init(InterfaceC9719l interfaceC9719l) {
        AbstractC12589l.m3424strictfp(interfaceC9719l);
        throw null;
    }

    public void inmobi(String str) {
        ((SharedPreferences) this.f14720l).edit().remove(str).apply();
    }

    @Override // defpackage.InterfaceC4969l
    public void isPro(C15691l c15691l) {
        AbstractC12694l c14439l;
        if (!AbstractC12225l.purchase()) {
            AbstractC7720l.amazon(((C7591l) this.f14720l).getContext()).execute(new RunnableC10311l(this, c15691l, 4));
            return;
        }
        AbstractC5088l.yandex("PreviewView", "Surface requested by Preview.");
        InterfaceC18690l interfaceC18690l = c15691l.purchase;
        ((C7591l) this.f14720l).f15609l = interfaceC18690l.adcel();
        C14212l c14212l = ((C7591l) this.f14720l).f15607l;
        Rect rectFirebase = interfaceC18690l.adcel().firebase();
        c14212l.getClass();
        c14212l.yandex = new Rational(rectFirebase.width(), rectFirebase.height());
        synchronized (c14212l) {
            c14212l.crashlytics = rectFirebase;
        }
        c15691l.loadAd(AbstractC7720l.amazon(((C7591l) this.f14720l).getContext()), new C17706l(this, interfaceC18690l, c15691l, 12));
        C7591l c7591l = (C7591l) this.f14720l;
        AbstractC12694l abstractC12694l = c7591l.f15600l;
        EnumC2529l enumC2529l = c7591l.f15601l;
        if (!(abstractC12694l instanceof C14439l) || C7591l.crashlytics(c15691l, enumC2529l)) {
            C7591l c7591l2 = (C7591l) this.f14720l;
            boolean zCrashlytics = C7591l.crashlytics(c15691l, c7591l2.f15601l);
            C7591l c7591l3 = (C7591l) this.f14720l;
            C8788l c8788l = c7591l3.f15605l;
            if (zCrashlytics) {
                C3608l c3608l = new C3608l(c7591l3, c8788l);
                c3608l.subs = false;
                c3608l.firebase = new AtomicReference();
                c14439l = c3608l;
            } else {
                c14439l = new C14439l(c7591l3, c8788l);
            }
            c7591l2.f15600l = c14439l;
        }
        InterfaceC15879l interfaceC15879lAdcel = interfaceC18690l.adcel();
        C7591l c7591l4 = (C7591l) this.f14720l;
        C10970l c10970l = new C10970l(interfaceC15879lAdcel, c7591l4.f15608l, c7591l4.f15600l);
        ((C7591l) this.f14720l).f15598l.set(c10970l);
        interfaceC18690l.yandex().amazon(AbstractC7720l.amazon(((C7591l) this.f14720l).getContext()), c10970l);
        ((C7591l) this.f14720l).f15600l.purchase(c15691l, new C17706l(this, c10970l, interfaceC18690l, 13));
        C7591l c7591l5 = (C7591l) this.f14720l;
        if (c7591l5.indexOfChild(c7591l5.f15597l) == -1) {
            C7591l c7591l6 = (C7591l) this.f14720l;
            c7591l6.addView(c7591l6.f15597l);
        }
    }

    @Override // defpackage.InterfaceC15283l
    public AbstractC8831l isVip(ByteArrayInputStream byteArrayInputStream) throws IOException {
        boolean z;
        C7838l c7838l = (C7838l) this.f14720l;
        int i = byteArrayInputStream.read();
        if (i < 0) {
            C8339l.vip();
            return null;
        }
        if (i == 0) {
            C18262l.metrica("Sender's public key invalid.");
            return null;
        }
        if (i == 2 || i == 3) {
            z = true;
        } else {
            if (i != 4 && i != 6 && i != 7) {
                C11467l.smaato(Integer.toString(i, 16), "Sender's public key has invalid point encoding 0x");
                return null;
            }
            z = false;
        }
        AbstractC11918l abstractC11918l = c7838l.f16360l;
        int iFirebase = abstractC11918l.firebase();
        if (!z) {
            iFirebase *= 2;
        }
        int i2 = iFirebase + 1;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) i;
        int i3 = i2 - 1;
        if (AbstractC7016l.amazon(byteArrayInputStream, bArr, 1, i3) == i3) {
            return new C4148l(abstractC11918l.mopub(bArr), c7838l);
        }
        C8339l.vip();
        return null;
    }

    public void license(Exception exc) {
        AbstractC6427l.subs("MediaCodecAudioRenderer", "Audio sink error", exc);
        C18595l c18595l = ((C4886l) this.f14720l).f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC15668l(c18595l, exc, 1));
        }
    }

    @Override // defpackage.InterfaceC2002l
    public void loadAd(int i, C4276l c4276l, long j, int i2) {
        ((MediaCodec) this.f14720l).queueSecureInputBuffer(i, 0, c4276l.subs, j, i2);
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        ((CountDownLatch) this.f14720l).countDown();
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        ((C7025l) this.f14720l).yandex(0, "Unable to acquire InputBuffer.", th);
    }

    public void premium(int i, String str) {
        ((SharedPreferences) this.f14720l).edit().putInt(str, i).apply();
    }

    public C7417l pro(InterfaceC10430l interfaceC10430l, InterfaceC15129l interfaceC15129l, int i) {
        int i2;
        C13143l c13143l = (C13143l) this.f14720l;
        int i3 = 0;
        C7417l c7417lApplovin = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = c13143l.yandex;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    interfaceC10430l.yandex(i6 - i7, i7, c13143l.yandex);
                    c13143l.m3562for(i5);
                    c13143l.m3561extends(i6);
                    if (c13143l.yandex() < 3) {
                        C11467l.startapp(c13143l.loadAd, c13143l.crashlytics, ", limit=", "position=");
                        return null;
                    }
                    int iAppmetrica = c13143l.appmetrica();
                    i2 = c13143l.loadAd - 3;
                    c13143l.loadAd = i2;
                    if (iAppmetrica == 4801587) {
                        break;
                    }
                    if (AbstractC6968l.crashlytics(c13143l.subs()) == -1) {
                        if (i4 == 0) {
                            c13143l.crashlytics(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    interfaceC10430l.smaato();
                    interfaceC10430l.admob(i3);
                    return c7417lApplovin;
                } catch (EOFException unused) {
                }
            }
            c13143l.m3568throw(6);
            int iIsVip = c13143l.isVip();
            int i8 = iIsVip + 10;
            if (c7417lApplovin == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(c13143l.yandex, i2, bArr2, 0, 10);
                interfaceC10430l.yandex(10, iIsVip, bArr2);
                c7417lApplovin = new C12516l(interfaceC15129l).applovin(i8, bArr2);
            } else {
                interfaceC10430l.admob(iIsVip);
            }
            i3 += i8;
        }
    }

    @Override // defpackage.InterfaceC2002l
    public void purchase(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f14720l).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC9330l
    public int remoteconfig() {
        return ((InterfaceC9330l) this.f14720l).remoteconfig() * 2;
    }

    public void signatures(String str, boolean z) {
        ((SharedPreferences) this.f14720l).edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.InterfaceC5194l
    public void subs(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        AbstractC0538l abstractC0538l = (AbstractC0538l) this.f14720l;
        try {
            i2 = i;
            try {
                abstractC0538l.billing(new C7983l(new Status(i2, null, null, null)));
            } catch (IllegalStateException e) {
                e = e;
                C0022l c0022l = C17186l.isPro;
                Log.e(c0022l.yandex, c0022l.amazon("Result already set when calling onRequestCompleted", new Object[0]), e);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        Iterator it = abstractC0538l.vip.admob.iterator();
        while (it.hasNext()) {
            ((C7801l) it.next()).purchase(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    public Boolean subscription(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f14720l;
        if (sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    public String toString() {
        switch (this.f14721l) {
            case 11:
                StringBuilder sb = new StringBuilder();
                C16760l c16760l = (C16760l) this.f14720l;
                sb.append(c16760l);
                sb.append(": ");
                C2278l c2278l = c16760l.f32764l;
                InterfaceC13922l interfaceC13922l = C16760l.f32761l[0];
                sb.append(((Map) c2278l.invoke()).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2002l
    public void yandex(Bundle bundle) {
        ((MediaCodec) this.f14720l).setParameters(bundle);
    }

    @Override // defpackage.InterfaceC2002l
    public void flush() {
    }

    @Override // defpackage.InterfaceC2002l
    public void shutdown() {
    }

    @Override // defpackage.InterfaceC2002l
    public void smaato() {
    }

    @Override // defpackage.InterfaceC2002l
    public void start() {
    }

    public /* synthetic */ C7026l(int i, boolean z) {
        this.f14721l = i;
    }

    public C7026l(Context context) {
        this.f14721l = 1;
        this.f14720l = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public C7026l(C12714l c12714l) {
        this.f14721l = 3;
        this.f14720l = new File((File) c12714l.f25072l, "com.crashlytics.settings.json");
    }

    public /* synthetic */ C7026l(int i, Object obj) {
        this.f14721l = i;
        this.f14720l = obj;
    }

    public C7026l(float f, float f2) {
        this.f14721l = 24;
        this.f14720l = new C9081l(f, f2, 0.01f);
    }
}
