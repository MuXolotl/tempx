package defpackage;

import android.R;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import ua.itaysonlab.vkxnative.BundleNativeClass;

/* JADX INFO: renamed from: lٍٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C14785l implements InterfaceC1775l, InterfaceC9576l, InterfaceC14224l, InterfaceC17475l, InterfaceC2232l, InterfaceC13055l, InterfaceC9474l, InterfaceC10110l, InterfaceC9432l, InterfaceC9526l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f28907l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f28908l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28909l;

    public C14785l(byte b, int i) {
        this.f28909l = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f28907l = new LinkedHashMap();
                break;
            case 23:
                this.f28907l = new C13143l(8);
                break;
            default:
                this.f28908l = 255;
                this.f28907l = null;
                break;
        }
    }

    public static void remoteconfig(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = AbstractC8576l.subs(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void Signature(int i, C5101l c5101l) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C5101l c5101l2 = ((C5101l[]) this.f28907l)[i2];
            if (AbstractC8576l.isPro(0L, c5101l.mopub - c5101l2.mopub) <= 0) {
                break;
            }
            c5101l2.billing = i;
            ((C5101l[]) this.f28907l)[i] = c5101l2;
            i = i2;
        }
        ((C5101l[]) this.f28907l)[i] = c5101l;
        c5101l.billing = i;
    }

    public void ad(C5101l c5101l) {
        C5101l c5101l2;
        int i = c5101l.billing;
        if (i == -1) {
            C8339l.metrica("Failed requirement.");
            return;
        }
        int i2 = this.f28908l;
        C5101l[] c5101lArr = (C5101l[]) this.f28907l;
        C5101l c5101l3 = c5101lArr[i2];
        c5101l.billing = -1;
        c5101lArr[i2] = null;
        this.f28908l = i2 - 1;
        if (c5101l == c5101l3) {
            return;
        }
        int iIsPro = AbstractC8576l.isPro(0L, c5101l3.mopub - c5101l.mopub);
        if (iIsPro == 0) {
            ((C5101l[]) this.f28907l)[i] = c5101l3;
            c5101l3.billing = i;
            return;
        }
        if (iIsPro >= 0) {
            Signature(i, c5101l3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f28908l;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                } else {
                    c5101l2 = ((C5101l[]) this.f28907l)[i3];
                }
            } else {
                C5101l[] c5101lArr2 = (C5101l[]) this.f28907l;
                c5101l2 = c5101lArr2[i3];
                C5101l c5101l4 = c5101lArr2[i4];
                if (AbstractC8576l.isPro(0L, c5101l4.mopub - c5101l2.mopub) >= 0) {
                    c5101l2 = c5101l4;
                }
            }
            if (AbstractC8576l.isPro(0L, c5101l2.mopub - c5101l3.mopub) <= 0) {
                break;
            }
            int i6 = c5101l2.billing;
            c5101l2.billing = i;
            ((C5101l[]) this.f28907l)[i] = c5101l2;
            i = i6;
        }
        ((C5101l[]) this.f28907l)[i] = c5101l3;
        c5101l3.billing = i;
    }

    @Override // defpackage.InterfaceC13055l
    public int adcel() {
        if (((MediaCodecInfo[]) this.f28907l) == null) {
            this.f28907l = new MediaCodecList(this.f28908l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f28907l).length;
    }

    public void admob() {
        int i = this.f28908l;
        this.f28908l = i + 1;
        if (i >= 10) {
            this.f28908l = 0;
            Iterator it = ((LinkedHashMap) this.f28907l).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    C15766l c15766l = (C15766l) AbstractC16901l.m4217extends(arrayList);
                    if ((c15766l != null ? (InterfaceC1286l) c15766l.yandex.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((C15766l) arrayList.get(i4)).yandex.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public String ads() {
        BundleNativeClass bundleNativeClass = (BundleNativeClass) this.f28907l;
        int i = this.f28908l;
        Object[] objArr = bundleNativeClass.yandex;
        if (objArr.length - 1 < i) {
            C6541l.mopub(i, " size mismatch", "idx ");
            return null;
        }
        Object obj = objArr[i];
        if (obj == null) {
            C6541l.mopub(i, " is empty", "idx ");
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        C6541l.mopub(i, " type mismatch", "idx ");
        return null;
    }

    public void advert(C1791l c1791l, InterfaceC1286l interfaceC1286l, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28907l;
        Object arrayList = linkedHashMap.get(c1791l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c1791l, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        C15766l c15766l = new C15766l(new WeakReference(interfaceC1286l), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(c15766l);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C15766l c15766l2 = (C15766l) arrayList2.get(i);
                if (j >= c15766l2.crashlytics) {
                    if (c15766l2.yandex.get() == interfaceC1286l) {
                        arrayList2.set(i, c15766l);
                        break;
                    } else {
                        arrayList2.add(i, c15766l);
                        break;
                    }
                }
            }
        }
        admob();
    }

    @Override // defpackage.InterfaceC14224l
    public int amazon() {
        switch (this.f28909l) {
            case 4:
                break;
        }
        return this.f28908l;
    }

    @Override // defpackage.InterfaceC9432l
    public InterfaceC13081l billing(C16150l c16150l) {
        return new C1381l(this, c16150l);
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        return ((C1424l) this.f28907l).m945l(this.f28908l);
    }

    @Override // defpackage.InterfaceC14224l
    public byte[] crashlytics(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int i = this.f28909l;
        byte[] bArr5 = AbstractC13457l.yandex;
        boolean z = false;
        switch (i) {
            case 4:
                return AbstractC17265l.amazon(bArr2, bArr3, metrica(bArr).yandex(bArr4, bArr5));
            default:
                C18449l c18449l = new C18449l(5, z);
                c18449l.f36009l = null;
                c18449l.f36012l = null;
                c18449l.f36010l = (C18563l) this.f28907l;
                c18449l.f36009l = new C7972l(24, C0346l.yandex(bArr));
                C5925l c5925lAdvert = c18449l.advert();
                return AbstractC17265l.amazon(bArr2, bArr3, new C6976l(((C0346l) c5925lAdvert.subs.f16631l).loadAd(), c5925lAdvert.isPro).yandex(bArr4, bArr5));
        }
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: default */
    public ListenableFuture mo1118default(C3852l c3852l) {
        ListenableFuture listenableFutureMo1118default = ((InterfaceC9474l) this.f28907l).mo1118default(c3852l);
        if (listenableFutureMo1118default == null) {
            return null;
        }
        return AbstractC7151l.mopub(listenableFutureMo1118default, new C12023l(3, this), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        try {
            return ((C13237l) this.f28907l).doFinal(bArr, 0);
        } catch (C10352l e) {
            C8936l.subs(e);
            return 0;
        }
    }

    @Override // defpackage.InterfaceC13055l
    public boolean firebase(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        Map mapSingletonMap;
        String string;
        C5954l c5954l = (C5954l) this.f28907l;
        int i = this.f28908l;
        int i2 = 1;
        C2009l c2009l = null;
        int i3 = 0;
        switch (i) {
            case 0:
                return new C5172l((InterfaceC7042l) c5954l.amazon.get());
            case 1:
                return AbstractC11174l.yandex();
            case 2:
                return new C7615l((C10523l) c5954l.pro.get());
            case 3:
                C3026l c3026l = (C3026l) c5954l.yandex.f22121l;
                C14785l c14785l = c5954l.license;
                Context contextYandex = c5954l.yandex();
                C11969l c11969l = (C11969l) c5954l.billing.get();
                C5172l c5172l = (C5172l) c5954l.purchase.get();
                C7972l c7972l = c3026l.amazon;
                c7972l.getClass();
                Map map = (Map) c7972l.f16631l;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    InterfaceC11220l interfaceC11220l = (InterfaceC11220l) c14785l.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    if (map.containsKey(new C1594l(str))) {
                        C8936l.firebase(C1594l.yandex("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                        return null;
                    }
                    C1594l c1594l = new C1594l(str);
                    C9903l c9903l = new C9903l(interfaceC11220l);
                    if (map.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(c1594l, c9903l);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(c1594l, c9903l);
                        mapSingletonMap = linkedHashMap;
                    }
                    if (mapSingletonMap.containsKey(new C1594l(str))) {
                        return new C10523l("CXCP-Camera2", mapSingletonMap, contextYandex, c11969l, c5172l);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) C1594l.yandex("CXCP-Camera2"));
                    C18353l.adcel(sb, " in the list of available CameraPipe backends! Available values are ", mapSingletonMap.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                C11969l c11969l2 = (C11969l) c5954l.billing.get();
                C14232l c14232l = (C14232l) c5954l.firebase.get();
                C10596l c10596l = (C10596l) c5954l.vip.get();
                C2182l c2182l = (C2182l) c5954l.Signature.get();
                C15053l c15053l = new C15053l(c5954l);
                c5954l.yandex();
                return new C1663l(c11969l2, c14232l, c10596l, c2182l, c15053l);
            case 5:
                C7221l c7221l = c5954l.loadAd;
                C5172l c5172l2 = (C5172l) c5954l.purchase.get();
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c5954l.amazon.get();
                int i4 = c7221l.f15051l;
                ArrayList arrayList = new ArrayList();
                ((C10717l) c7221l.f15053l).getClass();
                ThreadFactory threadFactory = AbstractC14140l.loadAd;
                ScheduledExecutorService scheduledExecutorServiceYandex = AbstractC14140l.yandex(new ThreadFactoryC8910l(i4, new ThreadFactoryC4430l(threadFactory, "CXCP-IO-", AbstractC1805l.loadAd(0))), 8);
                arrayList.add(scheduledExecutorServiceYandex);
                AbstractC1872l abstractC1872lBilling = AbstractC5103l.billing(scheduledExecutorServiceYandex);
                ScheduledExecutorService scheduledExecutorServiceYandex2 = AbstractC14140l.yandex(new ThreadFactoryC8910l(i4, new ThreadFactoryC4430l(threadFactory, "CXCP-BG-", AbstractC1805l.loadAd(0))), c7221l.f15048l);
                arrayList.add(scheduledExecutorServiceYandex2);
                AbstractC1872l abstractC1872lBilling2 = AbstractC5103l.billing(scheduledExecutorServiceYandex2);
                ScheduledExecutorService scheduledExecutorServiceYandex3 = AbstractC14140l.yandex(new ThreadFactoryC8910l(c7221l.f15052l, new ThreadFactoryC4430l(threadFactory, "CXCP-", AbstractC1805l.loadAd(0))), c7221l.f15049l);
                arrayList.add(scheduledExecutorServiceYandex3);
                AbstractC1872l abstractC1872lBilling3 = AbstractC5103l.billing(scheduledExecutorServiceYandex3);
                c5172l2.crashlytics(3, new RunnableC6665l(11, arrayList));
                C18324l c18324l = new C18324l(c7221l, c5172l2, i3);
                C18324l c18324l2 = new C18324l(c7221l, c5172l2, i2);
                C10700l c10700l = new C10700l();
                C10700l c10700l2 = new C10700l();
                c10700l.f21708l = AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l(interfaceC7042l), abstractC1872lBilling3).mo246l(new C0499l("CXCP")));
                c10700l2.f21708l = AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l(interfaceC7042l), new C0499l("CXCP-Dispatch")));
                c5172l2.crashlytics(2, new RunnableC10311l(c10700l, c10700l2, 13));
                return new C11969l((InterfaceC2262l) c10700l.f21708l, (InterfaceC2262l) c10700l2.f21708l, abstractC1872lBilling, abstractC1872lBilling2, scheduledExecutorServiceYandex3, abstractC1872lBilling3, c18324l, c18324l2);
            case 6:
                InterfaceC9576l interfaceC9576l = c5954l.mopub;
                C11969l c11969l3 = (C11969l) c5954l.billing.get();
                c5954l.yandex();
                return new C14232l(interfaceC9576l, c11969l3, (PackageManager) c5954l.admob.get(), (C10393l) c5954l.subs.get(), c5954l.isPro, (C5172l) c5954l.purchase.get(), (InterfaceC7042l) c5954l.amazon.get());
            case 7:
                CameraManager cameraManager = (CameraManager) c5954l.yandex().getSystemService("camera");
                AbstractC17943l.yandex(cameraManager);
                return cameraManager;
            case 8:
                return c5954l.yandex().getPackageManager();
            case 9:
                return new C10393l();
            case 10:
                Context contextYandex2 = c5954l.yandex();
                C1198l c1198l = new C1198l();
                if (Build.VERSION.SDK_INT >= 35) {
                    c1198l.loadAd = new C2009l(contextYandex2);
                }
                try {
                    ServiceInfo[] serviceInfoArr = contextYandex2.getPackageManager().getPackageInfo(contextYandex2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    C8339l.smaato("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                c2009l = (C2009l) Class.forName(str2).getConstructor(Context.class).newInstance(contextYandex2);
                            } catch (Exception e) {
                                C4875l.remoteconfig("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c1198l.yandex = c2009l;
                return c1198l;
            case 11:
                Context contextYandex3 = c5954l.yandex();
                C11969l c11969l4 = (C11969l) c5954l.billing.get();
                C9785l c9785l = (C9785l) c5954l.smaato.get();
                C18595l c18595l = ((C3026l) c5954l.yandex.f22121l).crashlytics;
                AbstractC17943l.yandex(c18595l);
                return new C10596l(contextYandex3, c11969l4, c9785l, c18595l, (C3945l) c5954l.remoteconfig.get());
            case 12:
                return new C9785l(c5954l.yandex());
            case 13:
                return new C3945l();
            case 14:
                return new C2182l((C15712l) c5954l.subscription.get(), (C9049l) c5954l.tapsense.get(), (C10393l) c5954l.subs.get(), (C11969l) c5954l.billing.get());
            case 15:
                InterfaceC9576l interfaceC9576l2 = c5954l.mopub;
                C10975l c10975l = c5954l.yandex;
                C18595l c18595l2 = new C18595l(interfaceC9576l2, (C11969l) c5954l.billing.get(), 10);
                InterfaceC18322l interfaceC18322l = (InterfaceC18322l) c5954l.vip.get();
                C10393l c10393l = (C10393l) c5954l.subs.get();
                C8409l c8409l = (C8409l) c5954l.startapp.get();
                C3945l c3945l = (C3945l) c5954l.remoteconfig.get();
                C9066l c9066l = ((C3026l) c10975l.f22121l).purchase;
                AbstractC17943l.yandex(c9066l);
                C14169l c14169l = new C14169l(c18595l2, interfaceC18322l, c10393l, c8409l, c3945l, c9066l, (C11969l) c5954l.billing.get());
                C10393l c10393l2 = (C10393l) c5954l.subs.get();
                C12014l c12014l = new C12014l(c5954l.mopub, (C11969l) c5954l.billing.get(), (InterfaceC7042l) c5954l.amazon.get());
                C3945l c3945l2 = (C3945l) c5954l.remoteconfig.get();
                C10985l c10985l = (C10985l) c5954l.adcel.get();
                C14894l c14894l = (C14894l) c5954l.ads.get();
                C9066l c9066l2 = ((C3026l) c10975l.f22121l).purchase;
                AbstractC17943l.yandex(c9066l2);
                return new C15712l(c14169l, c10393l2, c12014l, c3945l2, c10985l, c14894l, c9066l2, (C11969l) c5954l.billing.get());
            case 16:
                return new C8409l((InterfaceC18322l) c5954l.vip.get(), (C7094l) c5954l.metrica.get());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC17943l.yandex(((C3026l) c5954l.yandex.f22121l).billing);
                return new C7094l();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C10985l((DevicePolicyManager) c5954l.yandex().getSystemService("device_policy"));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14894l((C11969l) c5954l.billing.get(), (C5172l) c5954l.purchase.get(), (InterfaceC7042l) c5954l.amazon.get());
            case 20:
                return new C9049l((C11969l) c5954l.billing.get(), (C8409l) c5954l.startapp.get(), (C15712l) c5954l.subscription.get());
            case 21:
                c5954l.yandex();
                return new C16716l();
            case 22:
                return new C12292l();
            case 23:
                return new C7820l();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return ((C13237l) this.f28907l).yandex.getAlgorithmName().concat("-KGMAC");
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f28908l / 8;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("KGMAC requires ParametersWithIV");
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        ((C13237l) this.f28907l).init(true, new remoteconfig((C13886l) c0272l.f1272l, this.f28908l, bArr, null));
    }

    public DialogInterfaceC13913l isPro() {
        C14225l c14225l = (C14225l) this.f28907l;
        DialogInterfaceC13913l dialogInterfaceC13913l = new DialogInterfaceC13913l(c14225l.yandex, this.f28908l);
        View view = c14225l.purchase;
        C14126l c14126l = dialogInterfaceC13913l.f27211l;
        if (view != null) {
            c14126l.pro = view;
        } else {
            CharSequence charSequence = c14225l.amazon;
            if (charSequence != null) {
                c14126l.amazon = charSequence;
                TextView textView = c14126l.Signature;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c14225l.crashlytics;
            if (drawable != null) {
                c14126l.subscription = drawable;
                ImageView imageView = c14126l.tapsense;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c14126l.tapsense.setImageDrawable(drawable);
                }
            }
        }
        String str = c14225l.billing;
        if (str != null) {
            c14126l.purchase = str;
            TextView textView2 = c14126l.license;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c14225l.mopub;
        if (charSequence2 != null) {
            c14126l.crashlytics(-1, charSequence2, c14225l.admob);
        }
        CharSequence charSequence3 = c14225l.subs;
        if (charSequence3 != null) {
            c14126l.crashlytics(-2, charSequence3, c14225l.isPro);
        }
        CharSequence charSequence4 = c14225l.firebase;
        if (charSequence4 != null) {
            c14126l.crashlytics(-3, charSequence4, c14225l.smaato);
        }
        if (c14225l.vip != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c14225l.loadAd.inflate(c14126l.signatures, (ViewGroup) null);
            int i = c14225l.adcel ? c14126l.premium : c14126l.applovin;
            ListAdapter c8365l = c14225l.vip;
            if (c8365l == null) {
                c8365l = new C8365l(c14225l.yandex, i, R.id.text1, null);
            }
            c14126l.ad = c8365l;
            c14126l.advert = c14225l.ads;
            if (c14225l.metrica != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0373l(c14225l, c14126l));
            }
            if (c14225l.adcel) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c14126l.billing = alertController$RecycleListView;
        }
        LinearLayout linearLayout = c14225l.startapp;
        if (linearLayout != null) {
            c14126l.mopub = linearLayout;
            c14126l.admob = false;
        }
        dialogInterfaceC13913l.setCancelable(true);
        dialogInterfaceC13913l.setCanceledOnTouchOutside(true);
        dialogInterfaceC13913l.setOnCancelListener(null);
        dialogInterfaceC13913l.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0001l dialogInterfaceOnKeyListenerC0001l = c14225l.remoteconfig;
        if (dialogInterfaceOnKeyListenerC0001l != null) {
            dialogInterfaceC13913l.setOnKeyListener(dialogInterfaceOnKeyListenerC0001l);
        }
        return dialogInterfaceC13913l;
    }

    public DialogInterfaceC13913l isVip() {
        DialogInterfaceC13913l dialogInterfaceC13913lIsPro = isPro();
        dialogInterfaceC13913lIsPro.show();
        return dialogInterfaceC13913lIsPro;
    }

    public void license(C11442l c11442l, int i, int i2) {
        ((C3512l) this.f28907l).purchase(new C15802l(c11442l), i, i2);
    }

    @Override // defpackage.InterfaceC1775l
    public boolean loadAd(View view) {
        ((BottomSheetBehavior) this.f28907l).appmetrica(this.f28908l);
        return true;
    }

    public C9610l metrica(byte[] bArr) {
        C8378l c8378l = (C8378l) this.f28907l;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, c8378l.yandex);
        int i = c8378l.yandex;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, c8378l.loadAd + i);
        C10038l c10038l = new C10038l(3, false);
        c10038l.f20462l = null;
        c10038l.f20466l = null;
        c10038l.f20465l = null;
        c10038l.f20463l = c8378l;
        int i2 = 24;
        c10038l.f20462l = new C7972l(i2, C0346l.yandex(bArrCopyOf));
        c10038l.f20466l = new C7972l(i2, C0346l.yandex(bArrCopyOfRange));
        return C9610l.crashlytics(c10038l.m2838case());
    }

    public byte[] mopub(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length != this.f28908l) {
            str = "wrong key length";
        } else {
            if (bArr2.length == 32) {
                return subs(bArr, 3, bArr2);
            }
            str = "wrong address length";
        }
        C8339l.metrica(str);
        return null;
    }

    @Override // defpackage.InterfaceC17475l
    public void premium(char c) {
        vip(this.f28908l, 1);
        char[] cArr = (char[]) this.f28907l;
        int i = this.f28908l;
        this.f28908l = i + 1;
        cArr[i] = c;
    }

    public long pro(C11826l c11826l) {
        C13143l c13143l = (C13143l) this.f28907l;
        int i = 0;
        c11826l.billing(c13143l.yandex, 0, 1, false);
        int i2 = c13143l.yandex[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c11826l.billing(c13143l.yandex, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c13143l.yandex[i] & 255) + (i5 << 8);
        }
        this.f28908l = i4 + 1 + this.f28908l;
        return i5;
    }

    @Override // defpackage.InterfaceC13055l
    public MediaCodecInfo purchase(int i) {
        if (((MediaCodecInfo[]) this.f28907l) == null) {
            this.f28907l = new MediaCodecList(this.f28908l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f28907l)[i];
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        ((C13237l) this.f28907l).amazon();
    }

    public void signatures(List list, List list2) {
        Map map = (Map) this.f28907l;
        int i = this.f28908l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object linkedHashSet = map.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                map.put(str, linkedHashSet);
            }
            Set set = (Set) linkedHashSet;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                set.add(new C11378l(str, i, (String) it2.next()));
            }
            set.add(new C11378l(str, i, null));
        }
        Object linkedHashSet2 = map.get(null);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet();
            map.put(null, linkedHashSet2);
        }
        Set set2 = (Set) linkedHashSet2;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            set2.add(new C11378l(null, i, (String) it3.next()));
        }
    }

    @Override // defpackage.InterfaceC14224l
    public byte[] smaato(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        int i2 = this.f28909l;
        byte[] bArr3 = AbstractC13457l.yandex;
        switch (i2) {
            case 4:
                if (bArr2.length >= i) {
                    return metrica(bArr).loadAd(Arrays.copyOfRange(bArr2, i, bArr2.length), bArr3);
                }
                C18262l.ads("ciphertext too short");
                return null;
            default:
                if (bArr2.length < i) {
                    C18262l.ads("ciphertext too short");
                    return null;
                }
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                C18449l c18449l = new C18449l(5, false);
                c18449l.f36009l = null;
                c18449l.f36012l = null;
                c18449l.f36010l = (C18563l) this.f28907l;
                c18449l.f36009l = new C7972l(24, C0346l.yandex(bArr));
                C5925l c5925lAdvert = c18449l.advert();
                return new C6976l(((C0346l) c5925lAdvert.subs.f16631l).loadAd(), c5925lAdvert.isPro).loadAd(bArrCopyOfRange, bArr3);
        }
    }

    @Override // defpackage.InterfaceC13055l
    public boolean startapp(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public byte[] subs(byte[] bArr, int i, byte[] bArr2) {
        long j = i;
        int i2 = this.f28908l;
        byte[] bArrSmaato = AbstractC4047l.smaato(i2, j);
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f28907l;
        interfaceC16922l.update(bArrSmaato, 0, bArrSmaato.length);
        interfaceC16922l.update(bArr, 0, bArr.length);
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (interfaceC16922l instanceof InterfaceC0363l) {
            ((InterfaceC0363l) interfaceC16922l).crashlytics(0, i2, bArr3);
            return bArr3;
        }
        interfaceC16922l.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // defpackage.InterfaceC13055l
    public boolean subscription() {
        return true;
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: synchronized */
    public void mo1722synchronized(String str) {
        byte b;
        vip(this.f28908l, str.length() + 2);
        char[] cArr = (char[]) this.f28907l;
        int i = this.f28908l;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC4216l.loadAd;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    vip(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC4216l.loadAd;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.f28907l)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = AbstractC4216l.yandex[cCharAt];
                        vip(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f28907l, i4);
                        int length3 = str2.length() + i4;
                        this.f28908l = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.f28907l;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.f28908l = i4;
                    }
                }
                vip(i4, 1);
                ((char[]) this.f28907l)[i4] = '\"';
                this.f28908l = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.f28908l = i3 + 1;
    }

    public boolean tapsense() {
        return ((C15480l) this.f28907l) != null;
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: throw */
    public void mo1723throw(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        vip(this.f28908l, length);
        str.getChars(0, str.length(), (char[]) this.f28907l, this.f28908l);
        this.f28908l += length;
    }

    public String toString() {
        switch (this.f28909l) {
            case 10:
                return new String((char[]) this.f28907l, 0, this.f28908l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13967l c13967l = (C13967l) this.f28907l;
                ArrayList arrayList = new ArrayList(c13967l.f27257l);
                for (int i = 0; i < c13967l.f27257l; i++) {
                    arrayList.add(AbstractC15323l.m3967finally(c13967l.loadAd(i)));
                }
                return "UnsupportedBrands{major=" + AbstractC15323l.m3967finally(this.f28908l) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: try */
    public ListenableFuture mo1119try(byte[] bArr) {
        return AbstractC7151l.mopub(((InterfaceC9474l) this.f28907l).mo1119try(bArr), new C12023l(3, this), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) throws IOException {
        ((C13237l) this.f28907l).firebase.write(b);
    }

    public void vip(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f28907l;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f28907l = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // defpackage.InterfaceC17475l
    public void writeLong(long j) {
        mo1723throw(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC9432l
    public C16150l yandex(int i) {
        C16150l c16150l = (C16150l) ((SparseArray) this.f28907l).get(i);
        if (c16150l != null) {
            return c16150l;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        ((C13237l) this.f28907l).yandex(i, i2, bArr);
    }

    public C14785l(int i, Cfor cfor) {
        this.f28909l = 13;
        if (cfor == null) {
            C6541l.subs("digest == null");
            throw null;
        }
        this.f28907l = AbstractC8455l.yandex(cfor);
        this.f28908l = i;
    }

    public /* synthetic */ C14785l(int i, Object obj, int i2) {
        this.f28909l = i2;
        this.f28908l = i;
        this.f28907l = obj;
    }

    public C14785l(int i, SecureRandom secureRandom) {
        this.f28909l = 12;
        if (secureRandom == null) {
            secureRandom = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        this.f28907l = secureRandom;
        this.f28908l = i;
    }

    public /* synthetic */ C14785l(Object obj, int i, int i2) {
        this.f28909l = i2;
        this.f28907l = obj;
        this.f28908l = i;
    }

    public C14785l(C10602l c10602l, int i) {
        this.f28909l = 27;
        AbstractC1051l.subs(c10602l);
        this.f28907l = c10602l;
        this.f28908l = i;
    }

    public C14785l(int[] iArr, int i) {
        C13967l c13967l;
        this.f28909l = 25;
        this.f28908l = i;
        if (iArr != null) {
            C13967l c13967l2 = C13967l.f27256l;
            c13967l = iArr.length == 0 ? C13967l.f27256l : new C13967l(Arrays.copyOf(iArr, iArr.length));
        } else {
            c13967l = C13967l.f27256l;
        }
        this.f28907l = c13967l;
    }

    public /* synthetic */ C14785l(char c, int i) {
        this.f28909l = i;
    }

    public C14785l(C3512l c3512l, int i) {
        this.f28909l = 21;
        this.f28907l = c3512l;
        this.f28909l = 21;
        this.f28908l = i;
    }

    public C14785l(C8378l c8378l) {
        this.f28909l = 4;
        this.f28907l = c8378l;
        this.f28908l = c8378l.yandex + c8378l.loadAd;
    }

    public C14785l(C18563l c18563l) {
        this.f28909l = 5;
        this.f28907l = c18563l;
        this.f28908l = c18563l.yandex;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14785l(Context context) {
        this(context, DialogInterfaceC13913l.admob(context, 0));
        this.f28909l = 0;
    }

    public C14785l(Context context, int i) {
        this.f28909l = 0;
        this.f28907l = new C14225l(new ContextThemeWrapper(context, DialogInterfaceC13913l.admob(context, i)));
        this.f28908l = i;
    }

    public C14785l(boolean z, boolean z2, boolean z3) {
        this.f28909l = 15;
        this.f28908l = (z || z2 || z3) ? 1 : 0;
    }
}
