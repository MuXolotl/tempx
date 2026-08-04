package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18396l implements InterfaceC7267l, InterfaceC12200l, InterfaceC2702l, InterfaceC7149l, InterfaceC14606l, InterfaceC10466l, InterfaceC12833l, InterfaceC13508l, InterfaceC2353l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f35933l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f35934l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35935l;

    public C18396l(int i) {
        this.f35935l = i;
        switch (i) {
            case 11:
                this.f35934l = new C17893l(0, new C3654l[16]);
                break;
            case 13:
                this.f35934l = new HashMap();
                this.f35933l = new HashMap();
                break;
            case 14:
                break;
            case 22:
                this.f35934l = (ImageCaptureFailedForSpecificCombinationQuirk) AbstractC18532l.yandex.loadAd(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f35933l = (PreviewGreenTintQuirk) AbstractC18532l.yandex.loadAd(PreviewGreenTintQuirk.class);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f35934l = new C17951l(128);
                this.f35933l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                this.f35934l = new C14529l(11);
                this.f35933l = new C1579l(16);
                break;
            default:
                this.f35934l = new ArrayList(0);
                this.f35933l = new ArrayList(0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void license(C3654l c3654l) {
        if (c3654l.f7672l > 0) {
            if (c3654l.f7667l.amazon == 5 && !c3654l.adcel() && !c3654l.ads() && !c3654l.f7684l && c3654l.m1389private()) {
                AbstractC14971l abstractC14971l = (AbstractC14971l) c3654l.f7703l.mopub;
                if ((abstractC14971l.f29457l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    while (abstractC14971l != null) {
                        if ((abstractC14971l.f29450l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            ?? LoadAd = abstractC14971l;
                            ?? c17893l = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC3506l) {
                                    InterfaceC3506l interfaceC3506l = (InterfaceC3506l) LoadAd;
                                    interfaceC3506l.mo1346for(AbstractC5573l.smaato(interfaceC3506l, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                                } else if ((LoadAd.f29450l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i = 0;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                    while (abstractC14971l2 != null) {
                                        if ((abstractC14971l2.f29450l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                            i++;
                                            if (i == 1) {
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l2);
                                            }
                                        }
                                        abstractC14971l2 = abstractC14971l2.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                        if ((abstractC14971l.f29457l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                            break;
                        } else {
                            abstractC14971l = abstractC14971l.f29460l;
                        }
                    }
                }
            }
            c3654l.f7681l = false;
            C17893l c17893lSignatures = c3654l.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i2 = c17893lSignatures.f34846l;
            for (int i3 = 0; i3 < i2; i3++) {
                license((C3654l) objArr[i3]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Signature() {
        Object[] objArr;
        C17893l c17893l = (C17893l) this.f35934l;
        Arrays.sort(c17893l.f34848l, 0, c17893l.f34846l, C13617l.f26643l);
        int i = c17893l.f34846l;
        C3654l[] c3654lArr = (C3654l[]) this.f35933l;
        if (c3654lArr == null || c3654lArr.length < i) {
            objArr = c3654lArr;
            objArr = new C3654l[Math.max(16, i)];
        }
        objArr = c3654lArr;
        this.f35933l = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c17893l.f34848l[i2];
        }
        c17893l.isPro();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f35933l = objArr;
                return;
            }
            C3654l c3654l = objArr[i];
            if (c3654l.f7681l) {
                license(c3654l);
            }
            objArr[i] = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory ad(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f35933l) == null) {
            Context context = (Context) this.f35934l;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f35933l = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f35933l = map;
        }
        String str4 = (String) ((Map) this.f35933l).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    @Override // defpackage.InterfaceC13508l
    public Object adcel(C8971l c8971l) {
        return new Long(-2L);
    }

    @Override // defpackage.InterfaceC13508l
    public List admob() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC13508l
    public C4587l ads() {
        CatalogArtist catalogArtist = (CatalogArtist) this.f35934l;
        String strYandex = catalogArtist.yandex();
        if (strYandex == null) {
            strYandex = "";
        }
        return new C4587l(strYandex, catalogArtist.yandex, null, true);
    }

    public File advert() {
        if (((File) this.f35934l) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f35934l) == null) {
                        String str = "PersistedInstallation." + ((C14184l) this.f35933l).amazon() + ".json";
                        C14184l c14184l = (C14184l) this.f35933l;
                        c14184l.yandex();
                        File file = new File(c14184l.yandex.getNoBackupFilesDir(), str);
                        this.f35934l = file;
                        if (file.exists()) {
                            return (File) this.f35934l;
                        }
                        C14184l c14184l2 = (C14184l) this.f35933l;
                        c14184l2.yandex();
                        File file2 = new File(c14184l2.yandex.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f35934l)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f35934l;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x012d A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:34:0x00e9, B:35:0x00ef, B:67:0x0176, B:37:0x00f4, B:40:0x0100, B:41:0x0107, B:44:0x010b, B:45:0x0112, B:46:0x0125, B:49:0x0129, B:51:0x012d, B:53:0x0137, B:54:0x013e, B:55:0x0153, B:56:0x0154, B:58:0x015a, B:61:0x015f, B:62:0x0166, B:63:0x0167, B:64:0x016e, B:65:0x016f), top: B:81:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0137 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:34:0x00e9, B:35:0x00ef, B:67:0x0176, B:37:0x00f4, B:40:0x0100, B:41:0x0107, B:44:0x010b, B:45:0x0112, B:46:0x0125, B:49:0x0129, B:51:0x012d, B:53:0x0137, B:54:0x013e, B:55:0x0153, B:56:0x0154, B:58:0x015a, B:61:0x015f, B:62:0x0166, B:63:0x0167, B:64:0x016e, B:65:0x016f), top: B:81:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:34:0x00e9, B:35:0x00ef, B:67:0x0176, B:37:0x00f4, B:40:0x0100, B:41:0x0107, B:44:0x010b, B:45:0x0112, B:46:0x0125, B:49:0x0129, B:51:0x012d, B:53:0x0137, B:54:0x013e, B:55:0x0153, B:56:0x0154, B:58:0x015a, B:61:0x015f, B:62:0x0166, B:63:0x0167, B:64:0x016e, B:65:0x016f), top: B:81:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0154 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:34:0x00e9, B:35:0x00ef, B:67:0x0176, B:37:0x00f4, B:40:0x0100, B:41:0x0107, B:44:0x010b, B:45:0x0112, B:46:0x0125, B:49:0x0129, B:51:0x012d, B:53:0x0137, B:54:0x013e, B:55:0x0153, B:56:0x0154, B:58:0x015a, B:61:0x015f, B:62:0x0166, B:63:0x0167, B:64:0x016e, B:65:0x016f), top: B:81:0x00e9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x013e, please report this as an issue */
    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        boolean z;
        EnumC4375l enumC4375l;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        switch (this.f35935l) {
            case 15:
                C7025l c7025l = (C7025l) obj;
                AbstractC5088l.yandex("Recorder", "VideoEncoder is created. " + c7025l);
                if (c7025l == null) {
                    return;
                }
                AbstractC5641l.purchase(null, ((C3551l) ((C17651l) this.f35933l).f34335l).pro == ((C12158l) this.f35934l));
                AbstractC5641l.purchase(null, ((C3551l) ((C17651l) this.f35933l).f34335l).subscription == null);
                C3551l c3551l = (C3551l) ((C17651l) this.f35933l).f34335l;
                C12158l c12158l = (C12158l) this.f35934l;
                C7025l c7025l2 = (C7025l) c12158l.billing;
                c7025l2.getClass();
                c3551l.subscription = c7025l2;
                c3551l.mopub.smaato(((InterfaceC13662l) c7025l2.mopub).mo1977throw());
                MediaFormat mediaFormat = c3551l.subscription.amazon;
                if (mediaFormat.containsKey("bitrate")) {
                    mediaFormat.getInteger("bitrate");
                }
                Surface surface = c12158l.loadAd == 4 ? (Surface) c12158l.mopub : null;
                c3551l.adcel = surface;
                c3551l.subscription(surface);
                ListenableFuture listenableFutureAdmob = AbstractC11356l.admob((ListenableFuture) c12158l.firebase);
                listenableFutureAdmob.yandex(new RunnableC9929l((Object) listenableFutureAdmob, (Object) new C13645l(c3551l, c12158l, z6, 10), (int) (z9 ? 1 : 0)), c3551l.amazon);
                C3551l c3551l2 = (C3551l) ((C17651l) this.f35933l).f34335l;
                synchronized (c3551l2.billing) {
                    try {
                        switch (c3551l2.admob.ordinal()) {
                            case 0:
                                c3551l2.tapsense(EnumC4375l.f8911l);
                                z4 = false;
                                z2 = false;
                                break;
                            case 1:
                                z = false;
                                if (c3551l2.premium == 3) {
                                    enumC4375l = c3551l2.admob;
                                    if (enumC4375l != EnumC4375l.f8905l && enumC4375l != EnumC4375l.f8908l) {
                                        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                                    }
                                    throw new AssertionError("Pending recording should exist when in a PENDING state.");
                                }
                                if (C3551l.applovin.contains(c3551l2.admob)) {
                                    throw new AssertionError("Cannot restore non-pending state when in state " + c3551l2.admob);
                                }
                                c3551l2.tapsense(c3551l2.subs);
                                z2 = false;
                                z4 = z;
                                break;
                                break;
                            case 2:
                                z = true;
                                if (c3551l2.premium == 3) {
                                    enumC4375l = c3551l2.admob;
                                    if (enumC4375l != EnumC4375l.f8905l) {
                                        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                                    }
                                    throw new AssertionError("Pending recording should exist when in a PENDING state.");
                                }
                                if (C3551l.applovin.contains(c3551l2.admob)) {
                                    throw new AssertionError("Cannot restore non-pending state when in state " + c3551l2.admob);
                                }
                                c3551l2.tapsense(c3551l2.subs);
                                z2 = false;
                                z4 = z;
                                break;
                                break;
                            case 3:
                            case 7:
                                throw new AssertionError("Incorrectly invoke onConfigured() in state " + c3551l2.admob);
                            case 4:
                                z3 = false;
                                AbstractC5641l.purchase("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                                z2 = true;
                                z4 = z3;
                                break;
                            case 5:
                                z3 = true;
                                AbstractC5641l.purchase("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                                z2 = true;
                                z4 = z3;
                                break;
                            case 6:
                                throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                            case 8:
                                AbstractC5088l.crashlytics("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                                z4 = false;
                                z2 = false;
                                break;
                            default:
                                z4 = false;
                                z2 = false;
                                break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    ArrayList arrayList = c3551l2.remoteconfig;
                    if (!arrayList.isEmpty()) {
                        C13745l c13745l = new C13745l(new ArrayList(arrayList), true, AbstractC12272l.yandex());
                        if (!c13745l.isDone()) {
                            c13745l.cancel(true);
                        }
                        arrayList.clear();
                    }
                    arrayList.add(AbstractC11064l.purchase(new C6536l(29, c3551l2)));
                    C13745l c13745l2 = new C13745l(new ArrayList(arrayList), true, AbstractC12272l.yandex());
                    c13745l2.yandex(new RunnableC9929l((Object) c13745l2, (Object) new C4269l(8, c3551l2), (int) (z8 ? 1 : 0)), AbstractC12272l.yandex());
                    C7025l c7025l3 = c3551l2.subscription;
                    c7025l3.admob.execute(new RunnableC2963l(c7025l3, c7025l3.adcel.crashlytics(), z5 ? 1 : 0));
                    if (z4) {
                        C7025l c7025l4 = c3551l2.subscription;
                        c7025l4.admob.execute(new RunnableC2963l(c7025l4, c7025l4.adcel.crashlytics(), z7 ? 1 : 0));
                        return;
                    }
                    return;
                }
                return;
            case 23:
                C3214l c3214l = (C3214l) obj;
                c3214l.getClass();
                ((C8857l) ((C10038l) this.f35933l).f20463l).loadAd(c3214l);
                return;
            default:
                AbstractC5641l.purchase("Unexpected result from SurfaceRequest. Surface was provided twice.", ((C7478l) obj).yandex != 3);
                AbstractC5088l.yandex("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.f35934l).release();
                C3608l c3608l = ((TextureViewSurfaceTextureListenerC3108l) this.f35933l).yandex;
                if (c3608l.isPro != null) {
                    c3608l.isPro = null;
                    return;
                }
                return;
        }
    }

    public InterfaceC3335l applovin(String str) {
        InterfaceC3335l interfaceC3335l;
        C17464l c17464l = (C17464l) this.f35934l;
        synchronized (((C4269l) c17464l.billing)) {
            Iterator it = ((LinkedHashMap) c17464l.mopub).entrySet().iterator();
            do {
                interfaceC3335l = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC3335l interfaceC3335l2 = (InterfaceC3335l) entry.getValue();
                if (AbstractC8576l.yandex(str2, str)) {
                    interfaceC3335l = interfaceC3335l2;
                }
            } while (interfaceC3335l == null);
        }
        return interfaceC3335l;
    }

    public C13161l appmetrica() {
        MediaController.TransportControls transportControls = ((C10730l) this.f35934l).yandex.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new C18709l(transportControls);
        }
        return i >= 24 ? new C8024l(transportControls) : new C13161l(transportControls);
    }

    @Override // defpackage.InterfaceC13508l
    public InterfaceC13238l billing() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        File file = AbstractC7462l.yandex;
        if (AbstractC7462l.loadAd.containsKey(((CatalogArtist) this.f35934l).loadAd)) {
            m4526private(c10227lAdmob, R.drawable.ic_block_outline_28, R.string.artistmenu_remove_from_blacklist, new C14922l(this, 2));
        } else {
            m4526private(c10227lAdmob, R.drawable.ic_block_outline_28, R.string.artistmenu_to_blacklist, new C14922l(this, 3));
        }
        m4526private(c10227lAdmob, R.drawable.ic_download_cloud_outline_28, R.string.artistmenu_to_mp3, new C14922l(this, 4));
        return AbstractC0509l.purchase(AbstractC14055l.purchase(c10227lAdmob));
    }

    @Override // defpackage.InterfaceC2702l
    public void crashlytics(C6106l c6106l) {
        C7661l c7661l = (C7661l) this.f35933l;
        c7661l.yandex();
        C1807l c1807l = (C1807l) c6106l.f12891l;
        Object[] objArr = c1807l.loadAd;
        long[] jArr = c1807l.crashlytics;
        int i = c1807l.purchase;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objLoadAd = ((C10554l) this.f35934l).loadAd(obj);
            int iAmazon = c7661l.amazon(objLoadAd);
            int i3 = iAmazon >= 0 ? c7661l.crashlytics[iAmazon] : 0;
            if (i3 == 7) {
                c6106l.remove(obj);
            } else {
                c7661l.mopub(i3 + 1, objLoadAd);
            }
            i = i2;
        }
    }

    @Override // defpackage.InterfaceC2702l
    public boolean firebase(Object obj, Object obj2) {
        C10554l c10554l = (C10554l) this.f35934l;
        return AbstractC8576l.yandex(c10554l.loadAd(obj), c10554l.loadAd(obj2));
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C8322l((C3982l) ((InterfaceC15897l) this.f35934l).get(), (C15435l) ((InterfaceC2661l) this.f35933l).get());
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        AbstractC2361l abstractC2361l = (AbstractC2361l) this.f35933l;
        C1473l c1473lSubs = AbstractC15872l.subs(view, c1473l);
        if (c1473lSubs.yandex.subscription()) {
            return c1473lSubs;
        }
        Rect rect = (Rect) this.f35934l;
        rect.left = c1473lSubs.loadAd();
        rect.top = c1473lSubs.amazon();
        rect.right = c1473lSubs.crashlytics();
        rect.bottom = c1473lSubs.yandex();
        int childCount = abstractC2361l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1473l c1473lLoadAd = AbstractC15872l.loadAd(abstractC2361l.getChildAt(i), c1473lSubs);
            rect.left = Math.min(c1473lLoadAd.loadAd(), rect.left);
            rect.top = Math.min(c1473lLoadAd.amazon(), rect.top);
            rect.right = Math.min(c1473lLoadAd.crashlytics(), rect.right);
            rect.bottom = Math.min(c1473lLoadAd.yandex(), rect.bottom);
        }
        return c1473lSubs.billing(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void inmobi(C16745l c16745l) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c16745l.yandex);
            jSONObject.put("Status", AbstractC5020l.inmobi(c16745l.loadAd));
            jSONObject.put("AuthToken", c16745l.crashlytics);
            jSONObject.put("RefreshToken", c16745l.amazon);
            jSONObject.put("TokenCreationEpochInSecs", c16745l.billing);
            jSONObject.put("ExpiresInSecs", c16745l.purchase);
            jSONObject.put("FisError", c16745l.mopub);
            C14184l c14184l = (C14184l) this.f35933l;
            c14184l.yandex();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c14184l.yandex.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(advert())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // defpackage.InterfaceC13508l
    public InterfaceC13238l isPro() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        subs(c10227lAdmob, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (12 & 4) == 0, false, new C14922l(this, 0));
        subs(c10227lAdmob, R.drawable.ic_share_outline_28, R.string.share, (12 & 4) == 0, false, new C14922l(this, 1));
        subs(c10227lAdmob, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (12 & 4) == 0, false, new C10949l(18));
        return AbstractC0509l.purchase(AbstractC14055l.purchase(c10227lAdmob));
    }

    public ArrayList isVip() throws C10756l {
        Map map = (Map) this.f35933l;
        String str = (String) this.f35934l;
        String str2 = (String) map.get(AbstractC3308l.admob(str, "size"));
        int i = 0;
        if (str2 == null) {
            throw new C10756l(i, AbstractC15560l.Signature("Property ", str, ".size not found."), null);
        }
        C8934l c8934lAdcel = AbstractC8576l.adcel(0, Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
        Iterator it = c8934lAdcel.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                return arrayList;
            }
            arrayList.add((String) map.get(AbstractC3308l.admob(str, String.valueOf(c16991l.nextInt()))));
        }
    }

    @Override // defpackage.InterfaceC13508l
    public Integer loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC13508l
    public void metrica(C4456l c4456l) {
        if (((CatalogArtist) this.f35934l).admob) {
            c4456l.m1549synchronized(EnumC16462l.f32181l);
        } else {
            AbstractC9033l.crashlytics((AppActivity) c4456l.f5081l, new C15556l(this, c4456l, null, 0));
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        switch (this.f35935l) {
            case 15:
                AbstractC5088l.Signature("Recorder", "VideoEncoder Setup error: " + th, th);
                C17651l c17651l = (C17651l) this.f35933l;
                int i = c17651l.f34336l;
                if (i < c17651l.f34337l) {
                    c17651l.f34336l = i + 1;
                    RunnableC11297l runnableC11297l = new RunnableC11297l(28, this);
                    c17651l.f34340l = AbstractC12272l.admob().schedule(new RunnableC10311l(((C3551l) c17651l.f34335l).amazon, runnableC11297l, 7), C3551l.f7463private, TimeUnit.MILLISECONDS);
                    return;
                }
                C3551l c3551l = (C3551l) c17651l.f34335l;
                synchronized (c3551l.billing) {
                    try {
                        switch (c3551l.admob.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                                c3551l.Signature(-1);
                                c3551l.tapsense(EnumC4375l.f8907l);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + c3551l.admob + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 23:
                int i2 = ((C3716l) this.f35934l).billing;
                if (i2 == 2 && (th instanceof CancellationException)) {
                    AbstractC5088l.yandex("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                } else {
                    AbstractC5088l.Signature("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(AbstractC7985l.crashlytics(i2)), th);
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m4524native() {
        if (!((C17464l) this.f35934l).crashlytics) {
            C8339l.smaato("Can not perform this action after onSaveInstanceState");
            return;
        }
        C2433l c2433l = (C2433l) this.f35933l;
        if (c2433l == null) {
            c2433l = new C2433l(this);
        }
        this.f35933l = c2433l;
        try {
            C5316l.class.getDeclaredConstructor(null);
            C2433l c2433l2 = (C2433l) this.f35933l;
            if (c2433l2 != null) {
                ((LinkedHashSet) c2433l2.loadAd).add(C5316l.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C5316l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public void m4525package(C13911l c13911l) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f35934l;
        if (c13911l == null) {
            C6541l.subs("primitive constructor must be non-null");
            return;
        }
        C17174l c17174l = new C17174l(c13911l.yandex, c13911l.loadAd);
        if (!map.containsKey(c17174l)) {
            map.put(c17174l, c13911l);
            return;
        }
        C13911l c13911l2 = (C13911l) map.get(c17174l);
        if (!c13911l2.equals(c13911l) || c13911l != c13911l2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(c17174l)));
        }
    }

    @Override // defpackage.InterfaceC12200l
    public C8160l premium(C3624l c3624l) {
        C15053l c15053l = (C15053l) this.f35934l;
        C17367l c17367l = (C17367l) this.f35933l;
        C0511l c0511l = c17367l.yandex;
        if (c0511l == null) {
            c0511l = null;
        }
        ((C17334l) c0511l.crashlytics).getClass();
        C5222l c5222lYandex = AbstractC4115l.yandex(c15053l, c3624l, C4995l.mopub);
        if (c5222lYandex == null) {
            return null;
        }
        AbstractC1845l.yandex(c5222lYandex.yandex).equals(c3624l);
        return c17367l.billing(c5222lYandex);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m4526private(C10227l c10227l, int i, int i2, Function1 function1) {
        c10227l.add(new C15413l(i, i2, false, function1));
    }

    public void pro(String str, String str2, Function1 function1) {
        LinkedHashMap linkedHashMap = ((C5183l) this.f35933l).yandex;
        C5695l c5695l = new C5695l(this, str, str2);
        function1.invoke(c5695l);
        String str3 = (String) this.f35934l;
        ArrayList arrayList = c5695l.loadAd;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C8195l) it.next()).f17098l);
        }
        String strSmaato = (String) c5695l.crashlytics.f17098l;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC16901l.m4210case(arrayList2, "", null, null, C12844l.f25267l, 30));
        sb.append(')');
        if (strSmaato.length() > 1) {
            strSmaato = AbstractC14814l.smaato(';', "L", strSmaato);
        }
        sb.append(strSmaato);
        String strAdmob = AbstractC11043l.admob('.', str3, sb.toString());
        C16750l c16750l = (C16750l) c5695l.crashlytics.f17097l;
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C16750l) ((C8195l) it2.next()).f17097l);
        }
        linkedHashMap.put(strAdmob, new C14708l(c16750l, arrayList3, c5695l.yandex));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r9, r1, r0) == r6) goto L21;
     */
    @Override // defpackage.InterfaceC13508l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object purchase(boolean r8, defpackage.AbstractC0283l r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C3502l
            if (r0 == 0) goto L13
            r0 = r9
            lٌؕٛ r0 = (defpackage.C3502l) r0
            int r1 = r0.f7390l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7390l = r1
            goto L18
        L13:
            lٌؕٛ r0 = new lٌؕٛ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f7391l
            int r1 = r0.f7390l
            r2 = 28
            r3 = 0
            r4 = 2
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L66
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r3
        L33:
            boolean r8 = r0.f7392l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L52
        L39:
            defpackage.AbstractC2829l.crashlytics(r9)
            lٖٞٔ r9 = new lٖٞٔ
            java.lang.Object r1 = r7.f35934l
            ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist r1 = (ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist) r1
            java.lang.String r1 = r1.loadAd
            r9.<init>(r1, r2)
            r0.f7392l = r8
            r0.f7390l = r5
            java.lang.Object r9 = r9.ads(r0)
            if (r9 != r6) goto L52
            goto L65
        L52:
            lٖۖ r9 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r9 = defpackage.AbstractC17278l.yandex
            lًٓۘ r1 = new lًٓۘ
            r1.<init>(r7, r3, r2)
            r0.f7392l = r8
            r0.f7390l = r4
            java.lang.Object r7 = defpackage.AbstractC10999l.firebase(r9, r1, r0)
            if (r7 != r6) goto L66
        L65:
            return r6
        L66:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18396l.purchase(boolean, lّؑۧ):java.lang.Object");
    }

    public C16830l signatures() {
        C10730l c10730l = (C10730l) this.f35934l;
        InterfaceC10867l interfaceC10867lYandex = c10730l.purchase.yandex();
        if (interfaceC10867lYandex != null) {
            try {
                return interfaceC10867lYandex.purchase();
            } catch (RemoteException | SecurityException e) {
                AbstractC6427l.subs("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = c10730l.yandex.getPlaybackState();
        if (playbackState != null) {
            return C16830l.yandex(playbackState);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13508l
    public InterfaceC6684l smaato() {
        return new C10866l((CatalogArtist) this.f35934l);
    }

    @Override // defpackage.InterfaceC13508l
    public Object startapp(C10010l c10010l) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m4527strictfp(C0579l c0579l) {
        C10730l c10730l = (C10730l) this.f35934l;
        if ((c10730l.yandex.getFlags() & 4) == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", AbstractC16431l.crashlytics(c0579l, MediaDescriptionCompat.CREATOR));
        c10730l.yandex.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    @Override // defpackage.InterfaceC13508l
    public void subs(C10227l c10227l, int i, int i2, boolean z, boolean z2, Function1 function1) {
        c10227l.add(new C14843l(i, i2, z, z2, function1));
    }

    public void subscription(C0579l c0579l, int i) {
        C10730l c10730l = (C10730l) this.f35934l;
        if ((c10730l.yandex.getFlags() & 4) == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", AbstractC16431l.crashlytics(c0579l, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        c10730l.yandex.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m4528synchronized(String str, InterfaceC3335l interfaceC3335l) {
        C17464l c17464l = (C17464l) this.f35934l;
        synchronized (((C4269l) c17464l.billing)) {
            if (((LinkedHashMap) c17464l.mopub).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) c17464l.mopub).put(str, interfaceC3335l);
            Unit unit = Unit.INSTANCE;
        }
    }

    public Bundle tapsense(String str) {
        C17464l c17464l = (C17464l) this.f35934l;
        if (!c17464l.loadAd) {
            C8339l.smaato("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) c17464l.admob;
        if (bundle == null) {
            return null;
        }
        Bundle bundleAmazon = bundle.containsKey(str) ? AbstractC13611l.amazon(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c17464l.admob = null;
        }
        return bundleAmazon;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public C16745l m4529throws() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(advert());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C16745l.admob;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = AbstractC5020l.m1673throws(5)[iOptInt];
        if (i3 == 0) {
            C6541l.subs("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new C16745l(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }

    @Override // defpackage.InterfaceC7267l
    public C2106l toInstant() {
        throw new C14612l(((String) this.f35934l) + " when parsing an Instant from \"" + AbstractC9549l.admob((CharSequence) this.f35933l, 64) + '\"');
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f35935l) {
            case 4:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                InterfaceC3177l interfaceC3177l = (InterfaceC3177l) this.f35934l;
                if (interfaceC3177l == null) {
                    sb.append("null");
                } else {
                    String simpleName = interfaceC3177l.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC3177l.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(interfaceC3177l)));
                }
                sb.append("}}");
                return sb.toString();
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return ((InterfaceC8396l) this.f35934l) + " - " + ((C14513l) this.f35933l);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC13508l
    public boolean vip() {
        return false;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m4530volatile(Context context) {
        AbstractC13950l.m3802case((AudioManager) context.getSystemService("audio"), (C1750l) this.f35933l);
    }

    @Override // defpackage.InterfaceC13508l
    public boolean yandex() {
        return ((CatalogArtist) this.f35934l).admob;
    }

    @Override // defpackage.InterfaceC13508l
    public void remoteconfig(Activity activity) {
    }

    public /* synthetic */ C18396l(Object obj, Object obj2, boolean z, int i) {
        this.f35935l = i;
        this.f35933l = obj;
        this.f35934l = obj2;
    }

    public C18396l(Function1 function1) {
        this.f35935l = 21;
        this.f35934l = function1;
        this.f35933l = new C1750l(2, new C3873l(1, this), new Handler(Looper.getMainLooper()), C13736l.subs, true, false);
    }

    public C18396l(C17464l c17464l) {
        this.f35935l = 18;
        this.f35934l = c17464l;
    }

    public C18396l(ExecutorService executorService) {
        this.f35935l = 16;
        this.f35933l = new C11154l(0);
        this.f35934l = executorService;
    }

    public C18396l(InterfaceC3177l interfaceC3177l, C15018l c15018l) {
        this.f35935l = 4;
        this.f35934l = interfaceC3177l;
        C7502l c7502l = new C7502l(c15018l, C8011l.crashlytics, C12214l.loadAd);
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C8011l.class);
        String strBilling = interfaceC1388lLoadAd.billing();
        if (strBilling != null) {
            this.f35933l = (C8011l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling));
        } else {
            C8339l.metrica("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public C18396l(C3300l c3300l) {
        this.f35935l = 13;
        this.f35934l = new HashMap(c3300l.yandex);
        this.f35933l = new HashMap(c3300l.loadAd);
    }

    public /* synthetic */ C18396l(Object obj, Object obj2, int i) {
        this.f35935l = i;
        this.f35934l = obj;
        this.f35933l = obj2;
    }

    public C18396l(C14184l c14184l) {
        this.f35935l = 12;
        this.f35933l = c14184l;
    }

    public C18396l(Context context) {
        this.f35935l = 7;
        this.f35933l = null;
        this.f35934l = context;
    }

    public C18396l(Map map) {
        this.f35935l = 10;
        this.f35934l = map;
        this.f35933l = new C16412l("Java nullability annotation states").crashlytics(new C17330l(0, this));
    }

    public C18396l(C10554l c10554l) {
        this.f35935l = 3;
        this.f35934l = c10554l;
        C7661l c7661l = AbstractC4785l.yandex;
        this.f35933l = new C7661l();
    }

    public C18396l(Context context, C5057l c5057l) {
        this.f35935l = 6;
        this.f35933l = DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f35934l = new C1425l(context, c5057l);
        } else {
            this.f35934l = new C10730l(context, c5057l);
        }
    }

    public C18396l(C13708l c13708l, int[] iArr) {
        this.f35935l = 9;
        this.f35934l = AbstractC1186l.Signature(c13708l);
        this.f35933l = iArr;
    }

    public C18396l(AbstractC2361l abstractC2361l) {
        this.f35935l = 27;
        this.f35933l = abstractC2361l;
        this.f35934l = new Rect();
    }
}
