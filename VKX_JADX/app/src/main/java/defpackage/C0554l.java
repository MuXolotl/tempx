package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Process;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0554l implements InterfaceC10727l, InterfaceC16451l, InterfaceC9762l, InterfaceC11795l, InterfaceC3783l, InterfaceC1361l, InterfaceC7744l, InterfaceC1554l, InterfaceC0587l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0554l f1954l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static int f1955l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f1956l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f1957l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f1958l;

    static {
        Object obj = null;
        f1954l = new C0554l(obj, obj, obj);
    }

    public C0554l(int i) {
        switch (i) {
            case 12:
                this.f1958l = new C0540l();
                break;
            case 15:
                this.f1958l = new int[10];
                this.f1957l = new int[10];
                this.f1956l = new int[10];
                break;
            default:
                this.f1958l = new C1579l(16);
                long[] jArr = AbstractC12154l.yandex;
                this.f1957l = new C13660l();
                this.f1956l = new C14529l(11);
                break;
        }
    }

    public static BigInteger Signature(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    public static final void ad() {
        if (AbstractC12024l.appmetrica(Thread.currentThread().getName(), "Firebase Blocking Thread #", false)) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static void appmetrica(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C0554l.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static void m627catch(C0554l c0554l, C3407l c3407l, C14965l c14965l, Object obj) {
        c0554l.getClass();
        c14965l.getClass();
        C12209l c12209l = new C12209l(c3407l);
        synchronized (((C14529l) c0554l.f1956l)) {
            try {
                if (obj == null) {
                    ((C13660l) c0554l.f1957l).vip(c12209l, new C2033l(null));
                    Unit unit = Unit.INSTANCE;
                } else {
                    ((C1579l) c0554l.f1958l).crashlytics(c12209l, new C2033l(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static Bundle m628default(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        appmetrica(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void license() {
        if (AbstractC12024l.appmetrica(Thread.currentThread().getName(), "Firebase Background Thread #", false)) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static C0554l signatures(C0554l c0554l, InterfaceC18212l interfaceC18212l, C0327l c0327l, C15920l c15920l, int i) {
        if ((i & 1) != 0) {
            interfaceC18212l = (InterfaceC18212l) c0554l.f1958l;
        }
        if ((i & 2) != 0) {
            c0327l = (C0327l) c0554l.f1957l;
        }
        if ((i & 4) != 0) {
            c15920l = (C15920l) c0554l.f1956l;
        }
        return new C0554l(interfaceC18212l, c0327l, c15920l);
    }

    @Override // defpackage.InterfaceC3783l
    public synchronized int adcel() {
        return ((C7865l) this.f1956l).crashlytics.f26152l;
    }

    @Override // defpackage.InterfaceC11795l
    public boolean admob(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        C12933l c12933l = (C12933l) ((AbstractC7940l) this.f1957l).f16541l;
        BigInteger bigInteger3 = c12933l.f25381l;
        BigInteger bigIntegerSignature = Signature(bigInteger3, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || bigInteger3.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || bigInteger3.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerIsPro = AbstractC16784l.isPro(bigInteger3, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerSignature.multiply(bigIntegerIsPro).mod(bigInteger3);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerIsPro).mod(bigInteger3);
        BigInteger bigInteger4 = c12933l.f25380l;
        return c12933l.f25382l.modPow(bigIntegerMod, bigInteger4).multiply(((C4767l) ((AbstractC7940l) this.f1957l)).f9785l.modPow(bigIntegerMod2, bigInteger4)).mod(bigInteger4).mod(bigInteger3).equals(bigInteger);
    }

    @Override // defpackage.InterfaceC7744l
    public boolean ads(C10814l c10814l) {
        C10035l c10035l = new C10035l();
        C5342l c5342l = new C5342l();
        InterfaceC5389l interfaceC5389l = (InterfaceC5389l) this.f1958l;
        C17927l c17927l = new C17927l(((C10861l) interfaceC5389l).f21960l, 2);
        C5849l c5849l = (C5849l) this.f1956l;
        C8462l c8462l = new C8462l(c10035l, c5342l, c17927l, c5849l, new C5703l(), new C11280l(c5849l.yandex()), interfaceC5389l, null, null);
        C14054l c14054l = C14054l.f27396l;
        return ((Boolean) AbstractC10999l.subs(C17218l.f33421l, new C18731l(this, c8462l.yandex(0, c10814l, true, null, null, c14054l, c14054l), null, 23))).booleanValue();
    }

    public void advert() {
        C0554l c0554l = (C0554l) this.f1958l;
        if (c0554l != null) {
            int i = ((C17646l) this.f1956l).vip.f15051l;
            C7272l c7272l = (C7272l) c0554l.f1958l;
            c7272l.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            c7272l.yandex.setPlaybackToLocal(builder.build());
            this.f1957l = null;
        }
    }

    @Override // defpackage.InterfaceC1554l
    public Uri amazon() {
        return (Uri) this.f1958l;
    }

    public InterfaceC7024l applovin(byte[] bArr) {
        ECPoint eCPoint;
        AbstractC16466l abstractC16466l = (AbstractC16466l) this.f1956l;
        if (bArr.length == 0) {
            C8339l.smaato("Encoded key is empty!");
            return null;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) abstractC16466l.yandex(new ECGenParameterSpec((String) this.f1957l)).getParameterSpec(ECParameterSpec.class);
        int fieldSize = (eCParameterSpec.getCurve().getField().getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b == 2 || b == 3) {
            if (bArr.length != fieldSize + 1) {
                C11983l.tapsense(bArr.length, "Wrong compressed key size ");
                return null;
            }
            BigInteger p = ((ECFieldFp) eCParameterSpec.getCurve().getField()).getP();
            BigInteger a = eCParameterSpec.getCurve().getA();
            BigInteger b2 = eCParameterSpec.getCurve().getB();
            BigInteger bigInteger = new BigInteger(1, AbstractC8669l.inmobi(1, bArr.length, bArr));
            BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(a).multiply(bigInteger).add(b2).mod(p);
            if (!p.testBit(0) || !p.testBit(1)) {
                C8339l.smaato("Unsupported curve modulus");
                return null;
            }
            BigInteger bigIntegerModPow = bigIntegerMod.modPow(p.add(BigInteger.ONE).shiftRight(2), p);
            if (bigIntegerModPow.testBit(0) != (bArr[0] == 3)) {
                bigIntegerModPow = p.subtract(bigIntegerModPow);
            }
            eCPoint = new ECPoint(bigInteger, bigIntegerModPow);
        } else {
            if (b != 4) {
                throw new IllegalStateException(("Unsupported key type " + ((int) bArr[0])).toString());
            }
            if (bArr.length != (fieldSize * 2) + 1) {
                C11983l.tapsense(bArr.length, "Wrong uncompressed key size ");
                return null;
            }
            int i = fieldSize + 1;
            eCPoint = new ECPoint(new BigInteger(1, AbstractC8669l.inmobi(1, i, bArr)), new BigInteger(1, AbstractC8669l.inmobi(i, fieldSize + i, bArr)));
        }
        AbstractC14910l abstractC14910l = (AbstractC14910l) this.f1958l;
        Object objYandex = abstractC14910l.yandex();
        try {
            return isVip(((KeyFactory) objYandex).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec)));
        } finally {
            abstractC14910l.loadAd(objYandex);
        }
    }

    @Override // defpackage.InterfaceC1361l
    public InterfaceC14991l billing() {
        return (C17962l) this.f1957l;
    }

    @Override // defpackage.InterfaceC1361l
    public void cancel() {
        ((InterfaceC1029l) ((C4619l) this.f1956l).f9374l).cancel();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public InputMethodManager m629case() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f1957l;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) ((View) this.f1958l).getContext().getSystemService("input_method");
        this.f1957l = inputMethodManager2;
        return inputMethodManager2;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m630class(MediaMetadataCompat mediaMetadataCompat) {
        C7272l c7272l = (C7272l) this.f1958l;
        c7272l.mopub = mediaMetadataCompat;
        MediaSession mediaSession = c7272l.yandex;
        if (mediaMetadataCompat.f29l == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.f29l = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.f29l);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m631continue(AbstractC0294l abstractC0294l, Handler handler) {
        C7272l c7272l = (C7272l) this.f1958l;
        if (abstractC0294l == null) {
            c7272l.amazon(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        c7272l.amazon(abstractC0294l, handler);
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger[] crashlytics(byte[] bArr) {
        C12933l c12933l = (C12933l) ((AbstractC7940l) this.f1957l).f16541l;
        BigInteger bigInteger = c12933l.f25381l;
        BigInteger bigIntegerSignature = Signature(bigInteger, bArr);
        BigInteger bigInteger2 = ((C13649l) ((AbstractC7940l) this.f1957l)).f26673l;
        InterfaceC7373l interfaceC7373l = (InterfaceC7373l) this.f1958l;
        if (interfaceC7373l.crashlytics()) {
            interfaceC7373l.purchase(bigInteger, bigInteger2, bArr);
        } else {
            interfaceC7373l.amazon(bigInteger, (SecureRandom) this.f1956l);
        }
        BigInteger bigIntegerLoadAd = interfaceC7373l.loadAd();
        BigInteger bigInteger3 = c12933l.f25382l;
        SecureRandom secureRandomLoadAd = (SecureRandom) this.f1956l;
        if (secureRandomLoadAd == null) {
            secureRandomLoadAd = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        BigInteger bigIntegerMod = bigInteger3.modPow(bigIntegerLoadAd.add(AbstractC16784l.crashlytics(7, secureRandomLoadAd).add(BigInteger.valueOf(128L)).multiply(bigInteger)), c12933l.f25380l).mod(bigInteger);
        return new BigInteger[]{bigIntegerMod, AbstractC16784l.subs(bigInteger, bigIntegerLoadAd).multiply(bigIntegerSignature.add(bigInteger2.multiply(bigIntegerMod))).mod(bigInteger)};
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m632else(C8099l c8099l) {
        C17849l c17849l = (C17849l) ((HashMap) this.f1958l).remove(c8099l);
        c17849l.getClass();
        C2492l c2492l = (C2492l) ((C7865l) this.f1956l).adcel.get(c17849l);
        if (c2492l != null) {
            synchronized (c2492l) {
                c2492l.amazon--;
            }
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public boolean m633extends() {
        C3454l c3454l;
        IconCompat iconCompat;
        if (((C13161l) this.f1956l).billing("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f1957l;
        boolean z = false;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strAdcel = ((C13161l) this.f1956l).adcel("gcm.n.image");
        if (TextUtils.isEmpty(strAdcel)) {
            c3454l = null;
        } else {
            try {
                c3454l = new C3454l(new URL(strAdcel));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strAdcel);
                c3454l = null;
            }
        }
        if (c3454l != null) {
            ExecutorService executorService = (ExecutorService) this.f1958l;
            C2350l c2350l = new C2350l();
            c3454l.f7335l = executorService.submit(new RunnableC0336l(c3454l, c2350l, 27));
            c3454l.f7334l = c2350l.yandex;
        }
        C18595l c18595lYandex = AbstractC4000l.yandex((FirebaseMessagingService) this.f1957l, (C13161l) this.f1956l);
        C11757l c11757l = (C11757l) c18595lYandex.f36317l;
        if (c3454l != null) {
            try {
                C3823l c3823l = c3454l.f7334l;
                AbstractC1051l.subs(c3823l);
                Bitmap bitmap = (Bitmap) AbstractC4311l.amazon(c3823l, 5L, TimeUnit.SECONDS);
                c11757l.billing(bitmap);
                C9118l c9118l = new C9118l(12, z);
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.loadAd = bitmap;
                }
                c9118l.f18742l = iconCompat;
                c9118l.f18744l = null;
                c9118l.f18743l = true;
                c11757l.mopub(c9118l);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c3454l.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c3454l.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f1957l).getSystemService("notification")).notify((String) c18595lYandex.f36316l, 0, ((C11757l) c18595lYandex.f36317l).loadAd());
        return true;
    }

    @Override // defpackage.InterfaceC3783l
    public synchronized void firebase(C8099l c8099l) {
        ((C7865l) this.f1956l).crashlytics.firebase(c8099l);
        m632else(c8099l);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean m634for() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f1957l;
        if (((String) this.f1956l) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f1956l = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f1958l).readLine();
                this.f1956l = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f1956l = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger getOrder() {
        return ((C12933l) ((AbstractC7940l) this.f1957l).f16541l).f25381l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    @Override // defpackage.InterfaceC11795l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        Object obj;
        SecureRandom secureRandom;
        SecureRandom secureRandomLoadAd = null;
        if (z) {
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                this.f1957l = (C13649l) c6114l.f12903l;
                secureRandom = c6114l.f12904l;
            } else {
                obj = (C13649l) interfaceC9719l;
            }
            AbstractC16336l.purchase(((C12933l) ((AbstractC7940l) this.f1957l).f16541l).f25380l);
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            if (z && !((InterfaceC7373l) this.f1958l).crashlytics()) {
                if (secureRandom == null) {
                    secureRandomLoadAd = AbstractC8776l.loadAd();
                } else {
                    secureRandomLoadAd = secureRandom;
                }
            }
            this.f1956l = secureRandomLoadAd;
        }
        obj = (C4767l) interfaceC9719l;
        this.f1957l = obj;
        secureRandom = null;
        AbstractC16336l.purchase(((C12933l) ((AbstractC7940l) this.f1957l).f16541l).f25380l);
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        if (z) {
            if (secureRandom == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                secureRandomLoadAd = secureRandom;
            }
        }
        this.f1956l = secureRandomLoadAd;
    }

    public ArrayList inmobi() {
        ArrayList<InterfaceC7901l> arrayList = ((C13366l) this.f1956l).yandex;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        for (InterfaceC7901l interfaceC7901l : arrayList) {
            Object objYandex = interfaceC7901l.yandex();
            arrayList2.add(objYandex != null ? new C18625l(interfaceC7901l.crashlytics(), objYandex, interfaceC7901l.getKey()) : new C12028l(interfaceC7901l.crashlytics(), interfaceC7901l.getKey()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    @Override // defpackage.InterfaceC10727l
    public float isPro(float f) {
        Object objLoadAd;
        C15389l c15389l = (C15389l) this.f1958l;
        float fSmaato = c15389l.smaato();
        C18416l c18416lSubs = c15389l.subs();
        Function1 function1 = (Function1) this.f1957l;
        C4168l c4168l = (C4168l) this.f1956l;
        if (Float.isNaN(fSmaato)) {
            C8339l.metrica("The offset provided to computeTarget must not be NaN.");
            return 0.0f;
        }
        boolean z = Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (!z) {
            objLoadAd = c18416lSubs.yandex(fSmaato);
        } else if (Math.abs(f) >= Math.abs(((Number) c4168l.invoke()).floatValue())) {
            objLoadAd = c18416lSubs.loadAd(fSmaato, z2);
        } else {
            objLoadAd = c18416lSubs.loadAd(fSmaato, false);
            float fBilling = c18416lSubs.billing(objLoadAd);
            Object objLoadAd2 = c18416lSubs.loadAd(fSmaato, true);
            float fBilling2 = c18416lSubs.billing(objLoadAd2);
            float fAbs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fBilling - fBilling2)))).floatValue());
            if (!z2) {
                fBilling = fBilling2;
            }
            boolean z3 = Math.abs(fBilling - fSmaato) >= fAbs;
            if (z3) {
                if (z2) {
                    objLoadAd = objLoadAd2;
                }
            } else {
                if (z3) {
                    C18725l.billing();
                    return 0.0f;
                }
                if (!z2) {
                    objLoadAd = objLoadAd2;
                }
            }
        }
        if (!((Boolean) ((Function1) c15389l.yandex).invoke(objLoadAd)).booleanValue()) {
            objLoadAd = ((C10086l) c15389l.amazon).getValue();
        }
        return c15389l.subs().billing(objLoadAd) - fSmaato;
    }

    public InterfaceC7024l isVip(PublicKey publicKey) {
        String str = (String) this.f1957l;
        AbstractC16466l abstractC16466l = (AbstractC16466l) this.f1956l;
        if (!(publicKey instanceof ECPublicKey)) {
            C8339l.smaato("Check failed.");
            return null;
        }
        String name = ((ECGenParameterSpec) abstractC16466l.yandex(((ECPublicKey) publicKey).getParams()).getParameterSpec(ECGenParameterSpec.class)).getName();
        if (AbstractC8576l.yandex(str, name)) {
            return abstractC16466l.loadAd(publicKey);
        }
        C8936l.subs(AbstractC14814l.adcel("Key curve ", name, " is not equal to expected curve ", str));
        return null;
    }

    @Override // defpackage.InterfaceC3783l
    public synchronized void loadAd(C16528l c16528l) {
        ((C7865l) this.f1956l).crashlytics.loadAd(c16528l);
        while (c16528l != null) {
            C8099l c8099l = (C8099l) c16528l.f32302l;
            c8099l.getClass();
            m632else(c8099l);
            c16528l = (C16528l) c16528l.f32305l;
            if (c16528l == null || ((C8099l) c16528l.f32302l) == null) {
                c16528l = null;
            }
        }
    }

    @Override // defpackage.InterfaceC16451l
    public void metrica(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f1956l;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public int m636native() {
        C4685l c4685l = (C4685l) this.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        if (c4685l.yandex.isEmpty()) {
            return 0;
        }
        C4685l c4685l2 = (C4685l) this.f1957l;
        if (c4685l2 == null) {
            c4685l2 = null;
        }
        int i = ((C10824l) AbstractC16901l.m4231native(c4685l2.yandex)).firebase;
        C4685l c4685l3 = (C4685l) this.f1957l;
        int i2 = i + (-(c4685l3 != null ? c4685l3 : null).billing);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public int m637package() {
        C4685l c4685l = (C4685l) this.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        if (c4685l.yandex.isEmpty()) {
            return -1;
        }
        C4685l c4685l2 = (C4685l) this.f1957l;
        if (c4685l2 == null) {
            c4685l2 = null;
        }
        long j = ((C10824l) AbstractC16901l.m4231native(c4685l2.yandex)).yandex;
        C4685l c4685l3 = (C4685l) this.f1957l;
        long j2 = j - ((long) (c4685l3 != null ? c4685l3 : null).admob);
        if (j2 < 0) {
            j2 = 0;
        }
        return (int) j2;
    }

    public InterfaceC7024l premium(byte[] bArr) {
        AbstractC14910l abstractC14910l = (AbstractC14910l) this.f1958l;
        Object objYandex = abstractC14910l.yandex();
        try {
            return isVip(((KeyFactory) objYandex).generatePublic(new X509EncodedKeySpec(bArr)));
        } finally {
            abstractC14910l.loadAd(objYandex);
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public int m638private() {
        return ((Number) ((C4838l) this.f1958l).invoke()).intValue();
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        return new C6182l((C11610l) this.f1957l, (C0458l) this.f1958l, (C0908l) this.f1956l);
    }

    @Override // defpackage.InterfaceC10727l
    public float purchase(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC3783l
    public synchronized void remoteconfig() {
        ((C7865l) this.f1956l).crashlytics.remoteconfig();
    }

    @Override // defpackage.InterfaceC3783l
    public synchronized C8099l smaato() {
        C8099l c8099lSmaato;
        c8099lSmaato = ((C7865l) this.f1956l).crashlytics.smaato();
        ((HashMap) this.f1958l).put(c8099lSmaato, (C17849l) this.f1957l);
        C2492l c2492l = (C2492l) ((C7865l) this.f1956l).adcel.get((C17849l) this.f1957l);
        if (c2492l != null) {
            c2492l.yandex();
        }
        return c8099lSmaato;
    }

    @Override // defpackage.InterfaceC9762l
    public void startapp(Bundle bundle) {
        synchronized (this.f1957l) {
            try {
                C17334l c17334l = C17334l.f33646l;
                c17334l.m4318l("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f1956l = new CountDownLatch(1);
                ((C1770l) this.f1958l).startapp(bundle);
                c17334l.m4318l("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f1956l).await(500L, TimeUnit.MILLISECONDS)) {
                        c17334l.m4318l("App exception callback received from Analytics listener.");
                    } else {
                        c17334l.m4317l("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f1956l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7, types: [lًَؓ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [lؘؕٚ] */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m639static(List list) {
        C8195l c8195l;
        C8195l c8195l2;
        EnumC2771l enumC2771l = EnumC2771l.f6021l;
        EnumC2771l enumC2771l2 = EnumC2771l.f6020l;
        LinkedHashMap linkedHashMapAdmob = AbstractC3383l.admob(list, C2726l.f5920l);
        C4116l c4116l = C4116l.crashlytics;
        C4116l.crashlytics.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C9846l) it.next()).yandex);
        }
        if (hashSet.size() != list.size()) {
            StringBuilder sb = new StringBuilder("Configurations must be unique: ");
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C9846l) it2.next()).yandex);
            }
            sb.append(arrayList);
            sb.append('.');
            throw new IllegalStateException(sb.toString().toString());
        }
        LinkedHashMap linkedHashMapAdmob2 = AbstractC3383l.admob(((C13366l) this.f1956l).yandex, C18192l.f35633l);
        ArrayList<C8195l> arrayList2 = new ArrayList(linkedHashMapAdmob.size());
        for (Map.Entry entry : linkedHashMapAdmob.entrySet()) {
            C0648l c0648l = (C0648l) entry.getKey();
            C9846l c9846l = (C9846l) entry.getValue();
            InterfaceC7901l interfaceC7901l = (InterfaceC7901l) linkedHashMapAdmob2.get(c0648l);
            if (interfaceC7901l instanceof C3217l) {
                c8195l = new C8195l(interfaceC7901l, c9846l.loadAd);
            } else if (interfaceC7901l instanceof C8126l) {
                int iOrdinal = c9846l.loadAd.ordinal();
                if (iOrdinal == 0) {
                    c8195l = new C8195l(interfaceC7901l, c9846l.loadAd);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        C18725l.billing();
                        return;
                    }
                    C8126l c8126l = (C8126l) interfaceC7901l;
                    C3217l c3217lCrashlytics = AbstractC17344l.crashlytics((C12014l) this.f1958l, c9846l.yandex, c8126l.loadAd, c8126l.crashlytics, 8);
                    AbstractC18263l.billing(c3217lCrashlytics.amazon);
                    c8195l2 = new C8195l(c3217lCrashlytics, c9846l.loadAd);
                    c8195l = c8195l2;
                }
            } else {
                if (interfaceC7901l != null) {
                    C18725l.billing();
                    return;
                }
                int iOrdinal2 = c9846l.loadAd.ordinal();
                if (iOrdinal2 == 0) {
                    c8195l = new C8195l(new C8126l(c9846l.yandex, AbstractC0441l.admob().toString(), null), c9846l.loadAd);
                } else {
                    if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                        C18725l.billing();
                        return;
                    }
                    C3217l c3217lCrashlytics2 = AbstractC17344l.crashlytics((C12014l) this.f1958l, c9846l.yandex, AbstractC0441l.admob().toString(), null, 12);
                    AbstractC18263l.billing(c3217lCrashlytics2.amazon);
                    c8195l2 = new C8195l(c3217lCrashlytics2, c9846l.loadAd);
                    c8195l = c8195l2;
                }
            }
            arrayList2.add(c8195l);
        }
        Set setKeySet = linkedHashMapAdmob.keySet();
        for (Map.Entry entry2 : linkedHashMapAdmob2.entrySet()) {
            C0648l c0648l2 = (C0648l) entry2.getKey();
            InterfaceC7901l interfaceC7901l2 = (InterfaceC7901l) entry2.getValue();
            C3217l c3217l = interfaceC7901l2 instanceof C3217l ? (C3217l) interfaceC7901l2 : null;
            if (c3217l != null && !setKeySet.contains(c0648l2)) {
                c3217l.mopub.purchase();
                AbstractC18263l.mopub(c3217l.amazon);
                c3217l.billing.admob();
            }
        }
        C13366l c13366l = (C13366l) this.f1956l;
        c13366l.yandex.clear();
        for (C8195l c8195l3 : arrayList2) {
            ?? c8126l2 = (InterfaceC7901l) c8195l3.f17098l;
            EnumC17389l enumC17389l = (EnumC17389l) c8195l3.f17097l;
            ArrayList arrayList3 = c13366l.yandex;
            if (c8126l2 instanceof C3217l) {
                c8126l2 = (C3217l) c8126l2;
                C17873l c17873l = c8126l2.mopub;
                C17326l c17326l = c8126l2.amazon;
                int iOrdinal3 = enumC17389l.ordinal();
                if (iOrdinal3 == 0) {
                    C7695l c7695lM2834volatile = c8126l2.purchase.m2834volatile();
                    c8126l2.mopub.purchase();
                    AbstractC18263l.mopub(c8126l2.amazon);
                    c8126l2.billing.admob();
                    c8126l2 = new C8126l(c8126l2.yandex, c8126l2.loadAd, c7695lM2834volatile);
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3) {
                            C18725l.billing();
                            return;
                        } else if (((EnumC2771l) c17326l.f33636l) != enumC2771l2) {
                            c17873l.amazon();
                            AbstractC18263l.subs(c17326l);
                            if (((EnumC2771l) c17326l.f33636l) == enumC2771l) {
                                c17326l.amazon();
                            }
                        }
                    } else if (((EnumC2771l) c17326l.f33636l).compareTo(enumC2771l) < 0) {
                        c17873l.amazon();
                        AbstractC18263l.subs(c17326l);
                    } else if (((EnumC2771l) c17326l.f33636l).compareTo(enumC2771l) > 0 && ((EnumC2771l) c17326l.f33636l) == enumC2771l2) {
                        c17326l.purchase();
                    }
                } else if (((EnumC2771l) c17326l.f33636l) != EnumC2771l.f6017l) {
                    c17873l.purchase();
                    if (((EnumC2771l) c17326l.f33636l) == enumC2771l2) {
                        c17326l.purchase();
                    }
                    if (((EnumC2771l) c17326l.f33636l) == enumC2771l) {
                        c17326l.loadAd();
                    }
                }
            } else if (!(c8126l2 instanceof C8126l)) {
                C18725l.billing();
                return;
            }
            arrayList3.add(c8126l2);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public int m640strictfp() {
        C4685l c4685l = (C4685l) this.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        if (c4685l.yandex.isEmpty()) {
            return -1;
        }
        C4685l c4685l2 = (C4685l) this.f1957l;
        if (c4685l2 == null) {
            c4685l2 = null;
        }
        long j = ((C10824l) AbstractC16901l.m4214continue(c4685l2.yandex)).yandex;
        C4685l c4685l3 = (C4685l) this.f1957l;
        long j2 = j + ((long) (c4685l3 != null ? c4685l3 : null).admob);
        long jM638private = ((long) m638private()) - 1;
        if (j2 > jM638private) {
            j2 = jM638private;
        }
        return (int) j2;
    }

    @Override // defpackage.InterfaceC1554l
    public Uri subs() {
        return (Uri) this.f1956l;
    }

    public C6533l subscription() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lYandex;
        C6023l c6023l = (C6023l) this.f1958l;
        if (c6023l == null || (c7972l = (C7972l) this.f1957l) == null) {
            C18262l.ads("Cannot build without parameters and/or key material");
            return null;
        }
        if (c6023l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c6023l.yandex() && ((Integer) this.f1956l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C6023l) this.f1958l).yandex() && ((Integer) this.f1956l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C1693l c1693l = ((C6023l) this.f1958l).crashlytics;
        if (c1693l == C1693l.f4075l) {
            c0346lYandex = AbstractC17168l.yandex;
        } else if (c1693l == C1693l.f4072l || c1693l == C1693l.f4073l) {
            c0346lYandex = AbstractC17168l.yandex(((Integer) this.f1956l).intValue());
        } else {
            if (c1693l != C1693l.f4068l) {
                C8339l.smaato("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(c1693l)));
                return null;
            }
            c0346lYandex = AbstractC17168l.loadAd(((Integer) this.f1956l).intValue());
        }
        return new C6533l((C6023l) this.f1958l, (C7972l) this.f1957l, c0346lYandex, (Integer) this.f1956l);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void mo641switch(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = (BaseInputConnection) this.f1956l;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection((View) this.f1958l, false);
            this.f1956l = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean m642synchronized() {
        C4685l c4685l = (C4685l) this.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        return !c4685l.yandex.isEmpty();
    }

    public C18441l tapsense() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lLoadAd;
        C16816l c16816l = (C16816l) this.f1958l;
        if (c16816l == null || (c7972l = (C7972l) this.f1957l) == null) {
            C18262l.ads("Cannot build without parameters and/or key material");
            return null;
        }
        if (c16816l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c16816l.yandex() && ((Integer) this.f1956l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C16816l) this.f1958l).yandex() && ((Integer) this.f1956l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C5138l c5138l = ((C16816l) this.f1958l).amazon;
        if (c5138l == C5138l.f11178l) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c5138l == C5138l.f11179l) {
            c0346lLoadAd = AbstractC17168l.yandex(((Integer) this.f1956l).intValue());
        } else {
            if (c5138l != C5138l.f11176l) {
                C8339l.smaato("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(c5138l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(((Integer) this.f1956l).intValue());
        }
        return new C18441l((C16816l) this.f1958l, (C7972l) this.f1957l, c0346lLoadAd, (Integer) this.f1956l);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public String m643throw() {
        if (!m634for()) {
            C4875l.firebase();
            return null;
        }
        String str = (String) this.f1956l;
        this.f1956l = null;
        return str;
    }

    @Override // defpackage.InterfaceC1361l
    /* JADX INFO: renamed from: throws */
    public InterfaceC10506l mo489throws() {
        return (C6334l) this.f1958l;
    }

    @Override // defpackage.InterfaceC1554l
    public Object vip() {
        return null;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public int m644volatile() {
        C4685l c4685l = (C4685l) this.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        if (c4685l.yandex.isEmpty()) {
            return 0;
        }
        C4685l c4685l2 = (C4685l) this.f1957l;
        if (c4685l2 == null) {
            c4685l2 = null;
        }
        int i = ((C10824l) AbstractC16901l.m4214continue(c4685l2.yandex)).firebase;
        C4685l c4685l3 = (C4685l) this.f1957l;
        return Math.abs(((i + (c4685l3 != null ? c4685l3 : null).loadAd) + (c4685l3 != null ? c4685l3 : null).crashlytics) - (c4685l3 != null ? c4685l3 : null).mopub);
    }

    @Override // defpackage.InterfaceC1554l
    public ClipDescription yandex() {
        return (ClipDescription) this.f1957l;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void mo635interface() {
    }

    @Override // defpackage.InterfaceC1554l
    public void mopub() {
    }

    public /* synthetic */ C0554l(Object obj, Object obj2, Object obj3) {
        this.f1958l = obj;
        this.f1957l = obj2;
        this.f1956l = obj3;
    }

    public /* synthetic */ C0554l(Object obj) {
        this.f1958l = obj;
    }

    public C0554l(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f1957l = arrayDeque;
        this.f1958l = bufferedReader;
    }
}
