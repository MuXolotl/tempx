package defpackage;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؗٛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5008l implements InterfaceC10130l, InterfaceC1076l, InterfaceC1173l, InterfaceC8145l, InterfaceC8475l, InterfaceC10952l, InterfaceC8699l, InterfaceC10466l, InterfaceC17215l, InterfaceC10153l, InterfaceC14209l, InterfaceC18080l, InterfaceC1775l, InterfaceC6784l, InterfaceC12202l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f10245l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10246l;

    public C5008l(int i) {
        this.f10246l = i;
        switch (i) {
            case 6:
                this.f10245l = AbstractC15300l.billing(Looper.getMainLooper());
                break;
            case 11:
                this.f10245l = null;
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
            case 16:
                this.f10245l = new C13143l();
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6295l c6295l = AbstractC13087l.yandex;
                this.f10245l = new C6295l();
                break;
            case 22:
                this.f10245l = new ByteArrayOutputStream();
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f10245l = new C3823l();
                break;
            default:
                this.f10245l = new C0093l(C3097l.smaato);
                break;
        }
    }

    public static int Signature(int i, byte[] bArr) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    public static int applovin(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    public static int appmetrica(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = ((i5 * i2) + i4) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = ((i6 * i4) + i2) & 65535;
        }
        return (1 - i2) & 65535;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static void m1659native(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static C5008l premium(C2434l c2434l, C1461l c1461l) {
        String str;
        C2421l c2421l;
        C9173l c9173l = c2434l.loadAd;
        HashSet hashSet = new HashSet();
        boolean z = c2434l.crashlytics;
        if (c2434l.amazon < 1) {
            hashSet.add(EnumC8068l.f16814l);
        }
        if (!c2434l.yandex() && c9173l == null) {
            hashSet.add(EnumC8068l.f16813l);
        } else if (c2434l.yandex() && c9173l != null) {
            hashSet.add(EnumC8068l.f16806l);
        }
        if (c2434l.yandex()) {
            if (!z) {
                hashSet.add(EnumC8068l.f16821l);
            }
            C15019l c15019l = c2434l.yandex;
            for (C4246l c4246l : c15019l.yandex) {
                String str2 = c4246l.yandex;
                C12431l c12431l = c4246l.loadAd;
                if (str2 == null || str2.isEmpty()) {
                    hashSet.add(EnumC8068l.f16828l);
                }
                if (c12431l != null) {
                    if (c12431l.yandex == -1) {
                        hashSet.add(EnumC8068l.f16815l);
                    }
                    if (c12431l.loadAd < -1) {
                        hashSet.add(EnumC8068l.f16809l);
                    }
                }
            }
            for (C8205l c8205l : c15019l.loadAd) {
                String str3 = c8205l.mopub;
                if (str3 == null || str3.isEmpty()) {
                    hashSet.add(EnumC8068l.f16808l);
                }
                if (c8205l.yandex == -1) {
                    hashSet.add(EnumC8068l.f16804l);
                }
                if (c8205l.loadAd < -1) {
                    hashSet.add(EnumC8068l.f16829l);
                }
            }
            for (C9221l c9221l : c15019l.crashlytics) {
                EnumC7009l enumC7009l = c9221l.yandex;
                String str4 = c9221l.isPro;
                if (enumC7009l == null) {
                    hashSet.add(EnumC8068l.f16807l);
                }
                if (c9221l.crashlytics == null) {
                    hashSet.add(EnumC8068l.f16810l);
                }
                if (c9221l.billing == null) {
                    hashSet.add(EnumC8068l.f16824l);
                }
                EnumC7009l enumC7009l2 = EnumC7009l.CLOSED_CAPTIONS;
                if (enumC7009l == enumC7009l2) {
                    String str5 = c9221l.loadAd;
                    if (str5 != null && !str5.isEmpty()) {
                        hashSet.add(EnumC8068l.f16818l);
                    }
                    if (str4 == null) {
                        hashSet.add(EnumC8068l.f16826l);
                    }
                } else if (enumC7009l != enumC7009l2 && str4 != null) {
                    hashSet.add(EnumC8068l.f16823l);
                }
                if (c9221l.mopub && !c9221l.admob) {
                    hashSet.add(EnumC8068l.f16805l);
                }
                if (enumC7009l != EnumC7009l.SUBTITLES && c9221l.subs) {
                    hashSet.add(EnumC8068l.f16827l);
                }
            }
        }
        if (c9173l != null) {
            if (z && (c2421l = c9173l.admob) != null && Float.isNaN(c2421l.yandex)) {
                hashSet.add(EnumC8068l.f16820l);
            }
            List<C0657l> list = c9173l.yandex;
            HashSet hashSet2 = new HashSet();
            for (C0657l c0657l : list) {
                C8379l c8379l = c0657l.mopub;
                if (c8379l != null) {
                    boolean z2 = c8379l.loadAd != null;
                    String str6 = c0657l.yandex;
                    if (z2) {
                        hashSet2.add(str6);
                    } else if (!hashSet2.contains(str6)) {
                        hashSet.add(EnumC8068l.f16817l);
                    }
                }
            }
            for (C0657l c0657l2 : c9173l.yandex) {
                String str7 = c0657l2.yandex;
                C11520l c11520l = c0657l2.loadAd;
                if (str7 == null || str7.isEmpty()) {
                    hashSet.add(EnumC8068l.f16819l);
                }
                if (z && c11520l == null) {
                    hashSet.add(EnumC8068l.f16811l);
                }
                C4273l c4273l = c0657l2.crashlytics;
                if (c4273l != null && c4273l.yandex == null) {
                    hashSet.add(EnumC8068l.f16825l);
                }
                if (c11520l != null) {
                    c1461l.getClass();
                    if (c11520l.yandex < 0.0f) {
                        hashSet.add(EnumC8068l.f16816l);
                    }
                }
                C1790l c1790l = c0657l2.billing;
                if (c1790l != null && ((str = c1790l.yandex) == null || str.isEmpty())) {
                    hashSet.add(EnumC8068l.f16812l);
                }
            }
        }
        return new C5008l(hashSet);
    }

    public static int[] signatures(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = Signature(i2 * 2, bArr);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    public static int subscription(int i) {
        return (0 - i) & 65535;
    }

    public void ad(float f) {
        ((Parcel) this.f10245l).writeFloat(f);
    }

    @Override // defpackage.InterfaceC18080l
    public float adcel(float f, float f2) {
        C4033l c4033l = (C4033l) this.f10245l;
        double dLoadAd = c4033l.loadAd(f2);
        double d = AbstractC12964l.yandex;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dLoadAd) * ((double) (c4033l.f8314l * c4033l.f8313l))))) + f;
    }

    @Override // defpackage.InterfaceC10130l
    public void admob(int i, int i2) {
        ((AbstractC14630l) this.f10245l).remoteconfig(i, i2);
    }

    @Override // defpackage.InterfaceC10130l
    public void ads(int i, int i2) {
        ((AbstractC14630l) this.f10245l).f465l.amazon(i, i2, null);
    }

    public void advert(long j) {
        long jLoadAd = C1794l.loadAd(j);
        byte b = 0;
        if (!C12735l.yandex(jLoadAd, 0L)) {
            if (C12735l.yandex(jLoadAd, 4294967296L)) {
                b = 1;
            } else if (C12735l.yandex(jLoadAd, 8589934592L)) {
                b = 2;
            }
        }
        pro(b);
        if (C12735l.yandex(C1794l.loadAd(j), 0L)) {
            return;
        }
        ad(C1794l.crashlytics(j));
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        if (((C1041l) this.f10245l).f2889l) {
            Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
        }
    }

    @Override // defpackage.InterfaceC1173l
    public void billing(MenuC4984l menuC4984l, MenuItem menuItem) {
        ((ViewOnKeyListenerC8334l) this.f10245l).f17257l.removeCallbacksAndMessages(menuC4984l);
    }

    @Override // defpackage.InterfaceC8475l
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10245l;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.InterfaceC10130l
    public void crashlytics(int i, int i2) {
        ((AbstractC14630l) this.f10245l).smaato(i, i2);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m1663extends(byte[] bArr) {
        m1672volatile(bArr.length);
        try {
            ((ByteArrayOutputStream) this.f10245l).write(bArr);
        } catch (IOException e) {
            C4875l.remoteconfig(e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC18080l
    public float firebase(float f, float f2, long j) {
        long j2 = j / 1000000;
        C18509l c18509lYandex = ((C4033l) this.f10245l).yandex(f2);
        long j3 = c18509lYandex.crashlytics;
        return (Math.signum(c18509lYandex.yandex) * c18509lYandex.loadAd * AbstractC6039l.yandex(j3 > 0 ? j2 / j3 : 1.0f).yandex) + f;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C9171l((Context) ((C14461l) this.f10245l).f28328l);
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        int[] iArrSignatures;
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to IDEA init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (z) {
            iArrSignatures = signatures(bArr);
        } else {
            int[] iArrSignatures2 = signatures(bArr);
            int[] iArr = new int[52];
            int iAppmetrica = appmetrica(iArrSignatures2[0]);
            int iSubscription = subscription(iArrSignatures2[1]);
            int iSubscription2 = subscription(iArrSignatures2[2]);
            iArr[51] = appmetrica(iArrSignatures2[3]);
            iArr[50] = iSubscription2;
            iArr[49] = iSubscription;
            int i = 48;
            iArr[48] = iAppmetrica;
            int i2 = 4;
            for (int i3 = 1; i3 < 8; i3++) {
                int i4 = iArrSignatures2[i2];
                iArr[i - 1] = iArrSignatures2[i2 + 1];
                iArr[i - 2] = i4;
                int iAppmetrica2 = appmetrica(iArrSignatures2[i2 + 2]);
                int iSubscription3 = subscription(iArrSignatures2[i2 + 3]);
                int i5 = i2 + 5;
                int iSubscription4 = subscription(iArrSignatures2[i2 + 4]);
                i2 += 6;
                iArr[i - 3] = appmetrica(iArrSignatures2[i5]);
                iArr[i - 4] = iSubscription3;
                iArr[i - 5] = iSubscription4;
                i -= 6;
                iArr[i] = iAppmetrica2;
            }
            int i6 = iArrSignatures2[i2];
            iArr[i - 1] = iArrSignatures2[i2 + 1];
            iArr[i - 2] = i6;
            int iAppmetrica3 = appmetrica(iArrSignatures2[i2 + 2]);
            int iSubscription5 = subscription(iArrSignatures2[i2 + 3]);
            int iSubscription6 = subscription(iArrSignatures2[i2 + 4]);
            iArr[i - 3] = appmetrica(iArrSignatures2[i2 + 5]);
            iArr[i - 4] = iSubscription6;
            iArr[i - 5] = iSubscription5;
            iArr[i - 6] = iAppmetrica3;
            iArrSignatures = iArr;
        }
        this.f10245l = iArrSignatures;
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    public C6871l inmobi(JSONObject jSONObject) throws JSONException {
        InterfaceC0248l c16222l;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c16222l = new C17334l(28);
        } else {
            c16222l = new C16222l(10);
        }
        return c16222l.mo368extends((C15655l) this.f10245l, jSONObject);
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    public void isVip() {
        Socket socket;
        C0093l c0093l = (C0093l) this.f10245l;
        Iterator it = ((ConcurrentLinkedQueue) c0093l.f1007l).iterator();
        while (it.hasNext()) {
            C13247l c13247l = (C13247l) it.next();
            synchronized (c13247l) {
                if (c13247l.startapp.isEmpty()) {
                    it.remove();
                    c13247l.isPro = true;
                    socket = c13247l.purchase;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC11432l.crashlytics(socket);
            }
        }
        if (((ConcurrentLinkedQueue) c0093l.f1007l).isEmpty()) {
            ((C7522l) c0093l.f1005l).yandex();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 8;
    }

    @Override // defpackage.InterfaceC1775l
    public boolean loadAd(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f10245l;
        if (!swipeDismissBehavior.subscription()) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.amazon;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        if ("b".equals(c3498l.loadAd())) {
            return new C9348l(this, 2);
        }
        return null;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        return null;
    }

    @Override // defpackage.InterfaceC18080l
    public long metrica(float f) {
        return ((long) (Math.exp(((C4033l) this.f10245l).loadAd(f) / (((double) AbstractC12964l.yandex) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.InterfaceC18080l
    public float mopub() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC6784l
    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar toolbar = (Toolbar) this.f10245l;
        if (toolbar.f262l.license()) {
            return true;
        }
        InterfaceC3404l interfaceC3404l = toolbar.f266l;
        if (interfaceC3404l == null) {
            return false;
        }
        ((C3787l) ((C2683l) interfaceC3404l).f5813l).invoke();
        return true;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m1669private(BigInteger bigInteger) {
        m1663extends(bigInteger.toByteArray());
    }

    public void pro(byte b) {
        ((Parcel) this.f10245l).writeByte(b);
    }

    @Override // defpackage.InterfaceC8145l
    public C18595l purchase() {
        int i = 7;
        switch (this.f10246l) {
            case 5:
                BigInteger bigInteger = AbstractC16779l.yandex;
                C0833l c0833l = (C0833l) this.f10245l;
                C2396l c2396l = c0833l.f2480l;
                BigInteger bigIntegerYandex = AbstractC16779l.yandex(c2396l, (SecureRandom) c0833l.f28907l);
                return new C18595l(new C7438l(c2396l.f5159l.modPow(bigIntegerYandex, c2396l.f5158l), c2396l), new C12029l(bigIntegerYandex, c2396l), i);
            default:
                C16638l c16638l = new C16638l((SecureRandom) this.f10245l);
                return new C18595l(c16638l.yandex(), c16638l, i);
        }
    }

    @Override // defpackage.InterfaceC10130l
    public void remoteconfig(int i, int i2) {
        ((AbstractC14630l) this.f10245l).metrica(i, i2);
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
        int i = this.f10246l;
    }

    @Override // defpackage.InterfaceC8475l
    public Cursor smaato(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10245l;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC17215l
    public void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        C17456l c17456lYandex;
        C13143l c13143l = (C13143l) this.f10245l;
        c13143l.m3565private(i2 + i, bArr);
        c13143l.m3562for(i);
        ArrayList arrayList = new ArrayList();
        while (c13143l.yandex() > 0) {
            AbstractC12442l.subs(c13143l.yandex() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iRemoteconfig = c13143l.remoteconfig();
            if (c13143l.remoteconfig() == 1987343459) {
                int i3 = iRemoteconfig - 8;
                CharSequence charSequenceBilling = null;
                C13116l c13116lYandex = null;
                while (i3 > 0) {
                    AbstractC12442l.subs(i3 >= 8, "Incomplete vtt cue box header found.");
                    int iRemoteconfig2 = c13143l.remoteconfig();
                    int iRemoteconfig3 = c13143l.remoteconfig();
                    int i4 = iRemoteconfig2 - 8;
                    byte[] bArr2 = c13143l.yandex;
                    int i5 = c13143l.loadAd;
                    String str = AbstractC15323l.yandex;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    c13143l.m3568throw(i4);
                    i3 = (i3 - 8) - i4;
                    if (iRemoteconfig3 == 1937011815) {
                        C1291l c1291l = new C1291l();
                        AbstractC14398l.purchase(str2, c1291l);
                        c13116lYandex = c1291l.yandex();
                    } else if (iRemoteconfig3 == 1885436268) {
                        charSequenceBilling = AbstractC14398l.billing(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceBilling == null) {
                    charSequenceBilling = "";
                }
                if (c13116lYandex != null) {
                    c13116lYandex.yandex = charSequenceBilling;
                    c13116lYandex.loadAd = null;
                    c17456lYandex = c13116lYandex.yandex();
                } else {
                    Pattern pattern = AbstractC14398l.yandex;
                    C1291l c1291l2 = new C1291l();
                    c1291l2.crashlytics = charSequenceBilling;
                    c17456lYandex = c1291l2.yandex().yandex();
                }
                arrayList.add(c17456lYandex);
            } else {
                c13143l.m3568throw(iRemoteconfig - 8);
            }
        }
        interfaceC18679l.accept(new C8755l(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.InterfaceC8699l
    /* JADX INFO: renamed from: static */
    public int mo235static(char[] cArr, int i, int i2) {
        return ((C11584l) this.f10245l).yandex(cArr, i, i2);
    }

    @Override // defpackage.InterfaceC18080l
    public float subs(float f, long j) {
        long j2 = j / 1000000;
        C18509l c18509lYandex = ((C4033l) this.f10245l).yandex(f);
        long j3 = c18509lYandex.crashlytics;
        return (((Math.signum(c18509lYandex.yandex) * AbstractC6039l.yandex(j3 > 0 ? j2 / j3 : 1.0f).loadAd) * c18509lYandex.loadAd) / j3) * 1000.0f;
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        ((C2397l) this.f10245l).subs(c18389l);
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f10245l;
        int i3 = 0;
        if (iArr == null) {
            C8339l.smaato("IDEA engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        int iSignature = Signature(i, bArr);
        int iSignature2 = Signature(i + 2, bArr);
        int iSignature3 = Signature(i + 4, bArr);
        int iSignature4 = Signature(i + 6, bArr);
        int i4 = 0;
        while (i3 < 8) {
            int iApplovin = applovin(iSignature, iArr[i4]);
            int i5 = (iSignature2 + iArr[i4 + 1]) & 65535;
            int i6 = (iSignature3 + iArr[i4 + 2]) & 65535;
            int iApplovin2 = applovin(iSignature4, iArr[i4 + 3]);
            int i7 = i4 + 5;
            int iApplovin3 = applovin(i6 ^ iApplovin, iArr[i4 + 4]);
            i4 += 6;
            int iApplovin4 = applovin(((i5 ^ iApplovin2) + iApplovin3) & 65535, iArr[i7]);
            int i8 = 65535 & (iApplovin3 + iApplovin4);
            iSignature = iApplovin ^ iApplovin4;
            iSignature4 = iApplovin2 ^ i8;
            int i9 = i6 ^ iApplovin4;
            i3++;
            iSignature3 = i5 ^ i8;
            iSignature2 = i9;
        }
        m1659native(applovin(iSignature, iArr[i4]), i2, bArr2);
        m1659native(iSignature3 + iArr[i4 + 1], i2 + 2, bArr2);
        m1659native(iSignature2 + iArr[i4 + 2], i2 + 4, bArr2);
        m1659native(applovin(iSignature4, iArr[i4 + 3]), i2 + 6, bArr2);
        return 8;
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void mo1671throw(IOException iOException) {
        C2397l c2397l = (C2397l) this.f10245l;
        if (c2397l.signatures()) {
            return;
        }
        c2397l.subs(new C18435l(iOException));
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public void mo274throws(C14785l c14785l) {
        switch (this.f10246l) {
            case 5:
                C0833l c0833l = (C0833l) c14785l;
                this.f10245l = c0833l;
                AbstractC16336l.purchase(c0833l.f2480l.f5158l);
                C2396l c2396l = ((C0833l) this.f10245l).f2480l;
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
            default:
                this.f10245l = (SecureRandom) c14785l.f28907l;
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
        }
    }

    public String toString() {
        switch (this.f10246l) {
            case 0:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.f10245l) + ')';
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f10245l).flattenToShortString() + " }";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                StringBuilder sb = new StringBuilder("(PlaylistValidation valid=");
                Set set = (Set) this.f10245l;
                sb.append(set.isEmpty());
                sb.append(" errors=");
                sb.append(set);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1076l
    /* JADX INFO: renamed from: try */
    public boolean mo248try(MenuC4984l menuC4984l) {
        Window.Callback callback;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) this.f10245l;
        if (menuC4984l != menuC4984l.firebase() || !layoutInflaterFactory2C14405l.f28188l || (callback = layoutInflaterFactory2C14405l.f28203l.getCallback()) == null || layoutInflaterFactory2C14405l.f28172l) {
            return true;
        }
        callback.onMenuOpened(108, menuC4984l);
        return true;
    }

    @Override // defpackage.InterfaceC1173l
    public void vip(MenuC4984l menuC4984l, C17858l c17858l) {
        ViewOnKeyListenerC8334l viewOnKeyListenerC8334l = (ViewOnKeyListenerC8334l) this.f10245l;
        Handler handler = viewOnKeyListenerC8334l.f17257l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC8334l.f17243l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC4984l == ((C11095l) arrayList.get(i)).loadAd) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC16843l(this, i2 < arrayList.size() ? (C11095l) arrayList.get(i2) : null, c17858l, menuC4984l, 0), menuC4984l, SystemClock.uptimeMillis() + 200);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m1672volatile(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f10245l;
        byteArrayOutputStream.write((i >>> 24) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write(i & 255);
    }

    @Override // defpackage.InterfaceC1076l
    public void yandex(MenuC4984l menuC4984l, boolean z) {
        C9491l c9491l;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) this.f10245l;
        MenuC4984l menuC4984lFirebase = menuC4984l.firebase();
        int i = 0;
        boolean z2 = menuC4984lFirebase != menuC4984l;
        if (z2) {
            menuC4984l = menuC4984lFirebase;
        }
        C9491l[] c9491lArr = layoutInflaterFactory2C14405l.f28202l;
        int length = c9491lArr != null ? c9491lArr.length : 0;
        while (true) {
            if (i < length) {
                c9491l = c9491lArr[i];
                if (c9491l != null && c9491l.admob == menuC4984l) {
                    break;
                } else {
                    i++;
                }
            } else {
                c9491l = null;
                break;
            }
        }
        if (c9491l != null) {
            if (!z2) {
                layoutInflaterFactory2C14405l.Signature(c9491l, z);
            } else {
                layoutInflaterFactory2C14405l.subscription(c9491l.yandex, c9491l, menuC4984lFirebase);
                layoutInflaterFactory2C14405l.Signature(c9491l, true);
            }
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    private final void m1660package() {
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    private final /* synthetic */ void m1661strictfp() {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void mo1662abstract() {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public void mo1665l(C3498l c3498l, Object obj) {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
    }

    public /* synthetic */ C5008l(int i, boolean z) {
        this.f10246l = i;
    }

    public /* synthetic */ C5008l(C1062l c1062l, C1041l c1041l) {
        this.f10246l = 29;
        this.f10245l = c1041l;
    }

    public C5008l(HashSet hashSet) {
        this.f10246l = 18;
        this.f10245l = DesugarCollections.unmodifiableSet(hashSet);
    }

    public C5008l(InterfaceC13490l interfaceC13490l) {
        this.f10246l = 24;
        float f = AbstractC0310l.yandex;
        C4033l c4033l = new C4033l();
        c4033l.f8314l = f;
        float fLoadAd = interfaceC13490l.loadAd();
        float f2 = AbstractC12964l.yandex;
        c4033l.f8313l = fLoadAd * 386.0878f * 160.0f * 0.84f;
        this.f10245l = c4033l;
    }

    public /* synthetic */ C5008l(int i, Object obj) {
        this.f10246l = i;
        this.f10245l = obj;
    }

    public C5008l(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f10246l = 10;
        this.f10245l = new GestureDetector(context, simpleOnGestureListener, null);
    }

    public C5008l(InputStream inputStream) {
        this.f10246l = 12;
        this.f10245l = new C11584l(inputStream, AbstractC9050l.yandex);
    }

    public C5008l(Context context, Uri uri) {
        this.f10246l = 9;
        this.f10245l = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
